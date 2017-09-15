(defproject mal "0.0.1-SNAPSHOT"
  :description "Make-A-Lisp"
  :plugins [[com.github.luxlang/lein-luxc "0.6.0-SNAPSHOT"]]
  :dependencies [[com.github.luxlang/luxc-jvm "0.6.0-SNAPSHOT"]
                 [com.github.luxlang/stdlib "0.6.0-SNAPSHOT"]]
  :test-paths ["tests"]
  :lux {:program {:jvm  "main"}}
  :source-paths ["source"]

  :profiles {:step0 {:lux {:program {:jvm  "step0_repl"}}}
             :step1 {:lux {:program {:jvm "step1_read_print"}}}
             :step2 {:lux {:program {:jvm "step2_eval"}}}
             :step3 {:lux {:program {:jvm "step3_env"}}}
             :step4 {:lux {:program {:jvm "step4_if_fn_do"}}}
             :step5 {:lux {:program {:jvm "step5_tco"}}}
             :step6 {:lux {:program {:jvm "step6_file"}}}
             :step7 {:lux {:program {:jvm "step7_quote"}}}
             :step8 {:lux {:program {:jvm "step8_macros"}}}
             :step9 {:lux {:program {:jvm "step9_try"}}}
             :stepA {:lux {:program {:jvm "stepA_mal"}}}}
)
