# Base kotlin project
This project is the base for any Kotlin project. It contains a series of utilities that let you kick off your project
easily with for example custom publishing to s3, easy fatjar... and so on.

You just need to create a new project with this template and then add the `buildSrc` submodule:

```
git submodule add -b master git@github.com:jdiazcano/buildSrc.git --init
```

Then change the name in the file `settings.gradle` and the project will be ready for writing code!

## Code structure
This project has a different code structure for source/test files and resources. It removes all the useless `main` folders
and now it'll be like

```
project
 |
 |-> src (Base source folder)
 |-> res (Resource folder)
 |-> tst (Base test folder)
 \-> tstres (Test resources)
```

## Helpers
Now you can add a `baseProject()` method into your `build.gradle.kts` and it will add all the normal dependencies that
a project can have.

But that's not the only way, you can customize the gradle files that the project is importing (applying)! For example:

```kotlin
apply(from = Gradles.fatjar)
```

And then you will have a fatjar in your project!, same for the rest. For now, the ones that are supported are:

1. fatjar: Will add the fatjar task in your project
1. javaeight: Will have source compatibility to Java 8
1. publications: Will add the packaging for publishing (you still need to add the `maven-publish` plugin)
1. repositories: Adds basic repositories to the project
1. sourcesets: Now the project sources are going to be like above (src, res, tst, tstres)