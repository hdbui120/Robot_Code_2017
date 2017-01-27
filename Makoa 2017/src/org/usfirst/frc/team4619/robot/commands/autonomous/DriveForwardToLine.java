package org.usfirst.frc.team4619.robot.commands.autonomous;

import org.usfirst.frc.team4619.robot.commands.*;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveForwardToLine extends CommandGroup {
	
	public DriveForwardToLine()
	{
		addSequential(new DriveForward(5));
		addSequential(new DoNothing());
	}
}
