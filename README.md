# flipper-noop
Library with no-operational Flipper and SoLoader stub classes for Android release builds

# Getting started

In your build.gradle:

```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
...

dependencies {
    // For debug builds
    debugImplementation "com.facebook.flipper:flipper:0.116.0"
    debugImplementation "com.facebook.flipper:flipper-network-plugin:0.116.0"
    ...
    // Here add dependencies for needed flipper plugins
    ...
    debugImplementation 'com.facebook.soloader:soloader:0.10.1'


    // For release builds
    releaseImplementation(com.github.viktorpasichnyk:flipper-noop:1.0.0)
}

```
