package org.song.videoplayer.floatwindow;

/**
 * Created by song on 2018/1/10.
 * 浮窗参数
 */
public class FloatParams implements Cloneable {

    public int x;//中心点x
    public int y;//中心点y
    public int w;//宽
    public int h;//高
    public int round;//圆角 SDK_INT >= 21
    public float fade = 1;//透明度0-1 SDK_INT >= 11
    public boolean canMove = true;//是否可以移动


    @Override
    public FloatParams clone() {
        FloatParams stu = null;
        try {
            stu = (FloatParams) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }

}