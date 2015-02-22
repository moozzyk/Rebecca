@echo off
echo Running doxygen
call doxy_api.bat
call doxy_java_api.bat
call doxy_csharp_api.bat
call doxy_python_api.bat
call doxy_api+framework.bat
call doxy_api+framework+samples.bat
call doxy_api+samples.bat
