package com.coding.businesslogic.impl

import spock.lang.Specification

class FizzBuzzPrinterSpec extends Specification {
    FizzBuzzPrinterImpl fizzBuzzPrinter = new FizzBuzzPrinterImpl()

    def "test - generate - fizz buzz Numbers till 5"() {
        given:
        int max = 5

        when:
        fizzBuzzPrinter.printFizzBuzzNumber(max)

        then:
        0 * _

    }

    def "test - getFizzBuzzNumber - fizz"() {
        given:
        int input = 3

        when:
        String result = fizzBuzzPrinter.getFizzBuzzNumber(input)

        then:
        0 * _

        and:
        result
        result == "Fizz"
    }


    def "test - getFizzBuzzNumber - Buzz"() {
        given:
        int input = 5

        when:
        String result = fizzBuzzPrinter.getFizzBuzzNumber(input)

        then:
        0 * _

        and:
        result
        result == "Buzz"
    }

    def "test - getFizzBuzzNumber - FizzBuzz"() {
        given:
        int input = 15

        when:
        String result = fizzBuzzPrinter.getFizzBuzzNumber(input)

        then:
        0 * _

        and:
        result
        result == "FizzBuzz"
    }

}
