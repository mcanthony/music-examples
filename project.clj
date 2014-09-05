(defproject music-examples "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ;:jvm-opts ^:replace  []
  :jvm-opts 
  ^:replace
  ["-server"
   "-Xms256m" "-Xmx1g"           ; Minimum and maximum sizes of the heap
   "-XX:+UseG1GC"
   "-XX:MaxGCPauseMillis=10"     ; Specify a target of 20ms for max gc pauses
   "-XX:MaxNewSize=257m"         ; Specify the max and min size of the new
   "-XX:NewSize=256m"            ;  generation to be small
   "-XX:+UseTLAB"                ; Uses thread-local object allocation blocks. This
   ;  improves concurrency by reducing contention on
   ;  the shared heap lock.
   "-XX:MaxTenuringThreshold=0" ; Makes the full NewSize available to every NewGC 
   "-Xshare:off" 
   ] 

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [kunstmusik/pink "0.1.0-SNAPSHOT"]
                 [kunstmusik/score "0.2.0-SNAPSHOT"]
                 [incanter "1.5.4"]
                 ]
  :profiles  {
              :dev  {
                     :global-vars  {*warn-on-reflection* true}
                     }}

  )
