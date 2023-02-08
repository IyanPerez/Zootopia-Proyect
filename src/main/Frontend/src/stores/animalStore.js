import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export const useAnimalsStore = defineStore('animals', () => {
  const animals = ref([])

  async function fetchAnimals(){
    await fetch("localhost:8080/api/animals") 
    .then((res) => res.json())
    .then((json) => {
      this.animals = json;
    } )
  }
  return { animals, fetchAnimals }
})
