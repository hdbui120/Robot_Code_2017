package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team4619.robot.Robot;

// chooser.addObject("Base Line", new DriveDistance(7561));//need to modify command

public class gearBaseLine extends CommandGroup {

	/**
	 * This command will make the robot drive forward to the airship, drive half that distance backward, 
	 * turn 90*, drive forward ____, then turn -90 degrees and forward to the baseline.
	 */
	public gearBaseLine()
	{
		addSequential(new DriveDistance(7561));
		addSequential(new DriveDistance(-(7561)/2));
		addSequential(new RobotTurn(90));
		addSequential(new DriveDistance(55));
		addSequential(new RobotTurn(-90));
		addSequential(new DriveDistance(456465));
	}

}


