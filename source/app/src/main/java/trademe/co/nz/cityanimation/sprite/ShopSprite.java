package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 6/02/15.
 */
public class ShopSprite extends Sprite {
    public ShopSprite(Rect bounds) {
        super(bounds);
    }

    public ShopSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        //// Subframes
        x = (float) bounds.left + 1.2f;
        y = (float) bounds.top + 0.6f;
        right = x + (float) Math.floor((bounds.width() - 1.2f) * 0.98746f + 0.5f);
        bottom = y + (float) Math.floor((bounds.height() - 0.6f) * 0.96127f + 0.7f) - 0.2f;
        RectF shop = new RectF(x, y, right, bottom);


        //// shop
        {
            //// test Drawing
            Path testPath = new Path();
            testPath.moveTo(shop.left + 0.00000f * shop.width(), shop.top + 1.00000f * shop.height());
            testPath.lineTo(shop.left + 0.00000f * shop.width(), shop.top + 0.00000f * shop.height());
            testPath.lineTo(shop.left + 1.00000f * shop.width(), shop.top + 0.00000f * shop.height());
            testPath.lineTo(shop.left + 1.00000f * shop.width(), shop.top + 1.00000f * shop.height());
            testPath.lineTo(shop.left + 0.39683f * shop.width(), shop.top + 1.00000f * shop.height());
            testPath.lineTo(shop.left + 0.33016f * shop.width(), shop.top + 1.00000f * shop.height());
            testPath.lineTo(shop.left + 0.00000f * shop.width(), shop.top + 1.00000f * shop.height());
            testPath.close();
            canvas.drawPath(testPath, getPaint());


            //// Bezier 228 Drawing
            Path bezier228Path = new Path();
            bezier228Path.moveTo(shop.left + 0.39683f * shop.width(), shop.top + 1.00000f * shop.height());
            bezier228Path.lineTo(shop.left + 0.39683f * shop.width(), shop.top + 0.50183f * shop.height());
            bezier228Path.lineTo(shop.left + 0.50000f * shop.width(), shop.top + 0.50183f * shop.height());
            bezier228Path.lineTo(shop.left + 0.61111f * shop.width(), shop.top + 0.50183f * shop.height());
            bezier228Path.lineTo(shop.left + 0.61111f * shop.width(), shop.top + 1.00000f * shop.height());
            canvas.drawPath(bezier228Path, getPaint());


            //// Bezier 230 Drawing
            Path bezier230Path = new Path();
            bezier230Path.moveTo(shop.left + 0.50000f * shop.width(), shop.top + 1.00000f * shop.height());
            bezier230Path.lineTo(shop.left + 0.50000f * shop.width(), shop.top + 0.50183f * shop.height());
            canvas.drawPath(bezier230Path, getPaint());


            //// Bezier 232 Drawing
            Path bezier232Path = new Path();
            bezier232Path.moveTo(shop.left + 0.06349f * shop.width(), shop.top + 0.64469f * shop.height());
            bezier232Path.lineTo(shop.left + 0.12698f * shop.width(), shop.top + 0.50183f * shop.height());
            canvas.drawPath(bezier232Path, getPaint());


            //// Bezier 234 Drawing
            Path bezier234Path = new Path();
            bezier234Path.moveTo(shop.left + 0.06349f * shop.width(), shop.top + 0.76557f * shop.height());
            bezier234Path.lineTo(shop.left + 0.16349f * shop.width(), shop.top + 0.53480f * shop.height());
            canvas.drawPath(bezier234Path, getPaint());


            //// Bezier 236 Drawing
            Path bezier236Path = new Path();
            bezier236Path.moveTo(shop.left + 0.88571f * shop.width(), shop.top + 0.64469f * shop.height());
            bezier236Path.lineTo(shop.left + 0.94921f * shop.width(), shop.top + 0.50183f * shop.height());
            canvas.drawPath(bezier236Path, getPaint());


            //// Bezier 238 Drawing
            Path bezier238Path = new Path();
            bezier238Path.moveTo(shop.left + 0.88571f * shop.width(), shop.top + 0.76557f * shop.height());
            bezier238Path.lineTo(shop.left + 0.98730f * shop.width(), shop.top + 0.53480f * shop.height());
            canvas.drawPath(bezier238Path, getPaint());


            //// Bezier 240 Drawing
            Path bezier240Path = new Path();
            bezier240Path.moveTo(shop.left + 0.00000f * shop.width(), shop.top + 0.20879f * shop.height());
            bezier240Path.lineTo(shop.left + 0.76825f * shop.width(), shop.top + 0.20879f * shop.height());
            canvas.drawPath(bezier240Path, getPaint());


            //// Bezier 242 Drawing
            Path bezier242Path = new Path();
            bezier242Path.moveTo(shop.left + 0.79524f * shop.width(), shop.top + 0.20879f * shop.height());
            bezier242Path.lineTo(shop.left + 1.00000f * shop.width(), shop.top + 0.20879f * shop.height());
            canvas.drawPath(bezier242Path, getPaint());


            //// Rectangle 168 Drawing
            x = (float) (shop.left + Math.floor(shop.width() * 0.25873f + 0.2f) + 0.3f);
            y = (float) (shop.top + Math.floor(shop.height() * 0.30037f) + 0.5f);
            right = x + (float) (Math.floor(shop.width() * 0.75079f + 0.2f) - Math.floor(shop.width() * 0.25873f + 0.2f));
            bottom = y + (float) (Math.floor(shop.height() * 0.43223f + 0.4f) - Math.floor(shop.height() * 0.30037f) - 0.4f);
            canvas.drawRect(x, y, right, bottom, getPaint());

            //// Bezier 244 Drawing
            Path bezier244Path = new Path();
            bezier244Path.moveTo(shop.left + 0.52540f * shop.width(), shop.top + 0.80220f * shop.height());
            bezier244Path.lineTo(shop.left + 0.53968f * shop.width(), shop.top + 0.80220f * shop.height());
            canvas.drawPath(bezier244Path, getPaint());


            //// Bezier 246 Drawing
            Path bezier246Path = new Path();
            bezier246Path.moveTo(shop.left + 0.46508f * shop.width(), shop.top + 0.80220f * shop.height());
            bezier246Path.lineTo(shop.left + 0.47937f * shop.width(), shop.top + 0.80220f * shop.height());
            canvas.drawPath(bezier246Path, getPaint());


            //// Bezier 248 Drawing
            Path bezier248Path = new Path();
            bezier248Path.moveTo(shop.left + 0.22698f * shop.width(), shop.top + 0.20879f * shop.height());
            bezier248Path.lineTo(shop.left + 0.22698f * shop.width(), shop.top + 1.00000f * shop.height());
            canvas.drawPath(bezier248Path, getPaint());


            //// Bezier 250 Drawing
            Path bezier250Path = new Path();
            bezier250Path.moveTo(shop.left + 0.85714f * shop.width(), shop.top + 0.20879f * shop.height());
            bezier250Path.lineTo(shop.left + 0.85714f * shop.width(), shop.top + 1.00000f * shop.height());
            canvas.drawPath(bezier250Path, getPaint());
        }
    }
}
