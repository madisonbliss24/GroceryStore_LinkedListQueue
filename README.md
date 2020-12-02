# GroceryStore_LinkedListQueue

*For this project the professor provided the Customer class*
------------------------------------------------------------------------------------------------------

This java program simulates customers waiting in line at a grocery store during a period of 60 "minutes." It uses a Linked List Queue to hold Customer objects. At the creation of each Customer object, it is assigned a required service time (number of iterations before customer is fully checked out) between 1-5 "minutes."

For each iteration or "minute" of the program, the following happens:

•	Check to see if new customers are added to the queue (25% chance a new customer arrives at the line)
•	Customer object currently being serviced (front of the queue) is updated.
•	If the customer has been completely serviced, they are removed from the queue.

At the end of each iteration teh program outputs, “---------------------------------------------------“  to visually identify the passing of time.

------------------------------------------------------------------------------------------------------
EXAMPLE OUTPUT:
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 1
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 2
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 1
"---------------------------------------------------------------------"
New customer added!  Queue length is now 2
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 3
"---------------------------------------------------------------------"
New customer added!  Queue length is now 4
"---------------------------------------------------------------------"
New customer added!  Queue length is now 5
Customer serviced and removed from the queue.  Queue length is now 4
"---------------------------------------------------------------------"
New customer added!  Queue length is now 5
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 4
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 3
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 4
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 3
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 2
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 3
Customer serviced and removed from the queue.  Queue length is now 2
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 1
"---------------------------------------------------------------------"
New customer added!  Queue length is now 2
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 1
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 0
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 1
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 2
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 1
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 0
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 1
"---------------------------------------------------------------------"
New customer added!  Queue length is now 2
Customer serviced and removed from the queue.  Queue length is now 1
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 2
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 3
Customer serviced and removed from the queue.  Queue length is now 2
"---------------------------------------------------------------------"
New customer added!  Queue length is now 3
Customer serviced and removed from the queue.  Queue length is now 2
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
New customer added!  Queue length is now 3
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 2
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 1
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"
Customer serviced and removed from the queue.  Queue length is now 0
"---------------------------------------------------------------------"
"---------------------------------------------------------------------"

Total customers serviced: 18
Max line length: 5
