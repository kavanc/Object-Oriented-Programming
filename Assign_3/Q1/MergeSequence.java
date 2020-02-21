import java.util.ArrayList;

/**
 *Author: Kavan Chandra
 *#: 100693831
 */
public class MergeSequence
{
    //this is given in the question
    public ArrayList<Integer> values;
    public MergeSequence()
    { values = new ArrayList<Integer>();
    }
    public void add(int n)
    {values.add(n);
    }
    public String toString()
    {return values.toString();
    }
    //the append method adds the values of the second
    // to the first sequence into a new ArrayList
    public MergeSequence append (MergeSequence other)
    {

        MergeSequence b = new MergeSequence();
       b.values.addAll(values);
       b.values.addAll(other.values);
        b.toString();

    return b;
    }
    // the main class tests the append method
    // values are added to the arrays
    // then append is used to add them into the same sequence
    public static void main(String[] args)
    {
        MergeSequence array_1 = new MergeSequence();
        array_1.add(3);
        array_1.add(6);
        MergeSequence array_2 = new MergeSequence();
        array_2.add(5);
        MergeSequence array_3 = array_1.append(array_2);
        System.out.println(array_3.toString());

    }
}
