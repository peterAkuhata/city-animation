package trademe.co.nz.cityanimation;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import trademe.co.nz.cityanimation.drawable.SpriteDrawable;
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

/**
 * This file just contains static images of the sprites
 */
public class SpriteDrawablesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprite_drawables);

        ((ImageView)findViewById(R.id.imageViewCloud)).setImageDrawable(new SpriteDrawable(new CloudSprite()));
        ((ImageView)findViewById(R.id.imageViewHotAirBalloon)).setImageDrawable(new SpriteDrawable(new HotAirBalloonSprite()));
        ((ImageView)findViewById(R.id.imageViewSkyTower)).setImageDrawable(new SpriteDrawable(new SkyTowerSprite()));
        ((ImageView)findViewById(R.id.imageViewBigTree)).setImageDrawable(new SpriteDrawable(new BigTreeSprite()));
        ((ImageView)findViewById(R.id.imageViewSmallBuilding)).setImageDrawable(new SpriteDrawable(new SmallBuildingSprite()));
        ((ImageView)findViewById(R.id.imageViewSkyScraper)).setImageDrawable(new SpriteDrawable(new SkyScraperSprite()));
        ((ImageView)findViewById(R.id.imageViewShop)).setImageDrawable(new SpriteDrawable(new ShopSprite()));
        ((ImageView)findViewById(R.id.imageViewFourSquare)).setImageDrawable(new SpriteDrawable(new FourSquareSprite()));
        ((ImageView)findViewById(R.id.imageViewSmallHouse)).setImageDrawable(new SpriteDrawable(new SmallHouseSprite()));
        ((ImageView)findViewById(R.id.imageViewFence)).setImageDrawable(new SpriteDrawable(new FenceSprite()));
        ((ImageView)findViewById(R.id.imageViewBigHouse)).setImageDrawable(new SpriteDrawable(new BigHouseSprite()));
        ((ImageView)findViewById(R.id.imageViewLittleTrees)).setImageDrawable(new SpriteDrawable(new LittleTreesSprite()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


}
