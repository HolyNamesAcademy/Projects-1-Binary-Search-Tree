# Project: Binary Search Tree

## Table of Contents

- [Project: Binary Search Tree](#project-binary-search-tree)
  - [Table of Contents](#table-of-contents)
  - [Good work pledge](#good-work-pledge)
  - [Getting started](#getting-started)
  - [Background](#background)
    - [Node](#node)
    - [BST](#bst)
  - [The Project](#the-project)
  - [Committing your Changes and Turning In The Project](#committing-your-changes-and-turning-in-the-project)
  - [Grading](#grading)

## Good work pledge

We are here to broaden your exposure to Computer Science. We can only achieve that purpose when you work hard and honestly. It may be tempting to copy-paste code from a classmate, or let a classmate do all your work for you—don't! You will be cheating yourself from the most valuable thing course has to offer—overcoming challenges.

We know that hard, and honest work doesn't come easily. If you feel like you are falling behind:

1. Don't copy-paste code, or let someone do your work for you
2. Ask for help!
3. Tell the teaching-team you need more time

## Getting started

1. Open the assignment link your teacher posts in **Teams** or **OneNote**, and accept the assignment. GitHub will create a private project just for you.
2. On your new project page, click the green **Code** button, copy the link, and clone the project into IntelliJ (File → New → Project from Version Control, then paste the link).
3. When IntelliJ asks if you trust the project, say yes / trust it so it can finish setting things up.
4. If IntelliJ asks you to pick a Java version (JDK), choose **17** or newer.
5. Use the green play **dropdown** near the top-right of IntelliJ. You should see `Main` and `BSTTest`. You can stay in the file you are editing — you do not need to open a different file first.

If anything looks confusing the first time you open the project, ask a teacher — IntelliJ asks a few one-time setup questions, and then day-to-day work is just writing code and using that green play button.


## Background

Binary search trees are a powerful data structure for storing sorted data. Binary search trees often use recursive algorithms
as each node of the BST is the "root" of a subtree.

### Node

This class is implemented for you, including `getLeft` / `setLeft` and `getRight` / `setRight`.
Use those setters when you link children during `add` and `remove`.

### BST

This class utilizes the functionality of the Node class to create Binary Search Trees, modify Binary
Search Trees, and traverse Binary Search Trees.

**Remove tip:** When deleting a node, you must update the parent's child link (or `head` if deleting the root).
In Java, assigning to a method parameter does not change the caller's variable — return the replacement
subtree from a helper (see the comment on `makeDeletion`) and call `setLeft` / `setRight`.

## The Project

In this project, you will implement functionality to build and work with binary search trees.

These are the methods you will implement in `BST.java`:

- **contains** (and helper, if you need one)
- **displayPreOrder** (and helper)
- **displayInOrder** (and helper)
- **displayPostOrder** (and helper)
- **add** (and helper)
- **remove** (and helper)

You will also complete and write tests in `BSTTest.java`. One test is provided as an example; the others include `TO DO` notes for you to finish.


## Committing your Changes and Turning In The Project

At the end of every class period, commit and push your work from IntelliJ:

1. Click **Git > Commit…** (or use the Commit tool window).
2. Review the changed files. You can double-click a file to see the diff.
3. Enter a short commit message, then choose **Commit and Push…**.
4. Confirm the push to your project's `main` branch.
5. On GitHub, confirm your latest commits are visible.

Pushing to `main` is how you turn in work for this assignment. Autograding runs on those pushes. You can keep improving and pushing after the deadline if your teacher allows late work — ask about any late penalty.


## Grading

Your grade for each project will fall into one of four categories:

| Grade Level            | Explanation                                                                                                                                                                                  |
| :--------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| _Exceeds Expectations_ | <ul><li>Quality is outstanding.</li></ul>                                                                                                                                                    |
| _Excellent_            | <ul><li>Overall quality is high.</li></ul>                                                                                                                                                   |
| _Satisfactory_         | <ul><li>Overall quality is good.</li><li>Improvements can be made to bring the quality up to <i>Excellent</i>.</li></ul>                                                                     |
| _Needs Improvement_    | <ul><li>Overall quality is not yet high enough and the submission will not be accepted.</li><li>Improvements must be made to bring the quality up to at least <i>Satisfactory</i>.</li></ul> |
