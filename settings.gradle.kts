
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
dependencies {
implementation 'com.github.parse-community.Parse-SDK-Android:bolts-tasks:4.3.0'
    }
}

rootProject.name = "GlobalMuslimConnect"
include(":mobile")
include(":automotive")
