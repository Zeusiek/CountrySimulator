package CountrySimulator.Exceptions;

/**
 * ValueException is an Exception that controls input values.
 * @since 0.0.1
 * @author Mateusz Targoński
 */
public class ValueException extends Exception{
    public ValueException(Type t){
        super(t.toString());
    }

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
