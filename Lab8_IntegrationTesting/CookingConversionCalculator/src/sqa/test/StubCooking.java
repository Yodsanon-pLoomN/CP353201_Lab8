// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;
import sqa.main.CookingConversionCalculator;

public class StubCooking extends CookingConversionCalculator {
    @Override
    public double convert(double value, String choice, String fromUnit, String toUnit) {
        if (choice.equalsIgnoreCase("temperature") && fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius") && value == 41)
            return 5.0;     // 41 F → 5 C
        if (fromUnit.equalsIgnoreCase("teaspoon") && toUnit.equalsIgnoreCase("ml") && value == 10)
            return 50.0;    // 10 teaspoon → 50 ml
        if (fromUnit.equalsIgnoreCase("celsius") && toUnit.equalsIgnoreCase("fahrenheit") && value == 10)
            return 42.0;    // 10 C → 42 F
        if (fromUnit.equalsIgnoreCase("pint") && toUnit.equalsIgnoreCase("ml") && value == 13)
            return 6151.288; // 13 pint → ml
        return 0.0;
    }
}
