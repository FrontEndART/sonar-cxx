## SONARQUBE™ C++ Community plugin with SourceMeter support

*FrontEndART* **[SourceMeter](https://www.sourcemeter.com/)** is a command line source code analyzer tool, which can perform **deep static analysis** of the source code of complex software systems written in **C/C++**, **Java**, **Python**, and **RPG**. [FrontEndART](https://www.frontendart.com/) offers also a **free version** of SourceMeter.

This repository is a fork of the popular [SONARQUBE™ C++ Community plugin](https://github.com/SonarOpenCommunity/sonar-cxx) version [V0.9.5](https://github.com/SonarOpenCommunity/sonar-cxx/releases/tag/cxx-0.9.5) with a small modification of making it compatible with the [SourceMeter plug-in for SONARQUBE™ platform](https://github.com/FrontEndART/SonarQube-plug-in), by disabling the source code analysis engine, but preserving all other features.

Using the two plug-ins together has the advantage of using FrontEndART's high-end C/C++ source code analysis engine and the community plugin's nice additional [features](https://github.com/SonarOpenCommunity/sonar-cxx/wiki/Description---Features) together.

The following text is the original README of the community plugin.

---

## SonarQube C++ Community plugin

[SonarQube](https://www.sonarqube.org) is an open platform to manage code quality. This plugin
adds C++ support to this platform.


## Quickstart
1. Setup a SonarQube instance
2. Install the plugin (see [Installation](https://github.com/SonarOpenCommunity/sonar-cxx/wiki/Installation))
3. Run an analysis (see [Running the analysis](https://github.com/SonarOpenCommunity/sonar-cxx/wiki/Running-the-analysis))


## Resources
- [Latest release](https://github.com/SonarOpenCommunity/sonar-cxx/releases)
- [Documentation](https://github.com/SonarOpenCommunity/sonar-cxx/wiki)
- [Issue Tracker](https://github.com/SonarOpenCommunity/sonar-cxx/issues)
- [Continuous Integration Unix](https://travis-ci.org/SonarOpenCommunity/sonar-cxx)
- [Continuous Integration Windows](https://ci.appveyor.com/project/SonarOpenCommunity/sonar-cxx)
- [Sample project](https://github.com/SonarOpenCommunity/sonar-cxx/tree/master/sonar-cxx-plugin/src/samples/SampleProject)


## Alternatives:
That's not the only choice when if you're after C++ support in SonarQube: there is also 
the commercial [C++ plugin from SonarSource](http://www.sonarsource.com/products/plugins/languages/cpp/). 
Choose whatever fits your needs.

## Subscribe
Subscribe our [release feed](https://github.com/SonarOpenCommunity/sonar-cxx/releases.atom)
