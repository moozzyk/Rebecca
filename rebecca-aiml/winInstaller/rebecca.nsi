;Frank Hassanabad
;RebeccaAIML installer
;2007

;--------------------------------
;Include Modern UI
  !include "MUI.nsh"
;--------------------------------

;--------------------------------
;Include The Text Functions Header
    !include "TextFunc.nsh"
    !insertmacro ConfigWrite
;--------------------------------

;General

  ;Name and file
  Name "RebeccaAIML"

  ;Output the installer in the same
  ;directory as our .nsi config file
  OutFile "RebeccaAIML.exe"

  ;Default installation folder
  InstallDir "$PROGRAMFILES\RebeccaAIML"

  ;Get installation folder from registry if available
  InstallDirRegKey HKCU "Software\RebeccaAIML" ""
;--------------------------------
;Variables
  Var MUI_TEMP
  Var STARTMENU_FOLDER
  Var RO
  Var startServer
;--------------------------------
;Interface Settings
  !define MUI_ABORTWARNING
  !define MUI_ICON "${REBECCA_HOME}\winInstaller\graphics\package-x-generic.ico"
  !define MUI_UNICON "${REBECCA_HOME}\winInstaller\graphics\package-x-generic.ico"
  !define MUI_WELCOMEFINISHPAGE_BITMAP "${REBECCA_HOME}\winInstaller\graphics\270.bmp"
  !define MUI_UNWELCOMEFINISHPAGE_BITMAP "${REBECCA_HOME}\winInstaller\graphics\270.bmp"
  !define REBECCA_HOME c:\rebecca
  !define QTDIR "C:\Qt\4.2.3"
  !define VERSION 1.1tp3
#  !define MUI_COMPONENTSPAGE_SMALLDESC
#todo put something cool here
#  !define MUI_WELCOMEPAGE_TEXT ""
;--------------------------------
;Pages

  !insertmacro MUI_PAGE_WELCOME
  !insertmacro MUI_PAGE_LICENSE "${REBECCA_HOME}\license.txt"
  !insertmacro MUI_PAGE_COMPONENTS
  !insertmacro MUI_PAGE_DIRECTORY

  ;Start Menu Folder Page Configuration
  !define MUI_STARTMENUPAGE_REGISTRY_ROOT "HKCU"
  !define MUI_STARTMENUPAGE_REGISTRY_KEY "Software\RebeccaAIML"
  !define MUI_STARTMENUPAGE_REGISTRY_VALUENAME "Start Menu Folder"
  !insertmacro MUI_PAGE_STARTMENU Application $STARTMENU_FOLDER

  !insertmacro MUI_PAGE_INSTFILES
  !insertmacro MUI_PAGE_FINISH

  !insertmacro MUI_UNPAGE_WELCOME
  !insertmacro MUI_UNPAGE_CONFIRM
  !insertmacro MUI_UNPAGE_INSTFILES
  !insertmacro MUI_UNPAGE_FINISH
;--------------------------------
;Languages
  !insertmacro MUI_LANGUAGE "English"
;--------------------------------

;
;Installer Sections
;

;Hidden section to ensure the VS 2005 redistributable is installed
Section "-VS 2005 redistributable not an option"
    Call vs2005Redistributable
SectionEnd

;Hidden section to ensure the uninstaller is installed
Section "-Uninstall options"
    Call uninstaller                                    ;install the uninstaller
    WriteRegStr HKCU "Software\RebeccaAIML" "" $INSTDIR ;Store installation folder
    !insertmacro MUI_STARTMENU_WRITE_BEGIN Application 
        Call uninstallerShortCuts                       ;install the uninstall shortcuts
    !insertmacro MUI_STARTMENU_WRITE_END
    Call packageIcon                                    ;install the package icon for the add/remove program icon
    Call addRemove                                      ;Write the registry sections for the add/remove
SectionEnd

;The networking section
SectionGroup "Networking" SecNetworking
    ;Install the server
    Section "Server" SecCore
        Call aimlSets                          ;Install the AIML set(s)
        Call confDirectory                     ;Install the config directory
        Call resourcesDirectory                ;Install the resources directory
        Call cppDllsNetwork                    ;Install the networking files
        Call rebeccaServer                     ;Install the rebecca-server executable

        ;We set this to true so at the end of the sections
        ;in the section "-Fire up the Server" we actually
        ;start up the server. If we tried to start the server
        ;now it would lock serveral files and we would end up
        ;having windows file lock problems from potential other
        ;sections trying to write on top of files more than once
        StrCpy $startServer "true"
        
        ;Create shortcut for the server to turn it on, turn it off
        ;restart it
        !insertmacro MUI_STARTMENU_WRITE_BEGIN Application
            Call icons
            Call serverShortCuts
        !insertmacro MUI_STARTMENU_WRITE_END
    SectionEnd
    
    ;The networking programming languages
    SectionGroup "languages" SecNetworkingLanguages
        ;Installs the C++ networking files
        Section "C++" SecNetworkingCpp
            Call cppNetworkHeaders ;Install all the C++ network header files required
            Call cppDllsNetwork    ;Install all the C++ dll's required
            Call cppLibsNetwork    ;Install all the .lib files required
            Call clientConfigFile  ;Install the client config readme file
        SectionEnd

        ;Installs the Java networking files
        Section "Java" SecNetworkingJava
            Call javaFilesNetworking ;Install the java networking files
            Call clientConfigFile    ;Install the client config readme file
        SectionEnd

        ;Installs the C# networking files
        Section "C#" SecNetworkingCsharp
            Call csharpFilesNetworking ;Install the C# networking files
            Call clientConfigFile      ;Install the client config readme file
        SectionEnd

        ;Installs the python networking files
        Section "Python" SecNetworkingPython
            Call pythonFilesNetworking ;Install the python networking files
            Call clientConfigFile      ;Install the client config readme file
        SectionEnd
    SectionGroupEnd
    
    ;The networking samples
    SectionGroup "samples" SecNetworkingSamples
        ;Installs the C++ networking samples
        SectionGroup "C++" SecNetworkingSamplesCpp
            ;Installs the rs-admin sample 
            Section "rs-admin" SecAdminToolsRsAdmin
                Call cppNetworkHeaders ;Install all the C++ network header files required
                Call cppDllsNetwork    ;Install all the C++ dll's required
                Call cppLibsNetwork    ;Install all the .lib files required
                Call rsadminExecutable ;Install the rs-admin.exe file
                Call clientConfigFile  ;Install the client config readme file
                Call rsadminSourceCode ;Install the rs-admin source code
                Call rsadminShortCuts  ;Create the shorcuts for the rs-admin sample
            SectionEnd

            ;The networking console sample
            Section "console" SecNetworkingSamplesConsoleCpp
                Call cppNetworkHeaders           ;Install all the C++ network header files required
                Call cppDllsNetwork              ;Install all the C++ dll's required
                Call cppLibsNetwork              ;Install all the .lib files required
                Call clientConfigFile            ;Install the client config readme file
                Call cppConsoleNetworkExecutable ;Install the C++ network console executable
                Call cppConsoleNetworkSourceCode ;Install the C++ network console source code
                Call cppConsoleNetworkShortCuts  ;Install the C++ network console shortcuts
            SectionEnd

            ;The networking console sample with callbacks
            Section "consoleCallBacks" SecNetworkingSamplesConsoleCallBacksCpp
                Call cppNetworkHeaders                    ;Install all the C++ network header files required
                Call cppDllsNetwork                       ;Install all the C++ dll's required
                Call cppLibsNetwork                       ;Install all the .lib files required
                Call clientConfigFile                     ;Install the client config readme file
                Call cppConsoleCallBacksNetworkExecutable ;Install the C++ network console callbacks executable
                Call cppConsoleCallBacksNetworkSourceCode ;Install the C++ network console callbacks source code
                Call cppConsoleCallBacksNetworkShortCuts  ;Install the C++ network console callbacks shortcuts
            SectionEnd
        SectionGroupEnd

        ;Installs the Java networking samples
        SectionGroup "Java" SecNetworkingSamplesJava
            ;Installs the console networking samples
            Section "console" SecNetworkingSamplesConsoleJava
                Call javaFilesNetworking          ;Install the java networking files
                Call clientConfigFile             ;Install the client config readme file
                Call javaConsoleNetworkSourceCode ;Install the java console network source code
                Call javaConsoleNetworkJar        ;Install the java console network jar
                Call javaConsoleNetworkShortCuts  ;Install the java console network shortcuts
            SectionEnd
            
            ;Installs the console networking sample with callbacks
            Section "consoleCallBacks" SecNetworkingSamplesConsoleCallBacksJava
                Call javaFilesNetworking                   ;Install the java networking files
                Call clientConfigFile                      ;Install the client config readme file
                Call javaConsoleCallBacksNetworkSourceCode ;Install the java console network source code
                Call javaConsoleCallBacksNetworkJar        ;Install the java console network jar
                Call javaConsoleCallBacksNetworkShortCuts  ;Install the java console network shortcuts
            SectionEnd
        SectionGroupEnd

        ;Installs the C# networking samples
        SectionGroup "C#" SecNetworkingSamplesCsharp 
            ;Installs the C# console networking sample
            Section "console" SecNetworkingSamplesConsoleCsharp
                Call cSharpFilesNetworking          ;Install the C# networking files
                Call clientConfigFile               ;Install the C# config readme file
                Call cSharpConsoleNetworkSourceCode ;Install the C# console network source code
                Call cSharpConsoleNetworkExecutable ;Install the C# console network dll
                Call cSharpConsoleNetworkShortCuts  ;Install the C# console network shortcuts
            SectionEnd

            ;Installs the C# console CallBacks networking sample
            Section "consoleCallBacks" SecNetworkingSamplesConsoleCallBacksCsharp
                Call cSharpFilesNetworking                   ;Install the C# networking files
                Call clientConfigFile                        ;Install the C# config readme file
                Call cSharpConsoleCallBacksNetworkSourceCode ;Install the C# console callback network source code
                Call cSharpConsoleCallBacksNetworkExecutable ;Install the C# console callback network dll
                Call cSharpConsoleCallBacksNetworkShortCuts  ;Install the C# console callback network shortcuts
            SectionEnd
        SectionGroupEnd

        ;Installs the python networking samples
        SectionGroup "Python" SecNetworkingSamplesPython
            ;Installs the console networking sample
            Section "console" SecNetworkingSamplesConsolePython
                Call pythonFilesNetworking          ;Install the python networking files
                Call clientConfigFile               ;Install the python config readme file
                Call pythonConsoleNetworkSourceCode ;Install the python console network source code
                Call pythonConsoleNetworkScript     ;Install the python console network dll
                Call pythonConsoleNetworkShortCuts  ;Install the python console network shortcuts
            SectionEnd

            ;Installs the python CallBacks networking sample
            Section "consoleCallBacks" SecNetworkingSamplesConsoleCallBacksPython
                Call pythonFilesNetworking                   ;Install the python networking files
                Call clientConfigFile                        ;Install the python config readme file
                Call pythonConsoleCallBacksNetworkSourceCode ;Install the python console network source code
                Call pythonConsoleCallBacksNetworkScript     ;Install the python console network dll
                Call pythonConsoleCallBacksNetworkShortCuts  ;Install the python console network shortcuts
            SectionEnd
        SectionGroupEnd
    SectionGroupEnd
