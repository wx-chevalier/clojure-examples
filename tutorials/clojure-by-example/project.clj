(defproject clojure_by_example "0.1.0-SNAPSHOT"
  :description "A workshop to introduce Clojure, to programmers new to Clojure."
  :url "https://github.com/inclojure-org/clojure-by-example"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  ;; Requirements: Java 8 or higher (recommended: Java 8 or Java 11)
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :local-repo ".m2-for-inclojure"
  :profiles {:dev {:dependencies [[org.clojure/data.json "2.4.0"]
                                  [enlive "1.1.6"]
                                  [rewrite-clj "1.1.46"]]}})
