package org.usfirst.frc.team4619.robot.commands;

public class DriveJoystick extends CommandBase {
	
	double kP;
	
	public DriveJoystick()
	{
		requires(driveMech);
	}
	
	public void initialize()
	{
		double kP = .3;
	}
	
	public void execute()
	{
		if(oi.getXAxis() == 0 && oi.getYAxis()>0)
		{
			double angle = driveMech.gyro.getAngle();
			driveMech.arcadeDrive(oi.getYAxis(), -angle*kP);
		}
		else
		{
			driveMech.arcadeDrive(oi.getYAxis(), oi.getXAxis());
		}
		
	}
	
	public boolean isFinished()
	{
		System.out.println("Normal drive activated!");
		return false;
	}
	
	public void end()
	{
		
	}
	
	public void interrupted()
	{
		
	}
	
}
