package com.mycompanyConsApp;

import com.mycompany.CommonUtility;
import org.apache.commons.lang3.StringUtils;

public class ConsoleApp {

    public static void main(String[] args) {
        String appName = CommonUtility.getAppName();
        System.out.println("Welcome to " + appName);

        System.out.println(StringUtils.abbreviate(getFullName(), 7));

    }

    public static String getFullName() {
        return "Andrii Svyryd";
    }
}
