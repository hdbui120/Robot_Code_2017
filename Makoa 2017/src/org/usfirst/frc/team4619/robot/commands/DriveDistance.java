package org.usfirst.frc.team4619.robot.commands;

public class DriveDistance extends CommandBase{

	double setPoint;
	
	public DriveDistance(double setPoint)
	{
		requires(driveMech);
	}
	
	@Override
	protected void initialize() {
		driveMech.getLeftEncoder().reset();
		driveMech.getRightEncoder().reset();
	}

	protected void execute()
	{
		if(driveMech.getLeftEncoder().get() == driveMech.getRightEncoder().get())
		{
			driveMech.moveForward();
		}
		else if(driveMech.getLeftEncoder().get() > driveMech.getRightEncoder().get())
		{
			driveMech.driveTrain.drive(0, -.3);
		}
		else
		{
			driveMech.driveTrain.drive(0, .3);
		}
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isOnPoint();
	}
	
	@Override
	protected void end() {
		driveMech.doNothing();
	}

	@Override
	protected void interrupted() {
		driveMech.doNothing();
	}
	
	protected boolean isOnPoint()
	{
		if(driveMech.getLeftEncoder().get() == setPoint && driveMech.getRightEncoder().get() == setPoint)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
