public class Driver {

    String drive = "I can drive.";
    int vehicle = 1;

    void drive(){
        System.out.println("Every driver can drive. " + drive + " I have "+ vehicle + " vehicle.");
    }
    void vehicle(){
        System.out.println("Every driver needs a vehicle.\n");
    }
    public void diagram() {
        System.out.println("--Diagram of the classes--\n");
        //System.out.print("  | OOP_ClassRelationship_Inheritance_IS_A_RonakBasnet |\n");
        int height = 3; // Height of the arrow

        // Draw the arrow
//        for (int i = 1; i <= height; i++) {
//            System.out.println("                      *");
//        }
        System.out.println("      |OOP_ClassRelationship_Inheritance_IS_A_RonakBasnet|");
        for (int i = 1; i <= height; i++) {
            System.out.println("                               *");
        }
        System.out.println("                            |Driver|");
        for (int i = 1; i <= height; i++) {
            System.out.println("                               *");
        }

        System.out.printf("%18s", "     * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println();

        System.out.printf("     *%26s %21s", "*", "*");
        System.out.println();
        System.out.printf("     *%26s %21s\n", "*", "  *");

        System.out.println("|Uber Driver|               |Alex|                |Harry|");


    }

}




