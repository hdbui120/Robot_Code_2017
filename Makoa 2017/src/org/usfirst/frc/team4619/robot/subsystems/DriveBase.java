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
	
	public RobotDrive driveTrain;
	
	private double noVector = 0;
	
	public DriveBase(SpeedController fl, SpeedController bl, SpeedController fr, SpeedController br)
	{
		frontLeft = fl;
		backLeft = bl;
		frontRight = fr;
		backRight = br;
		driveTrain = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	}
	
	public void arcadeDriv(double y, double x)
	{
		driveTrain.arcadeDrive(y, x, true);
	}
	
		@Override
	protected void initDefaultCommand() 
	{
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveJoystick());
	} 
		
	//regular class constructor
	public DriveBase() 
	{
		
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
