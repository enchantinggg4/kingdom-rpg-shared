package com.github.enchantinggg4.kingdomrpg.model

import kotlinx.serialization.Serializable


@Serializable
data class SkillLevelDTO(
    val skill: SkillKey,
    val level: Int
)
