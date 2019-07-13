import engine.GameAPI
import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.runBlocking
import server.LogManager
import server.Server

@ObsoleteCoroutinesApi
fun main() {
    runBlocking {
        LogManager.enable()
        Server(GameAPI(), 32)
    }
}