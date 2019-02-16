/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Conveyor;

public class RunConveyorUntilSeesCargo extends Command {
  public RunConveyorUntilSeesCargo() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_Conveyor);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.m_Conveyor.conveyor(.8);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if (Robot.m_oi.getStick().getRawButton(11) || Robot.m_Conveyor.getColorSensor()){
      return true;
    }else{
      return false;
    }
    
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_Conveyor.conveyor(0);
  }

  @Override
  public synchronized void cancel() {
    Robot.m_Conveyor.conveyor(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
