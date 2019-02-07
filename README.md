<img alt="Logo" src="https://i.imgur.com/jFKnHDt.png">

---

## What is MineExcel?

I run a private Minecraft server, and as a good server owner, I bow down to the wishes of my players. One of my good friends decided that he wanted to make a huge farm by clearing out hundreds of thousands of blocks in one area, but didn't have the means to do so, so he wrote up an Excel spreadsheet of around 250 commands for me to individually paste into the server console.


So, instead of taking the fifteen minutes required to do so like any other normal person would, I wrote this program to read all of the commands I needed to perform and turn them into a single, multi-command function I could use in the Minecraft server, called a .mcfunction. This mess is the result: using Apache POI, my program can read from any .xlsx file, paste all cells in a column to a new .mcfunction file, and make it useable by any Minecraft server.

## How to use it
Currently, MineExcel reads from Column A of "D:\file.xlsx" and uses it to write our .mcfunction file. Make sure that *all* of the data in Column A is what you want in your custom function! After running the program, MineExcel will spit out a file called "function.mcfunction" in your workspace folder, ready to be used on your own server after importing it into your world folder. Retitling your new .mcfunction won't break it, so organize to your heart's content. Just make sure your Excel spreadsheet is somehow accessible by the program.