package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 6/02/15.
 */
public class SkyScraperSprite extends Sprite {
    public SkyScraperSprite(Rect bounds) {
        super(bounds);
    }

    public SkyScraperSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        //// Subframes
        x = (float) bounds.left + 1.2f;
        y = (float) bounds.top + 1.1f;
        right = x + (float) Math.floor((bounds.width() - 1.2f) * 0.98086f + 0.5f);
        bottom = y + (float) Math.floor((bounds.height() - 1.1f) * 0.99321f + 0.7f) - 0.2f;
        RectF skyScraper = new RectF(x, y, right, bottom);


        //// sky scraper
        {
            //// Bezier 107 Drawing
            Path bezier107Path = new Path();
            bezier107Path.moveTo(skyScraper.left + 0.79756f * skyScraper.width(), skyScraper.top + 0.92143f * skyScraper.height());
            bezier107Path.lineTo(skyScraper.left + 0.82195f * skyScraper.width(), skyScraper.top + 0.92143f * skyScraper.height());
            canvas.drawPath(bezier107Path, getPaint());


            //// Bezier 112 Drawing
            Path bezier112Path = new Path();
            bezier112Path.moveTo(skyScraper.left + 0.08049f * skyScraper.width(), skyScraper.top + 1.00000f * skyScraper.height());
            bezier112Path.lineTo(skyScraper.left + 0.08049f * skyScraper.width(), skyScraper.top + 0.05295f * skyScraper.height());
            bezier112Path.lineTo(skyScraper.left + 0.00000f * skyScraper.width(), skyScraper.top + 0.05295f * skyScraper.height());
            bezier112Path.lineTo(skyScraper.left + 0.00000f * skyScraper.width(), skyScraper.top + 0.00000f * skyScraper.height());
            bezier112Path.lineTo(skyScraper.left + 1.00000f * skyScraper.width(), skyScraper.top + 0.00000f * skyScraper.height());
            bezier112Path.lineTo(skyScraper.left + 1.00000f * skyScraper.width(), skyScraper.top + 0.05295f * skyScraper.height());
            bezier112Path.lineTo(skyScraper.left + 0.90976f * skyScraper.width(), skyScraper.top + 0.05295f * skyScraper.height());
            bezier112Path.lineTo(skyScraper.left + 0.90976f * skyScraper.width(), skyScraper.top + 1.00000f * skyScraper.height());
            bezier112Path.lineTo(skyScraper.left + 0.08049f * skyScraper.width(), skyScraper.top + 1.00000f * skyScraper.height());
            bezier112Path.close();
            canvas.drawPath(bezier112Path, getPaint());


            //// Bezier 111 Drawing
            Path bezier111Path = new Path();
            bezier111Path.moveTo(skyScraper.left + 0.83171f * skyScraper.width(), skyScraper.top + 0.05295f * skyScraper.height());
            bezier111Path.lineTo(skyScraper.left + 0.91463f * skyScraper.width(), skyScraper.top + 0.05295f * skyScraper.height());
            canvas.drawPath(bezier111Path, getPaint());


            //// Bezier 113 Drawing
            Path bezier113Path = new Path();
            bezier113Path.moveTo(skyScraper.left + 0.08049f * skyScraper.width(), skyScraper.top + 0.05295f * skyScraper.height());
            bezier113Path.lineTo(skyScraper.left + 0.70732f * skyScraper.width(), skyScraper.top + 0.05295f * skyScraper.height());
            canvas.drawPath(bezier113Path, getPaint());


            //// Rectangle 12 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.65366f - 0.3f) + 0.8f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.85141f + 0.5f));
            right = x + (float) (Math.floor(skyScraper.width() * 0.83902f + 0.1f) - Math.floor(skyScraper.width() * 0.65366f - 0.3f) - 0.4f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 1.00000f + 0.1f) - Math.floor(skyScraper.height() * 0.85141f + 0.5f) + 0.4f);
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());

            //// Rectangle 14 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.11358f - 0.3f) + 0.8f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.45366f - 0.1f) - Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.16482f - 0.3f) - Math.floor(skyScraper.height() * 0.11358f - 0.3f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 16 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.22545f - 0.2f) + 0.7f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.45366f - 0.1f) - Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.27669f - 0.2f) - Math.floor(skyScraper.height() * 0.22545f - 0.2f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 18 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.33732f - 0.1f) + 0.6f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.45366f - 0.1f) - Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.38856f - 0.1f) - Math.floor(skyScraper.height() * 0.33732f - 0.1f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 20 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.44833f - 0.1f) + 0.6f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.45366f - 0.1f) - Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.50811f - 0.1f) - Math.floor(skyScraper.height() * 0.44833f - 0.1f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 22 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.55679f - 0.4f) + 0.9f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.45366f - 0.1f) - Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.60803f - 0.4f) - Math.floor(skyScraper.height() * 0.55679f - 0.4f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 24 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.66866f - 0.3f) + 0.8f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.45366f - 0.1f) - Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.71990f - 0.3f) - Math.floor(skyScraper.height() * 0.66866f - 0.3f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());

            //// Rectangle 26 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.2f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.11358f - 0.3f) + 0.8f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.84146f) - Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.16482f - 0.3f) - Math.floor(skyScraper.height() * 0.11358f - 0.3f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());

            //// Rectangle 28 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.2f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.22545f - 0.2f) + 0.7f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.84146f) - Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.27669f - 0.2f) - Math.floor(skyScraper.height() * 0.22545f - 0.2f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 30 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.2f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.33732f - 0.1f) + 0.6f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.84146f) - Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.38856f - 0.1f) - Math.floor(skyScraper.height() * 0.33732f - 0.1f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 32 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.2f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.44833f - 0.1f) + 0.6f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.84146f) - Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.50811f - 0.1f) - Math.floor(skyScraper.height() * 0.44833f - 0.1f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 34 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.2f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.55679f - 0.4f) + 0.9f);
            right = x + (float) (Math.floor(skyScraper.width() * 0.84146f) - Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.60803f - 0.4f) - Math.floor(skyScraper.height() * 0.55679f - 0.4f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Bezier 115 Drawing
            Path bezier115Path = new Path();
            bezier115Path.moveTo(skyScraper.left + 0.71707f * skyScraper.width(), skyScraper.top + 0.71990f * skyScraper.height());
            bezier115Path.lineTo(skyScraper.left + 0.54146f * skyScraper.width(), skyScraper.top + 0.71990f * skyScraper.height());
            bezier115Path.lineTo(skyScraper.left + 0.54146f * skyScraper.width(), skyScraper.top + 0.66866f * skyScraper.height());
            bezier115Path.lineTo(skyScraper.left + 0.84146f * skyScraper.width(), skyScraper.top + 0.66866f * skyScraper.height());
            bezier115Path.lineTo(skyScraper.left + 0.84146f * skyScraper.width(), skyScraper.top + 0.71990f * skyScraper.height());
            bezier115Path.lineTo(skyScraper.left + 0.79024f * skyScraper.width(), skyScraper.top + 0.71990f * skyScraper.height());
            canvas.drawPath(bezier115Path, getPaint());


            //// Rectangle 36 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.76943f + 0.5f));
            right = x + (float) (Math.floor(skyScraper.width() * 0.45366f - 0.1f) - Math.floor(skyScraper.width() * 0.15366f + 0.2f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.82067f + 0.5f) - Math.floor(skyScraper.height() * 0.76943f + 0.5f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 38 Drawing
            x = (float) (skyScraper.left + Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.2f);
            y = (float) (skyScraper.top + Math.floor(skyScraper.height() * 0.76943f + 0.5f));
            right = x + (float) (Math.floor(skyScraper.width() * 0.84146f) - Math.floor(skyScraper.width() * 0.54146f + 0.3f) + 0.3f);
            bottom = y + (float) (Math.floor(skyScraper.height() * 0.82067f + 0.5f) - Math.floor(skyScraper.height() * 0.76943f + 0.5f));
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());
        }
    }
}
