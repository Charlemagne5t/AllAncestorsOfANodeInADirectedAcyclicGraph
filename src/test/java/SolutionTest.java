import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void test1(){
        int n = 8;
        int[][] edges = {
                {0,3},
                {0,4},
                {1,3},
                {2,4},
                {2,7},
                {3,5},
                {3,6},
                {3,7},
                {4,6}
        };
        List<List<Integer>> expected = List.of(
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(List.of(0,1)),
                new ArrayList<>(List.of(0,2)),
                new ArrayList<>(List.of(0,1,3)),
                new ArrayList<>(List.of(0,1,2,3,4)),
                new ArrayList<>(List.of(0,1,2,3))
        );
        List<List<Integer>> actual = new Solution().getAncestors(n, edges);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int n = 5;
        int[][] edges = {
                {0,1},
                {0,2},
                {0,3},
                {0,4},
                {1,2},
                {1,3},
                {1,4},
                {2,3},
                {2,4},
                {3,4}
        };
        List<List<Integer>> expected = List.of(
                new ArrayList<>(),
                new ArrayList<>(List.of(0)),
                new ArrayList<>(List.of(0,1)),
                new ArrayList<>(List.of(0,1,2)),
                new ArrayList<>(List.of(0,1,2,3))
        );
        List<List<Integer>> actual = new Solution().getAncestors(n, edges);

        Assert.assertEquals(expected, actual);
    }
}
