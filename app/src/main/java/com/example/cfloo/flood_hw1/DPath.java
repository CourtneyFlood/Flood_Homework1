package com.example.cfloo.flood_hw1;


import android.graphics.Path;

public class DPath {
    public int color;
    public int strokeWidth;
    public Path path;

    public DPath(int color, int strokeWidth, Path path){
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}
