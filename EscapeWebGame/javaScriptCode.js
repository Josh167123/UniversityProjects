
let currentHair = 0;
let hairstyles=["", "images/ShortBrown.png", "images/ShortBlond.png", "images/ShortBlack.png", "images/LongBrown.png", "images/LongBlonde.png", "images/LongBlack.png",];
let hairRun=["", "images/ShortBrownRun.gif", "images/ShortBlondRun.gif", "images/ShortBlackRun.gif", "images/LongBrownRun.gif", "images/LongBlondeRun.gif", "images/LongBlackRun.gif", ];
let currentOutfit = 0;
let outfits=["", "images/Suit.png", "images/Thief.png"];
let outfitRun=["", "images/SuitRun.gif", "images/ThiefRun.gif"];
let timerWidth = 80;
let timer;
sessionStorage.setItem("timerInterval", 4/15);

function reduceTimer(){
    if(timerWidth>0){
        if(timerWidth<5){
            let siren = new Audio("audio/siren.wav");
            siren.play();
        }
        timerWidth -= sessionStorage.getItem('timerInterval');
        sessionStorage.setItem('timeRem', timerWidth);
        document.getElementById('carTimer').style.paddingLeft=timerWidth+'%';
        document.getElementById('bankTimer').style.paddingRight=timerWidth+'%';
    }
    else{
        sessionStorage.setItem('success', '2');
        nextPage("PaperClip.html");
        clearInterval(timer);
    }
}

function startTimer(){
    timerWidth = sessionStorage.getItem('timeRem');
    timer = setInterval(reduceTimer, 1000);
}

function setUp(){
    if(sessionStorage.getItem('outfit')==2){
       sessionStorage.setItem("timerInterval", 4/9);
    }
    else if(sessionStorage.getItem('outfit')==0){
        sessionStorage.setItem("timerInterval", 4/3);
    }
    timerWidth = sessionStorage.getItem('timeRem');
    try{
      document.getElementById('bank').innerHTML = sessionStorage.getItem('bankName');  
    }
    catch{
        //pass
    }
    try{
        document.getElementById('carTimer').style.paddingLeft=timerWidth+'%';
        document.getElementById('bankTimer').style.paddingRight=timerWidth+'%';
    }
    catch{
        //pass
    }
    document.body.style.fontSize = sessionStorage.getItem('fontSize');
    if(sessionStorage.getItem('mode')=='dark'){
        darkMode();
    }
    try{
        document.getElementById('blueKey').style.display=sessionStorage.getItem('blueKeyDisplay');
        document.getElementById('redKey').style.display=sessionStorage.getItem('redKeyDisplay');
        document.getElementById('yellowKey').style.display=sessionStorage.getItem('yellowKeyDisplay');
        document.getElementById('greenKey').style.display=sessionStorage.getItem('greenKeyDisplay');
    }
    catch{
        let keys = document.getElementsByClassName('keyButton');
        for(i=0; i<keys.length; i++){
            keys[i].style.display="none";
        }
    }
}

function nextPage(page) {
    sessionStorage.setItem('fontSize', sessionStorage.getItem('fontSize')); 
    sessionStorage.setItem('mode', sessionStorage.getItem('mode'));
    sessionStorage.setItem('timeRem', sessionStorage.getItem('timeRem'));
    window.open(page, "_self");
}

function finalPage(page){
    sessionStorage.setItem('fontSize', sessionStorage.getItem('fontSize')); 
    sessionStorage.setItem('mode', sessionStorage.getItem('mode'));
    window.open(page, "_self");
}

function tempPage(){
    let page = 'corridor.html';
    document.getElementById('base').src="images/Player Run.gif";
    document.getElementById('outfit').src=outfitRun[sessionStorage.getItem('outfit')];
    document.getElementById('hair').src=hairRun[sessionStorage.getItem('hair')];
    sessionStorage.setItem('fontSize',sessionStorage.getItem('fontSize')); 
    sessionStorage.setItem('mode', sessionStorage.getItem('mode'));

    if(sessionStorage.getItem('door') == "front"){
        if(sessionStorage.getItem('outfit')==0){
            sessionStorage.setItem('success', '1');
            finalPage("PaperClip.html");
            clearInterval(timer);
        }
        else{
            document.getElementById('storyIntro').innerHTML = "You walk in the front door and start heading towards the back corridor";
            setTimeout(function(){window.open(page, "_self")}, 3000); 
        }
        
    }
    else{
        document.getElementById('storyIntro').innerHTML = "You slowly sneak your way to the back of the bank and make your way to the corridor. It takes some time, but you make it in successfully.";
        setTimeout(function(){window.open(page, "_self")}, 5000); 
    }
}

