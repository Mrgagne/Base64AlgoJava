import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> arr = convertToBinary(parseOutString("My name is Michael"));
       // addZerosInFront(regroup(concatBinaryStrings(arr)));
        printASCIITable();

    }

    public static void printASCIITable() {
        System.out.println("ASCII Value | Character");
        System.out.println("----------------------");
        for (int i = 0; i <= 127; i++) {
            char character = (char) i;
            System.out.printf("%12d | %s%n", i, character);
        }
    }


    public static char[] parseOutString(String aString) {
        return aString.toCharArray();
    }

    public static ArrayList<Integer> convertToDecimal(ArrayList<String> finalBinaryArray) {
        ArrayList<Integer> decimalArray = new ArrayList<>();
        for (String each : finalBinaryArray) {

        }
        return decimalArray;
    }

    public static ArrayList<String> addZerosInFront(ArrayList<String> sixGroupArray) {
        ArrayList<String> newBinaryList = new ArrayList<>();
        for (String each : sixGroupArray) {
            while (each.length() < 8) {
                each = "0" + each;
            }
            newBinaryList.add(each);
            System.out.println(each);
        }
        return newBinaryList;
    }

    public static ArrayList<String> regroup(String binaryString) {
        ArrayList<String> groupsOfSix = new ArrayList<>();

        for (int i = 0; i < binaryString.length(); i += 6) {
            int endIndex = Math.min(i + 6, binaryString.length());
            String group = binaryString.substring(i, endIndex);
            if (group.length() < 6) {
                while (group.length() < 6) {
                    group = group.concat("0");
                }
            }
            groupsOfSix.add(group);
        }
        return groupsOfSix;
    }

    public static String concatBinaryStrings(ArrayList<String> binaryArray) {
        String binaryString = "";
        for (String each : binaryArray) {
            binaryString = binaryString.concat(each);
        }
        return binaryString;
    }

    public static ArrayList<String> convertToBinary(char[] charArray) {
        ArrayList<String> binaryArray = new ArrayList<>();
        for(int i = 0; i < charArray.length; i++) {
            binaryArray.add(String.format("%8s", Integer.toBinaryString(charArray[i])).replace(' ', '0'));
        }

        return binaryArray;
    }


}
