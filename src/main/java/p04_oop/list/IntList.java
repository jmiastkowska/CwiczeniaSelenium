package p04_oop.list;

public class IntList extends IntCollection{

    public void add(int element){ //4
       if(size==data.length){
           grow();
       }
        data[size++]=element;
    }


}
