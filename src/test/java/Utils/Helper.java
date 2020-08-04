package Utils;

import java.util.ArrayList;

public class Helper {
    public static int max(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static ArrayList<Integer> stringToInt(ArrayList<String> texts) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(String text : texts) {
            numbers.add(Integer.valueOf(text.replaceAll("\\D+","")));
        }
        return numbers;
    }

    public static ArrayList<String> removeSpace(ArrayList<String> texts){
        for (String text:texts){
            text.replace(" ","");
        } return texts;
    }

    public static Boolean compareTwoArrays(ArrayList<String> texts, ArrayList<String> texts2){
        boolean equal=true;
        for (int i=0; i<texts.size(); i++){
            if (!texts.get(i).equalsIgnoreCase(texts2.get(i))){
                equal=false;
                break;
            }
        } return equal;

    }

}
