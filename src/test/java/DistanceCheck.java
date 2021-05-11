import lombok.extern.slf4j.Slf4j;
import org.junit.Test;




@Slf4j
public class DistanceCheck {


    public static double getDistance(int x1, int y1, int x2, int y2) {
        System.out.println("row pow : "+(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }


    @Test
    public void testDistance() {
        int[] loc_a = {1, 1};
        int[] loc_b = {5, 5};

        System.out.println("distance : "+ getDistance(loc_a[0], loc_a[1], loc_b[0], loc_b[1]));


    }

}
