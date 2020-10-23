package JavaInterview;

import org.testng.annotations.Test;

public class ReverseWordinSentence {
@Test
    void splitfunction() {
    int i = 0;
    String Rev = "Practice selenium";
    String[] SplitRev = Rev.split(" ");
/*    System.out.println(SplitRev[0]);
    System.out.println(SplitRev[1]);*/
    for (i = SplitRev.length - 1; i >= 0; i--) {
        System.out.println(SplitRev[i]);
    }
}
}
