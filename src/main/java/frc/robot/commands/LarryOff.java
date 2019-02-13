package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


public class LarryOff extends Command {
    public LarryOff() {
        requires(Robot.m_Larry);
       }
       
    protected void initalize() {
    
    }

    protected void execute() {
        Robot.m_Larry.retract();
    }
    
    protected boolean isFinished() {
        return false;
    }
}
