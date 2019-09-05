import java.util.ArrayList;

/**
 * Created by CHULEI on 2019/9/2.
 */

class SAMInJava {
    private ArrayList<Runnable> mRunnables = new ArrayList<>();

    public void addTask(Runnable runnable) {
        mRunnables.add(runnable);
        System.out.println("After add: " + runnable + ",we have " + mRunnables.size() + "in all.");
    }

    public void removeTask(Runnable runnable) {
        mRunnables.remove(runnable);
        System.out.println("After remove: " + runnable + ",only have " + mRunnables.size() + "left.");
    }
}
