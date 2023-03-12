package game;

import city.cs.engine.Shape;
import city.cs.engine.*;

import java.awt.*;

public class Critter extends Walker {

    private int direction;

    private static final Shape critterShape = new PolygonShape(-1f,0.4f, -1.1f,0f, -1f,-1.25f, 1f,-1.25f, 1.1f,0f, 1f,0.4f);

    private final Sensor sideSensor = new Sensor(this, new PolygonShape(-1.05f,0.35f, -1.15f,0f, -1.05f,-1f, 1.05f,-1f, 1.15f,0f, 1.05f,0.35f));

    public Critter(World world) {
        super(world, critterShape);
        setFillColor(Color.PINK);
        direction = 1;
        startWalking(5);
        Sensor topSensor = new Sensor(this, new PolygonShape(-0.9f,0.5f, -0.8f,0.4f, 0.8f,0.4f,  0.9f,0.5f));
        TopSensor topSensorListener = new TopSensor(this);
        topSensor.addSensorListener(topSensorListener);


        SideSensor sideSensorListener = new SideSensor(this);
        sideSensor.addSensorListener(sideSensorListener);
    }

    // TODO
    /* Two ways to go about dynamic body movement:
        1. Implement step listener
        2. Implement collision listener and apply variable on each instance of platform.

    */
    public void SwitchDirection() {
        stopWalking();
        if (direction == 1) {
            direction = 0;
            startWalking(-5f);
            this.removeAllImages();
            this.addImage(new BodyImage("data/sprites/critter/critter-move-left.gif",2));
        } else {
            direction = 1;
            startWalking(5f);
            startWalking(5f);
            this.removeAllImages();
            this.addImage(new BodyImage("data/sprites/critter/critter-move-right.gif",2));
        }
    }

    public void Deactivate() {
        sideSensor.removeAllSensorListeners();
        destroy();
    }
}

class TopSensor implements SensorListener {

    private final Critter critter;
    public TopSensor(Critter critter) {
        this.critter = critter;
    }
    @Override
    public void beginContact(SensorEvent sensorEvent) {
        critter.Deactivate();
    }

    @Override
    public void endContact(SensorEvent sensorEvent) {
    }
}

class SideSensor implements SensorListener {

    private final Critter critter;

    public SideSensor(Critter critter) {
        this.critter = critter;

    }
    @Override
    public void beginContact(SensorEvent sensorEvent) {
        if (!(sensorEvent.getContactBody() instanceof Student)) {
            critter.SwitchDirection();
            this.endContact(sensorEvent);
        } else {
            Game.getLevelManager().currentStudent.Respawn();
        }
    }

    @Override
    public void endContact(SensorEvent sensorEvent) {
    }
}

