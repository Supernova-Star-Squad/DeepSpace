/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.GripperLockCommand;
import frc.robot.commands.RotatorCommand;
import frc.robot.RobotMap;
import frc.robot.subsystems.GripperSubsystem;
import frc.robot.subsystems.RotatorSubsystem;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.

  // Define the Joystick (it's a logitech 3d) so we'll call it logitech
  public Joystick logitech = new Joystick(RobotMap.joystickPort);

  //the next line is the given example
  // Button button = new JoystickButton(stick, buttonNumber);
  // which does not work, btw

  JoystickButton logitechbutton1 = new JoystickButton(logitech, 1);
  JoystickButton logitechbutton2 = new JoystickButton(logitech, 2);
  JoystickButton logitechbutton3 = new JoystickButton(logitech, 3);
  JoystickButton logitechbutton4 = new JoystickButton(logitech, 4);
  JoystickButton logitechbutton5 = new JoystickButton(logitech, 5);
  JoystickButton logitechbutton6 = new JoystickButton(logitech, 6);
  JoystickButton logitechbutton7 = new JoystickButton(logitech, 7);
  JoystickButton logitechbutton8 = new JoystickButton(logitech, 8);
  JoystickButton logitechbutton9 = new JoystickButton(logitech, 9);
  JoystickButton logitechbutton10 = new JoystickButton(logitech, 10);
  JoystickButton logitechbutton11 = new JoystickButton(logitech, 11);
  JoystickButton logitechbutton12 = new JoystickButton(logitech, 12);

public OI(){
  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());


  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
  logitechbutton1.whenReleased(new GripperLockCommand());
  logitechbutton2.whenReleased(new RotatorCommand());
  }
}
