package com.github.664623107.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.664623107.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
