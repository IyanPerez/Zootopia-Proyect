<script setup>
import { RouterLink } from "vue-router";
</script>

<template>
  <div class="box">
    <div class="title">
      <img src="../assets/img/Logo.png" alt="Logo" />
      <h2>Welcome to the jungle!</h2>
    </div>
    <div class="form">
      <label for="username"
        >Username
        <input
          id="username"
          type="text"
          value="Enter your Username"
          onfocus="this.value=''"
          required
        />
      </label>
      <label for="password"
        >Password
        <input
          id="password"
          type="text"
          value="Enter your Password"
          onfocus="this.value=''"
          required
        />
      </label>
    </div>
    <div class="foot">
      <h3>Did you forget your password?</h3>
      <button>
        <router-link to="/dashboard" class="login">Login</router-link>
      </button>
    </div>
  </div>
</template>

<style lang="scss" scoped>
@import "../assets/sass/styles.scss";

.box {
  margin-left: 2rem;
  display: flex;
  flex-direction: column;
  background-color: #edb846d7;
  border-radius: 1.5rem;
  border: 2px solid white;
  padding-inline: 3%;
  padding-block: 2%;

  .title {
    display: flex;
    img {
      width: 4rem;
      margin-right: 2vw;
    }
    h2 {
      margin-top: 0.7rem;
      font-size: 2rem;
      text-decoration: underline solid black 2px;
    }
  }
  .form {
    display: flex;
    flex-direction: column;
    align-items: flex-end;
    gap: 1.5rem;
    width: 100%;
    margin-top: 0.5rem;
    label {
      width: 100%;
    }
    input {
      width: 100%;
      border: none;
      border-radius: 0.3rem;
      padding: 0.7rem;
      box-shadow: 2px 2px 2px rgb(0, 0, 0);
      color: rgb(168, 168, 168);
    }
  }
  .foot {
    display: flex;
    justify-content: space-between;
    width: 100%;
    margin-top: 2rem;
    h3 {
      font-size: 14px;
      align-self: center;
      justify-self: flex-end;
      text-decoration: underline solid rgb(0, 106, 255) 2px;
      color: rgb(0, 106, 255);
    }
    button {
      background-color: green;
      color: white;
      border-radius: 10rem;
      border: 4px solid black;
      font-size: 24px;
      padding-inline: 2.5rem;
      padding-block: 0.2rem;
      box-shadow: 2px 2px 2px rgb(77, 77, 77);
    .login{
        text-decoration: none;
        color: white;
    }
    }
  }
}
</style>
