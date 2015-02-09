package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 7/02/15.
 */
public class LittleTreesSprite extends Sprite {
    public LittleTreesSprite(Rect bounds) {
        super(bounds);
    }

    public LittleTreesSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        //// Subframes
        x = bounds.left + 1.5f;
        y = bounds.top + 0.6f;
        right = x + (float) Math.floor((bounds.width() - 1.5f) * 0.97647f + 2.0f) - 1.5f;
        bottom = y + (float) Math.floor((bounds.height() - 0.6f) * 0.95902f + 0.7f) - 0.2f;
        RectF littleTrees = new RectF(x, y, right, bottom);

        //// little trees
        {
            //// little tree 1
            {
                //// Rectangle 4 Drawing
                x = (float) (littleTrees.left + Math.floor(littleTrees.width() * 0.14217f - 0.4f) + 0.9f);
                y = (float) (littleTrees.top + Math.floor(littleTrees.height() * 0.43162f + 0.5f));
                right = x + (float) (Math.floor(littleTrees.width() * 0.16627f - 0.4f) - Math.floor(littleTrees.width() * 0.14217f - 0.4f));
                bottom = y + (float) (Math.floor(littleTrees.height() * 1.00000f + 0.2f) - Math.floor(littleTrees.height() * 0.43162f + 0.5f) + 0.3f);
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Bezier 20 Drawing
                Path bezier20Path = new Path();
                bezier20Path.moveTo(littleTrees.left + 0.24819f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier20Path.lineTo(littleTrees.left + 0.13494f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier20Path.lineTo(littleTrees.left + 0.18554f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                bezier20Path.lineTo(littleTrees.left + 0.29880f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                bezier20Path.lineTo(littleTrees.left + 0.24819f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier20Path.close();
                bezier20Path.moveTo(littleTrees.left + 0.17108f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier20Path.lineTo(littleTrees.left + 0.23614f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier20Path.lineTo(littleTrees.left + 0.26506f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier20Path.lineTo(littleTrees.left + 0.20000f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier20Path.lineTo(littleTrees.left + 0.17108f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier20Path.close();
                canvas.drawPath(bezier20Path, getPaint());


                //// Bezier 22 Drawing
                Path bezier22Path = new Path();
                bezier22Path.moveTo(littleTrees.left + 0.05060f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier22Path.lineTo(littleTrees.left + 0.00000f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                bezier22Path.lineTo(littleTrees.left + 0.11325f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                bezier22Path.lineTo(littleTrees.left + 0.16386f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier22Path.lineTo(littleTrees.left + 0.05060f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier22Path.close();
                bezier22Path.moveTo(littleTrees.left + 0.03614f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier22Path.lineTo(littleTrees.left + 0.06506f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier22Path.lineTo(littleTrees.left + 0.13012f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier22Path.lineTo(littleTrees.left + 0.10120f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier22Path.lineTo(littleTrees.left + 0.03614f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier22Path.close();
                canvas.drawPath(bezier22Path, getPaint());


                //// Bezier 24 Drawing
                Path bezier24Path = new Path();
                bezier24Path.moveTo(littleTrees.left + 0.24819f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier24Path.lineTo(littleTrees.left + 0.13494f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier24Path.lineTo(littleTrees.left + 0.18554f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                bezier24Path.lineTo(littleTrees.left + 0.29880f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                bezier24Path.lineTo(littleTrees.left + 0.24819f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier24Path.close();
                bezier24Path.moveTo(littleTrees.left + 0.17108f * littleTrees.width(), littleTrees.top + 0.61966f * littleTrees.height());
                bezier24Path.lineTo(littleTrees.left + 0.23614f * littleTrees.width(), littleTrees.top + 0.61966f * littleTrees.height());
                bezier24Path.lineTo(littleTrees.left + 0.26506f * littleTrees.width(), littleTrees.top + 0.51709f * littleTrees.height());
                bezier24Path.lineTo(littleTrees.left + 0.20000f * littleTrees.width(), littleTrees.top + 0.51709f * littleTrees.height());
                bezier24Path.lineTo(littleTrees.left + 0.17108f * littleTrees.width(), littleTrees.top + 0.61966f * littleTrees.height());
                bezier24Path.close();
                canvas.drawPath(bezier24Path, getPaint());


                //// Bezier 26 Drawing
                Path bezier26Path = new Path();
                bezier26Path.moveTo(littleTrees.left + 0.05060f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier26Path.lineTo(littleTrees.left + 0.00000f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                bezier26Path.lineTo(littleTrees.left + 0.11325f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                bezier26Path.lineTo(littleTrees.left + 0.16386f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier26Path.lineTo(littleTrees.left + 0.05060f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier26Path.close();
                bezier26Path.moveTo(littleTrees.left + 0.03614f * littleTrees.width(), littleTrees.top + 0.52137f * littleTrees.height());
                bezier26Path.lineTo(littleTrees.left + 0.06506f * littleTrees.width(), littleTrees.top + 0.62393f * littleTrees.height());
                bezier26Path.lineTo(littleTrees.left + 0.13012f * littleTrees.width(), littleTrees.top + 0.62393f * littleTrees.height());
                bezier26Path.lineTo(littleTrees.left + 0.10120f * littleTrees.width(), littleTrees.top + 0.52137f * littleTrees.height());
                bezier26Path.lineTo(littleTrees.left + 0.03614f * littleTrees.width(), littleTrees.top + 0.52137f * littleTrees.height());
                bezier26Path.close();
                canvas.drawPath(bezier26Path, getPaint());


                //// Bezier 28 Drawing
                Path bezier28Path = new Path();
                bezier28Path.moveTo(littleTrees.left + 0.14940f * littleTrees.width(), littleTrees.top + 0.33761f * littleTrees.height());
                bezier28Path.lineTo(littleTrees.left + 0.09880f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                bezier28Path.lineTo(littleTrees.left + 0.14217f * littleTrees.width(), littleTrees.top + 0.00000f * littleTrees.height());
                bezier28Path.lineTo(littleTrees.left + 0.19277f * littleTrees.width(), littleTrees.top + 0.16667f * littleTrees.height());
                bezier28Path.lineTo(littleTrees.left + 0.14940f * littleTrees.width(), littleTrees.top + 0.33761f * littleTrees.height());
                bezier28Path.close();
                bezier28Path.moveTo(littleTrees.left + 0.12530f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                bezier28Path.lineTo(littleTrees.left + 0.14940f * littleTrees.width(), littleTrees.top + 0.25214f * littleTrees.height());
                bezier28Path.lineTo(littleTrees.left + 0.17108f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                bezier28Path.lineTo(littleTrees.left + 0.14699f * littleTrees.width(), littleTrees.top + 0.08974f * littleTrees.height());
                bezier28Path.lineTo(littleTrees.left + 0.12530f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                bezier28Path.close();
                canvas.drawPath(bezier28Path, getPaint());
            }


            //// little tree 2
            {
                //// Rectangle 6 Drawing
                x = (float) (littleTrees.left + Math.floor(littleTrees.width() * 0.50120f - 0.3f) + 0.8f);
                y = (float) (littleTrees.top + Math.floor(littleTrees.height() * 0.43162f + 0.5f));
                right = x + (float) (Math.floor(littleTrees.width() * 0.52530f - 0.3f) - Math.floor(littleTrees.width() * 0.50120f - 0.3f));
                bottom = y + (float) (Math.floor(littleTrees.height() * 1.00000f + 0.2f) - Math.floor(littleTrees.height() * 0.43162f + 0.5f) + 0.3f);
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Bezier 30 Drawing
                Path bezier30Path = new Path();
                bezier30Path.moveTo(littleTrees.left + 0.60723f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier30Path.lineTo(littleTrees.left + 0.49398f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier30Path.lineTo(littleTrees.left + 0.54458f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                bezier30Path.lineTo(littleTrees.left + 0.65783f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                bezier30Path.lineTo(littleTrees.left + 0.60723f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier30Path.close();
                bezier30Path.moveTo(littleTrees.left + 0.53012f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier30Path.lineTo(littleTrees.left + 0.59518f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier30Path.lineTo(littleTrees.left + 0.62410f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier30Path.lineTo(littleTrees.left + 0.55904f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier30Path.lineTo(littleTrees.left + 0.53012f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier30Path.close();
                canvas.drawPath(bezier30Path, getPaint());


                //// Bezier 32 Drawing
                Path bezier32Path = new Path();
                bezier32Path.moveTo(littleTrees.left + 0.40964f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier32Path.lineTo(littleTrees.left + 0.35904f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                bezier32Path.lineTo(littleTrees.left + 0.47229f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                bezier32Path.lineTo(littleTrees.left + 0.52289f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier32Path.lineTo(littleTrees.left + 0.40964f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                bezier32Path.close();
                bezier32Path.moveTo(littleTrees.left + 0.39518f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier32Path.lineTo(littleTrees.left + 0.42410f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier32Path.lineTo(littleTrees.left + 0.48916f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                bezier32Path.lineTo(littleTrees.left + 0.46024f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier32Path.lineTo(littleTrees.left + 0.39518f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                bezier32Path.close();
                canvas.drawPath(bezier32Path, getPaint());


                //// Bezier 34 Drawing
                Path bezier34Path = new Path();
                bezier34Path.moveTo(littleTrees.left + 0.60723f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier34Path.lineTo(littleTrees.left + 0.49398f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier34Path.lineTo(littleTrees.left + 0.54458f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                bezier34Path.lineTo(littleTrees.left + 0.65783f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                bezier34Path.lineTo(littleTrees.left + 0.60723f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier34Path.close();
                bezier34Path.moveTo(littleTrees.left + 0.53012f * littleTrees.width(), littleTrees.top + 0.61966f * littleTrees.height());
                bezier34Path.lineTo(littleTrees.left + 0.59518f * littleTrees.width(), littleTrees.top + 0.61966f * littleTrees.height());
                bezier34Path.lineTo(littleTrees.left + 0.62410f * littleTrees.width(), littleTrees.top + 0.51709f * littleTrees.height());
                bezier34Path.lineTo(littleTrees.left + 0.55904f * littleTrees.width(), littleTrees.top + 0.51709f * littleTrees.height());
                bezier34Path.lineTo(littleTrees.left + 0.53012f * littleTrees.width(), littleTrees.top + 0.61966f * littleTrees.height());
                bezier34Path.close();
                canvas.drawPath(bezier34Path, getPaint());


                //// Bezier 36 Drawing
                Path bezier36Path = new Path();
                bezier36Path.moveTo(littleTrees.left + 0.40964f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier36Path.lineTo(littleTrees.left + 0.35904f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                bezier36Path.lineTo(littleTrees.left + 0.47229f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                bezier36Path.lineTo(littleTrees.left + 0.52289f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier36Path.lineTo(littleTrees.left + 0.40964f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                bezier36Path.close();
                bezier36Path.moveTo(littleTrees.left + 0.39518f * littleTrees.width(), littleTrees.top + 0.52137f * littleTrees.height());
                bezier36Path.lineTo(littleTrees.left + 0.42410f * littleTrees.width(), littleTrees.top + 0.62393f * littleTrees.height());
                bezier36Path.lineTo(littleTrees.left + 0.48916f * littleTrees.width(), littleTrees.top + 0.62393f * littleTrees.height());
                bezier36Path.lineTo(littleTrees.left + 0.46024f * littleTrees.width(), littleTrees.top + 0.52137f * littleTrees.height());
                bezier36Path.lineTo(littleTrees.left + 0.39518f * littleTrees.width(), littleTrees.top + 0.52137f * littleTrees.height());
                bezier36Path.close();
                canvas.drawPath(bezier36Path, getPaint());


                //// Bezier 38 Drawing
                Path bezier38Path = new Path();
                bezier38Path.moveTo(littleTrees.left + 0.50843f * littleTrees.width(), littleTrees.top + 0.33761f * littleTrees.height());
                bezier38Path.lineTo(littleTrees.left + 0.45783f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                bezier38Path.lineTo(littleTrees.left + 0.50120f * littleTrees.width(), littleTrees.top + 0.00000f * littleTrees.height());
                bezier38Path.lineTo(littleTrees.left + 0.55181f * littleTrees.width(), littleTrees.top + 0.16667f * littleTrees.height());
                bezier38Path.lineTo(littleTrees.left + 0.50843f * littleTrees.width(), littleTrees.top + 0.33761f * littleTrees.height());
                bezier38Path.close();
                bezier38Path.moveTo(littleTrees.left + 0.48434f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                bezier38Path.lineTo(littleTrees.left + 0.50843f * littleTrees.width(), littleTrees.top + 0.25214f * littleTrees.height());
                bezier38Path.lineTo(littleTrees.left + 0.53012f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                bezier38Path.lineTo(littleTrees.left + 0.50602f * littleTrees.width(), littleTrees.top + 0.08974f * littleTrees.height());
                bezier38Path.lineTo(littleTrees.left + 0.48434f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                bezier38Path.close();
                canvas.drawPath(bezier38Path, getPaint());
            }


            //// little tree 3
            {
                //// leaves
                {
                    //// Group 22
                    {
                        //// Bezier 40 Drawing
                        Path bezier40Path = new Path();
                        bezier40Path.moveTo(littleTrees.left + 0.94940f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                        bezier40Path.lineTo(littleTrees.left + 0.83614f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                        bezier40Path.lineTo(littleTrees.left + 0.88675f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                        bezier40Path.lineTo(littleTrees.left + 1.00000f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                        bezier40Path.lineTo(littleTrees.left + 0.94940f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                        bezier40Path.close();
                        bezier40Path.moveTo(littleTrees.left + 0.87229f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                        bezier40Path.lineTo(littleTrees.left + 0.93735f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                        bezier40Path.lineTo(littleTrees.left + 0.96627f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                        bezier40Path.lineTo(littleTrees.left + 0.90120f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                        bezier40Path.lineTo(littleTrees.left + 0.87229f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                        bezier40Path.close();
                        canvas.drawPath(bezier40Path, getPaint());
                    }


                    //// Group 23
                    {
                        //// Bezier 42 Drawing
                        Path bezier42Path = new Path();
                        bezier42Path.moveTo(littleTrees.left + 0.75181f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                        bezier42Path.lineTo(littleTrees.left + 0.70120f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                        bezier42Path.lineTo(littleTrees.left + 0.81446f * littleTrees.width(), littleTrees.top + 0.26496f * littleTrees.height());
                        bezier42Path.lineTo(littleTrees.left + 0.86506f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                        bezier42Path.lineTo(littleTrees.left + 0.75181f * littleTrees.width(), littleTrees.top + 0.44444f * littleTrees.height());
                        bezier42Path.close();
                        bezier42Path.moveTo(littleTrees.left + 0.73494f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                        bezier42Path.lineTo(littleTrees.left + 0.76386f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                        bezier42Path.lineTo(littleTrees.left + 0.82892f * littleTrees.width(), littleTrees.top + 0.40598f * littleTrees.height());
                        bezier42Path.lineTo(littleTrees.left + 0.80000f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                        bezier42Path.lineTo(littleTrees.left + 0.73494f * littleTrees.width(), littleTrees.top + 0.30342f * littleTrees.height());
                        bezier42Path.close();
                        canvas.drawPath(bezier42Path, getPaint());
                    }


                    //// Group 24
                    {
                        //// Bezier 44 Drawing
                        Path bezier44Path = new Path();
                        bezier44Path.moveTo(littleTrees.left + 0.94940f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                        bezier44Path.lineTo(littleTrees.left + 0.83614f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                        bezier44Path.lineTo(littleTrees.left + 0.88675f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                        bezier44Path.lineTo(littleTrees.left + 1.00000f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                        bezier44Path.lineTo(littleTrees.left + 0.94940f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                        bezier44Path.close();
                        bezier44Path.moveTo(littleTrees.left + 0.87229f * littleTrees.width(), littleTrees.top + 0.61966f * littleTrees.height());
                        bezier44Path.lineTo(littleTrees.left + 0.93735f * littleTrees.width(), littleTrees.top + 0.61966f * littleTrees.height());
                        bezier44Path.lineTo(littleTrees.left + 0.96627f * littleTrees.width(), littleTrees.top + 0.51709f * littleTrees.height());
                        bezier44Path.lineTo(littleTrees.left + 0.90120f * littleTrees.width(), littleTrees.top + 0.51709f * littleTrees.height());
                        bezier44Path.lineTo(littleTrees.left + 0.87229f * littleTrees.width(), littleTrees.top + 0.61966f * littleTrees.height());
                        bezier44Path.close();
                        canvas.drawPath(bezier44Path, getPaint());
                    }


                    //// Group 25
                    {
                        //// Bezier 46 Drawing
                        Path bezier46Path = new Path();
                        bezier46Path.moveTo(littleTrees.left + 0.75181f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                        bezier46Path.lineTo(littleTrees.left + 0.70120f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                        bezier46Path.lineTo(littleTrees.left + 0.81446f * littleTrees.width(), littleTrees.top + 0.47863f * littleTrees.height());
                        bezier46Path.lineTo(littleTrees.left + 0.86506f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                        bezier46Path.lineTo(littleTrees.left + 0.75181f * littleTrees.width(), littleTrees.top + 0.65812f * littleTrees.height());
                        bezier46Path.close();
                        bezier46Path.moveTo(littleTrees.left + 0.73494f * littleTrees.width(), littleTrees.top + 0.52137f * littleTrees.height());
                        bezier46Path.lineTo(littleTrees.left + 0.76386f * littleTrees.width(), littleTrees.top + 0.62393f * littleTrees.height());
                        bezier46Path.lineTo(littleTrees.left + 0.82892f * littleTrees.width(), littleTrees.top + 0.62393f * littleTrees.height());
                        bezier46Path.lineTo(littleTrees.left + 0.80000f * littleTrees.width(), littleTrees.top + 0.52137f * littleTrees.height());
                        bezier46Path.lineTo(littleTrees.left + 0.73494f * littleTrees.width(), littleTrees.top + 0.52137f * littleTrees.height());
                        bezier46Path.close();
                        canvas.drawPath(bezier46Path, getPaint());
                    }


                    //// Group 26
                    {
                        //// Bezier 48 Drawing
                        Path bezier48Path = new Path();
                        bezier48Path.moveTo(littleTrees.left + 0.85060f * littleTrees.width(), littleTrees.top + 0.33761f * littleTrees.height());
                        bezier48Path.lineTo(littleTrees.left + 0.80000f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                        bezier48Path.lineTo(littleTrees.left + 0.84337f * littleTrees.width(), littleTrees.top + 0.00000f * littleTrees.height());
                        bezier48Path.lineTo(littleTrees.left + 0.89398f * littleTrees.width(), littleTrees.top + 0.16667f * littleTrees.height());
                        bezier48Path.lineTo(littleTrees.left + 0.85060f * littleTrees.width(), littleTrees.top + 0.33761f * littleTrees.height());
                        bezier48Path.close();
                        bezier48Path.moveTo(littleTrees.left + 0.82651f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                        bezier48Path.lineTo(littleTrees.left + 0.85060f * littleTrees.width(), littleTrees.top + 0.25214f * littleTrees.height());
                        bezier48Path.lineTo(littleTrees.left + 0.87229f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                        bezier48Path.lineTo(littleTrees.left + 0.84819f * littleTrees.width(), littleTrees.top + 0.08974f * littleTrees.height());
                        bezier48Path.lineTo(littleTrees.left + 0.82651f * littleTrees.width(), littleTrees.top + 0.17094f * littleTrees.height());
                        bezier48Path.close();
                        canvas.drawPath(bezier48Path, getPaint());
                    }
                }


                //// Rectangle 8 Drawing
                x = (float) (littleTrees.left + Math.floor(littleTrees.width() * 0.84337f + 0.5f));
                y = (float) (littleTrees.top + Math.floor(littleTrees.height() * 0.43162f + 0.5f));
                right = x + (float) (Math.floor(littleTrees.width() * 0.86747f + 0.5f) - Math.floor(littleTrees.width() * 0.84337f + 0.5f));
                bottom = y + (float) (Math.floor(littleTrees.height() * 1.00000f + 0.2f) - Math.floor(littleTrees.height() * 0.43162f + 0.5f) + 0.3f);
                canvas.drawRect(x, y, right, bottom, getPaint());
            }
        }
    }
}
