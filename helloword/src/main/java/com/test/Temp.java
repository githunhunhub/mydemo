package com.test;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by zgg on 2017/11/20
 **/

public class Temp {

    @Test
    public void getCert() throws Exception{
        String certPath = "C://Users/Skysea/Desktop/apiclient_cert.p12";
//        String certPath = "C:\\Users\\Skysea\\Desktop\\weke.jpg";
        File file = new File(certPath);

        InputStream in = new FileInputStream(file);
        byte[] out = new byte[in.available()];
        in.read(out);
        in.close();

        System.out.println(out);
    }
}
