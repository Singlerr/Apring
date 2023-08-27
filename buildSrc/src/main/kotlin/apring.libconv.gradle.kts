import com.github.singlerr.apringframework.CheckStyleUtil

plugins{
    java
    checkstyle
    `maven-publish`

    id("com.github.spotbugs")
}

java{
    withSourcesJar()
    withJavadocJar()
}

repositories{
    mavenCentral()
}

checkstyle{
    config = resources.text.fromString(CheckStyleUtil.getCheckstyleConfig("/checkstyle.xml"))
    maxWarnings = 10
}

tasks.withType<JavaCompile>{

}


publishing{
    publications{
        withType<MavenPublication>{

        }
    }
}
