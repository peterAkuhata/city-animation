package trademe.co.nz.cityanimation.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;

import java.util.ArrayList;
import java.util.List;

import trademe.co.nz.cityanimation.sprite.BigHouseSprite;
import trademe.co.nz.cityanimation.sprite.BigTreeSprite;
import trademe.co.nz.cityanimation.sprite.CloudSprite;
import trademe.co.nz.cityanimation.sprite.FenceSprite;
import trademe.co.nz.cityanimation.sprite.FourSquareSprite;
import trademe.co.nz.cityanimation.sprite.HotAirBalloonSprite;
import trademe.co.nz.cityanimation.sprite.LittleTreesSprite;
import trademe.co.nz.cityanimation.sprite.ShopSprite;
import trademe.co.nz.cityanimation.sprite.SkyScraperSprite;
import trademe.co.nz.cityanimation.sprite.SkyTowerSprite;
import trademe.co.nz.cityanimation.sprite.SmallBuildingSprite;
import trademe.co.nz.cityanimation.sprite.SmallHouseSprite;
import trademe.co.nz.cityanimation.sprite.Sprite;
import trademe.co.nz.cityanimation.sprite.SpriteTransformer;

/**
 * Responsible from drawing the entire city, and animating it as well.
 *
 * Created by peterakuhata on 7/02/15.
 */
public final class CityDrawable extends Drawable implements Animatable {
    /**
     * The transform starts at 0%.
     */
    private final float DEFAULT_VALUE_TRANSFORM_START = 0.0f;

    /**
     * The transform ends at 150%.
     */
    private final float DEFAULT_VALUE_TRANSFORM_END = 1.5f;

    /**
     * The transform animation length is 1 second.
     */
    private final long DEFAULT_VALUE_TRANSFORM_DURATION = 1000;

    /**
     * The default x value offset for the end bounds in the sprite transformers for all the buildings.
     */
    private final int DEFAULT_VALUE_BUILDING_OFFSET = 20;


    /**
     * The sprites and sprite transformers.
     */

    private final Sprite bigCloudSprite = new CloudSprite(new Rect(141, 26, 201, 64));
    private final SpriteTransformer bigCloudSpriteTransformer = new SpriteTransformer(bigCloudSprite, new Rect(101, 26, 191, 64));

    private final Sprite littleCloudSprite = new CloudSprite(new Rect(204, 26, 228, 49));
    private final SpriteTransformer littleCloudSpriteTransformer = new SpriteTransformer(littleCloudSprite, new Rect(104, 26, 128, 49));

    private final Sprite hotAirBalloonSprite = new HotAirBalloonSprite(new Rect(223, 49, 268, 123));
    private final SpriteTransformer hotAirBalloonSpriteTransformer = new SpriteTransformer(hotAirBalloonSprite, new Rect(183, 9, 228, 83));

    private final Sprite bigTreeSprite = new BigTreeSprite(new Rect(0, 195, 30, 239));
    private final SpriteTransformer bigTreeSpriteTransformer = new SpriteTransformer(bigTreeSprite, new Rect(-DEFAULT_VALUE_BUILDING_OFFSET, 195, 30 - DEFAULT_VALUE_BUILDING_OFFSET, 239));

    private final Sprite skyTowerSprite = new SkyTowerSprite(new Rect(29, 0, 64, 235));
    private final SpriteTransformer skyTowerSpriteTransformer = new SpriteTransformer(skyTowerSprite, new Rect(29 - DEFAULT_VALUE_BUILDING_OFFSET, 0, 64 - DEFAULT_VALUE_BUILDING_OFFSET, 235));

    private final Sprite smallBuildingSprite = new SmallBuildingSprite(new Rect(71, 160, 94, 234));
    private final SpriteTransformer smallBuildingSpriteTransformer = new SpriteTransformer(smallBuildingSprite, new Rect(71 - DEFAULT_VALUE_BUILDING_OFFSET, 160, 94 - DEFAULT_VALUE_BUILDING_OFFSET, 234));

