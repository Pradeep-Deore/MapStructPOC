
package org.cts.example.mapper.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.mapstruct.Qualifier;

/**
 *
 * @author Pradeep Deore
 * @Date 12/9/2016 
 * 
 * RoundingUtil is a custom converter class which does some manipulation to the data such as 
 * formating data or trimming it based on requirement. This class just show Case the 
 * example to implement custom converter in mapStruct.
 * 
 */
public class RoundingUtil {


    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Fraction2 { }

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public static @interface Fraction3 { }


    @Fraction2
    public BigDecimal fraction2( BigDecimal in ) {

        return in == null ? null : in.setScale( 2, RoundingMode.DOWN );
    }

    @Fraction3
    public BigDecimal fraction3( BigDecimal in ) {

        return in == null ? null : in.setScale( 3, RoundingMode.DOWN );
    }

}
