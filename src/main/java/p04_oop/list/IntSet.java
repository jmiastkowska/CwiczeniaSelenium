package p04_oop.list;

public class IntSet {
    private int[] data = new int[3];   //{4,0,0}
    private int size = 0;

    public void add(int element){
        //todo
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
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
