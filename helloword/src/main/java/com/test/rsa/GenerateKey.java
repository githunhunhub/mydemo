package com.test.rsa;

import org.junit.Test;

import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zgg on 2017/12/1
 **/

public class GenerateKey {

    @Test
    public void generate() throws Exception{
        Map<String, String> key = generateKeyPair();
        System.out.println(key.get("publicKey"));
        System.out.println("------------------------");
        System.out.println(key.get("privateKey"));
    }

    /** 指定key的大小 */
    private static int KEYSIZE = 1024;
    public static final String CHAR_ENCODING = "UTF-8";
    public static final String RSA_ALGORITHM = "RSA/ECB/PKCS1Padding";
    /**
     * 生成密钥对
     */
    public static Map<String, String> generateKeyPair() throws Exception{
        /** RSA算法要求有一个可信任的随机数源 */
        SecureRandom sr = new SecureRandom();
        /** 为RSA算法创建一个KeyPairGenerator对象 */
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        /** 利用上面的随机数据源初始化这个KeyPairGenerator对象 */
        kpg.initialize(KEYSIZE, sr);
        /** 生成密匙对 */
        KeyPair kp = kpg.generateKeyPair();
        /** 得到公钥 */
        Key publicKey = kp.getPublic();
        byte[] publicKeyBytes = publicKey.getEncoded();
        String pub = new String(Base64.encodeBase64(publicKeyBytes),
                CHAR_ENCODING);
        /** 得到私钥 */
        Key privateKey = kp.getPrivate();
        byte[] privateKeyBytes = privateKey.getEncoded();
        String pri = new String(Base64.encodeBase64(privateKeyBytes),
                CHAR_ENCODING);

        Map<String, String> map = new HashMap<String, String>();
        map.put("publicKey", pub);
        map.put("privateKey", pri);
        RSAPublicKey rsp = (RSAPublicKey) kp.getPublic();
        BigInteger bint = rsp.getModulus();
        byte[] b = bint.toByteArray();
        byte[] deBase64Value = Base64.encodeBase64(b);
        String retValue = new String(deBase64Value);
        map.put("modulus", retValue);
        return map;
    }
}
