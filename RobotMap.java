/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //CAN
  public static int leftFrontMotor = 1;
  public static int leftRearMotor = 2;
  public static int rightFrontMotor = 3;
  public static int rightRearMotor = 4;
  public static int gripperMotor = 5;
  public static int rotatorMotor = 6;

  //PWM
  public static int gripper_PWM = 0;
  public static int rotator_PWM = 1;

  //DIO Ports
  public static int rotatorBackLimitSwitch = 1;
  public static int rotatorFrontLimitSwitch = 2;
  
 



  //JOYSTICK
  public static int joystickPort = 0;

}