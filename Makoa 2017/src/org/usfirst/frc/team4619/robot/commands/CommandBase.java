package org.usfirst.frc.team4619.robot.commands;

import org.usfirst.frc.team4619.robot.OI;
import org.usfirst.frc.team4619.robot.subsystems.DriveBase;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command{

	public static OI oi;
	public static DriveBase driveMech = new DriveBase();
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		oi = new OI();
	}	
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
