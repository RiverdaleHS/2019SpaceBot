package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class RunIntake extends Command {
    double motorSpeed;
    public RunIntake(double speed) {
        requires(Robot.m_Intake);
        motorSpeed = speed;
    }

    protected void initialize() {
    }

    protected void execute() {
        Robot.m_Intake.intake(motorSpeed);
    }

    protected boolean isFinished() {
        return false;
    }

}