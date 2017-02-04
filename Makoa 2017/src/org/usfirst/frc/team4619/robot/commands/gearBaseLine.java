package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class gearBaseLine extends CommandGroup {

	/**
	 * This command will make the robot drive forward to the airship, drive half that distance backward, 
	 * turn 90*, drive forward ____, then turn -90 degrees and forward to the baseline.
	 */
	public gearBaseLine()
	{
		addSequential(new DriveDistance(3696));
		addSequential(new DriveDistance(-((3696)/2)));
		addSequential(new RobotTurn(90));
		addSequential(new DriveDistance(4816));
		addSequential(new RobotTurn(-90));
		addSequential(new DriveDistance(3696/2));
	}

}


