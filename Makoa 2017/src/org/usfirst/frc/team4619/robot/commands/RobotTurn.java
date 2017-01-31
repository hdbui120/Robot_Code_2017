package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.PIDCommand;

public class RobotTurn extends PIDCommand{

	double setPoint;
	static double kp = 10;
	static double ki = 10;
	static double kd = 10;
	public static ADXRS450_Gyro gyro = new ADXRS450_Gyro();
	
	public RobotTurn(double setPoint) {
		super("Turn", kp, ki, kd);
		this.setPoint = setPoint;
		this.getPIDController().setSetpoint(this.setPoint);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return gyro.getAngle();
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		CommandBase.driveMech.driveTrain.arcadeDrive(0, output);
	}

	protected boolean isOnPath()
	{
		double tolerance;
		tolerance = setPoint - gyro.getAngle();
		if(tolerance < .2)
			return true;
		return false;
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isOnPath();
	}

}
