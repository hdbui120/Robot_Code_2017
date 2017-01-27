package org.usfirst.frc.team4619.robot;

import java.util.HashMap;

import org.usfirst.frc.team4619.robot.RobotMap;
import org.usfirst.frc.team4619.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//created xbox joystick object
	Joystick xbox = new Joystick(RobotMap.XBOX_PORT);
	
	//created buttons for xbox joysticks
	public Button A;
	public Button B;
	public Button X;
	public Button Y;
	public Button L_BUMPER;
	public Button R_BUMPER;
	public Button BACK;
	public Button START;
	
	public HashMap<String, JoystickButton> buttons = new HashMap<String, JoystickButton>();
	
	public OI()
	{
		// Setup buttons		
		buttons.put("A", new JoystickButton(xbox, RobotMap.A));
		buttons.put("B", new JoystickButton(xbox, RobotMap.B));
		buttons.put("X", new JoystickButton(xbox, RobotMap.X));
		buttons.put("Y", new JoystickButton(xbox, RobotMap.Y));
		buttons.put("L_BUMPER", new JoystickButton(xbox, RobotMap.L_BUMPER));
		buttons.put("R_BUMPER", new JoystickButton(xbox, RobotMap.R_BUMPER));
		buttons.put("BACK", new JoystickButton(xbox, RobotMap.BACK));
		buttons.put("START", new JoystickButton(xbox, RobotMap.START));
		
		this.setCommands();
	}
	
	public void setCommands()
	{
		buttons.get("L_BUMPER").whenPressed(new HoldGear());
		buttons.get("R_BUMPER").whenPressed(new DropGear());
	}
	
	//this method return the raw value of the xbox x-axis
	public double getXAxis()
	{
		return xbox.getRawAxis(RobotMap.XBOX_XAXIS);
	}
	
	//this method return the raw value of the xbox y-axis
	public double getYAxis()
	{
		return xbox.getRawAxis(RobotMap.XBOX_YAXIS);
	}
	
	

	

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

}
