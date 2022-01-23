package CountrySimulator;

import CountrySimulator.Exceptions.ValueException;
import CountrySimulator.Tools.Law.Elections;
import CountrySimulator.Tools.Money.Currency;
import CountrySimulator.Tools.PoliticalStats;
import CountrySimulator.Tools.Population;
import CountrySimulator.Tools.Stats;

/**
 * Main class that holds all the information about the country.
 * Fields:
 * <ol>
 *     <li>Currency</li>
 *     <li>Statistics</li>
 *     <li>Political Statistics</li>
 *     <li>Population</li>
 *     <li>Elections</li>
 *     <li>At War</li>
 * </ol>
 * @since 0.0.1
 * @author Mateusz Targoński
 * @version 0.5.5
 * @see Currency
 * @see PoliticalStats
 * @see Stats
 * @see Population
 * @see Elections
 */
public class Country{
    /**
     * Field that hold Currency information of the country.
     * @see #getCurrency()
     * @see #setCurrency(Currency)
     */
    private Currency currency;
    /**
     * Field that hold PoliticalStats of the country.
     * @see #getPoliticalStats()
     * @see #setPoliticalStats(PoliticalStats)
     */
    private PoliticalStats politicalStats;
    /**
     * Field that hold Stats of the country.
     * @see #getStats()
     * @see #setStats(Stats)
     */
    private Stats stats;
    /**
     * Field that hold Population information of the country.
     * @see #getPopulation()
     * @see #setPopulation(Population)
     */
    private Population population;
    /**
     * Field that hold Elections information of the country.
     * @see #getElections()
     * @see #setElections(Elections)
     */
    private Elections elections;
    /**
     * Field that hold atWar information of the country.
     * @see #isAtWar()
     * @see #setAtWar(boolean)
     */
    private boolean atWar = false;


    public static class Builder{
        private final Country country = new Country();
        public Builder(){
            setCurrency(new Currency(""));
            setAtWar(false);
            setElections(new Elections());
            setStats(new Stats());
            setPoliticalStats(new PoliticalStats());
            setPopulation(new Population(0));
        }
        public Builder setCurrency(Currency currency){
            country.currency = currency;
            return this;
        }

        public Builder setPopulation(Population population){
            country.population = population;
            return this;
        }

        public Builder setAtWar(boolean atWar){
            country.atWar = atWar;
            return this;
        }

        public Builder setPoliticalStats(PoliticalStats politicalStats){
            country.politicalStats = politicalStats;
            return this;
        }

        public Builder setElections(Elections elections){
            country.elections = elections;
            return this;
        }

        public Builder setStats(Stats stats){
            country.stats = stats;
            return this;
        }

        public Country build(){
            return country;
        }
    }
    /**
     * @see #population
     * @see #setPopulation(Population)
     * @since 0.0.2
     * @return Population
     */
    public Population getPopulation(){
        return population;
    }
    /**
     * @since 0.0.2
     * @see #currency
     * @see #setCurrency(Currency)
     * @return Currency
     */
    public Currency getCurrency(){
        return currency;
    }
    /**
     * @since 0.0.2
     * @see #politicalStats
     * @see #getPoliticalStats()
     * @return PoliticalStats
     */
    public PoliticalStats getPoliticalStats(){
        return politicalStats;
    }
    /**
     * @since 0.0.2
     * @see #elections
     * @see #setElections(Elections)
     * @return Elections
     */
    public Elections getElections(){
        return elections;
    }
    /**
     * @since 0.0.2
     * @see #stats
     * @see #getStats()
     * @return Stats
     */
    public Stats getStats(){
        return stats;
    }
    /**
     * @since 0.0.2
     * @see #atWar
     * @see #setAtWar(boolean)
     * @return boolean
     */
    public boolean isAtWar(){
        return atWar;
    }

    /**
     * Sets Currency
     * @see #currency
     * @see #getCurrency()
     * @since 0.0.4
     * @param currency Object to set Currency on.
     */
    public void setCurrency(Currency currency){
        this.currency = currency;
    }
    /**
     * Sets Population
     * @see #population
     * @see #getPopulation()
     * @since 0.0.4
     * @param population Object to set Population on.
     */
    public void setPopulation(Population population){
        this.population = population;
    }
    /**
     * Sets atWar field {@link #atWar} on.
     * @see #population
     * @see #isAtWar()
     * @since 0.0.4
     * @param atWar boolean value to set atWar field on.
     */
    public void setAtWar(boolean atWar){
        this.atWar = atWar;
    }
    /**
     * Sets PoliticalStats
     * @see #politicalStats
     * @see #getPoliticalStats()
     * @since 0.0.4
     * @param politicalStats Object to set PoliticalStats on.
     */
    public void setPoliticalStats(PoliticalStats politicalStats){
        this.politicalStats = politicalStats;
    }
    /**
     * Sets Elections
     * @see #elections
     * @see #getElections()
     * @since 0.0.4
     * @param elections Object to set Elections on.
     */
    public void setElections(Elections elections){
        this.elections = elections;
    }
    /**
     * Sets Stats
     * @see #stats
     * @see #getStats()
     * @since 0.0.4
     * @param stats Object to set Stats on.
     */
    public void setStats(Stats stats){
        this.stats = stats;
    }
}
