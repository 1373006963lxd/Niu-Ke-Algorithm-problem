package com.lxd.niukework.ThreadPool;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

    private static final int CORE_THREAD = 5;
    private static final int MAX_THREAD = 20;
    private static final Long KEEP_ALIVE_TIME = 5L;
    private static ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(10);



    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_THREAD,
                MAX_THREAD,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                arrayBlockingQueue,
                new ThreadPoolExecutor.CallerRunsPolicy());

        /*
        * ThreadPoolExecutor.AbortPolicy ：抛出 RejectedExecutionException来拒绝新任务的处理。
        ThreadPoolExecutor.CallerRunsPolicy ：调用执行自己的线程运行任务，
        * 也就是直接在调用execute方法的线程中运行(run)被拒绝的任务，如果执行程序已关闭，则会丢弃该任务。
        * 因此这种策略会降低对于新任务提交速度，影响程序的整体性能。
        * 如果您的应用程序可以承受此延迟并且你要求任何一个任务请求都要被执行的话，你可以选择这个策略。
        ThreadPoolExecutor.DiscardPolicy ：不处理新任务，直接丢弃掉。
        ThreadPoolExecutor.DiscardOldestPolicy ： 此策略将丢弃最早的未处理的任务请求。
        *
        *
        * */

        for(int i=0;i<100;i++){
            Runnable task = new Task();
            threadPoolExecutor.execute(task);
        }

/*
*
* shutdown（） :关闭线程池，线程池的状态变为 SHUTDOWN。线程池不再接受新任务了，但是队列里的任务得执行完毕。
shutdownNow（） :关闭线程池，线程的状态变为 STOP。线程池会终止当前正在运行的任务，
并停止处理排队的任务并返回正在等待执行的 List。
* */
        threadPoolExecutor.shutdown();
        //threadPoolExecutor.shutdownNow(); 不适用
/*
* isShutDown 当调用 shutdown() 方法后返回为 true。
isTerminated 当调用 shutdown() 方法后，并且所有提交的任务完成后返回为 true
* */

        while (!threadPoolExecutor.isTerminated()){

        }
        System.out.println("Finished all threads");
    }
}
class  Task implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"开始时间："+new Date());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"结束时间："+new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
