package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;
import org.usfirst.frc.team4619.robot.commands.ShootBall;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem{

	
	SpeedController leftShooter;
	SpeedController rightShooter;
	double inTakeSpeed;
	double zeroSpeed = 0;
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new ShootBall(zeroSpeed));
	}
	
	public Shooter() {
		leftShooter = new VictorSP(RobotMap.PWM_PORT_6);
		rightShooter = new VictorSP(RobotMap.PWM_PORT_7);
	}
	
	public void Shoot(double intakeSpeed) {
		leftShooter.set(intakeSpeed);
		rightShooter.set(-intakeSpeed);
	}
	
	public void Shoot() {
		Shoot(.85);
	}
	
	public void doNothing() {
		leftShooter.set(zeroSpeed);
		rightShooter.set(zeroSpeed);
	}
}
