package trademe.co.nz.cityanimation.sprite;

import android.graphics.Rect;

/**
 * Responsible for setting the bounds of a sprite given the start bounds, the end bounds and a transform value.
 * The transform value is just a percentage of how far along the transform is from the start to end bounds.
 *
 * Created by peterakuhata on 7/02/15.
 */
public class SpriteTransformer {
    private Sprite sprite;
    private Rect startBounds, endBounds;

    public Sprite getSprite() {
        return sprite;
    }

    public SpriteTransformer(Sprite sprite, Rect endBounds) {
        this.sprite = sprite;
        this.startBounds = sprite.getBounds();
        this.endBounds = endBounds;
    }

    /**
     * Sets the sprite bounds given the specified transform value.
     * If the transform value is zero, then the sprite bounds is equal to the startBounds, if the
     * transform value is the max possible transform value, then the sprite bounds becomes the end bounds.
     * @param transformValue represents a percentage of how far through a transform the sprite is.
     */
    public void setBoundsForTransformValue(float transformValue) {
        if (sprite == null || startBounds == null || endBounds == null) {
            return;
        }

        int deltaLeft = endBounds.left - startBounds.left;
        int newLeft = startBounds.left + (int)(deltaLeft * transformValue);

        int deltaTop = endBounds.top - startBounds.top;
        int newTop = startBounds.top + (int)(deltaTop * transformValue);

        int deltaRight = endBounds.right - startBounds.right;
        int newRight = startBounds.right + (int)(deltaRight * transformValue);

        int deltaBottom = endBounds.bottom - startBounds.bottom;
        int newBottom = startBounds.bottom + (int)(deltaBottom * transformValue);

        sprite.setBounds(new Rect(newLeft, newTop, newRight, newBottom));
    }
}
