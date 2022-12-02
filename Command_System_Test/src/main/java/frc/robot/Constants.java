// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int flMotorCANID = 19;
    public static final int frMotorCANID = 3;
    public static final int blMotorCANID = 16;
    public static final int brMotorCANID = 5;

    public static final boolean flMotorIsInverted = false;
    public static final boolean frMotorIsInverted = false;
    public static final boolean blMotorIsInverted = false;
    public static final boolean brMotorIsInverted = false;

    public static final int joystickNum = 0;
}
