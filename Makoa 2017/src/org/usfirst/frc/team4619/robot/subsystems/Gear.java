package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;
import org.usfirst.frc.team4619.robot.commands.DoNothing;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gear extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private SpeedController gearMotorSpeedController = new Victor(RobotMap.GEAR_MOTOR_PORT);
	
    public void initDefaultCommand() {
    	// Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DoNothing());
    }
    
    public Gear(){
    	
    }
    
    public void stop()
    {
    	this.gearMotorSpeedController.set(0);
    }
    
    public void closeArm()
    {
    	this.closeArm(0.5);
    }
    
    public void closeArm(double speed)
    {
    	this.gearMotorSpeedController.set(Math.abs(speed));
    }
    
    public void openArm()
    {
    	this.openArm(0.5);
    }
    
    public void openArm(double speed)
    {
    	this.gearMotorSpeedController.set(-Math.abs(speed));
    }
    
    public void moveArm(double speed){
    	this.gearMotorSpeedController.set(speed);
    }
}

