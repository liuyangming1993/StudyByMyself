package com.lym.stadybymyself.designpattern.demo.proxypattern;

/**
 * Created by liuyangming on 17-11-14.
 */
public class ProxyImage implements Image {
    private RealImage mRealImage;
    private String mFileName;

    public ProxyImage(String fileName) {
        mFileName = fileName;
    }

    @Override
    public void display() {
        if (mRealImage == null) {
            mRealImage = new RealImage(mFileName);
        }
        mRealImage.display();
    }
}
