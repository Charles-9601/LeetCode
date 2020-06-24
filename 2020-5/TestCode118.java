import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCode118 {
    public static void main(String[] args) {
        generate(6);
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList();
        int len = 1;
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList(len);
            row.add(1);
            if(i>0){
                List<Integer> LastRow = result.get(i-1);
                for(int j=1;j<len;j++){
                    if(j<LastRow.size()){
                        row.add(LastRow.get(j-1)+LastRow.get(j));
                    }
                }
                row.add(1);
            }
            result.add(row);
            len++;
        }
        System.out.println(result);
        return result;
    }
}
