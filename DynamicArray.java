public class DynamicArray {
    private Person[] arr;
    int size;
    final int growSize = 5;

    public DynamicArray(){
        this.arr = new Person[0];
    }

    public DynamicArray(Person[] people){
        this.size = people.length;
        this.arr = people;
    }

    public void printArray(){
        for(Person object : arr){
            System.out.println(object);
        }
        System.out.println("---------------------------");
    }

    public void add(Person object){
        size++;
        if(size > arr.length){
            grow();
        }
        arr[size-1] = object;
    }

    public Person get(int index){
        return arr[index];
    }

    public int size(){
        return size;
    }

    public void remove(){
        size--;
        arr[size] = null;
    }
    public void remove(int index){
        if(index == -1){
            return;
        }
        for(int i = 0, j = 0; i<size; i++){
            if(i == index){
                continue;
            }
            arr[j] = arr[i];
            j++;
        }
        size--;
        arr[size] = null;
    }
    public void set(int index, Person object){
        arr[index] = object;
    }

    public void clear(){
        arr = new Person[0];
    }

    public void addAll(Person... objects){
        size += objects.length;
        while(size > arr.length){
            grow();
        }
        for(int i = size-objects.length, j=0; i<size; i++, j++){
            arr[i] = objects[j];
        }
    }

    public void insert(int index, Person object){
        size++;
        if(size < index + 1){
            size = index+1;
        }
        while(size > arr.length){
            grow();
        }
        Person[] newArr = new Person[arr.length];
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
        for(int i = 0; i<size; i++){
            if(arr[i].equals(object)){
                return i;
            }
        }
        return -1;
    }

    public void remove(Person object){
        remove(indexOf(object));
    }

    private void grow(){
        Person[] newArr = new Person[size+growSize];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }
}
