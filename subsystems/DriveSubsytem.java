/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import frc.robot.commands.TeleoperationCommand;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
/**
 * Add your docs here.
 */
public class DriveSubsytem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

 // instantiate new motor controller objects 
public WPI_TalonSRX leftFrontMotor = new WPI_TalonSRX(RobotMap.leftFrontMotor);
public WPI_TalonSRX leftRearMotor = new WPI_TalonSRX(RobotMap.leftRearMotor);
public WPI_TalonSRX rightFrontMotor = new WPI_TalonSRX(RobotMap.rightFrontMotor);
public WPI_TalonSRX rightRearMotor = new WPI_TalonSRX(RobotMap.rightRearMotor);

//EG SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFrontMotor,leftRearMotor);
SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFrontMotor, rightRearMotor);

// instantiate a new DifferentialDrive object and assign motor controllers to differential drive

public DifferentialDrive drive = new DifferentialDrive(leftMotors,rightMotors);

// create constructor function
public DriveSubsytem (){
  leftRearMotor.follow(leftFrontMotor);
  rightRearMotor.follow(rightFrontMotor);
}
// add manualDrive() method (which I'll keep as teleopdrive)
public void teleopDrive(double move, double turn){
  drive.arcadeDrive(move, turn);
}


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  setDefaultCommand(new TeleoperationCommand());
  }
}
