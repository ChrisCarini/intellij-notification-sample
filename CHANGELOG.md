<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# IntelliJ Platform Plugin Template Changelog

## [Unreleased]
### Added

### Changed
- Upgrading IntelliJ from 2022.3.3 to 2023.1.0

### Deprecated

### Removed

### Fixed

### Security

## [2.8.3] - 2023-03-13
### Changed
- Upgrading IntelliJ from 2022.3.2 to 2022.3.3

## [2.8.2] - 2023-02-04
### Changed
- Upgrading IntelliJ from 2022.3.1 to 2022.3.2

## [2.8.1] - 2022-12-28
### Changed
- Upgrading IntelliJ from 2022.3 to 2022.3.1

## [2.8.0] - 2022-12-28

## [2.7.1] - 2022-11-28
### Changed
- Upgrading IntelliJ from 2022.2 to 2022.2.4

## 2.7.0 - 2022-07-29
### Changed
- Upgrading IntelliJ to 2022.2

## 2.6.0 - 2022-04-14
### Changed
- Upgrading IntelliJ to 2022.1

## 2.5.2 - 2021-12-01
### Changed
- Upgrading IntelliJ to 2021.3
- Remove `description` from `plugin.xml` _(value is taken from `README.md` as part of Gradle `patchPluginXml` task)_

## 2.5.0 - 2021-10-09
### Added
- Restructured  file to extract all variables into  file.
- Adding ability to publish to different channels based on SemVer pre-release labels.
- Adding [JetBrains Plugin Signing](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html)
- Update Dependabot to include Gradle dependencies.
- Adding GitHub build & release workflows.
- Adding JetBrains Qodana (experimental, testing only)

### Changed
- Upgrading Gradle to 6.6
- Upgrading IntelliJ to 2021.2.2
- Upgrading IntelliJ Gradle plugin to 1.2.0

## 2.4.0 - 2021-04-10
### Changed
- Upgrading to 2021.1
- Upgrading IntelliJ Gradle plugin to 0.7.2

## 2.3.1 - 2021-01-01
### Changed
- Change plugin name to remove `IntelliJ` (ie, `intellij-sample-notification` -> `sample-notification`) per JetBrains
  guidance.

## 2.3.0 - 2020-12-27
### Changed
- Upgrading to 2020.3
- Upgrading IntelliJ Gradle plugin to 0.6.5
- Upgrading Java 11 -
  see [the JetBrains Platform blog post announcing the migration](https://blog.jetbrains.com/platform/2020/09/intellij-project-migrates-to-java-11/)

## 0.2.1 - 2020-04-11
### Added
- GitHub Workflow Action
  for [IntelliJ Platform Plugin Verifier](https://github.com/marketplace/actions/intellij-platform-plugin-verifier)

### Changed
- Upgrading to 2020.1
- Upgrading IntelliJ Gradle plugin to 0.4.16
- Upgrading Gradle to 6.2

## 0.0.2 - 2019-07-25
### Changed
- Upgrade to 2019.2
- Upgrade intellij gradle plugin

## 0.0.1 - 2018-07-08
### Added
- Initial release.