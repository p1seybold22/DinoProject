
import java.util.ArrayList;
/**
 * Write a description of class ArrayListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListTester
{
    public static void main (String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Integer num = new Integer(5);
        System.out.println(myList.size());
        myList.add(num);
        System.out.println(myList.size());
        
        for (int i = 0; i<25; i++)
        {
            int rand = (int)(Math.random()*100) +1;
            Integer temp = new Integer(rand);
            myList.add(temp);
        }
        
        //Integer test = myList.get(0);
        System.out.println("######Before#####");
        
        for (Integer x : myList)
        {
            System.out.println(x);
        }
        
        
        
        for (int i = 0; i < myList.size(); i++)
        {
            int nextValue = myList.get(i);
            if (nextValue % 5 == 0)
                {
                    System.out.print("\t" + i);
                    myList.remove(i);
                    i--;
                }
        }
        
        System.out.println("######After#####");
        System.out.println(myList.size());
        
    }
}
