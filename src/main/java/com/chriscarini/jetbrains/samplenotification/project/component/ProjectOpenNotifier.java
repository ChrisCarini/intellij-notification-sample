package com.chriscarini.jetbrains.samplenotification.project.component;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.DumbService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.ProjectActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class ProjectOpenNotifier implements ProjectActivity {

  @Override
  public @Nullable Object execute(@NotNull Project project, @NotNull Continuation<? super Unit> continuation) {
    DumbService.getInstance(project).runWhenSmart(() -> {
      final Notification notification = new Notification("ProjectOpenNotification", "Project opened detected",
          String.format("You just opened %s", project.getName()), NotificationType.INFORMATION);
      notification.notify(project);
    });
    return null;
  }
}
