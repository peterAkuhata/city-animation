package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;

/**
 * Created by peterakuhata on 5/02/15.
 */
public class CloudSprite extends Sprite {
    public CloudSprite(Rect bounds) {
        super(bounds);
    }

    public CloudSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        Rect bounds = getBounds();

        //// cloud 2 Drawing
        Path cloud2Path = new Path();
        cloud2Path.moveTo(bounds.left + 0.24262f * bounds.width(), bounds.top + 0.95588f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.25206f * bounds.width(), bounds.top + 0.95588f * bounds.height(),
                bounds.left + 0.26151f * bounds.width(), bounds.top + 0.95588f * bounds.height(),
                bounds.left + 0.27096f * bounds.width(), bounds.top + 0.95588f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.39852f * bounds.width(), bounds.top + 0.95588f * bounds.height(),
                bounds.left + 0.52607f * bounds.width(), bounds.top + 0.95588f * bounds.height(),
                bounds.left + 0.65835f * bounds.width(), bounds.top + 0.95588f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.70559f * bounds.width(), bounds.top + 0.95588f * bounds.height(),
                bounds.left + 0.75756f * bounds.width(), bounds.top + 0.95588f * bounds.height(),
                bounds.left + 0.80480f * bounds.width(), bounds.top + 0.94111f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.85204f * bounds.width(), bounds.top + 0.92633f * bounds.height(),
                bounds.left + 0.89928f * bounds.width(), bounds.top + 0.88938f * bounds.height(),
                bounds.left + 0.93235f * bounds.width(), bounds.top + 0.83766f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.99849f * bounds.width(), bounds.top + 0.72684f * bounds.height(),
                bounds.left + 0.97487f * bounds.width(), bounds.top + 0.56429f * bounds.height(),
                bounds.left + 0.90873f * bounds.width(), bounds.top + 0.46085f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.88511f * bounds.width(), bounds.top + 0.42390f * bounds.height(),
                bounds.left + 0.84732f * bounds.width(), bounds.top + 0.37218f * bounds.height(),
                bounds.left + 0.81425f * bounds.width(), bounds.top + 0.35741f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.78118f * bounds.width(), bounds.top + 0.34263f * bounds.height(),
                bounds.left + 0.74339f * bounds.width(), bounds.top + 0.35002f * bounds.height(),
                bounds.left + 0.71504f * bounds.width(), bounds.top + 0.31307f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.69142f * bounds.width(), bounds.top + 0.28352f * bounds.height(),
                bounds.left + 0.68669f * bounds.width(), bounds.top + 0.23919f * bounds.height(),
                bounds.left + 0.67252f * bounds.width(), bounds.top + 0.20225f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.63000f * bounds.width(), bounds.top + 0.08403f * bounds.height(),
                bounds.left + 0.53552f * bounds.width(), bounds.top + 0.03231f * bounds.height(),
                bounds.left + 0.45521f * bounds.width(), bounds.top + 0.07664f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.37489f * bounds.width(), bounds.top + 0.11358f * bounds.height(),
                bounds.left + 0.31820f * bounds.width(), bounds.top + 0.23919f * bounds.height(),
                bounds.left + 0.30403f * bounds.width(), bounds.top + 0.36479f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.25679f * bounds.width(), bounds.top + 0.38696f * bounds.height(),
                bounds.left + 0.20482f * bounds.width(), bounds.top + 0.41651f * bounds.height(),
                bounds.left + 0.16230f * bounds.width(), bounds.top + 0.45346f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.11979f * bounds.width(), bounds.top + 0.49779f * bounds.height(),
                bounds.left + 0.07727f * bounds.width(), bounds.top + 0.54951f * bounds.height(),
                bounds.left + 0.05837f * bounds.width(), bounds.top + 0.62340f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.03947f * bounds.width(), bounds.top + 0.69728f * bounds.height(),
                bounds.left + 0.03947f * bounds.width(), bounds.top + 0.79333f * bounds.height(),
                bounds.left + 0.07254f * bounds.width(), bounds.top + 0.85244f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.09616f * bounds.width(), bounds.top + 0.89677f * bounds.height(),
                bounds.left + 0.12923f * bounds.width(), bounds.top + 0.92633f * bounds.height(),
                bounds.left + 0.16703f * bounds.width(), bounds.top + 0.94111f * bounds.height());
        cloud2Path.cubicTo(bounds.left + 0.19065f * bounds.width(), bounds.top + 0.95588f * bounds.height(),
                bounds.left + 0.21427f * bounds.width(), bounds.top + 0.95588f * bounds.height(),
                bounds.left + 0.24262f * bounds.width(), bounds.top + 0.95588f * bounds.height());
        cloud2Path.close();

        canvas.drawPath(cloud2Path, getPaint());
    }
}
