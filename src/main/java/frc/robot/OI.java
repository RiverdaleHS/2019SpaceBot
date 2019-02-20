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
import frc.robot.commands.FireCargoRocket;
import frc.robot.commands.FireCargoShip;
import frc.robot.commands.IntakeCargo;
import frc.robot.commands.LarryOff;
import frc.robot.commands.LowerArmTwo;
import frc.robot.commands.MoOff;
import frc.robot.commands.RaiseArmTwo;
import frc.robot.commands.RunArmWithStick;
import frc.robot.commands.RunConveyor;
import frc.robot.commands.RunConveyorUntilSeesCargo;
import frc.robot.commands.RunIntake;
import frc.robot.commands.RunLarry;
import frc.robot.commands.RunMo;
import frc.robot.commands.RunShooter;
import frc.robot.commands.TestArmCommand;
import frc.robot.commands.auto.TurnToAnglePID;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  private Joystick stick = new Joystick(RobotMap.mainJoystick);
  private Joystick logitech = new Joystick(RobotMap.logitech);

  Button button1 = new JoystickButton(stick, 1);
  Button button2 = new JoystickButton(stick, 2);
  Button button3 = new JoystickButton(stick, 3);
  Button button4 = new JoystickButton(stick, 4);
  Button button5 = new JoystickButton(stick, 5);
  Button button6 = new JoystickButton(stick, 6);
  Button button7 = new JoystickButton(stick, 7);
  Button button9 = new JoystickButton(stick, 9);
  Button button10 = new JoystickButton(stick, 10);
  Button button11 = new JoystickButton(stick, 11);
  Button button12 = new JoystickButton(stick, 12);
  Button button13 = new JoystickButton(stick, 13);
  Button button15 = new JoystickButton(stick, 15);
  Button button14 = new JoystickButton(stick, 14);

  Button buttonX = new JoystickButton(logitech, 1);
  Button buttonA = new JoystickButton(logitech, 2);
  Button buttonB = new JoystickButton(logitech, 3);
  Button buttonY = new JoystickButton(logitech, 4);
  Button bumperLeft = new JoystickButton(logitech, 5);
  Button bumperRight = new JoystickButton(logitech, 6);
  Button triggerLeft = new JoystickButton(logitech, 7);
  Button triggerRight = new JoystickButton(logitech, 8);
  Button back = new JoystickButton(logitech, 9);
  Button start = new JoystickButton(logitech, 10);



  public OI(){
      //shoot high
      button1.whileHeld(new RunConveyor(0.8));
      button1.whileHeld(new RunShooter(0.8));
      button1.whenPressed(new LarryOff());
      //shoot low
      button2.whileHeld(new RunConveyor(0.8));
      button2.whileHeld(new RunShooter(0.3));
      button2.whenPressed(new LarryOff());

      button3.whenPressed(new LarryOff());
      button3.whenPressed(new RunMo());

      button4.whenPressed(new RunLarry());
      button4.whenPressed(new MoOff());
      
      button5.whenPressed(new TurnToAnglePID());

      button13.whenPressed(new IntakeCargo());

  
      bumperLeft.whenPressed(new RunMo());
      bumperRight.whenPressed(new RunLarry());
      triggerLeft.whenPressed(new MoOff());
      triggerRight.whenPressed(new LarryOff());

      buttonY.whenPressed(new RaiseArmTwo());
      buttonA.whenPressed(new LowerArmTwo()); 

      //Reverse cargo
      buttonB.whileHeld(new RunConveyor(-0.8));
      buttonB.whileHeld(new RunShooter(-0.4));
      buttonB.whenPressed(new RunLarry());
      
      
  }

  public Joystick getStick() {
    return stick;
  }

  public Joystick getLogitech() {
    return logitech;
  }
} 

