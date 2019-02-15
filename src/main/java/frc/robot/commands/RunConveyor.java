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

    @Override
    public synchronized void start() {
        Robot.m_Conveyor.conveyor(motorSpeed);
    }
    protected void execute() {
        Robot.m_Conveyor.conveyor(motorSpeed);
    }
    @Override
    public synchronized void cancel() {
        Robot.m_Conveyor.conveyor(0);
    }

    
    @Override
    protected void end() {
        Robot.m_Conveyor.conveyor(0);
    }

    protected boolean isFinished() {
        return true;
    }

}