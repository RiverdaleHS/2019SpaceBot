package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;



public class RunLarry extends Command {
    public RunLarry() {
        requires(Robot.m_Larry);
    }

    protected void initalize() {
    }

    protected void execute() {
        Robot.m_Larry.extend();
    }
    
    protected boolean isFinished() {
       return true;
    }
}
