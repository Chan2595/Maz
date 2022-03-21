@echo off

echo *************** Killing selenium and java exe drivers ***************

taskkill /f /fi "imagename eq cmd.exe" /fi "WINDOWTITLE eq start-selenium - .\carina-start\start-selenium.bat" /fi "STATUS eq Running"
taskkill /f /fi "imagename eq java.exe" /fi "WINDOWTITLE eq start-selenium - .\carina-start\start-selenium.bat" /fi "STATUS eq Running"
taskkill /F /IM chromedriver.exe /T

exit
:End