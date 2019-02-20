package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


public class RunArmWithStick extends Command {
    
    public RunArmWithStick() {
        requires(Robot.m_Arm);
        setInterruptible(true);

    }

    protected void initialize() {
        super.initialize();
        setInterruptible(true);

    }

    protected void execute() {
        super.execute();
        Robot.m_Arm.setSpeed(Robot.m_oi.getLogitech().getRawAxis(1) + Robot.m_oi.getLogitech().getRawAxis(3));
    }

    protected boolean isFinished() {
    /*
        if (getHallEffect) {
            return true;
        }
        else {
        return false;
        }
    */
        return false;
    }
    
    protected void end() {
        super.end();
    //    Robot.m_Arm.setSpeed(0);
    }

    @Override
    protected void interrupted() {
        super.interrupted();
        System.out.println("run arm with stick interupted");
        end();
    }
}