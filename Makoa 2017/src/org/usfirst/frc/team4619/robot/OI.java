package org.usfirst.frc.team4619.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);
	Joystick xbox = new Joystick(0);
	public Button A;
	public Button B;
	public Button X;
	public Button Y;
	public Button L_BUMPER;
	public Button R_BUMPER;
	public Button BACK;
	public Button START;

	
	public int[] buttonValues = {RobotMap.A, RobotMap.B, RobotMap.X, RobotMap.Y,
			 RobotMap.L_BUMPER, RobotMap.R_BUMPER, RobotMap.BACK, RobotMap.START};

	public Button [] buttons = {A, B, X, Y, L_BUMPER, R_BUMPER, BACK, START};
	
	public void setButtonValues()
	{
		for(Button xboxButtons:buttons)
		{
			for(int values:buttonValues)
			{
				xboxButtons = new JoystickButton(xbox, values);
			}
		}
	}
	
	public OI()
	{
		setButtonValues();
	}
	
	public double getXAxis()
	{
		return xbox.getRawAxis(0);
	}
	
	public double getYAxis()
	{
		return xbox.getRawAxis(1);
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
