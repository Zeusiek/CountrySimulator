package CountrySimulator.Tools.Law.PoliticalSystems;

/**
 * Datatype that holds actual political system of the country.
 * Classes that implements this interface:
 * <ol>
 *     <li>Republic</li>
 *     <li>Monarchy</li>
 *     <li>Oligarchy</li>
 * </ol>
 * @since 0.0.3
 * @version 0.0.3
 * @see Republic
 * @see Monarchy
 * @see Oligarchy
 */

public interface PoliticalSystem{
    default void type(){
        System.out.println("Actual political system is " + this.getClass().getSimpleName());
    }
}
