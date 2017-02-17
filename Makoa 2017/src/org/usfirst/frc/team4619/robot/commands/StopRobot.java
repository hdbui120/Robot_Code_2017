package org.usfirst.frc.team4619.robot.commands;

public class StopRobot extends CommandBase{
	
	public StopRobot()
	{
		requires(driveMech);
		
	}
	
	protected void initialize() 
	{
		driveMech.doNothing();
	}
	
	protected void execute() 
	{

	}

	protected boolean isFinished() 
	{
		return false;
	}

	protected void end() 
	{
		driveMech.doNothing();
	}

	protected void interrupted() 
	{
		driveMech.doNothing();
	}

	
	

}
