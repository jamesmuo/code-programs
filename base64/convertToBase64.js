#!/usr/bin/node
const fs = require("fs");

//standalone nodeJS script
if (process.argv.length == 3) {
    var imageData = fs.readFileSync(process.argv[2], "base64");
    var ext = process.argv[2].substr(process.argv[2].lastIndexOf(".") + 1);
    var outFile = process.argv[2].substr(0, process.argv[2].lastIndexOf(".")) + ".txt";
    fs.writeFileSync(outFile, "data:image/" + ext + ";base64," + imageData);
} else {
    console.log("Error: please provide filename");
    process.exit(1);
}
