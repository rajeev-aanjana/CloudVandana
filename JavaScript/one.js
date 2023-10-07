// Take a sentence as aan input and reverse every word in that sentence.

function reverseWords(str) {
  let revArr;
  revArr = str.split(" ").map((word) => word.split("").reverse().join(""));
  return revArr.join(" ");
}

console.log(reverseWords("I am a Web Devloper"));
