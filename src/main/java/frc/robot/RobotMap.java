/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  //Controllers
  public static int mainJoystick = 0;
  public static int logitech = 1;
  //Motors
  //Chassis
  public static int leftFrontMotor = 41;
  public static int leftRearMotor = 20;
  public static int rightFrontMotor = 22;
  public static int rightRearMotor = 40;
  public static int leftShooterMotor = 21;
  public static int rightShooterMotor = 30;
  public static int conveyorMotor = 7;
  public static int intakeMotor = 31;
  public static int armMotor = 32;
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
