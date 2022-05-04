package _3_todo;

public class StringAndInteger implements GenericInterface<String, Integer>{

    public Integer doSomeOperations(String s){
        return Integer.parseInt(s);
    }

    public String doReverseOperations(Integer integer){
        return integer.toString();
    }



}
