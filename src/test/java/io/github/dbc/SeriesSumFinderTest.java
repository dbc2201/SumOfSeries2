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
            "0,1.0",
            "1,1.5",
            "2,1.75",
            "3,1.875",
            "4,1.9375",
            "5,1.96875"
    })
    void calculateSumOfSeries(double number, double expectedSum) {
        double sum = seriesSumFinder.calculateSumOfSeries(number);
        Assertions.assertEquals(
                expectedSum,
                sum,
                0.01,
                "The sum of the series is not correct!"
        );
    }
}