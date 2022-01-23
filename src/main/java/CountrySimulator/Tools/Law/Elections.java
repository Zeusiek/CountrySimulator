package CountrySimulator.Tools.Law;

/**
 * Election class regulates rules of the country elections.
 * @since 0.0.2
 * @version 0.5
 * @author Mateusz Targoński
 */
public class Elections{
    private boolean isPresent = true;
    private int rate = 0;

    /**
     * Sets existence of the elections.
     * @param present Boolean value of election existence.
     * @since 0.0.2
     * @see #isPresent()
     */
    public void setPresent(boolean present){
        isPresent = present;
    }

    /**
     * Returns boolean value of election existence.
     * @return boolean
     * @since 0.0.2
     * @see #setPresent(boolean)
     */
    public boolean isPresent(){
        return isPresent;
    }

    /**
     * Sets years between elections.
     * @see #getRate()
     * @param years Years between elections.
     * @since 0.0.2
     */
    public void setRate(int years){
        this.rate = years;
    }

    /**
     * Returns years between elections.
     * @see #setRate(int)
     * @return int
     * @since 0.0.2
     */
    public int getRate(){
        return rate;
    }
}
