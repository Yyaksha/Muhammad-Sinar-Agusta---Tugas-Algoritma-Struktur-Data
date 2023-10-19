public class Array {
    public static void main(String[] args) {
        
        String[] arraysStrings = new String[3];
        
        arraysStrings[0] = "Muhammad ";
        arraysStrings[1] = "Sinar ";
        arraysStrings[2] = "Agusta";

        System.out.println(arraysStrings[0]);
        System.out.println(arraysStrings[1]);
        System.out.println(arraysStrings[2]);

        int[] arrayInt = {
            10, 20, 30 ,40 ,50
        };
        System.out.println(arrayInt);

        String[][] members = {
            {"joko", "Widodo"},
            {"Bayek", "Basim"},
            {"Rudi", "Asep"},
        };
        System.out.println(members[0][1]);
    }
}
