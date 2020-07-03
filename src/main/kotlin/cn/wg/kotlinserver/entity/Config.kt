package cn.wg.kotlinserver.entity

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
import javax.persistence.*


@Entity
@Table(name = "CONFIG",schema = "SHARDING")
@SequenceGenerator(name = "ID_SEQ", sequenceName = "CONFIG_SEQ", allocationSize = 1,schema = "SHARDING")
class Config {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    @Column(name = "ID")
    var id: Long = 0

    @Column(name = "NAME")
    var name: String = ""

    @Column(name = "VALUE")
    var value: String = ""

    @Column(name = "CATEGORY")
    var category: String = ""

    @Column(name = "UPDATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    var updateTime: Date = Date(0)
}