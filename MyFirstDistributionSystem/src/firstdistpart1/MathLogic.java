package firstdistpart1;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 7/9/13
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathLogic implements Serializable {

    public int add(int x, int y){
        return x + y;
    }

    public int sub(int x, int y){
        return x - y;
    }

    public int add(int x, int y, int z){
        return x + y +  z;
    }
}
