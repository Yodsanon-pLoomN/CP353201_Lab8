// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;
import sqa.main.TemperatureConverter;

public class StubTemperature extends TemperatureConverter {

    @Override
    public double convert(double tempValue, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius") && tempValue == 50)
            return 10.0; // 50°F → 10°C

        if (fromUnit.equalsIgnoreCase("celsius") && toUnit.equalsIgnoreCase("fahrenheit") && tempValue == 60)
            return 92.0;   // 60°C → 92°F (ผิดจากจริง → ทำให้ Fail)

        return 0.0;
    }
}
