package com.nd.smartcan.appfactory.demo;
import android.content.Context;

import com.nd.component.ICertificate;
import com.nd.smartcan.appfactory.delegate.AppCertUtils;

import java.security.interfaces.RSAPublicKey;

/**
 *
 * 签名类
 * Created by syc on 2015/9/14.
 */
public class AppFactoryCertificate implements ICertificate {

    private String mPublicKey= null;


    private String mSerialNumber=null;

    private String md5=null;


    public AppFactoryCertificate(Context context)
    {
         RSAPublicKey mm=(RSAPublicKey)AppCertUtils.getSingInfo(context).getPublicKey();
         mPublicKey=mm.getModulus().toString(16);
    }

    public String setMd5(String md5) {
        return this.md5=md5;
    }
    public String getMd5() {
        return md5;
    }

    /**
     * 获取公钥信息。
     */
    @Override
    public String getPublicKey() {
        return mPublicKey;
    }

    /**
     * 获取序列号。
     */
    @Override
    public String getSerialNumber() {
        return mSerialNumber;
    }
}
