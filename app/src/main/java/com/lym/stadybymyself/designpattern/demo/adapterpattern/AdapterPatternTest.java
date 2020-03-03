package com.lym.stadybymyself.designpattern.demo.adapterpattern;

/**
 * Created by liuyangming on 17-11-6.
 */
public class AdapterPatternTest {
    public static void test() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3","小永远.mp3");
        audioPlayer.play("MP4","凉凉.mp4");
        audioPlayer.play("VLC","魔鬼中的天使.vlc");
    }
}
