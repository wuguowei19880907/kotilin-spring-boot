package cn.wg.kotlinserver

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinServerApplication

fun main(args: Array<String>) {
    runApplication<KotlinServerApplication>(*args){
        setBannerMode(Banner.Mode.OFF)
    }
}
