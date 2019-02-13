package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Intake extends Subsystem {
    TalonSRX intakeMotor = new TalonSRX(RobotMap.intakeMotor);

    public void initDefaultCommand() {}

    public void intake(double speed) {
        intakeMotor.set(ControlMode.PercentOutput, -speed);
    }
}