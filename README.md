# GroceryStore_LinkedListQueue

*For this project the professor provided the Customer class*

------------------------------------------------------------------------------------------------------

This java program simulates customers waiting in line at a grocery store during a period of 60 "minutes." It uses a Linked List Queue to hold Customer objects. At the creation of each Customer object, it is assigned a required service time (number of iterations before the customer is fully checked out) between 1-5 "minutes."

For each iteration or "minute" of the program, the following happens:

•	Check to see if new customers are added to the queue (25% chance a new customer arrives at the back of the line) <br>
•	Customer object currently being serviced (front of the queue) is updated. <br>
•	If the customer has been completely serviced, they are removed from the queue. <br>

At the end of each iteration the program outputs, “---------------------------------------------------“  to visually identify the passing of time.

------------------------------------------------------------------------------------------------------
EXAMPLE OUTPUT: <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 1 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 1 <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 3 <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 4 <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 5 <br>
Customer serviced and removed from the queue.  Queue length is now 4 <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 5 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 4 <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 3 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 4 <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 3 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 3 <br>
Customer serviced and removed from the queue.  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 1 <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 1 <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 0 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 1 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 1 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 0 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 1 <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 2 <br>
Customer serviced and removed from the queue.  Queue length is now 1 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 3 <br>
Customer serviced and removed from the queue.  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 3 <br>
Customer serviced and removed from the queue.  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
New customer added!  Queue length is now 3 <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 2 <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 1 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
Customer serviced and removed from the queue.  Queue length is now 0 <br>
"---------------------------------------------------------------------" <br>
"---------------------------------------------------------------------" <br>
 <br>
Total customers serviced: 18 <br>
Max line length: 5 <br>
