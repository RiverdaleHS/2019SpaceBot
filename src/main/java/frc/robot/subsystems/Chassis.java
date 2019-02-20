/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.JoystickDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Chassis extends Subsystem {
  //motors
  TalonSRX leftFrontMotor = new TalonSRX(RobotMap.leftFrontMotor);
  TalonSRX leftRearMotor = new TalonSRX(RobotMap.leftRearMotor);
  TalonSRX rightFrontMotor = new TalonSRX(RobotMap.rightFrontMotor);
  TalonSRX rightRearMotor = new TalonSRX(RobotMap.rightRearMotor);

  public Chassis(){
    leftFrontMotor.configFactoryDefault();
    leftFrontMotor.setNeutralMode(NeutralMode.Brake);
    leftFrontMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, RobotMap.talonTimeoutMS);
    leftFrontMotor.setSensorPhase(false);
    leftFrontMotor.configNominalOutputForward(0, RobotMap.talonTimeoutMS);
    leftFrontMotor.configNominalOutputReverse(0, RobotMap.talonTimeoutMS);
    leftFrontMotor.configPeakOutputForward(1, RobotMap.talonTimeoutMS);
    leftFrontMotor.configPeakOutputReverse(-1, RobotMap.talonTimeoutMS);
    leftFrontMotor.config_kF(0, RobotMap.talon_kF, RobotMap.talonTimeoutMS);
    leftFrontMotor.config_kP(0, RobotMap.talon_kP, RobotMap.talonTimeoutMS);
    leftFrontMotor.config_kI(0, RobotMap.talon_kI, RobotMap.talonTimeoutMS);
    leftFrontMotor.config_kD(0, RobotMap.talon_kD, RobotMap.talonTimeoutMS);

    leftRearMotor.configFactoryDefault();
    leftRearMotor.setNeutralMode(NeutralMode.Brake);
    leftRearMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, RobotMap.talonTimeoutMS);
    leftRearMotor.setSensorPhase(false);
    leftRearMotor.configNominalOutputForward(0, RobotMap.talonTimeoutMS);
    leftRearMotor.configNominalOutputReverse(0, RobotMap.talonTimeoutMS);
    leftRearMotor.configPeakOutputForward(1, RobotMap.talonTimeoutMS);
    leftRearMotor.configPeakOutputReverse(-1, RobotMap.talonTimeoutMS);
    leftRearMotor.config_kF(0, RobotMap.talon_kF, RobotMap.talonTimeoutMS);
    leftRearMotor.config_kP(0, RobotMap.talon_kP, RobotMap.talonTimeoutMS);
    leftRearMotor.config_kI(0, RobotMap.talon_kI, RobotMap.talonTimeoutMS);
    leftRearMotor.config_kD(0, RobotMap.talon_kD, RobotMap.talonTimeoutMS);

    rightFrontMotor.configFactoryDefault();
    rightFrontMotor.setNeutralMode(NeutralMode.Brake);
    rightFrontMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, RobotMap.talonTimeoutMS);
    rightFrontMotor.setSensorPhase(false);
    rightFrontMotor.configNominalOutputForward(0, RobotMap.talonTimeoutMS);
    rightFrontMotor.configNominalOutputReverse(0, RobotMap.talonTimeoutMS);
    rightFrontMotor.configPeakOutputForward(1, RobotMap.talonTimeoutMS);
    rightFrontMotor.configPeakOutputReverse(-1, RobotMap.talonTimeoutMS);
    rightFrontMotor.config_kF(0, RobotMap.talon_kF, RobotMap.talonTimeoutMS);
    rightFrontMotor.config_kP(0, RobotMap.talon_kP, RobotMap.talonTimeoutMS);
    rightFrontMotor.config_kI(0, RobotMap.talon_kI, RobotMap.talonTimeoutMS);
    rightFrontMotor.config_kD(0, RobotMap.talon_kD, RobotMap.talonTimeoutMS);

    rightReartMotor.configFactoryDefault();
    rightReartMotor.setNeutralMode(NeutralMode.Brake);
    rightReartMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, RobotMap.talonTimeoutMS);
    rightReartMotor.setSensorPhase(false);
    rightReartMotor.configNominalOutputForward(0, RobotMap.talonTimeoutMS);
    rightReartMotor.configNominalOutputReverse(0, RobotMap.talonTimeoutMS);
    rightReartMotor.configPeakOutputForward(1, RobotMap.talonTimeoutMS);
    rightReartMotor.configPeakOutputReverse(-1, RobotMap.talonTimeoutMS);
    rightReartMotor.config_kF(0, RobotMap.talon_kF, RobotMap.talonTimeoutMS);
    rightReartMotor.config_kP(0, RobotMap.talon_kP, RobotMap.talonTimeoutMS);
    rightReartMotor.config_kI(0, RobotMap.talon_kI, RobotMap.talonTimeoutMS);
    rightReartMotor.config_kD(0, RobotMap.talon_kD, RobotMap.talonTimeoutMS);
  }

  public void setSpeed(double leftFront, double leftRear, double rightFront, double rightRear){
    leftFrontMotor.set(ControlMode.PercentOutput, leftFront);
    leftRearMotor.set(ControlMode.PercentOutput, leftRear);
    rightFrontMotor.set(ControlMode.PercentOutput, rightFront);
    rightRearMotor.set(ControlMode.PercentOutput, rightRear);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new JoystickDrive());
  }

}


