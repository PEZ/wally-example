# How to End to End test a web site from Clojure

> The missing [Wally](https://github.com/pfeodrippe/wally) manual 😀

Haha, no, I know [Wally](https://github.com/pfeodrippe/wally) is new, experimental, and subject to breaking changes. I just want to play with it and created this little example project to test it out.

Wally is a [Clojure](https://clojure.org) wrapper for [Playwright](https://playwright.dev/) (think Selenium/Cypress, but can be used from the Clojure REPL). Here's how to start navigating a web site from the Clojure REPL in a few steps:

1. Copy this project to your computer
1. Start the project REPL and connect your editor
1. Evaluate the forms in [src/e2e_test/example.clj](src/e2e_test/example.clj)

Yes, that's all there is to it. When you evaluate the first form in the Rich Comment of the example, Wally (or if it is Playwright, idk) will download Chromium and drivers and things, if needed. Chromium will start and open the jsonista library page on Clojars.

![image](https://user-images.githubusercontent.com/30010/228603083-9a800133-e5a2-4c81-9116-756aa92512ba.png)

The reset of the forms will have you clicking around and enter things on that page. Place the opened Chromium window and your editor window side by side.

## How to Start the project REPL and connect the editor?

This is not a guide teaching you how to do this. If you use Calva, it is only one step: Use the command: **Calva: Start the Project and Connect (a.k.a. Jack-in)**. The prerequisites for this are:

1. Have Java installed (I don't dare point at a way to do this, but I like [sdk-man](https://sdkman.io/) a lot myself)
1. Have [VS Code installed](https://code.visualstudio.com/download)
    1. Some [basic VS Code knowledge](https://code.visualstudio.com/docs/introvideos/basics)
1. Have Calva installed in VS Code
    1. Some [basic Calva knowledge](https://calva.io/getting-started/#theres-a-getting-started-repl)

## What about Clojure?

You don't need to know any Clojure, but of course that will make things really fun:

* [Get Started With Clojure](https://calva.io/get-started-with-clojure/)

## Happy E2E testing! ♥️

Please consider helping out with keeping this project usable as Wally is being shaped into its 1.0.0 form. Issues and PRs welcome!
