public class DynamicArray<T> {
    private T[] arr;

    public DynamicArray(T[] arr){
        this.arr = arr;
    }
    public DynamicArray(){
        this.arr = (T[]) new Object[0];
    }

    public void printArray(){
        for(T object : arr){
            System.out.println(object);
        }
        System.out.println("---------------------------");
    }

    public void add(T object){
        T[] newArr = (T[])new Object[size()+1];
        if (size() >= 0) System.arraycopy(arr, 0, newArr, 0, size());
        newArr[size()] = object;
        arr = newArr;
    }

    public T get(int index){
        return arr[index];
    }

    public int size(){
        return arr.length;
    }

    public void remove(){
        T[] newArr = (T[])new Object[size()-1];
        if (size() - 1 >= 0) System.arraycopy(arr, 0, newArr, 0, size() - 1);
        arr = newArr;
    }
    public void remove(int index){
        T[] newArr = (T[])new Object[size()-1];
        for(int i = 0, j = 0; i<size(); i++){
            if(i == index){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        arr = newArr;
    }
    public void set(int index, T object){
        arr[index] = object;
    }

    public void clear(){
        arr = (T[])new Object[0];
    }

    public void addAll(T... objects){
        int newSize = size() + objects.length;
        T[] newArr = (T[])new Object[newSize];
        if (size() >= 0) System.arraycopy(arr, 0, newArr, 0, size());
        for(int i = size(), j=0; i<newSize; i++, j++){
            newArr[i] = objects[j];
        }
        arr = newArr;
    }

    public void insert(int index, T object){
        T[] newArr = (T[])new Object[size()+1];
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

    public int indexOf(T object){
        for(int i = 0; i<size(); i++){
            if(arr[i].equals(object)){
                return i;
            }
        }
        return -1;
    }

    public void remove(T object){
        remove(indexOf(object));
    }
}
