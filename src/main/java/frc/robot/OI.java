/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.LarryOff;
import frc.robot.commands.MoOff;
import frc.robot.commands.RunArmWithStick;
import frc.robot.commands.RunConveyor;
import frc.robot.commands.RunIntake;
import frc.robot.commands.RunLarry;
import frc.robot.commands.RunMo;
import frc.robot.commands.RunShooter;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  private Joystick stick = new Joystick(RobotMap.mainJoystick);
  private Joystick logitech = new Joystick(RobotMap.logitech);

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



  public OI(){
      button5.whenPressed(new RunMo());
      button6.whenPressed(new MoOff());
      button10.whenPressed(new RunLarry());
      button9.whenPressed(new LarryOff());
      button11.whenPressed(new RunConveyor(.8));
      button12.whenPressed(new RunConveyor(0));
      // button3.whenPressed(new RunArmWithStick(.4)); THIS doesnt make any sense
      // button4.whenPressed(new RunArmWithStick(0));
      // button13.whenPressed(new RunArmWithStick(-.4));
      button14.whenPressed(new RunIntake(.4));
      button15.whenPressed(new RunIntake(0));
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

  public Joystick getStick() {
    return stick;
  }

  public Joystick getLogitech() {
    return logitech;
  }
} 

