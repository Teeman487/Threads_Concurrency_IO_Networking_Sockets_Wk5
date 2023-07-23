package SingleTon1;
// One instance of a particular class to be created
public class TVSet {

    private static volatile TVSet tvSetInsance = null;
    private  TVSet() {
        System.out.println("TV Set is instantiated");
    }
    public static  TVSet getTVSetInstance() {
        if (tvSetInsance == null) { // optimisation
            synchronized (TVSet.class) {
            if (tvSetInsance == null) // double checking
                tvSetInsance = new TVSet();

            }
        }
        // heavy work done here
     return  tvSetInsance;
    }
}
// time 0 - t1 , t2
// time 5 - t5, t6, t7
