package com.lym.stadybymyself.designpattern.demo.adapterpattern;


import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-6.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        LogUtil.i("playMp4: " + fileName);
    }
}
