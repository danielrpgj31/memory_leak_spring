#/bin/sh

APP_PID=?

for i in $(seq 6); do top -b -H -p $APP_PID -n 1 > app_cpu_usage.`date +%s`.txt; jstack $APP_PID > app_threads.`date +%s`.txt; jcmd $APP_PID VM.native_memory > app_java_memory_usage.`date +%s`.txt; sleep 10; done


