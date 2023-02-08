import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import  VueRouter  from "vue-router";
import Vue from "vue";

Vue.use(VueRouter)

const routes = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
      meta: {requiresAuth: true}
    },
    {
      path: "/dashboard",
      name: "dashboard",
      component: () => import("../views/DashboardView.vue"),
      meta: {requiresAuth: true}

    },
  ],
});


const router = new VueRouter({
  routes
})

export default router;
