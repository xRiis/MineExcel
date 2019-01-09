![Logo](i.imgur.com/jFKnHDt.png)
---
## What is MineExcel?
I run a private Minecraft server, and as a good server owner, I bow down to the wishes of my players. One of my good friends decided that he wanted to make a huge farm by clearing out hundreds of thousands of blocks in one area, but didn't have the means to do so, so he wrote up an Excel spreadsheet of around 250 commands for me to individually paste into the server console.
So, instead of taking the fifteen minutes required to do so like any other normal person would, I wrote this program to read all of the commands I needed to perform and turn them into a single, multi-command function I could use in the Minecraft server, called a .mcfunction. This mess is the result: using Apache POI, my program can read from any .xlsx file, paste all cells in a column to a new .mcfunction file, and make it useable by any Minecraft server.

## How to use it
Currently, MineExcel reads D:\file.xlsx and will spit out a file called "function.mcfunction" in your workspace folder. Retitling your new .mcfunction won't break it.

## Checklist
* Remove the potential "/" from all written commands, as it is not needed for a .mcfunction
* UI and interactivity?