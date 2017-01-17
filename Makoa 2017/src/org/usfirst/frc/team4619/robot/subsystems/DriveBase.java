package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.commands.TeleopDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem{

	private SpeedController frontLeft;
	private SpeedController backLeft; 
	private SpeedController frontRight; 
	private SpeedController backRight;
	
	//created robotdrive object to implement it in the arcadeDrive method
	private RobotDrive driveTrain = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	
	//class constructor allows us to assign specific speed controllers
	public DriveBase(SpeedController fl, SpeedController fr, SpeedController bl, SpeedController br) {
		frontLeft = fl;
		frontRight = fr;
		backLeft = bl;
		backRight = br;
	}
	
	//regular class constructor
	public DriveBase() {
		
	}
	
	//whenever we initialize the drive base class
	//teleopdrive will be the default command, which will let the driver control the robot manually
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new TeleopDrive());
	}
	
	//this method set the drive style which is arcade drive
	public void arcadeDrive(double xAxis, double yAxis)
	{
		driveTrain.arcadeDrive(xAxis, yAxis, true);
	}
	
	public void moveForward() {
		frontLeft.set(0.75);
		frontRight.set(-0.75);
		backLeft.set(0.75);
		backRight.set(-0.75);
	}

	public void moveBack() {
		frontLeft.set(-0.75);
		frontRight.set(0.75);
		backLeft.set(-0.75);
		backRight.set(0.75);
	}
	
	public void turnLeft() {
		frontLeft.set(-0.75);
		frontRight.set(-0.75);
		backLeft.set(-0.75);
		backRight.set(-0.75);
	}
	
	public void turnRight() {
		frontLeft.set(0.75);
		frontRight.set(0.75);
		backLeft.set(0.75);
		backRight.set(0.75);
	}
	
	
}
