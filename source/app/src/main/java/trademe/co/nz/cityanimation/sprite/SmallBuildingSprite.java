package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 6/02/15.
 */
public class SmallBuildingSprite extends Sprite {
    public SmallBuildingSprite(Rect bounds) {
        super(bounds);
    }

    public SmallBuildingSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        //// Subframes
        x = bounds.left + 1.3f;
        y = bounds.top + 1.2f;
        right = x + (float) Math.floor((bounds.width() - 1.3f) * 0.94737f + 1.1f) - 0.6f;
        bottom = y + (float) Math.floor((bounds.height() - 1.2f) * 0.98797f + 0.9f) - 0.4f;
        RectF buildingStructure = new RectF(x, y, right, bottom);

        //// building structure
        {
            //// Bezier 149 Drawing
            Path bezier149Path = new Path();
            bezier149Path.moveTo(buildingStructure.left + 0.00000f * buildingStructure.width(), buildingStructure.top + 1.00000f * buildingStructure.height());
            bezier149Path.lineTo(buildingStructure.left + 0.00000f * buildingStructure.width(), buildingStructure.top + 0.04601f * buildingStructure.height());
            bezier149Path.lineTo(buildingStructure.left + 1.00000f * buildingStructure.width(), buildingStructure.top + 0.04601f * buildingStructure.height());
            bezier149Path.lineTo(buildingStructure.left + 1.00000f * buildingStructure.width(), buildingStructure.top + 1.00000f * buildingStructure.height());
            bezier149Path.lineTo(buildingStructure.left + 0.20940f * buildingStructure.width(), buildingStructure.top + 1.00000f * buildingStructure.height());
            bezier149Path.lineTo(buildingStructure.left + 0.00000f * buildingStructure.width(), buildingStructure.top + 1.00000f * buildingStructure.height());
            bezier149Path.close();
            canvas.drawPath(bezier149Path, getPaint());

            //// Bezier 151 Drawing
            Path bezier151Path = new Path();
            bezier151Path.moveTo(buildingStructure.left + 0.20940f * buildingStructure.width(), buildingStructure.top + 1.00000f * buildingStructure.height());
            bezier151Path.lineTo(buildingStructure.left + 0.20940f * buildingStructure.width(), buildingStructure.top + 0.78078f * buildingStructure.height());
            bezier151Path.lineTo(buildingStructure.left + 0.50000f * buildingStructure.width(), buildingStructure.top + 0.78078f * buildingStructure.height());
            bezier151Path.lineTo(buildingStructure.left + 0.80769f * buildingStructure.width(), buildingStructure.top + 0.78078f * buildingStructure.height());
            bezier151Path.lineTo(buildingStructure.left + 0.80769f * buildingStructure.width(), buildingStructure.top + 1.00000f * buildingStructure.height());
            canvas.drawPath(bezier151Path, getPaint());


            //// Bezier 153 Drawing
            Path bezier153Path = new Path();
            bezier153Path.moveTo(buildingStructure.left + 0.50855f * buildingStructure.width(), buildingStructure.top + 1.00000f * buildingStructure.height());
            bezier153Path.lineTo(buildingStructure.left + 0.50855f * buildingStructure.width(), buildingStructure.top + 0.78078f * buildingStructure.height());
            canvas.drawPath(bezier153Path, getPaint());


            //// Rectangle 122 Drawing
            x = (float) (buildingStructure.left + Math.floor(buildingStructure.width() * 0.20940f - 0.4f) + 0.9f);
            y = (float) (buildingStructure.top + Math.floor(buildingStructure.height() * 0.62382f - 0.4f) + 0.9f);
            right = x + (float) (Math.floor(buildingStructure.width() * 0.40171f + 0.1f) - Math.floor(buildingStructure.width() * 0.20940f - 0.4f) - 0.5f);
            bottom = y + (float) (Math.floor(buildingStructure.height() * 0.71719f - 0.3f) - Math.floor(buildingStructure.height() * 0.62382f - 0.4f) - 0.1f);
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 124 Drawing
            x = (float) (buildingStructure.left + Math.floor(buildingStructure.width() * 0.20940f - 0.4f) + 0.9f);
            y = (float) (buildingStructure.top + Math.floor(buildingStructure.height() * 0.45061f - 0.2f) + 0.7f);
            right = x + (float) (Math.floor(buildingStructure.width() * 0.40171f + 0.1f) - Math.floor(buildingStructure.width() * 0.20940f - 0.4f) - 0.5f);
            bottom = y + (float) (Math.floor(buildingStructure.height() * 0.54398f - 0.1f) - Math.floor(buildingStructure.height() * 0.45061f - 0.2f) - 0.1f);
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 126 Drawing
            x = (float) (buildingStructure.left + Math.floor(buildingStructure.width() * 0.20940f - 0.4f) + 0.9f);
            y = (float) (buildingStructure.top + Math.floor(buildingStructure.height() * 0.27605f - 0.1f) + 0.6f);
            right = x + (float) (Math.floor(buildingStructure.width() * 0.40171f + 0.1f) - Math.floor(buildingStructure.width() * 0.20940f - 0.4f) - 0.5f);
            bottom = y + (float) (Math.floor(buildingStructure.height() * 0.36942f) - Math.floor(buildingStructure.height() * 0.27605f - 0.1f) - 0.1f);
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 128 Drawing
            x = (float) (buildingStructure.left + Math.floor(buildingStructure.width() * 0.58974f - 0.3f) + 0.8f);
            y = (float) (buildingStructure.top + Math.floor(buildingStructure.height() * 0.62517f - 0.3f) + 0.8f);
            right = x + (float) (Math.floor(buildingStructure.width() * 0.78205f + 0.2f) - Math.floor(buildingStructure.width() * 0.58974f - 0.3f) - 0.5f);
            bottom = y + (float) (Math.floor(buildingStructure.height() * 0.71854f - 0.2f) - Math.floor(buildingStructure.height() * 0.62517f - 0.3f) - 0.1f);
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 130 Drawing
            x = (float) (buildingStructure.left + Math.floor(buildingStructure.width() * 0.58974f - 0.3f) + 0.8f);
            y = (float) (buildingStructure.top + Math.floor(buildingStructure.height() * 0.45196f - 0.1f) + 0.6f);
            right = x + (float) (Math.floor(buildingStructure.width() * 0.78205f + 0.2f) - Math.floor(buildingStructure.width() * 0.58974f - 0.3f) - 0.5f);
            bottom = y + (float) (Math.floor(buildingStructure.height() * 0.54533f) - Math.floor(buildingStructure.height() * 0.45196f - 0.1f) - 0.1f);
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 132 Drawing
            x = (float) (buildingStructure.left + Math.floor(buildingStructure.width() * 0.58974f - 0.3f) + 0.8f);
            y = (float) (buildingStructure.top + Math.floor(buildingStructure.height() * 0.27740f) + 0.5f);
            right = x + (float) (Math.floor(buildingStructure.width() * 0.78205f + 0.2f) - Math.floor(buildingStructure.width() * 0.58974f - 0.3f) - 0.5f);
            bottom = y + (float) (Math.floor(buildingStructure.height() * 0.37077f + 0.1f) - Math.floor(buildingStructure.height() * 0.27740f) - 0.1f);
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 134 Drawing
            x = (float) (buildingStructure.left + Math.floor(buildingStructure.width() * 0.20940f - 0.4f) + 0.9f);
            y = (float) (buildingStructure.top + Math.floor(buildingStructure.height() * 0.10149f) + 0.5f);
            right = x + (float) (Math.floor(buildingStructure.width() * 0.40171f + 0.1f) - Math.floor(buildingStructure.width() * 0.20940f - 0.4f) - 0.5f);
            bottom = y + (float) (Math.floor(buildingStructure.height() * 0.19486f + 0.1f) - Math.floor(buildingStructure.height() * 0.10149f) - 0.1f);
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Rectangle 136 Drawing
            x = (float) (buildingStructure.left + Math.floor(buildingStructure.width() * 0.59402f - 0.4f) + 0.9f);
            y = (float) (buildingStructure.top + Math.floor(buildingStructure.height() * 0.10284f + 0.1f) + 0.4f);
            right = x + (float) (Math.floor(buildingStructure.width() * 0.78632f + 0.1f) - Math.floor(buildingStructure.width() * 0.59402f - 0.4f) - 0.5f);
            bottom = y + (float) (Math.floor(buildingStructure.height() * 0.19621f + 0.2f) - Math.floor(buildingStructure.height() * 0.10284f + 0.1f) - 0.1f);
            canvas.drawRect(new RectF(x, y, right, bottom), getPaint());


            //// Bezier 155 Drawing
            Path bezier155Path = new Path();
            bezier155Path.moveTo(buildingStructure.left + 0.56410f * buildingStructure.width(), buildingStructure.top + 0.89039f * buildingStructure.height());
            bezier155Path.lineTo(buildingStructure.left + 0.60256f * buildingStructure.width(), buildingStructure.top + 0.89039f * buildingStructure.height());
            canvas.drawPath(bezier155Path, getPaint());

            //// Bezier 157 Drawing
            Path bezier157Path = new Path();
            bezier157Path.moveTo(buildingStructure.left + 0.40171f * buildingStructure.width(), buildingStructure.top + 0.89039f * buildingStructure.height());
            bezier157Path.lineTo(buildingStructure.left + 0.44017f * buildingStructure.width(), buildingStructure.top + 0.89039f * buildingStructure.height());
            canvas.drawPath(bezier157Path, getPaint());


            //// Bezier 159 Drawing
            Path bezier159Path = new Path();
            bezier159Path.moveTo(buildingStructure.left + 0.08120f * buildingStructure.width(), buildingStructure.top + 0.04601f * buildingStructure.height());
            bezier159Path.lineTo(buildingStructure.left + 0.08120f * buildingStructure.width(), buildingStructure.top + 0.00000f * buildingStructure.height());
            bezier159Path.lineTo(buildingStructure.left + 0.17094f * buildingStructure.width(), buildingStructure.top + 0.00000f * buildingStructure.height());
            bezier159Path.lineTo(buildingStructure.left + 0.17094f * buildingStructure.width(), buildingStructure.top + 0.04601f * buildingStructure.height());
            canvas.drawPath(bezier159Path, getPaint());
        }
    }
}
