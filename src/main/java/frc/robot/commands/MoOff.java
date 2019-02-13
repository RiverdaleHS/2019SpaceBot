package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class MoOff extends Command {
    public MoOff() {
        requires(Robot.m_Mo);
    }
       
    protected void initalize() {
    
    }
    protected void execute() {
       Robot.m_Mo.retract();
    }

    protected boolean isFinished() {
        return true;
    }
}
