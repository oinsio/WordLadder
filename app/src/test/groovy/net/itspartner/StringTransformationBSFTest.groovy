package net.itspartner

import spock.lang.Specification

class StringTransformationBSFTest extends Specification {

    def "Test Case 000"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase000.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 000')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0;
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 12
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('bat')
            println('hat')
            println('had')
            outputLength == expectedOutputLength
    }

    def "Test Case 001"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase001.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 001')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0;
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 12
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('baa')
            println('aaa')
            println('aab')
            outputLength == expectedOutputLength
    }

    def "Test Case 002"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase002.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 002')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0;
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 8
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('bbb')
            println('bbc')
            outputLength == expectedOutputLength
    }

    def "Test Case 003"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase003.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 003')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0;
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 3
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('-1')
            outputLength == expectedOutputLength
    }

}
