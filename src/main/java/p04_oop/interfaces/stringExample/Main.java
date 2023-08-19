package p04_oop.interfaces.stringExample;

public class Main {
    public static void main(String[] args) {
        String [] names = {"Adam","Ewa","Michal","Adi","eWa"};
     //   printWomenOnly(names);
     //   System.out.println("----------");
     //   printMenOnly(names);
    //    System.out.println("----------");
     //   printNamesOnly(names);


        //printXXXOnly(names, new WomanStringTester());
        //printXXXOnly(names, new MenStringTester());
        printXXXOnly(names, new StringTester(){
            @Override
            public boolean acceptTheString(String string){
                return string.toLowerCase().endsWith("a");
            }
        });

        //jezeli intefejs ma tylko jedna metode funkcyjna to mozna zapisac krocej
        //jako lambda
        printXXXOnly(names,(string) -> {return string.toLowerCase().endsWith("a");});
        printXXXOnly(names,string -> {return string.toLowerCase().endsWith("a");});
        printXXXOnly(names,string -> string.toLowerCase().endsWith("a"));  //mozna skrocic do takiej formy jezeli jest tylko jedno wyrazenie (tu string)
        StringTester myStringTester = string -> string.toLowerCase().endsWith("a");
        printXXXOnly(names, myStringTester);
    }

    public static void printXXXOnly(String[]names,StringTester stringTester){
        for (String name:names){

            if(stringTester.acceptTheString(name)){
                System.out.println(name);
            }
        }
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

}
