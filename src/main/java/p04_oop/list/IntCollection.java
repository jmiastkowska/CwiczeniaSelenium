package p04_oop.list;

public abstract class IntCollection {
    public int size(){}
    public int get(int index){}

    public boolean isEmpty(){
        return size()==0;
    }
}
