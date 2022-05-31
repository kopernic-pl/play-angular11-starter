lazy val root = (project in file("."))
  .enablePlugins(PlayJava, PlayAkkaHttp2Support)
  .settings(
    name := """play-angular-starter""",
    version := "1.0-SNAPSHOT",
    maintainer := "mateusz.wronski@nokia.com",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      guice,
      // Test Database
      "com.h2database" % "h2" % "2.1.212",
      // Testing libraries for dealing with CompletionStage...
      "org.assertj" % "assertj-core" % "3.22.0" % Test,
      "org.awaitility" % "awaitility" % "4.2.0" % Test,
    ),
    javacOptions ++= Seq(
      "-encoding", "UTF-8",
      "-parameters",
      "-Xlint:unchecked",
      "-Xlint:deprecation",
      "-Werror"
    ),
    // Make verbose tests
    testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
  )
