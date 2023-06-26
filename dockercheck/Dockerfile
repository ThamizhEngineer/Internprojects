FROM nginx:alpine
WORKDIR /usr/share/nginx/html
RUN rm -rf ./*
COPY ./dist/dockercheck/ .
ENTRYPOINT [ "nginx","-g","daemon off;"]
