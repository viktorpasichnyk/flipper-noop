# flipper-noop
Library with no-operational Flipper and SoLoader stub classes for Android release builds

![](https://jitpack.io/v/viktorpasichnyk/flipper-noop.svg)
![Contribute](https://img.shields.io/badge/contributions-friendly-b44ac1.svg)

# Getting started
In your `build.gradle`:

```
allprojects {
  repositories {
    ...
    maven { setUrl("https://jitpack.io") }
  }
}
...

dependencies {
  // For debug builds
  debugImplementation("com.facebook.flipper:flipper:0.116.0")
  debugImplementation("com.facebook.flipper:flipper-network-plugin:0.116.0")
  ...
  // Here add dependencies for needed flipper plugins
  ...
  debugImplementation("com.facebook.soloader:soloader:0.10.1")


  // For release builds
  releaseImplementation("com.github.viktorpasichnyk:flipper-noop:1.0.0")
}
```

Initialize Flipper in your `onCreate` method in `Application` class:

```
override fun onCreate() {
  super.onCreate()
  
  SoLoader.init(context, false)
  
  if (BuildConfig.DEBUG) {
      val client = AndroidFlipperClient.getInstance(context)
      client.addPlugin((NetworkFlipperPlugin())
      ...
      // Add other Flipper plugins
      ...
      client.start()
  }
}
```
