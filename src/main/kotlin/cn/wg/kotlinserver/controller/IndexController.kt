package cn.wg.kotlinserver.controller

import cn.wg.kotlinserver.entity.Config
import cn.wg.kotlinserver.service.IConfigService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class IndexController {

    @Autowired
    private lateinit var configService: IConfigService

    @GetMapping("index")
    fun index(name: String): String {
        var config = Config()
        config.name = "test"
        config.value = "testv"
        config.category = "testc"
        config.updateTime = Date()
        configService.add(config)
        return "hello!!$name";
    }


    @GetMapping("count")
    fun count(name: String): String {
        val configs = configService.getConfigs()
        return "$name$configs";
    }

    @GetMapping("one")
    fun one(id: Long): Config {
        return configService.getOne(id);
    }
}