function changeMode(){
    let selected = document.getElementById('mode').value;

    if (selected == 'light'){
        sessionStorage.setItem('mode', 'light');
        document.body.style.backgroundColor = 'white';
        document.body.style.color = 'black';

        let menuBar = document.getElementById('MenuBar');
        let items = menuBar.getElementsByTagName('ul');

        for(i=0; i<items.length; i++){
            items[i].style.backgroundColor = 'rgb(81, 117, 224)';
            items[i].style.color = 'white';
        }
        let buttons = document.getElementsByClassName('option');
        for(i=0; i<buttons.length; i++){
            buttons[i] .style.backgroundColor = 'rgb(81, 117, 224)';
            buttons[i].style.color = 'white';
            buttons[i].style.boxShadow =  "5px 10px #888888";
        }
    }
    else if (selected == 'dark'){
        sessionStorage.setItem('mode', 'dark');
        darkMode();
    }
}

function darkMode(){
    document.body.style.backgroundColor = 'rgb(49, 53, 53)';
    document.body.style.color = 'white';

    try{
        let menuBar = document.getElementById('MenuBar');
        let items = menuBar.getElementsByTagName('ul');
    
        for(i=0; i<items.length; i++){
            items[i].style.backgroundColor = 'rgb(2, 2, 128)';
        }
    }
    catch{
        //pass
    }
    
    try{
        let buttons = document.getElementsByClassName('option');
        for(i=0; i<buttons.length; i++){
            buttons[i] .style.backgroundColor = 'rgb(2, 2, 128)';
            buttons[i].style.boxShadow =  "5px 10px black";
        }
    }
    catch{
        //pass
    }

    try{
        let input = document.getElementsByClassName('input');
        for(i=0; i<input.length; i++){
            input[i].style.boxShadow =  "5px 10px black";
        }
    }
    catch{
        //pass
    }
}

function resizeFont(){
    let selected = document.getElementById('textSize').value;

    sessionStorage.setItem('fontSize',selected);
    document.body.style.fontSize = selected;
}

function quit(){
    clearInterval(timer);
    sessionStorage.setItem('timeRem', 80);
    sessionStorage.setItem('money', 0);
    sessionStorage.removeItem('blueKeyDisplay');
    sessionStorage.removeItem('redKeyDisplay');
    sessionStorage.removeItem('yellowKeyDisplay');
    sessionStorage.removeItem('greenKeyDisplay');
    nextPage('MainMenu.html');
    let keys = document.getElementsByClassName('keyButton');
    for(i=0; i<keys.length; i++){
        keys[i].style.display="none";
    }
}

function changeHair(changeBy){
    currentHair += changeBy;

    if(currentHair<0){
        currentHair = 6;
    }
    else if(currentHair>6){
        currentHair = 0;
    }

    document.getElementById('hair').src=hairstyles[currentHair];
}

function changeOutfit(changeBy){
    currentOutfit += changeBy;

    if(currentOutfit<0){
        currentOutfit = 2;
    }
    else if(currentOutfit>2){
        currentOutfit = 0;
    }

    document.getElementById('outfit').src=outfits[currentOutfit];

    if(currentOutfit==0){
        document.getElementById('description').innerHTML="I don't recommend doing this with no clothes, but I guess I can't stop you...<br>-You will have a lot less time to rob the bank<br>-You can carry much less cash than normal<br>-There really are no benefits to this";
    }
    else if(currentOutfit==1){
        document.getElementById('description').innerHTML="With a fancy business suit like this, you'll blend right in!<br>-You will have more time to rob the bank<br>-Stuffing money into your breifcase might take longer than normal";
    }
    else if(currentOutfit==2){
        document.getElementById('description').innerHTML="Classic robber's clothes make stealing easy! It even comes with a burlap sack for your money!<br>-You will have less time to rob the bank<br>-You can carry more money than normal";
    }
}

