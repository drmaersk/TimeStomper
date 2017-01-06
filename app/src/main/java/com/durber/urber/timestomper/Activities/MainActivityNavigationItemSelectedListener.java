package com.durber.urber.timestomper.Activities;

import android.app.Activity;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MenuItem;

import com.durber.urber.timestomper.R;

import static android.R.attr.tag;
import static android.content.ContentValues.TAG;

/**
 * Created by rober on 2017-01-06.
 */

class MainActivityNavigationItemSelectedListener implements NavigationView.OnNavigationItemSelectedListener
{

    Activity m_main;
    MainActivityNavigationItemSelectedListener(Activity mainActivity)
    {
        m_main = mainActivity;
    }
    private static final String TAG = "NavigationItemSelectedListener";
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Log.d(TAG, "onNavigationItemSelected: Camera");
        } else if (id == R.id.nav_gallery) {
            Log.d(TAG, "onNavigationItemSelected: gallery");
        } else if (id == R.id.nav_slideshow) {
            Log.d(TAG, "onNavigationItemSelected: slideshow");
        } else if (id == R.id.nav_manage) {
            Log.d(TAG, "onNavigationItemSelected: manage");
        } else if (id == R.id.nav_share) {
            Log.d(TAG, "onNavigationItemSelected: share");
        } else if (id == R.id.nav_send) {
            Log.d(TAG, "onNavigationItemSelected: send");

        }

        DrawerLayout drawer = (DrawerLayout) m_main.findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
