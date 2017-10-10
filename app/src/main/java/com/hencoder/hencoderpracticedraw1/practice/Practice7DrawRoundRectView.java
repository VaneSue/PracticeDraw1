package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice7DrawRoundRectView extends View {
    Paint mPaint;

    public Practice7DrawRoundRectView(Context context) {
        super(context);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形

        canvas.drawRoundRect(100, 100, 400, 400, 40, 40, mPaint);
        canvas.drawRoundRect(new RectF(500, 100, 900, 600), 20, 20, mPaint);
    }
}
