package ru.kingdomrpg.krp.model

enum class SkillKey(val path: Path) {

    // work path
    LUMBERJACK(Path.WORK),
    MINER(Path.WORK),

    // war path
    WARRIOR(Path.WAR),
    ARCHER(Path.WAR),

    // craft path
    SMITH(Path.CRAFT),
    CARPENTER(Path.CRAFT),
    ENGINEER(Path.CRAFT),

    // food path
    FARMER(Path.FOOD),
    FISHER(Path.FOOD),
    COOK(Path.FOOD),

    // magic path
    ALCHEMIST(Path.MAGIC),
    ENCHANTER(Path.MAGIC),
}