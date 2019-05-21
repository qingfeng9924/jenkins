#基础镜像
FROM openjdk:8
#创建目录
#ENV JAVA_OPTS="-Dspring.profiles.active=test -Denv=fat"
ENV DEFAULT_OPTS="-Dfile.encoding=UTF-8 -Duser.timezone=GMT+8 -Xmx1024m -Xms1024m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/data/logs"
ADD *.jar app.jar

ENV APOLLO_META=""
ENV APOLLO_APP_ID=""
ENV APOLLO_ENV=""
ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java -jar app.jar" ]