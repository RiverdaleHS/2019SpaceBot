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

    @Override
    public synchronized void start() {
        Robot.m_Intake.setSpeed(motorSpeed);

    }

    protected void execute() {
        Robot.m_Intake.setSpeed(motorSpeed);
    }

    // @Override
    // protected void end() {
    //     Robot.m_Intake.setSpeed(0);
    // }

    protected boolean isFinished() {
        return true;
    }

}