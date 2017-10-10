package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    Paint mPaint;

    public Practice8DrawArcView(Context context) {
        super(context);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
//        canvas.drawArc(200, 100, 800, 500, -100, 100, true, mPaint);
        /**
         * drawArc(float left, float top, float right, float bottom,
         * float startAngle,
         * float sweepAngle,
         * boolean useCenter,
         * Paint paint)
         * 90度角开始
         left, top, right, bottom 描述的是这个弧形所在的椭圆；
         startAngle 是弧形的起始角度（x 轴的正向，即正右的方向，是 0 度的位置；顺时针为正角度，逆时针为负角度），
         sweepAngle 是弧形划过的角度（x 轴的正向，即正右的方向，是 0 度的位置；顺时针为正角度，逆时针为负角度）；
         useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形。
         */
        canvas.drawArc(new RectF(200, 100, 800, 500), -20, -60, true, mPaint);
        canvas.drawArc(new RectF(200, 100, 800, 500), 20, 140, false, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(new RectF(200, 100, 800, 500), 180, 80, false, mPaint);
    }
}
