name := "module-main"

version := "1.0"

scalaVersion := "2.11.7"

lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.11.7"
)

lazy val `module-sub` = (project in file("module-sub"))
  .settings(commonSettings: _*)
  .settings(
    // other settings
  )

lazy val core = (project in file("core"))
  .settings(commonSettings: _*)
  .settings(
    // other settings
  )
  .dependsOn(`module-sub`)
