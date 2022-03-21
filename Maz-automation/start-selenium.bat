@echo off

pushd %~dp0

echo ***************** Starting selenium server *****************
echo java -Dwebdriver.chrome.driver=chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -port 5555
java -Dwebdriver.chrome.driver=chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -port 5555

:End