SectionGroupEnd

SectionGroup "Embedded" SecEmbedded
    ;All the embedded programming languages that can
    ;directly write server's and clients without the
    ;use of a server
    SectionGroup "languages" SecEmbeddedLanguages
        Section "C++" SecEmbdeddedLanguagesCpp     ;The C++ embedded programming language
            Call cppHeaders                        ;The include files except for networking ones
            Call cppDlls                           ;Install all the C++ dll's required
            Call cppLibs                           ;Installs the c++ libs required
            Call confDirectory                     ;Install the config directory
            Call resourcesDirectory                ;Install the resources directory
    SectionEnd
    SectionGroupEnd
    
    ;Samples section of all the embedded programming languages
    SectionGroup "samples" SecEmbeddedSamples
        ;Installs the C++ embedded samples
        SectionGroup "C++" SecEmbeddedSamplesCpp
            ;Install the embedded console sample
            Section "console" SecEmbeddedSamplesConsole
                Call aimlSets             ;Install the AIML set(s)
                Call cppHeaders           ;Install all the C++ header files required
                Call cppDlls              ;Install all the C++ dll's required
                Call cppLibs              ;Install all the .lib files required
                Call cppConsoleExecutable ;Install the C++ console executable
                Call cppConsoleSourceCode ;Install the C++ console source code
                Call cppConsoleShortCuts  ;Install the C++ console shortcuts
            SectionEnd

            ;Install the embedded qt gui sample
            Section "qtgui" SecEmbeddedSamplesQT
                Call aimlSets        ;Install the AIML set(s)
                Call cppHeaders      ;Install all the C++ header files required
                Call cppDlls         ;Install all the C++ dll's required
                Call cppLibs         ;Install all the .lib files required
                Call qtDlls          ;Install the qt dependency dll's
                Call qtguiExecutable ;Install the qtgui executable
                Call qtguiSourceCode ;Install the qtgui source code
                Call qtguiShortCuts  ;Install the qtgui shortcuts
            SectionEnd
        SectionGroupEnd
    SectionGroupEnd
SectionGroupEnd

;Install all the documentation for RebeccaAIML
SectionGroup "Documentation" SecDocumentation
    Section "User's Guide" SecUserGuide
       Call documentation          ;Installs the documentation
       Call documentationShortCuts ;Installs the web site shortcuts
    SectionEnd

    ;Install the C++ documentation for both network and embedded
    Section "C++" SecDocumentationCpp
        Call cppDocumentation          ;Install the documentation
        Call cppDocumentationShortCuts ;Install the documentation shortcuts
    SectionEnd

    Section "Java" SecDocumentationJava
        Call javaDocumentation          ;Install the documentation
        Call javaDocumentationShortCuts ;Install the documentation shortcuts
    SectionEnd

    Section "C#" SecDocumentationCsharp
        Call csharpDocumentation           ;Install the documentation
        Call csharpDocumentationShortCuts ;Install the documentation
    SectionEnd

    Section "Python" SecDocumentationPython
        Call pythonDocumentation           ;Install the documentation
        Call pythonDocumentationShortCuts  ;Install the documentation
    SectionEnd
SectionGroupEnd

;Hidden section to ensure the base files are installed
Section "-Base files"
  Call baseFiles          ;Install the base files
  Call baseFilesShortCuts ;Install shortcuts to the base files
SectionEnd

;Hidden section to start the rebecca server service
;if neccessary
Section "-Fire up the Server"
    Call startTheServer
SectionEnd

;Opens as a last step the web page about
;this version
Section "-Open RebeccaAIML web page"
    Call openWebPage
SectionEnd

;--------------------------------
;Functions

;Opens a rebeccaAIML web page that tells the user
;the current state of the version as well as if there's
;a more recent version available.
Function openWebPage
; TODO put this back once everything is finished
    ExecShell "open" "http://rebecca-aiml.sourceforge.net/"
FunctionEnd

;Install the qtgui executable
Function qtguiExecutable 
    SetOutPath $INSTDIR\bin\cpp
    file ${REBECCA_HOME}\bin\cpp\qtgui.exe
FunctionEnd

;Install the qtgui source code
Function qtguiSourceCode 
    SetOutPath $INSTDIR\src\samples\qtgui
    file ${REBECCA_HOME}\src\samples\qtgui\AIMLEngine.cpp
    file ${REBECCA_HOME}\src\samples\qtgui\AIMLEngine.h
    file ${REBECCA_HOME}\src\samples\qtgui\AIMLEngineThread.cpp
    file ${REBECCA_HOME}\src\samples\qtgui\AIMLEngineThread.h
    file ${REBECCA_HOME}\src\samples\qtgui\Arguments.h
    file ${REBECCA_HOME}\src\samples\qtgui\CustomTextEdit.h
    file ${REBECCA_HOME}\src\samples\qtgui\main.cpp
    file ${REBECCA_HOME}\src\samples\qtgui\MainWindow.cpp
    file ${REBECCA_HOME}\src\samples\qtgui\MainWindow.h
    file ${REBECCA_HOME}\src\samples\qtgui\QtGuiCallBacks.h
    file ${REBECCA_HOME}\src\samples\qtgui\README.txt
    file ${REBECCA_HOME}\src\samples\qtgui\qtgui.pro
    file ${REBECCA_HOME}\src\samples\qtgui\qmake_proj.bat
