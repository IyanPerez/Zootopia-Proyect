<script setup></script>

<template>
  <div class="table-responsive" id="Table">
    <div id="Caption-Align">
      <h2>Animals List</h2>
      <button id="buttonAdd">ADD NEW ANIMAL</button>

      <div id="Filter-By-Align">
        <label class="dropdown">
          <div class="dd-button">Filter By</div>

          <input type="checkbox" class="dd-input" id="test" />

          <ul class="dd-menu">
            <li>Family</li>
            <li>Origin Country</li>
          </ul>
        </label>
      </div>
    </div>
  </div>
  <div class="info-container">
    <div class="info-table">
      <table class="table" id="table-top">
        <tr class="tr-list">
          <th>Name</th>
          <th>Type</th>
          <th>Gender</th>
          <th>Family</th>
          <th>Date of Ingress</th>
        </tr>
      </table>
    </div>
  </div>
</template>

<style lang="scss" scoped>
@import "../assets/sass/variables";

#Table {
  display: flex;
  justify-content: center;
  overflow: visible;
  margin: 15px 0 20px 0;
}
.table-responsive {
  #Caption-Align {
    width: 90%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    h2 {
      font-size: 30px;
    }
    #buttonAdd {
      border-radius: 8px;
      background-color: $QuinaryColor;
      border: 3px solid;
      height: 4rem;
      width: 14rem;
    }
    #Filter-By-Align {
      .dropdown {
        display: inline-block;
        position: relative;
        .dd-button {
          display: inline-block;
          border: 1px solid gray;
          border-radius: 4px;
          padding: 10px 30px 10px 20px;
          background-color: #44ff57;
          cursor: pointer;
          white-space: nowrap;
        }
        .dd-button:after {
          content: "";
          position: absolute;
          top: 50%;
          right: 15px;
          transform: translateY(-50%);
          width: 0;
          height: 0;
          border-left: 5px solid transparent;
          border-right: 5px solid transparent;
          border-top: 5px solid black;
        }
        .dd-button:hover {
          background-color: #eeeeee;
        }
        .dd-input {
          display: none;
        }
        #test {
        }
        .dd-menu {
          position: absolute;
          top: 100%;
          border: 1px solid #ccc;
          border-radius: 4px;
          padding: 0;
          margin: 2px 0 0 0;
          box-shadow: 0 0 6px 0 rgba(0, 0, 0, 0.1);
          background-color: #ffffff;
          list-style-type: none;
          li {
            padding: 10px 20px;
            cursor: pointer;
            white-space: nowrap;
          }
          li:hover {
            background-color: #f6f6f6;
          }
        }
      }
    }
  }
}

.info-container {
  display: flex;
  justify-content: center;
  .info-table {
    width: 90%;
    .table {
      .tr-list {
        width: 90%;
        th {
          color: $thColor;
        }
      }
    }
  }
}

.dd-input + .dd-menu {
  display: none;
}

.dd-input:checked + .dd-menu {
  display: block;
}
</style>
