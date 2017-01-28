package org.usfirst.frc.team4619.robot.commands;

import org.usfirst.frc.team4619.robot.OI;
import org.usfirst.frc.team4619.robot.subsystems.DriveBase;
import org.usfirst.frc.team4619.robot.subsystems.Gear;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command{

	public static OI oi;
	public static DriveBase driveMech = new DriveBase();
	public static Gear gearMech = new Gear();
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		oi = new OI();
	}	
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-gene rated method stub
		return false;
	}

	
}
