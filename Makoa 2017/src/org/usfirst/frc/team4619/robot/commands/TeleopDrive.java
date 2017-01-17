package org.usfirst.frc.team4619.robot.commands;

public class TeleopDrive extends CommandBase {

	public TeleopDrive()
	{
		requires(driveTrain);
	}

	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		driveTrain.arcadeDrive(oi.getXAxis(), oi.getYAxis());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
	
}
