rootProject.name = "freedao"

include("freedao-core")
include("freedao-processor-core")
include("freedao-processor-classic")
include("freedao-processor-spring")
include("freedao-runtime-classic")
include("freedao-spring-boot-starter")
include("tests:unit")
include("tests:spring-boot-integrate")


enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
