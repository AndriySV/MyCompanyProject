package com.mycompanyConsApp2;

import com.mycompany.CommonUtility;
import org.apache.commons.lang3.StringUtils;

public class ConsoleApp2 {

    public static void main(String[] args) {
        String appName = CommonUtility.getAppName();
        System.out.println("App 2 - Welcome to " + appName);
        System.out.println(StringUtils.abbreviate("Andrii Svyryd", 7));
    }
}
