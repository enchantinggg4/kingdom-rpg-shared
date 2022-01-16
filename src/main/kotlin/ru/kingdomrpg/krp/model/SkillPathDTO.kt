package ru.kingdomrpg.krp.model

import kotlinx.serialization.Serializable

@Serializable
data class SkillPathDTO(
    val xp: Double,
    val path: Path,
    val levels: Int,
    val overflowLevels: Int
)