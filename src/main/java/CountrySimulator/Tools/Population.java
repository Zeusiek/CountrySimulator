package CountrySimulator.Tools;

import CountrySimulator.Exceptions.ValueException;

public class Population{
    private long population;
    private final PoliticalStats politicalStats = new PoliticalStats();

    public Population(long population) throws ValueException{
        if(population < 0)
            throw new ValueException(ValueException.Type.LOW);
        this.population = population;
    }



    public PoliticalStats getPoliticalStats(){
        return politicalStats;
    }

    public void setPopulation(long value) throws ValueException{
        if(value < 0) throw new ValueException(ValueException.Type.LOW);
        this.population = value;
    }
    public long getPopulation(){
        return population;
    }
}
