## Maven archetype with various opinionated best-practices enforced

Intended for generation Maven project skeleton for generic Java project with some batteries included.


### Included batteries

* ##### Code style:
    * a reasonable non-obtrusive checkstyle config (mostly Sun coding conventions with some tweaks)
    * code style config for IDE(s) set up to comply with checkstyle rules (as of now only for IntelliJ IDEA)

* ##### Maven best practices enforced:
    * ban duplicate dependencies
    * ensure same transitive dependency version is used by all dependencies (dependency convergence)
    * ensure that every transitive dependency got version not lower that it specified in dependency pom
    * ban unused dependencies and used undeclared dependencies
    * compiler plugin configured to fail on warnings
    * detect JDK internal API usages (via jdeps utility) and fail build if any found

* ##### Other Maven goodies:
    * versions plugin configred to exclude alpha-, beta- and other non-release versions when checking for updates
    * check for dependencies and plugin updates when built (a bit controversial but easy to turn off)
    * configured tagging for release plugin

* ##### Misc:
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

#### Next steps in generated project (optional)

* Update dependencies to latest versions (this will omit alpha-, beta- and other non-release versions):
    ```
    mvn versions:use-latest-releases versions:update-properties
    ```
    Note: by default check for new dependencies and plugin versions is performed each time project is built.
    If this is not desired, remove plugin invocation from build and check for updates manually using:
    ```
    mvn versions:display-plugin-updates versions:display-property-updates versions:display-dependency-updates
    ```
* Import code style config (located in `build-config` dir) into IDE
* Install checksyle plugin for IDE and import checkstyle config (located in `build-config` dir)
* Show build phases (using buildplan-maven-plugin)
    ```
    mvn fr.jcgay.maven.plugins:buildplan-maven-plugin:list
    ```

### Development

Project contains an integration test which generates maven project from archetype.
Generated project is placed in 'target/test-classes/projects/test-project/' directory.


### TODO
* multimodule project
