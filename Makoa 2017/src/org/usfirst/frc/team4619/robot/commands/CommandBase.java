package org.usfirst.frc.team4619.robot.commands;

import org.usfirst.frc.team4619.robot.OI;
import org.usfirst.frc.team4619.robot.subsystems.DriveBase;
import org.usfirst.frc.team4619.robot.subsystems.Gear;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command{

	public static OI oi;
	public static DriveBase driveMech;
	public static Gear gearMech;
	
	public static void init() {
		oi = new OI();
		driveMech = new DriveBase();
		gearMech = new Gear();
	}	
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-gene rated method stub
		return false;
	}

	
}
