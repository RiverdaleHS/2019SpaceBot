package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;



public class RunArmWithStick extends Command {
    public RunArmWithStick() {
        requires(Robot.m_Arm);

    }

    protected void initialize() {
    }

    protected void execute() {
        Robot.m_Arm.arm(Robot.m_oi.getLogitech().getRawAxis(1));
    }

    protected boolean isFinished() {
        return false;
    }
    protected void end() {
       Robot.m_Arm.arm(0);
    }
}