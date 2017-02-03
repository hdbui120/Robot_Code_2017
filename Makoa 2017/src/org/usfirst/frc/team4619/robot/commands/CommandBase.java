package org.usfirst.frc.team4619.robot.commands;

import org.usfirst.frc.team4619.robot.OI;
import org.usfirst.frc.team4619.robot.subsystems.DriveBase;
import org.usfirst.frc.team4619.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command{

	public static OI oi;
	public static DriveBase driveMech;
	public static Shooter shooterMech;
	
	public static void init() {
		oi = new OI();
		driveMech = new DriveBase();
		shooterMech = new Shooter();
	}	
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-gene rated method stub
		return false;
	}

	
}
