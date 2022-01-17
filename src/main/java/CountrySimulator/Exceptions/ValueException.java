package CountrySimulator.Exceptions;

/**
 * ValueException is an RuntimeException that controls input values.
 * @since 0.0.1
 * @author Mateusz Targoński
 * @version 1.0
 */
public class ValueException extends RuntimeException{
    public ValueException(Type t){
        super(t.toString());
    }

    /**
     * Stores Type of ValueException.
     * Values:
     * <ol>
     *     <li>LOW</li>
     *     <li>HIGH</li>
     *     <li>WRONG</li>
     * </ol>
     */
    public enum Type{
        LOW("Value too low!"),
        HIGH("Value too high!"),
        WRONG("Wrong value!");

        String str;
        Type(String s){
            str = s;
        }
        @Override
        public String toString(){
            return str;
        }
    }

}
