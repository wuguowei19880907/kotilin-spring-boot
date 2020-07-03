package cn.wg.kotlinserver.service.impl

import cn.wg.kotlinserver.dao.ConfigDao
import cn.wg.kotlinserver.entity.Config
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import cn.wg.kotlinserver.service.IConfigService as IConfigService

@Service
class ConfigService: IConfigService {

    @Autowired
    private lateinit var configDao: ConfigDao

    override fun getConfigs(): Long {
        return configDao.count()
    }

    override fun add(config: Config) {
        configDao.save(config)
    }

    override fun getOne(id: Long):Config {
        return configDao.getOne(id)
    }
}