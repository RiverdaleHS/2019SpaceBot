/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.auto;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

 
public class TurnToAnglePID extends Command implements PIDOutput {

  PIDController turnController = new PIDController(kP, kI, kD, kF, Robot.m_Chassis.getAHRS(), this);
  double turnControllerOutput;
  
  static final double kP = 0.03;
  static final double kI = 0.01;
  static final double kD = 0.01;
  static final double kF = 0.01;

  static final double kToleranceDegrees = 2.0f;

  

  public TurnToAnglePID() {
    requires(Robot.m_Chassis);
    
    turnController.setInputRange(-180.0f,  180.0f);
    turnController.setOutputRange(-0.3, 0.3);
    turnController.setAbsoluteTolerance(kToleranceDegrees);
    turnController.setContinuous(true);
    SmartDashboard.putData(turnController);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("turn to angle is initalize");
  }

  @Override
  public synchronized void start() {
    System.out.println("turn to angle is start");

    turnController.enable();
    turnController.setSetpoint(0f);//update this
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("turn to angle is execute");

    Robot.m_Chassis.setMotorsPercentOutput(turnControllerOutput, turnControllerOutput, turnControllerOutput, turnControllerOutput);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    System.out.println("turn to angle is finished");
    if (turnController.getError() < kToleranceDegrees){
      return true;
    }
    if (Robot.m_oi.getStick().getRawButton(11) || Robot.m_oi.getLogitech().getRawButton(1)){
      return true;
    }else{
      return false;
    }  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    turnController.disable();
  }

  @Override
  public synchronized void cancel() {
    turnController.disable();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }

  @Override
  public void pidWrite(double output) {
    turnControllerOutput = output;
  }
}
