import ReleaseTransformations._

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("publishSigned"),
//  releaseStepCommandAndRemaining("publish"),
//  releaseStepCommandAndRemaining("publishLocal"),
  setNextVersion,
  commitNextVersion,
  pushChanges
)
