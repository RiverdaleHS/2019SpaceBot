package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


public class RunMo extends Command {
    public RunMo() {
        requires(Robot.m_Mo);
    }
   
    protected void initalize() {
    }

    protected void execute() {
        Robot.m_Mo.extend();
    }

    protected boolean isFinished() {
        return true;
    }
}

