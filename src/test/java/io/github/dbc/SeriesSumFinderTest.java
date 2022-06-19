package io.github.dbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SeriesSumFinderTest {

    private SeriesSumFinder seriesSumFinder;

    @BeforeEach
    void setUp() {
        seriesSumFinder = new SeriesSumFinder();
    }

    @ParameterizedTest(name = "calculateSumOfSeries({arguments})")
    @CsvSource(value = {
            "1,1.0",
            "2,1.5",
            "4,2.0833",
            "6,2.4499",
            "8,2.7178",
            "10,2.9289",
            "12,3.1032",
            "14,3.2515",
            "16,3.3807",
            "18,3.4951",
            "20,3.5977",
            "25,3.8159",
            "30,3.9949",
            "35,4.1467",
            "40,4.2785",
            "45,4.3949",
            "50,4.4992"
    })
    void calculateSumOfSeries(double number, double expectedSum) {
        double sum = seriesSumFinder.calculateSumOfSeries(number);
        Assertions.assertEquals(
                expectedSum,
                sum,
                0.1,
                "The sum of the series is not correct!"
        );
    }
}