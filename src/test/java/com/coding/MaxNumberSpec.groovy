package com.coding

import com.coding.businesslogic.MaxNumber
import spock.lang.Specification

class MaxNumberSpec extends Specification {
    MaxNumber maxNumber = new MaxNumber()

    def "test - max - valid"(){
        given:
        int numberOne = 12
        int numberTwo = 15

        when:
        int maxNumber = maxNumber.max(numberOne, numberTwo)

        then:
        0 * _

        and:
        maxNumber == 15

    }
}
