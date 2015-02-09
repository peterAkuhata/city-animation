package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 6/02/15.
 */
public class BigTreeSprite extends Sprite {
    public BigTreeSprite(Rect bounds) {
        super(bounds);

        getPaint().setStrokeWidth(0.25f);
    }

    public BigTreeSprite() {
        super();

        getPaint().setStrokeWidth(0.25f);
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        //// Subframes
        x = bounds.left + 1.0f;
        y = bounds.top + 0.5f;
        right = x + (float) (Math.floor((bounds.width() - 1.0f) * 0.98065f + 1.1f) - 0.6f);
        bottom = y + (float) (Math.floor((bounds.height() - 0.5f) * 0.99121f + 0.5f));
        RectF bigTree = new RectF(x, y, right, bottom);


        //// big tree
        {
            //// big tree branches
            {
                //// Bezier 14 Drawing
                Path bezier14Path = new Path();
                bezier14Path.moveTo(bigTree.left + 0.55921f * bigTree.width(), bigTree.top + 1.00000f * bigTree.height());
                bezier14Path.cubicTo(bigTree.left + 0.55921f * bigTree.width(), bigTree.top + 0.99113f * bigTree.height(), 
                        bigTree.left + 0.55921f * bigTree.width(), bigTree.top + 0.55211f * bigTree.height(),
                        bigTree.left + 0.55921f * bigTree.width(), bigTree.top + 0.55211f * bigTree.height());
                bezier14Path.lineTo(bigTree.left + 0.41118f * bigTree.width(), bigTree.top + 0.33703f * bigTree.height());
                canvas.drawPath(bezier14Path, getPaint());


                //// Bezier 16 Drawing
                Path bezier16Path = new Path();
                bezier16Path.moveTo(bigTree.left + 0.70724f * bigTree.width(), bigTree.top + 0.31264f * bigTree.height());
                bezier16Path.lineTo(bigTree.left + 0.55921f * bigTree.width(), bigTree.top + 0.55211f * bigTree.height());
                canvas.drawPath(bezier16Path, getPaint());


                //// Bezier 18 Drawing
                Path bezier18Path = new Path();
                bezier18Path.moveTo(bigTree.left + 0.55921f * bigTree.width(), bigTree.top + 0.23725f * bigTree.height());
                bezier18Path.lineTo(bigTree.left + 0.62829f * bigTree.width(), bigTree.top + 0.44346f * bigTree.height());
                canvas.drawPath(bezier18Path, getPaint());
            }


            //// big tree leaves
            {
                //// Bezier 50 Drawing
                Path bezier50Path = new Path();
                bezier50Path.moveTo(bigTree.left + 0.59868f * bigTree.width(), bigTree.top + 0.13525f * bigTree.height());
                bezier50Path.lineTo(bigTree.left + 0.49342f * bigTree.width(), bigTree.top + 0.16186f * bigTree.height());
                bezier50Path.lineTo(bigTree.left + 0.50658f * bigTree.width(), bigTree.top + 0.08647f * bigTree.height());
                bezier50Path.lineTo(bigTree.left + 0.61184f * bigTree.width(), bigTree.top + 0.05987f * bigTree.height());
                bezier50Path.lineTo(bigTree.left + 0.59868f * bigTree.width(), bigTree.top + 0.13525f * bigTree.height());
                bezier50Path.close();
                bezier50Path.moveTo(bigTree.left + 0.51974f * bigTree.width(), bigTree.top + 0.13969f * bigTree.height());
                bezier50Path.lineTo(bigTree.left + 0.57895f * bigTree.width(), bigTree.top + 0.12417f * bigTree.height());
                bezier50Path.lineTo(bigTree.left + 0.58882f * bigTree.width(), bigTree.top + 0.08204f * bigTree.height());
                bezier50Path.lineTo(bigTree.left + 0.52961f * bigTree.width(), bigTree.top + 0.09756f * bigTree.height());
                bezier50Path.lineTo(bigTree.left + 0.51974f * bigTree.width(), bigTree.top + 0.13969f * bigTree.height());
                bezier50Path.close();
                canvas.drawPath(bezier50Path, getPaint());


                //// Bezier 52 Drawing
                Path bezier52Path = new Path();
                bezier52Path.moveTo(bigTree.left + 0.41447f * bigTree.width(), bigTree.top + 0.17960f * bigTree.height());
                bezier52Path.lineTo(bigTree.left + 0.33224f * bigTree.width(), bigTree.top + 0.12860f * bigTree.height());
                bezier52Path.lineTo(bigTree.left + 0.43750f * bigTree.width(), bigTree.top + 0.10200f * bigTree.height());
                bezier52Path.lineTo(bigTree.left + 0.51974f * bigTree.width(), bigTree.top + 0.15299f * bigTree.height());
                bezier52Path.lineTo(bigTree.left + 0.41447f * bigTree.width(), bigTree.top + 0.17960f * bigTree.height());
                bezier52Path.close();
                bezier52Path.moveTo(bigTree.left + 0.37171f * bigTree.width(), bigTree.top + 0.13304f * bigTree.height());
                bezier52Path.lineTo(bigTree.left + 0.41776f * bigTree.width(), bigTree.top + 0.16186f * bigTree.height());
                bezier52Path.lineTo(bigTree.left + 0.47697f * bigTree.width(), bigTree.top + 0.14634f * bigTree.height());
                bezier52Path.lineTo(bigTree.left + 0.43092f * bigTree.width(), bigTree.top + 0.11752f * bigTree.height());
                bezier52Path.lineTo(bigTree.left + 0.37171f * bigTree.width(), bigTree.top + 0.13304f * bigTree.height());
                bezier52Path.close();
                canvas.drawPath(bezier52Path, getPaint());


                //// Bezier 54 Drawing
                Path bezier54Path = new Path();
                bezier54Path.moveTo(bigTree.left + 0.63816f * bigTree.width(), bigTree.top + 0.21286f * bigTree.height());
                bezier54Path.lineTo(bigTree.left + 0.53289f * bigTree.width(), bigTree.top + 0.23947f * bigTree.height());
                bezier54Path.lineTo(bigTree.left + 0.54605f * bigTree.width(), bigTree.top + 0.16408f * bigTree.height());
                bezier54Path.lineTo(bigTree.left + 0.65132f * bigTree.width(), bigTree.top + 0.13747f * bigTree.height());
                bezier54Path.lineTo(bigTree.left + 0.63816f * bigTree.width(), bigTree.top + 0.21286f * bigTree.height());
                bezier54Path.close();
                bezier54Path.moveTo(bigTree.left + 0.55921f * bigTree.width(), bigTree.top + 0.21729f * bigTree.height());
                bezier54Path.lineTo(bigTree.left + 0.61842f * bigTree.width(), bigTree.top + 0.20177f * bigTree.height());
                bezier54Path.lineTo(bigTree.left + 0.62829f * bigTree.width(), bigTree.top + 0.15965f * bigTree.height());
                bezier54Path.lineTo(bigTree.left + 0.56908f * bigTree.width(), bigTree.top + 0.17517f * bigTree.height());
                bezier54Path.lineTo(bigTree.left + 0.55921f * bigTree.width(), bigTree.top + 0.21729f * bigTree.height());
                bezier54Path.close();
                canvas.drawPath(bezier54Path, getPaint());


                //// Bezier 56 Drawing
                Path bezier56Path = new Path();
                bezier56Path.moveTo(bigTree.left + 0.45395f * bigTree.width(), bigTree.top + 0.25721f * bigTree.height());
                bezier56Path.lineTo(bigTree.left + 0.37171f * bigTree.width(), bigTree.top + 0.20621f * bigTree.height());
                bezier56Path.lineTo(bigTree.left + 0.47697f * bigTree.width(), bigTree.top + 0.17960f * bigTree.height());
                bezier56Path.lineTo(bigTree.left + 0.55921f * bigTree.width(), bigTree.top + 0.23060f * bigTree.height());
                bezier56Path.lineTo(bigTree.left + 0.45395f * bigTree.width(), bigTree.top + 0.25721f * bigTree.height());
                bezier56Path.close();
                bezier56Path.moveTo(bigTree.left + 0.41118f * bigTree.width(), bigTree.top + 0.21064f * bigTree.height());
                bezier56Path.lineTo(bigTree.left + 0.45724f * bigTree.width(), bigTree.top + 0.23947f * bigTree.height());
                bezier56Path.lineTo(bigTree.left + 0.51645f * bigTree.width(), bigTree.top + 0.22395f * bigTree.height());
                bezier56Path.lineTo(bigTree.left + 0.47039f * bigTree.width(), bigTree.top + 0.19512f * bigTree.height());
                bezier56Path.lineTo(bigTree.left + 0.41118f * bigTree.width(), bigTree.top + 0.21064f * bigTree.height());
                bezier56Path.close();
                canvas.drawPath(bezier56Path, getPaint());


                //// Bezier 58 Drawing
                Path bezier58Path = new Path();
                bezier58Path.moveTo(bigTree.left + 0.48684f * bigTree.width(), bigTree.top + 0.11973f * bigTree.height());
                bezier58Path.lineTo(bigTree.left + 0.40789f * bigTree.width(), bigTree.top + 0.07095f * bigTree.height());
                bezier58Path.lineTo(bigTree.left + 0.41776f * bigTree.width(), bigTree.top + 0.00000f * bigTree.height());
                bezier58Path.lineTo(bigTree.left + 0.49671f * bigTree.width(), bigTree.top + 0.04878f * bigTree.height());
                bezier58Path.lineTo(bigTree.left + 0.48684f * bigTree.width(), bigTree.top + 0.11973f * bigTree.height());
                bezier58Path.close();
                bezier58Path.moveTo(bigTree.left + 0.43092f * bigTree.width(), bigTree.top + 0.06652f * bigTree.height());
                bezier58Path.lineTo(bigTree.left + 0.47039f * bigTree.width(), bigTree.top + 0.09091f * bigTree.height());
                bezier58Path.lineTo(bigTree.left + 0.47368f * bigTree.width(), bigTree.top + 0.05543f * bigTree.height());
                bezier58Path.lineTo(bigTree.left + 0.43421f * bigTree.width(), bigTree.top + 0.03104f * bigTree.height());
                bezier58Path.lineTo(bigTree.left + 0.43092f * bigTree.width(), bigTree.top + 0.06652f * bigTree.height());
                bezier58Path.close();
                canvas.drawPath(bezier58Path, getPaint());


                //// Bezier 60 Drawing
                Path bezier60Path = new Path();
                bezier60Path.moveTo(bigTree.left + 0.89474f * bigTree.width(), bigTree.top + 0.29712f * bigTree.height());
                bezier60Path.lineTo(bigTree.left + 0.81250f * bigTree.width(), bigTree.top + 0.24390f * bigTree.height());
                bezier60Path.lineTo(bigTree.left + 0.91776f * bigTree.width(), bigTree.top + 0.21951f * bigTree.height());
                bezier60Path.lineTo(bigTree.left + 1.00000f * bigTree.width(), bigTree.top + 0.27273f * bigTree.height());
                bezier60Path.lineTo(bigTree.left + 0.89474f * bigTree.width(), bigTree.top + 0.29712f * bigTree.height());
                bezier60Path.close();
                bezier60Path.moveTo(bigTree.left + 0.85526f * bigTree.width(), bigTree.top + 0.25055f * bigTree.height());
                bezier60Path.lineTo(bigTree.left + 0.90132f * bigTree.width(), bigTree.top + 0.28160f * bigTree.height());
                bezier60Path.lineTo(bigTree.left + 0.96382f * bigTree.width(), bigTree.top + 0.26829f * bigTree.height());
                bezier60Path.lineTo(bigTree.left + 0.91776f * bigTree.width(), bigTree.top + 0.23725f * bigTree.height());
                bezier60Path.lineTo(bigTree.left + 0.85526f * bigTree.width(), bigTree.top + 0.25055f * bigTree.height());
                bezier60Path.close();
                canvas.drawPath(bezier60Path, getPaint());


                //// Bezier 62 Drawing
                Path bezier62Path = new Path();
                bezier62Path.moveTo(bigTree.left + 0.75329f * bigTree.width(), bigTree.top + 0.20621f * bigTree.height());
                bezier62Path.lineTo(bigTree.left + 0.78618f * bigTree.width(), bigTree.top + 0.13304f * bigTree.height());
                bezier62Path.lineTo(bigTree.left + 0.86842f * bigTree.width(), bigTree.top + 0.18625f * bigTree.height());
                bezier62Path.lineTo(bigTree.left + 0.83553f * bigTree.width(), bigTree.top + 0.25942f * bigTree.height());
                bezier62Path.lineTo(bigTree.left + 0.75329f * bigTree.width(), bigTree.top + 0.20621f * bigTree.height());
                bezier62Path.close();
                bezier62Path.moveTo(bigTree.left + 0.79605f * bigTree.width(), bigTree.top + 0.15965f * bigTree.height());
                bezier62Path.lineTo(bigTree.left + 0.77632f * bigTree.width(), bigTree.top + 0.20177f * bigTree.height());
                bezier62Path.lineTo(bigTree.left + 0.82237f * bigTree.width(), bigTree.top + 0.23282f * bigTree.height());
                bezier62Path.lineTo(bigTree.left + 0.84211f * bigTree.width(), bigTree.top + 0.19069f * bigTree.height());
                bezier62Path.lineTo(bigTree.left + 0.79605f * bigTree.width(), bigTree.top + 0.15965f * bigTree.height());
                bezier62Path.close();
                canvas.drawPath(bezier62Path, getPaint());


                //// Bezier 64 Drawing
                Path bezier64Path = new Path();
                bezier64Path.moveTo(bigTree.left + 0.81250f * bigTree.width(), bigTree.top + 0.35698f * bigTree.height());
                bezier64Path.lineTo(bigTree.left + 0.73026f * bigTree.width(), bigTree.top + 0.30377f * bigTree.height());
                bezier64Path.lineTo(bigTree.left + 0.83553f * bigTree.width(), bigTree.top + 0.27938f * bigTree.height());
                bezier64Path.lineTo(bigTree.left + 0.91776f * bigTree.width(), bigTree.top + 0.33259f * bigTree.height());
                bezier64Path.lineTo(bigTree.left + 0.81250f * bigTree.width(), bigTree.top + 0.35698f * bigTree.height());
                bezier64Path.close();
                bezier64Path.moveTo(bigTree.left + 0.76974f * bigTree.width(), bigTree.top + 0.31042f * bigTree.height());
                bezier64Path.lineTo(bigTree.left + 0.81579f * bigTree.width(), bigTree.top + 0.34146f * bigTree.height());
                bezier64Path.lineTo(bigTree.left + 0.87829f * bigTree.width(), bigTree.top + 0.32816f * bigTree.height());
                bezier64Path.lineTo(bigTree.left + 0.83224f * bigTree.width(), bigTree.top + 0.29712f * bigTree.height());
                bezier64Path.lineTo(bigTree.left + 0.76974f * bigTree.width(), bigTree.top + 0.31042f * bigTree.height());
                bezier64Path.close();
                canvas.drawPath(bezier64Path, getPaint());


                //// Bezier 66 Drawing
                Path bezier66Path = new Path();
                bezier66Path.moveTo(bigTree.left + 0.67105f * bigTree.width(), bigTree.top + 0.26386f * bigTree.height());
                bezier66Path.lineTo(bigTree.left + 0.70395f * bigTree.width(), bigTree.top + 0.19069f * bigTree.height());
                bezier66Path.lineTo(bigTree.left + 0.78618f * bigTree.width(), bigTree.top + 0.24390f * bigTree.height());
                bezier66Path.lineTo(bigTree.left + 0.75329f * bigTree.width(), bigTree.top + 0.31707f * bigTree.height());
                bezier66Path.lineTo(bigTree.left + 0.67105f * bigTree.width(), bigTree.top + 0.26386f * bigTree.height());
                bezier66Path.close();
                bezier66Path.moveTo(bigTree.left + 0.71382f * bigTree.width(), bigTree.top + 0.21729f * bigTree.height());
                bezier66Path.lineTo(bigTree.left + 0.69408f * bigTree.width(), bigTree.top + 0.25942f * bigTree.height());
                bezier66Path.lineTo(bigTree.left + 0.74013f * bigTree.width(), bigTree.top + 0.29047f * bigTree.height());
                bezier66Path.lineTo(bigTree.left + 0.75987f * bigTree.width(), bigTree.top + 0.24834f * bigTree.height());
                bezier66Path.lineTo(bigTree.left + 0.71382f * bigTree.width(), bigTree.top + 0.21729f * bigTree.height());
                bezier66Path.close();
                canvas.drawPath(bezier66Path, getPaint());


                //// Bezier 68 Drawing
                Path bezier68Path = new Path();
                bezier68Path.moveTo(bigTree.left + 0.86842f * bigTree.width(), bigTree.top + 0.22173f * bigTree.height());
                bezier68Path.lineTo(bigTree.left + 0.89803f * bigTree.width(), bigTree.top + 0.15299f * bigTree.height());
                bezier68Path.lineTo(bigTree.left + 0.99671f * bigTree.width(), bigTree.top + 0.12639f * bigTree.height());
                bezier68Path.lineTo(bigTree.left + 0.96711f * bigTree.width(), bigTree.top + 0.19512f * bigTree.height());
                bezier68Path.lineTo(bigTree.left + 0.86842f * bigTree.width(), bigTree.top + 0.22173f * bigTree.height());
                bezier68Path.close();
                bezier68Path.moveTo(bigTree.left + 0.91447f * bigTree.width(), bigTree.top + 0.16408f * bigTree.height());
                bezier68Path.lineTo(bigTree.left + 0.90132f * bigTree.width(), bigTree.top + 0.19734f * bigTree.height());
                bezier68Path.lineTo(bigTree.left + 0.95066f * bigTree.width(), bigTree.top + 0.18404f * bigTree.height());
                bezier68Path.lineTo(bigTree.left + 0.96382f * bigTree.width(), bigTree.top + 0.15078f * bigTree.height());
                bezier68Path.lineTo(bigTree.left + 0.91447f * bigTree.width(), bigTree.top + 0.16408f * bigTree.height());
                bezier68Path.close();
                canvas.drawPath(bezier68Path, getPaint());


                //// Bezier 70 Drawing
                Path bezier70Path = new Path();
                bezier70Path.moveTo(bigTree.left + 0.24671f * bigTree.width(), bigTree.top + 0.28825f * bigTree.height());
                bezier70Path.lineTo(bigTree.left + 0.25000f * bigTree.width(), bigTree.top + 0.36364f * bigTree.height());
                bezier70Path.lineTo(bigTree.left + 0.14803f * bigTree.width(), bigTree.top + 0.33038f * bigTree.height());
                bezier70Path.lineTo(bigTree.left + 0.14474f * bigTree.width(), bigTree.top + 0.25499f * bigTree.height());
                bezier70Path.lineTo(bigTree.left + 0.24671f * bigTree.width(), bigTree.top + 0.28825f * bigTree.height());
                bezier70Path.close();
                bezier70Path.moveTo(bigTree.left + 0.22697f * bigTree.width(), bigTree.top + 0.34146f * bigTree.height());
                bezier70Path.lineTo(bigTree.left + 0.22368f * bigTree.width(), bigTree.top + 0.29712f * bigTree.height());
                bezier70Path.lineTo(bigTree.left + 0.16447f * bigTree.width(), bigTree.top + 0.27938f * bigTree.height());
                bezier70Path.lineTo(bigTree.left + 0.16776f * bigTree.width(), bigTree.top + 0.32373f * bigTree.height());
                bezier70Path.lineTo(bigTree.left + 0.22697f * bigTree.width(), bigTree.top + 0.34146f * bigTree.height());
                bezier70Path.close();
                canvas.drawPath(bezier70Path, getPaint());


                //// Bezier 72 Drawing
                Path bezier72Path = new Path();
                bezier72Path.moveTo(bigTree.left + 0.25329f * bigTree.width(), bigTree.top + 0.42129f * bigTree.height());
                bezier72Path.lineTo(bigTree.left + 0.15461f * bigTree.width(), bigTree.top + 0.45898f * bigTree.height());
                bezier72Path.lineTo(bigTree.left + 0.15132f * bigTree.width(), bigTree.top + 0.38359f * bigTree.height());
                bezier72Path.lineTo(bigTree.left + 0.25000f * bigTree.width(), bigTree.top + 0.34590f * bigTree.height());
                bezier72Path.lineTo(bigTree.left + 0.25329f * bigTree.width(), bigTree.top + 0.42129f * bigTree.height());
                bezier72Path.close();
                bezier72Path.moveTo(bigTree.left + 0.17434f * bigTree.width(), bigTree.top + 0.43459f * bigTree.height());
                bezier72Path.lineTo(bigTree.left + 0.23026f * bigTree.width(), bigTree.top + 0.41242f * bigTree.height());
                bezier72Path.lineTo(bigTree.left + 0.22697f * bigTree.width(), bigTree.top + 0.36807f * bigTree.height());
                bezier72Path.lineTo(bigTree.left + 0.17105f * bigTree.width(), bigTree.top + 0.39024f * bigTree.height());
                bezier72Path.lineTo(bigTree.left + 0.17434f * bigTree.width(), bigTree.top + 0.43459f * bigTree.height());
                bezier72Path.close();
                canvas.drawPath(bezier72Path, getPaint());


                //// Bezier 74 Drawing
                Path bezier74Path = new Path();
                bezier74Path.moveTo(bigTree.left + 0.36842f * bigTree.width(), bigTree.top + 0.28603f * bigTree.height());
                bezier74Path.lineTo(bigTree.left + 0.37171f * bigTree.width(), bigTree.top + 0.36142f * bigTree.height());
                bezier74Path.lineTo(bigTree.left + 0.26974f * bigTree.width(), bigTree.top + 0.32816f * bigTree.height());
                bezier74Path.lineTo(bigTree.left + 0.26645f * bigTree.width(), bigTree.top + 0.25277f * bigTree.height());
                bezier74Path.lineTo(bigTree.left + 0.36842f * bigTree.width(), bigTree.top + 0.28603f * bigTree.height());
                bezier74Path.close();
                bezier74Path.moveTo(bigTree.left + 0.34868f * bigTree.width(), bigTree.top + 0.33925f * bigTree.height());
                bezier74Path.lineTo(bigTree.left + 0.34539f * bigTree.width(), bigTree.top + 0.29490f * bigTree.height());
                bezier74Path.lineTo(bigTree.left + 0.28618f * bigTree.width(), bigTree.top + 0.27716f * bigTree.height());
                bezier74Path.lineTo(bigTree.left + 0.28947f * bigTree.width(), bigTree.top + 0.32151f * bigTree.height());
                bezier74Path.lineTo(bigTree.left + 0.34868f * bigTree.width(), bigTree.top + 0.33925f * bigTree.height());
                bezier74Path.close();
                canvas.drawPath(bezier74Path, getPaint());


                //// Bezier 76 Drawing
                Path bezier76Path = new Path();
                bezier76Path.moveTo(bigTree.left + 0.19079f * bigTree.width(), bigTree.top + 0.35698f * bigTree.height());
                bezier76Path.lineTo(bigTree.left + 0.09868f * bigTree.width(), bigTree.top + 0.39246f * bigTree.height());
                bezier76Path.lineTo(bigTree.left + 0.00000f * bigTree.width(), bigTree.top + 0.36585f * bigTree.height());
                bezier76Path.lineTo(bigTree.left + 0.09211f * bigTree.width(), bigTree.top + 0.33038f * bigTree.height());
                bezier76Path.lineTo(bigTree.left + 0.19079f * bigTree.width(), bigTree.top + 0.35698f * bigTree.height());
                bezier76Path.close();
                bezier76Path.moveTo(bigTree.left + 0.09868f * bigTree.width(), bigTree.top + 0.37472f * bigTree.height());
                bezier76Path.lineTo(bigTree.left + 0.14474f * bigTree.width(), bigTree.top + 0.35698f * bigTree.height());
                bezier76Path.lineTo(bigTree.left + 0.09539f * bigTree.width(), bigTree.top + 0.34368f * bigTree.height());
                bezier76Path.lineTo(bigTree.left + 0.04934f * bigTree.width(), bigTree.top + 0.36142f * bigTree.height());
                bezier76Path.lineTo(bigTree.left + 0.09868f * bigTree.width(), bigTree.top + 0.37472f * bigTree.height());
                bezier76Path.close();
                canvas.drawPath(bezier76Path, getPaint());
            }
        }
    }
}
