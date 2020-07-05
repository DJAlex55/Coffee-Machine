package machine;

import java.util.Scanner;

public class CoffeeMachine
{
    private static final Scanner scanner = new Scanner(System.in);

    int availableWater;
    int availableMilk;
    int availableCoffeeBeans;
    int availableCups;
    int money;

    public CoffeeMachine(int availableWater, int availableMilk, int availableCoffeeBeans, int availableCups, int money) {
        this.availableWater = availableWater;
        this.availableMilk = availableMilk;
        this.availableCoffeeBeans = availableCoffeeBeans;
        this.availableCups = availableCups;

        this.money = money;
    }

    enum CoffeeType {
        ESPRESSO( 250, 0, 16, 4),
        LATTE( 350, 75, 20, 7),
        CAPPUCCINO( 200, 100, 12, 6);

        public int water;
        public int milk;
        public int coffeeBeans;
        public int cost;

        CoffeeType(int water, int milk, int coffeeBeans, int cost) {
            this.water = water;
            this.milk = milk;
            this.coffeeBeans = coffeeBeans;
            this.cost = cost;
        }
    }

    enum Action {
        BUY("B"),
        FILL("F"),
        TAKE("T"),
        REMAINING("R"),
        EXIT("E");

        String shortHand;

        Action(String shortHand) {
            this.shortHand = shortHand;
        }

        public boolean compare (String input) {
            return name().equals(input) || shortHand.equals(input);
        }

        public static Action select(String input) {
            input = input.toUpperCase();

            for (int i = 0; i < Action.values().length; i++) {
                Action action = Action.values()[i];
                if(action.compare(input)){
                    return action;
                }
            }
            return null;
        }
    }

    public static void main(String[] args){
        CoffeeMachine machine = new CoffeeMachine(400,540,120,9,550);

        while(true) {

            Action currentAction;
            do{
                System.out.print("\nWrite action ( [B]uy, [F]ill, [T]ake, [R]emaining, [E]xit ):\n> ");
                currentAction = Action.select(scanner.next());

            } while (currentAction == null);

            switch (currentAction){
                case BUY:
                    machine.buy();
                    break;
                case FILL:
                    machine.fill();
                    break;
                case TAKE:
                    machine.take();
                    break;
                case REMAINING:
                    machine.showResources();
                    break;
                case EXIT:
                    System.out.println("Closing application!");
                    return;
                /*
                case "buy":
                case "b":
                    machine.buy();
                    break;
                case "fill":
                case "f":
                    machine.fill();
                    break;
                case "take":
                case "t":
                    machine.take();
                    break;
                case "remaining":
                case "r":
                    machine.showResources();
                    break;
                case "exit":
                case "e":
                    System.out.println("Closing application!");
                    return;*/
                default:
                    System.out.println("Error! unknown action!");
            }
        }

    }



    public void buy() {
        System.out.println("Please select the coffee type: ");
        int i = 1;
        for (CoffeeType coffee : CoffeeType.values()) { //showing a list of every item of coffeeTypes array
            System.out.printf("[%d] %s: $%d\n", i++, coffee.name(), coffee.cost);
        }
        System.out.print("[back]\n> ");

        String action = scanner.next();

        if (action.equals("back")) {
            return;
        }

        int requestedCoffee;

        //making sure the action is a valid input
        try {
            requestedCoffee = Integer.parseInt(action);//casting string to int
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Invalid selection!");
            return;
        }

        if (requestedCoffee < 1 || requestedCoffee > CoffeeType.values().length) {
            System.out.println("No such coffee type!");
            return;
        }

        CoffeeType coffee = CoffeeType.values()[requestedCoffee-1];//using action to select an item from the coffeeTypes array

        if (hasEnoughResources(coffee)) { //checks if machine can make that coffee
            System.out.println("I have enough resources, making you a coffee!");
            money += coffee.cost; //taking money

            makeCoffee(coffee); //making the coffee
        }
    }

    private boolean hasEnoughResources(CoffeeType coffee) {
        if (availableWater < coffee.water) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        else if(availableMilk < coffee.milk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        else if(availableCoffeeBeans < coffee.coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
        else if(availableCups < 1) {
            System.out.println("Sorry, not enough cups!");
            return false;
        }
        else {
            return true;
        }
    }


    public void makeCoffee(CoffeeType coffee) {
        availableWater -= coffee.water;
        availableMilk -= coffee.milk;
        availableCoffeeBeans -= coffee.coffeeBeans;
        availableCups--;
    }


    public void fill() {
        System.out.print("Write how many ml of water do you want to add:\n> ");
        availableWater += scanner.nextInt();
        System.out.print("Write how many ml of milk do you want to add:\n> ");
        availableMilk += scanner.nextInt();
        System.out.print("Write how many grams of coffee beans do you want to add:\n> ");
        availableCoffeeBeans += scanner.nextInt();
        System.out.print("Write how many disposable cups of coffee do you want to add:\n> ");
        availableCups += scanner.nextInt();
    }



    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }



    public void showResources() {
        System.out.println("\nThe coffee machine has:");
        System.out.printf("%d of water\n", availableWater);
        System.out.printf("%d of milk\n", availableMilk);
        System.out.printf("%d of coffee beans\n", availableCoffeeBeans);
        System.out.printf("%d of disposable cups\n", availableCups);
        System.out.printf("%d of money\n", money);
    }

    public int possibleCoffee(CoffeeType coffeeType) {
        return Math.min(Math.min(Math.min(availableCups, availableWater / coffeeType.water), availableMilk /  coffeeType.milk), availableCoffeeBeans / coffeeType.coffeeBeans);
    }

}