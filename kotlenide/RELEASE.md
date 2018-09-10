# kotlenide 0.0.1 release

[![kotlenide](https://www.bintray.com/docs/images/bintray_badge_color.png)](https://bintray.com/daggerok/daggerok/kotlenide?source=watch)

**build.gradle**

```gradle
repositories {
  mavenCentral()
  // or:
  jcenter()
}

dependencies {
  compile 'com.github.daggerok:kotlenide:0.0.1'
}
```

[![kotlenide](http://maven.apache.org/images/maven-logo-black-on-white.png)](https://maven-badges.herokuapp.com/maven-central/com.github.daggerok/kotlenide)

**pom.xml**

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.github.daggerok</groupId>
      <artifactId>kotlenide</artifactId>
      <version>0.0.1</version>
    </dependency>
  </dependencies>
  
  <!-- only for bintray jcenter repository use cases -->
  <repositories>
    <repository>
      <id>jcentral</id>
      <url>https://jcenter.bintray.com</url>
    </repository>
  </repositories>
</project>
```

## other options

### bintray (user repo) gradle

**build.gradle**

```gradle
repositories {
  maven { url 'https://dl.bintray.com/daggerok/daggerok' }
}

dependencies {
  compile 'com.github.daggerok:kotlenide:0.0.1'
}
```

### bintray (user repo) maven

**pom.xml**

```xml
<project>
  <repositories>
    <repository>
      <id>bintray-daggerok</id>
      <url>https://dl.bintray.com/daggerok/daggerok</url>
    </repository>
  </repositories>
  
  <dependencies>
    <dependency>
      <groupId>com.github.daggerok</groupId>
      <artifactId>kotlenide</artifactId>
      <version>0.0.1</version>
    </dependency>
  </dependencies>
</project>
```
<!--
### jitpack gradle

**build.gradle**

```gradle
repositories {
  maven { url 'https://jitpack.io' }
}

dependencies {
  compile 'com.github.daggerok:kotlenide:0.0.1'
}
```

### jitpack maven

**pom.xml**

```xml
<project>
  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>
  
  <dependencies>
    <dependency>
      <groupId>com.github.daggerok</groupId>
      <artifactId>kotlenide</artifactId>
      <version>0.0.1</version>
    </dependency>
  </dependencies>
<project>
```
-->
