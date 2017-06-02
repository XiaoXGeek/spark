name := "demo09"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.ManagedClasses