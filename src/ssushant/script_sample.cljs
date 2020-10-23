(ns ssushant.script-sample)

(ns ^:figwheel-hooks ssushant.script-sample)

(defn ^:after-load re-render []
  (js/console.log "Hello Ssushant"))
