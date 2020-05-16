http://localhost:3344/config-dev.yml
http://localhost:3355/configInfo
http://localhost:3366/configInfo

git上配置变更后3344进行广播配置
curl -X POST "http://localhost:3344/actuator/bus-refresh"