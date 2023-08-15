package p04_oop.list;

public abstract class IntCollection {
    protected int[] data = new int[4];
    protected int size=0;

    public int size(){
        return size;
    }
    public int get(int index){
        if(index>=size){
            throw new ArrayIndexOutOfBoundsException(index);
        } return data[index];
    };
    protected void grow(){
        int[] biggerData = new int[data.length +10];
        //{4,7,9,0,0,....0}
        System.arraycopy(data,0, biggerData,0, data.length);
        data = biggerData;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public String toString(){
        String str = "";
        for (int i = 0; i < size; i++) {
            str+=data[i]+",";
        }
        return str;
    }
}