FunctionEnd

;Install the qtgui shortcuts
Function qtguiShortCuts
    SetOutPath $INSTDIR\bin\cpp
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\qtgui"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\qtgui\qtgui.lnk" \
                    "$INSTDIR\bin\cpp\qtgui.exe" \
                    "" \
                    "$INSTDIR\bin\cpp\qtgui.exe" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the embedded qtgui sample"
    SetOutPath $INSTDIR\src\samples\qtgui
    ;Shortcut to the qmake_proj
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\qtgui\create VS 2005 solution.lnk" \
                    "$INSTDIR\src\samples\qtgui\qmake_proj.bat" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Calls qmake to create VS 2005 solution"
    ;Shortcut to the VS project
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\qtgui\qtgui VS 2005 Solution.lnk" \
                    "$INSTDIR\src\samples\qtgui\qtgui.vcproj" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Opens Visual Studio solution"
FunctionEnd

;Install the qt dependency dll's
Function qtDlls
    SetOutPath $INSTDIR\bin\cpp
    file ${QTDIR}\lib\QtCore4.dll
    file ${QTDIR}\lib\QtGui4.dll
FunctionEnd

;Install the C++ console executable
Function cppConsoleExecutable 
    SetOutPath $INSTDIR\bin\cpp
    file ${REBECCA_HOME}\bin\cpp\console.exe
FunctionEnd

;Install the C++ console source code
Function cppConsoleSourceCode 
    SetOutPath $INSTDIR\src\samples\console
    file ${REBECCA_HOME}\src\samples\console\console.cpp
    file ${REBECCA_HOME}\src\samples\console\console.sln
    file ${REBECCA_HOME}\src\samples\console\console.vcproj
    file ${REBECCA_HOME}\src\samples\console\README.txt
FunctionEnd

;Install the C++ console shortcuts
Function cppConsoleShortCuts  
    SetOutPath $INSTDIR\bin\cpp
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\console"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\console\console.lnk" \
                    "$INSTDIR\bin\cpp\console.exe" \
                    "" \
                    "$INSTDIR\bin\cpp\console.exe" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the embedded console sample"
    ;Shortcut to the VS solution
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\console\console VS 2005 Solution.lnk" \
                    "$INSTDIR\src\samples\console\console.sln" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Opens Visual Studio solution"
FunctionEnd

;Install the python console callbacks network source code
Function pythonConsoleCallBacksNetworkSourceCode
    SetOutPath $INSTDIR\src\samples\network\python\consoleCallBacks
    file ${REBECCA_HOME}\src\samples\network\python\consoleCallBacks\consoleCallBacks.py
    file ${REBECCA_HOME}\src\samples\network\python\consoleCallBacks\customCallBacks.py
    file ${REBECCA_HOME}\src\samples\network\python\consoleCallBacks\copy_pythonFiles.bat
    file ${REBECCA_HOME}\src\samples\network\python\consoleCallBacks\README.txt
FunctionEnd

;Install the python console callbacks network scripts
Function pythonConsoleCallBacksNetworkScript     
    setOutPath $INSTDIR\bin\python
    file ${REBECCA_HOME}\bin\python\consoleCallBacks.py
    file ${REBECCA_HOME}\bin\python\customCallBacks.py
FunctionEnd

;Install the python console callbacks network shortcuts
Function pythonConsoleCallBacksNetworkShortCuts  
    SetOutPath $INSTDIR\bin\python
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\python\consoleCallBacks"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\python\consoleCallBacks\consoleCallBacks.lnk" \
                    "$INSTDIR\bin\python\consoleCallBacks.bat" \
                    "$\"$INSTDIR\aiml\annotated_alice$\" --Ice.Config=$\"$INSTDIR\conf\clientconfig.properties$\"" \
                    "$INSTDIR\bin\python\consoleCallBacks.bat" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the console callbacks network sample"
    ;Shortcut to the python file
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\python\consoleCallBacks\consoleCallBacks.py.lnk" \
                    "$INSTDIR\src\samples\network\python\consoleCallBacks\consoleCallBacks.py" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Shortcut to the callbacks python file"
    ;Shortcut to the python file
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\python\consoleCallBacks\customCallBacks.py.lnk" \
                    "$INSTDIR\src\samples\network\python\consoleCallBacks\customCallBacks.py" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Shortcut to the custom callbacks python file"
    ;Shortcut to copy the python file
    SetOutPath $INSTDIR\src\samples\network\python\consoleCallBacks
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\python\consoleCallBacks\copy python files to bin.lnk" \
                    "$INSTDIR\src\samples\network\python\consoleCallBacks\copy_pythonFiles.bat" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Copies the python files to the bin directory"
FunctionEnd

;Install the python console network source code
Function pythonConsoleNetworkSourceCode
    SetOutPath $INSTDIR\src\samples\network\python\console
    file ${REBECCA_HOME}\src\samples\network\python\console\console.py
    file ${REBECCA_HOME}\src\samples\network\python\console\copy_pythonFiles.bat
    file ${REBECCA_HOME}\src\samples\network\python\console\README.txt
FunctionEnd

;Install the python console network dll
Function pythonConsoleNetworkScript
    setOutPath $INSTDIR\bin\python
    file ${REBECCA_HOME}\bin\python\console.py
FunctionEnd

;Install the python console network shortcuts
Function pythonConsoleNetworkShortCuts
    SetOutPath $INSTDIR\bin\python
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\python\console"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\python\console\console.lnk" \
                    "$INSTDIR\bin\python\console.bat" \
                    "" \
                    "$INSTDIR\bin\python\console.bat" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the console network sample"
    ;Shortcut to the python file
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\python\console\console.py.lnk" \
                    "$INSTDIR\src\samples\network\python\console\console.py" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Shortcut to the python file"
    ;Shortcut to the python file
    SetOutPath $INSTDIR\src\samples\network\python\console
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\python\console\copy console.py to bin.lnk" \
                    "$INSTDIR\src\samples\network\python\console\copy_pythonFiles.bat" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Copies the python file to the bin directory"
FunctionEnd

;Install the C# console callbacks network source code
Function cSharpConsoleCallBacksNetworkSourceCode
    SetOutPath $INSTDIR\src\samples\network\csharp\consoleCallBacks
    file ${REBECCA_HOME}\src\samples\network\csharp\consoleCallBacks\ConsoleCallBacks.cs
    file ${REBECCA_HOME}\src\samples\network\csharp\consoleCallBacks\CustomCallBacks.cs
    file ${REBECCA_HOME}\src\samples\network\csharp\consoleCallBacks\README.txt
    file ${REBECCA_HOME}\src\samples\network\csharp\consoleCallBacks\consoleCallBacks.sln
    file ${REBECCA_HOME}\src\samples\network\csharp\consoleCallBacks\consoleCallBacks-cs.csproj
    file /r /X CVS ${REBECCA_HOME}\src\samples\network\csharp\consoleCallBacks\Properties
FunctionEnd

;Install the C# console network dll
Function cSharpConsoleCallBacksNetworkExecutable
    setOutPath $INSTDIR\bin\csharp
    file ${REBECCA_HOME}\bin\csharp\consoleCallBacks-cs.exe
FunctionEnd

;Install the C# console network shortcuts
Function cSharpConsoleCallBacksNetworkShortCuts
    SetOutPath $INSTDIR\bin\csharp
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\csharp\consoleCallBacks"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\csharp\consoleCallBacks\consoleCallBacks.lnk" \
                    "$INSTDIR\bin\csharp\consoleCallBacks-cs.exe" \
                    "$\"$INSTDIR\aiml\annotated_alice$\" --Ice.Config=$\"$INSTDIR\conf\clientconfig.properties$\"" \
                    "$INSTDIR\bin\csharp\consoleCallBacks-cs.exe" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the console callbacks network sample"
    ;Shortcut to the VS solution
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\csharp\consoleCallBacks\console callbacks network VS 2005 Solution.lnk" \
                    "$INSTDIR\src\samples\network\csharp\consoleCallBacks\consoleCallBacks.sln" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Opens Visual Studio solution"
FunctionEnd

