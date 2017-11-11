

Run("Notepad.exe")

WinWaitActive("Untitled - Notepad")

ControlSend("Untitled - Notepad","","Edit1","heloo helooooooo")

WinClose("Untitled - Notepad")

WinWaitActive("Notepad")

ControlClick("Notepad","","Button1")

WinWaitActive("Save As")

ControlFocus("Save As","","Edit1")

Send("D:\weekend1212.txt")

ControlClick("Save As","","Button1")