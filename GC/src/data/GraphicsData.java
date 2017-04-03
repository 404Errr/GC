package data;

public interface GraphicsData {
//	WindowType WINDOW_FORMAT = WindowType.WINDOWED;
	WindowType WINDOW_FORMAT = WindowType.WINDOWED_FULLSCREEN;
//	WindowType WINDOW_FORMAT = WindowType.BORDERLESS_FULLSCREEN;
	enum WindowType {
		BORDERLESS_FULLSCREEN, WINDOWED_FULLSCREEN, WINDOWED
	}

	float DEFAULT_SCALE_RATIO = 0.035f;
	float ZOOM_INCREMENT = 0.001f;
	float DEFAULT_WINDOW_SCREEN_RATIO = 0.8f;

	boolean DRAW_TILE_COORDS = false;
	boolean DRAW_BOUNCE_HIT = true;
	boolean DRAW_PROJECTILE_HIT = false;
}