;Install the C# console network source code
Function cSharpConsoleNetworkSourceCode 
    SetOutPath $INSTDIR\src\samples\network\csharp\console
    file ${REBECCA_HOME}\src\samples\network\csharp\console\Console.cs
    file ${REBECCA_HOME}\src\samples\network\csharp\console\README.txt
    file ${REBECCA_HOME}\src\samples\network\csharp\console\console.sln
    file ${REBECCA_HOME}\src\samples\network\csharp\console\console-cs.csproj
    file /r /X CVS ${REBECCA_HOME}\src\samples\network\csharp\console\Properties
FunctionEnd

;Install the C# console network dll
Function cSharpConsoleNetworkExecutable
    setOutPath $INSTDIR\bin\csharp
    file ${REBECCA_HOME}\bin\csharp\console-cs.exe
FunctionEnd

;Install the C# console network shortcuts
Function cSharpConsoleNetworkShortCuts  
    SetOutPath $INSTDIR\bin\csharp
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\csharp\console"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\csharp\console\console.lnk" \
                    "$INSTDIR\bin\csharp\console-cs.exe" \
                    "" \
                    "$INSTDIR\bin\csharp\console-cs.exe" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the console network sample"
    ;Shortcut to the VS solution
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\csharp\console\console network VS 2005 Solution.lnk" \
                    "$INSTDIR\src\samples\network\csharp\console\console.sln" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Opens Visual Studio solution"
FunctionEnd

;Installs the Java Console CallBacks network jars
Function javaConsoleCallBacksNetworkJar
    SetOutPath $INSTDIR\bin\java
    file ${REBECCA_HOME}\bin\java\consoleCallBacks.jar
    file ${REBECCA_HOME}\bin\java\consoleCallBacks.bat
FunctionEnd

;Installs the Java Console CallBacks network files
Function javaConsoleCallBacksNetworkSourceCode
    SetOutPath $INSTDIR\src\samples\network\java\consoleCallBacks
    file ${REBECCA_HOME}\src\samples\network\java\consoleCallBacks\ConsoleCallBacks.java
    file ${REBECCA_HOME}\src\samples\network\java\consoleCallBacks\CustomCallBacks.java
    file ${REBECCA_HOME}\src\samples\network\java\consoleCallBacks\README.txt
    file ${REBECCA_HOME}\src\samples\network\java\consoleCallBacks\build.xml
    file ${REBECCA_HOME}\src\samples\network\java\consoleCallBacks\build.bat
FunctionEnd

;Installs the java console callbacks network shortcuts
Function javaConsoleCallBacksNetworkShortCuts
    SetOutPath $INSTDIR\bin\java
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\java\consoleCallBacks"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\java\consoleCallBacks\consoleCallBacks.lnk" \
                    "$INSTDIR\bin\java\consoleCallBacks.bat" \
                    "$\"$INSTDIR\aiml\annotated_alice$\" --Ice.Config=$\"$INSTDIR\conf\clientconfig.properties$\"" \
                    "$INSTDIR\bin\java\ConsoleCallBacks.bat" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the console callbacks network sample"
    ;Shortcut to the java source code
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\java\consoleCallBacks\ConsoleCallBacks.java.lnk" \
                    "$INSTDIR\src\samples\network\java\consoleCallBacks\ConsoleCallBacks.java" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "The Java Console CallBacks Source Code"
    ;Shortcut to the java source code
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\java\consoleCallBacks\CustomCallBacks.java.lnk" \
                    "$INSTDIR\src\samples\network\java\consoleCallBacks\CustomCallBacks.java" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "The Java Custom CallBacks Source Code"
    ;Shortcut to ant build the code
    SetOutPath $INSTDIR\src\samples\network\java\consoleCallBacks
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\java\consoleCallBacks\build using ant.lnk" \
                    "$INSTDIR\src\samples\network\java\consoleCallBacks\build.bat" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Build the source code using ant"
FunctionEnd

;Installs the java console network shortcuts
Function javaConsoleNetworkShortCuts
    SetOutPath $INSTDIR\bin\java
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\java\console"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\java\console\console.lnk" \
                    "$INSTDIR\bin\java\console.bat" \
                    "" \
                    "$INSTDIR\bin\java\Console.bat" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the console network sample"
    ;Shortcut to the java source code 
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\java\console\Console.java.lnk" \
                    "$INSTDIR\src\samples\network\java\console\Console.java" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "The Java Console Source Code"
    ;Shortcut to ant build the code
    SetOutPath $INSTDIR\src\samples\network\java\console
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\java\console\build using ant.lnk" \
                    "$INSTDIR\src\samples\network\java\console\build.bat" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Build the source code using ant"
FunctionEnd

;Installs the Java Console network jars
Function javaConsoleNetworkJar
    SetOutPath $INSTDIR\bin\java
    file ${REBECCA_HOME}\bin\java\console.jar
    file ${REBECCA_HOME}\bin\java\console.bat
FunctionEnd

;Installs the Java Console network files
Function javaConsoleNetworkSourceCode
    SetOutPath $INSTDIR\src\samples\network\java\console
    file ${REBECCA_HOME}\src\samples\network\java\console\Console.java
    file ${REBECCA_HOME}\src\samples\network\java\console\README.txt
    file ${REBECCA_HOME}\src\samples\network\java\console\build.xml
    file ${REBECCA_HOME}\src\samples\network\java\console\build.bat
FunctionEnd

;Installs the C++ network console callbacks executable
Function cppConsoleCallBacksNetworkExecutable
    SetOutPath $INSTDIR\bin\cpp
    file ${REBECCA_HOME}\bin\cpp\consoleCallBacks-network.exe
FunctionEnd

;Installs the C++ network console callbacks source code
Function cppConsoleCallBacksNetworkSourceCode 
    SetOutPath $INSTDIR\src\samples\network\cpp\consoleCallBacks
    file ${REBECCA_HOME}\src\samples\network\cpp\consoleCallBacks\consoleCallBacks-network.cpp
    file ${REBECCA_HOME}\src\samples\network\cpp\consoleCallBacks\consoleCallBacks-network.sln
    file ${REBECCA_HOME}\src\samples\network\cpp\consoleCallBacks\CustomCallBacks.h
    file ${REBECCA_HOME}\src\samples\network\cpp\consoleCallBacks\consoleCallBacks-network.vcproj
    file ${REBECCA_HOME}\src\samples\network\cpp\consoleCallBacks\README.txt
FunctionEnd

;Installs the C++ network console callbacks shortcuts
Function cppConsoleCallBacksNetworkShortCuts  
    SetOutPath $INSTDIR\bin\cpp
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\consoleCallBacks-network"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\consoleCallBacks-network\console callbacks network.lnk" \
                    "$INSTDIR\bin\cpp\consoleCallBacks-network.exe" \
                    "$\"$INSTDIR\aiml\annotated_alice$\" --Ice.Config=$\"$INSTDIR\conf\clientconfig.properties$\"" \
                    "$INSTDIR\bin\cpp\consoleCallBacks-network.exe" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the console callbacks network sample"
    ;Shortcut to the VS solution
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\consoleCallBacks-network\console callbacks network VS 2005 Solution.lnk" \
                    "$INSTDIR\src\samples\network\cpp\consoleCallBacks\consoleCallBacks-network.sln" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Opens Visual Studio solution"
FunctionEnd

;Installs the c++ console network executable
Function cppConsoleNetworkExecutable
    SetOutPath $INSTDIR\bin\cpp
    file ${REBECCA_HOME}\bin\cpp\console-network.exe
FunctionEnd

;Installs the C++ console network files
Function cppConsoleNetworkSourceCode
    SetOutPath $INSTDIR\src\samples\network\cpp\console
    file ${REBECCA_HOME}\src\samples\network\cpp\console\console-network.cpp
    file ${REBECCA_HOME}\src\samples\network\cpp\console\console-network.sln
    file ${REBECCA_HOME}\src\samples\network\cpp\console\console-network.vcproj
    file ${REBECCA_HOME}\src\samples\network\cpp\console\README.txt
FunctionEnd

;Installs the C++ console network shortcuts
Function cppConsoleNetworkShortCuts
    SetOutPath $INSTDIR\bin\cpp
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\console-network"
    ;Shortcut to the executable to run
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\console-network\console network.lnk" \
                    "$INSTDIR\bin\cpp\console-network.exe" \
                    "" \
                    "$INSTDIR\bin\cpp\console-network.exe" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Runs the console network sample"
    ;Shortcut to the VS solution
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\console-network\console network VS 2005 Solution.lnk" \
                    "$INSTDIR\src\samples\network\cpp\console\console-network.sln" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Opens Visual Studio solution"
