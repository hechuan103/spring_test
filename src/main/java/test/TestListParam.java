package main.java.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hechuan on 2017/8/8.
 */
public class TestListParam {

    public void testListParam(String ar1){

        List<String> param = null;

        if (ar1.equals("a1")){
            param = new ArrayList<String>();
            createMessage(param,ar1);
        }

        for (String arg:param) {
            System.out.println(arg);
        }
    }

    private void createMessage(List<String> param, String ar1) {

        param.add("当前的值"+ar1);

    }

    public static void main(String[] args) {

        TestListParam testListParam = new TestListParam();
        testListParam.testListParam("a1");
    }

}
