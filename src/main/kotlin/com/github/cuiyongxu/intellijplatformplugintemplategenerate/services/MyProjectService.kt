package com.github.cuiyongxu.intellijplatformplugintemplategenerate.services

import com.intellij.openapi.project.Project
import com.github.cuiyongxu.intellijplatformplugintemplategenerate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
