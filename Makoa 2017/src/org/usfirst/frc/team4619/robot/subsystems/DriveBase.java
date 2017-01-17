package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem{

	VictorSP frontLeft = new VictorSP(RobotMap.PWM_PORT_0);
	VictorSP frontRight = new VictorSP(RobotMap.PWM_PORT_2);
	VictorSP backLeft = new VictorSP(RobotMap.PWM_PORT_1);
	VictorSP backRight = new VictorSP(RobotMap.PWM_PORT_3);
	
	
	public DriveBase(VictorSP fl, VictorSP fr, VictorSP bl, VictorSP br) {
		frontLeft = fl;
		frontRight = fr;
		backLeft = bl;
		backRight = br;
	}
	
	public DriveBase() {
		
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
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