FunctionEnd

;Installs the shortcuts to the base files
Function baseFilesShortCuts
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER"
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Authors.lnk" \
                   "$INSTDIR\Authors.txt" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "List of Authors"
    ;License shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\license.lnk" \
                   "$INSTDIR\license.txt" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Licensing information"
    ;README shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\README.lnk" \
                   "$INSTDIR\README.txt" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "README with basic information"
    ;Release notes shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\ReleaseNotes.lnk" \
                   "$INSTDIR\ReleaseNotes.txt" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Release Notes"
FunctionEnd

;Installs the web site as a document
Function documentationShortCuts
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER"
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation"
    ;api shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\userGuide.lnk" \
                   "$INSTDIR\doc\userGuide\userGuide.htm" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "RebeccaAIML UserGuide"
FunctionEnd

;Create the shortcuts for the c++ documentation
Function cppDocumentationShortCuts
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER"
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\cpp"
    ;api shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\cpp\api.lnk" \
                   "$INSTDIR\doc\reference\cpp\api\html\index.html" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Documentation to the C++ api"
    ;api+samples shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\cpp\api samples.lnk" \
                   "$INSTDIR\doc\reference\cpp\api+samples\html\index.html" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Documentation to the C++ api and samples"
    ;api+framework shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\cpp\api framework.lnk" \
                   "$INSTDIR\doc\reference\cpp\api+framework\html\index.html" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Documentation to the C++ api and Framework"
    ;api+framework+samples shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\cpp\api framework samples.lnk" \
                   "$INSTDIR\doc\reference\cpp\api+framework+samples\html\index.html" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Documentation to the C++ api, framework, and samples"
FunctionEnd

;Create the shortcuts for the java documentation
Function javaDocumentationShortCuts
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER"
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\java"
    ;api shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\java\api.lnk" \
                   "$INSTDIR\doc\reference\java\java_api\html\index.html" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Documentation to the Java api"
FunctionEnd

;Create the shortcuts for the csharp documentation
Function csharpDocumentationShortCuts
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER"
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\csharp"
    ;api shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\csharp\api.lnk" \
                   "$INSTDIR\doc\reference\csharp\csharp_api\html\index.html" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Documentation to the csharp api"
FunctionEnd

;Create the shortcuts for the python documentation
Function pythonDocumentationShortCuts
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER"
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\python"
    ;api shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Documentation\python\api.lnk" \
                   "$INSTDIR\doc\reference\python\python_api\html\index.html" \
                   "" \
                   "" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Documentation to the python api"
FunctionEnd


;Install the redistributable VS 2005
;and the .NET 2.0 framework
;and execute both of them
Function vs2005Redistributable
    SetOutPath "$INSTDIR"
    file ${REBECCA_HOME}\winInstaller\vcredist_x86.exe
    ExecDos::exec '"$INSTDIR\vcredist_x86.exe" /q'
FunctionEnd

;Add the base files in the root
;directory of RebeccaAIML
Function baseFiles
    SetOutPath "$INSTDIR"
    file ${REBECCA_HOME}\dev-todo.txt
    file ${REBECCA_HOME}\Authors.txt
    file ${REBECCA_HOME}\INSTALL.txt
    file ${REBECCA_HOME}\license.txt
    file ${REBECCA_HOME}\README.txt
    file ${REBECCA_HOME}\ReleaseNotes.txt
FunctionEnd

;Write the registry section for the add/remove programs
;to be able to remove RebeccaAIML
Function addRemove
    WriteRegExpandStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML" "UninstallString" '"$INSTDIR\Uninstall.exe"'
    WriteRegExpandStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML" "InstallLocation" "$INSTDIR"
    WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML" "DisplayName" "RebeccaAIML"
    WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML" "DisplayIcon" "$INSTDIR\resources\icons\package-x-generic.ico,0"
    WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML" "DisplayVersion" "${VERSION}"
FunctionEnd

;Install just the package icon
Function packageIcon
    SetOutPath $INSTDIR\resources\icons
    file ${REBECCA_HOME}\winInstaller\graphics\package-x-generic.ico
FunctionEnd

;Install the uninstaller shortcuts
Function uninstallerShortCuts
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER"
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Uninstall.lnk" "$INSTDIR\Uninstall.exe"
FunctionEnd

;Install the uninstaller
Function uninstaller
    SetOutPath "$INSTDIR"
    WriteUninstaller "$INSTDIR\Uninstall.exe"
FunctionEnd

;Install the shortcuts for the server
Function serverShortCuts
    SetOutPath $INSTDIR\bin\cpp ;Set the working directory of the shorcuts
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER"
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\Server"
    ;Create the start server shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Server\Start.lnk" \
                   "$INSTDIR\bin\cpp\rebecca-server.exe" \
                   "--Ice.Config=$\"$INSTDIR\conf\serverconfig.properties$\" --start RebeccaAIML" \
                   "$INSTDIR\resources\icons\media-playback-start.ico" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Starts the RebeccaAIML server"
    ;Create the stop server shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Server\Stop.lnk" \
                   "$INSTDIR\bin\cpp\rebecca-server.exe" \
                   "--Ice.Config=$\"$INSTDIR\conf\serverconfig.properties$\" --stop RebeccaAIML" \
                   "$INSTDIR\resources\icons\media-playback-stop.ico" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Stops the RebeccaAIML server"
    ;Create the uninstall server service shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Server\Uninstall Service.lnk" \
                   "$INSTDIR\bin\cpp\rebecca-server.exe" \
                   "--Ice.Config=$\"$INSTDIR\conf\serverconfig.properties$\" --uninstall RebeccaAIML" \
                   "$INSTDIR\resources\icons\media-eject.ico" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Uninstalls the RebeccaAIML server as a Windows Service"
    ;Create the install server as a windows service shortcut
    CreateShortCut "$SMPROGRAMS\$STARTMENU_FOLDER\Server\Install Service.lnk" \
                   "$INSTDIR\bin\cpp\rebecca-server.exe" \
                   "--Ice.Config=$\"$INSTDIR\conf\serverconfig.properties$\" --install RebeccaAIML" \
                   "$INSTDIR\bin\cpp\rebecca-server.exe" 0 \
                   SW_SHOWNORMAL \
                   SHIFT|CTRL|ALT|0 "Installs the RebeccaAIML server as a Windows Service"
FunctionEnd

;Installs the icons
Function icons
    ;Set the output to the icons and install the icons
    ;for the server shortcuts
    SetOutPath $INSTDIR\resources\icons
    file ${REBECCA_HOME}\winInstaller\graphics\media-playback-start.ico
    file ${REBECCA_HOME}\winInstaller\graphics\media-playback-stop.ico
    file ${REBECCA_HOME}\winInstaller\graphics\media-eject.ico
FunctionEnd

;Installs the rebecca-server executable
Function rebeccaServer
    SetOutPath "$INSTDIR\bin\cpp"
    file ${REBECCA_HOME}\bin\cpp\rebecca-server.exe
FunctionEnd

;Add the resources directory and files
Function resourcesDirectory
    file /r /x CVS ${REBECCA_HOME}\resources
FunctionEnd

;Change the startup file to have the installed location
;be indicative of where to load the annotated alice data set
Function configWriteStartupFile
# We don't want this
#    ${ConfigWrite} "$INSTDIR\conf\serverStartupFile.properties" "--addDirectory " "$\"$INSTDIR\aiml\annotated_alice$\"" $RO
FunctionEnd

