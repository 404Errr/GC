package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.List;

import javax.swing.JPanel;

import data.ColorData;
import data.GraphicsData;
import data.ProgramData;
import util.Util;

@SuppressWarnings("serial")
public class Renderer extends JPanel implements ColorData, ProgramData, GraphicsData {
	private static Graphics2D g;

	@Override
	public void paintComponent(Graphics g0) {
		g = (Graphics2D) g0;
		setBackground(COLOR_BACKGROUND);
		super.paintComponent(g);
		try {
			drawDebug();

		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private final static int textX = 25, textY = 30, textSize = 15;
	private void drawDebug() {
		if (DEBUG) {
			StringBuilder text = new StringBuilder();

			text.append("Window = "+Window.width()+"x"+Window.height());

			String[] textLines = text.toString().split("\\$");
			g.setColor(COLOR_DEBUG_GREEN);
			g.setFont(new Font("Helvetica", Font.BOLD, textSize));
			for (int i = 0;i<textLines.length;i++) {
				g.drawString(textLines[i], textX, textY+textSize*i);
			}
		}
	}

	public static Graphics2D getG() {
		return g;
	}
}
