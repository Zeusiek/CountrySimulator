package CountrySimulator.Tools;

import CountrySimulator.Exceptions.ValueException;
import CountrySimulator.Tools.Law.PoliticalSystem;

/**
 * Class that holds Political Statistics of the country.
 * Statistics:
 * <ol>
 *     <li>Conservatism</li>
 *     <li>Liberalism</li>
 *     <li>Socialism</li>
 *     <li>Capitalism</li>
 * </ol>
 * @since 0.0.1
 * @author Mateusz Targoński
 */
public class PoliticalStats{
    private float conservatism;
    private float liberalism;
    private float socialism;
    private float capitalism;
    private PoliticalSystem system;

    public PoliticalStats(){}

    public PoliticalStats(PoliticalStats politicalStats){
        conservatism = politicalStats.getConservatism();
        liberalism = politicalStats.getLiberalism();
        socialism = politicalStats.getSocialism();
        capitalism = politicalStats.getCapitalism();
        system = politicalStats.getSystem();
    }

    public void setStats(Stats s, float value) throws ValueException{
        if(value>100f) throw new ValueException(ValueException.Type.HIGH);
        else if(value < 0f) throw new ValueException(ValueException.Type.HIGH);
        switch (s){
            case SOCIALISM -> this.socialism = value;
            case CAPITALISM -> this.capitalism = value;
            case LIBERALISM -> this.liberalism = value;
            case CONSERVATISM -> this.conservatism = value;
        }
        checkStats(s);
    }

    private void checkStats(Stats s){
        switch (s){
            case CONSERVATISM -> liberalism = 100f-conservatism;
            case CAPITALISM -> socialism = 100f-capitalism;
            case LIBERALISM -> conservatism = 100f-liberalism;
            case SOCIALISM -> capitalism = 100f-socialism;
        }
    }

    /**
     * @since 0.0.2
     * @return Capitalism rate

     */
    public float getCapitalism(){
        return capitalism;
    }

    /**
     * @since 0.0.2
     * @return Conservatism rate
     */
    public float getConservatism(){
        return conservatism;
    }

    /**
     * @since 0.0.2
     * @return Liberalism rate
     */
    public float getLiberalism(){
        return liberalism;
    }

    /**
     * @since 0.0.2
     * @return Socialism rate
     */
    public float getSocialism(){
        return socialism;
    }

    /**
     * @since 0.0.2
     * @return PoliticalSystem
     */
    public PoliticalSystem getSystem(){
        return system;
    }

    /**
     * @since 0.0.2
     * @param system Political system.
     */
    public void setSystem(PoliticalSystem system){
        this.system = system;
    }

    public enum Stats{
        CONSERVATISM,
        CAPITALISM,
        SOCIALISM,
        LIBERALISM
    }




}
