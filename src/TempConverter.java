
/*
* Write the functions as described below.
*
*/

public class TempConverter {
 
    /**
    * @param t input temp in Celsius, e.g.: 20.3
    * @return   the value of temperature in Fahrenheit
    *
    * Hint : Use the following formula (caveat emptor) for conversion: 
    *  TempInF =    TempInC * 9/5 + 32;
    */
    
    public double C2F( double t)
    {
        return ((t * 9)/5 + 32);
    }

    /**
    * @param t input temp in F, e.g.: 97.3
    * @return   the value of temperature in Celsius
    * 
    */

    public double F2C( double t)
    {
        return (((t - 32) * 5)/9);
    }
    
    /**
    * @param t input temp in Celsius, e.g.: 20.3
    * @return   the value of temperature in Kelvin
    *
    * Kelvin formula: http://lmgtfy.com/?q=how+to+convert+celsius+to+kelvin 
    */
    public double C2K( double t)
    {
        return t + 273.15;
    }

    
}
