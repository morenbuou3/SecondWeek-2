import java.util.ArrayList;
import java.util.List;

public class Prime {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getPrime(Integer start, Integer end) {
        if (start > end){
            return null;
        }
        if (start <= 1){
            start = 2;
        }
        boolean flag;
        for (int i = start; i <= end; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }
        return list;
    }
}
