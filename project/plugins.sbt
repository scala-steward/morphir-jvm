addSbtPlugin("ch.epfl.scala"                     % "sbt-bloop"                     % "1.4.13")
addSbtPlugin("ch.epfl.scala"                     % "sbt-scalafix"                  % "0.9.34")
addSbtPlugin("com.eed3si9n"                      % "sbt-buildinfo"                 % "0.11.0")
addSbtPlugin("com.github.sbt"                    % "sbt-unidoc"                    % "0.5.0")
addSbtPlugin("com.github.sbt"                    % "sbt-ci-release"                % "1.5.10")
addSbtPlugin("com.github.cb372"                  % "sbt-explicit-dependencies"     % "0.2.16")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings"              % "3.0.2")
addSbtPlugin("com.typesafe"                      % "sbt-mima-plugin"               % "1.0.1")
addSbtPlugin("de.heikoseeberger"                 % "sbt-header"                    % "5.6.5")
addSbtPlugin("org.portable-scala"                % "sbt-scala-native-crossproject" % "1.2.0")
addSbtPlugin("org.portable-scala"                % "sbt-scalajs-crossproject"      % "1.2.0")
addSbtPlugin("org.scala-js"                      % "sbt-scalajs"                   % "1.9.0")
addSbtPlugin("org.scala-native"                  % "sbt-scala-native"              % "0.4.4")
addSbtPlugin("org.scalameta"                     % "sbt-mdoc"                      % "2.3.1")
addSbtPlugin("org.scalameta"                     % "sbt-scalafmt"                  % "2.4.6")
addSbtPlugin("pl.project13.scala"                % "sbt-jcstress"                  % "0.2.0")
addSbtPlugin("pl.project13.scala"                % "sbt-jmh"                       % "0.4.3")
addSbtPlugin("com.timushev.sbt"                  % "sbt-updates"                   % "0.6.2")

libraryDependencies += "org.snakeyaml" % "snakeyaml-engine" % "2.3"
