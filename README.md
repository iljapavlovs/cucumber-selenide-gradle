cucumber-selenide
=================

Simple demonstration how to test javascript applications with Selenide and Cucumber.

One simple scenario for [Ember.js todo app](http://todomvc.com/architecture-examples/emberjs/) is provided.

With [Selenide](http://selenide.org/) there is no need to create standard 
[PageObject](https://code.google.com/p/selenium/wiki/PageObjects) 
so just simple helper with static methods is used instead.
Also if pure javascript application (like [Ember.js](http://emberjs.com/))
is tested there is high probability that object content will be changed and browser
will stay on the same URL, so PageObject is not adaptable enough for this kind of applications.


