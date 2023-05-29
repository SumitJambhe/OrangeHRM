package com.orangehrm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromHRMTestDataProp {
    public static String getPropData(String key) throws IOException
    {
        Properties prop=new Properties();//specification wise object
        String path= System.getProperty("user.dir")+ "\\src\\test\\java\\com\\orangehrm\\testdata\\HRMTestData.properties";//location
        FileInputStream fis=new FileInputStream(path);//access
        prop.load(fis);//IOException

        String value = prop.getProperty(key);
        return value;
    }

    public static String getPropDataConfig(String key) throws IOException
    {
        Properties prop=new Properties();//specification wise object
        String path= System.getProperty("user.dir")+ "\\src\\test\\java\\com\\orangehrm\\driverscript\\configuration.properties";//location
        FileInputStream fis=new FileInputStream(path);//access
        prop.load(fis);//IOException

        String value = prop.getProperty(key);
        return value;
    }
}
