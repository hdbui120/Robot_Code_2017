package org.usfirst.frc.team4619.robot.commands;

public class DriveJoystick extends CommandBase {

	public DriveJoystick()
	{
		requires(driveMech);
	}
	
	public void execute()
	{
		driveMech.driveTrain.arcadeDrive(oi.getYAxis(), oi.getXAxis(), true);
	}
	
	public boolean isFinished()
	{
		return false;
	}
	
	public void end()
	{
		driveMech.doNothing();
	}
	
	public void interrupted()
	{
		driveMech.doNothing();
	}

}
