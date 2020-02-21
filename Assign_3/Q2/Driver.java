// Author: Kavan Chandra
//#: 100693831
public class Driver  {

    public static void main(String []args){
        //workers array is created using the variables in Worker class
        Worker[] workers = new Worker[4];
        workers [0] = new Worker("and", 1999);
        workers [1] = new Worker("boil", 1998);
        workers [2] = new Worker("chad", 1997);
        workers [3] = new Worker("dan", 1996);

        //Sort class is called to arrange order in the workers array
        Sort<Worker> w = new Sort<>();
        w.sorting(workers);

        //managers array is created using the variables in Manager class
        Manager[] managers = new Manager[4];
        managers [0] = new Manager("fonzi", 1995);
        managers [1] = new Manager("emily", 1994);
        managers [2] = new Manager("don", 1993);
        managers [3] = new Manager("hope", 1992);

        //Sort class is called to arrange order in the managers array
        Sort<Manager> m = new Sort<>();
        m.sorting(managers);

        //the for loops output the values at each index of the arrays
        for(int a = 0; a < workers.length; a++)
        {
            System.out.println(workers[a]);
        }
        System.out.println("\n");

        for(int b = 0; b < managers.length; b++)
        {
            System.out.println(managers[b]);
        }

    }
    //sort class arranges the elements in array
    // the nested for loops compare the values of two indices
    //then which ever is a smaller value is placed before the larger one
    public static class Sort<T>
    {
        public void sorting(Comparable<T>[] x)
        {
            int low;
            Comparable<T> a;

            for (int i = 0; i < x.length; i++)
            {
             low = i;
                 for (int b = i+1; b < x.length; b++)
                 {
                     if (x[b].compareTo((T)x[low]) < 0) {
                         low = b;
                     }
                 }
                 a = x[low];
                 x[low] = x[i];
                 x[i] = a;
            }
        }
    }

}
