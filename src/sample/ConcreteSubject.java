package sample;

public class ConcreteSubject extends Subject{
    private int aa;
    private int bb;

    public void setState(int aa, int bb) {
        this.aa = aa;
        this.bb = bb;
        notifyYu();
    }


    public int[] getState() {
        int[] state = {aa, bb};
        return state;
    }

    public int[] getResults() {
        int[] results = new int[3];

        for (int i = 0; i < 3; i++) {
            results[i] = _observers[i].getResult();
        }
        return results;
    }
}
