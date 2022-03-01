package Lab6;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Test {

        public static void main(String[] args)
        {

            LinkedList ll = new LinkedList();
            ll.add(1);
            ll.add(3);
            ll.add(5);
            ll.add(7);
            ll.add(9);
            ll.add(11);
            LinkedListTest LLT = new LinkedListTest();
            ll=LLT.addAndSort(ll,30);
            System.out.println(ll);
            ll = LLT.swapValues(ll,2,5);
            System.out.println(ll);
            Random random = new Random();
            LinkedList RandLLT = new LinkedList();
            for(int i = 0; i<500;i++)
            {
                RandLLT.add(random.nextInt(1000,8999));
            }
            int result=LLT.findValue(RandLLT, random.nextInt(1000,9999));
            System.out.println(result);

            HashMap hm = new HashMap<>();
            hm.put(0,1);
            hm.put(1,3);
            hm.put(2,5);
            hm.put(3,7);
            hm.put(4,9);
            hm.put(5,11);

            HashmapTest HMT = new HashmapTest();
            System.out.println(HMT.addAndSort(hm,8).values());
            System.out.println(HMT.swapValues(hm,2,3).values());
            HashMap RandHM =new HashMap<>();
            for (int i = 0; i<500;i++)
            {
                RandHM.put(i,random.nextInt(1000,9999));
            }
            System.out.println(HMT.findValues(RandHM,random.nextInt(1000,9999)));


        }
}
