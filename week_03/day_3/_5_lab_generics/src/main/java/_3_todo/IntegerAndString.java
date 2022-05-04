package _3_todo;

public class IntegerAndString implements GenericInterface<Integer, String>{

    public String doSomeOperations(Integer integer){
        return integer.toString();
    }

    public Integer doReverseOperations(String s){
        return Integer.parseInt(s);
    }
}
