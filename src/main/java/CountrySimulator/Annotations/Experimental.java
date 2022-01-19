package CountrySimulator.Annotations;

import jdk.jfr.Description;

import java.lang.annotation.*;

/**
 * This feature is EXPERIMENTAL!
 * Use with caution!
 */
@Documented
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE, ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
@Description("This feature is EXPERIMENTAL! Use with caution!")

public @interface Experimental{

}
