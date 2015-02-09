package trademe.co.nz.cityanimation.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

import trademe.co.nz.cityanimation.sprite.Sprite;

/**
 * A drawable wrapper to render a single sprite to the screen. See the SpriteDrawablesActivity activity.
 *
 * Created by peterakuhata on 6/02/15.
 */
public class SpriteDrawable extends Drawable {
    private final Sprite sprite;

    public SpriteDrawable(Sprite sprite) {
        this.sprite = sprite;
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, getBounds());
    }

    @Override
    public void setAlpha(int alpha) {
        sprite.getPaint().setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        sprite.getPaint().setColorFilter(cf);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.OPAQUE;
    }
}
