package sample;

public abstract class Observer {

    protected Subject _subject;

    public abstract void update();
    public abstract int getResult();
}
