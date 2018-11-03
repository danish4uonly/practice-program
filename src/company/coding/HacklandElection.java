package company.coding;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**  https://github.com/spdeepak?tab=repositories
 * @author Deepak
 *https://github.com/spdeepak/hackerrank/tree/master/src/main/java/com/deepaksp/hackerrank
 */

/**
 * Find the maximum vote can be opted to persons and if more than one person can have same maximum votes then find the last persons in the array.
 * 
 *
 */
public class HacklandElection {

    public static void main(String[] args) {
        String[] votes = { "victor", "veronica", "ryan", "dave", "maria", "farah", "farah", "ryan", "veronica" };
        Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (String vote : votes) {
            if (map.containsKey(vote)) {
                map.put(vote, map.get(vote) + 1);
            } else {
                map.put(vote, 1);
            }
        }
        System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue())
                .getKey());
    }
}
