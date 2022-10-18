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


        // Block statements
        int v5 = 10, v6 = 4, diff;

        if (v5 > v6) {
            diff = v5 - v6;
            System.out.println("v5 is Bigger");
            System.out.println(diff);
        }
        else if(v6 > v5){
            diff = v6 - v5;
            System.out.println("v6 is Bigger");
            System.out.println(diff);
        }
        else
        System.out.println("v4 and v6 are equal");

    }
}
