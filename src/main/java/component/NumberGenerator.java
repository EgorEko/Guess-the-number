package component;

import java.util.Random;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class NumberGenerator {

    public int generate(){
        return new Random().nextInt(10);
    }
}
