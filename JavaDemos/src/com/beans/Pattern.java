package com.beans;

//Input 1010111010

/*Output 

101
1010
0101
01011
10111
*/

public class Pattern 
{
	public int calculate(int i,int j) {
		return i+j;
	}

}


Employee
1)Id,Password,employee name,

Customer
1)name,id,address,phn no

Complaints
1)compl id,complaint ,date compliant is registered, solved,resolved date,customer id

Assign complaint
1)emp id,complaint id,assigned date, status

Feedback
1)

name and id of the employee associated more than 10 complaints

Select employee.name,employee.id from assignComplaints inner join Employee where
Select Count(id) from assignComplaint where 