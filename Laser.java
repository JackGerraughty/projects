package com.jackgerraughty.spacerocks;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
public class Laser extends BaseActor
{
    public Laser(float x, float y, Stage s)
    {
        super(x,y,s);
        loadTexture("Laser.png");
        addAction(Actions.delay(1));
        addAction(Actions.after(Actions.fadeOut(.5f)));
        addAction(Actions.after(Actions.removeActor()));
        setSpeed(400);
        setMaxSpeed(400);
        setDeceleration(0);
    }
    public void act(float dt)
    {
        super.act(dt);
        applyPhysics(dt);
        wrapAroundWorld();
    }
}
