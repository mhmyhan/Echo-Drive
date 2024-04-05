package com.echodrive.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class EchoDrive extends ApplicationAdapter {

    private OrthographicCamera camera;
    private SpriteBatch batch;
    private Texture bucketImage;
    private Rectangle bucket;
    private int mynumber;

    @Override
    public void create() {
        // load the bucket image into memory
        bucketImage = new Texture("bucket.png");
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 1920, 1080);

        batch = new SpriteBatch();

        bucket = new Rectangle();
        bucket.x = 1920 / 2 - 64 / 2; bucket.y = 40;
        bucket.width = 64; bucket.height = 64;
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.1f, 0.1f, 0.1f, 1);

        camera.update();
        batch.setProjectionMatrix(camera.combined);

        batch.begin();
        batch.draw(bucketImage, bucket.x, bucket.y);

        batch.end();

    }

    @Override
    public void dispose() {
        // dispose of all natively stored resources
        bucketImage.dispose();
        batch.dispose();
    }


}
