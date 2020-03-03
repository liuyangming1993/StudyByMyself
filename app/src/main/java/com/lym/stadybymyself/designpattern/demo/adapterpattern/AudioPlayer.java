package com.lym.stadybymyself.designpattern.demo.adapterpattern;


import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-6.
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mMediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //支持MP3文件
        if (audioType.equals("MP3")) {
            LogUtil.i("playMp3: " + fileName);
        } else {//不支持的文件由MediaAdapter来播放
            mMediaAdapter = new MediaAdapter(audioType);
            mMediaAdapter.play(audioType, fileName);
        }
    }
}
