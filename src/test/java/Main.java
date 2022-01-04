import CountrySimulator.Country;
import CountrySimulator.Exceptions.ValueException;
import CountrySimulator.Tools.Happiness;
import CountrySimulator.Tools.Law.Elections;

public class Main{
    public static void main(String[] args) throws ValueException{
        Country country = new Country();
        Elections elections = new Elections();
        Happiness happiness = new Happiness();
        happiness.change(Happiness.Field.ADULTS, 2);
    }
}
