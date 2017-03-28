package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;
import org.usfirst.frc.team4619.robot.commands.StopClimb;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem
{
	DigitalInput limitSwitch;
	VictorSP motor;
	VictorSP motor2;
	double climbSpeed;
	double zeroSpeed = 0;
	

	protected void initDefaultCommand() 
	{
		// TODO Auto-generated method stub
		setDefaultCommand(new StopClimb());
	}	
	
	public Climber()
	{
		motor = new VictorSP(RobotMap.PWM_PORT_4);
		motor2 = new VictorSP(RobotMap.PWM_PORT_6);
		//limitSwitch = new DigitalInput(4);
	}
	
	/*public DigitalInput getLimitSwitch()
	{
		return limitSwitch;
	}*/
	
	public VictorSP getMotor()
	{
		return motor;
	}
	
	public VictorSP getMotor2()
	{
		return motor2;
	}
	
	public void Climb(double climbSpeed)
	{
		this.climbSpeed = climbSpeed;
			motor.set(-climbSpeed);
			motor2.set(climbSpeed);
	}
	
	public void StopClimb()
	{
		motor.set(zeroSpeed);
		motor2.set(zeroSpeed);
	}
	
	public void doNothing() 
	{
		motor.set(zeroSpeed);
		motor2.set(zeroSpeed);
	}
}
