public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Honda";
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    // f(x,y,z) = x + 1/z - y;
    // Say x = 5;
    // f(5) = 5 + 1 = 6;

    public Car(){

    }

    public Car ( int customMaxSpeed, double customWeight, boolean customIstheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIstheCarOn;

    }
    //getter and setters
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }
    public int getMinSpeed(){
        return this.minSpeed;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean getIsTheCarOn(){
        return this.isTheCarOn;
    }

    public void printVariables(){
        System.out.println("This is the maxSpeed = " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
        System.out.println(maxNumberOfPeopleInCar);
    }

    public void upgradeMaxSpeed(){
        setMaxSpeed(getMaxSpeed() + 10);
    }
    public void getIn(){
        // numberOfPeopleInCar = numberOfPeopleInCar + 1;
        // if there aren't too many people in the car
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            // then someone can get in
            numberOfPeopleInCar++;
            System.out.println("someone got in");
        }else {
            // otherwise print out the fact the car is full

            System.out.println("The car is full!" + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
        // number of People in car = number of people in car -1;
        // if there is people in the car
        if (this.numberOfPeopleInCar > 0) {
            // then tell one person to get out
            numberOfPeopleInCar--;
        }else{
            // otherwise  no one can get out and we will print that.
            System.out.print ("No one is in the car" + numberOfPeopleInCar);
        }
    }
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        //if the car isn't on ..
        if (!isTheCarOn) {
            //turn it on
            isTheCarOn = true;
        } else {
            //otherwise print out the fact that it is on
            System.out.println("The car is already on" + isTheCarOn);
        }
    }

    public static void main(String[] args) {
        //todoCode application logic here

        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();

        //System.out.println("Christmas Car");
        //Car christmasPresent = new Car(550, 2000, false);
        //christmasPresent.printVariables();

    }

}
