package com.pombdev.games.pb.findme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class ZoomView extends SurfaceView implements Runnable {

    private SurfaceHolder surfaceHolder;
    private Thread gameThread = null;
    int screenX;
    int screenY;
    private Paint paint;
    private Canvas canvas;
    Context context;
    volatile boolean playing;

    public ZoomView(Context context, int screenX, int screenY) {
        super(context);
        surfaceHolder = getHolder();
        paint = new Paint();
        this.screenX = screenX;
        this.screenY = screenY;

        this.context = context;
    }

    @Override
    public void run() {
        while(playing) {
            update();
            draw();
            control();
        }

    }

    private void draw() {

    }

    private void update() {

    }

    public void pause() {
        playing = false;
        try {
            gameThread.join();
        } catch (InterruptedException e) {
            Log.e("pause", e.getMessage(), e);
        }
    }

    public void resume() {
        playing = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    /** add sleep before update **/
    private void control() {
        try {
            gameThread.sleep(17);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
