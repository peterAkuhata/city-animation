package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 6/02/15.
 */
public class SmallHouseSprite extends Sprite {
    public SmallHouseSprite(Rect bounds) {
        super(bounds);

        getPaint().setStrokeWidth(0.25f);
    }

    public SmallHouseSprite() {
        super();

        getPaint().setStrokeWidth(0.25f);
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        //// Subframes
        x = (float) bounds.left + 1.5f;
        y = bounds.top + 1.3f;
        right = x + (float) Math.floor((bounds.width() - 1.5f) * 0.98957f + 1.6f) - 1.1f;
        bottom = y + (float) Math.floor((bounds.height() - 1.3f) * 0.96817f + 1.1f) - 0.6f;
        RectF smallHouse = new RectF(x, y, right, bottom);


        //// small house
        {
            //// Bezier 120 Drawing
            Path bezier120Path = new Path();
            bezier120Path.moveTo(smallHouse.left + 0.37961f * smallHouse.width(), smallHouse.top + 0.83288f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.13533f * smallHouse.width(), smallHouse.top + 0.83288f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.13533f * smallHouse.width(), smallHouse.top + 0.45479f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.18102f * smallHouse.width(), smallHouse.top + 0.41096f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.33216f * smallHouse.width(), smallHouse.top + 0.41096f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.37961f * smallHouse.width(), smallHouse.top + 0.46027f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.37961f * smallHouse.width(), smallHouse.top + 0.83288f * smallHouse.height());
            bezier120Path.close();
            bezier120Path.moveTo(smallHouse.left + 0.15114f * smallHouse.width(), smallHouse.top + 0.80822f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.36380f * smallHouse.width(), smallHouse.top + 0.80822f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.36380f * smallHouse.width(), smallHouse.top + 0.47123f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.32689f * smallHouse.width(), smallHouse.top + 0.43288f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.18453f * smallHouse.width(), smallHouse.top + 0.43288f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.15114f * smallHouse.width(), smallHouse.top + 0.46575f * smallHouse.height());
            bezier120Path.lineTo(smallHouse.left + 0.15114f * smallHouse.width(), smallHouse.top + 0.80822f * smallHouse.height());
            bezier120Path.close();
            canvas.drawPath(bezier120Path, getPaint());

            //// Bezier 122 Drawing
            Path bezier122Path = new Path();
            bezier122Path.moveTo(smallHouse.left + 0.48155f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.40949f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.40949f * smallHouse.width(), smallHouse.top + 0.33973f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.27944f * smallHouse.width(), smallHouse.top + 0.14247f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.23199f * smallHouse.width(), smallHouse.top + 0.14247f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.09490f * smallHouse.width(), smallHouse.top + 0.35616f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.09490f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.02109f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.02109f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.07909f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.07909f * smallHouse.width(), smallHouse.top + 0.34521f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.22496f * smallHouse.width(), smallHouse.top + 0.11781f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.28471f * smallHouse.width(), smallHouse.top + 0.11781f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.42531f * smallHouse.width(), smallHouse.top + 0.32877f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.42531f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.48155f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier122Path.lineTo(smallHouse.left + 0.48155f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier122Path.close();
            canvas.drawPath(bezier122Path, getPaint());


            //// Bezier 124 Drawing
            Path bezier124Path = new Path();
            bezier124Path.moveTo(smallHouse.left + 0.37961f * smallHouse.width(), smallHouse.top + 1.00000f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.02636f * smallHouse.width(), smallHouse.top + 1.00000f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.02636f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.00000f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.25483f * smallHouse.width(), smallHouse.top + 0.01370f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.51494f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.48682f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.48682f * smallHouse.width(), smallHouse.top + 0.71781f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.47100f * smallHouse.width(), smallHouse.top + 0.72329f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.47100f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.47627f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.25483f * smallHouse.width(), smallHouse.top + 0.04932f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.03866f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.04394f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.04394f * smallHouse.width(), smallHouse.top + 0.97534f * smallHouse.height());
            bezier124Path.lineTo(smallHouse.left + 0.38137f * smallHouse.width(), smallHouse.top + 0.97534f * smallHouse.height());
            canvas.drawPath(bezier124Path, getPaint());


            //// Rectangle 40 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.17399f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.42192f) + 0.5f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.19156f - 0.4f) - Math.floor(smallHouse.width() * 0.17399f - 0.4f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.82192f + 0.4f) - Math.floor(smallHouse.height() * 0.42192f) - 0.4f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 42 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.31986f + 0.3f) + 0.2f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.42192f) + 0.5f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.33743f + 0.3f) - Math.floor(smallHouse.width() * 0.31986f + 0.3f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.82192f + 0.4f) - Math.floor(smallHouse.height() * 0.42192f) - 0.4f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Bezier 127 Drawing
            Path bezier127Path = new Path();
            bezier127Path.moveTo(smallHouse.left + 0.14587f * smallHouse.width(), smallHouse.top + 0.50685f * smallHouse.height());
            bezier127Path.lineTo(smallHouse.left + 0.14060f * smallHouse.width(), smallHouse.top + 0.48493f * smallHouse.height());
            bezier127Path.lineTo(smallHouse.left + 0.17575f * smallHouse.width(), smallHouse.top + 0.46301f * smallHouse.height());
            bezier127Path.lineTo(smallHouse.left + 0.28471f * smallHouse.width(), smallHouse.top + 0.46301f * smallHouse.height());
            bezier127Path.lineTo(smallHouse.left + 0.28471f * smallHouse.width(), smallHouse.top + 0.48767f * smallHouse.height());
            bezier127Path.lineTo(smallHouse.left + 0.17926f * smallHouse.width(), smallHouse.top + 0.48767f * smallHouse.height());
            bezier127Path.lineTo(smallHouse.left + 0.14587f * smallHouse.width(), smallHouse.top + 0.50685f * smallHouse.height());
            bezier127Path.close();
            canvas.drawPath(bezier127Path, getPaint());


            //// Bezier 129 Drawing
            Path bezier129Path = new Path();
            bezier129Path.moveTo(smallHouse.left + 0.36907f * smallHouse.width(), smallHouse.top + 0.50137f * smallHouse.height());
            bezier129Path.lineTo(smallHouse.left + 0.32689f * smallHouse.width(), smallHouse.top + 0.48767f * smallHouse.height());
            bezier129Path.lineTo(smallHouse.left + 0.30228f * smallHouse.width(), smallHouse.top + 0.48767f * smallHouse.height());
            bezier129Path.lineTo(smallHouse.left + 0.30228f * smallHouse.width(), smallHouse.top + 0.46301f * smallHouse.height());
            bezier129Path.lineTo(smallHouse.left + 0.32865f * smallHouse.width(), smallHouse.top + 0.46301f * smallHouse.height());
            bezier129Path.lineTo(smallHouse.left + 0.37258f * smallHouse.width(), smallHouse.top + 0.47945f * smallHouse.height());
            bezier129Path.lineTo(smallHouse.left + 0.36907f * smallHouse.width(), smallHouse.top + 0.50137f * smallHouse.height());
            bezier129Path.close();
            canvas.drawPath(bezier129Path, getPaint());


            //// Rectangle 44 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.18629f - 0.1f) + 0.6f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.18356f - 0.3f) + 0.8f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.32689f - 0.1f) - Math.floor(smallHouse.width() * 0.18629f - 0.1f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.21096f - 0.3f) - Math.floor(smallHouse.height() * 0.18356f - 0.3f));
            canvas.drawRect(x, y, right, bottom, getPaint());

            //// Rectangle 46 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.11599f - 0.1f) + 0.6f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.29315f - 0.3f) + 0.8f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.26011f - 0.3f) - Math.floor(smallHouse.width() * 0.11599f - 0.1f) + 0.2f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.32055f - 0.3f) - Math.floor(smallHouse.height() * 0.29315f - 0.3f));
            canvas.drawRect(x, y, right, bottom, getPaint());

            //// Rectangle 48 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.28647f + 0.2f) + 0.3f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.29315f - 0.3f) + 0.8f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.32513f) - Math.floor(smallHouse.width() * 0.28647f + 0.2f) + 0.2f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.32055f - 0.3f) - Math.floor(smallHouse.height() * 0.29315f - 0.3f));
            canvas.drawRect(x, y ,right, bottom, getPaint());


            //// Rectangle 50 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.08963f + 0.4f) + 0.1f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.38630f + 0.1f) + 0.4f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.11248f + 0.1f) - Math.floor(smallHouse.width() * 0.08963f + 0.4f) + 0.3f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.41370f + 0.1f) - Math.floor(smallHouse.height() * 0.38630f + 0.1f));
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Bezier 132 Drawing
            Path bezier132Path = new Path();
            bezier132Path.moveTo(smallHouse.left + 0.98243f * smallHouse.width(), smallHouse.top + 0.49589f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.48155f * smallHouse.width(), smallHouse.top + 0.49589f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.48155f * smallHouse.width(), smallHouse.top + 0.47123f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.96661f * smallHouse.width(), smallHouse.top + 0.47123f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.96661f * smallHouse.width(), smallHouse.top + 0.45205f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.93673f * smallHouse.width(), smallHouse.top + 0.45205f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.93673f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.94903f * smallHouse.width(), smallHouse.top + 0.38904f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.75923f * smallHouse.width(), smallHouse.top + 0.14247f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.31634f * smallHouse.width(), smallHouse.top + 0.14247f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.31634f * smallHouse.width(), smallHouse.top + 0.11781f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.76450f * smallHouse.width(), smallHouse.top + 0.11781f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 1.00000f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.95255f * smallHouse.width(), smallHouse.top + 0.41370f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.95255f * smallHouse.width(), smallHouse.top + 0.42740f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.98243f * smallHouse.width(), smallHouse.top + 0.42740f * smallHouse.height());
            bezier132Path.lineTo(smallHouse.left + 0.98243f * smallHouse.width(), smallHouse.top + 0.49589f * smallHouse.height());
            bezier132Path.close();
            canvas.drawPath(bezier132Path, getPaint());


            //// Bezier 134 Drawing
            Path bezier134Path = new Path();
            bezier134Path.moveTo(smallHouse.left + 0.66257f * smallHouse.width(), smallHouse.top + 0.85753f * smallHouse.height());
            bezier134Path.lineTo(smallHouse.left + 0.96661f * smallHouse.width(), smallHouse.top + 0.85753f * smallHouse.height());
            bezier134Path.lineTo(smallHouse.left + 0.96661f * smallHouse.width(), smallHouse.top + 0.48493f * smallHouse.height());
            bezier134Path.lineTo(smallHouse.left + 0.98243f * smallHouse.width(), smallHouse.top + 0.48493f * smallHouse.height());
            bezier134Path.lineTo(smallHouse.left + 0.98243f * smallHouse.width(), smallHouse.top + 0.88219f * smallHouse.height());
            bezier134Path.lineTo(smallHouse.left + 0.66081f * smallHouse.width(), smallHouse.top + 0.88219f * smallHouse.height());
            canvas.drawPath(bezier134Path, getPaint());


            //// Bezier 136 Drawing
            Path bezier136Path = new Path();
            bezier136Path.moveTo(smallHouse.left + 0.98243f * smallHouse.width(), smallHouse.top + 1.00000f * smallHouse.height());
            bezier136Path.lineTo(smallHouse.left + 0.70299f * smallHouse.width(), smallHouse.top + 1.00000f * smallHouse.height());
            bezier136Path.lineTo(smallHouse.left + 0.70299f * smallHouse.width(), smallHouse.top + 0.97808f * smallHouse.height());
            bezier136Path.lineTo(smallHouse.left + 0.96661f * smallHouse.width(), smallHouse.top + 0.97808f * smallHouse.height());
            bezier136Path.lineTo(smallHouse.left + 0.96661f * smallHouse.width(), smallHouse.top + 0.86849f * smallHouse.height());
            bezier136Path.lineTo(smallHouse.left + 0.98243f * smallHouse.width(), smallHouse.top + 0.86849f * smallHouse.height());
            bezier136Path.lineTo(smallHouse.left + 0.98243f * smallHouse.width(), smallHouse.top + 1.00000f * smallHouse.height());
            bezier136Path.close();
            canvas.drawPath(bezier136Path, getPaint());


            //// Bezier 138 Drawing
            Path bezier138Path = new Path();
            bezier138Path.moveTo(smallHouse.left + 0.62742f * smallHouse.width(), smallHouse.top + 0.82192f * smallHouse.height());
            bezier138Path.lineTo(smallHouse.left + 0.61160f * smallHouse.width(), smallHouse.top + 0.82192f * smallHouse.height());
            bezier138Path.lineTo(smallHouse.left + 0.61160f * smallHouse.width(), smallHouse.top + 0.58630f * smallHouse.height());
            bezier138Path.lineTo(smallHouse.left + 0.58348f * smallHouse.width(), smallHouse.top + 0.54521f * smallHouse.height());
            bezier138Path.lineTo(smallHouse.left + 0.48155f * smallHouse.width(), smallHouse.top + 0.54521f * smallHouse.height());
            bezier138Path.lineTo(smallHouse.left + 0.48155f * smallHouse.width(), smallHouse.top + 0.52055f * smallHouse.height());
            bezier138Path.lineTo(smallHouse.left + 0.59051f * smallHouse.width(), smallHouse.top + 0.52055f * smallHouse.height());
            bezier138Path.lineTo(smallHouse.left + 0.62742f * smallHouse.width(), smallHouse.top + 0.57534f * smallHouse.height());
            bezier138Path.lineTo(smallHouse.left + 0.62742f * smallHouse.width(), smallHouse.top + 0.82192f * smallHouse.height());
            bezier138Path.close();
            canvas.drawPath(bezier138Path, getPaint());


            //// Bezier 140 Drawing
            Path bezier140Path = new Path();
            bezier140Path.moveTo(smallHouse.left + 0.95782f * smallHouse.width(), smallHouse.top + 0.86849f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.94200f * smallHouse.width(), smallHouse.top + 0.86849f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.94200f * smallHouse.width(), smallHouse.top + 0.59726f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.91213f * smallHouse.width(), smallHouse.top + 0.54521f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.68190f * smallHouse.width(), smallHouse.top + 0.54521f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.65378f * smallHouse.width(), smallHouse.top + 0.58630f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.65378f * smallHouse.width(), smallHouse.top + 0.84384f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.63796f * smallHouse.width(), smallHouse.top + 0.84384f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.63796f * smallHouse.width(), smallHouse.top + 0.57534f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.67487f * smallHouse.width(), smallHouse.top + 0.52055f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.91740f * smallHouse.width(), smallHouse.top + 0.52055f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.95782f * smallHouse.width(), smallHouse.top + 0.58904f * smallHouse.height());
            bezier140Path.lineTo(smallHouse.left + 0.95782f * smallHouse.width(), smallHouse.top + 0.86849f * smallHouse.height());
            bezier140Path.close();
            canvas.drawPath(bezier140Path, getPaint());


            //// Rectangle 52 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.24956f + 0.3f) + 0.2f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.47397f - 0.1f) + 0.6f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.26714f + 0.3f) - Math.floor(smallHouse.width() * 0.24956f + 0.3f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.81918f + 0.3f) - Math.floor(smallHouse.height() * 0.47397f - 0.1f) - 0.4f);
            canvas.drawRect(x, y, right, bottom, getPaint());

            //// Rectangle 54 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.03339f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.80548f + 0.4f) + 0.1f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.09139f + 0.3f) - Math.floor(smallHouse.width() * 0.03339f - 0.4f) - 0.7f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.83288f + 0.4f) - Math.floor(smallHouse.height() * 0.80548f + 0.4f));
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 56 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.03339f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.88493f + 0.3f) + 0.2f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.09139f + 0.3f) - Math.floor(smallHouse.width() * 0.03339f - 0.4f) - 0.7f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.91233f + 0.3f) - Math.floor(smallHouse.height() * 0.88493f + 0.3f));


