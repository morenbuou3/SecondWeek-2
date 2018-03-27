import java.util.List;

public class Main {

    public static void main(String[] args) {
        Prime prime = new Prime();
        List<Integer> result = prime.getPrime(101, 200);
        if (result == null){
            System.out.println("输入参数有误！");
        }
        for (Integer aResult : result) {
            System.out.println(aResult);
        }
    }
}
