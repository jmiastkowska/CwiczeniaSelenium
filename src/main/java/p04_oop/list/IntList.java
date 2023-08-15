package p04_oop.list;

public class IntList {
    private int[] data = new int[3];   //{4,0,0}
    private int size = 0;

    public void add(int element){ //4
        //4 -> data[0]=4
        //7 -> data[1]=7
       if(size==data.length){
           int[] biggerData = new int [data.length+10];
       }
        data[size++]=element;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int get(int index){
        return index;
    }

    public String toString(){
        String str = "";
        for (int i = 0; i < size; i++) {
            str+=data[i]+",";
        }
        return str;
    }
}
