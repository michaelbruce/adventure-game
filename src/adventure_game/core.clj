(ns adventure-game.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn move
  "I move the player to a new room"
  [x]
  (println x "Hello, World!"))

(defn game-loop [input]
  (prn input)
  (if (not (= "exit" input))
    (game-loop (read-line))
    (prn "Exiting...")))

(defn -main [& args]
  (game-loop "start"))

