package com.plcoding.testingcourse.part4.presentation

data class BadProfileState(
    val profileId: Long = 0,
    val username: String = "",
    val bio: String = "",
    val isLoading: Boolean = false,
    val infoMessage: String? = null
)