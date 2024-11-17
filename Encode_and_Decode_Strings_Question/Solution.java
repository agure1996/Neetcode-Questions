package Encode_and_Decode_Strings_Question;

import java.util.ArrayList;
import java.util.List;



public class Solution {

    public static void main(String[] args) {
        List<String> s = List.of(new String[]{"neet", "code", "love", "you"});
        System.out.println(Solution.decode(Solution.encode(s)));
    }

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {

            sb.append(str.length()).append("#").append(str);
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> completeList = new ArrayList<>();
        int i=0;
        while(i < str.length()){
            // Find the position of the '#' separator
            int hashIndex = str.indexOf('#', i);
            // Get the length of the next string
            int length = Integer.parseInt(str.substring(i, hashIndex));
            // Extract the string using the length
            String word = str.substring(hashIndex + 1, hashIndex + 1 + length);
            completeList.add(word);
            // Move the pointer to the next encoded part
            i = hashIndex + 1 + length;
        }

        return completeList;
    }
}