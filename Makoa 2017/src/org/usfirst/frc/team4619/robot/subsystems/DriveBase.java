package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.commands.DriveJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem{

	private SpeedController frontLeft;
	private SpeedController backLeft; 
	private SpeedController frontRight; 
	private SpeedController backRight;
	
	private double noVector = 0;
	//created robotdrive object to implement it in the arcadeDrive method
	public RobotDrive driveTrain = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	
	//class constructor allows us to assign specific speed controllers
	public DriveBase(SpeedController fl, SpeedController fr, SpeedController bl, SpeedController br) 
	{
		frontLeft = fl;
		frontRight = fr;
		backLeft = bl;
		backRight = br;
	}
	
	//regular class constructor
	public DriveBase() 
	{
		
	}
	
	//whenever we initialize the drive base class
	//teleopdrive will be the default command, which will let the driver control the robot manually
	@Override
	protected void initDefaultCommand() 
	{
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveJoystick());
	}
	
	//this method set the drive style which is arcade drive
	public void arcadeDrive(double xAxis, double yAxis)
	{
		driveTrain.arcadeDrive(xAxis, yAxis);
	}
	
	public void doNothing()
	{
		frontLeft.set(noVector);
	}
	
	public void moveForward() 
	{
		moveForward(0.75);
	}
	
	public void moveForward(double speed)
	{
		frontLeft.set(speed);
		frontRight.set(-speed);
		backLeft.set(speed);
		backRight.set(-speed);
	}

	public void moveBack() 
	{
		moveBack(.75);
	}
	
	public void moveBack(double speed)
	{
		frontLeft.set(-speed);
		frontRight.set(speed);
		backLeft.set(-speed);
		backRight.set(speed);
	}
	
	public void turnLeft()
	{
		turnLeft(.75);
	}
	
	public void turnLeft(double speed) 
	{
		frontLeft.set(-speed);
		frontRight.set(-speed);
		backLeft.set(-speed);
		backRight.set(-speed);
	}

	public void turnRight()
	{
		turnRight(.75);
	}
	
	public void turnRight(double speed) 
	{
		frontLeft.set(speed);
		frontRight.set(speed);
		backLeft.set(speed);
		backRight.set(speed);
	} 
	
}
