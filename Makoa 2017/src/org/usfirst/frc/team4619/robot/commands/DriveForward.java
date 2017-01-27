package org.usfirst.frc.team4619.robot.commands;

public class DriveForward extends CommandBase {
	
	private long startTime;
	private double feetToMove;
	
	public DriveForward()
	{
		this(-1);
	}
	
	public DriveForward(double distanceToMove)
	{
		requires(driveMech);
		this.feetToMove = distanceToMove; 
	}
	
	protected void initialize()
	{
		startTime = System.currentTimeMillis();
	}
	
	protected void execute()
	{
		driveMech.moveForward();
	}
	
	protected boolean isFinished()
	{
		// TODO: Replace with encoder ticks
		if (System.currentTimeMillis() - startTime > this.feetToMove * 1000)
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
		driveMech.stop();
	}
	
	protected void interrupted()
	{
		driveMech.stop();
	}
}
