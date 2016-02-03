import java.util.*;

public class UniqueUsernames {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<String>();
        
        int amount = scan.nextInt();
        
        //start to scan the sample input and add the users to the tree set
        for (int i = 0; i < amount; i++)
        {
            String user = scan.next();
            
            //if the scanner encounters an existing user, it knows it's invalid and prints it.
            //always check for existing before trying to set.add(user)
            
            if (set.contains(user))
            {
                System.out.println("Invalid Username: " + user);
            }
            else 
                set.add(user);
        }
        
        //iterate through the set and print out its contents
        for (String a : set)
        {
            System.out.println(a);
        }

    }

}
