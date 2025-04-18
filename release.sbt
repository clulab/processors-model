import ReleaseTransformations._

// we need this for the avg_export directory, which is not checked in
releaseIgnoreUntrackedFiles := true

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
