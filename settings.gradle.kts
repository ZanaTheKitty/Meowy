rootProject.name = "AliucordPlugins"

// This file sets what projects are included. Every time you add a new project, you must add it
// to the includes below.

// Plugins are included like this
include(
    "MyFirstCommand",
    "Clicker"
)

// This is required because plugins are in the ExamplePlugins/kotlin subdirectory.
//
// Assuming you put all your plugins into the project root, so on the same
// level as this file, simply remove everything below.
