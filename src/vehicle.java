public class vehicle {
    // declare variables
    int maxSpeed = 120;
    int minSpeed = 15;
    double weight = 4000.23;
    boolean carIsOn = true;
    String nameOfvehicle = "Porsche";
    char condition = 'A';
    //print variables
    public void printVariables() {
        System.out.println("max speed = " + maxSpeed);
        System.out.println("min speed = " + minSpeed);
        System.out.println("weight = " + weight);
        System.out.println("Name = " + nameOfvehicle);
        System.out.println("Condition = " + condition);
    }

    public void upgradeMinSpeed () {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public static void main (String[] args) {

        vehicle family= new vehicle();
        System.out.println(" family's vehicle:");
        family.printVariables();
        family.upgradeMinSpeed();
        family.printVariables();
        }
}


