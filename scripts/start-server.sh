nohup java -jar /home/ubuntu/api-1.0.0.jar > /home/ubuntu/log.txt 2>&1 &
echo $! > /home/ubuntu/pid.file
