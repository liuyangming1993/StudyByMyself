package com.lym.stadybymyself.designpattern.demo.proxypattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-14.
 */
public class RealImage implements Image {
    private String mFileName;

    public RealImage(String fileName) {
        mFileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        LogUtil.i("loadFromDisk: " + fileName);
    }

    @Override
    public void display() {
        LogUtil.i("display: " + mFileName);
    }
}
