<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online Bookstore Dashboard</title>
  	<style>
  		.logoImage {
    width: 150px; /* Set the desired width */
    height: auto; /* Maintain the aspect ratio */
     /* Create a circular image, if desired */
}
  	</style>
    
    <!-- Include your custom CSS file here -->
</head>
<body>
    <header>
        <div class="logo">
            <img src="https://img.freepik.com/free-vector/flat-design-library-logo-template_23-2149325326.jpg?w=2000" alt="Online Bookstore Logo" class="logoImage" >
        </div>
        <nav>
            <ul>
                <li><a href="#">Browse Books</a></li>
                <li><a href="#">Shopping Cart</a></li>
                <li><a href="#">Order History</a></li>
                <li><a href="#">Account Settings</a></li>
                <li><a href="#">Log Out</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <section class="user-info">
            <img src="profile-picture.jpg" alt="User Profile Picture">
            <h1>Welcome, ${user.username}</h1>
            <p>Email: ${user.email} </p>
        </section>

        <section class="quick-actions">
            <button class="browse-books">Browse Books</button>
            <button class="view-cart">View Cart</button>
            <button class="view-orders">View Orders</button>
        </section>

        <section class="recent-activity">
            <h2>Recent Activity</h2>
            <p>Last Login: August 20, 2023</p>
            <p>Last Purchase: "Book Title" on August 15, 2023</p>
        </section>

        <section class="book-recommendations">
            <!-- Add book recommendations here -->
        </section>
    </main>

    <footer>
        <p>Contact Us: contact@example.com</p>
        <p>&copy; 2023 Online Bookstore</p>
    </footer>
</body>
</html>
