package generic;

public class ParameterizedClass {
    public static void main(String[] args) {
        info<String > info1 = new info<>("privet");
        System.out.println(info1);
        info<Integer > info2 = new info<Integer>(18);
        System.out.println(info2);
    }
}

class info <T>{
    private T value;

    public info(T value){
        this.value=value;
    }
    public String toString (){
        return "{[" + value + "]}";
    }


    }
