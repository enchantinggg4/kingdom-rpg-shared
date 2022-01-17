package com.github.enchantinggg4.kingdomrpg.model

import kotlinx.serialization.Serializable

@Serializable
data class XPInfoPacket(
    val paths: List<SkillPathDTO>,
    val skills: List<SkillLevelDTO>
)