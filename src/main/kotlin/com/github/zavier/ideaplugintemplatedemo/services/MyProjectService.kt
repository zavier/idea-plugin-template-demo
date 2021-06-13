package com.github.zavier.ideaplugintemplatedemo.services

import com.github.zavier.ideaplugintemplatedemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
