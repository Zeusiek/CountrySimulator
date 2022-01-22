package CountrySimulator.Tools;

import CountrySimulator.Exceptions.ValueException;

/**
 * Holds information about Population of the country.
 * @author Mateusz Targoński
 * @since 0.0.2
 * @version 0.4
 */
public class Population{
    private long population;
    public Population(long population) throws ValueException{
        if(population < 0)
            throw new ValueException(ValueException.Type.LOW);
        this.population = population;
    }

    public void setPopulation(long value) throws ValueException{
        if(value < 0) throw new ValueException(ValueException.Type.LOW);
        this.population = value;
    }
    public long getPopulation(){
        return population;
    }
}
