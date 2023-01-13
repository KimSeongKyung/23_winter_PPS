import java.util.ArrayList;
import java.util.List;

public class A002_장가은_20230113 {
	 public List<List<Integer>> generate(int numRows) {
	List<List<Integer>> res = new ArrayList<>();
	
    for (int i = 0; i < numRows; i++) {
        List<Integer> row = new ArrayList<>(1);

        if (i != 0) {
            row.add(1);
        }

        for (int j = 0; j < i - 1; j++) {
            List<Integer> before = res.get(i - 1);
            row.add(before.get(j) + before.get(j + 1));
        }

        row.add(1);
        res.add(row);
    }

    return res;
	}
}
