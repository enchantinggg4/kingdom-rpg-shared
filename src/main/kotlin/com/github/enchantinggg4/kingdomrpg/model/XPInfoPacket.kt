package com.github.enchantinggg4.kingdomrpg.model

data class XPInfoPacket(
    val paths: List<SkillPathDTO>,
    val skills: List<SkillLevelDTO>
)