            //// Rectangle 58 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.03339f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.72329f + 0.4f) + 0.1f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.09139f + 0.3f) - Math.floor(smallHouse.width() * 0.03339f - 0.4f) - 0.7f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.75068f + 0.4f) - Math.floor(smallHouse.height() * 0.72329f + 0.4f));
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 60 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.03339f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.63836f + 0.3f) + 0.2f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.09139f + 0.3f) - Math.floor(smallHouse.width() * 0.03339f - 0.4f) - 0.7f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.66575f + 0.3f) - Math.floor(smallHouse.height() * 0.63836f + 0.3f));
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 62 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.03339f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.55616f + 0.3f) + 0.2f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.09139f + 0.3f) - Math.floor(smallHouse.width() * 0.03339f - 0.4f) - 0.7f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.58356f + 0.3f) - Math.floor(smallHouse.height() * 0.55616f + 0.3f));
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 64 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.03339f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.47123f + 0.2f) + 0.3f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.09139f + 0.3f) - Math.floor(smallHouse.width() * 0.03339f - 0.4f) - 0.7f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.49863f + 0.2f) - Math.floor(smallHouse.height() * 0.47123f + 0.2f));
            canvas.drawRect(x, y ,right, bottom, getPaint());


            //// Rectangle 66 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.57645f - 0.3f) + 0.8f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.38630f + 0.1f) + 0.4f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.95782f) - Math.floor(smallHouse.width() * 0.57645f - 0.3f) - 0.3f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.41370f + 0.1f) - Math.floor(smallHouse.height() * 0.38630f + 0.1f));
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 68 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.89807f + 0.4f) + 0.1f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.4f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.91564f + 0.4f) - Math.floor(smallHouse.width() * 0.89807f + 0.4f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.44110f - 0.1f) - Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.2f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 70 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.84359f + 0.5f));
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.4f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.86116f + 0.5f) - Math.floor(smallHouse.width() * 0.84359f + 0.5f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.44110f - 0.1f) - Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.2f);
            canvas.drawRect(x, y, right, bottom, getPaint());

            //// Rectangle 72 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.79086f + 0.5f));
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.4f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.80844f + 0.5f) - Math.floor(smallHouse.width() * 0.79086f + 0.5f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.44110f - 0.1f) - Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.2f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 74 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.73638f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.4f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.75395f - 0.4f) - Math.floor(smallHouse.width() * 0.73638f - 0.4f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.44110f - 0.1f) - Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.2f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 76 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.68190f - 0.3f) + 0.8f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.4f);
            right = (float) (Math.floor(smallHouse.width() * 0.69947f - 0.3f) - Math.floor(smallHouse.width() * 0.68190f - 0.3f));
            bottom = (float) (Math.floor(smallHouse.height() * 0.44110f - 0.1f) - Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.2f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 78 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.62917f - 0.3f) + 0.8f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.4f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.64675f - 0.3f) - Math.floor(smallHouse.width() * 0.62917f - 0.3f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.44110f - 0.1f) - Math.floor(smallHouse.height() * 0.40822f + 0.1f) + 0.2f);
            canvas.drawRect(x, y, right, bottom, getPaint());

            //// Rectangle 80 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.89455f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.71233f + 0.5f));
            right = x + (float) (Math.floor(smallHouse.width() * 0.91213f - 0.4f) - Math.floor(smallHouse.width() * 0.89455f - 0.4f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.86301f) - Math.floor(smallHouse.height() * 0.71233f + 0.5f) + 0.5f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 82 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.84359f + 0.5f));
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.71233f + 0.5f));
            right = x + (float) (Math.floor(smallHouse.width() * 0.86116f + 0.5f) - Math.floor(smallHouse.width() * 0.84359f + 0.5f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.86301f) - Math.floor(smallHouse.height() * 0.71233f + 0.5f) + 0.5f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 84 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.79086f + 0.5f));
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.71233f + 0.5f));
            right = x + (float) (Math.floor(smallHouse.width() * 0.80844f + 0.5f) - Math.floor(smallHouse.width() * 0.79086f + 0.5f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.86301f) - Math.floor(smallHouse.height() * 0.71233f + 0.5f) + 0.5f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 86 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.68717f + 0.4f) + 0.1f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.71233f + 0.5f));
            right = x + (float) (Math.floor(smallHouse.width() * 0.70475f + 0.4f) - Math.floor(smallHouse.width() * 0.68717f + 0.4f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.86301f) - Math.floor(smallHouse.height() * 0.71233f + 0.5f) + 0.5f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 88 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.73989f + 0.4f) + 0.1f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.71233f + 0.5f));
            right = x + (float) (Math.floor(smallHouse.width() * 0.75747f + 0.4f) - Math.floor(smallHouse.width() * 0.73989f + 0.4f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.86301f) - Math.floor(smallHouse.height() * 0.71233f + 0.5f) + 0.5f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 90 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.18278f + 0.1f) + 0.4f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.62192f - 0.3f) + 0.8f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.32865f - 0.2f) - Math.floor(smallHouse.width() * 0.18278f + 0.1f) + 0.3f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.64932f - 0.3f) - Math.floor(smallHouse.height() * 0.62192f - 0.3f));
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 92 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.24605f + 0.5f));
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.00000f + 0.2f) + 0.3f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.26362f + 0.5f) - Math.floor(smallHouse.width() * 0.24605f + 0.5f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.03288f) - Math.floor(smallHouse.height() * 0.00000f + 0.2f) + 0.2f);
            canvas.drawRect(x, y, right, bottom, getPaint());

            //// Rectangle 94 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.75395f - 0.4f) + 0.9f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.09863f - 0.2f) + 0.7f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.77153f - 0.4f) - Math.floor(smallHouse.width() * 0.75395f - 0.4f));
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.13151f - 0.4f) - Math.floor(smallHouse.height() * 0.09863f - 0.2f) + 0.2f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 96 Drawing
            x = (float) (smallHouse.left + Math.floor(smallHouse.width() * 0.64675f - 0.3f) + 0.8f);
            y = (float) (smallHouse.top + Math.floor(smallHouse.height() * 0.69589f + 0.4f) + 0.1f);
            right = x + (float) (Math.floor(smallHouse.width() * 0.95255f + 0.3f) - Math.floor(smallHouse.width() * 0.64675f - 0.3f) - 0.6f);
            bottom = y + (float) (Math.floor(smallHouse.height() * 0.72329f + 0.4f) - Math.floor(smallHouse.height() * 0.69589f + 0.4f));
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Bezier 144 Drawing
            Path bezier144Path = new Path();
            bezier144Path.moveTo(smallHouse.left + 0.68014f * smallHouse.width(), smallHouse.top + 1.00000f * smallHouse.height());
            bezier144Path.lineTo(smallHouse.left + 0.40422f * smallHouse.width(), smallHouse.top + 1.00000f * smallHouse.height());
            bezier144Path.lineTo(smallHouse.left + 0.40422f * smallHouse.width(), smallHouse.top + 0.86575f * smallHouse.height());
            bezier144Path.cubicTo(smallHouse.left + 0.40422f * smallHouse.width(), smallHouse.top + 0.78082f * smallHouse.height(),
                    smallHouse.left + 0.44815f * smallHouse.width(), smallHouse.top + 0.70959f * smallHouse.height(),
                    smallHouse.left + 0.50439f * smallHouse.width(), smallHouse.top + 0.70959f * smallHouse.height());
            bezier144Path.cubicTo(smallHouse.left + 0.54833f * smallHouse.width(), smallHouse.top + 0.70959f * smallHouse.height(),
                    smallHouse.left + 0.58524f * smallHouse.width(), smallHouse.top + 0.75342f * smallHouse.height(),
                    smallHouse.left + 0.59930f * smallHouse.width(), smallHouse.top + 0.81644f * smallHouse.height());
            bezier144Path.cubicTo(smallHouse.left + 0.60457f * smallHouse.width(), smallHouse.top + 0.81370f * smallHouse.height(),
                    smallHouse.left + 0.60984f * smallHouse.width(), smallHouse.top + 0.81370f * smallHouse.height(),
                    smallHouse.left + 0.61687f * smallHouse.width(), smallHouse.top + 0.81370f * smallHouse.height());
            bezier144Path.cubicTo(smallHouse.left + 0.65202f * smallHouse.width(), smallHouse.top + 0.81370f * smallHouse.height(),
                    smallHouse.left + 0.68014f * smallHouse.width(), smallHouse.top + 0.85753f * smallHouse.height(),
                    smallHouse.left + 0.68014f * smallHouse.width(), smallHouse.top + 0.91233f * smallHouse.height());
            bezier144Path.lineTo(smallHouse.left + 0.68014f * smallHouse.width(), smallHouse.top + 1.00000f * smallHouse.height());
            bezier144Path.close();
            bezier144Path.moveTo(smallHouse.left + 0.42004f * smallHouse.width(), smallHouse.top + 0.97808f * smallHouse.height());
            bezier144Path.lineTo(smallHouse.left + 0.66432f * smallHouse.width(), smallHouse.top + 0.97808f * smallHouse.height());
            bezier144Path.lineTo(smallHouse.left + 0.66432f * smallHouse.width(), smallHouse.top + 0.91233f * smallHouse.height());
            bezier144Path.cubicTo(smallHouse.left + 0.66432f * smallHouse.width(), smallHouse.top + 0.87123f * smallHouse.height(),
                    smallHouse.left + 0.64323f * smallHouse.width(), smallHouse.top + 0.83836f * smallHouse.height(),
                    smallHouse.left + 0.61687f * smallHouse.width(), smallHouse.top + 0.83836f * smallHouse.height());
            bezier144Path.cubicTo(smallHouse.left + 0.60984f * smallHouse.width(), smallHouse.top + 0.83836f * smallHouse.height(),
                    smallHouse.left + 0.60457f * smallHouse.width(), smallHouse.top + 0.84110f * smallHouse.height(),
                    smallHouse.left + 0.59754f * smallHouse.width(), smallHouse.top + 0.84384f * smallHouse.height());
            bezier144Path.lineTo(smallHouse.left + 0.58875f * smallHouse.width(), smallHouse.top + 0.84932f * smallHouse.height());
            bezier144Path.lineTo(smallHouse.left + 0.58699f * smallHouse.width(), smallHouse.top + 0.83562f * smallHouse.height());
            bezier144Path.cubicTo(smallHouse.left + 0.57821f * smallHouse.width(), smallHouse.top + 0.77534f * smallHouse.height(),
                    smallHouse.left + 0.54482f * smallHouse.width(), smallHouse.top + 0.73425f * smallHouse.height(),
                    smallHouse.left + 0.50615f * smallHouse.width(), smallHouse.top + 0.73425f * smallHouse.height());
            bezier144Path.cubicTo(smallHouse.left + 0.46046f * smallHouse.width(), smallHouse.top + 0.73425f * smallHouse.height(),
                    smallHouse.left + 0.42179f * smallHouse.width(), smallHouse.top + 0.79178f * smallHouse.height(),
                    smallHouse.left + 0.42179f * smallHouse.width(), smallHouse.top + 0.86575f * smallHouse.height());
            bezier144Path.lineTo(smallHouse.left + 0.42179f * smallHouse.width(), smallHouse.top + 0.97808f * smallHouse.height());
            bezier144Path.lineTo(smallHouse.left + 0.42004f * smallHouse.width(), smallHouse.top + 0.97808f * smallHouse.height());
            bezier144Path.close();
            canvas.drawPath(bezier144Path, getPaint());
        }
    }
}
