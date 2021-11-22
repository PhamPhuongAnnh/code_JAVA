/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddpool;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author phuon
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<NewRunnable> runnables = new ArrayList<>();
        runnables.add(new NewRunnable("Runnable 1"));
        runnables.add(new NewRunnable("Runnable 1"));
        runnables.add(new NewRunnable("Runnable 1"));
        runnables.add(new NewRunnable("Runnable 2"));
        runnables.add(new NewRunnable("Runnable 3"));
        runnables.add(new NewRunnable("Runnable 4"));
        runnables.add(new NewRunnable("Runnable 5"));
        runnables.add(new NewRunnable("Runnable 6"));
        runnables.add(new NewRunnable("Runnable 7"));
        runnables.add(new NewRunnable("Runnable 8"));
        runnables.add(new NewRunnable("Runnable 9"));
        runnables.add(new NewRunnable("Runnable 10"));

        for (int i = 0; i <runnables.size(); i++) {
            executor.execute(runnables.get(i));
        }
        executor.shutdown();
    }
}
