---
layout: page
title: Calvin Tan's Project Portfolio Page
---

### Introduction

I am a software developer for Financial Advisor Smart Tracker (FAST). I was in-charge of the Documentation and the UI
component of FAST.
At the time of developing FAST, I was a Year 2 Computer Science Undergraduate.

---

### Project Overview: Financial Advisor Smart Tracker (FAST)

Financial Advisor Smart Tracker (FAST) is a desktop application targeted at financial advisors, for
them to keep track of their clients as contacts. The user interacts with it using a CLI, and it has a GUI created with
JavaFX. It is written in Java, and has about 12 kLoC.

---

### Contributions to FAST

Given below are my contributions to the project.

#### New Features

* **New Feature**: `Stats` feature.

    * **What it does**:<br>
      The `Stats` window gives the user an overview of their clients in the form of a pie chart. 
      Currently, the data points used are the Priority Tags and Investment Plan Tags.

  <br>

    * **Justification**: <br>
      The `Stats` window allows FAs to quickly see information about their client base in a visual manner. This removes the need for the FAs
      to manually keep track of their client's Priority or Investment Plan, especially if the user has many clients, and it becomes hard to keep track manually. 

  <br>

    * **Highlights**: <br>
      The `Stats` window uses `JavaFX::PieChart`, which was hard to work with as there were many unexpected behaviors and was hard to test/debug. 
      Moreover, there were many small CSS bugs which made the `JavaFX::PieChart` not appear as intended.
      I had to write utility methods to ensure the data passed to the Pie Chart was correct. 

  <br> 

    * **Related PR**: [\#111](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/111), [\#139](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/139)


#### Enhancement to Existing Features
<br> 

* **Enhancements to existing features**:`help` feature.

    * **What it does**:<br>
      The `help` window previously only showed a simple URL to FAST's user guide. Currently, it allows users to view
      most of the command usage and other help topics from within FAST. For each help topic, users can view
      its intended usage and parameters to input. Users can quickly jump between help topics from
      within the help window itself.

  <br>

    * **Justification**: <br>
      By having most of the necessary parameters built-in, this removes the need for internet access and having
      to launch their browser to view help for FAST, thus making it faster to use and more convenient.

  <br>

    * **Highlights**: <br>
      Users can use the `help` command to directly access the help topic they want. This works even if an existing `help` window
      is opened. Help window uses many JavaFX components like `ComboBox`, listeners and eventHandlers to ensure that user input
      is properly detected.
      
    <br> 
    <br> 

    * **Related PR**: [\#80](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/80), [\#95](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/95),
      [\#134](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/134)

#### Code Contribution

* [RepoSense link](https://nus-cs2103-ay2122s1.github.io/tp-dashboard/?search=&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2021-09-17&tabOpen=true&tabType=authorship&tabAuthor=Cyn7hius&tabRepo=AY2122S1-CS2103T-T09-4%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other&authorshipIsBinaryFileTypeChecked=false)


### Documentation

* **User Guide**:
    * Added introduction section [\#126](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/126)
    * Added documentation for help window [\#111](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/111) [\#142](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/142)
    * Added documentation for stats window [\#111](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/111) [\#142](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/142)



* **Developer Guide**:

    * Added UC16 and UC17 [\#118](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/118)
    * Added implementation details and design consideration for help window [\#118](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/118)
        * Added activity diagram and sequence diagram for help window [\#224](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/224)
    * Added implementation details and design consideration for stats window [\#118](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/118)
        * Added sequence diagram for stats window [\#224](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/224)
    * Added manual testing for help, stats and saving data [\#224](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/224)
    
### Community

* **Community**:
    * Fixed bugs from PE-D [/#208](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/208)
    * Released [JAR v1.3.1](https://github.com/AY2122S1-CS2103T-T09-4/tp/releases/tag/v1.3.1)
    * User guide: General language + structural adjustments
        * Improved language to be more user-centric [\#126](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/126) [\#146](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/146)
        * Adjusted the structure of the UG to be more readable [\#142](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/142)
        * Misc formatting, adding links to various sections [\#126](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/126)
    * PRs reviewed with non-trivial review comments:
        * [\#70](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/70)
        * [\#91](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/91)
        * [\#110](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/110)
    

    
