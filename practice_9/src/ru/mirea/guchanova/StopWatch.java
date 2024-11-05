package ru.mirea.guchanova;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public static void main(String[] args) {

        StopWatch sw = new StopWatch();
        sw.start();


        try {
            Thread.sleep(1000); // Пауза в 1 секунду
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sw.stop();
        System.out.println("Прошедшее время в миллисекундах:: " + sw.getElapsedTime());
    }
}

