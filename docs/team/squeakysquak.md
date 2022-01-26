---
layout: page
title: Khor Ethan's Project Portfolio Page
---
### Introduction

I am a software developer for Financial Advisor Smart Tracker (FAST). I was in charge of scheduling and tracking for FAST.
At the time of developing FAST, I was a Year 2 Computer Science Undergraduate.

### Project Overview: Financial Advisor Smart Tracker (FAST)

FAST (Financial Advisor Smart Tracker) is a desktop address book application targeted at financial advisors, for
them to keep track of their clients as contacts. The user interacts with it using a CLI, and it has a GUI created with
JavaFX. It is written in Java, and has about 12 kLoC.

---

### Contributions to FAST

Given below are my contributions to the project.

#### Enhancement to Existing Features

* **Enhancement 1**: Enhance find feature
  * **What it does**:<br>
  The `find` feature now allows users to search for their clients by their tags, priority tags, or remarks. Finding by name
  now also displays clients whose names start with the search query.
  
  <br>
  
  * **Justification**: <br>
  Financial Advisors (FA) may use tags to categorise their clients. Being able to search by tag allows them to view all
  clients that fall under a certain category. Being able to search by priority also allows FAs to quickly see which clients
  require more immediate attention. FAs may also write important information about a client in their remarks. Thus, being able
  to search by remarks is also useful to find more specific traits of clients. FAs may also want to search for clients whose
  names start with a certain letter or not want to type out a very long name. Hence, being able to search by the start of a name
  is useful.
  
  <br>
  
  * **Highlights**: <br>
  This is built upon the `find` feature. By entering the correct syntax, users can now specify if they want to find by name,
  tag (`t/`), priority tag (`pr/`) or remark (`r/`).
  
  <br> 
  
  * **Related PR**: [\#110](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/110)

<br>

* **Enhancement 2**: Quality of life improvements
  * **What it does**:<br>
  All command syntax has been shortened, and first letters of names will now be automatically capitalised.
  
  <br>
  
  * **Justification**: <br>
  The main design principle of FAST is to save FAs as much time as possible when managing contacts. Shorter command syntax will
  cut down on the time FAs spend typing, and auto-capitalisation will make it easier for FAs to enter names and not have to worry
  about forgetting to capitalise them.
  
  <br>
  
  * **Highlights**: <br>
  This is built by changing the command words for all features, and by modifying the parser for the add command.
  
  <br> 
  
  * **Related PR**: [\#91](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/91)
  
<br>
  
#### Code Contribution

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2122s1.github.io/tp-dashboard/?search=t09-4&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=AY2122S1-CS2103T-T09-1%2Ftp%5Bmaster%5D~AY2122S1-CS2103T-T09-2%2Ftp%5Bmaster%5D~AY2122S1-CS2103T-T09-3%2Ftp%5Bmaster%5D&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2021-09-17)

<br>

#### Documentation


* **User Guide**:
  * Updated documentation for the feature `find` [\#115](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/115)
  * Added tips for `tag`, `remark`, `Appointment`, and `priority tag` features [\#129](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/129)
  * Contributed to "Try It Out" section [\#129](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/129)
  * Added screenshots and diagrams for various features [\#129](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/129), [\#210](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/210), [\#147](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/147)
  
  
* **Developer Guide**:
  * Added use cases UC13 to UC15 [\#115](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/115)
  * Added implementation of `find` feature [\#115](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/115)
  * Added Manual Testing section for `find` feature [\#218](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/218)
  * Added UML diagrams for implementation of `find` feature [\#213](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/213)
  
<br>

#### Community

* **Community**:
    * Released JAR 1.3 trial
    * Fixed UI bugs [\#210](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/210)
    * PRs reviewed: [\#53](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/53), [\#56](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/56), 
    [\#66](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/66), [\#68](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/68), 
    [\#71](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/71), [\#73](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/73),
    [\#85](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/85), [\#101](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/101),
    [\#104](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/104), [\#109](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/109),
    [\#114](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/114), [\#128](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/128),
    [\#130](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/130), [\#140](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/140),
    [\#141](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/141), [\#150](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/150),
    [\#203](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/203)

<br>

#### Project Management

* **Project management**:
    * Updated README and made UI mockup [\#62](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/62)
    * Closed some issues
