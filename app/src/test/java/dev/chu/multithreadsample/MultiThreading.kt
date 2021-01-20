package dev.chu.multithreadsample

import org.junit.Test

class MultiThreading {
    @Test
    fun testSync() {
        // Instantiating MyThread class
        val myThread = MyThread()

        // Instantiating thread instances
        val thread1 = Thread(myThread)
        val thread2 = Thread(myThread)
        thread1.name = "Thread A"
        thread2.name = "Thread B"

        // Starting thread instance thread1 and thread2
        thread1.start()
        thread2.start()
    }

    @Test
    fun testThread() {
        for (i in 1..5) {
            // Instantiating Thread
            val myThread = MyThreadJava()
            // load the run method of MyThread class
            myThread.start()
        }
    }

    @Test
    fun testRunnable() {
        for (i in 1..5) {
            // Instantiating Thread
            val thread = Thread(MyRunnable())
            // loads the run method of MyThread class
            thread.start()
        }
    }
}