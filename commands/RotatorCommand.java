/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;
// import frc.robot.subsystems.RotatorSubsystem;

public class RotatorCommand extends Command {
  public RotatorCommand() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  requires(Robot.rotatorSubsystem);



  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    //set rotatormotor to full-back (start position)
  }

  // Called repeatedly when this Command is scheduled to run
  //scheduled to run on logitechbutton 2 release
  @Override
  protected void execute() {
    //rotator motor if 'back' send 'forward' else
    // send 'backward'
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
