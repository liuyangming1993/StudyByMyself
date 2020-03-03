package com.lym.stadybymyself.designpattern.demo.adapterpattern;

/**
 * Created by liuyangming on 17-11-6.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer mAdvancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equals("VLC")) {
            mAdvancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equals("MP4")) {
            mAdvancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("VLC")) {
            mAdvancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equals("MP4")) {
            mAdvancedMediaPlayer.playMp4(fileName);
        }
    }
}
