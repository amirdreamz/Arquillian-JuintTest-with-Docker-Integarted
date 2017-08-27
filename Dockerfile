FROM ubuntu
MAINTAINER Ameer Basha <amir@gmail.com>

ENV CATALINA_HOME="/Users/abasha/Downloads/apache-tomcat-9.0.0.M21" \
    PATH="/Users/abasha/Downloads/apache-tomcat-9.0.0.M21/bin:$PATH" \
    TOMCAT_MAJOR_VERSION=9.0.0.M21 \
    TOMCAT_MINOR_VERSION=8.0\
    APACHE_MIRROR="https://archive.apache.org/dist" \
    APR_VERSION=1.5.2 \
    TOMCAT_NATIVE_VERSION=1.2.8
RUN mkdir -p "${CATALINA_HOME}"
WORKDIR $CATALINA_HOME
