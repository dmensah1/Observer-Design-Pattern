package sample;

public class Divisions extends Observer{
    private int aa;
    private int bb;
    private int result;

    public Divisions(Subject s) {
        _subject = s;
        _subject.attach(this);
    }

    @Override
    public void update() {
        int[] state = _subject.getState();
        this.aa = state[0];
        this.bb = state[1];
        result = this.aa / this.bb;
    }

    @Override
    public int getResult(){
        return result;
    }
}
