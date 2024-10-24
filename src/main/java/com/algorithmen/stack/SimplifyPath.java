package com.algorithmen.stack;

import java.util.Stack;

/*You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:

A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
The simplified canonical path should follow these rules:

The path must start with a single slash '/'.
Directories within the path must be separated by exactly one slash '/'.
The path must not end with a slash '/', unless it is the root directory.
The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
Return the simplified canonical path.*/
public class SimplifyPath {
    // Runtime beats 98%, memory 74%
    public String simplifyPath(String path) {
        if (path == null || path.isEmpty() || path.charAt(0) != '/') {
            return "";
        }

        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.isEmpty() || component.equals(".")) {
                continue;
            }
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(component);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (String dir : stack) {
            ans.append("/").append(dir);
        }

        return ans.isEmpty() ? "/" : ans.toString();
    }
}
