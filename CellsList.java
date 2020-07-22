import java.util.ArrayList;
import java.util.Arrays;

public class CellsList extends ArrayList<int[]> {

        @Override //override to check by the value of int[]
        public boolean contains(Object o) {

            for (int[] a : this) {
                if(Arrays.equals(a, (int[]) o)) {
                    return true;
                }
            }

            return false;
        }
    }
