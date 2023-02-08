<script setup>
import Graph from "../components/Graph.vue";
import Sidebar from "../components/Sidebar.vue";
import TableComponent from "../components/TableComponent.vue";
import TableDetails from "../components/TableDetails.vue";
</script>
<template>
  <div class="dashboard-container">
    <Sidebar />
    <div class="dashboard-list">
      <Graph />
      <TableDetails />
      <TableComponent />
    </div>
  </div>
</template>
<style lang="scss" scoped>
.dashboard-container {
  display: flex;
  .dashboard-list{
     width: 100%;
  }
}
</style>
