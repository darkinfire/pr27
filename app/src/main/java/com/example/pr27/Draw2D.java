package com.example.pr27;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {

    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;
    private Bitmap mBitmap1;
    private Bitmap mBitmap2;


    public Draw2D(Context context) {
        super(context);

        // Выводим значок из ресурсов
        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.ship);
        mBitmap1 = BitmapFactory.decodeResource(res, R.drawable.seas1);
        mBitmap2 = BitmapFactory.decodeResource(res, R.drawable.seas2);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);

        // закрашиваем холст белым цветом
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        // Рисуем жёлтый круг
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(width -120, 130, 90, mPaint);

        // Рисуем blue прямоугольник
        mPaint.setColor(Color.CYAN);
        canvas.drawRect(0, canvas.getHeight() - 400, width, height + 500, mPaint);

        // Рисуем blue прямоугольник темная сторона
        mPaint.setColor(Color.parseColor("#00BCD4"));
        //canvas.drawRect(0, 1200, 1100, 1050, mPaint);
        //canvas.drawRect(0, canvas.getHeight() - 800, width, height - 1000, mPaint); //норм экран
        canvas.drawRect(0, canvas.getHeight() - 300, width, height - 500, mPaint);



        canvas.save();


        // восстанавливаем холст
        canvas.restore();

        // Выводим изображение
        canvas.drawBitmap(mBitmap, width - mBitmap.getWidth(), height - mBitmap.getHeight() - 200, mPaint);

        // Выводим изображение
        canvas.drawBitmap(mBitmap1, width - mBitmap1.getWidth() - 400, height - mBitmap1.getHeight() , mPaint);

        // Выводим изображение
        canvas.drawBitmap(mBitmap2, width - mBitmap2.getWidth() - 100, height - mBitmap2.getHeight(), mPaint);

        // Выводим изображение
        canvas.drawBitmap(mBitmap1, width - mBitmap1.getWidth() - 600, height - mBitmap1.getHeight(), mPaint);

        // Выводим изображение
        canvas.drawBitmap(mBitmap1, width - mBitmap1.getWidth() + 15, height - mBitmap1.getHeight(), mPaint);

    }
}
