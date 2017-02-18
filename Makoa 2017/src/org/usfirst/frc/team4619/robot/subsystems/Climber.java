package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;
import org.usfirst.frc.team4619.robot.commands.StopClimb;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem
{
	CANTalon motor;
	double climbSpeed;
	double zeroSpeed = 0;
	

	protected void initDefaultCommand() 
	{
		// TODO Auto-generated method stub
		setDefaultCommand(new StopClimb());
	}	
	
	public Climber()
	{
		motor = new CANTalon(RobotMap.CAN_PORT_1);
		motor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		motor.configNominalOutputVoltage(0, 0);
		motor.configPeakOutputVoltage(12, 12);
		motor.setProfile(0);
		motor.setP(0);
		motor.setI(0);
		motor.setD(0);
	}
	
	public CANTalon getMotor()
	{
		return motor;
	}
	
	public void Climb(double climbSpeed)
	{
		this.climbSpeed = climbSpeed;
		if(climbSpeed<10)
		motor.set(climbSpeed);
	}
	
	public void StopClimb()
	{
		motor.set(zeroSpeed);
	}
	
	public void doNothing() 
	{
		motor.set(zeroSpeed);
	}
}
