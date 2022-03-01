package Lab6;

import java.util.HashMap;

public class HashmapTest {

    public HashmapTest()
    {
    }

    public HashMap addAndSort(HashMap<Integer,Integer> hm, int value)
    {
        int temp,size;
        size= hm.size();
        for(int i =1; i<hm.size();i++)
        {
            if(hm.get(i-1)<value && hm.get(i) > value)
            {
                temp = i;
                int tempval= hm.get(hm.size()-1);
                hm.put(hm.size(),tempval);
                for(int j = temp; j<size-1; j++)
                {
                    tempval=hm.get(j);
                    hm.replace(j+1,tempval);
                }
                hm.replace(temp,value);
                break;
            }
        }
        return hm;
    }

    public HashMap swapValues(HashMap<Integer,Integer> hm, int ind1,int ind2)
    {
        int temp;
        temp = hm.get(ind1);
        hm.replace(ind1,hm.get(ind2));
        hm.replace(ind2,temp);
        return hm;
    }
    public int findValues(HashMap<Integer,Integer> hm, int value)
    {
        for(int i =0; i< hm.size();i++)
        {
            if(hm.get(i)==value)
            {
                return i;
            }
        }
        return -1;
    }
}
