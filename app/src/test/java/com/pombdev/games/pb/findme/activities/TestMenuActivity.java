package com.pombdev.games.pb.findme.activities;

import android.os.Bundle;
import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestMenuActivity {

    @InjectMocks
    private MenuActivity menuActivity;

    @Mock
    View view;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void onClick() {
        menuActivity.onClick(view);
    }

}
