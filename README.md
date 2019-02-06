## Maven archetype with various opinionated best-practices enforced

Intended for generation Maven project skeleton for generic Java project.

### Includes
* ban duplicate dependencies
* ensure same transitive dependency version is used by all dependencies
* ensure that every transitive dependency got version not lower that it specified in dependency pom
* ban unused dependencies and used undeclared dependencies
* check for dependencies and plugin updates when built (excluding alpha-, beta- and other non-release versions)
* show JVM internal API usages (via jdeps utility)
* configured tagging for release
* basic .gitignore with some frequent ignores


### Howto
1. Install archetype:
    ```
    mvn install
    ```

2. Generate new project from archetype
    ```
    mvn archetype:generate \
      -DarchetypeGroupId=io.github.sunlaud \
      -DarchetypeArtifactId=java-reasonable-start-app-archetype \
      -DarchetypeVersion=1.0-SNAPSHOT
    ```