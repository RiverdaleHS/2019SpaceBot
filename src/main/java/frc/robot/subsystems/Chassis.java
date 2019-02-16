/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.JoystickDrive;
import edu.wpi.first.wpilibj.Ultrasonic;


/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Chassis extends Subsystem {
  //motors
  TalonSRX leftFrontMotor = new TalonSRX(RobotMap.leftFrontMotor);
  TalonSRX leftRearMotor = new TalonSRX(RobotMap.leftRearMotor);
  TalonSRX rightFrontMotor = new TalonSRX(RobotMap.rightFrontMotor);
  TalonSRX rightRearMotor = new TalonSRX(RobotMap.rightRearMotor);

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
