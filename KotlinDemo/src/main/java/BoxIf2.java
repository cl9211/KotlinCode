import java.util.Map;

/**
 * Created by CHULEI on 2019/9/5.
 */

interface BoxIf2 extends Map<Integer, String> {
    String get(int key);

    String get(Integer key);
}
