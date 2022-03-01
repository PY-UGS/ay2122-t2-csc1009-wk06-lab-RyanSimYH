package Lab6;

import java.util.LinkedList;

public class LinkedListTest {

    public LinkedListTest()
    {
    }

    public LinkedList addAndSort(LinkedList<Integer> ll, int value)
    {
        for(int i = 1; i<ll.size();i++)
        {
            if(ll.get(i-1) < value && ll.get(i) > value )
            {
                ll.add(i,value);
                break;
            }
            else if (value < ll.getFirst())
            {
                ll.add(0,value);
            }
            else if(value>ll.getLast())
            {
                ll.add(value);
            }
        }
        return ll;
    }

    public LinkedList swapValues(LinkedList<Integer> ll, int ind1, int ind2)
    {
        int temp;
        temp=ll.get(ind1);
        ll.set(ind1,ll.get(ind2));
        ll.set(ind2,temp);
        return ll;
    }

    public int findValue(LinkedList<Integer> ll, int value)
    {
        if(ll.contains(value))
        {
            return ll.indexOf(value);
        }
        else
        {
            return -1;
        }
    }



}
