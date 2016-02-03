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

Intergalactic Elections<br>
Time Limit: 2 seconds

It is time for the yearly intergalactic elections to take place! This year the senate has met and decided that since everyone is using the Intergalactic Social Network that it would make sense to have to voting take place through the network. You have been tasked to count the votes after the election has taken place.

Input<br>
Each input will consist of a single test case. The first line of input will contain a single integer N (1≤N≤100001≤N≤10000) denoating the number of votes that will be in the input. This will be followed by a list of N votes, one per line. A vote will consist of one word, the username of the person who is being voted for. As before a username will consist of only lowercase alphanumeric characters.

Output<br>
Output the username which recieved the most number of votes, if there is a tie for who recieved the most votes output “Tie detected!”

Sample Input 1	
8<br>
yoda<br>
o1kenobi<br>
yoda<br>
o1kenobi<br>
vader<br>
yoda<br>
vader<br>
yoda<br><br>
Sample Output 1 <br>
yoda<br><br>
Sample Input 2	
8<br>
yoda<br>
o1kenobi<br>
yoda<br>
o1kenobi<br>
vader<br>
yoda<br>
vader<br>
o1kenobi<br><br>
Sample Output 2<br>
Tie detected!
