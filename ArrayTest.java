public class ArrayTest {
    private Person[] people;
    private Person emil;
    private Person victor;
    private Person simon;
    private Person axel;
    private Person jonas;
    private DynamicArray<Person> dynamicArray;
    public ArrayTest(){
        emil = new Person("Emil");
        victor = new Person("Victor");
        simon = new Person("Simon");
        axel = new Person("Axel");
        jonas = new Person("Jonas");
        people = new Person[]{emil, victor, simon, axel, jonas};
        dynamicArray = new DynamicArray<>(people);
    }

    public void testRemoveObject() {
        dynamicArray.printArray();
        dynamicArray.remove(simon);
        dynamicArray.printArray();
    }

    public void testIndexOf() {
        dynamicArray.printArray();
        System.out.println("index of Simon: " + dynamicArray.indexOf(simon));
    }

    public void testInsert() {
        dynamicArray.printArray();
        dynamicArray.insert(2, jonas);
        dynamicArray.printArray();
    }

    public void testAddAll() {
        dynamicArray.printArray();
        dynamicArray.addAll(jonas, axel, victor, simon);
        dynamicArray.printArray();
    }

    public void testClear() {
        dynamicArray.printArray();
        dynamicArray.clear();
        dynamicArray.printArray();
    }

    public void testSet() {
        dynamicArray.printArray();
        dynamicArray.set(2, emil);
        dynamicArray.printArray();
    }

    public void testRemoveIndex() {
        dynamicArray.printArray();
        dynamicArray.remove(2);
        dynamicArray.printArray();
    }

    public void testRemoveLast() {
        dynamicArray.printArray();
        dynamicArray.remove();
        dynamicArray.printArray();
    }

    public void testSize() {
        System.out.println(dynamicArray.size());
    }

    public void testGet() {
        System.out.println(dynamicArray.get(2));
    }

    public void testAdd() {
        dynamicArray.printArray();
        dynamicArray.add(emil);
        dynamicArray.printArray();
    }
}
