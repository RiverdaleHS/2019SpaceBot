/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class RaiseArm extends Command {
  public RaiseArm() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_Arm);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }



  @Override
  public synchronized void start() {
    System.out.println("staring raise");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // Robot.m_Arm.setSpeed(.2);
    System.out.println("execute raise");

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    // if (Robot.m_oi.getStick().getRawButton(11) || Robot.m_oi.getLogitech().getRawButton(1) || Robot.m_Arm.getUpperHallEffect()){
    //   return true;
    // }else{
    //   return false;
    // }
    System.out.println("is finnished called");

    return false;
  }  

  // Called once after isFinished returns true
  @Override
  protected void end() {
    System.out.println("end called");

    Robot.m_Arm.setSpeed(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("interupted");

  }
}
