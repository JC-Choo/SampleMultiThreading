package dev.chu.multithreadsample

class MyThread: Thread() {
    var sync = Sync()

    override fun run() {
        sync.sum(10)
//        try {
//            // Displaying the running thread
//            println("Thread ${currentThread().id} is running...")
//        } catch (e: Exception) {
//            println(e.message) // Exception handling
//        }
    }
}