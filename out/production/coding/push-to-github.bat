@echo off
cd /d "C:\Users\katik\Desktop\coding"
git add .
git commit -m "Daily update - %date%"
git push
pause
