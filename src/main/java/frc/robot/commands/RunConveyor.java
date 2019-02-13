package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class RunConveyor extends Command {
    double motorSpeed;
    public RunConveyor(double speed) {
        requires(Robot.m_Conveyor);
        motorSpeed = speed;
    }

    protected void initialize() {
    }

    protected void execute() {
        Robot.m_Conveyor.conveyor(motorSpeed);
    }

    protected boolean isFinished() {
        return false;
    }

}