function validateName(){
    event.preventDefault();
    let name = document.forms["playerName"]["nameInput"].value;
    if(name == ""){
        document.getElementById('blankName').style.display="block";
        return false;
    }
    else{
        document.getElementById('blankName').style.display="none";
        sessionStorage.setItem("playerName", name);
        return true;
    }
}

function validateBank(){
    event.preventDefault();
    let bank = document.forms["bankName"]["bankInput"].value;
    if(bank == ""){
        document.getElementById('blankBank').style.display="block";
        return false;
    }
    else{
        document.getElementById('blankBank').style.display="none";
        sessionStorage.setItem("bankName", bank);
        return true;
    }
}

function startGame(){
    validateName();
    validateBank();
    sessionStorage.setItem("unlocked", "false");
    
    if(validateName() && validateBank()){
        sessionStorage.setItem('timeRem', 80);
        sessionStorage.setItem('outfit', currentOutfit);
        sessionStorage.setItem('hair', currentHair);
        nextPage('Entrance.html');
    }
}

function showPassword() {
    let password = document.getElementById("enterPassword");
    if (x.style.display === "none") {
      x.style.display = "block";
    } else {
      x.style.display = "none";
    }
  } 

  function validatePassword() {
    let password = 'password';
    let answer = document.getElementById('passEntry').value;
    if(answer == password){
        sessionStorage.setItem("unlocked", "true");
        nextPage("Room_1.html");
    }
    else{
        document.getElementById('incorrect').innerHTML = "* Incorrect Password";
    }
}

function checkPass() {
    let correctPassword = '1234';
    let entry = document.getElementById('passEntry').value;
    if(entry == correctPassword){
        nextPage("InsideVault.html");
    }
    else{
        document.getElementById('incorrect').innerHTML = "* Incorrect Password";
    }
}

function inspectFilingCabinets(){
    document.getElementById('storyIntro').innerHTML = "Searching through the filing cabinets you find a red key.";
    document.getElementById('redKey').style.display="inline";
    sessionStorage.setItem('redKeyDisplay', 'inline');
    document.getElementById('room1Image').src = "images/Room 1.png";
   
}

function unlockedMonitor() {
    document.getElementById('storyIntro').innerHTML = "The monitor is unlocked. The email reads:<br>'For security reasons we cannot disclose the full new passcode here. Digits the first digits are: 12'";
    document.getElementById('room1Image').src = "images/MonitorUnlocked.png";

}

function inspectMonitor(){
    nextPage('MonitorPassword.html');
        
}

function inspectKeyboard(){
    document.getElementById('storyIntro').innerHTML = "You lift up the keyboard and find nothing.";
    document.getElementById('room1Image').src = "images/Room 1.png";
}

function inspectPlantPots() {

    document.getElementById('storyIntro').innerHTML = "Digging through the plant pots you find a blue key.";
    document.getElementById('blueKey').style.display="inline";
    sessionStorage.setItem('blueKeyDisplay', 'inline');
    document.getElementById('room1Image').src = "images/Room 1.png";
}

function inspectDrawers() {

    document.getElementById('storyIntro').innerHTML = "Searching through the desk drawers you find nothing.";
    document.getElementById('room1Image').src = "images/Room 1.png";
}


function inspect(){
    let selected = document.getElementById('inspect').value;
    if (selected == 'monitor'){
        if(sessionStorage.getItem("unlocked") == "false"){   
            inspectMonitor();
        } else if (sessionStorage.getItem("unlocked") == "true") {
            unlockedMonitor();
        }
    }
    else if (selected == 'keyboard'){
       inspectKeyboard();
    }
    else if (selected == 'plantPots') {
        inspectPlantPots();
    }
    else if (selected == 'filingCabinets'){
       inspectFilingCabinets();
    }
    else if (selected == 'deskDrawers'){
       inspectDrawers();
    }
}

function takeMoney(){
    let score = parseInt(sessionStorage.getItem('money'));
    let timePenalty;
    if(sessionStorage.getItem('outfit')==0){
        timePenalty = 10;
    }
    else if(sessionStorage.getItem('outfit')==1){
        timePenalty = 7;
    }
    else{
        timePenalty = 3;
    }
    
    score += 5000;
    sessionStorage.setItem('money', score);
    let cash = new Audio("audio/money.wav");
            cash.play();

    document.getElementById('money').innerHTML=sessionStorage.getItem('money');
    timerWidth -= timePenalty*sessionStorage.getItem('timerInterval');
    sessionStorage.setItem('timeRem', timerWidth);
}


