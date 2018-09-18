package com.example.cfloo.flood_hw1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;


public class DView extends View {

    public final int dColor = Color.RED;
    public final int dBackground = Color.WHITE;
    public int brushSize = 15;
    private final float touchTol = 4;
    private float dX;
    private float dY;
    private Path dPath;
    private Paint dPaint;
    private ArrayList<DPath> paths = new ArrayList<>();
    private int currentColor;
    private Bitmap dBitmap;
    private Canvas dCanvas;
    private Paint dBitmapPaint = new Paint(Paint.DITHER_FLAG);

    public DView(Context context) {
        this(context, null);
    }

    public DView(Context context, AttributeSet aSet) {
        super(context, aSet);
        dPaint = new Paint();
        dPaint.setColor(dColor);
        dPaint.setStyle(Paint.Style.STROKE);
    }

    public void init(DisplayMetrics metrics) {
        int height = metrics.heightPixels;
        int width = metrics.widthPixels;

        dBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        dCanvas = new Canvas(dBitmap);

        currentColor = dColor;
    }

    public void clear(){
        paths.clear();
        invalidate();
    }

    public void setdColor(int c){
        dPaint.setColor(c);
    }

    @Override
    protected void onDraw(Canvas canvas){
        canvas.save();
        dCanvas.drawColor(dBackground);

        for (DPath dp : paths) {
            dPaint.setStrokeWidth(brushSize);
            dCanvas.drawPath(dp.path, dPaint);
        }

        canvas.drawBitmap(dBitmap, 0, 0, dBitmapPaint);
        canvas.restore();
    }

    private void dStart(float x, float y){
        dPath = new Path();
        DPath dp = new DPath(currentColor, brushSize, dPath);
        paths.add(dp);

        dPath.reset();
        dPath.moveTo(x, y);
        dX = x;
        dY = y;
    }

    private void dMove(float x, float y){
        float dx = Math.abs(x - dX);
        float dy = Math.abs(y - dY);

        if (dx >= touchTol || dy >= touchTol) {
            dPath.quadTo(dX, dY, (x + dX) /2, (y + dY) /2);
            dX = x;
            dY = y;
        }
    }

    private void dStop(){
        dPath.lineTo(dX, dY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        float x = event.getX();
        float y = event.getY();

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN :
                dStart(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE :
                dMove(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP :
                dStop();
                invalidate();
                break;
        }
        return true;
    }
}
