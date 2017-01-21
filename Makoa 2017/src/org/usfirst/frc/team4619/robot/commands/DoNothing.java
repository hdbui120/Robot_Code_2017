package org.usfirst.frc.team4619.robot.commands;

public class DoNothing extends CommandBase {
	
	public DoNothing()
	{
		requires(gearMech);
	}
	
	protected void initialize()
	{
		
	}
	
	protected void execute()
	{
		gearMech.notSpin();
	}
	
	protected boolean isFinished()
	{
		return false;
	}
	
	protected void end()
	{
		
	}
	
	protected void interrupted()
	{
		
	}
}
