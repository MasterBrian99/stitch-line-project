import { createStore } from "vuex";

export const store = createStore({
  state: {
    authenticated: false,
  },
  mutations: {
    setAuthenticated(state: any, status: any) {
      state.authenticated = status;
    },
  },
});
