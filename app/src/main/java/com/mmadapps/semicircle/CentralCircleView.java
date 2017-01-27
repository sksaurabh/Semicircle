package com.mmadapps.semicircle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by saurabh.kumar on 7/25/2016.
 */


public class CentralCircleView extends View {

    private Paint circlePaint = new Paint();
    {
        circlePaint.setColor(Color.RED);
        circlePaint.setAntiAlias(true);
    }

    public CentralCircleView(Context context) {
        super(context);
    }

    public CentralCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(0, 0, 200, circlePaint);

    }
}

