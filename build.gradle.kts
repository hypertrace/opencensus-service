plugins {
  id("org.hypertrace.repository-plugin") version "0.1.2"
  id("org.hypertrace.ci-utils-plugin") version "0.1.1"
  id("org.hypertrace.docker-plugin") version "0.8.0"
  id("org.hypertrace.docker-publish-plugin") version "0.8.0"
}

group = "org.hypertrace.collector"

hypertraceDocker {
  defaultImage {
    imageName.set("hypertrace-oc-collector")
    dockerFile.set(file("cmd/occollector/Dockerfile"))
  }
}