function newspaper(){
    if(sessionStorage.getItem('success') == '3'){
        document.getElementById('base').src="images/BankIcon.png";
        document.getElementById('base').style.height = '18em';
        document.getElementById('Headline').innerHTML = "Unknown thief breaks into " + sessionStorage.getItem('bankName') + "!";
        document.getElementById('story').innerHTML = "A burglary has occurred at " + sessionStorage.getItem('bankName') + ". The culprit is currently unknown, but police have confirmed that &pound" + sessionStorage.getItem('money') + " has been taken. The police chief has stated they will do all they can to track down and apprehend the culprit.";
    }
    else if(sessionStorage.getItem('success') == '2'){
        document.getElementById('base').src="images/Player.png";
        document.getElementById('outfit').src=outfits[sessionStorage.getItem('outfit')];
        document.getElementById('hair').src=hairstyles[sessionStorage.getItem('hair')];
        document.getElementById('Headline').innerHTML = "Attempted break in at " + sessionStorage.getItem('bankName') + "! " + sessionStorage.getItem('playerName') + " arrested at the scene.";
        document.getElementById('story').innerHTML = sessionStorage.getItem('playerName') + " made an attempt to break into " + sessionStorage.getItem('bankName') + ". Although &pound" + sessionStorage.getItem('money') + " was found on the suspect, the police have been able to return the money to the vault. The police chief has gone on record to say: 'There is no place in our society for people like " + sessionStorage.getItem('playerName') + ", and we will make sure there are no more break ins like this'";
    }
    else if(sessionStorage.getItem('success') == '1'){
        document.getElementById('base').src="images/Player.png";
        document.getElementById('outfit').src=outfits[sessionStorage.getItem('outfit')];
        document.getElementById('hair').src=hairstyles[sessionStorage.getItem('hair')];
        document.getElementById('Headline').innerHTML = "Streaker " + sessionStorage.getItem('playerName') + " arrested at " + sessionStorage.getItem('bankName');
        document.getElementById('story').innerHTML = "Today, a so-called 'streaker', " + sessionStorage.getItem('playerName') + " ran into the front of " + sessionStorage.getItem('bankName') + " with no clothes on. Police arrived at the scene quickly to apprehend the suspect, who kept muttering about a bank robbery. They have been sent to the mental institution for further examination";
    }
}

function successful(){
    sessionStorage.setItem('success', '3');
    finalPage("PaperClip.html");
}

function openSafe(keyColor){
    let tooltip = document.getElementById('storyIntro');
    let score = parseInt(sessionStorage.getItem('money'));

    if(keyColor=='blue'){
        tooltip.innerHTML="You unlocked the blue lockbox and found a stack of cash!"
        score += 10000;
        sessionStorage.setItem('money', score);
        document.getElementById('blueKey').onclick="";
    }
    else if (keyColor=='green'){
        tooltip.innerHTML="You unlocked the green lockbox and found a fancy watch!"
        score += 15000;
        sessionStorage.setItem('money', score);
        document.getElementById('greenKey').onclick="";
    }
    else if(keyColor=='yellow'){
        tooltip.innerHTML="You unlocked the yellow lockbox and found a diamond ring!"
        score += 5000;
        sessionStorage.setItem('money', score);
        document.getElementById('yellowKey').onclick="";
    }
    else if(keyColor=='red'){
        tooltip.innerHTML="You unlocked the red lockbox and found a vintage champagne bottle!"
        score += 1000;
        sessionStorage.setItem('money', score);
        document.getElementById('redKey').onclick="";
    }
    let unlock = new Audio('audio/unlock.wav');
    unlock.play();
    document.getElementById('money').innerHTML=sessionStorage.getItem('money');
}

function vaultFunctionality(){
    if(isNaN(score)){
        sessionStorage.setItem('money', 0);
    }
    else{
        sessionStorage.setItem('money', score);
    }
    let keys = document.getElementsByClassName('keyButton');
    document.getElementById('money').innerHTML=sessionStorage.getItem('money');
}
