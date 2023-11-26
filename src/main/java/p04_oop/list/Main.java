package p04_oop.list;

public class Main {
    public static void main(String[] args) {
        IntList list = new IntList();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(9);

        System.out.println(list);
        System.out.println(list.get(4));
       /*
       System.out.println(list.size());


        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
  */

    }
}
