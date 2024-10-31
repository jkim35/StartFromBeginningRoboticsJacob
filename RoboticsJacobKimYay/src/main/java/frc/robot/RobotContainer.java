// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ClimbCommand;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.PneumaticsCommand;
import frc.robot.commands.ReverseMotors;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.PneumaticsSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  Joystick stick;
  PneumaticsSubsystem m_pneumaticSubsystem;
  PneumaticsCommand m_pneumaticCommand;
  ClimbCommand m_climbCommand;
  ReverseMotors m_reverseMotors;
<<<<<<< HEAD
  JoystickButton pneumaticButton;
  JoystickButton motorButton;
  JoystickButton reverseButton;
  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

=======
       JoystickButton pneumaticButton;
       JoystickButton  motorButton;
       JoystickButton reverseButton;
  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);
>>>>>>> 1dee400e941f6a8dc4997d45f9d2d321abf81db3
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    stick = new Joystick(0);
  pneumaticButton = new JoystickButton(stick,1);
    motorButton = new JoystickButton(stick,2);
    reverseButton = new JoystickButton(stick,0);
    m_pneumaticSubsystem = new PneumaticsSubsystem();
<<<<<<< HEAD
    m_climbCommand = new ClimbCommand();
    m_reverseMotors = new ReverseMotors();
    pneumaticButton = new JoystickButton(stick,0);
    motorButton = new JoystickButton(stick,1);
    reverseButton = new JoystickButton(stick,2);
=======
    m_pneumaticCommand = new PneumaticsCommand(m_pneumaticSubsystem);
    m_climbCommand = new ClimbCommand(m_pneumaticSubsystem);
    m_reverseMotors = new ReverseMotors(m_pneumaticSubsystem);
>>>>>>> 1dee400e941f6a8dc4997d45f9d2d321abf81db3
    // Configure the trigger bindings

    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    new Trigger(m_exampleSubsystem::exampleCondition)
        .onTrue(new ExampleCommand(m_exampleSubsystem));
<<<<<<< HEAD
    pneumaticButton.whileTrue(m_pneumaticCommand);
    motorButton.whileTrue(m_climbCommand);
    reverseButton.whileTrue(m_reverseMotors);
=======
        pneumaticButton.whileTrue(m_pneumaticCommand);
        motorButton.whileTrue(m_climbCommand);
        reverseButton.whileTrue(m_reverseMotors);
>>>>>>> 1dee400e941f6a8dc4997d45f9d2d321abf81db3

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return Autos.exampleAuto(m_exampleSubsystem);
  }
}
