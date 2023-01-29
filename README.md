# ElasticView

ElasticView is a JetpackCompose library that will help you add an Elastic Effect for your all kind of widgets



[![Maven Central](https://user-images.githubusercontent.com/30949634/215348156-3c2b1e68-ae89-425c-8c9e-075b2ffd7925.svg)](https://androidweekly.net/issues/issue-555)


<p align="center">
<img src="https://user-images.githubusercontent.com/30949634/202576138-c5f09b7b-bbae-4e7e-8f75-d04657372c01.gif" width="30%" height="30%"/>
<img src="https://user-images.githubusercontent.com/30949634/202575938-5857099e-42bd-4c30-bc8d-54ab6948d174.gif" width="30%" height="30%"/>
<img src="https://user-images.githubusercontent.com/30949634/202575945-d5f8863a-501b-4ed0-9910-f8fb987b968b.gif" width="30%" height="30%"/>
</p>


# Setup

Update your `settings.gradle` file with the following dependency.

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' } // this one
    }
}
```

Update your module level `build.gradle` file with the following dependency.

```groovy
dependencies {
  implementation 'com.github.qamarelsafadi:ElasticView:v0.2'
 }
```

# How to use

You can wrap your widget with `ElasticView` and you can enjoy the effect

```kotlin
ElasticView {
        Text(text = "Hello Android!", modifier = Modifier.align(Alignment.Center))
    }
```


# Find this library useful? ❤️

Star it and Follow me for more content like this 

# Support 
[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://ko-fi.com/qamarasafadi)
