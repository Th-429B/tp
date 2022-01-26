---
layout: page
title: Toh Wang Bin's Project Portfolio Page
---
### Introduction

I am a software developer for Financial Advisor Smart Tracker (FAST). I was placed in charge of ensuring the testing of 
FAST. When I was developing FAST, I was a Year 2 Computer Science Undergraduate.

### Project Overview: Financial Advisor Smart Tracker (FAST)

Financial Advisor Smart Tracker (FAST) is a desktop address book application targeted at financial advisors, for
them to keep track of their clients as contacts. The user interacts with it using a CLI, and it has a GUI created with
JavaFX. It is written in Java, and has about 12 kLoC.

### Contributions to FAST

Given below are my contributions to the project.

#### New Features

* `Tag` command feature

    * **What it does**:<br>
    The `Tag` command allows users to intuitively edit the tags of their clients.
    Users can add their own tags to clients or delete them.
    They can also add or delete the newly added priority tags and investment plan tags.
    The tags will then be displayed on the GUI, as part of the `PersonCard`.

    * **Justification**:<br>
    While an existing command `edit` in AB3 already allows for the adding and deletion of tags,
    my team identified a need to make editing tags easier and simpler, as we were planning on
    augmenting the `tag` system, and the `edit` command handled too many parameters for it to be simple.
    As a result, I was tasked with the creation of the `tag` command.

    * **Highlights**: <br>
    Created the `tag` command, with only 2 operations: `add` and `delete`. This was so that the command would
    remain simple and easy to use for users. Inspiration for how the command was designed and created was taken
    from the pre-existing `edit` command, as it already had the functionality to delete and add tags. An improvement
    over the `edit` command is that it does not overwrite pre-existing tags not addressed by the command.

    * **Related PR**: 
      [\#120](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/120)
      

#### Enhancement to Existing Features

* `PriorityTags` and `InvestmentPlanTags` feature
  * **What it does**:<br>
    `PriorityTags` and `InvestmentPlanTags` are fixed types of tags, i.e. their name can not be edited by the user.
    They are used to assign a specific priority to a client, and to assign a specific investment plan to a client 
    respectively. These tags are also used by another feature `Statistics` to show relevant information to the user.

  * **Justification**:<br>
    This feature allows users to assign to their clients specific tags that further help them to categorise their 
    clients. These tags are also used by another new command `sort`, to help users quickly find clients with the
    respective priorities or investment plans.

  * **Highlights**: <br>
    These fixed tags are essentially tags and can be added or deleted similar to normal tags with the `add`, `edit` and
    `tag` command. In addition to the restraints placed on normal tags (including the fact that each user has only
    one instance of each unique tag), each user can only have one priority tag. For example, a user may not have
    both the `Low Priority` and `High Priority` tag concurrently.

  * **Related PR**:
    [\#78](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/78)
    [\#120](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/120)

<br>

#### Code Contribution

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2122s1.github.io/tp-dashboard/?search=trash-bin99&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2021-09-17&tabOpen=true&tabType=authorship&tabAuthor=trash-bin99&tabRepo=AY2122S1-CS2103T-T09-4%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false)

#### Documentation

* **User Guide**:
  * Added documentation for the feature `PriorityTag` and `InvestmentPlanTag`[\#116](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/116)
  * Added documentation for the feature `tag`[\#116](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/116)
  * Added `Structure of this Document` [\#132](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/132)
  * Augmented `How to use this user guide` section [\#132](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/132)
  * Overall language and format editing [\#132](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/132)

  <br>
* **Developer Guide**:
  * Added Use case UC18 [\#116](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/116)
  * Added implementation details and diagrams for Tagging feature [\#116](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/116),
    [\#227](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/227)
  * Added Manual Testing Section for `Tag` feature [\#227](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/227)
  * Added User stories [\#60](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/60)
  

#### Community
  * Updated SampleDataUtils [\#98](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/98)
  * Performed release of JAR file [v1.2](https://github.com/AY2122S1-CS2103T-T09-4/tp/releases/tag/v1.2)
  * Performed a demo of the application in Week 9
  * Helped to check the formatting of the UG [/#148](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/148)  
  * PRs reviewed (with non-trivial review comments): [\#77](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/77), 
    [\#117](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/117), 
    [\#127](https://github.com/AY2122S1-CS2103T-T09-4/tp/pull/127)
  
#### Project Management
  * Added user stories as issues in Github
  * Added and closed issues in Github  
