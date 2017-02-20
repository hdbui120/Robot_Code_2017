package org.usfirst.frc.team4619.robot.commands;

import com.ctre.CANTalon.TalonControlMode;

public class RobotClimb extends CommandBase
{
	double climbingSpeed;
	
	public RobotClimb(double climbingSpeed)
	{
		requires(climberMech);
		this.climbingSpeed = climbingSpeed;
	}
	
	protected void initialize() 
	{
		climberMech.getMotor().changeControlMode(TalonControlMode.Voltage);
		climberMech.getMotor().set(0);
		climberMech.Climb(climbingSpeed);
		System.out.println("Robot is climbing at: " + climberMech.getMotor().getOutputVoltage() + "volts");
	}
	
	protected void execute() 
	{

	}

	protected boolean isFinished() 
	{
		return false;
	}

	protected void end() 
	{
		climberMech.doNothing();
	}

	protected void interrupted() 
	{
		climberMech.doNothing();
	}

}
