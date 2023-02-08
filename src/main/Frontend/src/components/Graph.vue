<script setup>
import { ref, computed } from "vue";
import { DoughnutChart } from "vue-chart-3";
import { Chart, DoughnutController, ArcElement } from "chart.js";

Chart.register(DoughnutController, ArcElement);

const dataValues = ref([10, 70, 100, 80, 90]);

const data = computed(() => ({
  labels: ["Félidos", "Cánidos", "Reptiles", "Mustelids", "Leporidae"],

  datasets: [
    {
      data: dataValues.value,
      backgroundColor: ["#2BEBC8", "#694BDB", "#FF7777", "#FFBB77", "#53B353"],
    },
  ],
}));


</script>
<template>
  <DoughnutChart
    :chart-data="data"
    :options="options"
    css-classes="chart-container"
  />
</template>
