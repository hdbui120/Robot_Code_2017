package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.commands.DriveJoystick;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class DriveBase extends PIDSubsystem{

	

	private SpeedController frontLeft;
	private SpeedController backLeft; 
	private SpeedController frontRight; 
	private SpeedController backRight;
	private Encoder encoder;
	private final static double p = 2;
	private final static double i = .75;
	private final static double d = 1;
	
	public RobotDrive driveTrain;
	
	public DriveBase(SpeedController fl, SpeedController bl, SpeedController fr, SpeedController br) {
		super("DriveBase", p, i, d);
		frontLeft = fl;
		backLeft = bl;
		frontRight = fr;
		backRight = br;
	    encoder = new Encoder(2,3, false);
	    driveTrain = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	}
	
	public DriveBase()
	{
		super("DriveBase", p, i, d);
		encoder = new Encoder(2,3, false);
	}
	
	private double noVector = 0;
	
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

	public Encoder getencoder() {
		return encoder;
	}


	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return encoder.get();
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		arcadeDriv(output, output);
	}
	
}
