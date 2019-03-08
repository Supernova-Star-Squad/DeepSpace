/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;
// import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
// import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.VictorSP;



public class GripperLockCommand extends Command {
  public GripperLockCommand() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
 requires(Robot.gripperSubsystem);

 

 

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    //set gripper motor to 'unlocked'

    
  }

  // Called repeatedly when this Command is scheduled to run
  // scheduled to run on logitech button 1 lift off
  @Override
  protected void execute() {
    // if gripper 'unlocked' rotate to 'lock'
    //else rotate to 'unlock'
    
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
