package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Conveyor extends Subsystem {
    TalonSRX Motor = new TalonSRX(RobotMap.conveyorMotor);
    DigitalInput colorSensor = new DigitalInput(9);

    public void initDefaultCommand() {}
    
    public boolean getColorSensor() {
        return colorSensor.get();
    }
    public void conveyor(double speed) {
        Motor.set(ControlMode.PercentOutput, -speed);
        Motor.setNeutralMode(NeutralMode.Brake);
    }
}