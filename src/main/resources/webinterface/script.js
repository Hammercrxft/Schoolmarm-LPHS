async function getFromServer(item) {
    try {
        var request = await fetch("item_fetch?" + item, {
            method: "GET"
        });
        var body = await request.json();
        return body;
    } catch (error) {
        console.error(error);
        throw error;
        // Rethrow the error if needed
    }
}

//Checks for changes in data, and reload the page when changes are made.
var sessionDataVersion, checked_sdv;
getFromServer("internal_session_data_version").then(function(result) {
    sessionDataVersion = result;
});

//<div class="item">wa</div>
async function onOverview() {
    const SECTIONS_LIST = document.getElementById("sections_list");
    const TEACHERS_LIST = document.getElementById("teachers_list");
    var data_s = getFromServer("overview_sections");
    data_s.then(function(result) {
        for (let section of result.data) {
            console.log(section);
            SECTIONS_LIST.innerHTML = SECTIONS_LIST.innerHTML + "\n" + "<div class='item'>" + section + "</div>";
        }
    });
    var data_t = getFromServer("overview_teachers");
    data_t.then(function(result) {
        for (let section of result.data) {
            console.log(section);
            TEACHERS_LIST.innerHTML = TEACHERS_LIST.innerHTML + "\n" + "<div class='item'>" + section + "</div>";
        }
    });
}

async function onMasterList() {
    const SIZE_INDICATOR = document.getElementById("masterlist_size_indicator");
    const STUDENTS_LIST = document.getElementById("students_list");
    var data_i = getFromServer("master_size");
    data_i.then(function(result) {
        console.log(result.data);
        SIZE_INDICATOR.innerHTML = SIZE_INDICATOR.innerHTML + result;
    });
    var data_s = getFromServer("master_index");
    data_s.then(function(result) {
        for (let entry of result.data) {
            console.log(entry);
            STUDENTS_LIST.innerHTML = STUDENTS_LIST.innerHTML + "\n" + "<div class='item'>" + entry.name + "</div>";
        }
    });
}

function updateCheck() {
    setInterval(function() {
        getFromServer("internal_session_data_version").then(function(result) {
            checked_sdv = result;
        });
        if (checked_sdv !== sessionDataVersion) {
            sessionDataVersion = checked_sdv;
            switch (CONTEXT) {
            default:
                break;
            }
        }
        ;
    }, 1500);
}

const CONTEXT = window.location.pathname;
//const UPDATE_CHECK = setTimeout(updateCheck, 3000);

console.log("script.js loaded on context " + CONTEXT);

switch (CONTEXT) {
case "/index.html":
    break;
case "/overview.html":
    onOverview();
    break;
case "/masterlist.html":
    onMasterList();
    break;
}
