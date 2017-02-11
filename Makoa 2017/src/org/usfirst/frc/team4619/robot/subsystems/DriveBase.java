package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;
import org.usfirst.frc.team4619.robot.commands.TeleopDriveGyro;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class DriveBase extends PIDSubsystem{

	

	private VictorSP frontL = new VictorSP(RobotMap.PWM_PORT_2);
	private VictorSP backL = new VictorSP(RobotMap.PWM_PORT_0);
	private VictorSP frontR = new VictorSP(RobotMap.PWM_PORT_5);
	private VictorSP backR = new VictorSP(RobotMap.PWM_PORT_1);
	private Encoder rightEncoder;
	private Encoder leftEncoder;
	public ADXRS450_Gyro gyro;
	private final static double p = 2;
	private final static double i = .75;
	private final static double d = 1;
	
	public RobotDrive driveTrain;
	
	public DriveBase() {
		super("DriveBase", p, i, d);
		rightEncoder = new Encoder(0, 1, false);
		leftEncoder = new Encoder(2, 3, true);
		gyro = new ADXRS450_Gyro();
	    driveTrain = new RobotDrive(frontL, backL, frontR, backR);
	}
	
	private double noVector = 0;
	
	
	public void arcadeDrive(double y, double x)
	{
		driveTrain.arcadeDrive(y, x, true);
	}
	
	@Override
	protected void initDefaultCommand() 
	{
		// TODO Auto-generated method stub
		setDefaultCommand(new TeleopDriveGyro());
	} 
	
	public void doNothing()
	{
		frontL.set(noVector);
	}
	
	public void moveForward() 
	{
		moveForward(0.75);
	}
	
	public void moveForward(double speed)
	{
		frontL.set(speed);
		frontR.set(-speed);
		backL.set(speed);
		backR.set(-speed);
	}

	public void moveBack() 
	{
		moveBack(.75);
	}
	
	public void moveBack(double speed)
	{
		frontL.set(-speed);
		frontR.set(speed);
		backL.set(-speed);
		backR.set(speed);
	}
	
	public void turnL()
	{
		turnL(.75);
	}
	
	public void turnL(double speed) 
	{
		frontL.set(-speed);
		frontR.set(-speed);
		backL.set(-speed);
		backR.set(-speed);
	}

	public void turnR()
	{
		turnR(.75);
	}
	
	public void turnR(double speed) 
	{
		frontL.set(speed);
		frontR.set(speed);
		backL.set(speed);
		backR.set(speed);
	}

	public Encoder getRightEncoder() {
		return rightEncoder;
	}

	public Encoder getLeftEncoder()
	{
		return leftEncoder;
	}
	
	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return rightEncoder.get();
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		arcadeDrive(output, 0);
	}
	
}
