package org.usfirst.frc.team4619.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class NoMoving extends CommandGroup {
	
	public NoMoving()
	{
		addSequential(new org.usfirst.frc.team4619.robot.commands.DoNothing());
	}
}
