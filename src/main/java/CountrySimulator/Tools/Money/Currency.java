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
    private float priceRelativeToGold = 1.0f;

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
     * Returns name of the currency.
     * @return String
     * @since 0.0.2
     */
    public String getName(){
        return name;
    }

    /**
     * Returns value of the currency relative to a gold price.
     * @return float
     * @since 0.0.6
     */
    public float getPriceRelativeToGold(){
        return priceRelativeToGold;
    }

    /**
     * Sets value of the currency relative to a gold price.
     * @param priceRelativeToGold float
     * @since 0.0.6
     */
    public void setPriceRelativeToGold(float priceRelativeToGold){
        this.priceRelativeToGold = priceRelativeToGold;
    }
}
