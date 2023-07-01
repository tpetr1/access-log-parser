import java.util.ArrayList;

public class Student {
    final String name;
    private ArrayList<Integer> estimates = new ArrayList<>();
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, ArrayList<Integer> estimates) {
        this.name = name;
        for (Integer estimate : estimates) {
            addEstimate(estimate);
        }
    }

    public void addEstimate(int e){
        if ((e <= 5) && (e >= 2)) estimates.add(e);
    }

    @Override
    public String toString() {
        return name + ":" + estimates.toString();
    }
}
