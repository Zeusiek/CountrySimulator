package CountrySimulator.Tools.Money;

public class Currency{
    private String name;
    private long totalValue;

    Currency(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setTotalValue(long totalValue){
        this.totalValue = totalValue;
    }

    public String getName(){
        return name;
    }
    public long value(){
        return totalValue;
    }
}
