import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for (int num:map.keySet()){
            pq.add(num);
            if (pq.size()>k){
                pq.poll();
            }
        }
        int [] result=new int[k];
        for(int i =k-1;i>=0;i--){
            result[i]=pq.poll();
        }
        return result;
    }
}
//Time Complexity: O(NlogK) where N is the number of elements in the input array.
//  We iterate through the array to build the frequency map, which takes O(N) time. 
// Then we iterate through the keys of the map and add them to the priority queue,
//  which takes O(NlogK) time in total since we maintain a heap of size k.   
//Space Complexity: O(N) where N is the number of unique elements in the input array.   




class Solution2 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[]bucket=new  List[nums.length+1];//bucket sort as here frequency of each element
        //  can be at max n where n is the length of the array
        for(int i=0;i<=nums.length;i++){
            bucket[i]=new ArrayList<>();//initializing the bucket
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){//iterating through the map
            int frequency=entry.getValue();//getting the frequency of the element
            int value=entry.getKey();//getting the element
            bucket[frequency].add(value);//adding the element to the bucket corresponding to its frequency
        }
        List<Integer> resultlist=new ArrayList<>();//list to store the result
        for(int i=bucket.length-1;i>=0;i--){//iterating through the bucket from the end to get the most frequent elements
            if(!(bucket[i].isEmpty())){
                for(int num:bucket[i]){
                    resultlist.add(num);
                }
                if (resultlist.size()==k){
                    break;
                }
            }
        }
        int[] result = new int[k];//array to store the result
        for (int i = 0; i < k; i++) {
          result[i] = resultlist.get(i);
          }
         return result;
    }
}
        
//Time Complexity: O(N) where N is the number of elements in the input array.
//  We iterate through the array to build the frequency map, which takes O(N) time.
//  Then we iterate through the keys of the map and add them to the bucket,
//  which takes O(N) time in total.
//Space Complexity: O(N) where N is the number of unique elements in the input array.



     