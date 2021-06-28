plugins {
  id("otel.library-instrumentation")
}

dependencies {
  implementation(project(":instrumentation:servlet:servlet-common:library"))
  implementation(project(":instrumentation:servlet:servlet-javax-common:library"))

  compileOnly("org.springframework:spring-webmvc:3.1.0.RELEASE")
  compileOnly("javax.servlet:javax.servlet-api:3.1.0")
}
