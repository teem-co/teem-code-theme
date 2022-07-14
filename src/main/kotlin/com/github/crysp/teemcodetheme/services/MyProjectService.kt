package com.github.crysp.teemcodetheme.services

import com.intellij.openapi.project.Project
import com.github.crysp.teemcodetheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
