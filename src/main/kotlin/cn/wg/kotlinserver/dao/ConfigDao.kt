package cn.wg.kotlinserver.dao

import cn.wg.kotlinserver.entity.Config
import org.springframework.data.jpa.repository.JpaRepository

interface ConfigDao: JpaRepository<Config,Long> {
}