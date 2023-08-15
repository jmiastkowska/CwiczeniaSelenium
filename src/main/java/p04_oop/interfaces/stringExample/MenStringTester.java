package p04_oop.interfaces.stringExample;

public class MenStringTester implements StringTester{
    public boolean acceptTheString(String str){
        return !str.toLowerCase().endsWith("a");
    }
}
