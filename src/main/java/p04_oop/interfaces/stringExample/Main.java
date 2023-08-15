package p04_oop.interfaces.stringExample;

public class Main {
    public static void main(String[] args) {
        String [] names = {"Adam","Ewa","Michal","Adi","eWa"};
     //   printWomenOnly(names);
     //   System.out.println("----------");
     //   printMenOnly(names);
    //    System.out.println("----------");
     //   printNamesOnly(names);


        printXXXOnly(names, new WomanStringTester());
    }

    public static void printWomenOnly(String[]names){
        for (String name:names){
            if(name.endsWith("a")){
                System.out.println(name);
            }
        }
    }
    public static void printMenOnly(String[]names){
        for (String name:names){
            if(!name.endsWith("a")){
                System.out.println(name);
            }
        }
    }

    public static void printNamesOnly(String[]names){
        for (String name:names){
            //EwA
            // e,E ->e==E
            //wA,wa-> wA ==wa
            if(name.substring(0,1).equals(name.substring(0,1).toUpperCase()) &&
                    name.substring(1).equals(name.substring(1).toLowerCase())
        ){
                System.out.println(name);
            }
        }
    }
    public static void printXXXOnly(String[]names,StringTester stringTester){
        for (String name:names){

            if(stringTester.acceptTheString(name)){
                System.out.println(name);
            }
        }
    }
}
