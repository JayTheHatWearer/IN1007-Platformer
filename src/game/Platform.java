package game;

import city.cs.engine.*;

import java.awt.Color;

public class Platform extends StaticBody {
    private static final String TILE_IMAGE_PATH = "data/img/tiles/tile.png";
    private static final String GROUND_IMAGE_PATH = "data/img/tiles/ground/ground";
    private static final String EDGE_RIGHT_SINGLE_PATH = "data/img/tiles/platform-edge-right-single.png";
    private static final String SINGLE_IMAGE_PATH = "data/img/tiles/single/single";
    private static final String INDEPENDENT_IMAGE_PATH = "data/img/tiles/independent/independent";
    private static final String ROOF_IMAGE_PATH = "data/img/tiles/roof/roof";
    private static final String RIGHT_WALL_IMAGE_PATH = "data/img/tiles/right-wall/right-wall";
    private static final String CORNER_IMAGE_PATH = "data/img/tiles/corners/corner";
    private static final String MID_WALL_IMAGE_PATH = "data/img/tiles/mid-wall/mid-wall";
    private static final String CEILING_AND_GROUND_IMAGE_PATH = "data/img/tiles/candg/candg";
    private static final String BLANK_IMAGE_PATH = "data/img/tiles/blank";


    public Platform(World world, BoxShape obstacleSize) {
        super(world, obstacleSize);
        setAlwaysOutline(false);
        setFillColor(Color.GRAY);
        setLineColor(Color.GRAY);
        SetType("default", 0);
    }

    public void SetType(String type, int variation) {
        removeAllImages();
        switch (type) {
            case "default" -> addImage(new BodyImage(TILE_IMAGE_PATH, 2));
            case "platform-edge-right-single" -> addImage(new BodyImage(EDGE_RIGHT_SINGLE_PATH, 3));
            case "ground" -> addImage(new BodyImage(GROUND_IMAGE_PATH + variation + ".png", 3));
            case "single" -> addImage(new BodyImage(SINGLE_IMAGE_PATH + variation + ".png", 3));
            case "independent" -> addImage(new BodyImage(INDEPENDENT_IMAGE_PATH + variation + ".png", 3));
            case "roof" -> addImage(new BodyImage(ROOF_IMAGE_PATH + variation + ".png", 3));
            case "right-wall" -> addImage(new BodyImage(RIGHT_WALL_IMAGE_PATH + variation + ".png", 3));
            case "corner" -> addImage(new BodyImage(CORNER_IMAGE_PATH + variation + ".png", 3));
            case "mid-wall" -> addImage(new BodyImage(MID_WALL_IMAGE_PATH + variation + ".png", 3));
            case "blank" -> addImage(new BodyImage(BLANK_IMAGE_PATH + ".png", 3));
            case "candg" -> addImage(new BodyImage(CEILING_AND_GROUND_IMAGE_PATH + variation + ".png", 3));

        }
    }

    public String getType() {
        return type
    }

}
