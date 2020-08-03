package sample;

public abstract class Subject {

    protected Observer[] _observers = new Observer[3];
    private int totalObs = 0;

    public void attach(Observer o) {
        _observers[totalObs++] = o;
    }


    public void notifyYu() {
        for (int i = 0; i < totalObs; i++){
            _observers[i].update();
        }
    }

    public abstract int[] getState();
}
