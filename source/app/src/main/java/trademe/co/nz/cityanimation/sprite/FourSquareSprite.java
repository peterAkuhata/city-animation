package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 6/02/15.
 */
public class FourSquareSprite extends Sprite {
    public FourSquareSprite(Rect bounds) {
        super(bounds);
    }

    public FourSquareSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        //// Subframes
        x = bounds.left + 1.5f;
        y = bounds.top + 1.2f;
        right = x + (float) (Math.floor((bounds.width() - 1.5f) * 0.96727f + 1.9f) - 1.4f);
        bottom = y + (float) (Math.floor((bounds.height() - 1.2f) * 0.97727f + 0.9f) - 0.4f);
        RectF dairy = new RectF(x, y, right, bottom);


        //// dairy
        {
            //// Bezier 93 Drawing
            Path bezier93Path = new Path();
            bezier93Path.moveTo(dairy.left + 0.11278f * dairy.width(), dairy.top + 0.18937f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.00000f * dairy.width(), dairy.top + 0.34884f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.00000f * dairy.width(), dairy.top + 0.52159f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.02256f * dairy.width(), dairy.top + 0.53488f * dairy.height());
            bezier93Path.cubicTo(dairy.left + 0.08647f * dairy.width(), dairy.top + 0.57475f * dairy.height(),
                    dairy.left + 0.17293f * dairy.width(), dairy.top + 0.57143f * dairy.height(),
                    dairy.left + 0.23684f * dairy.width(), dairy.top + 0.53488f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.25564f * dairy.width(), dairy.top + 0.52492f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.27444f * dairy.width(), dairy.top + 0.53821f * dairy.height());
            bezier93Path.cubicTo(dairy.left + 0.33835f * dairy.width(), dairy.top + 0.57807f * dairy.height(),
                    dairy.left + 0.42481f * dairy.width(), dairy.top + 0.57807f * dairy.height(),
                    dairy.left + 0.48872f * dairy.width(), dairy.top + 0.53821f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.51128f * dairy.width(), dairy.top + 0.52492f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.52632f * dairy.width(), dairy.top + 0.53156f * dairy.height());
            bezier93Path.cubicTo(dairy.left + 0.59398f * dairy.width(), dairy.top + 0.57143f * dairy.height(),
                    dairy.left + 0.68421f * dairy.width(), dairy.top + 0.57143f * dairy.height(),
                    dairy.left + 0.74812f * dairy.width(), dairy.top + 0.52824f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.75188f * dairy.width(), dairy.top + 0.52492f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.77444f * dairy.width(), dairy.top + 0.53821f * dairy.height());
            bezier93Path.cubicTo(dairy.left + 0.84211f * dairy.width(), dairy.top + 0.57475f * dairy.height(),
                    dairy.left + 0.93233f * dairy.width(), dairy.top + 0.57143f * dairy.height(),
                    dairy.left + 0.99624f * dairy.width(), dairy.top + 0.52492f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.99624f * dairy.width(), dairy.top + 0.52492f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.99624f * dairy.width(), dairy.top + 0.34884f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.87218f * dairy.width(), dairy.top + 0.19269f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.11278f * dairy.width(), dairy.top + 0.19269f * dairy.height());
            bezier93Path.lineTo(dairy.left + 0.11278f * dairy.width(), dairy.top + 0.18937f * dairy.height());
            bezier93Path.close();
            canvas.drawPath(bezier93Path, getPaint());

            //// Bezier 95 Drawing
            Path bezier95Path = new Path();
            bezier95Path.moveTo(dairy.left + 0.00000f * dairy.width(), dairy.top + 0.34884f * dairy.height());
            bezier95Path.lineTo(dairy.left + 0.56767f * dairy.width(), dairy.top + 0.34884f * dairy.height());
            canvas.drawPath(bezier95Path, getPaint());


            //// Bezier 97 Drawing
            Path bezier97Path = new Path();
            bezier97Path.moveTo(dairy.left + 0.61278f * dairy.width(), dairy.top + 0.34884f * dairy.height());
            bezier97Path.lineTo(dairy.left + 0.71053f * dairy.width(), dairy.top + 0.34884f * dairy.height());
            canvas.drawPath(bezier97Path, getPaint());


            //// Bezier 99 Drawing
            Path bezier99Path = new Path();
            bezier99Path.moveTo(dairy.left + 0.36842f * dairy.width(), dairy.top + 0.82060f * dairy.height());
            bezier99Path.lineTo(dairy.left + 0.40226f * dairy.width(), dairy.top + 0.82060f * dairy.height());
            canvas.drawPath(bezier99Path, getPaint());


            //// Bezier 101 Drawing
            Path bezier101Path = new Path();
            bezier101Path.moveTo(dairy.left + 0.76316f * dairy.width(), dairy.top + 0.34884f * dairy.height());
            bezier101Path.lineTo(dairy.left + 1.00000f * dairy.width(), dairy.top + 0.34884f * dairy.height());
            canvas.drawPath(bezier101Path, getPaint());


            //// Bezier 103 Drawing
            Path bezier103Path = new Path();
            bezier103Path.moveTo(dairy.left + 0.02256f * dairy.width(), dairy.top + 0.53488f * dairy.height());
            bezier103Path.lineTo(dairy.left + 0.02256f * dairy.width(), dairy.top + 1.00000f * dairy.height());
            bezier103Path.lineTo(dairy.left + 0.17293f * dairy.width(), dairy.top + 1.00000f * dairy.height());
            bezier103Path.lineTo(dairy.left + 0.98120f * dairy.width(), dairy.top + 1.00000f * dairy.height());
            bezier103Path.lineTo(dairy.left + 0.98120f * dairy.width(), dairy.top + 0.53488f * dairy.height());
            canvas.drawPath(bezier103Path, getPaint());


            //// Bezier 105 Drawing
            Path bezier105Path = new Path();
            bezier105Path.moveTo(dairy.left + 0.18421f * dairy.width(), dairy.top + 1.00000f * dairy.height());
            bezier105Path.lineTo(dairy.left + 0.18421f * dairy.width(), dairy.top + 0.65116f * dairy.height());
            bezier105Path.lineTo(dairy.left + 0.44361f * dairy.width(), dairy.top + 0.65116f * dairy.height());
            bezier105Path.lineTo(dairy.left + 0.44361f * dairy.width(), dairy.top + 1.00000f * dairy.height());
            canvas.drawPath(bezier105Path, getPaint());


            //// Rectangle 10 Drawing
            x = (float) (dairy.left + Math.floor(dairy.width() * 0.51880f - 0.3f) + 0.8f);
                    y = (float) (dairy.top + Math.floor(dairy.height() * 0.64784f - 0.5f) + 1.0f);
                    right = x + (float) (Math.floor(dairy.width() * 0.85714f - 0.3f) - Math.floor(dairy.width() * 0.51880f - 0.3f));
                    bottom = y + (float) (Math.floor(dairy.height() * 0.86711f - 0.1f) - Math.floor(dairy.height() * 0.64784f - 0.5f) - 0.4f);
            canvas.drawRect(x, y, right, bottom, getPaint());

            //// Bezier 161 Drawing
            Path bezier161Path = new Path();
            bezier161Path.moveTo(dairy.left + 0.18421f * dairy.width(), dairy.top + 0.00000f * dairy.height());
            bezier161Path.lineTo(dairy.left + 0.18421f * dairy.width(), dairy.top + 0.10631f * dairy.height());
            bezier161Path.lineTo(dairy.left + 0.24812f * dairy.width(), dairy.top + 0.10631f * dairy.height());
            bezier161Path.lineTo(dairy.left + 0.83835f * dairy.width(), dairy.top + 0.10631f * dairy.height());
            bezier161Path.lineTo(dairy.left + 0.83835f * dairy.width(), dairy.top + 0.00000f * dairy.height());
            bezier161Path.lineTo(dairy.left + 0.18421f * dairy.width(), dairy.top + 0.00000f * dairy.height());
            bezier161Path.close();
            canvas.drawPath(bezier161Path, getPaint());


            //// Bezier 163 Drawing
            Path bezier163Path = new Path();
            bezier163Path.moveTo(dairy.left + 0.62782f * dairy.width(), dairy.top + 0.18937f * dairy.height());
            bezier163Path.lineTo(dairy.left + 0.62782f * dairy.width(), dairy.top + 0.10631f * dairy.height());
            canvas.drawPath(bezier163Path, getPaint());


            //// Bezier 165 Drawing
            Path bezier165Path = new Path();
            bezier165Path.moveTo(dairy.left + 0.78195f * dairy.width(), dairy.top + 0.18937f * dairy.height());
            bezier165Path.lineTo(dairy.left + 0.78195f * dairy.width(), dairy.top + 0.10631f * dairy.height());
            canvas.drawPath(bezier165Path, getPaint());
        }
    }
}