;Change the serverconfig.properties to have the installed location
;be indicative of where the xsd's, and .xml's are located at.
Function configWriteServerConfigProperties
    ${ConfigWrite} "$INSTDIR\conf\serverconfig.properties" "Rebecca.Server.Config.AimlSchema=" "$INSTDIR\resources\schema\AIML.xsd" $RO
    ${ConfigWrite} "$INSTDIR\conf\serverconfig.properties" "Rebecca.Server.Config.CommonTypesSchema=" "$INSTDIR\resources\schema\common-types.xsd" $RO
    ${ConfigWrite} "$INSTDIR\conf\serverconfig.properties" "Rebecca.Server.Config.BotConfigurationSchema=" "$INSTDIR\resources\schema\bot-configuration.xsd" $RO
    ${ConfigWrite} "$INSTDIR\conf\serverconfig.properties" "Rebecca.Server.Config.SubstitutionFile=" "$INSTDIR\conf\substitutions.xml" $RO
    ${ConfigWrite} "$INSTDIR\conf\serverconfig.properties" "Rebecca.Server.Config.SentenceSplitterFile=" "$INSTDIR\conf\sentence-splitters.xml" $RO
    ${ConfigWrite} "$INSTDIR\conf\serverconfig.properties" "Rebecca.Server.Config.PropertiesFile=" "$INSTDIR\conf\properties.xml" $RO
    ${ConfigWrite} "$INSTDIR\conf\serverconfig.properties" "Rebecca.Server.Config.StartupFile=" "$INSTDIR\conf\serverStartupFile.properties" $RO
FunctionEnd

;Install the entire conf directory
Function confDirectory
    SetOutPath "$INSTDIR"
    file /r /x CVS ${REBECCA_HOME}\conf
    Call configWriteServerConfigProperties ;Change the server config properties
    Call configWriteStartupFile            ;Change the startup config file
FunctionEnd

;Install the AIML data sets
Function aimlSets
    SetOutPath "$INSTDIR"
    ;Add the all the aiml sets
    ;which is just the annotated_alice aiml set right now
    file /r /x basic_aiml /x CVS /x custom_tags ${REBECCA_HOME}\aiml
FunctionEnd

;Installs the website as documentation
Function documentation
    SetOutPath "$INSTDIR\doc"
    file /r /X CVS ${REBECCA_HOME}\doc\userGuide
FunctionEnd

;Install the entire documentation for C++
Function cppDocumentation
    SetOutPath "$INSTDIR\doc\reference\cpp"
    file /r ${REBECCA_HOME}\doc\doxygen\api
    file /r ${REBECCA_HOME}\doc\doxygen\api+framework
    file /r ${REBECCA_HOME}\doc\doxygen\api+framework+samples
    file /r ${REBECCA_HOME}\doc\doxygen\api+samples
    file ${REBECCA_HOME}\doc\doxygen\README.txt
FunctionEnd

;Install the entire documentation for Java
Function javaDocumentation
    SetOutPath "$INSTDIR\doc\reference\java"
    file /r ${REBECCA_HOME}\doc\doxygen\java_api
    file ${REBECCA_HOME}\doc\doxygen\README.txt
FunctionEnd

;Install the entire documentation for csharp
Function csharpDocumentation
    SetOutPath "$INSTDIR\doc\reference\csharp"
    file /r ${REBECCA_HOME}\doc\doxygen\csharp_api
    file ${REBECCA_HOME}\doc\doxygen\README.txt
FunctionEnd

;Install the entire documentation for python
Function pythonDocumentation
    SetOutPath "$INSTDIR\doc\reference\python"
    file /r ${REBECCA_HOME}\doc\doxygen\python_api
    file ${REBECCA_HOME}\doc\doxygen\README.txt
FunctionEnd


;If the string startServer is equal to "true"
;then we're going to start the server service
Function startTheServer
    StrCmp startServer "true" 0
    ExecDos::exec '"$INSTDIR\bin\cpp\rebecca-server.exe" --Ice.Config=$\"$INSTDIR\conf\serverconfig.properties$\" --uninstall RebeccaAIML'
    ExecDos::exec '"$INSTDIR\bin\cpp\rebecca-server.exe" --Ice.Config=$\"$INSTDIR\conf\serverconfig.properties$\" --install RebeccaAIML'
    ExecDos::exec /NOUNLOAD /ASYNC '"$INSTDIR\bin\cpp\rebecca-server.exe" --Ice.Config=$\"$INSTDIR\conf\serverconfig.properties$\" --start RebeccaAIML'
FunctionEnd

;Install all the C++ include files including
;all the ones involving the networking C++ section
;and the README.txt file for the include files
Function cppNetworkHeaders
    SetOutPath "$INSTDIR\include"
    file /r /x CVS /x impl /x adt ${REBECCA_HOME}\include\rebecca
    file ${REBECCA_HOME}\include\README.txt
FunctionEnd

;Install all the C++ include files except for the ones
;that involve the networking C++ section
Function cppHeaders
    SetOutPath "$INSTDIR\include"
    file /r /x CVS /x NetworkAimlFacade.h  /x NetworkGraphBuilder.h /x impl /x adt ${REBECCA_HOME}\include\rebecca
    file ${REBECCA_HOME}\include\README.txt
FunctionEnd

;Install all the C++ dll's required
;except for the networking ones
;and the README's associated with it
Function cppDlls
    SetOutPath "$INSTDIR\bin\cpp"
    file ${REBECCA_HOME}\bin\cpp\rebecca-mt.dll
    file ${REBECCA_HOME}\bin\cpp\xerces-c_2_8.dll
    file ${REBECCA_HOME}\bin\cpp\msvcp71.dll
    file ${REBECCA_HOME}\bin\cpp\msvcr71.dll
    file ${REBECCA_HOME}\bin\cpp\libdb46.dll
    file ${REBECCA_HOME}\bin\cpp\db_archive.exe
    file ${REBECCA_HOME}\bin\cpp\db_checkpoint.exe
    file ${REBECCA_HOME}\bin\cpp\db_deadlock.exe
    file ${REBECCA_HOME}\bin\cpp\db_dump.exe
    file ${REBECCA_HOME}\bin\cpp\db_load.exe
    file ${REBECCA_HOME}\bin\cpp\db_printlog.exe
    file ${REBECCA_HOME}\bin\cpp\db_recover.exe
    file ${REBECCA_HOME}\bin\cpp\db_stat.exe
    file ${REBECCA_HOME}\bin\cpp\db_upgrade.exe
    file ${REBECCA_HOME}\bin\cpp\db_verify.exe
    file ${REBECCA_HOME}\bin\cpp\README.txt
FunctionEnd

;Install all the C++ dll's required
;and the README's associated with it
Function cppDllsNetwork
    SetOutPath "$INSTDIR\bin\cpp"
    file ${REBECCA_HOME}\bin\cpp\rebecca-mt.dll
    file ${REBECCA_HOME}\bin\cpp\rebecca-network.dll
    file ${REBECCA_HOME}\bin\cpp\xerces-c_2_8.dll
    file ${REBECCA_HOME}\bin\cpp\ice32.dll
    file ${REBECCA_HOME}\bin\cpp\bzip2.dll
    file ${REBECCA_HOME}\bin\cpp\iceutil32.dll
    file ${REBECCA_HOME}\bin\cpp\msvcp71.dll
    file ${REBECCA_HOME}\bin\cpp\msvcr71.dll
    file ${REBECCA_HOME}\bin\cpp\libdb46.dll
    file ${REBECCA_HOME}\bin\cpp\db_archive.exe
    file ${REBECCA_HOME}\bin\cpp\db_checkpoint.exe
    file ${REBECCA_HOME}\bin\cpp\db_deadlock.exe
    file ${REBECCA_HOME}\bin\cpp\db_dump.exe
    file ${REBECCA_HOME}\bin\cpp\db_load.exe
    file ${REBECCA_HOME}\bin\cpp\db_printlog.exe
    file ${REBECCA_HOME}\bin\cpp\db_recover.exe
    file ${REBECCA_HOME}\bin\cpp\db_stat.exe
    file ${REBECCA_HOME}\bin\cpp\db_upgrade.exe
    file ${REBECCA_HOME}\bin\cpp\db_verify.exe
    file ${REBECCA_HOME}\bin\cpp\README.txt
FunctionEnd

;Install all the .lib files required for
;samples to be compiled against the 
;embedded c++ version
Function cppLibs
    SetOutPath "$INSTDIR\bin\cpp"
    file ${REBECCA_HOME}\bin\cpp\rebecca-mt.lib
FunctionEnd

;Install all the .lib files required for
;samples to be compiled against the network
;version
Function cppLibsNetwork
    SetOutPath "$INSTDIR\bin\cpp"
    file ${REBECCA_HOME}\bin\cpp\rebecca-mt.lib
    file ${REBECCA_HOME}\bin\cpp\rebecca-network.lib
FunctionEnd

