package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.Timer;

public class TimerDrive extends CommandBase{
	
	double time;
	
	public TimerDrive(double time)
	{
		requires(driveMech);
		this.time = time;
	}
	
	protected void initialize() 
	{
		setTimeout(time);
	}

	@Override
	protected void execute() 
	{
		driveMech.driveTrain.drive(.6, 0);
	}
	
	@Override
	protected boolean isFinished() 
	{
		// TODO Auto-generated method stub
		return isTimedOut();
	}
	
	@Override
	protected void end() 
	{
		driveMech.doNothing();
	}

	@Override
	protected void interrupted() {
		driveMech.doNothing();
	}

}
