(defproject mal "0.0.1-SNAPSHOT"
  :description "Make-A-Lisp"
  :plugins [[com.github.luxlang/lein-luxc "0.6.0-SNAPSHOT"]]
  :dependencies [[com.github.luxlang/luxc-jvm "0.6.0-SNAPSHOT"]
                 [com.github.luxlang/stdlib "0.6.0-SNAPSHOT"]]
  :test-paths ["tests"]
  :lux {:program {:jvm  "main"}}
  :source-paths ["source"]

  :profiles {:step0 {:jar-name "step0_repl.jar"
                     :lux {:program {:jvm "step0_repl"}}}
             :step1 {:jar-name "step1_read_print.jar"
                     :lux {:program {:jvm "step1_read_print"}}}
             :step2 {:jar-name "step2_eval.jar"
                     :lux {:program {:jvm "step2_eval"}}}
             :step3 {:jar-name "step3_env.jar"
                     :lux {:program {:jvm "step3_env"}}}
             :step4 {:jar-name "step4_if_fn_do.jar"
                     :lux {:program {:jvm "step4_if_fn_do"}}}
             :step5 {:jar-name "step5_tco.jar"
                     :lux {:program {:jvm "step5_tco"}}}
             :step6 {:jar-name "step6_file.jar"
                     :lux {:program {:jvm "step6_file"}}}
             :step7 {:jar-name "step7_quote.jar"
                     :lux {:program {:jvm "step7_quote"}}}
             :step8 {:jar-name "step8_macros.jar"
                     :lux {:program {:jvm "step8_macros"}}}
             :step9 {:jar-name "step9_try.jar"
                     :lux {:program {:jvm "step9_try"}}}
             :stepA {:jar-name "stepA_mal.jar"
                     :lux {:program {:jvm "stepA_mal"}}}}
  )
