package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {

    Paint mPaint;

    public Practice3DrawRectView(Context context) {
        super(context);
        mPaint = new Paint();
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形

        canvas.drawRect(50, 50, 200, 200, mPaint);

        canvas.drawRect(new Rect(300, 300, 550, 550), mPaint);

        canvas.drawRect(new RectF(600, 300, 900, 600), mPaint);
    }
}
