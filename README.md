# Labs
Repository for the coding labs and practice for 220418-USF-NEC-JavaReact batch.

Labs are a great way for you to get your hands onto the technology you are training on. Inside of this repository you will find coding prompts that correspond with the technology you are learning. Complete the tasks specifed and run the testing file to see if you have completed the lab.

# Cloning the Repository

To gain access to the lab questions, you will have to clone with repository into a folder on your computer

To do this follow these steps:

1. Create a folder to store the lab files
2. Click on the green `Code` button above
3. Copy the URL by clicking on the URL icon
4. Open a new Gitbash terminal in the folder you are storing the lab files
5. Run `git clone <url>` to clone this repository

You should now have a working copy of all the lab files, I will instruct when and how to do each of these labs, however there is still one more task you must do before starting on any lab.

You neeed to create your own branch to submit your work. No was permissions to push to the main branch.

To create your own branch to work off of follow these steps:
1. In the same Gitbash terminal from above change into the repository directory with `cd Labs`
2. Once in the Labs repository, in the Gitbash terminal, run the command `git checkout -b <firstname-lastname>` to create your working branch
3. In the Gitbash terminal run the command `git push --set-upstream origin <firstname-lastname>` this will push your new branch up to the Github hosted repository where I can see your work

# Completing the labs

These labs are for your benefit, please take advantage.

I will be giving you time to workon specified labs during training hours, if that is not enough time I highly recommend completing them during your flex hours.

As you complete each lab, be sure to commit and push your work up to the Github hosted repository

# Getting new lab content

I may add new labs/coding challenges for you all to complete, if that is the case you simply need to follow these steps to get access to the new content on your branch
1. Open a new Gitbash terminal in the folder where your branch is open
2. Run the command `git checkout main` to switch to the main branch
3. Run the command `git pull` to get the new content from the main branch, if you have mistakenly changed content in the main branch, you will have to `git stash` and attempt to pull again
4. After getting the new content run the command `git checkout <firstname-lastname>` to switch back to your working branch
5. Finally, run the command `git merge main` to merge the new content from the main branch into your working branch
6. Be sure to commit and push the new content your working branch hosted on Github


