package com.collections;

import java.util.Comparator;

import com.beans.PersonBean;

public class NameComparator implements Comparator<PersonBean>
{

	@Override
	public int compare(PersonBean p1, PersonBean p2) {
					
			//int cmp=p1.getName().compareTo(p2.getName());
//		int result=0;
//				int a1=	p1.getAge();
//				int a2=p2.getAge();
//				if(a1>a2)
//					result=1;
//				if(a1<a2)
//					result=-1;
//				if(a1==a2)
//					result=0;
int cmp=new Integer(p1.getAge()).compareTo(new Integer(p2.getAge()));
				
					
		return cmp;
	}

	
	
}
