package org.yardimci.asil.githubcopilot;

public class GCPTest {
    public static void main(String[] args) {
        GCPTest gcpTest = new GCPTest();
    }

    public int calculateMonthsBetweenYearsAnInteger(int year1, int year2) {
        int years = year2 - year1;
        return years * 12;
    }

    public int findSecondLargeNumber(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int findSecondLargeNumber(int[] numbers, int startIndex, int endIndex) {
        int max = 0;
        for (int i = startIndex; i < endIndex; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // iterate all String elements and print them
    public void printAllStrings(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    // print from 1 to 20 throw exception if value is 10
    public void printNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i == 10) {
                throw new RuntimeException("10 is not allowed");
            }
            System.out.println(i);
        }
    }




}
