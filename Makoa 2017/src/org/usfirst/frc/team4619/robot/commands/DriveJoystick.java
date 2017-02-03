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
		driveMech.arcadeDrive(oi.getYAxis(), oi.getXAxis());
		System.out.println("Left encoder ticks" + driveMech.getLeftEncoder()+ "\n" + "Right encoder ticks" + driveMech.getRightEncoder());
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
