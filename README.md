<img alt="Logo" src="https://i.imgur.com/jFKnHDt.png">

---

## What is MineExcel?

Once upon a time, I ran a Minecraft server. One of the players needed me to copy and paste about 250 lines from a MS Excel spreadsheet into the console for a project. Instead of taking the fifteen minutes to do so like anyone else would, I wrote a program to do that for me.

MineExcel is an in-progress application that allows a user to read from a given column in a .xlsx or .xlsm file and automatically pastes the entire column into a custom file to be used on Minecraft servers and singleplayer worlds, called a .mcfunction file, which is then incorporated into a series of folders comprising a datapack. Doing so allows a player operator to perform what would normally be multiple commands in a single custom command.

## How to use it

Run MineExcel and select a file. **MineExcel will only properly work with .xlsx or .xlsm files. Older file versions are not supported.** Find a column MineExcel can read from your file in the drop-down menu below. Then select your output -- type a name for your new file and hit "Open." When the process is begun, MineExcel will read from the spreadsheet and spit all data it sees there into a .mcfunction file. 

After that .mcfunction file is imported into the [WORLDNAME]/datapacks/[DATAPACKNAME]/data/[NAMESPACE]/functions folder of a Minecraft world, it can be called using "/function [NAMESPACE]:[FILENAME]."

## What's coming next

- [x] Custom file output path
- [x] Custom column selection
- [ ] GUI beautification