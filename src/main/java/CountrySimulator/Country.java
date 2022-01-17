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
 */
public class Country{
    private Currency currency;
    private PoliticalStats politicalStats;
    private Stats stats;
    private Population population;
    private Elections elections;
    private boolean atWar = false;


    /**
     * Returns population of the country.
     * @return Population.
     */
    public Population getPopulation(){
        return population;
    }
    public Currency getCurrency(){
        return currency;
    }
    public PoliticalStats getPoliticalStats(){
        return politicalStats;
    }
    public Elections getElections(){
        return elections;
    }
    public Stats getStats(){
        return stats;
    }
    public boolean isAtWar(){
        return atWar;
    }
}
