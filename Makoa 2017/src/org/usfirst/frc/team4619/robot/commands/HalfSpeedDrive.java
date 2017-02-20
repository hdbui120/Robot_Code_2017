package org.usfirst.frc.team4619.robot.commands;

public class HalfSpeedDrive extends CommandBase {
	public HalfSpeedDrive()
	{
		requires(driveMech);
	}
	
	protected void execute()
	{
		driveMech.arcadeDrive(oi.getXAxis()/2, oi.getYAxis()/2);
	}
	
	protected boolean isFinished()
	{
		System.out.println("Half Speed Drive activated!");
		return false;
	}
	
	protected void end()
	{
		
	}
	
	protected void interrupted()
	{
		
	}
}
