name := "scala-test-junit-5"
organization := "com.baeldung"

version := "1.0-SNAPSHOT"

resolvers += Resolver.jcenterRepo

libraryDependencies += "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test
