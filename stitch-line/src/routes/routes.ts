import { createWebHistory, createRouter } from "vue-router";

import Profile from "../screens/Profile.vue";
import Signup from "../screens/SignUp.vue";
import Signin from "../screens/SignIn.vue";
import { store } from "../store/store";
const routes = [
  {
    path: "/",
    redirect: {
      name: "Signin",
    },
  },
  {
    path: "/signup",
    name: "Signup",
    component: Signup,
  },
  {
    path: "/signin",
    name: "Signin",
    component: Signin,
  },
  {
    path: "/profile",
    name: "Profile",
    component: Profile,
    beforeEnter: (to: any, from: any, next: any) => {
      if (store.state.authenticated == false) {
        next("/signin");
      } else {
        next();
      }
    },
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
