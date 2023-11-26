package p04_oop.interfaces.stringExample;

public class WomanStringTester implements StringTester{
    public boolean acceptTheString(String str){
        return str.toLowerCase().endsWith("a");
    }
}
