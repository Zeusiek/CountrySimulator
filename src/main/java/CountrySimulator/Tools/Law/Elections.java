package CountrySimulator.Tools.Law;

/**
 * Election class regulates rules of the country elections.
 * @since 0.0.2
 * @author Mateusz Targoński
 */
public class Elections{
    private boolean isPresent = true;
    private int rate = 0;

    /**
     * Sets existence of the elections.
     * @param present Boolean value of election existence.
     * @since 0.0.2
     * @author Mateusz Targoński
     */
    public void setPresent(boolean present){
        isPresent = present;
    }

    /**
     * @return Boolean value of election existence.
     * @since 0.0.2
     */
    public boolean isPresent(){
        return isPresent;
    }

    /**
     * @param years Years between elections.
     * @since 0.0.2
     */
    public void setRate(int years){
        this.rate = years;
    }

    /**
     * @return Years between elections.
     * @since 0.0.2
     */
    public int getRate(){
        return rate;
    }
}
