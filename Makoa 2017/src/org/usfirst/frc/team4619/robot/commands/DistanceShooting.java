package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.Ultrasonic;

public class DistanceShooting extends CommandBase
{
	private Ultrasonic ultra = new Ultrasonic(0, 1);
	private double holdDistance;
	private double rangeInches;
	
	public DistanceShooting(double holdDistance)
	{
		requires(shooterMech);
		this.holdDistance = holdDistance; 		
	}
	
	protected void initialize() 
	{
		ultra.setAutomaticMode(true);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() 
	{
		shoot();
	}
	
	private void shoot()
	{
		rangeInches = ultra.getRangeInches();
		if(holdDistance - rangeInches == 0) //replace magic number
		{
			shooterMech.Shoot(1);
		}
		else if(holdDistance - rangeInches < 0)
		{
			shooterMech.Shoot(.85);
		}
		else
		{
			shooterMech.doNothing();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() 
	{
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() 
	{
		shooterMech.doNothing();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() 
	{
		shooterMech.doNothing();
	}	
}
