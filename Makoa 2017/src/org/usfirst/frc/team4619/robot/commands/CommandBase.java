package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command{

	public static OI oi;
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
