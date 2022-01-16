package ru.kingdomrpg.krp.model

data class XPInfoPacket(
    val paths: List<SkillPathDTO>,
    val skills: List<SkillLevelDTO>
)