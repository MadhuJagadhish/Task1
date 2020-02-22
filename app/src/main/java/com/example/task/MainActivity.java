package com.example.task;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    NavigationView navigationView;
    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        setNavigationViewListener();

        browser = findViewById(R.id.main_webview);
        WebSettings settings = browser.getSettings();
        settings.setJavaScriptEnabled(true);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.menu_iconf);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch(menuItem.getItemId()){

            case R.id.homebutton: {
                Toast.makeText(getApplicationContext()," Home Page",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.google: {
                browser.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Opening Google Home Page",Toast.LENGTH_LONG).show();
                String google_url = "https://www.google.com";
                browser.loadUrl(google_url);
                break;
            }
            case R.id.bing: {
                browser.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Opening Bing Home Page",Toast.LENGTH_LONG).show();
                String google_url = "https://www.bing.com";
                browser.loadUrl(google_url);

                break;
            }
            case R.id.yippy: {
                browser.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Opening Yippy Home Page",Toast.LENGTH_LONG).show();
                String google_url = "https://www.yippy.com";
                browser.loadUrl(google_url);
                break;
            }
            case R.id.wiki: {
                browser.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Opening Wiki Home Page",Toast.LENGTH_LONG).show();
                String google_url = "https://www.wiki.com";
                browser.loadUrl(google_url);
                break;
            }
            case R.id.search_encrypt: {
                browser.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Opening Search Encrypt Home Page",Toast.LENGTH_LONG).show();
                String google_url = "https://www.searchencrypt.com";
                browser.loadUrl(google_url);
                break;
            }
            case R.id.sweetsearch: {
                browser.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Opening Sweet Search Home Page",Toast.LENGTH_LONG).show();
                String google_url = "https://www.sweetsearch.com";
                browser.loadUrl(google_url);
                break;
            }
            case R.id.ask: {
                browser.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Opening Ask Home Page",Toast.LENGTH_LONG).show();
                String google_url = "https://www.ask.com";
                browser.loadUrl(google_url);
                break;
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setNavigationViewListener() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
