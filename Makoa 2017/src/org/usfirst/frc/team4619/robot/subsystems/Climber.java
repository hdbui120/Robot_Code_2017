package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;
import org.usfirst.frc.team4619.robot.commands.StopClimb;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem
{
	SpeedController motor;
	double climbSpeed;
	double zeroSpeed = 0;

	protected void initDefaultCommand() 
	{
		// TODO Auto-generated method stub
		setDefaultCommand(new StopClimb());
	}	
	
	public Climber()
	{
		motor = new VictorSP(RobotMap.PWM_PORT_0);
	}
	
	public void Climb(double climbSpeed)
	{
		this.climbSpeed = climbSpeed;
		motor.set(climbSpeed);
	}
	
	public void Climb()
	{
		motor.set(.5);
	}
	
	public void StopClimb()
	{
		motor.set(zeroSpeed);
	}
	
	public void doNothing() {
		motor.set(zeroSpeed);
	}

}
