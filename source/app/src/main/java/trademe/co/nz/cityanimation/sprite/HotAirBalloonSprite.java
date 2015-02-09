package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 5/02/15.
 */
public class HotAirBalloonSprite extends Sprite {
    public HotAirBalloonSprite(Rect bounds) {
        super(bounds);
    }

    public HotAirBalloonSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        x = (float)(bounds.left + Math.floor(bounds.width() * 0.03965f - 0.44f) + 0.94f);
        y = (float) (bounds.top + Math.floor(bounds.height() * 0.02175f - 0.19f) + 0.69f);
        right = x + (float) (Math.floor(bounds.width() * 0.95940f + 0.49f) - Math.floor(bounds.width() * 0.03965f - 0.44f) - 0.93f);
        bottom = y + (float) (Math.floor(bounds.height() * 0.96555f + 0.2f) - Math.floor(bounds.height() * 0.02175f - 0.19f) - 0.38f);
        RectF balloon = new RectF(x, y, right, bottom);

        //// balloon
        {
            //// Bezier 33 Drawing
            Path bezier33Path = new Path();
            bezier33Path.moveTo(balloon.left + 0.41657f * balloon.width(), balloon.top + 1.00000f * balloon.height());
            bezier33Path.lineTo(balloon.left + 0.61627f * balloon.width(), balloon.top + 1.00000f * balloon.height());
            bezier33Path.cubicTo(balloon.left + 0.63624f * balloon.width(), balloon.top + 1.00000f * balloon.height(),
                    balloon.left + 0.65399f * balloon.width(), balloon.top + 0.99049f * balloon.height(),
                    balloon.left + 0.65399f * balloon.width(), balloon.top + 0.97691f * balloon.height());
            bezier33Path.lineTo(balloon.left + 0.65399f * balloon.width(), balloon.top + 0.83020f * balloon.height());
            bezier33Path.lineTo(balloon.left + 0.38107f * balloon.width(), balloon.top + 0.83020f * balloon.height());
            bezier33Path.lineTo(balloon.left + 0.38107f * balloon.width(), balloon.top + 0.97691f * balloon.height());
            bezier33Path.cubicTo(balloon.left + 0.37885f * balloon.width(), balloon.top + 0.98913f * balloon.height(),
                    balloon.left + 0.39438f * balloon.width(), balloon.top + 1.00000f * balloon.height(),
                    balloon.left + 0.41657f * balloon.width(), balloon.top + 1.00000f * balloon.height());
            bezier33Path.close();
            canvas.drawPath(bezier33Path, getPaint());

            //// Bezier 43 Drawing
            Path bezier43Path = new Path();
            bezier43Path.moveTo(balloon.left + 0.40326f * balloon.width(), balloon.top + 0.83156f * balloon.height());
            bezier43Path.lineTo(balloon.left + 0.50977f * balloon.width(), balloon.top + 0.72425f * balloon.height());
            bezier43Path.lineTo(balloon.left + 0.62071f * balloon.width(), balloon.top + 0.83020f * balloon.height());
            canvas.drawPath(bezier43Path, getPaint());

            //// Bezier 47 Drawing
            Path bezier47Path = new Path();
            bezier47Path.moveTo(balloon.left + 0.50755f * balloon.width(), balloon.top + 0.71881f * balloon.height());
            bezier47Path.cubicTo(balloon.left + 0.50755f * balloon.width(), balloon.top + 0.71881f * balloon.height(),
                    balloon.left + 1.10220f * balloon.width(), balloon.top + 0.45528f * balloon.height(),
                    balloon.left + 0.98460f * balloon.width(), balloon.top + 0.18089f * balloon.height());
            bezier47Path.cubicTo(balloon.left + 0.95576f * balloon.width(), balloon.top + 0.11161f * balloon.height(),
                    balloon.left + 0.90472f * balloon.width(), balloon.top + 0.13063f * balloon.height(),
                    balloon.left + 0.90472f * balloon.width(), balloon.top + 0.13063f * balloon.height());
            bezier47Path.cubicTo(balloon.left + 0.90472f * balloon.width(), balloon.top + 0.13063f * balloon.height(),
                    balloon.left + 0.88032f * balloon.width(), balloon.top + 0.05184f * balloon.height(),
                    balloon.left + 0.72721f * balloon.width(), balloon.top + 0.04912f * balloon.height());
            bezier47Path.cubicTo(balloon.left + 0.72721f * balloon.width(), balloon.top + 0.04912f * balloon.height(),
                    balloon.left + 0.66287f * balloon.width(), balloon.top + -0.03102f * balloon.height(),
                    balloon.left + 0.52086f * balloon.width(), balloon.top + 0.01516f * balloon.height());
            bezier47Path.cubicTo(balloon.left + 0.50533f * balloon.width(), balloon.top + 0.02060f * balloon.height(),
                    balloon.left + 0.40104f * balloon.width(), balloon.top + -0.03510f * balloon.height(),
                    balloon.left + 0.31229f * balloon.width(), balloon.top + 0.03826f * balloon.height());
            bezier47Path.cubicTo(balloon.left + 0.31229f * balloon.width(), balloon.top + 0.03826f * balloon.height(),
                    balloon.left + 0.15918f * balloon.width(), balloon.top + 0.03282f * balloon.height(),
                    balloon.left + 0.12368f * balloon.width(), balloon.top + 0.12248f * balloon.height());
            bezier47Path.cubicTo(balloon.left + 0.12368f * balloon.width(), balloon.top + 0.12248f * balloon.height(),
                    balloon.left + -0.04717f * balloon.width(), balloon.top + 0.12112f * balloon.height(),
                    balloon.left + 0.01274f * balloon.width(), balloon.top + 0.29228f * balloon.height());
            bezier47Path.cubicTo(balloon.left + 0.07487f * balloon.width(), balloon.top + 0.46343f * balloon.height(),
                    balloon.left + 0.18803f * balloon.width(), balloon.top + 0.57482f * balloon.height(),
                    balloon.left + 0.50755f * balloon.width(), balloon.top + 0.71881f * balloon.height());
            bezier47Path.close();
            canvas.drawPath(bezier47Path, getPaint());

            //// Bezier 53 Drawing
            Path bezier53Path = new Path();
            bezier53Path.moveTo(balloon.left + 0.31229f * balloon.width(), balloon.top + 0.03146f * balloon.height());
            bezier53Path.cubicTo(balloon.left + 0.31229f * balloon.width(), balloon.top + 0.03146f * balloon.height(),
                    balloon.left + 0.24794f * balloon.width(), balloon.top + 0.25152f * balloon.height(),
                    balloon.left + 0.35666f * balloon.width(), balloon.top + 0.44034f * balloon.height());
            bezier53Path.cubicTo(balloon.left + 0.46317f * balloon.width(), balloon.top + 0.62508f * balloon.height(),
                    balloon.left + 0.50755f * balloon.width(), balloon.top + 0.71338f * balloon.height(),
                    balloon.left + 0.50755f * balloon.width(), balloon.top + 0.71338f * balloon.height());
            bezier53Path.cubicTo(balloon.left + 0.12368f * balloon.width(), balloon.top + 0.43898f * balloon.height(),
                    balloon.left + 0.12368f * balloon.width(), balloon.top + 0.12112f * balloon.height(),
                    balloon.left + 0.12368f * balloon.width(), balloon.top + 0.12112f * balloon.height());
            canvas.drawPath(bezier53Path, getPaint());

            //// Bezier 57 Drawing
            Path bezier57Path = new Path();
            bezier57Path.moveTo(balloon.left + 0.90694f * balloon.width(), balloon.top + 0.12519f * balloon.height());
            bezier57Path.cubicTo(balloon.left + 0.90694f * balloon.width(), balloon.top + 0.12519f * balloon.height(),
                    balloon.left + 0.89363f * balloon.width(), balloon.top + 0.47158f * balloon.height(),
                    balloon.left + 0.51420f * balloon.width(), balloon.top + 0.71338f * balloon.height());
            bezier57Path.lineTo(balloon.left + 0.51420f * balloon.width(), balloon.top + 0.00837f * balloon.height());
            canvas.drawPath(bezier57Path, getPaint());

            //// Bezier 61 Drawing
            Path bezier61Path = new Path();
            bezier61Path.moveTo(balloon.left + 0.72943f * balloon.width(), balloon.top + 0.04369f * balloon.height());
            bezier61Path.cubicTo(balloon.left + 0.72943f * balloon.width(), balloon.top + 0.04369f * balloon.height(),
                    balloon.left + 0.79600f * balloon.width(), balloon.top + 0.29228f * balloon.height(),
                    balloon.left + 0.50755f * balloon.width(), balloon.top + 0.71338f * balloon.height());
            canvas.drawPath(bezier61Path, getPaint());
        }
    }
}
