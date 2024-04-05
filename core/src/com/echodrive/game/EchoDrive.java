package com.echodrive.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.*;

public class EchoDrive extends ApplicationAdapter {

    @Override
    public void create() {

    }

    @Override
    public void render() {
        batch.draw(bucketImage, bucket.x, bucket.y);
    }
}
