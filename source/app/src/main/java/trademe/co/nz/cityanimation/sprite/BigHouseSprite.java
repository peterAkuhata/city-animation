package trademe.co.nz.cityanimation.sprite;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by peterakuhata on 6/02/15.
 */
public class BigHouseSprite extends Sprite {
    public BigHouseSprite(Rect bounds) {
        super(bounds);
    }

    public BigHouseSprite() {
        super();
    }

    @Override
    protected void drawImpl(Canvas canvas) {
        float x, y, right, bottom;
        Rect bounds = getBounds();

        x = bounds.left + 1.8f;
        y = bounds.top + 1.4f;
        right = x + (float) Math.floor((bounds.width() - 1.8f) * 0.97688f + 1.9f) - 1.4f;
        bottom = y + (float) Math.floor((bounds.height() - 1.4f) * 0.97487f + 1.3f) - 0.8f;
        //// Subframes
        RectF bigHouse = new RectF(x, y, right, bottom);


        //// big house
        {
            //// side things
            {

                //// Rectangle 98 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.90077f - 0.2f) + 0.7f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.91366f - 0.2f) - Math.floor(bigHouse.height() * 0.90077f - 0.2f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 100 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.93814f - 0.3f) + 0.8f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.95103f - 0.3f) - Math.floor(bigHouse.height() * 0.93814f - 0.3f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 102 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.86082f - 0.3f) + 0.8f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.87371f - 0.3f) - Math.floor(bigHouse.height() * 0.86082f - 0.3f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 104 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.82216f - 0.3f) + 0.8f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.83505f - 0.3f) - Math.floor(bigHouse.height() * 0.82216f - 0.3f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 106 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.78222f - 0.4f) + 0.9f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.79510f - 0.4f) - Math.floor(bigHouse.height() * 0.78222f - 0.4f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 108 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.74356f - 0.4f) + 0.9f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.75644f - 0.4f) - Math.floor(bigHouse.height() * 0.74356f - 0.4f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 110 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.66237f + 0.3f) + 0.2f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.67526f + 0.3f) - Math.floor(bigHouse.height() * 0.66237f + 0.3f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 112 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.69974f + 0.2f) + 0.3f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.71263f + 0.2f) - Math.floor(bigHouse.height() * 0.69974f + 0.2f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 114 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.62242f + 0.2f) + 0.3f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.63531f + 0.2f) - Math.floor(bigHouse.height() * 0.62242f + 0.2f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 116 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.58247f + 0.1f) + 0.4f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.59536f + 0.1f) - Math.floor(bigHouse.height() * 0.58247f + 0.1f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 118 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.54381f + 0.1f) + 0.4f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.55670f + 0.1f) - Math.floor(bigHouse.height() * 0.54381f + 0.1f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 120 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.6f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.50387f) + 0.5f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.08728f - 0.4f) - Math.floor(bigHouse.width() * 0.03846f - 0.1f) + 0.3f);
                bottom = (float) (Math.floor(bigHouse.height() * 0.51675f) - Math.floor(bigHouse.height() * 0.50387f));
                canvas.drawRect(x, y, right, bottom, getPaint());
            }


            //// Bezier 167 Drawing
            Path bezier167Path = new Path();
            bezier167Path.moveTo(bigHouse.left + 0.45414f * bigHouse.width(), bigHouse.top + 1.00000f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.45414f * bigHouse.width(), bigHouse.top + 0.53222f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.43047f * bigHouse.width(), bigHouse.top + 0.53222f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.43047f * bigHouse.width(), bigHouse.top + 0.50644f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.45414f * bigHouse.width(), bigHouse.top + 0.50644f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.45414f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.03846f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.03846f * bigHouse.width(), bigHouse.top + 1.00000f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.40385f * bigHouse.width(), bigHouse.top + 1.00000f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.97633f * bigHouse.width(), bigHouse.top + 1.00000f * bigHouse.height());
            bezier167Path.lineTo(bigHouse.left + 0.97633f * bigHouse.width(), bigHouse.top + 0.49098f * bigHouse.height());
            canvas.drawPath(bezier167Path, getPaint());


            //// Rectangle 138 Drawing
            x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.60207f - 0.2f) + 0.7f);
            y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.70490f + 0.2f) + 0.3f);
            right = x + (float) (Math.floor(bigHouse.width() * 0.63609f + 0.5f) - Math.floor(bigHouse.width() * 0.60207f - 0.2f) - 0.7f);
            bottom = y + (float) (Math.floor(bigHouse.height() * 0.82861f - 0.4f) - Math.floor(bigHouse.height() * 0.70490f + 0.2f) + 0.6f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 140 Drawing
            x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.66124f - 0.2f) + 0.7f);
            y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.70490f + 0.2f) + 0.3f);
            right = x + (float) (Math.floor(bigHouse.width() * 0.69527f + 0.5f) - Math.floor(bigHouse.width() * 0.66124f - 0.2f) - 0.7f);
            bottom = y + (float) (Math.floor(bigHouse.height() * 0.82861f - 0.4f) - Math.floor(bigHouse.height() * 0.70490f + 0.2f) + 0.6f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 142 Drawing
            x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.60207f - 0.2f) + 0.7f);
            y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.86340f + 0.3f) + 0.2f);
            right = x + (float) (Math.floor(bigHouse.width() * 0.63609f + 0.5f) - Math.floor(bigHouse.width() * 0.60207f - 0.2f) - 0.7f);
            bottom = y + (float) (Math.floor(bigHouse.height() * 0.97165f - 0.1f) - Math.floor(bigHouse.height() * 0.86340f + 0.3f) + 0.4f);
            canvas.drawRect(x, y, right, bottom, getPaint());

            //// Rectangle 144 Drawing
            x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.66124f - 0.2f) + 0.7f);
            y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.86340f + 0.3f) + 0.2f);
            right = x + (float) (Math.floor(bigHouse.width() * 0.69527f + 0.5f) - Math.floor(bigHouse.width() * 0.66124f - 0.2f) - 0.7f);
            bottom = y + (float) (Math.floor(bigHouse.height() * 0.97165f - 0.1f) - Math.floor(bigHouse.height() * 0.86340f + 0.3f) + 0.4f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Bezier 169 Drawing
            Path bezier169Path = new Path();
            bezier169Path.moveTo(bigHouse.left + 0.84172f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier169Path.lineTo(bigHouse.left + 0.63462f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier169Path.lineTo(bigHouse.left + 0.48225f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier169Path.lineTo(bigHouse.left + 0.48225f * bigHouse.width(), bigHouse.top + 0.40593f * bigHouse.height());
            bezier169Path.lineTo(bigHouse.left + 0.48225f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier169Path.lineTo(bigHouse.left + 0.96450f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier169Path.lineTo(bigHouse.left + 0.97633f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier169Path.lineTo(bigHouse.left + 0.97633f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier169Path.lineTo(bigHouse.left + 0.87870f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            canvas.drawPath(bezier169Path, getPaint());


            //// Bezier 171 Drawing
            Path bezier171Path = new Path();
            bezier171Path.moveTo(bigHouse.left + 0.97633f * bigHouse.width(), bigHouse.top + 0.38660f * bigHouse.height());
            bezier171Path.lineTo(bigHouse.left + 0.53550f * bigHouse.width(), bigHouse.top + 0.38660f * bigHouse.height());
            bezier171Path.lineTo(bigHouse.left + 0.48225f * bigHouse.width(), bigHouse.top + 0.38660f * bigHouse.height());
            canvas.drawPath(bezier171Path, getPaint());


            //// Bezier 173 Drawing
            Path bezier173Path = new Path();
            bezier173Path.moveTo(bigHouse.left + 0.53254f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier173Path.lineTo(bigHouse.left + 0.53254f * bigHouse.width(), bigHouse.top + 0.38789f * bigHouse.height());
            canvas.drawPath(bezier173Path, getPaint());


            //// Bezier 175 Drawing
            Path bezier175Path = new Path();
            bezier175Path.moveTo(bigHouse.left + 0.59024f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier175Path.lineTo(bigHouse.left + 0.59024f * bigHouse.width(), bigHouse.top + 0.38789f * bigHouse.height());
            canvas.drawPath(bezier175Path, getPaint());


            //// Bezier 177 Drawing
            Path bezier177Path = new Path();
            bezier177Path.moveTo(bigHouse.left + 0.64645f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier177Path.lineTo(bigHouse.left + 0.64645f * bigHouse.width(), bigHouse.top + 0.38789f * bigHouse.height());
            canvas.drawPath(bezier177Path, getPaint());


            //// Bezier 179 Drawing
            Path bezier179Path = new Path();
            bezier179Path.moveTo(bigHouse.left + 0.70266f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier179Path.lineTo(bigHouse.left + 0.70266f * bigHouse.width(), bigHouse.top + 0.38789f * bigHouse.height());
            canvas.drawPath(bezier179Path, getPaint());


            //// Bezier 181 Drawing
            Path bezier181Path = new Path();
            bezier181Path.moveTo(bigHouse.left + 0.75888f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier181Path.lineTo(bigHouse.left + 0.75888f * bigHouse.width(), bigHouse.top + 0.38789f * bigHouse.height());
            canvas.drawPath(bezier181Path, getPaint());


            //// Bezier 183 Drawing
            Path bezier183Path = new Path();
            bezier183Path.moveTo(bigHouse.left + 0.81509f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier183Path.lineTo(bigHouse.left + 0.81509f * bigHouse.width(), bigHouse.top + 0.38789f * bigHouse.height());
            canvas.drawPath(bezier183Path, getPaint());


            //// Bezier 185 Drawing
            Path bezier185Path = new Path();
            bezier185Path.moveTo(bigHouse.left + 0.87130f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier185Path.lineTo(bigHouse.left + 0.87130f * bigHouse.width(), bigHouse.top + 0.38789f * bigHouse.height());
            canvas.drawPath(bezier185Path, getPaint());


            //// Bezier 187 Drawing
            Path bezier187Path = new Path();
            bezier187Path.moveTo(bigHouse.left + 0.97633f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier187Path.lineTo(bigHouse.left + 0.97633f * bigHouse.width(), bigHouse.top + 0.38789f * bigHouse.height());
            canvas.drawPath(bezier187Path, getPaint());


            //// Bezier 189 Drawing
            Path bezier189Path = new Path();
            bezier189Path.moveTo(bigHouse.left + 0.92751f * bigHouse.width(), bigHouse.top + 0.50515f * bigHouse.height());
            bezier189Path.lineTo(bigHouse.left + 0.92751f * bigHouse.width(), bigHouse.top + 0.38789f * bigHouse.height());
            canvas.drawPath(bezier189Path, getPaint());


            //// Bezier 191 Drawing
            Path bezier191Path = new Path();
            bezier191Path.moveTo(bigHouse.left + 0.57101f * bigHouse.width(), bigHouse.top + 1.00000f * bigHouse.height());
            bezier191Path.lineTo(bigHouse.left + 0.57101f * bigHouse.width(), bigHouse.top + 0.67397f * bigHouse.height());
            bezier191Path.lineTo(bigHouse.left + 0.72781f * bigHouse.width(), bigHouse.top + 0.67397f * bigHouse.height());
            bezier191Path.lineTo(bigHouse.left + 0.72781f * bigHouse.width(), bigHouse.top + 1.00000f * bigHouse.height());
            canvas.drawPath(bezier191Path, getPaint());


            //// Rectangle 146 Drawing
            x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.68195f + 0.4f) + 0.1f);
            y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.25773f - 0.4f) + 0.9f);
            right = x + (float) (Math.floor(bigHouse.width() * 0.71598f + 0.1f) - Math.floor(bigHouse.width() * 0.68195f + 0.4f) + 0.3f);
            bottom = y + (float) (Math.floor(bigHouse.height() * 0.35696f - 0.1f) - Math.floor(bigHouse.height() * 0.25773f - 0.4f) - 0.3f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Rectangle 148 Drawing
            x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.74112f + 0.4f) + 0.1f);
            y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.25773f - 0.4f) + 0.9f);
            right = x + (float) (Math.floor(bigHouse.width() * 0.77515f + 0.1f) - Math.floor(bigHouse.width() * 0.74112f + 0.4f) + 0.3f);
            bottom = y + (float) (Math.floor(bigHouse.height() * 0.35696f - 0.1f) - Math.floor(bigHouse.height() * 0.25773f - 0.4f) - 0.3f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Bezier 193 Drawing
            Path bezier193Path = new Path();
            bezier193Path.moveTo(bigHouse.left + 0.65089f * bigHouse.width(), bigHouse.top + 0.50258f * bigHouse.height());
            bezier193Path.lineTo(bigHouse.left + 0.65089f * bigHouse.width(), bigHouse.top + 0.19072f * bigHouse.height());
            bezier193Path.lineTo(bigHouse.left + 0.80769f * bigHouse.width(), bigHouse.top + 0.19072f * bigHouse.height());
            bezier193Path.lineTo(bigHouse.left + 0.80769f * bigHouse.width(), bigHouse.top + 0.50258f * bigHouse.height());
            canvas.drawPath(bezier193Path, getPaint());


            //// Bezier 195 Drawing
            Path bezier195Path = new Path();
            bezier195Path.moveTo(bigHouse.left + 0.70118f * bigHouse.width(), bigHouse.top + 0.84407f * bigHouse.height());
            bezier195Path.lineTo(bigHouse.left + 0.71302f * bigHouse.width(), bigHouse.top + 0.84407f * bigHouse.height());
            canvas.drawPath(bezier195Path, getPaint());


            //// top window
            {
                //// Bezier 198 Drawing
                Path bezier198Path = new Path();
                bezier198Path.moveTo(bigHouse.left + 0.41716f * bigHouse.width(), bigHouse.top + 0.44716f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.11982f * bigHouse.width(), bigHouse.top + 0.44716f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.11982f * bigHouse.width(), bigHouse.top + 0.24485f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.17456f * bigHouse.width(), bigHouse.top + 0.22036f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.35947f * bigHouse.width(), bigHouse.top + 0.22036f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.41716f * bigHouse.width(), bigHouse.top + 0.24613f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.41716f * bigHouse.width(), bigHouse.top + 0.44716f * bigHouse.height());
                bezier198Path.close();
                bezier198Path.moveTo(bigHouse.left + 0.13905f * bigHouse.width(), bigHouse.top + 0.43428f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.39793f * bigHouse.width(), bigHouse.top + 0.43428f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.39793f * bigHouse.width(), bigHouse.top + 0.25515f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.35355f * bigHouse.width(), bigHouse.top + 0.23582f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.18047f * bigHouse.width(), bigHouse.top + 0.23582f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.13905f * bigHouse.width(), bigHouse.top + 0.25387f * bigHouse.height());
                bezier198Path.lineTo(bigHouse.left + 0.13905f * bigHouse.width(), bigHouse.top + 0.43428f * bigHouse.height());
                bezier198Path.close();
                canvas.drawPath(bezier198Path, getPaint());


                //// Rectangle 150 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.16864f + 0.1f) + 0.4f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.22809f + 0.1f) + 0.4f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.18787f - 0.2f) - Math.floor(bigHouse.width() * 0.16864f + 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.44072f - 0.4f) - Math.floor(bigHouse.height() * 0.22809f + 0.1f) + 0.5f);
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 152 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.34615f + 0.1f) + 0.4f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.22809f + 0.1f) + 0.4f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.36538f - 0.2f) - Math.floor(bigHouse.width() * 0.34615f + 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.44072f - 0.4f) - Math.floor(bigHouse.height() * 0.22809f + 0.1f) + 0.5f);
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Bezier 200 Drawing
                Path bezier200Path = new Path();
                bezier200Path.moveTo(bigHouse.left + 0.13314f * bigHouse.width(), bigHouse.top + 0.27320f * bigHouse.height());
                bezier200Path.lineTo(bigHouse.left + 0.12574f * bigHouse.width(), bigHouse.top + 0.26031f * bigHouse.height());
                bezier200Path.lineTo(bigHouse.left + 0.17012f * bigHouse.width(), bigHouse.top + 0.25000f * bigHouse.height());
                bezier200Path.lineTo(bigHouse.left + 0.30325f * bigHouse.width(), bigHouse.top + 0.25000f * bigHouse.height());
                bezier200Path.lineTo(bigHouse.left + 0.30325f * bigHouse.width(), bigHouse.top + 0.26289f * bigHouse.height());
                bezier200Path.lineTo(bigHouse.left + 0.17308f * bigHouse.width(), bigHouse.top + 0.26289f * bigHouse.height());
                bezier200Path.lineTo(bigHouse.left + 0.13314f * bigHouse.width(), bigHouse.top + 0.27320f * bigHouse.height());
                bezier200Path.close();
                canvas.drawPath(bezier200Path, getPaint());

                //// Bezier 202 Drawing
                Path bezier202Path = new Path();
                bezier202Path.moveTo(bigHouse.left + 0.40533f * bigHouse.width(), bigHouse.top + 0.27062f * bigHouse.height());
                bezier202Path.lineTo(bigHouse.left + 0.35503f * bigHouse.width(), bigHouse.top + 0.26289f * bigHouse.height());
                bezier202Path.lineTo(bigHouse.left + 0.32396f * bigHouse.width(), bigHouse.top + 0.26289f * bigHouse.height());
                bezier202Path.lineTo(bigHouse.left + 0.32396f * bigHouse.width(), bigHouse.top + 0.25000f * bigHouse.height());
                bezier202Path.lineTo(bigHouse.left + 0.35651f * bigHouse.width(), bigHouse.top + 0.25000f * bigHouse.height());
                bezier202Path.lineTo(bigHouse.left + 0.40976f * bigHouse.width(), bigHouse.top + 0.25773f * bigHouse.height());
                bezier202Path.lineTo(bigHouse.left + 0.40533f * bigHouse.width(), bigHouse.top + 0.27062f * bigHouse.height());
                bezier202Path.close();
                canvas.drawPath(bezier202Path, getPaint());


                //// Rectangle 154 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.25888f) + 0.5f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.25644f + 0.1f) + 0.4f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.27811f - 0.3f) - Math.floor(bigHouse.width() * 0.25888f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.44072f - 0.2f) - Math.floor(bigHouse.height() * 0.25644f + 0.1f) + 0.3f);
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 156 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.17751f + 0.5f));
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.33634f) + 0.5f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.35503f + 0.5f) - Math.floor(bigHouse.width() * 0.17751f + 0.5f));
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.34923f) - Math.floor(bigHouse.height() * 0.33634f));
                canvas.drawRect(x, y, right, bottom, getPaint());
            }


            //// bottom window
            {
                //// Bezier 204 Drawing
                Path bezier204Path = new Path();
                bezier204Path.moveTo(bigHouse.left + 0.41716f * bigHouse.width(), bigHouse.top + 0.90077f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.11982f * bigHouse.width(), bigHouse.top + 0.90077f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.11982f * bigHouse.width(), bigHouse.top + 0.61856f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.17456f * bigHouse.width(), bigHouse.top + 0.58505f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.35947f * bigHouse.width(), bigHouse.top + 0.58505f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.41716f * bigHouse.width(), bigHouse.top + 0.62113f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.41716f * bigHouse.width(), bigHouse.top + 0.90077f * bigHouse.height());
                bezier204Path.close();
                bezier204Path.moveTo(bigHouse.left + 0.13905f * bigHouse.width(), bigHouse.top + 0.88273f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.39793f * bigHouse.width(), bigHouse.top + 0.88273f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.39793f * bigHouse.width(), bigHouse.top + 0.63144f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.35355f * bigHouse.width(), bigHouse.top + 0.60309f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.18047f * bigHouse.width(), bigHouse.top + 0.60309f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.13905f * bigHouse.width(), bigHouse.top + 0.62887f * bigHouse.height());
                bezier204Path.lineTo(bigHouse.left + 0.13905f * bigHouse.width(), bigHouse.top + 0.88273f * bigHouse.height());
                bezier204Path.close();
                canvas.drawPath(bezier204Path, getPaint());


                //// Rectangle 158 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.16864f + 0.1f) + 0.4f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.59407f + 0.1f) + 0.4f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.18787f - 0.2f) - Math.floor(bigHouse.width() * 0.16864f + 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.89175f) - Math.floor(bigHouse.height() * 0.59407f + 0.1f) + 0.1f);
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 160 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.34615f + 0.1f) + 0.4f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.59407f + 0.1f) + 0.4f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.36538f - 0.2f) - Math.floor(bigHouse.width() * 0.34615f + 0.1f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.89175f) - Math.floor(bigHouse.height() * 0.59407f + 0.1f) + 0.1f);
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Bezier 206 Drawing
                Path bezier206Path = new Path();
                bezier206Path.moveTo(bigHouse.left + 0.13314f * bigHouse.width(), bigHouse.top + 0.65722f * bigHouse.height());
                bezier206Path.lineTo(bigHouse.left + 0.12574f * bigHouse.width(), bigHouse.top + 0.64046f * bigHouse.height());
                bezier206Path.lineTo(bigHouse.left + 0.17012f * bigHouse.width(), bigHouse.top + 0.62500f * bigHouse.height());
                bezier206Path.lineTo(bigHouse.left + 0.30325f * bigHouse.width(), bigHouse.top + 0.62500f * bigHouse.height());
                bezier206Path.lineTo(bigHouse.left + 0.30325f * bigHouse.width(), bigHouse.top + 0.64304f * bigHouse.height());
                bezier206Path.lineTo(bigHouse.left + 0.17308f * bigHouse.width(), bigHouse.top + 0.64304f * bigHouse.height());
                bezier206Path.lineTo(bigHouse.left + 0.13314f * bigHouse.width(), bigHouse.top + 0.65722f * bigHouse.height());
                bezier206Path.close();
                canvas.drawPath(bezier206Path, getPaint());


                //// Bezier 208 Drawing
                Path bezier208Path = new Path();
                bezier208Path.moveTo(bigHouse.left + 0.40533f * bigHouse.width(), bigHouse.top + 0.65464f * bigHouse.height());
                bezier208Path.lineTo(bigHouse.left + 0.35503f * bigHouse.width(), bigHouse.top + 0.64304f * bigHouse.height());
                bezier208Path.lineTo(bigHouse.left + 0.32396f * bigHouse.width(), bigHouse.top + 0.64304f * bigHouse.height());
                bezier208Path.lineTo(bigHouse.left + 0.32396f * bigHouse.width(), bigHouse.top + 0.62500f * bigHouse.height());
                bezier208Path.lineTo(bigHouse.left + 0.35651f * bigHouse.width(), bigHouse.top + 0.62500f * bigHouse.height());
                bezier208Path.lineTo(bigHouse.left + 0.40976f * bigHouse.width(), bigHouse.top + 0.63660f * bigHouse.height());
                bezier208Path.lineTo(bigHouse.left + 0.40533f * bigHouse.width(), bigHouse.top + 0.65464f * bigHouse.height());
                bezier208Path.close();
                canvas.drawPath(bezier208Path, getPaint());


                //// Rectangle 162 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.25888f) + 0.5f);
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.63402f + 0.1f) + 0.4f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.27811f - 0.3f) - Math.floor(bigHouse.width() * 0.25888f) + 0.3f);
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.89175f + 0.1f) - Math.floor(bigHouse.height() * 0.63402f + 0.1f));
                canvas.drawRect(x, y, right, bottom, getPaint());


                //// Rectangle 164 Drawing
                x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.17751f + 0.5f));
                y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.74613f + 0.2f) + 0.3f);
                right = x + (float) (Math.floor(bigHouse.width() * 0.35503f + 0.5f) - Math.floor(bigHouse.width() * 0.17751f + 0.5f));
                bottom = y + (float) (Math.floor(bigHouse.height() * 0.76418f - 0.2f) - Math.floor(bigHouse.height() * 0.74613f + 0.2f) + 0.4f);
                canvas.drawRect(x, y, right, bottom, getPaint());
            }


            //// Bezier 210 Drawing
            Path bezier210Path = new Path();
            bezier210Path.moveTo(bigHouse.left + 0.50148f * bigHouse.width(), bigHouse.top + 0.53222f * bigHouse.height());
            bezier210Path.lineTo(bigHouse.left + 0.92308f * bigHouse.width(), bigHouse.top + 0.53222f * bigHouse.height());
            canvas.drawPath(bezier210Path, getPaint());


            //// Bezier 212 Drawing
            Path bezier212Path = new Path();
            bezier212Path.moveTo(bigHouse.left + 0.86095f * bigHouse.width(), bigHouse.top + 0.53222f * bigHouse.height());
            bezier212Path.lineTo(bigHouse.left + 0.97633f * bigHouse.width(), bigHouse.top + 0.53222f * bigHouse.height());
            canvas.drawPath(bezier212Path, getPaint());


            //// Bezier 214 Drawing
            Path bezier214Path = new Path();
            bezier214Path.moveTo(bigHouse.left + 0.06953f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier214Path.lineTo(bigHouse.left + 0.00000f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier214Path.lineTo(bigHouse.left + 0.28254f * bigHouse.width(), bigHouse.top + 0.00000f * bigHouse.height());
            bezier214Path.lineTo(bigHouse.left + 0.50444f * bigHouse.width(), bigHouse.top + 0.11211f * bigHouse.height());
            canvas.drawPath(bezier214Path, getPaint());


            //// Bezier 216 Drawing
            Path bezier216Path = new Path();
            bezier216Path.moveTo(bigHouse.left + 0.93047f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier216Path.lineTo(bigHouse.left + 1.00000f * bigHouse.width(), bigHouse.top + 0.15851f * bigHouse.height());
            bezier216Path.lineTo(bigHouse.left + 0.71598f * bigHouse.width(), bigHouse.top + 0.00000f * bigHouse.height());
            bezier216Path.lineTo(bigHouse.left + 0.49556f * bigHouse.width(), bigHouse.top + 0.11211f * bigHouse.height());
            canvas.drawPath(bezier216Path, getPaint());


            //// Bezier 218 Drawing
            Path bezier218Path = new Path();
            bezier218Path.moveTo(bigHouse.left + 0.56805f * bigHouse.width(), bigHouse.top + 0.11727f * bigHouse.height());
            bezier218Path.lineTo(bigHouse.left + 0.71893f * bigHouse.width(), bigHouse.top + 0.03995f * bigHouse.height());
            bezier218Path.lineTo(bigHouse.left + 0.87130f * bigHouse.width(), bigHouse.top + 0.11727f * bigHouse.height());
            bezier218Path.lineTo(bigHouse.left + 0.56805f * bigHouse.width(), bigHouse.top + 0.11727f * bigHouse.height());
            bezier218Path.close();
            canvas.drawPath(bezier218Path, getPaint());


            //// Bezier 220 Drawing
            Path bezier220Path = new Path();
            bezier220Path.moveTo(bigHouse.left + 0.35947f * bigHouse.width(), bigHouse.top + 0.11727f * bigHouse.height());
            bezier220Path.lineTo(bigHouse.left + 0.29438f * bigHouse.width(), bigHouse.top + 0.11727f * bigHouse.height());
            canvas.drawPath(bezier220Path, getPaint());


            //// Bezier 222 Drawing
            Path bezier222Path = new Path();
            bezier222Path.moveTo(bigHouse.left + 0.29438f * bigHouse.width(), bigHouse.top + 0.11727f * bigHouse.height());
            bezier222Path.lineTo(bigHouse.left + 0.13462f * bigHouse.width(), bigHouse.top + 0.11727f * bigHouse.height());
            bezier222Path.lineTo(bigHouse.left + 0.28698f * bigHouse.width(), bigHouse.top + 0.03995f * bigHouse.height());
            bezier222Path.lineTo(bigHouse.left + 0.43935f * bigHouse.width(), bigHouse.top + 0.11727f * bigHouse.height());
            bezier222Path.lineTo(bigHouse.left + 0.35947f * bigHouse.width(), bigHouse.top + 0.11727f * bigHouse.height());
            canvas.drawPath(bezier222Path, getPaint());


            //// Rectangle 166 Drawing
            x = (float) (bigHouse.left + Math.floor(bigHouse.width() * 0.68195f + 0.4f) + 0.1f);
            y = (float) (bigHouse.top + Math.floor(bigHouse.height() * 0.20747f + 0.4f) + 0.1f);
            right = (float) (Math.floor(bigHouse.width() * 0.77663f) - Math.floor(bigHouse.width() * 0.68195f + 0.4f) + 0.4f);
            bottom = (float) (Math.floor(bigHouse.height() * 0.23840f) - Math.floor(bigHouse.height() * 0.20747f + 0.4f) + 0.4f);
            canvas.drawRect(x, y, right, bottom, getPaint());


            //// Bezier 224 Drawing
            Path bezier224Path = new Path();
            bezier224Path.moveTo(bigHouse.left + 0.48225f * bigHouse.width(), bigHouse.top + 0.52706f * bigHouse.height());
            bezier224Path.lineTo(bigHouse.left + 0.48225f * bigHouse.width(), bigHouse.top + 1.00000f * bigHouse.height());
            canvas.drawPath(bezier224Path, getPaint());
        }
    }
}
