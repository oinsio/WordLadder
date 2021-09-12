package cto.fantask

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
            def outputLength= 0
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
            def outputLength= 0
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
            def outputLength= 0
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
            def outputLength= 0
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

    def "Test Case 004"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase004.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 004')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 4
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('w')
            println('a')
            outputLength == expectedOutputLength
    }

    def "Test Case 005"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase005.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 005')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
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

    def "Test Case 006"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase006.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 006')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 4
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('y')
            println('x')
            outputLength == expectedOutputLength
    }

    def "Test Case 007"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase007.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 007')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 49
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('gggggg')
            println('gggggn')
            println('ggggnn')
            println('gggnnn')
            println('ggnnnn')
            println('gnnnnn')
            println('nnnnnn')
            outputLength == expectedOutputLength
    }

    def "Test Case 008"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase008.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 008')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 15
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('cccc')
            println('cccw')
            println('cccc')
            outputLength == expectedOutputLength
    }

    def "Test Case 009"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase009.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 009')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 10
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('cccc')
            println('cccw')
            outputLength == expectedOutputLength
    }

    def "Test Case 010"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase010.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 010')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 35
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('toon')
            println('poon')
            println('poin')
            println('poie')
            println('plie')
            println('plee')
            println('plea')
            outputLength == expectedOutputLength
    }

    def "Test Case 011"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase011.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 011')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 20
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('hit')
            println('hot')
            println('dot')
            println('dog')
            println('cog')
            outputLength == expectedOutputLength
    }

    def "Test Case 012"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase012.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 012')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 20
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('cat')
            println('hat')
            println('hot')
            println('dot')
            println('dog')
            outputLength == expectedOutputLength
    }

    def "Test Case 013"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase013.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 013')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 20
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('eaba')
            println('baba')
            println('babe')
            println('baae')
            outputLength == expectedOutputLength
    }

    def "Test Case 014"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase014.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 014')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
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

    def "Test Case 015"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase015.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 015')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 16
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('ecd')
            println('bcd')
            println('bad')
            println('bac')
            outputLength == expectedOutputLength
    }

    def "Test Case 016"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase016.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 016')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 36
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('eebea')
            println('ebbea')
            println('ebbca')
            println('edbca')
            println('edbce')
            println('cdbce')
            outputLength == expectedOutputLength
    }

    def "Test Case 017"() {
        setup:
            def inputData = new File(getClass().getResource('/TestCase017.txt').toURI())
            StringTransformationBSF.readInputData(inputData)
            println('INPUT Test Case 017')
            println(StringTransformationBSF.dictionary)
            println(StringTransformationBSF.start)
            println(StringTransformationBSF.stop)

        when:
            long now = System.currentTimeMillis()
            def output = StringTransformationBSF.wordSequence(StringTransformationBSF.start,
                StringTransformationBSF.stop, StringTransformationBSF.dictionary)
            println("Worked " + (System.currentTimeMillis() - now) + " milliseconds.")
            def outputLength= 0
            for (def word : output) {
                outputLength += word.length() + 1
            }
            println('YOUR OUTPUT ' + outputLength + ' chars')
            for (def line : output) {
                println(line)
            }

        then:
            def expectedOutputLength = 16
            println('EXPECTED OUTPUT ' + expectedOutputLength + ' chars')
            println('abd')
            println('dbd')
            println('dad')
            println('dae')
            outputLength == expectedOutputLength
    }

}
