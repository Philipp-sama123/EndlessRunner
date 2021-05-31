package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screens.WelcomeScreen;

public class MyGdxGame extends Game {
	//todo extract to data class/data structure
	//todo more different types
	public static final int PLAYER_JUMP_HEIGHT = 75;

	public static final int COIN_SPAWN_FREQUENCY = 100;
	public static final int BOMB_SPAWN_FREQUENCY = 250;
	public static final int MUSHROOM_SPAWN_FREQUENCY = 1000;

	public static final float AWESOME_SPAWN_MULTIPLIER_FREQUENCY = 1 / 3f;

	public static final int COIN_VELOCITY_IN_PX = 4;
	public static final int BOMB_VELOCITY_IN_PX = 6;
	public static final int MUSHROOM_VELOCITY_IN_PX = 8;

	public static final int AWESOME_VELOCITY_MULTIPLIER_IN_PX = 5;

	public SpriteBatch batch;

	@Override
	public void create() {
		batch = new SpriteBatch();
		setScreen(new WelcomeScreen(this));
		//todo handle game Screens here (switch/case) -- pass parameters!!
		//     setScreen(new GameScreen(this));
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}
}