    private final Sprite skyScraperSprite = new SkyScraperSprite(new Rect(100, 118, 141, 235));
    private final SpriteTransformer skyScraperSpriteTransformer = new SpriteTransformer(skyScraperSprite, new Rect(100 - DEFAULT_VALUE_BUILDING_OFFSET, 118, 141 - DEFAULT_VALUE_BUILDING_OFFSET, 235));

    private final Sprite shopSprite = new ShopSprite(new Rect(141, 209, 204, 236));
    private final SpriteTransformer shopSpriteTransformer = new SpriteTransformer(shopSprite, new Rect(141 - DEFAULT_VALUE_BUILDING_OFFSET, 209, 204 - DEFAULT_VALUE_BUILDING_OFFSET, 236));

    private final Sprite fourSquareSprite = new FourSquareSprite(new Rect(208, 206, 235, 236));
    private final SpriteTransformer fourSquareSpriteTransformer = new SpriteTransformer(fourSquareSprite, new Rect(208 - DEFAULT_VALUE_BUILDING_OFFSET, 206, 235 - DEFAULT_VALUE_BUILDING_OFFSET, 236));

    private final Sprite smallHouseSprite = new SmallHouseSprite(new Rect(238, 196, 295, 233));
    private final SpriteTransformer smallHouseSpriteTransformer = new SpriteTransformer(smallHouseSprite, new Rect(238 - DEFAULT_VALUE_BUILDING_OFFSET, 196, 295 - DEFAULT_VALUE_BUILDING_OFFSET, 233));

    private final Sprite fenceSprite = new FenceSprite(new Rect(297, 226, 331, 237));
    private final SpriteTransformer fenceSpriteTransformer = new SpriteTransformer(fenceSprite, new Rect(297 - DEFAULT_VALUE_BUILDING_OFFSET, 226, 331 - DEFAULT_VALUE_BUILDING_OFFSET, 237));

    private final Sprite bigHouseSprite = new BigHouseSprite(new Rect(330, 158, 398, 236));
    private final SpriteTransformer bigHouseSpriteTransformer = new SpriteTransformer(bigHouseSprite, new Rect(330 - DEFAULT_VALUE_BUILDING_OFFSET, 158, 398 - DEFAULT_VALUE_BUILDING_OFFSET, 236));

    private final Sprite littleTreesSprite = new LittleTreesSprite(new Rect(384, 218, 425, 241));
    private final SpriteTransformer littleTreesSpriteTransformer = new SpriteTransformer(littleTreesSprite, new Rect(384 - DEFAULT_VALUE_BUILDING_OFFSET, 218, 425 - DEFAULT_VALUE_BUILDING_OFFSET, 241));

    /**
     * A value that represents a percentage of how far through a transform the drawable is.
     */
    private float transformValue;

    /**
     * Responsible for animating the drawable.
     */
    private ObjectAnimator drawableAnimator;

    /**
     * Determines whether the drawable is currently animating or not.
     */
    private boolean isAnimating = false;

    /**
     * An enum that represents which direction the animation is heading towards.
     */
    public enum Direction {
        Left {
            Direction toggle() {
                return Right;
            }
        },
        Right {
            Direction toggle() {
                return Left;
            }
        };

        abstract Direction toggle();
    }

    /**
     * The direction the animation is heading.
     */
    private Direction animationDirection = Direction.Left;

    /**
     * List of sprites.
     */
    private List<Sprite> spriteList;

    /**
     * Listing of sprite transformers.
     */
    private List<SpriteTransformer> spriteTransformerList;

    /**
     * A Property object pointing at the transformValue property.  To be used in the object animator.
     */
    private Property<CityDrawable, Float> transformRatioProperty = new Property<CityDrawable, Float>(Float.class, "transformValue") {
        @Override
        public Float get(CityDrawable object) {
            return object.getTransformValue();
        }

        @Override
        public void set(CityDrawable object, Float value) {
            object.setTransformValue(value);
        }
    };

