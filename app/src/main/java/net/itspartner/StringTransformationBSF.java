package net.itspartner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

import static java.lang.Integer.parseInt;

public class StringTransformationBSF {

    public static Set<String> dictionary;
    public static String start;
    public static String stop;

    public static void main(String[] args) {

        readInputData();
        validateInputData();

        for(String word : wordSequence(start, stop, dictionary)) {
            System.out.println(word);
        }
    }

    // return the shortest sequence from 'beginWord' to 'endWord'
    public static List<String> wordSequence(String beginWord, String endWord, Set<String> dictionary) {

        if (isNeighbor(beginWord, endWord)) {
            List<String> answer = new ArrayList<String>();
            answer.add(beginWord);
            answer.add(endWord);
            return answer;
        }

	    /* queueFromBegin is used to traverse the graph from beginWord
		and queueFromEnd is used to traverse the graph from endWord.
		visitedFromBegin and visitedFromEnd are used to keep track of the
		visited states from respective directions */
        Queue<Node> queueFromBegin = new LinkedList<>();
        Queue<Node> queueFromEnd = new LinkedList<>();
        HashMap<String, Node> visitedFromBegin = new HashMap<>();
        HashMap<String, Node> visitedFromEnd = new HashMap<>();

        Node startNode = new Node(beginWord, null);
        Node endNode = new Node(endWord, null);

        visitedFromBegin.put(beginWord, startNode);
        queueFromBegin.add(startNode);
        visitedFromEnd.put(endWord, endNode);
        queueFromEnd.add(endNode);

        while (queueFromBegin.size() > 0 && queueFromEnd.size() > 0) {

            // Fetch the current node from the source queue
            Node curr1 = queueFromBegin.remove();

            // Fetch the current node from the destination queue
            Node curr2 = queueFromEnd.remove();

            // Check all the neighbors of curr1
            for (String wordFromDictionary : dictionary) {

                // If any one of them is neighbor to curr1
                // and is not present in visitedFromBegin then push it in the queue
                if (isNeighbor(curr1.word, wordFromDictionary) && !visitedFromBegin.containsKey(wordFromDictionary)) {

                    Node temp = new Node(wordFromDictionary, curr1);
                    queueFromBegin.add(temp);
                    visitedFromBegin.put(wordFromDictionary, curr1);

                    // If temp is the destination node then return the answer
                    if (temp.word.equals(endWord)) {
                        List<String> wordSequence = wordSequence(temp, null);
                        Collections.reverse(wordSequence);
                        return wordSequence(temp, null);
                    }

                    // If temp is present in visitedFromEnd sequence from temp to endWord is already found
                    if (visitedFromEnd.containsKey(temp.word)) {
                        List<String> wordSequenceHead = wordSequence(temp, null);
                        Collections.reverse(wordSequenceHead);
                        List<String> wordSequenceTail = wordSequence(visitedFromEnd.get(temp.word), null);
                        wordSequenceHead.addAll(wordSequenceTail);
                        return wordSequenceHead;
                    }
                }
            }

            // Check all the neighbors of curr2
            for (String wordFromDictionary : dictionary) {

                // If any one of them is neighbor to curr2
                // and is not present in visitedFromBegin then push it in the queue.
                if (isNeighbor(curr2.word, wordFromDictionary) && !visitedFromEnd.containsKey(wordFromDictionary)) {

                    Node temp = new Node(wordFromDictionary, curr2);
                    queueFromEnd.add(temp);
                    visitedFromEnd.put(wordFromDictionary, curr2);

                    // If temp is the destination node then return the answer
                    if (temp.word.equals(beginWord)) {
                        return wordSequence(temp, null);
                    }

                    // If temp is present in visitedFromBegin sequence from temp to beginWord is already found
                    if (visitedFromBegin.containsKey(temp.word)) {
                        List<String> wordSequenceTail = wordSequence(temp, null);
                        List<String> wordSequenceHead = wordSequence(visitedFromBegin.get(temp.word), null);
                        Collections.reverse(wordSequenceHead);
                        wordSequenceHead.addAll(wordSequenceTail);
                        return wordSequenceHead;
                    }
                }
            }
        }
        List<String> errorList = new ArrayList<>();
        errorList.add("-1");
        return errorList;
    }

    public static boolean isNeighbor(String a, String b) {

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                count++;
        }
        return count == 1;
    }

    public static List<String> wordSequence(Node node, List<String> wordSequence) {
        if (wordSequence == null) {
            wordSequence = new ArrayList<>();
        }
        wordSequence.add(node.word);
        return node.parent == null ? wordSequence : wordSequence(node.parent, wordSequence);
    }

    public static void readInputData() {
        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get dictionary size from the user
        int dictionarySize;
        dictionarySize = console.nextInt();
        console.nextLine();

        String[] dictionaryArray = new String[dictionarySize];
        for (int i = 0; i < dictionarySize; i++) {
            dictionaryArray[i] = console.nextLine();
        }

        dictionary = new HashSet<>(Arrays.asList(dictionaryArray));
        start = console.nextLine();
        stop = console.nextLine();

        System.out.println("Dictionary: " + dictionary);
        System.out.println("Start word: " + start);
        System.out.println("Stop word: " + stop);
    }

    public static void validateInputData() {

        int wordLength = start.length();
        if(start.length() != stop.length()) throw new RuntimeException("Invalid 'stop' word length.");
        for(String word : dictionary) {
            if (wordLength != word.length()) {
                throw new RuntimeException("Invalid word length in dictionary.");
            }
        }
    }

    public static void readInputData(File inputData) throws IOException {
        List<String> allLines = Files.readAllLines(inputData.toPath());
        int dictionarySize = parseInt(allLines.get(0));
        dictionary = new HashSet<>();
        for (int i=1; i<=dictionarySize; i++) {
            dictionary.add(allLines.get(i));
        }
        start = allLines.get(dictionarySize + 1);
        stop = allLines.get(dictionarySize + 2);
    }

    public static class Node {

        String word;
        Node parent;

        public Node(String word, Node parent) {

            this.word = word;
            this.parent = parent;
        }
    }
}
