package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.RunArm;

public class Arm extends Subsystem {
    TalonSRX motor = new TalonSRX(RobotMap.armMotor);
   
    DigitalInput topHallEffect = new DigitalInput(4);
//   DigitalInput lowerHallEffect = new DigitalInput(5);
    
    public void initDefaultCommand() {
        setDefaultCommand(new RunArm());
    }
//need a function to return the value of the limit switch
    public void arm(double speed) {
       motor.set(ControlMode.PercentOutput, speed);
    }
    public boolean getHallEffect(){
        return topHallEffect.get();
    }
//    public boolean getLowerEffect(){
//        return lowerHallEffect.get();
//    }
}