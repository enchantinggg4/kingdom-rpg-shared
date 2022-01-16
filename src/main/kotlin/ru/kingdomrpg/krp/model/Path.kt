package ru.kingdomrpg.krp.model


enum class Path(val skillCount: Int) {
    WAR(2),
    WORK(2),
    CRAFT(3),
    FOOD(3),
    MAGIC(2),
    REPUTATION(0)
}