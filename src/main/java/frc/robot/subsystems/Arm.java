package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.RunArmWithStick;

public class Arm extends Subsystem {

  //sensors
  DigitalInput hallEffect = new DigitalInput(4);

  //motor controllers
  TalonSRX armMotor = new TalonSRX(RobotMap.armMotor);
    
  public void initDefaultCommand() {
    setDefaultCommand(new RunArmWithStick());
  }

  public void setSpeed(double speed) {
      armMotor.set(ControlMode.PercentOutput, speed);
  }
  
  public boolean getHallEffect(){
      return hallEffect.get();
  }
}