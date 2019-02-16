package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Conveyor extends Subsystem {

    //sensors
    DigitalInput colorSensor = new DigitalInput(9);

    //motors
    TalonSRX motor = new TalonSRX(RobotMap.conveyorMotor);
    
    public void initDefaultCommand() {}

    public void conveyor(double speed) {
        motor.set(ControlMode.PercentOutput, -speed);
        motor.setNeutralMode(NeutralMode.Brake);
    }

    public boolean getColorSensor() {
        return colorSensor.get();
    }
}