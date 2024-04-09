/**
 * File: [OOP_ClassRelationship_Inheritance_IS_A_RonakBasnet].
 * By: [Ronak Basnet]
 * Date: [3/31/2024]
 * Description: [This program prints OOP part C]
 */


public class OOP_ClassRelationship_Inheritance_IS_A_RonakBasnet {
    public static void main(String[]args){

        Driver driver = new Driver();
        driver.drive();
        driver.vehicle();

        UberDriver uber = new UberDriver();
        uber.selfEmployed();
        uber.experience();

        Alex alex = new Alex();
        alex.alexDrive();
        alex.alexRides();

        Harry harry = new Harry();
        harry.harryDrive();
        harry.harryRides();

        driver.diagram();









    }
}

