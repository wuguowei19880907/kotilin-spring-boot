package cn.wg.kotlinserver.entity

import cn.wg.kotlinserver.dao.ConfigDao
//import org.junit.Assert.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ConfigTest {

    @Autowired
    private lateinit var configDao: ConfigDao

    @Test
    fun `find all configs test`() {
        println(configDao.count())
    }
}