package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.commands.DoNothing;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gear extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private SpeedController x;
	private double motorNotSpin = 0;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DoNothing());
    }
    
    public SpeedController getMotor()
    {
		return x;
    	
    }
    
    public Gear(){
    	
    }
    
    public double motorVector()
    {
    	return x.get();
    }
    
    public void notSpin()
    {
    	x.set(motorNotSpin);
    }
    
    public void moveArm(double speed){
    	x.set(speed);
    }
    
    
}