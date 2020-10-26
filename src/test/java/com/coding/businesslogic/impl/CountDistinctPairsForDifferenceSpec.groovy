package com.coding.businesslogic.impl

import spock.lang.Specification


class CountDistinctPairsForDifferenceSpec extends Specification{

    CountDistinctPairsForDifferenceImpl countDistinctPairsForDifference = new CountDistinctPairsForDifferenceImpl()

    def "test - unique pair without duplicates - valid - without any duplicates"(){
        given:
        int[] intArray = [1, 5, 3, 4, 2]
        int difference = 3

        when:
        int distinctPairs = countDistinctPairsForDifference.findDistinctPairsForDifferenceByBruteForce(intArray, difference)

        then:
        0 * _

        and:
        distinctPairs == 2
    }

    def "test - unique pair without duplicates - valid - with duplicates "(){
        given:
        int[] intArray = [1, 5, 3, 4, 2, 3, 4, 2]
        int difference = 3

        when:
        int distinctPairs = countDistinctPairsForDifference.findDistinctPairsForDifferenceByBruteForce(intArray, difference)

        then:
        0 * _

        and:
        distinctPairs == 2
    }

    def "test - unique pair without duplicates - valid "(){
        given:
        int[] intArray = [8, 12, 16, 4, 0, 20]
        int difference = 4

        when:
        int distinctPairs = countDistinctPairsForDifference.findDistinctPairsForDifferenceByBruteForce(intArray, difference)

        then:
        0 * _

        and:
        distinctPairs == 5
    }

    def "test - removeDuplicates - from an int array"(){
        given:
        int[] inputArray = [1,1,1,2,3,1,4]

        when:
        int [] distinctElementArray = countDistinctPairsForDifference.removeDuplicates(inputArray)

        then:
        distinctElementArray.size() == 4
    }
}
