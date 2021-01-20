package dev.chu.multithreadsample

class MyRunnable: Runnable {
    override fun run() {
        try {
            // Displaying the running thread
            println("Thread ${Thread.currentThread().id} is running...")
        } catch (e: Exception) {
            println(e.message) // Exception handling
        }
    }
}