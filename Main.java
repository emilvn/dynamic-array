public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Emil");
        Person person2 = new Person("Victor");
        Person person3 = new Person("Simon");
        Person person4 = new Person("Axel");
        Person person5 = new Person("Jonas");
        Person[] people = new Person[]{person1, person2, person3, person4, person5};

        DynamicArray dynamicArray = new DynamicArray(people);

        Person person6 = new Person("Rasmus");
        dynamicArray.add(person6);
        dynamicArray.printArray();
        dynamicArray.remove(3);
        dynamicArray.printArray();
    }
}