public class Chassis extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  TalonSRX leftFrontMotor = new TalonSRX(RobotMap.leftFrontMotor);
  TalonSRX leftRearMotor = new TalonSRX(RobotMap.leftRearMotor);
  TalonSRX rightFrontMotor = new TalonSRX(RobotMap.rightFrontMotor);
  TalonSRX rightReartMotor = new TalonSRX(RobotMap.rightRearMotor);

  
  public Chassis(){
    //This needs a lot of testing
  
  }

  public void setMotorsPercentOutput(double leftFront, double leftRear, double rightFront, double rightRear){
    leftFrontMotor.set(ControlMode.PercentOutput, leftFront);
    leftRearMotor.set(ControlMode.PercentOutput, leftRear);
    rightFrontMotor.set(ControlMode.PercentOutput, rightFront);
    rightReartMotor.set(ControlMode.PercentOutput, rightRear);
  }

  public void setMotorsVelocity(double leftFront, double leftRear, double rightFront, double rightRear){
    leftFrontMotor.set(ControlMode.Velocity, leftFront*2680);
    leftRearMotor.set(ControlMode.Velocity, leftRear*2680);
    rightFrontMotor.set(ControlMode.Velocity, rightFront*2680);
    rightReartMotor.set(ControlMode.Velocity, rightRear*2680);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new JoystickDrive());
  }

  public void updateTelemetry(){
    SmartDashboard.putNumber("Left Front Output Percent", leftFrontMotor.getMotorOutputPercent());
    SmartDashboard.putNumber("Left Front Speed", leftFrontMotor.getSelectedSensorVelocity(0));
    SmartDashboard.putNumber("Left Front Error", leftFrontMotor.getClosedLoopError(0));

    SmartDashboard.putNumber("Left Rear Output Percent", leftFrontMotor.getMotorOutputPercent());
    SmartDashboard.putNumber("Left Rear Speed", leftFrontMotor.getSelectedSensorVelocity(0));
    SmartDashboard.putNumber("Left Rear Error", leftFrontMotor.getClosedLoopError(0));

    SmartDashboard.putNumber("Right Front Output Percent", leftFrontMotor.getMotorOutputPercent());
    SmartDashboard.putNumber("Right Front Speed", leftFrontMotor.getSelectedSensorVelocity(0));
    SmartDashboard.putNumber("Right Front Error", leftFrontMotor.getClosedLoopError(0));

    SmartDashboard.putNumber("Right Rear Output Percent", leftFrontMotor.getMotorOutputPercent());
    SmartDashboard.putNumber("Right Rear Speed", leftFrontMotor.getSelectedSensorVelocity(0));
    SmartDashboard.putNumber("Right Rear Error", leftFrontMotor.getClosedLoopError(0));
  }

}
