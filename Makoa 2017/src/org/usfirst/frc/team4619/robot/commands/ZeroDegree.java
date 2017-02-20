package org.usfirst.frc.team4619.robot.commands;

public class ZeroDegree extends CommandBase{

	double kP;
	double time;
	
	public ZeroDegree(double time)
	{
		requires(driveMech);
		this.time = time;
	}
	
	protected void initialize()
	{
		kP = .03;
		setTimeout(time);
	}
	
	protected void execute()
	{
		double angle = driveMech.gyro.getAngle();
		driveMech.driveTrain.drive(.6, -angle*kP);		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

}
