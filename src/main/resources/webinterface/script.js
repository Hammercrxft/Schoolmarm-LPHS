function getFromServer(item){
    fetch("item_fetch?"+item)
  .then(function (response) {
    return response.json();
  })
  .catch(function (error) {
    console.log("Error:", error);
  });
}

var sessionDataVersion = getFromServer("internal_session_data_version");

function updateCheck() {
    var n = getFromServer("internal_session_data_version");
    if (n !== sessionDataVersion){
        sessionDataVersion = n;
        switch(CONTEXT){
                
        }
    }
}

const CONTEXT = window.location.pathname;
const UPDATE_CHECK = setInterval(updateCheck, 4000);

console.log("script.js loaded");
console.log(CONTEXT);