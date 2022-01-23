package CountrySimulator.Tools;

import CountrySimulator.Exceptions.ValueException;

/**
 * Class that holds Statistics of the country.
 * Statistics:
 * <ol>
 *     <li>Employment Rate</li>
 *     <li>Inflation Rate</li>
 *     <li>Religion Rate</li>
 *     <li>Death Rate</li>
 *     <li>Birth Rate</li>
 * </ol>
 * @since 0.0.1
 * @author Mateusz Targoński
 * @see Builder
 */
public class Stats{
    private float employmentRate;
    private float inflationRate;
    private float religionRate;
    private float deathRate;
    private float birthRate;

    /**
     * Returns percentage value of wanted rate.
     * @param rate to display.
     * @return float
     * @since 0.0.2
     */
    public float getRate(Rate rate){
        return switch (rate){
            case RELIGION -> religionRate;
            case INFLATION -> inflationRate;
            case EMPLOYMENT -> employmentRate;
            case UNEMPLOYMENT -> 100f - employmentRate;
            case BIRTH -> birthRate;
            case DEATH -> deathRate;
        };
    }

    /**
     * @param rate to change.
     * @param value to set rate on.
     * @throws ValueException Value could be too low or too high.
     * @since 0.0.2
     * @see Rate
     */
    public void setRate(Rate rate, float value){
        if(value < 0 && rate != Rate.INFLATION)
            throw new ValueException(ValueException.Type.LOW);
        if(value > 100f && rate != Rate.BIRTH && rate != Rate.INFLATION)
            throw new ValueException(ValueException.Type.HIGH);
        switch (rate){
            case RELIGION -> religionRate = value;
            case UNEMPLOYMENT -> employmentRate = 100f - value;
            case INFLATION -> inflationRate = value;
            case EMPLOYMENT -> employmentRate = value;
            case DEATH -> deathRate = value;
            case BIRTH -> birthRate = value;
        }
    }

    /**
     * Available rates:
     * <ul>
     *     <li>RELIGION</li>
     *     <li>EMPLOYMENT</li>
     *     <li>INFLATION</li>
     *     <li>UNEMPLOYMENT</li>
     *     <li>BIRTH</li>
     *     <li>DEATH</li>
     * </ul>
     * @since 0.0.2
     */
    public enum Rate{
        RELIGION, EMPLOYMENT, INFLATION,
        UNEMPLOYMENT, BIRTH, DEATH
    }

    /**
     * Stats Builder can be used to easily create new Stats object.
     * @since 0.0.2
     * @author Mateusz Targoński
     */
    public static class Builder{
        Stats stats = new Stats();
        /**
         * @param employmentRate percentage value between 0 and 100.
         * @return Builder
         * @throws ValueException Value could be too low or too high.
         * @since 0.0.2
         */
        public Builder employmentRate(float employmentRate) throws ValueException{
            stats.setRate(Rate.EMPLOYMENT, employmentRate);
            return this;
        }

        /**
         * @param birthRate percentage value no lower than 0.
         * @return Builder
         * @throws ValueException Value could be too low or too high.
         * @since 0.0.2
         */
        public Builder birthRate(float birthRate) throws ValueException{
            stats.setRate(Rate.BIRTH, birthRate);
            return this;
        }

        /**
         * @param deathRate percentage value between 0 and 100.
         * @return Builder
         * @throws ValueException Value could be too low or too high.
         * @since 0.0.2
         */
        public Builder deathRate(float deathRate) throws ValueException{
            stats.setRate(Rate.DEATH, deathRate);
            return this;
        }

        /**
         * @param inflationRate percentage value.
         * @return Builder
         * @throws ValueException Value could be too low or too high.
         */
        public Builder inflationRate(float inflationRate) throws ValueException{
            stats.setRate(Rate.INFLATION, inflationRate);
            return this;
        }

        /**
         * @param religionRate percentage value between 0 and 100.
         * @return Builder
         * @throws ValueException Value could be too low or too high.
         */
        public Builder religionRate(float religionRate) throws ValueException{
            stats.setRate(Rate.RELIGION, religionRate);
            return this;
        }

        /**
         * Returns new Stats object.
         * @return Stats
         */
        public Stats build(){
            return stats;
        }
    }
}
