

TIMESTAMP=$(date '+%s')

IMAGE_TAG=dockercheck:$TIMESTAMP
docker build -t $IMAGE_TAG .


docker kill nginx-webapp
docker rm  nginx-webapp
docker run -p 8089:80 --name nginx-webapp -d $IMAGE_TAG
