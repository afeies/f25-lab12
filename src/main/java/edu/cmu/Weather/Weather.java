package edu.cmu.Weather;

public class Weather {
    private WeatherService weatherService;
    private LengthScale scale;

    public enum LengthScale {
        INCHES,
        MILLIMETERS
    }

    /**
     * Sets the length scale for rainfall.
     *
     * @param scale the desired length scale, either INCHES or MILLIMETERS
     */
    public void setLengthScale(LengthScale scale) {
        this.scale = scale;
    }

    /**
     * Retrieves the rainfall in the preferred scale.
     * The underlying WeatherService reports rainfall in millimeters.
     * 
     * @return the rainfall amount. If inches are preferred, converts millimeters to inches.
     * Otherwise returns the millimeter value as-is.
     */
    public double getRainfall() {
        double wsRainfall = weatherService.getRainfall();
        if (scale == LengthScale.INCHES) {
            return wsRainfall / 25.4;
        } else {
            return wsRainfall;
        }
    }
}
