package CountrySimulator.Tools.Law.PoliticalSystems;

/**
 * Datatype that holds actual political system of the country.
 * @since 0.0.3
 * @version 0.0.2
 */

public interface PoliticalSystem{
    default void type(){
        System.out.println("Actual political system is " + this.getClass().getSimpleName());
    }
}
