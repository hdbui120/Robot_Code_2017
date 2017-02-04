package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TeleopDriveGyro extends CommandGroup{
	public TeleopDriveGyro()
	{
		addParallel(new DriveJoystick());
		addParallel(new RobotTurn(0));
	}
}
