package testBase;

import base.BaseClass;

import java.util.List;

public class TestBase extends BaseClass {

    public static boolean compareListsOfString(List<String> actual, List<String> expected) {
        boolean flag;

        int length = actual.size();
        int count = 0;

        for (int i = 0; i < length; i++) {
            String actualString = actual.get(i);
            String expString = expected.get(i);

            if (!actualString.trim().equalsIgnoreCase(expString)) {
                count++;
                System.out.println("***MISMATCH***");
                System.out.println("ACTUAL: " + actualString);
                System.out.println("EXPECTED: " + expString);
            }
        }

        if (count > 0) {
            flag = false;
        } else {
            flag = true;
        }

        return flag;
    }

    public boolean compareTwoStrings(String str1, String str2) {
        boolean flag = false;

        if (str1.trim().equalsIgnoreCase(str2.trim())) {
            flag = true;
        }

        return flag;
    }

}
