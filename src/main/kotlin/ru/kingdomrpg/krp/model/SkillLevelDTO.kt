package ru.kingdomrpg.krp.model

import kotlinx.serialization.Serializable


@Serializable
data class SkillLevelDTO(
    val skill: SkillKey,
    val level: Int
)
