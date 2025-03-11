package lesson12;

public interface Voicable {

    void voice();

    default int getInt() {
        return 0;
    }
}
