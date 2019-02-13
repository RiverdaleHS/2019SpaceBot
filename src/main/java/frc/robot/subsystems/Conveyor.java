package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Conveyor extends Subsystem {
    TalonSRX Motor = new TalonSRX(RobotMap.conveyorMotor);

    public void initDefaultCommand() {}

    public void conveyor(double speed) {
        Motor.set(ControlMode.PercentOutput, -speed);
    }
}