
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Shooter extends Subsystem {
    TalonSRX leftMotor = new TalonSRX(RobotMap.leftShooterMotor);
    TalonSRX rightMotor = new TalonSRX(RobotMap.rightShooterMotor);

    public void initDefaultCommand() {
        leftMotor.setInverted(true);
        rightMotor.setInverted(false);
    }

    public void shooter(double speed) {
        leftMotor.set(ControlMode.PercentOutput, speed);
        rightMotor.set(ControlMode.PercentOutput, speed);
    }

}

 