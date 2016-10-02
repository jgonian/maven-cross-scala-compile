#!/usr/bin/env bash

RELEASE_PLUGIN="org.apache.maven.plugins:maven-release-plugin:2.5.3"
ARGS="-Dcross-scala-compile -Dscala.compat.version=2.10 -Dscala.version=2.10.5"

#--batch-mode -DreleaseVersion=0.8 -DdevelopmentVersion=0.9-SNAPSHOT

mvn clean install ${ARGS}
mvn ${RELEASE_PLUGIN}:prepare -Darguments=${ARGS}
mvn ${RELEASE_PLUGIN}:perform -Dgoals="deploy" -Darguments=${ARGS}

