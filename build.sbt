organization in Global := "com.iheart"

name := "kanaloa"

lazy val root = (project in file(".")).configs(Testing.Integration)

crossScalaVersions := Seq("2.11.12", "2.12.8")

scalacOptions ++= List("-feature", "-deprecation", "-unchecked", "-Xlint")

Dependencies.settings

Format.settings

Publish.settings

Testing.settings
