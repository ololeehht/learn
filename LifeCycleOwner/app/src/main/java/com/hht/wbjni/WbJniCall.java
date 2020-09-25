package com.hht.wbjni;

import android.graphics.Canvas;

public class WbJniCall {
    public static native boolean fbStart(int fbmode);

    public static native void fbStop();

    public static native void fbSetCanvas(Canvas canvas1, Canvas canvas2, Canvas canvas3);

    static {
        System.loadLibrary("whiteboard_celerate");
    }

}