    public CityDrawable() {
        // default the city drawable to the middle of the transform
        transformValue = DEFAULT_VALUE_TRANSFORM_END / 2;

        // create the animator
        drawableAnimator = ObjectAnimator.ofFloat(this, transformRatioProperty, transformValue);
        drawableAnimator.setInterpolator(new LinearInterpolator());
        drawableAnimator.setDuration(DEFAULT_VALUE_TRANSFORM_DURATION);
        drawableAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                isAnimating = false;
                animationDirection = animationDirection.toggle();
            }
        });

        initialiseSpriteLists();
    }

    private void initialiseSpriteLists() {
        spriteList = new ArrayList<>();
        spriteList.add(bigCloudSprite);
        spriteList.add(littleCloudSprite);
        spriteList.add(hotAirBalloonSprite);
        spriteList.add(skyTowerSprite);
        spriteList.add(bigTreeSprite);
        spriteList.add(smallBuildingSprite);
        spriteList.add(skyScraperSprite);
        spriteList.add(shopSprite);
        spriteList.add(fourSquareSprite);
        spriteList.add(smallHouseSprite);
        spriteList.add(fenceSprite);
        spriteList.add(bigHouseSprite);
        spriteList.add(littleTreesSprite);

        spriteTransformerList = new ArrayList<>();
        spriteTransformerList.add(bigCloudSpriteTransformer);
        spriteTransformerList.add(littleCloudSpriteTransformer);
        spriteTransformerList.add(hotAirBalloonSpriteTransformer);
        spriteTransformerList.add(bigTreeSpriteTransformer);
        spriteTransformerList.add(skyTowerSpriteTransformer);
        spriteTransformerList.add(smallBuildingSpriteTransformer);
        spriteTransformerList.add(skyScraperSpriteTransformer);
        spriteTransformerList.add(shopSpriteTransformer);
        spriteTransformerList.add(fourSquareSpriteTransformer);
        spriteTransformerList.add(smallHouseSpriteTransformer);
        spriteTransformerList.add(fenceSpriteTransformer);
        spriteTransformerList.add(bigHouseSpriteTransformer);
        spriteTransformerList.add(littleTreesSpriteTransformer);
    }

    public float getTransformValue() {
        return transformValue;
    }

    public void setTransformValue(float transformValue) {
        if (transformValue >= DEFAULT_VALUE_TRANSFORM_START && transformValue <= DEFAULT_VALUE_TRANSFORM_END) {
            this.transformValue = transformValue;

            // update the sprites with the new transform value
            for (SpriteTransformer spriteTransformer : spriteTransformerList) {
                spriteTransformer.setBoundsForTransformValue(transformValue);
            }

            // tell the drawable to draw itself again
            invalidateSelf();
        }
    }

    public void setAnimationDirection(Direction animationDirection) {
        this.animationDirection = animationDirection;
    }

    @Override
    public void draw(Canvas canvas) {
        for (Sprite sprite : spriteList) {
            sprite.draw(canvas);
        }
    }

    @Override
    public void setAlpha(int alpha) {
        for (Sprite sprite : spriteList) {
            sprite.getPaint().setAlpha(alpha);
        }
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        for (Sprite sprite : spriteList) {
            sprite.getPaint().setColorFilter(cf);
        }
    }

    @Override
    public int getOpacity() {
        return PixelFormat.OPAQUE;
    }

    @Override
    public void start() {
        if (isRunning()) {
            return;
        }

        drawableAnimator.setFloatValues(
                transformValue,
                animationDirection == Direction.Left ? DEFAULT_VALUE_TRANSFORM_START : DEFAULT_VALUE_TRANSFORM_END);

        drawableAnimator.start();
        isAnimating = true;
        invalidateSelf();
    }

    @Override
    public void stop() {
        if (isRunning()) {
            drawableAnimator.end();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        return 425;
    }

    @Override
    public int getIntrinsicHeight() {
        return 241;
    }

    @Override
    public boolean isRunning() {
        return isAnimating;
    }
}
