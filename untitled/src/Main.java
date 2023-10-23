import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = convertToBinary(parseOutString("My name is Michael"));
        for (String each : arr) {
            System.out.println(each);
        }

    }


    public static char[] parseOutString(String aString) {
        return aString.toCharArray();
    }

    public static ArrayList<String> convertToBinary(char[] charArray) {
        ArrayList<String> binaryArray = new ArrayList<>();
        for(int i = 0; i < charArray.length; i++) {
            binaryArray.add(String.format("%8s", Integer.toBinaryString(charArray[i])).replace(' ', '0'));
        }

        return binaryArray;
    }


}
