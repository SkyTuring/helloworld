FROM reg.800best.com/bestbase/bestjava:8u1440
VOLUME /tmp
ADD /target/*.jar app.jar
COPY startup.sh /startup.sh
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN bash -c 'touch /app.jar'
CMD ["sh", "/startup.sh"]
EXPOSE 8080