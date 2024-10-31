// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase {
  PneumaticHub hub;
  DoubleSolenoid solenoid;
  private final CANSparkMax neo;
  /** Creates a new PneumaticsSubsystem. */
  public PneumaticsSubsystem() {
    neo = new CANSparkMax(20,MotorType.kBrushless);
    //Where the solenoid is connect to
    //Makes the solenoid (first one is the one that makes the climb go up, the second is what makes that climb go down.)
    //solenoid = PneumaticHub.makeDoubleSolenoid(1,2);
  }
  public void togglePneumatics(){
    //solenoid.toggle();
  }
  public void moveMotors(double value){
    neo.set(value);
  }
  public void stopMotors(){
    neo.stopMotor();
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
