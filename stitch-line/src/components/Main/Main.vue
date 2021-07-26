<template>
  <div class="container flex justify-between">
    <div class="main-content">
      <SignUpForm />
    </div>
    <div class="main-content">
      <img src="../../assets/support-team.svg" alt="" class="w-96" />
    </div>
  </div>
</template>

<script lang="ts">
import SignUpForm from "../Form/SignUpForm.vue";
export default {
  name: "Main",
  components: {
    SignUpForm,
  },
};
</script>

<style></style>
