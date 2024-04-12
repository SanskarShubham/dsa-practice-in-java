

import java.util.HashMap;
import java.util.Map;

public class FindLucky_23 {
    public int findLucky(int[] arr) {
        int lucky = -1;
        Map<Integer,Integer> m = new HashMap<>();

        for (int i : arr) {
            if (m.containsKey(i)) {
                m.put(i, m.get(i)+1);                    
            }else{
                m.put(i, 1);
            }
        }
            for(Map.Entry<Integer,Integer> val : m.entrySet()){
                if (val.getKey()== val.getValue()) {
                    if (val.getKey() > lucky) {
                        lucky = val.getKey();
                    }
                }
            }
       
        return lucky;
    }
}
