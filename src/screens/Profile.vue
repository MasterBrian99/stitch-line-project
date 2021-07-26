<template>
  <BackgroundCircle />
  <div class="main flex flex-col items-center justify-center">
    <h1 class="text-3xl font-bold">
      Hello, this is {{ $route.params.user }} Profile
    </h1>
  </div>
</template>

<script>
import BackgroundCircle from "../components/BackgroundCircle/BackgroundCircle.vue";
export default {
  name: "Profile",
  props: ["user"],
  components: {
    BackgroundCircle,
  },
};
</script>

<style></style>
