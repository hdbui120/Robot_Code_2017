package org.usfirst.frc.team4619.robot.commands;

public class MoveGearArm extends CommandBase{
	
	public boolean isUp;
	public boolean isDown;
	
	public MoveGearArm()
	{
		requires(gearMech);
	}
	
	public void initialize()
	{
		if(gearMech.motorVector() == 0)
		{
			isDown = true;
		}
		else
			isDown = false;
		
		if(gearMech.motorVector() == .3)
		{
			isUp = true;
		}
		else
			isUp = false;
		System.out.println("Command has been initialized");
	}
	
	public void execute()
	{
		//this while loop will check the state of the motor
		//if the motor is running, then bring it back down to 0
		while(isUp)
		{
			gearMech.moveArm(-.35);
			if(isDown)
			{
				gearMech.notSpin();
			}
		}
		
		//this while loop will keep the motor at a constant vector of .3
		while(isDown)
		{
			gearMech.moveArm(.3);
		}
	}
	
	public void end()
	{
		gearMech.notSpin();
	}
	
	public void interrupted()
	{
		gearMech.notSpin();
	}
}
