# sets-maps-queues
VT Programming team lecture 2016.02.02 

Unique Usernames <br>
Time Limit: 2 seconds

After the great job you did with verifying the ages of the users last week for the Intergalactic Social Network, you have now been assigned with fixing more problems with how the registration process works. Users have been trying to register the same usernames multiple times, and obviously we can not allow this to happen! You will be provided with a set of registrations, it is your job to output whenever a username that perviously has been taken is used again

Input<br>
Each input will consist of a single test case. The first line of input will contain a single integer N (1≤N≤100001≤N≤10000) denoating the number of usernames that will be in the input. This will be followed by a list of N usernames, one per line. A username will consist of one word, and will consist of only lowercase alphanumeric characters.

Output<br>
Each time a username is encountered that has already been taken output “Invalid Username:” followed by the username. After all the usernames have been encountered output the usernames that were valid in alphabetical order, one per line.

Sample Input 1	
8<br>
askywalker<br>
o1kenobi<br>
vader<br>
darkside<br>
o1kenobi<br>
usetheforce<br>
vader<br>
dvader<br>

Sample Output 1<br>
Invalid Username: o1kenobi<br>
Invalid Username: vader<br>
askywalker<br>
darkside<br>
dvader<br>
o1kenobi<br>
usetheforce<br>
vader
