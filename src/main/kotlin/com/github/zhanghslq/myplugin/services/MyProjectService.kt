package com.github.zhanghslq.myplugin.services

import com.intellij.openapi.project.Project
import com.github.zhanghslq.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
