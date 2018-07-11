package com.chriscarini.jetbrains.samplenotification.project.component;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;

public class ProjectOpenNotifier implements ProjectComponent {
    private final Project myProject;

    public ProjectOpenNotifier(final Project project) {
        myProject = project;
    }

    @Override
    public void projectOpened() {
        final Notification notification = new Notification("ProjectOpenNotification", "Project Opened Detected",
                String.format("You just opened %s", myProject.getName()), NotificationType.INFORMATION);
        notification.notify(myProject);
    }
}
