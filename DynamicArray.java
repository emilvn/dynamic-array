public class DynamicArray {
    private Person[] arr;

    public DynamicArray(Person[] arr){
        this.arr = arr;
    }

    public void printArray(){
        for(Person object : arr){
            System.out.println(object);
        }
        System.out.println("---------------------------");
    }

    public void add(Person object){
        Person[] newArr = new Person[size()+1];
        for(int i = 0; i<size(); i++){
            newArr[i] = arr[i];
        }
        newArr[size()] = object;
        arr = newArr;
    }

    public Person get(int index){
        return arr[index];
    }

    public int size(){
        return arr.length;
    }

    public void remove(){
        Person[] newArr = new Person[size()-1];
        for(int i = 0; i<size()-1; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public void remove(int index){
        Person[] newArr = new Person[size()-1];
        for(int i = 0, j = 0; i<size(); i++){
            if(i == index){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        arr = newArr;
    }
    public void set(int index, Person object){
        arr[index] = object;
    }

    public void clear(){
        arr = new Person[0];
    }

    public void addAll(Person... objects){
        int newSize = size() + objects.length;
        Person[] newArr = new Person[newSize];
        for(int i = 0; i<size(); i++){
            newArr[i] = arr[i];
        }
        for(int i = size(), j=0; i<newSize; i++, j++){
            newArr[i] = objects[j];
        }
        arr = newArr;
    }

    public void insert(int index, Person object){
        Person[] newArr = new Person[size()+1];
        if(index == size()){
            add(object);
            return;
        }
        for(int i = 0, j = 0; i<size(); i++, j++){
            if(i == index){
                newArr[i] = object;
                j++;
            }
            newArr[j] = arr[i];
        }
        arr = newArr;
    }

    public int indexOf(Person object){
        for(int i = 0; i<size(); i++){
            if(arr[i].equals(object)){
                return i;
            }
        }
        return -1;
    }

    public void remove(Person object){
        remove(indexOf(object));
    }
}
