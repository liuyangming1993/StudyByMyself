package com.lym.stadybymyself.designpattern.demo.adapterpattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-6.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        LogUtil.i("playVlc: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
