package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.RobotDrive;

public class DriveDistanceTest extends CommandBase implements PIDOutput{
	
	private static final double kHoldDistance = 5;
	private static final double kMaxDistance = 24.0;
	private static final double kValueToInches = 0.125;
	private static final double kP = 7.0;
	private static final double kI = 0.018;
	private static final double kD = 1.5;
	private static final int kUltrasonicPort = 0;

	private AnalogInput ultrasonic = new AnalogInput(kUltrasonicPort);
	private PIDController pidController = new PIDController(kP, kI, kD, ultrasonic, this);
	
	public DriveDistanceTest()
	{
		requires(driveMech);
	}
	
	protected void initialize()
	{
		pidController.setInputRange(0, kMaxDistance * kValueToInches);
		pidController.setSetpoint(kHoldDistance * kValueToInches);
	}
		
	protected void execute()
	{
		pidController.enable(); // begin PID control
	}

	protected boolean isFinished()
	{
		return false;
	}
	
	protected void end()
	{
		pidController.disable();
	}
	
	protected void interrupted()
	{
		pidController.disable();
	}
	
	@Override
	public void pidWrite(double output) {
		// TODO Auto-generated method stub
		driveMech.driveTrain.drive(output, 0);
	}

}