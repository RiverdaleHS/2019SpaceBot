/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.cscore.MjpegServer;
//import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Scheduler;
//import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.RunMo;
import frc.robot.commands.RunLarry;
import frc.robot.commands.RunConveyor;
import frc.robot.commands.MoOff;
import frc.robot.commands.RunShooter;
import frc.robot.commands.RunIntake;
import frc.robot.commands.RunArm;
import frc.robot.commands.LarryOff;
import frc.robot.subsystems.Chassis;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Conveyor;
import frc.robot.subsystems.Larry;
import frc.robot.subsystems.Mo;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Intake;
//import edu.wpi.first.wpilibj.CameraServer;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static Mo m_Mo = new Mo();
  public static Larry m_Larry = new Larry();
  public static Chassis m_Chassis = new Chassis();
  public static OI m_oi = new OI();
  public static Shooter m_Shooter = new Shooter();
  public static Conveyor m_Conveyor = new Conveyor();
  public static Intake m_Intake = new Intake();
  public static Arm m_Arm = new Arm();
  public boolean isMoOn = false;
  Compressor c = new Compressor();
  //UsbCamera usbCamera = new UsbCamera("USB Camera 0", 0);
  //MjpegServer mjpegServer1 = new MjpegServer("serve_USB Camera 0", 1181);

  Joystick stick = m_oi.getStick();
  Button button2 = new JoystickButton(stick, 2);
  Button button3 = new JoystickButton(stick, 3);
  Button button4 = new JoystickButton(stick, 4);
  Button button5 = new JoystickButton(stick, 5);
  Button button6 = new JoystickButton(stick, 6);
  Button button9 = new JoystickButton(stick, 9);
  Button button10 = new JoystickButton(stick, 10);
  Button button11 = new JoystickButton(stick, 11);
  Button button12 = new JoystickButton(stick, 12);
  Button button13 = new JoystickButton(stick, 13);
  Button button15 = new JoystickButton(stick, 15);
  Button button14 = new JoystickButton(stick, 14);
  Button trigger = new JoystickButton(stick, 1);

  Joystick logitech = m_oi.getLogitech();
  Button buttonX = new JoystickButton(logitech, 1);
  Button buttonA = new JoystickButton(logitech, 2);
  Button buttonB = new JoystickButton(logitech, 3);
  Button buttonY = new JoystickButton(logitech, 4);
  Button bumperLeft = new JoystickButton(logitech, 5);
  Button bumperRight = new JoystickButton(logitech, 6);
  Button triggerleft = new JoystickButton(logitech, 7);
  Button triggerRight = new JoystickButton(logitech, 8);
  Button back = new JoystickButton(logitech, 9);
  Button start = new JoystickButton(logitech, 10);
  
  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
   // CameraServer.getInstance().startAutomaticCapture();
  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
    m_Chassis.setMotors( .3, 0, .3, 0);
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    // if (m_autonomousCommand != null) {
    //   m_autonomousCommand.cancel();
    // }
    c.setClosedLoopControl(true);
    double y = stick.getY();
    double x = stick.getX();
    double twist = stick.getTwist();
    Robot.m_Chassis.setMotors(y - twist - x, y - twist + x, -y + -twist - x, -y + -twist + x);
  
    
    button5.whenPressed(new RunMo());
    button6.whenPressed(new MoOff());
    
    button10.whenPressed(new RunLarry());
    button9.whenPressed(new LarryOff());
    button11.whenPressed(new RunConveyor(.8));
    button12.whenPressed(new RunConveyor(0));
    button14.whenPressed(new RunIntake(.7));
    button15.whenPressed(new RunIntake(0));
    button3.whenPressed(new RunArm(.4));
    button4.whenPressed(new RunArm(0));
    button13.whenPressed(new RunArm(-.4));
    trigger.whenPressed(new RunShooter(.8));
    button2.whenPressed(new RunShooter(0));
    
 
    bumperLeft.whenPressed(new RunMo());
    bumperRight.whenPressed(new MoOff());
    triggerleft.whenPressed(new RunLarry());
    triggerRight.whenPressed(new LarryOff());
    buttonX.whenPressed(new RunConveyor(.8));
    buttonY.whenPressed(new RunConveyor(0));
    back.whenPressed(new RunIntake(.4));
    start.whenPressed(new RunIntake(0));
    buttonA.whenPressed(new RunShooter(.8));
    buttonB.whenPressed(new RunShooter(0));
  }

  /**
   * This function is called periodically during operator control.
   */
  
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
