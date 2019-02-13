package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class RunShooter extends Command {
    double motorSpeed;
    public RunShooter(double speed) {
        requires(Robot.m_Shooter);
        motorSpeed = speed;
    }
    protected void initialize() {
    }

    protected void execute() {
        Robot.m_Shooter.shooter(motorSpeed);
    }

    protected boolean isFinished() {
        return false;
    }
}