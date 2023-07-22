(ns app
  (:require ["moment$default" :as moment]
            ["inquirer$default" :as inquirer]
            [promesa.core :as p]))

(println "Questionaire ")

(def questions (clj->js[{ :name "name" 
                          :type "input"
                          :message "Who's birthday is it?"}]))

(p/let [answers (inquirer/prompt questions)]
  (println answers)) 

(comment
  moment () .year ()
  (.year (moment))
  )
