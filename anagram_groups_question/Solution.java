package anagram_groups_question;

import java.util.*;


public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to group words that are anagrams
        // Key: sorted version of each word (so "act" and "cat" both map to "act")
        // Value: list of words that match this sorted key (all anagrams of each other)
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Go through each word in the input array
        for (String word : strs) {
            // Turn the word into a char array and sort it alphabetically
            // This sorted version is our key for this group of anagrams
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars); // Make the sorted chars back into a string

            // Check if this sorted key already exists in the map
            // If not, add it with a new list; then, add this word to the list
            anagramGroups.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

    /*
        Get all the anagram groups from the map (just the values),
        sort them by the number of words in each group (smallest group first),
        then put them back into a list format.
        Note: .values() is a hashmap method for going through all values in hashmap
    */
        List<List<String>> sortedAnagramGroups = anagramGroups.values().stream()
                .sorted((o1, o2) -> Integer.compare(o1.size(), o2.size()))
                .toList();

        // Return the list of lists, where each list contains a group of anagrams
        return sortedAnagramGroups;
    }

}

/*  In Main file:

    public static void main(String[] args) {

        String [] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(Solution.groupAnagrams(strs));
    }
}
 */