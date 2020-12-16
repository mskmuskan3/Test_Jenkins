#!groovy

properties([pipelineTriggers([cron('59 13 * * *')])])


echo "Hello From Push Notification"
