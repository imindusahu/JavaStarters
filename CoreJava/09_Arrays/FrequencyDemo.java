/*
 * Topic  : Arrays
 * Program: Frequency of Elemnts && Most Frequent Element && Least Frequent Element
 * Author : Indu Sahu
 * Purpose: To find the frequency of elements and most frequent and least frequent element in an array in Java.
 */

public class FrequencyDemo {
    public static void main(String [] args) {
        findFrequencyOfElements();
        findMostFrequentElement();
        findLeastFrequentElement();
    }

    private static void findFrequencyOfElements() {

        System.out.println("\n========= ELEMENT FREQUENCY ==========\n");

        int[] numbers = {10, 20, 10, 30, 10, 20};

        for(int i = 0; i < numbers.length; i++) {

            boolean alreadyChecked = false;

            for(int k = 0; k < i; k++) {
                if(numbers[i] == numbers[k]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if(alreadyChecked) {
                continue;
            }

            int count = 0;
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    count++;
                }
            }

            System.out.println(numbers[i] + " : " + count);
        }
    }

    private static void findMostFrequentElement() {
        int[] numbers = {10, 20, 10, 30, 20, 10};

        System.out.println("\n\n========== MOST FREQUENT ELEMENT ==========\n");

        boolean[] visited = new boolean[numbers.length];

        int mostFrequent = numbers[0];
        int maxFrequency = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(visited[i]) {
                continue;
            }

            int frequency = 1;

            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    frequency++;
                    visited[j] = true;
                }
            }

            if(frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequent = numbers[i];
            }
        }
        System.out.println("Most Frequent Element : " + mostFrequent);
        System.out.println("Frequency : " + maxFrequency);
    }

    private static void findLeastFrequentElement() {
        int[] numbers = {10, 20, 10, 30, 20, 10};

        System.out.println("\n\n========== LEAST FREQUENT ELEMENT ==========\n"); 

        boolean[] visited = new boolean[numbers.length];

        int leastFrequent = numbers[0];    
        int minFrequency = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(visited[i]) {
                continue;
            }

            int frequency = 1;

            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    frequency++;
                    visited[j] = true;
                }
            }
            if(frequency < minFrequency) {
                minFrequency = frequency;
                leastFrequent = numbers[i];
            }
        }  
        System.out.println("Least Frequent Element : " + leastFrequent);
        System.out.println("Frequency : " + minFrequency);
    }
}