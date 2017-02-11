package org.usfirst.frc.team4619.robot.commands;

public class Turn extends CommandBase{
	
	double setPoint;
	
	public Turn(double setPoint)
	{
		this.setPoint = setPoint;
		requires(driveMech);
	}
	
	protected void initialize()
	{
		driveMech.gyro.reset();
	}
	
	private void turn()
	{
		if(driveMech.gyro.getAngle() > 0)
			driveMech.driveTrain.drive(0, .7);
		else if(driveMech.gyro.getAngle() <0)
			driveMech.driveTrain.drive(0, -.7);
		else
			driveMech.doNothing();
	}
	
	protected boolean isDone()
	{
		if(driveMech.gyro.getAngle() == setPoint)
			return true;
		else
			return false;
	}
	
	protected void execute()
	{
		turn();
	}
	
	protected boolean isFinished()
	{
		return isDone();
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
