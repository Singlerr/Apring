plugins{
    java
    checkstyle

    id("com.github.spotbugs")
}

repositories{
    mavenCentral()
}

checkstyle{
    config = resources.text.fromString(com.github.singlerr.apringframework.CheckStyleUtil.getCheckstyleConfig("/checkstyle.xml"))
    maxWarnings = 10
}

tasks.withType<JavaCompile>{

}