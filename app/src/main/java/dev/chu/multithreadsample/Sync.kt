package dev.chu.multithreadsample

class Sync {
    @Synchronized
    fun sum(n: Int) {
        // Creating a thread instance
        val thread = Thread.currentThread()
        for (i in 1..5) {
            println("Processing " + thread.name + " : " + (n + i))
        }
    }
}