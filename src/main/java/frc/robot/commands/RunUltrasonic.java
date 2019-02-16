package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class RunUltrasonic extends Command {
    double leftFrontMotorSpeed;
    double rightFrontMotorSpeed;
    double leftRearMotorSpeed;
    double rightRearMotorSpeed;
   
    public RunUltrasonic(double speed) {
        requires(Robot.m_Chassis);
       leftFrontMotorSpeed = speed;
       rightFrontMotorSpeed = speed;
       leftRearMotorSpeed = speed;
       rightRearMotorSpeed = speed;

    }

    protected void initialize() {
    }

    protected void execute() {
        Robot.m_Chassis.chassis(leftFrontMotorSpeed);
        Robot.m_Chassis.chassis(rightFrontMotorSpeed);
        Robot.m_Chassis.chassis(leftRearMotorSpeed);
        Robot.m_Chassis.chassis(rightRearMotorSpeed);

    }

    
    protected boolean isFinished() {
        //return the value of the limit switch (or the status that says we want to end it)
          double distance = Robot.m_Chassis.ultrasonic();
        if (distance > 0 && distance <= 12) {
            return true;       
        }
        else {
        return false;        }
    }
    protected void end() {
       Robot.m_Chassis.setMotors(0, 0, 0, 0);
    }
//end turn off the motor
}
