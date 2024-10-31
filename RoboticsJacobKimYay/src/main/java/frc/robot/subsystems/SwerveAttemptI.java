// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveAttemptI extends SubsystemBase {
  double degree;
  /** Creates a new SwerveAttemptI. */
  public SwerveAttemptI() {

  }
  public double joystickDegree(Joystick stick){
    stick.getDirectionRadians();
    return degree;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
