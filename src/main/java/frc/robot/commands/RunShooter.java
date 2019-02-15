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

    @Override
    public synchronized void start() {
        super.start();
    }

    //does this need to be done in start?
    protected void execute() {
        Robot.m_Shooter.shooter(motorSpeed);
    }

    @Override
    protected void end() {
        Robot.m_Shooter.shooter(0);
    }

    protected boolean isFinished() {
        return true;
    }
}