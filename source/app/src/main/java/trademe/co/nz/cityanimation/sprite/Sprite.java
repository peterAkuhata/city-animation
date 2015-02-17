package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * Created by peterakuhata on 6/02/15.
 */
public abstract class Sprite {
    private Paint paint;
    private Rect bounds;

    public Paint getPaint() {
        return paint;
    }

    public Rect getBounds() {
        return bounds;
    }

    public void setBounds(Rect bounds) {
        this.bounds = bounds;
    }

    public Sprite(Rect bounds) {
        this();

        this.bounds = bounds;
    }

    public Sprite() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.5f);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public final void draw(Canvas canvas) {
        drawImpl(canvas);
    }

    public final void draw(Canvas canvas, Rect bounds) {
        this.bounds = bounds;
        drawImpl(canvas);
    }

    protected abstract void drawImpl(Canvas canvas);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
