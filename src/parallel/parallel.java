package parallel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class parallel {

	public static void main(String[] args) {
        List<List<Integer>> dots = List.of(
            List.of(1, 4), 
            List.of(9, 2), 
            List.of(3, 8), 
            List.of(11, 6)
        );

        List<String> Result = new ArrayList<>();

        // 모든 가능한 조합을 생성하고 계산
        for (int i = 0; i < dots.size(); i++) {
            for (int j = i + 1; j < dots.size(); j++) {
                int x = dots.get(i).get(0) - dots.get(j).get(0);
                int y = dots.get(i).get(1) - dots.get(j).get(1);
                double z = x/y;
                
                Result.add(String.valueOf(z));
            }
        }
        
        
        
        for (String res : Result) {
            System.out.println(res);
        }   

        
    }
}
