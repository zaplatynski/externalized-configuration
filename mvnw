#!/bin/sh

# Maven wrapper script
MAVEN_VERSION=3.8.6

if [ -z "$MAVEN_OPTS" ]; then
  MAVEN_OPTS="-Xmx1024m"
fi

# Execute Maven with the provided options
exec mvn -s .mvn/settings.xml "$@"