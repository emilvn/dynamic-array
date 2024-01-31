public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Emil");
        Person person2 = new Person("Victor");
        Person person3 = new Person("Simon");
        Person person4 = new Person("Axel");
        Person person5 = new Person("Jonas");
        Person[] people = new Person[]{person1, person2, person3, person4, person5};

        DynamicArray dynamicArray = new DynamicArray(people);

        dynamicArray.printArray();
        dynamicArray.insert(0, person1);
        dynamicArray.printArray();
    }
}
