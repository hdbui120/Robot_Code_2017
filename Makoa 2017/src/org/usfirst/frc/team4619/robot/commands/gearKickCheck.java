package org.usfirst.frc.team4619.robot.commands;

import org.usfirst.frc.team4619.robot.subsystems.Gear;

public class gearKickCheck extends CommandBase{
	
	public gearKickCheck()
	{
		requires(gearMech);
	}
	
	public void execute()
	{
		if(gearMech.getMotor().get() == 0)
		{
			gearMech.moveArm(-.3);
		}
		else if(gearMech.getMotor().get() != 0)
		{
			gearMech.moveArm(.3);
		}
		else
		{
			gearMech.notSpin();
		}
	}
	
	public void end()
	{
		gearMech.notSpin();
	}
	public void interrupted()
	{
		gearMech.notSpin();
	}
}
