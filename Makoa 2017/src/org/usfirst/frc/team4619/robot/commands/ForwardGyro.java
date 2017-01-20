package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.SPI;

/**This command class is created to
 * make the robot drive forward
 * continuously at 0 degree
 *using PID controller and gyro sensor as input
 */
public class ForwardGyro extends CommandBase implements PIDOutput{
	
		//created variables for pid controller
		double kP;
		double kI;
		double kD;
		double minInputGyro;
		double maxInputGyro;
		double zeroDegree;
		double minOutput;
		double maxOutput;
		
		//created gyro encoder
		ADXRS450_Gyro gyro;
		
		//created pid controller
		PIDController pidController;
	
		public ForwardGyro()
		{
			requires(driveMech);
		}
		
		@Override
		protected void initialize() {
			//assign values for pid controller's variables
			kP = 3;
			kI = 1;
			kD = 2.5;
			zeroDegree = 0;
			minInputGyro = -90.0;
			maxInputGyro = 90.0;
			minOutput = -1.0;
			maxOutput = 1.0;
			
			//initialize gyro
			gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);
			
			/**
			 * initialize pid controller(gyro as input source and pid controller
			 * will automatically calculate the output)
			 * set input range for the pid controller
			 * set the set point for pid controller
			 * set output range for pid controller
			 */
			pidController = new PIDController(kP, kI, kD, gyro, this);
			pidController.setInputRange(minInputGyro, maxInputGyro);
			pidController.setSetpoint(zeroDegree);
			pidController.setOutputRange(minOutput, maxOutput);
		}

		
		@Override
		protected void execute() {
			pidController.enable();
		}

		
		@Override
		protected boolean isFinished() {
			return false;
		}

		
		@Override
		protected void end() {
			pidController.disable();
		}

		@Override
		protected void interrupted() {
			pidController.disable();
		}


		@Override
		public void pidWrite(double output) {
			/**
			 * the first variable in the parameter is the output to drive forward and backward
			 * the second variable in the parameter is the output to make the robot turn
			 * 			-values = left 
			 * 			+values = right
			 */
			driveMech.driveTrain.drive(.6, output);
		}
	
}
