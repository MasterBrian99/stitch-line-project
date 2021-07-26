<template>
  <div class="">
    <h1 class="text-6xl font-bold">{{ title }}</h1>
    <p class="sign-up-as text-blue-600 text-2xl font-bold mt-4">{{ info }}</p>
    <button @click="onClicked">Hello</button>
  </div>
</template>

<script>
export default {
  name: "SignCard",
  props: {
    title: {
      String,
    },
    info: {
      String,
    },
  },
  methods: {
    onClicked() {
      this.$store.commit("setAuthenticated", true);
      console.log(this.$store.state.authenticated);
    },
  },
};
</script>

<style scoped>
.sign-up-as:before {
  background-color: #2563eb;
  content: "";
  display: inline-block;
  height: 2px;
  position: relative;
  vertical-align: middle;
  width: 5%;
}
</style>
