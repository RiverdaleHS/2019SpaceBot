/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.OI;


public class JoystickDrive extends Command {

  public static OI m_oi = new OI();
  Joystick stick = m_oi.getStick();
  
  public JoystickDrive() {
    //Use requires() here to declare subsystem dependencies
    //eg. requires(chassis);
    requires(Robot.m_Chassis);
    setInterruptible(true);

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    setInterruptible(true);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double virtical = -stick.getY();
    double horizontal = -stick.getX();
    double twist = -stick.getTwist();
    //if this works the first time lol
    Robot.m_Chassis.setMotorsPercentOutput(virtical - twist - horizontal, virtical - twist + horizontal, -virtical + -twist - horizontal, -virtical + -twist + horizontal);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_Chassis.setMotorsPercentOutput(0, 0, 0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("joystick drive is interupted");
    super.interrupted();
    // end();
  }
}