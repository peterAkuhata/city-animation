package trademe.co.nz.cityanimation;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import trademe.co.nz.cityanimation.drawable.CityDrawable;


public class CityDrawableActivity extends ActionBarActivity implements GestureDetector.OnGestureListener {
    /**
     * The city drawable itself.
     */
    private CityDrawable cityDrawable = new CityDrawable();

    /**
     * Detects scrolling on the activity and updates the city drawable transform value
     */
    private GestureDetector gestureDetector;

    /**
     * Every 10 pixels equals 0.04 being added to the transform value.
     * For example, if the user scrolls the screen by 20 pixels, then
     * we add 0.08 onto the current transform value, causing the city
     * drawable to redraw itself.
     */
    private final float TRANSFORM_MULTIPLIER = 0.04f;
    private final float TRANSFORM_PIXEL_COUNT = 10f;

    /**
     * The last x value that was used when the user was scrolling
     */
    private float lastScrollingXValue;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);

        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_drawable);

        ((ImageView)findViewById(R.id.imageViewCity)).setImageDrawable(cityDrawable);
        findViewById(R.id.buttonAnimate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cityDrawable.start();
            }
        });

        gestureDetector = new GestureDetector(this, this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_city_drawable, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        lastScrollingXValue = e.getX();
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        float deltaX = lastScrollingXValue - e2.getX();
        float transformValueIncrement = (deltaX / TRANSFORM_PIXEL_COUNT) * TRANSFORM_MULTIPLIER;

        if (deltaX > 0) {
            // user is swiping to the right
            cityDrawable.setAnimationDirection(CityDrawable.Direction.Right);

        } else {
            // user is swiping to the left
            cityDrawable.setAnimationDirection(CityDrawable.Direction.Left);
        }

        cityDrawable.setTransformValue(cityDrawable.getTransformValue() + transformValueIncrement);
        lastScrollingXValue = e2.getX();

        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
