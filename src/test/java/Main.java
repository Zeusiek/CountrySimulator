import CountrySimulator.Annotations.Experimental;
import CountrySimulator.Country;
import CountrySimulator.Exceptions.ValueException;
import CountrySimulator.Tools.Happiness;
import CountrySimulator.Tools.Law.PoliticalSystems.Monarchy;
import CountrySimulator.Tools.Law.PoliticalSystems.PoliticalSystem;
import CountrySimulator.Tools.Money.Currency;
import CountrySimulator.Tools.PoliticalStats;


@Experimental
public class Main{
    public static void main(String[] args) throws ValueException{

        Happiness happiness = new Happiness();
        happiness.change(Happiness.Field.ADULTS, 2);
        Country country = new Country();
        country.getPopulation();
        PoliticalStats politicalStats = new PoliticalStats();
        PoliticalSystem system;
        Currency currency = new Currency("PLN");
        currency.value();
        PoliticalSystem[] systems = new PoliticalSystem[20];
        PoliticalSystem s = Monarchy.ABSOLUTE_MONARCHY;
        s.type();
    }
}
