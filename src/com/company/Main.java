package com.company;

import java.io.*;
import javax.sound.sampled.*;

public class Main {

    public static void main(String[] args) {
        try {
            File yourFile;
            AudioInputStream stream;
            AudioFormat format;
            DataLine.Info info;
            Clip clip;

            stream = AudioSystem.getAudioInputStream(new File("C:\\Windows\\Media\\Ring05.wav"));
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();

        }
        catch (Exception e) {
            //whatevers
        }
    }
}
