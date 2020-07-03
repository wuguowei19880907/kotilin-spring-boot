package cn.wg.kotlinserver.service

import cn.wg.kotlinserver.entity.Config

interface IConfigService {

    /**
     * 获取配置记录总数
     */
    fun getConfigs(): Long

    fun add(config: Config)

    fun getOne(id: Long): Config
}