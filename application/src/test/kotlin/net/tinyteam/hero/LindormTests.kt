package net.tinyteam.hero

import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.ResultSet
import com.datastax.oss.driver.api.core.cql.Row
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class LindormTests {

    @Test
    fun should_get_release_version() {
        CqlSession.builder().build().use { session ->                                   // (1)
            val rs: ResultSet = session.execute("select release_version from system.local") // (2)
            val row: Row? = rs.one()
            System.out.println(row?.getString("release_version")) // (3)
        }
    }

    @Test
    fun should_insert() {
        CqlSession.builder().build().use { session ->                                   // (1)
            val rs: ResultSet = session.execute("insert into ") // (2)
            val row: Row? = rs.one()
            System.out.println(row?.getString("release_version")) // (3)
        }
    }
}