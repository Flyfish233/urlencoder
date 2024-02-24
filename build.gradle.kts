plugins {
    id("maven-publish")
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
}

group = "net.thauvin.erik.urlencoder"
version = "1.4.0"

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "net.thauvin.erik.urlencoder"
            artifactId = "urlencoder-lib"
            version = "1.4.0"
        }
    }
}
