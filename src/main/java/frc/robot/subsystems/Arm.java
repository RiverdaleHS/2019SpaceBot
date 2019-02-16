package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.RunArmWithStick;

public class Arm extends Subsystem {

  //sensors
  DigitalInput upperHallEffect = new DigitalInput(7);
  DigitalInput lowerHallEffect = new DigitalInput(8);
  //motors
  TalonSRX armMotor = new TalonSRX(RobotMap.armMotor);
   
  public void initDefaultCommand() {
    setDefaultCommand(new RunArmWithStick());
  }

  public void setSpeed(double speed) {
    armMotor.set(ControlMode.PercentOutput, speed);
  }

  public boolean getUpperHallEffect(){
    return upperHallEffect.get();
  }

  public boolean getLowerHallEffect(){
    return lowerHallEffect.get();
  }
}