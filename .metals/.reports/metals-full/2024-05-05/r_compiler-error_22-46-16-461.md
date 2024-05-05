file:///C:/Users/swaro/OneDrive/Documents/GitHub/Scala/hello-world/src/main/scala/For.scala
### java.lang.NoClassDefFoundError: sourcecode/Name

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 73
uri: file:///C:/Users/swaro/OneDrive/Documents/GitHub/Scala/hello-world/src/main/scala/For.scala
text:
```scala
@main def test() =
    val names = List("akhil", "swarop")
    for i <i@@

```



#### Error stacktrace:

```
scala.meta.internal.tokenizers.XmlParser$Xml$.UnpStart(XmlParser.scala:48)
	scala.meta.internal.tokenizers.XmlParser$Xml$.Unparsed(XmlParser.scala:47)
	scala.meta.internal.tokenizers.XmlParser$Xml$.XmlContent(XmlParser.scala:43)
	scala.meta.internal.tokenizers.XmlParser.$anonfun$XmlExpr$1(XmlParser.scala:24)
	scala.meta.shaded.internal.fastparse.internal.RepImpls$.rec$4(RepImpls.scala:226)
	scala.meta.shaded.internal.fastparse.internal.RepImpls$.rep$extension(RepImpls.scala:266)
	scala.meta.shaded.internal.fastparse.package$ByNameOps$.rep$extension(package.scala:202)
	scala.meta.internal.tokenizers.XmlParser.XmlExpr(XmlParser.scala:24)
	scala.meta.internal.tokenizers.LegacyScanner.$anonfun$getXml$2(LegacyScanner.scala:903)
	scala.meta.shaded.internal.fastparse.SharedPackageDefs.parseInputRaw(SharedPackageDefs.scala:69)
	scala.meta.shaded.internal.fastparse.SharedPackageDefs.parseInputRaw$(SharedPackageDefs.scala:45)
	scala.meta.shaded.internal.fastparse.package$.parseInputRaw(package.scala:6)
	scala.meta.shaded.internal.fastparse.Parsed$Extra.trace(Parsed.scala:139)
	scala.meta.internal.tokenizers.LegacyScanner.getXml(LegacyScanner.scala:907)
	scala.meta.internal.tokenizers.LegacyScanner.fetchLT$1(LegacyScanner.scala:298)
	scala.meta.internal.tokenizers.LegacyScanner.fetchToken(LegacyScanner.scala:306)
	scala.meta.internal.tokenizers.LegacyScanner.nextToken(LegacyScanner.scala:214)
	scala.meta.internal.tokenizers.LegacyScanner.foreach(LegacyScanner.scala:982)
	scala.meta.internal.tokenizers.ScalametaTokenizer.uncachedTokenize(ScalametaTokenizer.scala:23)
	scala.meta.internal.tokenizers.ScalametaTokenizer.$anonfun$tokenize$1(ScalametaTokenizer.scala:16)
	scala.collection.concurrent.TrieMap.getOrElseUpdate(TrieMap.scala:962)
	scala.meta.internal.tokenizers.ScalametaTokenizer.tokenize(ScalametaTokenizer.scala:16)
	scala.meta.internal.tokenizers.ScalametaTokenizer$$anon$2.apply(ScalametaTokenizer.scala:331)
	scala.meta.tokenizers.Api$XtensionTokenizeDialectInput.tokenize(Api.scala:25)
	scala.meta.tokenizers.Api$XtensionTokenizeInputLike.tokenize(Api.scala:14)
	scala.meta.internal.pc.ScriptFirstImportPosition$.tokenize(ScriptFirstImportPosition.scala:70)
	scala.meta.internal.pc.ScriptFirstImportPosition$.infer(ScriptFirstImportPosition.scala:48)
	scala.meta.internal.pc.AutoImports$.forScalaSource$1$$anonfun$1(AutoImports.scala:327)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.pc.AutoImports$.forScalaSource$1(AutoImports.scala:338)
	scala.meta.internal.pc.AutoImports$.autoImportPosition$$anonfun$1(AutoImports.scala:381)
	scala.Option.orElse(Option.scala:477)
	scala.meta.internal.pc.AutoImports$.autoImportPosition(AutoImports.scala:381)
	scala.meta.internal.pc.AutoImports$.generator(AutoImports.scala:98)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:70)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:147)
```
#### Short summary: 

java.lang.NoClassDefFoundError: sourcecode/Name