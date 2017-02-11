package org.usfirst.frc.team4619.robot.commands;

public class ZeroDegree extends CommandBase{

	double kP;
	
	public ZeroDegree()
	{
		requires(driveMech);
	}
	
	protected void initialize()
	{
		kP = .03;
	}
	
	protected void execute()
	{
		double angle = driveMech.gyro.getAngle();
		driveMech.driveTrain.drive(0, -angle*kP);		
	}
	
	private boolean isTurning()
	{
		if(oi.getXAxis() > .2)
		return true;
		else
			return false;
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTurning();
	}

}
