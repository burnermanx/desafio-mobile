package io.github.burnermanx.starwarsstore.view.main;

import android.os.Bundle;

import io.github.burnermanx.starwarsstore.R;
import io.github.burnermanx.starwarsstore.view.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
