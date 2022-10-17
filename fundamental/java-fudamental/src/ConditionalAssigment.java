public class ConditionalAssigment {
    
    public static void conditionalAssigment(String[] arg){

        // result = condition ? true-value : false-value;

        // Example 1
        int v1 = 7;
        int v2 = 5;
        
        int vMax = v1 > v2 ? v1 : v2;
        System.out.println(vMax);

        // Example 2
        float student = 30;
        float rooms = 4;

        float studentsPerRoom = rooms == 0.0f ? 0.0f : student/rooms;

        System.out.println(studentsPerRoom);

    }

}
