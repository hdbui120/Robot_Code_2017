package org.usfirst.frc.team4619.robot.commands;

public class DriveDistance extends CommandBase{

	double setPoint;
	
	public DriveDistance(double setPoint)
	{
		requires(driveMech);
		this.setPoint = setPoint;
	}
	
	@Override
	protected void initialize() {
		driveMech.setSetpoint(setPoint);
		driveMech.enable();
	}

	@Override
	protected void execute() 
	{
	
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isInRange();
	}
	
	@Override
	protected void end() {
		driveMech.disable();
	}

	@Override
	protected void interrupted() {
		driveMech.disable();
	}
	
	public boolean isInRange()
	{
		double tolerance;
		tolerance = Math.abs(setPoint - driveMech.getRightEncoder().get());
		if(tolerance < .2)
			return true;
		return false;
		
	}
	
}
