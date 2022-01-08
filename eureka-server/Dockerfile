FROM 219.135.209.147:29900/library/jdk8:release
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8
ADD target/*.jar /opt/app.jar

EXPOSE 8761

RUN echo "java -Xms1024m -Xmx2048m  -XX:-UseGCOverheadLimit -jar /opt/app.jar \$1" >/opt/run.sh \
&& chmod 750 /opt/run.sh
ENTRYPOINT ["/bin/sh","-c","/opt/run.sh $0 $@"]