package CountrySimulator.Tools;

import CountrySimulator.Exceptions.ValueException;


/**
 * Happiness class shows happiness of different social classes.
 * @author Mateusz Targoński
 * @since 0.0.1
 * @see Field
 * @version 1.0
 */
public class Happiness{

    private float drivers;
    private float religion;
    private float parents;
    private float scientists;
    private float teachers;
    private float medicine;
    private float workers;
    private float employers;
    private float lgbt;

    private float children;
    private float teenagers;
    private float youngAdults;
    private float adults;
    private float old;


    /**
     * Sets field to given value.
     * @param field Field to change.
     * @param value Value to set field on.
     * @throws ValueException Value could be too low or too high.
     * @since 0.0.2
     */
    public void change(Field field, float value){
        if(value > 100f) throw new ValueException(ValueException.Type.HIGH);
        else if(value < -100f) throw new ValueException(ValueException.Type.LOW);
        switch (field){
            case OLD -> old = value;
            case LGBT -> lgbt = value;
            case ADULTS -> adults = value;
            case DRIVERS -> drivers = value;
            case PARENTS -> parents = value;
            case WORKERS -> workers = value;
            case CHILDREN -> children = value;
            case MEDICINE -> medicine = value;
            case RELIGION -> religion = value;
            case TEACHERS -> teachers = value;
            case EMPLOYERS -> employers = value;
            case TEENAGERS -> teenagers = value;
            case SCIENTISTS -> scientists = value;
            case YOUNG_ADULTS -> youngAdults = value;
        }
    }

    /**
     * Returns happiness value of given field.
     * @param field Wanted field.
     * @return Percentage of happiness.
     * @since 0.0.2
     */
    public float get(Field field){
        return switch (field){
            case OLD -> old;
            case LGBT -> lgbt;
            case ADULTS -> adults;
            case DRIVERS -> drivers;
            case PARENTS -> parents;
            case WORKERS -> workers;
            case CHILDREN -> children;
            case MEDICINE -> medicine;
            case RELIGION -> religion;
            case TEACHERS -> teachers;
            case EMPLOYERS -> employers;
            case TEENAGERS -> teenagers;
            case SCIENTISTS -> scientists;
            case YOUNG_ADULTS -> youngAdults;
        };
    }

    /**
     * List of fields.
     * Options:
     *     <li>DRIVERS</li>
     *     <li>RELIGION</li>
     *     <li>PARENTS</li>
     *     <li>SCIENTISTS</li>
     *     <li>TEACHERS</li>
     *     <li>MEDICINE</li>
     *     <li>WORKERS</li>
     *     <li>EMPLOYERS</li>
     *     <li>LGBT</li>
     *     <li>CHILDREN</li>
     *     <li>TEENAGERS</li>
     *     <li>YOUNG_ADULTS</li>
     *     <li>ADULTS</li>
     *     <li>OLD</li>
     * </ul>
     * @since 0.0.2
     * @author Mateusz Targoński
     * @version 1.0
     */
    public enum Field{
        DRIVERS, RELIGION, PARENTS,
        SCIENTISTS, TEACHERS, MEDICINE,
        WORKERS, EMPLOYERS, LGBT,
        CHILDREN, TEENAGERS, YOUNG_ADULTS,
        ADULTS, OLD
    }

}
