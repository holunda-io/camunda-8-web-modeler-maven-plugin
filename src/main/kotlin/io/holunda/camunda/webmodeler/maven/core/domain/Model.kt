package io.holunda.camunda.webmodeler.maven.core.domain

data class Model(
    val name: String,
    val milestone: String?,
    val project: String?,
    var targetPath: String? = null
)
