class Cat {
    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;

        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}


/*
class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("c1", 3);
        Cat c2 = new Cat("c2", 4);
        Cat c3 = new Cat("c3", 5);
        Cat c4 = new Cat("c4", 6);
        Cat c5 = new Cat("c5", 3);
        Cat c6 = new Cat("c6", 4);
        Cat c7 = new Cat("c7", 6);

        System.out.println(Cat.getNumberOfCats());
    }
}*/

