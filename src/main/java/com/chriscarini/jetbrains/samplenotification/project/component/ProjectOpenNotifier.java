package com.chriscarini.jetbrains.samplenotification.project.component;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;


public class ProjectOpenNotifier implements StartupActivity {
  @Override
  public void runActivity(@NotNull Project project) {
    final Notification notification = new Notification("ProjectOpenNotification", "Project opened detected",
        String.format("You just opened %s", project.getName()), NotificationType.INFORMATION);
    notification.notify(project);
  }
}
