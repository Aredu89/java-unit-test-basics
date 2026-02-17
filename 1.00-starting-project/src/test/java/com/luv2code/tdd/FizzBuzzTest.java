package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {
    // IF a num is divisible by 3, return "Fizz"
    // IF a num is divisible by 5, return "Buzz"
    // IF a num is divisible by 3 and 5, return "FizzBuzz"
    // ELSE return the number

    @Test
    @DisplayName("Divisible by 3 should return Fizz")
    @Order(1)
    void testForDivisibleBy3() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Then
        assertEquals("Fizz", fizzBuzz.evaluate(3), "Divisible by 3 should return Fizz");
    }

    @Test
    @DisplayName("Divisible by 5 should return Buzz")
    @Order(2)
    void testForDivisibleBy5() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Then
        assertEquals("Buzz", fizzBuzz.evaluate(5), "Divisible by 5 should return Buzz");
    }

    @Test
    @DisplayName("Divisible by 3 and 5 should return FizzBuzz")
    @Order(3)
    void testForDivisibleBy3And5() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15), "Divisible by 3 and 5 should return FizzBuzz");
    }

    @Test
    @DisplayName("Not divisible by 3 or 5 should return the number")
    @Order(4)
    void testForNotDivisibleBy3Or5() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Then
        assertEquals("7", fizzBuzz.evaluate(7), "Not divisible by 3 or 5 should return the number");
    }
}
