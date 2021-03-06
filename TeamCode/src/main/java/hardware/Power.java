package hardware;

/**
 * Functions and constants for working with power values.
 */
public class Power {

    public static final double NORMAL_SPEED = 0.75;
    public static final double FULL_SPEED = 1.0;
    public static final double SLOW_TURN = 0.15;
    public static final double FULL_STOP = 0.0;
    public static final double SLOW_SPEED = 0.4;

    /**
     * Curves a value with a cubic eqaution
     * Intended to be used with controller input
     *
     * @param x The value to clamp.
     * @return The clamped value.
     */
    public static double speedCurve(double x) {
        return (0.598958 * Math.pow(x, 3)) - (4.43184 * Math.pow(10, -16) * Math.pow(x, 2)) + (0.201042 * x);
    }

    /**
     * Clamps a value between -1 and 1
     *
     * @param x The value to clamp.
     * @return The clamped value.
     */
    public static double powerClamp(double x) {
        if (x > 1) {
            return 1;
        }
        if (x < -1) {
            return -1;
        }
        return x;
    }

    /**
     * Clamps a value between 0 and 1
     *
     * @param x The value to clamp.
     * @return The clamped value.
     */
    public static double positionClamp(double x) {
        if (x > 1) {
            return 1;
        }
        if (x < 0) {
            return 0;
        }
        return x;
    }

}
