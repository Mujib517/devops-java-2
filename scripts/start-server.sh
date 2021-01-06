sudo cp /home/ec2-user/api.service /etc/systemd/system/

sudo systemctl daemon-reload

sudo systemctl start api > log.txt
