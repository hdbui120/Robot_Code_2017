package org.usfirst.frc.team4619.robot.commands;

public class DropGear extends CommandBase {
	
	private long startTime;
	
	public DropGear()
	{
		requires(gearMech);
	}
	
	protected void initialize()
	{
		startTime = System.currentTimeMillis();
	}
	
	protected void execute()
	{
		gearMech.openArm();
	}
	
	protected boolean isFinished()
	{
		if (System.currentTimeMillis() - startTime > 2000)
		{
			return true;
		}
		else
		{
			return false;
		}
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
