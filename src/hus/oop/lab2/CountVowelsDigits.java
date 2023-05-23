package hus.oop.lab2;

public class CountVowelsDigits {
    public static void main(String[] args) {
        String testString = "testing12345";
        int numberVowels = countVowels(testString);
        System.out.println("Number of vowels: " + numberVowels);
        int numberDigits = countDigits(testString);
        System.out.println("Number of Digits: " + numberDigits);
        double percentageOfVowels = getPercentageOfVowels(testString);
        System.out.printf("Percentage of vowels: %.3f%%", percentageOfVowels);
        double percentageOfDigits = getPercentageOfDigits(testString);
        System.out.println();
        System.out.printf("Percentage of digits: %.3f%%", percentageOfDigits);
    }
    public static boolean isVowelUsingArray(char lowerChar) {
        char[] vowels = {'u','e','o','a','i'};
        for(char vowel: vowels) {
            if(lowerChar == vowel) {
                return true;
            }
        }
        return false;
    }
    public static boolean isVowelUsingString(char lowerChar) {
        final String VOWEL_STRING = "ueoai";
        int index = VOWEL_STRING.indexOf(lowerChar);
        if (index == -1) {
            return false;
        }
        return true;
    }
    public static int countVowels(String myString) {
        String lowerString = myString.toLowerCase();
        int count = 0;
        for(int i = 0; i < myString.length(); i++) {
            //if lowerString.charAt() is vowel -> count++
            if(isVowelUsingString(lowerString.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static int countDigits(String myString) {
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            //if myString.charAt(i) is digit -> count++
            if('0' <= myString.charAt(i) && myString.charAt(i) <= '9') {
                count++;
            }
        }
        return count;
    }
    public static double getPercentageOfVowels(String myString) {
        int numberVowels = countVowels(myString);
        double percentage = 100.0 * numberVowels / myString.length();
        return percentage;
    }
    public static double getPercentageOfDigits(String myString) {
        int numberDigits = countDigits(myString);
        double percentage = 100.0 * numberDigits / myString.length();
        return percentage;
    }
    public static double roundNumber(double percentage, int number) {
        return Math.round(percentage * Math.pow(10,number) / Math.pow(10,number));
    }
}
