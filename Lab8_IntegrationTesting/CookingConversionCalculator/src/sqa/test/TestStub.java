// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestStub {

    // ---------------------- Top-down Integration ----------------------

    @Test
    void test01_Cooking_convert() {
        StubCooking stub = new StubCooking();
        double expectedResult = 5.0;
        assertEquals(expectedResult, stub.convert(41, "temperature", "fahrenheit", "celsius"));
    }

    @Test
    void test02_Liquid_convert() {
        StubLiquid stub = new StubLiquid();
        double expectedResult = 1000.0;
        assertEquals(expectedResult, stub.convert(4, "cup", "ml"));
    }

    @Test
    void test03_Liquid_convert_and_getFactor() {
        StubLiquid stub = new StubLiquid();
        double expectedConvert = 1000.0;
        double expectedFactor = 250.0;

        assertEquals(expectedConvert, stub.convert(4, "cup", "ml"));
        assertEquals(expectedFactor, stub.getConversionFactor("cup", "ml"));
    }

    @Test
    void test04_Liquid_getConversionFactor() {
        StubLiquid stub = new StubLiquid();
        double expectedResult = 250.0;
        assertEquals(expectedResult, stub.getConversionFactor("cup", "ml"));
    }

    @Test
    void test05_Mass_convert() {
        StubMass stub = new StubMass();
        double expectedResult = 80.0;
        assertEquals(expectedResult, stub.convert(10, "tablespoon", "gram"));
    }

    @Test
    void test06_Mass_convert_and_getFactor() {
        StubMass stub = new StubMass();
        double expectedConvert = 80.0;
        double expectedFactor = 8.0;

        assertEquals(expectedConvert, stub.convert(10, "tablespoon", "gram"));
        assertEquals(expectedFactor, stub.getConversionFactor("tablespoon", "gram"));
    }

    @Test
    void test07_Mass_getConversionFactor() {
        StubMass stub = new StubMass();
        double expectedResult = 8.0;
        assertEquals(expectedResult, stub.getConversionFactor("tablespoon", "gram"));
    }

    @Test
    void test08_Temperature_convert_50FtoC() {
        StubTemperature stub = new StubTemperature();
        double expectedResult = 10.0;
        assertEquals(expectedResult, stub.convert(50.0, "fahrenheit", "celsius"));
    }

    @Test
    void test09_Temperature_convert() {
        StubTemperature stub = new StubTemperature();
        double expectedResult = 10.0; // ตามตาราง Expected
        assertEquals(expectedResult, stub.convert(50.0, "fahrenheit", "celsius"));
        // Actual จาก stub จะไม่ตรง (เช่น -0.0) ทำให้ FAIL
    }

    // ---------------------- Bottom-up Integration ----------------------

    @Test
    void test10_Mass_kgToPound() {
        StubMass stub = new StubMass();
        double expectedResult = 110.25;
        assertEquals(expectedResult, stub.convert(50, "kilogram", "pound"));
    }

    @Test
    void test11_Liquid_pintToMl() {
        StubLiquid stub = new StubLiquid();
        double expectedResult = 946.352;
        assertEquals(expectedResult, stub.convert(2, "pint", "ml"));
    }

    @Test
    void test12_Temperature_cToF() {
        StubTemperature stub = new StubTemperature();
        double expectedResult = 140.0; // ตามตาราง Expected
        assertEquals(expectedResult, stub.convert(60, "celsius", "fahrenheit"));
        // Actual จาก stub จะได้ 92.0 → ทำให้ FAIL
    }
    @Test
    void test13_Mass_kgToKg() {
        StubMass stub = new StubMass();
        double expectedResult = 154.35;
        assertEquals(expectedResult, stub.convert(0, "kilogram", "kilogram"));
    }

    @Test
    void test14_Liquid_pintToMl_large() {
        StubLiquid stub = new StubLiquid();
        double expectedResult = 6151.288;
        assertEquals(expectedResult, stub.convert(13, "pint", "ml"));
    }

    @Test
    void test15_Cooking_teaspoonToMl() {
        StubCooking stub = new StubCooking();
        double expectedResult = 50.0;
        assertEquals(expectedResult, stub.convert(10, "liquid", "teaspoon", "ml"));
    }

    @Test
    void test16_Mass_ozToGram() {
        StubMass stub = new StubMass();
        double expectedResult = 283.49;
        assertEquals(expectedResult, stub.convert(10, "oz", "gram"));
    }

    @Test
    void test17_Temperature_cToF_withCalculator() {
        StubCooking stub = new StubCooking();
        double expectedResult = 42.0;
        assertEquals(expectedResult, stub.convert(10, "temperature", "celsius", "fahrenheit"));
    }

    @Test
    void test18_Liquid_pintToMl_withCalculator() {
        StubCooking stub = new StubCooking();
        double expectedResult = 6151.288;
        assertEquals(expectedResult, stub.convert(13, "liquid", "pint", "ml"));
    }

    @Test
    void test19_Cooking_fahrenheitToCelsius() {
        StubCooking stub = new StubCooking();
        double expectedResult = 5.0;
        assertEquals(expectedResult, stub.convert(41, "temperature", "fahrenheit", "celsius"));
    }
}
