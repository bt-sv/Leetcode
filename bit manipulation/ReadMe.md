关于位运算的基础知识以及技巧（定期更新）

基础知识:
1. 位运算的每种运算符号

```
AND '&'
OR  '|'
XOR '^'
```

一些技巧:

1. 得到二进制数字的最右面的那一位是0还是1:

```
int a = 4;
return a & 1;
```


