package CountrySimulator;

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
 * @version 0.5
 * @see Currency
 * @see PoliticalStats
 * @see Stats
 * @see Population
 * @see Elections
 */
public class Country{
    private Currency currency;
    private PoliticalStats politicalStats;
    private Stats stats;
    private Population population;
    private Elections elections;
    private boolean atWar = false;




    public static class Builder{
        private final Country country = new Country();
        public void setCurrency(Currency currency){
            country.currency = currency;
        }

        public void setPopulation(Population population){
            country.population = population;
        }

        public void setAtWar(boolean atWar){
            country.atWar = atWar;
        }

        public void setPoliticalStats(PoliticalStats politicalStats){
            country.politicalStats = politicalStats;
        }

        public void setElections(Elections elections){
            country.elections = elections;
        }

        public void setStats(Stats stats){
            country.stats = stats;
        }

        public Country build(){
            return country;
        }
    }
    /**
     * @since 0.0.2
     * @return Population.
     */
    public Population getPopulation(){
        return population;
    }
    /**
     * @since 0.0.2
     * @return Currency.
     */
    public Currency getCurrency(){
        return currency;
    }
    /**
     * @since 0.0.2
     * @return PoliticalStats.
     */
    public PoliticalStats getPoliticalStats(){
        return politicalStats;
    }
    /**
     * @since 0.0.2
     * @return Elections.
     */
    public Elections getElections(){
        return elections;
    }
    /**
     * @since 0.0.2
     * @return Stats.
     */
    public Stats getStats(){
        return stats;
    }
    /**
     * @since 0.0.2
     * @return boolean.
     */
    public boolean isAtWar(){
        return atWar;
    }

    /**
     * Sets currency
     * @since 0.0.4
     * @param currency
     */
    public void setCurrency(Currency currency){
        this.currency = currency;
    }
    /**
     * Sets currency
     * @since 0.0.4
     * @param population
     */
    public void setPopulation(Population population){
        this.population = population;
    }
    /**
     * Sets currency
     * @since 0.0.4
     * @param atWar
     */
    public void setAtWar(boolean atWar){
        this.atWar = atWar;
    }
    /**
     * Sets PoliticalStats
     * @since 0.0.4
     * @param politicalStats PoliticalStats to set on.
     */
    public void setPoliticalStats(PoliticalStats politicalStats){
        this.politicalStats = politicalStats;
    }
    /**
     * Sets Elections
     * @since 0.0.4
     * @param elections Elections to set on.
     */
    public void setElections(Elections elections){
        this.elections = elections;
    }
    /**
     * Sets Stats
     * @since 0.0.4
     * @param stats Stats to set on.
     */
    public void setStats(Stats stats){
        this.stats = stats;
    }
}
