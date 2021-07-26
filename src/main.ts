import Vue, { createApp } from "vue";
import App from "./App.vue";
import router from "./routes/routes";
import Toast, { PluginOptions } from "vue-toastification";
import "vue-toastification/dist/index.css";
import axios from "axios";
import VueAxios from "vue-axios";
import "./index.css";

import { store } from "./store/store";

const myApp = createApp(App);
const options: PluginOptions = {
  // You can set your default options here
};
myApp.use(store);
myApp.use(router);
myApp.use(VueAxios, axios);
myApp.use(Toast, options);
myApp.mount("#app");

// createApp(App).use(Vuex, router).mount("#app");
