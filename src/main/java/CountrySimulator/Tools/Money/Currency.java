package CountrySimulator.Tools.Money;
// FIXME: 17.01.2022 Popraw tę klasę bo w sumie total value nie ma sensu.
/**
 * Class that holds all the information about the Currency.
 * @since 0.0.2
 * @version 0.8
 * @author Mateusz Targoński
 */
public class Currency{
    private String name;
    private long totalValue;

    public Currency(String name){
        this.name = name;
    }

    /**
     * Sets name of the currency
     * @param name String
     * @since 0.0.2
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets total produced currency.
     * @param totalValue long
     * @since 0.0.2
     */
    public void setTotalValue(long totalValue){
        this.totalValue = totalValue;
    }

    /**
     * Returns name of the currency.
     * @return String
     * @since 0.0.2
     */
    public String getName(){
        return name;
    }

    /**
     * Returns value of the currency.
     * @return long
     * @since 0.0.2
     */
    @Deprecated(forRemoval = true)
    public long value(){
        return totalValue;
    }
}
