package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class ShootBall extends CommandBase{

	double shootingSpeed;
	public ShootBall(double Speed) {
		requires(shooterMech);
		shootingSpeed = Speed;
	}
	
	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		shooterMech.Shoot(shootingSpeed);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected void end() {
		shooterMech.doNothing();
	}

	@Override
	protected void interrupted() {
		shooterMech.doNothing();
	}


} 
