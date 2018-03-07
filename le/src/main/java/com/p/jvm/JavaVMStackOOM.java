package com.p.jvm;

public class JavaVMStackOOM {
    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            new Thread(() ->{
                dontStop();
            },"1").start();
//            Thread thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    dontStop();
//                }
//            });
//            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
