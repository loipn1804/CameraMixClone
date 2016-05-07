package com.cameramixclone;

/**
 * Created by USER on 05/07/2016.
 */
public class MyFrame {

    private byte[] frame;

    public MyFrame(byte[] frame) {
        this.frame = frame;
    }

    public byte[] getFrame() {
        return frame;
    }

    public void setFrame(byte[] frame) {
        this.frame = frame;
    }
}
