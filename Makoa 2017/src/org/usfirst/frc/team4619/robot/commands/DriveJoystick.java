package org.usfirst.frc.team4619.robot.commands;

public class DriveJoystick extends CommandBase {
	
	public DriveJoystick()
	{
		requires(driveMech);
	}
	
	public void initialize()
	{
		
	}
	
	public void execute()
	{
		System.out.println(oi.getYAxis());
		driveMech.arcadeDriv(oi.getYAxis(), oi.getXAxis());
	}
	
	public boolean isFinished()
	{
		return false;
	}
	
	public void end()
	{
		
	}
	
	public void interrupted()
	{
		
	}
	
}
