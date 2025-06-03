document.addEventListener("DOMContentLoaded", function() {
  // Form Validation for Registration Page

  //  Effect for myths section

let accordionItems = document.querySelectorAll(".accordion h3");
accordionItems.forEach(item => {
  item.addEventListener("click", function() {
      let content = this.nextElementSibling;
      content.style.display = content.style.display === "block" ? "none" : "block";
  });
});

  // Dark Mode Toggle
 const darkModeToggle = document.createElement("button");
  darkModeToggle.innerText = "Dark Mode";
  darkModeToggle.style.cssText = "position:fixed; bottom:20px; right:0px; padding:10px; background:black; color:white; border:none; cursor:pointer;";
  document.body.appendChild(darkModeToggle);

  darkModeToggle.addEventListener("click", function() 
  {
      document.body.classList.toggle("dark-mode");
      if (document.body.classList.contains("dark-mode")) 
      {
          document.body.style.background = "#222";
          document.body.style.color = "#fff";
          document.querySelector("header").style.background = "#111";
      }
           else 
      {
          document.body.style.background = "#f9f9f9";
          document.body.style.color = "#333";
          document.querySelector("header").style.background = "#28a745";
      }
  });
});

document.addEventListener("DOMContentLoaded", function () {
  const storyCards = document.querySelectorAll(".story-card");

  const observer = new IntersectionObserver(
      (entries) => {
          entries.forEach((entry) => {
              if (entry.isIntersecting) {
                  entry.target.classList.add("show");
              }
          });
      },
      { threshold: 0.2 }
  );

  storyCards.forEach((card) => {
      observer.observe(card);
  });
});


// Live statistic counter
let count = 50000;
const donorCount = document.getElementById("donorCount");

function updateCounter() {
  count += Math.floor(Math.random() * 5);
  donorCount.innerText = count.toLocaleString();
}

setInterval(updateCounter, 3000);



/*---------------- */



// JavaScript validation & confirmation
document.getElementById('donorForm').addEventListener('submit', function (e) {
  e.preventDefault();

  const name = document.getElementById("fullName").value.trim();
  const age = document.getElementById("age").value;
  const organ = document.getElementById("organ").value;
  const messageBox = document.getElementById("formMessage");

  if (name && age >= 18 && organ) {
    messageBox.style.color = "green";
    messageBox.textContent = "✅ Thank you! Your registration was successful.";

    setTimeout(() => {
      // Redirect back to same page after 3 seconds
      window.location.href = "register.html";
    }, 3000); // Wait for 3 seconds
  } else {
    messageBox.style.color = "red";
    messageBox.textContent = "⚠️ Please fill all required fields correctly.";
  }
});




/*------------------------------*/



// Accordion toggle logic
document.querySelectorAll(".accordion-header").forEach(button => {
  button.addEventListener("click", () => {
    const item = button.parentElement;
    item.classList.toggle("active");

    // Close others
    document.querySelectorAll(".accordion-item").forEach(other => {
      if (other !== item) {
        other.classList.remove("active");
      }
    });
  });
});

/***************Storyyyyy******************** */
function openStory(id) {
  document.getElementById(id).style.display = "block";
}

function closeStory(id) {
  document.getElementById(id).style.display = "none";
}




// Add Your Story Form Submission
document.getElementById("storyForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const story = document.getElementById("storyText").value.trim();
  const msg = document.getElementById("storyMessage");

  if (name && email && story) {
    msg.textContent = "✅ Thank you! Your story has been submitted.";
    this.reset();
  } else {
    msg.style.color = "red";
    msg.textContent = "⚠️ Please fill all fields.";
  }
});





//********************************** */
document.getElementById("contactForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const name = document.getElementById("contactName").value.trim();
  const email = document.getElementById("contactEmail").value.trim();
  const msg = document.getElementById("contactMessage").value.trim();
  const status = document.getElementById("formStatus");

  if (name && email && msg) {
    status.textContent = "✅ Message sent successfully!";
    this.reset();
  } else {
    status.style.color = "red";
    status.textContent = "⚠️ Please fill all fields.";
  }
});
