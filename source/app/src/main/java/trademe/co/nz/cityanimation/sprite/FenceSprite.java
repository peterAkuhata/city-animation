package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 6/02/15.
 */
public class FenceSprite extends Sprite {
    public FenceSprite(Rect bounds) {
        super(bounds);
    }

    public FenceSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        //// Subframes
        x = bounds.left + 0.6f;
        y = bounds.top + 1.1f;
        right = x + (float) Math.floor((bounds.width() - 0.6f) * 0.96610f + 0.3f) + 0.2f;
        bottom = y + (float) Math.floor((bounds.height() - 1.1f) * 0.89076f + 0.7f) - 0.2f;
        RectF fence = new RectF(x, y, right, bottom);


        //// fence
        {
            //// Rectangle 2 Drawing
            x = (float) (fence.left + Math.floor(fence.width() * 0.37427f - 0.3f) + 0.8f);
            y = (float) (fence.top + Math.floor(fence.height() * 0.50000f + 0.2f) + 0.3f);
            right = x + (float) (Math.floor(fence.width() * 1.00000f + 0.3f) - Math.floor(fence.width() * 0.37427f - 0.3f) - 0.6f);
            bottom = y + (float) (Math.floor(fence.height() * 0.59434f + 0.2f) - Math.floor(fence.height() * 0.50000f + 0.2f));
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Bezier 2 Drawing
            Path bezier2Path = new Path();
            bezier2Path.moveTo(fence.left + 0.99708f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier2Path.lineTo(fence.left + 0.99708f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier2Path.lineTo(fence.left + 0.96784f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier2Path.lineTo(fence.left + 0.96784f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier2Path.lineTo(fence.left + 0.98246f * fence.width(), fence.top + 0.28302f * fence.height());
            bezier2Path.lineTo(fence.left + 0.99708f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier2Path.close();
            canvas.drawPath(bezier2Path, getPaint());


            //// Bezier 4 Drawing
            Path bezier4Path = new Path();
            bezier4Path.moveTo(fence.left + 0.76023f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier4Path.lineTo(fence.left + 0.76023f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier4Path.lineTo(fence.left + 0.73099f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier4Path.lineTo(fence.left + 0.73099f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier4Path.lineTo(fence.left + 0.74561f * fence.width(), fence.top + 0.28302f * fence.height());
            bezier4Path.lineTo(fence.left + 0.76023f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier4Path.close();
            canvas.drawPath(bezier4Path, getPaint());


            //// Bezier 6 Drawing
            Path bezier6Path = new Path();
            bezier6Path.moveTo(fence.left + 0.88012f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier6Path.lineTo(fence.left + 0.88012f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier6Path.lineTo(fence.left + 0.84795f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier6Path.lineTo(fence.left + 0.84795f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier6Path.lineTo(fence.left + 0.86550f * fence.width(), fence.top + 0.28302f * fence.height());
            bezier6Path.lineTo(fence.left + 0.88012f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier6Path.close();
            canvas.drawPath(bezier6Path, getPaint());


            //// Bezier 8 Drawing
            Path bezier8Path = new Path();
            bezier8Path.moveTo(fence.left + 0.64035f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier8Path.lineTo(fence.left + 0.64035f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier8Path.lineTo(fence.left + 0.61111f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier8Path.lineTo(fence.left + 0.61111f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier8Path.lineTo(fence.left + 0.62573f * fence.width(), fence.top + 0.28302f * fence.height());
            bezier8Path.lineTo(fence.left + 0.64035f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier8Path.close();
            canvas.drawPath(bezier8Path, getPaint());


            //// Bezier 10 Drawing
            Path bezier10Path = new Path();
            bezier10Path.moveTo(fence.left + 0.40351f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier10Path.lineTo(fence.left + 0.40351f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier10Path.lineTo(fence.left + 0.37427f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier10Path.lineTo(fence.left + 0.37427f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier10Path.lineTo(fence.left + 0.38889f * fence.width(), fence.top + 0.28302f * fence.height());
            bezier10Path.lineTo(fence.left + 0.40351f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier10Path.close();
            canvas.drawPath(bezier10Path, getPaint());


            //// Bezier 12 Drawing
            Path bezier12Path = new Path();
            bezier12Path.moveTo(fence.left + 0.52339f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier12Path.lineTo(fence.left + 0.52339f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier12Path.lineTo(fence.left + 0.49123f * fence.width(), fence.top + 0.98113f * fence.height());
            bezier12Path.lineTo(fence.left + 0.49123f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier12Path.lineTo(fence.left + 0.50585f * fence.width(), fence.top + 0.28302f * fence.height());
            bezier12Path.lineTo(fence.left + 0.52339f * fence.width(), fence.top + 0.33962f * fence.height());
            bezier12Path.close();
            canvas.drawPath(bezier12Path, getPaint());


            //// Bezier 147 Drawing
            Path bezier147Path = new Path();
            bezier147Path.moveTo(fence.left + 0.45906f * fence.width(), fence.top + 1.00000f * fence.height());
            bezier147Path.lineTo(fence.left + 0.00000f * fence.width(), fence.top + 1.00000f * fence.height());
            bezier147Path.lineTo(fence.left + 0.00000f * fence.width(), fence.top + 0.53774f * fence.height());
            bezier147Path.cubicTo(fence.left + 0.00000f * fence.width(), fence.top + 0.24528f * fence.height(),
                    fence.left + 0.07310f * fence.width(), fence.top + 0.00000f * fence.height(),
                    fence.left + 0.16667f * fence.width(), fence.top + 0.00000f * fence.height());
            bezier147Path.cubicTo(fence.left + 0.23977f * fence.width(), fence.top + 0.00000f * fence.height(),
                    fence.left + 0.30117f * fence.width(), fence.top + 0.15094f * fence.height(),
                    fence.left + 0.32456f * fence.width(), fence.top + 0.36792f * fence.height());
            bezier147Path.cubicTo(fence.left + 0.33333f * fence.width(), fence.top + 0.35849f * fence.height(),
                    fence.left + 0.34211f * fence.width(), fence.top + 0.35849f * fence.height(),
                    fence.left + 0.35380f * fence.width(), fence.top + 0.35849f * fence.height());
            bezier147Path.cubicTo(fence.left + 0.41228f * fence.width(), fence.top + 0.35849f * fence.height(),
                    fence.left + 0.45906f * fence.width(), fence.top + 0.50943f * fence.height(),
                    fence.left + 0.45906f * fence.width(), fence.top + 0.69811f * fence.height());
            bezier147Path.lineTo(fence.left + 0.45906f * fence.width(), fence.top + 1.00000f * fence.height());
            bezier147Path.close();
            bezier147Path.moveTo(fence.left + 0.02924f * fence.width(), fence.top + 0.91509f * fence.height());
            bezier147Path.lineTo(fence.left + 0.43567f * fence.width(), fence.top + 0.91509f * fence.height());
            bezier147Path.lineTo(fence.left + 0.43567f * fence.width(), fence.top + 0.68868f * fence.height());
            bezier147Path.cubicTo(fence.left + 0.43567f * fence.width(), fence.top + 0.54717f * fence.height(),
                    fence.left + 0.40058f * fence.width(), fence.top + 0.43396f * fence.height(),
                    fence.left + 0.35673f * fence.width(), fence.top + 0.43396f * fence.height());
            bezier147Path.cubicTo(fence.left + 0.34503f * fence.width(), fence.top + 0.43396f * fence.height(),
                    fence.left + 0.33626f * fence.width(), fence.top + 0.44340f * fence.height(),
                    fence.left + 0.32456f * fence.width(), fence.top + 0.45283f * fence.height());
            bezier147Path.lineTo(fence.left + 0.30994f * fence.width(), fence.top + 0.47170f * fence.height());
            bezier147Path.lineTo(fence.left + 0.30702f * fence.width(), fence.top + 0.42453f * fence.height());
            bezier147Path.cubicTo(fence.left + 0.29240f * fence.width(), fence.top + 0.21698f * fence.height(),
                    fence.left + 0.23684f * fence.width(), fence.top + 0.07547f * fence.height(),
                    fence.left + 0.17251f * fence.width(), fence.top + 0.07547f * fence.height());
            bezier147Path.cubicTo(fence.left + 0.09649f * fence.width(), fence.top + 0.07547f * fence.height(),
                    fence.left + 0.03216f * fence.width(), fence.top + 0.27358f * fence.height(),
                    fence.left + 0.03216f * fence.width(), fence.top + 0.52830f * fence.height());
            bezier147Path.lineTo(fence.left + 0.03216f * fence.width(), fence.top + 0.91509f * fence.height());
            bezier147Path.lineTo(fence.left + 0.02924f * fence.width(), fence.top + 0.91509f * fence.height());
            bezier147Path.close();
            canvas.drawPath(bezier147Path, getPaint());
        }
    }
}
