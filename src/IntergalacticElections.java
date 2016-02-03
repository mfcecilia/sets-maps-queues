import java.util.*;
public class IntergalacticElections {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        int amount = scan.nextInt();
        
        //scan the sample input and place users into the map
        
        for (int i = 0; i < amount; i++)
        {
            String user = scan.next();
            
            
            //if it already has that person, add 1 to their value
            if(map.containsKey(user))
            {
                map.put(user, map.get(user)+1);
            }
            
            //if it does not have that person, add them to the map and give them a starting value of 1
            else
            {
                map.put(user, 1);
            }
            
            //remember, hashmaps are one directional.
            //you can call on things by their key, not their value.
            //a key is unique, but values can be the same across multiple keys
        }
        
        
        /**
         * here we want to compare values and keep track of their keys.
         * those are held using the following int and string variables.
         * iterate through the keys in the map.
         * for every key, store the value as a vote. 
         * along the way, compare it to the max. 
         * if the vote is greater than the max, that vote becomes the max, and the corresponding key becomes the best.
         * to account for a tie, check if the stored maxVote is equal to whatever new vote has been scanned.
         * if that case is true, then the best variable is a tie. 
         * otherwise, printing the best variable will print the key with the maxVote
         */
        int maxVote = 0;
        String best = " ";
        for (String a : map.keySet())
        {
            int vote = map.get(a);
            if (vote > maxVote)
            {
                maxVote = vote;
                best = a;
            }
            else if (vote == maxVote)
            {
                best = "Tie detected!";
            }
        }
        System.out.println(best);

    }

}
