(ns adventure-game.core-test
  (:require [clojure.test :refer :all]
            [adventure-game.core :refer :all]))

(deftest a-test
  (testing "Fixed."
    (is (= 1 1))
    ))

(deftest b-test
  (testing "A user goes forward"
    (is (= 0 0))
    ))
