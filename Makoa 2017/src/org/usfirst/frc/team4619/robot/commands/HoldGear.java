package org.usfirst.frc.team4619.robot.commands;

public class HoldGear extends CommandBase {
	
	public HoldGear()
	{
		requires(gearMech);
	}
	
	protected void initialize()
	{
	}
	
	protected void execute()
	{
		gearMech.closeArm();
	}
	
	protected boolean isFinished()
	{
		return false;
	}
	
	protected void end()
	{
		gearMech.stop();
	}
	
	protected void interrupted()
	{
		gearMech.stop();
	}
}
