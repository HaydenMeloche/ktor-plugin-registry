import io.ktor.server.application.*
import io.ktor.server.plugins.hsts.*
import io.ktor.server.response.*

public fun Application.configureHTTP() {
    install(HSTS) {
        includeSubDomains = true
    }
}
