public class IfelseStatement {
    
    public static void ifelseStatement(String[] arg){

        /*  
        
        if(condition)
            true-statement;
        else
            false-statement;

        */


        // example 1
        int v1 = 10;
        int v2 = 4;

        if(v1 > v2)
        System.out.println("v1 is bigger");

        // Example 2

        int v3 = 10;
        int v4 = 4;

        if(v3 < v4)
            System.out.println("v3 is Bigger");
        else if(v3 < v4)
            System.out.println("v4 is Bigger");
        else
            System.out.println("v3 and v4 are equal");

    }
}
