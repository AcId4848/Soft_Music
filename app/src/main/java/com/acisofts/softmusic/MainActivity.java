package com.acisofts.softmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;

import com.acisofts.softmusic.views.panels.RootSoftMediaPlayerPanel;
import com.realgear.multislidinguppanel.MultiSlidingUpPanelLayout;
import com.realgear.multislidinguppanel.PanelStateListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MultiSlidingUpPanelLayout panelLayout = findViewById(R.id.root_sliding_up_panel);

        List<Class<?>> items = new ArrayList<>();

        items.add(RootSoftMediaPlayerPanel.class);
        items.add(RootSoftMediaPlayerPanel.class);

        panelLayout.setPanelStateListener(new PanelStateListener(panelLayout) {});

        panelLayout.setAdapter(new Adapter(getBaseContext(), items));
    }
}