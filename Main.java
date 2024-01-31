public class Main {
    DynamicArray dynamicArray;
    public static void main(String[] args) {
        Main main = new Main();

        main.test();
    }

    public void test(){
        Person person1 = new Person("Emil");
        Person person2 = new Person("Victor");
        Person person3 = new Person("Simon");
        Person person4 = new Person("Axel");
        Person person5 = new Person("Jonas");
        Person[] people = new Person[]{person1, person2, person3, person4, person5};

        dynamicArray = new DynamicArray(people);
        dynamicArray.printArray();
        //testAdd();
        //testRemoveLast();
        //testRemoveIndex();
        //testAddAll();
        //testInsert();
        testRemoveObject();
    }
    public void testAdd(){
        System.out.println("Test add");
        Person person = new Person("Ali");
        dynamicArray.add(person);
        dynamicArray.printArray();
    }
    public void testRemoveLast(){
        System.out.println("Test remove last");
        dynamicArray.remove();
        dynamicArray.printArray();
    }
    public void testRemoveIndex(){
        System.out.println("Test remove index");
        dynamicArray.remove(3);
        dynamicArray.printArray();
    }
    public void testAddAll(){
        Person person = new Person("Ali");
        Person person1 = new Person("H");
        Person person2 = new Person("Tulle");
        System.out.println("Test add all");
        dynamicArray.addAll(person1, person2, person);
        dynamicArray.printArray();
    }

    public void testInsert(){
        System.out.println("Test insert");
        Person person = new Person("Magnus");
        dynamicArray.insert(3, person);
        dynamicArray.printArray();
    }

    public void testRemoveObject(){
        Person person = new Person("NewPerson");
        System.out.println("Test remove object");
        System.out.println("Insert new");
        dynamicArray.insert(3, person);
        dynamicArray.printArray();
        System.out.println("Remove");
        dynamicArray.remove(person);
        dynamicArray.printArray();
    }
}
