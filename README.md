# Play framework + Angular 13 basic starter

This is a starter application that shows how Play works. And angular.

## Running

```
cd ng-frontend
npm install -g @angular/cli
npm install
ng build
cd ..
sbt run
```
And then go to http://localhost:9000 to see the running backend application (play framework, still contains and serves some FE for demo purposes).
To see angular part, go to http://localhost:9000/ng

# Play Hello World Web Tutorial for Java

To follow the steps in this tutorial, you will need the correct version of Java and a build tool. You can build Play projects with any Java build tool. Since sbt takes advantage of Play features such as auto-reload, the tutorial describes how to build the project with sbt.

Prerequisites include:

* Java Software Developer's Kit (SE) 11 or higher
* this package already includes an sbt distribution for your convenience.

To check your Java version, enter the following in a command window:

`java -version`

To check your sbt version, enter the following in a command window:

`sbt sbtVersion`

If you do not have the required versions, follow these links to obtain them:

* [Java SE](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [sbt](http://www.scala-sbt.org/download.html)

## Build and run the project

This example Play project was created from a seed template. It includes all Play components and an Akka HTTP server. The project is also configured with filters for Cross-Site Request Forgery (CSRF) protection and security headers.

To build and run the project:

1. Use a command window to change into the example project directory, for example: `cd play-java-hello-world-web`

2. Build the project. Enter: `sbt run`. The project builds and starts the embedded HTTP server. Since this downloads libraries and dependencies, the amount of time required depends partly on your connection's speed.

3. After the message `Server started, ...` displays, enter the following URL in a browser: <http://localhost:9000>

The Play application responds: `Welcome to the Hello World Tutorial!`

## sbt plugins

We've some 'need-to-have' plugins.

Try [Dependency update plugin](https://github.com/aiyanbo/sbt-dependency-updates) with `sbt dependencyUpdates` - will print out neat list of your project dependencies that have newer versions on maven/ivy/

Using [Dependency graph](https://github.com/sbt/sbt-dependency-graph) is as simple as `sbt dependencyBrowseGraph` - to view all of your project dependencies in nice graphical form in your browser.
