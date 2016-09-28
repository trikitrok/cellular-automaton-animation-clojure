(ns cellular-animation.runner
    (:require
      [doo.runner :refer-macros [doo-tests]]
              [cellular-animation.rules-test]
              [cellular-animation.evolution-test]))

(doo-tests
  'cellular-animation.rules-test
  'cellular-animation.evolution-test)