;Install the rs-admin.exe executable
Function rsadminExecutable
    SetOutPath "$INSTDIR\bin\cpp"
    file ${REBECCA_HOME}\bin\cpp\rs-admin.exe
FunctionEnd

;Install the client config file
;and the config README file
Function clientConfigFile
    SetOutPath "$INSTDIR\conf"
    file ${REBECCA_HOME}\conf\clientconfig.properties
    file ${REBECCA_HOME}\conf\README.txt
FunctionEnd

;Installs the source code
;for the rs-admin sample
Function rsadminSourceCode
    SetOutPath $INSTDIR\src\samples\network\cpp\rs-admin
    file ${REBECCA_HOME}\src\samples\network\cpp\rs-admin\resource.h
    file ${REBECCA_HOME}\src\samples\network\cpp\rs-admin\rs-admin.cpp
    file ${REBECCA_HOME}\src\samples\network\cpp\rs-admin\rs-admin.ico
    file ${REBECCA_HOME}\src\samples\network\cpp\rs-admin\rs-admin.rc
    file ${REBECCA_HOME}\src\samples\network\cpp\rs-admin\rs-admin.sln
    file ${REBECCA_HOME}\src\samples\network\cpp\rs-admin\rs-admin.vcproj
    file ${REBECCA_HOME}\src\samples\network\cpp\rs-admin\usages.h
    file ${REBECCA_HOME}\src\samples\network\cpp\rs-admin\README.txt
FunctionEnd

;Create the shorcuts for the rs-admin sample
Function rsadminShortCuts
    SetOutPath $INSTDIR\bin\cpp
    CreateDirectory "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\rs-admin"
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\rs-admin\rs-admin console.lnk" \
                    "cmd.exe" \
                    "" \
                    "$INSTDIR\bin\cpp\rs-admin.exe" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Starts a command line shell to the rs-admin console tool"
    CreateShortCut  "$SMPROGRAMS\$STARTMENU_FOLDER\samples\cpp\rs-admin\rs-admin VS 2005 Solution.lnk" \
                    "$INSTDIR\src\samples\network\cpp\rs-admin\rs-admin.sln" \
                    "" \
                    "" 0 \
                    SW_SHOWNORMAL \
                    SHIFT|CTRL|ALT|0 "Opens Visual Studio solution"
FunctionEnd

;Installs the python networking files
Function pythonFilesNetworking
    ;Set the output directory to *just* the bin
    ;directory since we're going to do a recursive
    ;copy of all the python directory
    SetOutPath "$INSTDIR\bin"
    ;Copy all the .py files except for any samples we might have created
    file /r /x CVS /x *.pyc /x console.py /x consoleCallBacks.py /x customCallBacks.py ${REBECCA_HOME}\bin\python
FunctionEnd

;Installs the C# networking files
Function csharpFilesNetworking
    SetOutPath "$INSTDIR\bin\csharp"
    file ${REBECCA_HOME}\bin\csharp\rebecca-network-cs.dll
    file ${REBECCA_HOME}\bin\csharp\README.txt
    file ${REBECCA_HOME}\bin\csharp\icecs.dll
FunctionEnd

;Installs the java networking files
Function javaFilesNetworking
    SetOutPath "$INSTDIR\bin\java"
    file ${REBECCA_HOME}\bin\java\Ice.jar
    file ${REBECCA_HOME}\bin\java\rebecca-network.jar
    file ${REBECCA_HOME}\bin\java\README.txt
FunctionEnd

;--------------------------------
;Descriptions

  ;Language strings
  LangString DESC_SecCore ${LANG_ENGLISH} "The C++ AIML server in which networking applications are written against"
  LangString DESC_SecNetworking ${LANG_ENGLISH} "The networking module which allows RebeccaAIML to run as a server as well as communicate with a variety of programming languages"
  LangString DESC_SecNetworkingCpp ${LANG_ENGLISH} "The C++ client side .dll's and includes which allow C++ client side network development"
  LangString DESC_SecNetworkingJava ${LANG_ENGLISH} "The Java client side jar's which allow Java client side network development"
  LangString DESC_SecNetworkingCsharp ${LANG_ENGLISH} "The C# client side .dll's which allow C# client side network development"
  LangString DESC_SecNetworkingPython ${LANG_ENGLISH} "The Python client side files which allow Python client side network development"
  LangString DESC_SecNetworkingLanguages ${LANG_ENGLISH} "The networking languages to use to write applications for the server"
  LangString DESC_SecNetworkingSamples ${LANG_ENGLISH} "The networking language samples to use to learn how to write applications for the server"
  LangString DESC_SecNetworkingSamplesCpp ${LANG_ENGLISH} "The C++ language samples to use to learn how to write applications for the server"
  LangString DESC_SecNetworkingSamplesJava ${LANG_ENGLISH} "The Java language samples to use to learn how to write applications for the server"
  LangString DESC_SecNetworkingSamplesCsharp ${LANG_ENGLISH} "The C# language samples to use to learn how to write applications for the server"
  LangString DESC_SecNetworkingSamplesPython ${LANG_ENGLISH} "The Python language samples to use to learn how to write applications for the server"
  LangString DESC_SecAdminToolsRsAdmin ${LANG_ENGLISH} "The C++ command line administration tool"
  LangString DESC_SecNetworkingSamplesConsoleCpp ${LANG_ENGLISH} "The C++ networking console sample"
  LangString DESC_SecNetworkingSamplesConsoleCallBacksCpp ${LANG_ENGLISH} "The C++ networking console callbacks sample"
  LangString DESC_SecNetworkingSamplesConsoleJava ${LANG_ENGLISH} "The Java networking console sample"
  LangString DESC_SecNetworkingSamplesConsoleCallBacksJava ${LANG_ENGLISH} "The Java networking console callbacks sample"
  LangString DESC_SecNetworkingSamplesConsoleCsharp ${LANG_ENGLISH} "The C# networking console sample"
  LangString DESC_SecNetworkingSamplesConsoleCallBacksCsharp ${LANG_ENGLISH} "The C# networking console callbacks sample"
  LangString DESC_SecNetworkingSamplesConsolePython ${LANG_ENGLISH} "The Python networking console sample"
  LangString DESC_SecNetworkingSamplesConsoleCallBacksPython ${LANG_ENGLISH} "The Python networking console callbacks sample"
  LangString DESC_SecEmbedded ${LANG_ENGLISH} "The Embedded module which allows development directly with RebeccaAIML"
  LangString DESC_SecEmbeddedLanguages ${LANG_ENGLISH} "The Embedded programming languages which allows development directly with RebeccaAIML"
  LangString DESC_SecEmbdeddedLanguagesCpp ${LANG_ENGLISH} "The C++ Embedded programming language which allows development directly with RebeccaAIML"
  LangString DESC_SecEmbeddedSamples ${LANG_ENGLISH} "The Embedded programming language samples to use to learn how to write applications directly with RebeccaAIML"
  LangString DESC_SecEmbeddedSamplesCpp ${LANG_ENGLISH} "The C++ language samples to use to learn how to write applications directly with RebeccaAIML" 
  LangString DESC_SecEmbeddedSamplesConsole ${LANG_ENGLISH} "The C++ console sample which workings directly with RebeccaAIML"
  LangString DESC_SecEmbeddedSamplesQT ${LANG_ENGLISH} "The TrollTech QT sample which works directly wiith RebeccaAIML"
  LangString DESC_SecDocumentation ${LANG_ENGLISH} "Documentation for RebeccaAIML"
  LangString DESC_SecUserGuide ${LANG_ENGLISH} "The RebeccaAIML user guide"
  LangString DESC_SecDocumentationCpp ${LANG_ENGLISH} "Documentation for C++"
  LangString DESC_SecDocumentationJava ${LANG_ENGLISH} "Documentation for Java"
  LangString DESC_SecDocumentationCsharp ${LANG_ENGLISH} "Documentation for C#"
  LangString DESC_SecDocumentationPython ${LANG_ENGLISH} "Documentation for Python"

  ;Assign language strings to sections
  !insertmacro MUI_FUNCTION_DESCRIPTION_BEGIN
    !insertmacro MUI_DESCRIPTION_TEXT ${SecCore} $(DESC_SecCore)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworking} $(DESC_SecNetworking)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingCpp} $(DESC_SecNetworkingCpp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingJava} $(DESC_SecNetworkingJava)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingCsharp} $(DESC_SecNetworkingCsharp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingPython} $(DESC_SecNetworkingPython)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingLanguages} $(DESC_SecNetworkingLanguages)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamples} $(DESC_SecNetworkingSamples)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesCpp} $(DESC_SecNetworkingSamplesCpp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesJava} $(DESC_SecNetworkingSamplesJava)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesCsharp} $(DESC_SecNetworkingSamplesCsharp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesPython} $(DESC_SecNetworkingSamplesPython)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecAdminToolsRsAdmin} $(DESC_SecAdminToolsRsAdmin)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesConsoleCpp} $(DESC_SecNetworkingSamplesConsoleCpp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesConsoleCallBacksCpp} $(DESC_SecNetworkingSamplesConsoleCallBacksCpp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesConsoleJava} $(DESC_SecNetworkingSamplesConsoleJava)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesConsoleCallBacksJava} $(DESC_SecNetworkingSamplesConsoleCallBacksJava)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesConsoleCsharp} $(DESC_SecNetworkingSamplesConsoleCsharp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesConsoleCallBacksCsharp} $(DESC_SecNetworkingSamplesConsoleCallBacksCsharp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesConsolePython} $(DESC_SecNetworkingSamplesConsolePython)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecNetworkingSamplesConsoleCallBacksPython} $(DESC_SecNetworkingSamplesConsoleCallBacksPython)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecEmbedded} $(DESC_SecEmbedded)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecEmbeddedLanguages} $(DESC_SecEmbeddedLanguages)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecEmbdeddedLanguagesCpp} $(DESC_SecEmbdeddedLanguagesCpp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecEmbeddedSamples} $(DESC_SecEmbeddedSamples)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecEmbeddedSamplesCpp} $(DESC_SecEmbeddedSamplesCpp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecEmbeddedSamplesConsole} $(DESC_SecEmbeddedSamplesConsole)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecEmbeddedSamplesQT} $(DESC_SecEmbeddedSamplesQT)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecDocumentation} $(DESC_SecDocumentation)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecUserGuide} $(DESC_SecUserGuide)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecDocumentationCpp} $(DESC_SecDocumentationCpp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecDocumentationJava} $(DESC_SecDocumentationJava)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecDocumentationCsharp} $(DESC_SecDocumentationCsharp)
    !insertmacro MUI_DESCRIPTION_TEXT ${SecDocumentationPython} $(DESC_SecDocumentationPython)

  !insertmacro MUI_FUNCTION_DESCRIPTION_END

