package scoreobserver;

public interface Source {
    public void notifyObserver();
    public void register(MyObserver observer);
}
