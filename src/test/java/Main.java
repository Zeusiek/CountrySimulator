import CountrySimulator.Annotations.Experimental;
import CountrySimulator.Country;
import CountrySimulator.Exceptions.ValueException;
import CountrySimulator.Tools.Happiness;
import CountrySimulator.Tools.Law.PoliticalSystems.PoliticalSystem;
import CountrySimulator.Tools.Money.Currency;
import CountrySimulator.Tools.PoliticalStats;


@Experimental
public class Main{
    public static void main(String[] args) throws ValueException{

        Happiness happiness = new Happiness();
        happiness.change(Happiness.Field.ADULTS, 2);
        Country country = new Country.Builder().setAtWar(false).build();

        System.out.println(country.getPopulation());
        country.setAtWar(true);
        PoliticalStats politicalStats = new PoliticalStats();
        PoliticalSystem system;
        Currency currency = new Currency("PLN");

        PoliticalSystem[] systems = new PoliticalSystem[20];

    }
}