;--------------------------------
;Uninstaller Section

Section "Uninstall"
  ;Try and shut down the server if it's
  ;currently running and then try and uninstall
  ;it.
  ExecDos::exec '"$INSTDIR\bin\cpp\rebecca-server.exe" --Ice.Config=$\"$INSTDIR\conf\serverconfig.properties$\" --stop RebeccaAIML'
  ExecDos::exec '"$INSTDIR\bin\cpp\rebecca-server.exe" --Ice.Config=$\"$INSTDIR\conf\serverconfig.properties$\" --uninstall RebeccaAIML'

  ;Delete the redistributable VS 2005 installer
  ;and the .NET redistributable
  ;We keep this around in case it doesn't install
  ;correctly they will have it.
  Delete $INSTDIR\vcredist_x86.exe

  ;Delete the Uninstall.exe installer
  Delete "$INSTDIR\Uninstall.exe"

  ;Delete all the base files
  Delete $INSTDIR\dev-todo.txt
  Delete $INSTDIR\Authors.txt
  Delete $INSTDIR\INSTALL.txt
  Delete $INSTDIR\license.txt
  Delete $INSTDIR\README.txt
  Delete $INSTDIR\ReleaseNotes.txt

  ;Delete the all the aiml sets
  ;which is just the annotated_alice aiml set right now
  RMdir /r $INSTDIR\aiml

  ;Delete the conf (config) directory
  RMDir /r $INSTDIR\conf

  ;Delete the documentation
  RMDir /r $INSTDIR\doc

  ;Add the resources directory and files
  RMDir /r $INSTDIR\resources

  ;Remove the include files from the C++ installation
  RMDir /r $INSTDIR\include

  ;Remove all the binary files from the installation
  RMDir /r $INSTDIR\bin
  
  ;Remove all the source files installed.
  ;This would be all the source files for the samples
  RMDIR /r $INSTDIR\src

  ;Remove the RebeccaAIML directory only if
  ;it is completely empty
  RMDir $INSTDIR

 !insertmacro MUI_STARTMENU_GETFOLDER Application $MUI_TEMP

  ;Delete all the shorcuts we made
  Delete "$SMPROGRAMS\$MUI_TEMP\Uninstall.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Server\Start.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Server\Stop.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Server\Uninstall Service.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Server\Install Service.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\rs-admin\rs-admin console.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\rs-admin\rs-admin VS 2005 Solution.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\console-network\console network VS 2005 Solution.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\console-network\console network.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\consoleCallBacks-network\console callbacks network.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\consoleCallBacks-network\console callbacks network VS 2005 Solution.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\console\console VS 2005 Solution.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\console\console.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\java\console\console.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\java\console\Console.java.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\java\console\build using ant.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\java\consoleCallBacks\consoleCallBacks.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\java\consoleCallBacks\ConsoleCallBacks.java.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\java\consoleCallBacks\CustomCallBacks.java.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\java\consoleCallBacks\build using ant.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\csharp\console\console.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\csharp\console\console network VS 2005 Solution.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\csharp\consoleCallBacks\consoleCallBacks.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\csharp\consoleCallBacks\console callbacks network VS 2005 Solution.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\python\console\console.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\python\console\console.py.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\python\console\copy console.py to bin.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\python\consoleCallBacks\consoleCallBacks.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\python\consoleCallBacks\consoleCallBacks.py.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\python\consoleCallBacks\customCallBacks.py.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\python\consoleCallBacks\copy python files to bin.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\qtgui\qtgui.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\qtgui\create VS 2005 solution.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\samples\cpp\qtgui\qtgui VS 2005 Solution.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Documentation\userGuide.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Documentation\cpp\api.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Documentation\cpp\api samples.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Documentation\cpp\api framework.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Documentation\cpp\api framework samples.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Documentation\java\api.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Documentation\csharp\api.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Documentation\python\api.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\Authors.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\license.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\README.lnk"
  Delete "$SMPROGRAMS\$MUI_TEMP\ReleaseNotes.lnk"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\Documentation\cpp"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\Documentation\java"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\Documentation\csharp"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\Documentation\python"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\Documentation"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\Server"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\cpp\rs-admin"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\cpp\console-network"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\cpp\console"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\cpp\consoleCallBacks-network"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\cpp\qtgui"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\cpp"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\java\console"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\java\consoleCallBacks"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\java"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\csharp\console"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\csharp\consoleCallBacks"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\csharp"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\python\console"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\python\consoleCallBacks"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples\python"
  RMdir  "$SMPROGRAMS\$MUI_TEMP\samples"

  ;Delete the AIML database directories
  ReadEnvStr $1 "ALLUSERSPROFILE"
  RMDir /r "$1\Application Data\.RebeccaAIMLDB"
  ReadEnvStr $2 "APPDATA"
  RMDir /r "$2\.RebeccaAIMLDB"

  ;Delete empty start menu parent diretories
  StrCpy $MUI_TEMP "$SMPROGRAMS\$MUI_TEMP"

  startMenuDeleteLoop:
	ClearErrors
    RMDir $MUI_TEMP
    GetFullPathName $MUI_TEMP "$MUI_TEMP\.."

    IfErrors startMenuDeleteLoopDone

    StrCmp $MUI_TEMP $SMPROGRAMS startMenuDeleteLoopDone startMenuDeleteLoop
  startMenuDeleteLoopDone:

  DeleteRegKey /ifempty HKCU "Software\RebeccaAIML"

  ;Delete the registry section for the add/remove programs
  ;since we're uninstalling
  DeleteRegKey /ifempty HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML"
  DeleteRegKey /ifempty HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML"
  DeleteRegKey /ifempty HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML"
  DeleteRegKey /ifempty HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML"
  DeleteRegKey /ifempty HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\RebeccaAIML"

SectionEnd
