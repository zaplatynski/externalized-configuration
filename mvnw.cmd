@echo off
setlocal

rem Maven wrapper script for Windows

set MAVEN_HOME=%~dp0\.mvn\wrapper\maven-3.9.0
set MAVEN_OPTS=-Xmx1024m

if not exist "%MAVEN_HOME%\bin\mvn" (
    echo Maven not found. Please install Maven or ensure the wrapper is set up correctly.
    exit /b 1
)

"%MAVEN_HOME%\bin\mvn" %*