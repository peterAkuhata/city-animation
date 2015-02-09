package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 6/02/15.
 */
public class SkyTowerSprite extends Sprite {
    public SkyTowerSprite(Rect bounds) {
        super(bounds);
    }

    public SkyTowerSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        //// Subframes

        x = (float) (bounds.left + Math.floor(bounds.width() * 0.03947f) + 0.5f);
        y = (bounds.top - 0.4f);
        right = x + (float) (Math.floor(bounds.width() * 0.97105f - 0.4f) - Math.floor(bounds.width() * 0.03947f) + 0.4f);
        bottom = y + (float) (Math.floor((bounds.height() + 0.4f) * 0.99830f - 0.3f) + 0.8f);
        RectF skyTower = new RectF(x, y, right, bottom);

        //// sky tower
        {
            //// Bezier 80 Drawing
            Path bezier80Path = new Path();
            bezier80Path.moveTo(skyTower.left + 0.50000f * skyTower.width(), skyTower.top + 0.00000f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.50565f * skyTower.width(), skyTower.top + 0.12809f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.57062f * skyTower.width(), skyTower.top + 0.12809f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.57062f * skyTower.width(), skyTower.top + 0.13830f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.51130f * skyTower.width(), skyTower.top + 0.13830f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.52260f * skyTower.width(), skyTower.top + 0.19532f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.55367f * skyTower.width(), skyTower.top + 0.19532f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.55367f * skyTower.width(), skyTower.top + 0.20511f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.52260f * skyTower.width(), skyTower.top + 0.20511f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.54237f * skyTower.width(), skyTower.top + 0.33745f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.64972f * skyTower.width(), skyTower.top + 0.33745f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.64972f * skyTower.width(), skyTower.top + 0.34723f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.60452f * skyTower.width(), skyTower.top + 0.34723f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.60452f * skyTower.width(), skyTower.top + 0.37872f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.74576f * skyTower.width(), skyTower.top + 0.37872f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.74576f * skyTower.width(), skyTower.top + 0.39362f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.64972f * skyTower.width(), skyTower.top + 0.39362f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.64972f * skyTower.width(), skyTower.top + 0.40085f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.69492f * skyTower.width(), skyTower.top + 0.40085f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.69492f * skyTower.width(), skyTower.top + 0.40723f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.65537f * skyTower.width(), skyTower.top + 0.40723f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.65537f * skyTower.width(), skyTower.top + 0.46596f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.72599f * skyTower.width(), skyTower.top + 0.46596f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.72599f * skyTower.width(), skyTower.top + 0.47362f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 1.00000f * skyTower.width(), skyTower.top + 0.49660f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 1.00000f * skyTower.width(), skyTower.top + 0.50638f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.83051f * skyTower.width(), skyTower.top + 0.50638f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.83051f * skyTower.width(), skyTower.top + 0.51830f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.90395f * skyTower.width(), skyTower.top + 0.51830f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.90395f * skyTower.width(), skyTower.top + 0.52894f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.77684f * skyTower.width(), skyTower.top + 0.52894f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.72316f * skyTower.width(), skyTower.top + 0.54809f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.72316f * skyTower.width(), skyTower.top + 0.65277f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.66949f * skyTower.width(), skyTower.top + 0.65957f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.61582f * skyTower.width(), skyTower.top + 0.71064f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.61582f * skyTower.width(), skyTower.top + 1.00000f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.38418f * skyTower.width(), skyTower.top + 1.00000f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.38418f * skyTower.width(), skyTower.top + 0.71064f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.33051f * skyTower.width(), skyTower.top + 0.65957f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.27684f * skyTower.width(), skyTower.top + 0.65277f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.27684f * skyTower.width(), skyTower.top + 0.54809f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.22316f * skyTower.width(), skyTower.top + 0.52894f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.09887f * skyTower.width(), skyTower.top + 0.52894f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.09887f * skyTower.width(), skyTower.top + 0.51830f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.16949f * skyTower.width(), skyTower.top + 0.51830f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.16949f * skyTower.width(), skyTower.top + 0.50638f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.00000f * skyTower.width(), skyTower.top + 0.50638f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.00000f * skyTower.width(), skyTower.top + 0.49660f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.27401f * skyTower.width(), skyTower.top + 0.47362f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.27401f * skyTower.width(), skyTower.top + 0.46596f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.34463f * skyTower.width(), skyTower.top + 0.46596f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.34463f * skyTower.width(), skyTower.top + 0.40723f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.30508f * skyTower.width(), skyTower.top + 0.40723f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.30508f * skyTower.width(), skyTower.top + 0.40085f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.35028f * skyTower.width(), skyTower.top + 0.40085f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.35028f * skyTower.width(), skyTower.top + 0.39362f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.25424f * skyTower.width(), skyTower.top + 0.39362f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.25424f * skyTower.width(), skyTower.top + 0.37872f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.39548f * skyTower.width(), skyTower.top + 0.37872f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.39548f * skyTower.width(), skyTower.top + 0.34723f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.35028f * skyTower.width(), skyTower.top + 0.34723f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.35028f * skyTower.width(), skyTower.top + 0.33745f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.45763f * skyTower.width(), skyTower.top + 0.33745f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.47740f * skyTower.width(), skyTower.top + 0.20511f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.44633f * skyTower.width(), skyTower.top + 0.20511f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.44633f * skyTower.width(), skyTower.top + 0.19532f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.47740f * skyTower.width(), skyTower.top + 0.19532f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.48870f * skyTower.width(), skyTower.top + 0.13830f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.42938f * skyTower.width(), skyTower.top + 0.13830f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.42938f * skyTower.width(), skyTower.top + 0.12809f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.49435f * skyTower.width(), skyTower.top + 0.12809f * skyTower.height());
            bezier80Path.lineTo(skyTower.left + 0.50000f * skyTower.width(), skyTower.top + 0.00000f * skyTower.height());
            bezier80Path.close();
            canvas.drawPath(bezier80Path, getPaint());

            //// Bezier 82 Drawing
            Path bezier82Path = new Path();
            bezier82Path.moveTo(skyTower.left + 0.27684f * skyTower.width(), skyTower.top + 0.56170f * skyTower.height());
            bezier82Path.lineTo(skyTower.left + 0.72316f * skyTower.width(), skyTower.top + 0.56170f * skyTower.height());
            canvas.drawPath(bezier82Path, getPaint());


            //// Bezier 84 Drawing
            Path bezier84Path = new Path();
            bezier84Path.moveTo(skyTower.left + 0.27684f * skyTower.width(), skyTower.top + 0.59149f * skyTower.height());
            bezier84Path.lineTo(skyTower.left + 0.72316f * skyTower.width(), skyTower.top + 0.59149f * skyTower.height());
            canvas.drawPath(bezier84Path, getPaint());


            //// Bezier 86 Drawing
            Path bezier86Path = new Path();
            bezier86Path.moveTo(skyTower.left + 0.22599f * skyTower.width(), skyTower.top + 0.52936f * skyTower.height());
            bezier86Path.lineTo(skyTower.left + 0.77684f * skyTower.width(), skyTower.top + 0.52936f * skyTower.height());
            canvas.drawPath(bezier86Path, getPaint());


            //// Bezier 88 Drawing
            Path bezier88Path = new Path();
            bezier88Path.moveTo(skyTower.left + 0.16949f * skyTower.width(), skyTower.top + 0.51830f * skyTower.height());
            bezier88Path.lineTo(skyTower.left + 0.83051f * skyTower.width(), skyTower.top + 0.51830f * skyTower.height());
            canvas.drawPath(bezier88Path, getPaint());


            //// Bezier 90 Drawing
            Path bezier90Path = new Path();
            bezier90Path.moveTo(skyTower.left + 0.16949f * skyTower.width(), skyTower.top + 0.50638f * skyTower.height());
            bezier90Path.lineTo(skyTower.left + 0.83051f * skyTower.width(), skyTower.top + 0.50638f * skyTower.height());
            canvas.drawPath(bezier90Path, getPaint());
        }
    }
}
