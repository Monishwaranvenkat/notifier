<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">

  <title>Dark Bootstrap Admin by Bootstrapious.com</title>
  <link rel="shortcut icon" href="img/favicon.ico">



  <meta name="description" content="notifier app is used to add notes">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="robots" content="all,follow">
  <!-- Bootstrap CSS-->
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome CSS-->
  
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendor/font-awesome/css/font-awesome.min.css">
  <!-- Custom Font Icons CSS-->
  <link  type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font.css">
  <!-- Google fonts - Muli-->
  <link  rel="stylesheet" href="https://fonts.googleapis.com/css?family=Muli:300,400,700">
  <!-- theme stylesheet-->
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.default.css" id="theme-stylesheet">
  <!-- Custom stylesheet - for your changes-->
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/custom.css">
  <!-- Favicon-->
  <link type="image/icon" rel="shortcut icon" href="${pageContext.request.contextPath}/resources/img/favicon.ico">
  
  <script  type="text/javascript" src="https://kit.fontawesome.com/03bde3c93b.js" crossorigin="anonymous"></script>

</head>

<body>

  <header class="header">
    <nav class="navbar navbar-expand-sm">

      <!--nav content-->
      <div class="container-fluid d-flex align-items-center justify-content-between">

        <!-- Navbar Header-->
        <div class="navbar-header">
          <a href="index.html" class="navbar-brand">
            <div class="brand-text brand-big visible text-uppercase"><strong
                class="text-primary">Notifier</strong><strong>App</strong></div>
            <div class="brand-text brand-sm"><strong class="text-primary">Noti</strong><strong>fier</strong></div>
          </a>

          <!-- Sidebar Toggle Btn-->
          <button class="sidebar-toggle"><i class="fa fa-long-arrow-left"></i></button>
        </div>
        <!--End Navbar Header-->

        <!--Right menu list-->
        <div class="right-menu list-inline no-margin-bottom">
          <div class="list-inline-item">
            <input id="myInput" type="text" onkeyup="searchNote()" placeholder="Search for notebooks.."
              class="input-material">
          </div>


          <!--Message-->
          <div class="list-inline-item dropdown">
            <a id="navbarDropdownMenuLink1" href="#" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false" class="nav-link messages-toggle">
              <i class="fas fa-bell"></i><span class="badge dashbg-1">25</span>
            </a>

            <div aria-labelledby="navbarDropdownMenuLink1" class="dropdown-menu messages">
              <a href="#" class="dropdown-item message d-flex align-items-center">

                <div class="content"> <strong class="d-block">Sara Wood</strong><span class="d-block">lorem ipsum dolor
                    sit amit</span><small class="date d-block">10:30pm</small></div>
              </a>

            </div>
          </div>
          <!--End Message-->

          <!-- Log out -->
          <div class="list-inline-item logout">
            <a id="logout" href="login.html" class="nav-link"> <span class="d-none d-sm-inline">Logout </span>
            <i class="fas fa-power-off"></i></a>
          </div>
        </div>
      </div>
    </nav>
  </header>


  <div class="d-flex align-items-stretch">
    <!-- Sidebar Navigation-->
    <nav id="sidebar">
      <!-- Sidebar Header-->
      <div class="sidebar-header d-flex align-items-center">

        <div class="title">
          <h1 class="h5">Mark Stephen</h1>

        </div>
      </div>
      <!-- Sidebar Navidation Menus-->
      <ul class="list-unstyled">
        <li class="active"><a href="index.html"> <i class="fa fa-book"></i>NOTE BOOKS </a></li>
        <li><a href="tables.html"> <i class="fa fa-sticky-note"></i>NOTES </a></li>
        <li><a href="charts.html"> <i class="fas fa-user-edit"></i>EDIT USER </a></li>
      </ul>

    </nav>
    <!-- Sidebar Navigation end-->

    <!--main page content-->

    <div class="page-content">

      <!--page header-->
      <div class="page-header">
        <div class="container-fluid d-flex align-items-center justify-content-between">
          <div class="left-menu">
            <h2 class="h5 no-margin-bottom">NOTE BOOKS</h2>
          </div>
          <div class="right-menu list-inline no-margin-bottom">
            <div class="list-inline-item">
              <button type="button" data-toggle="modal" data-target="#myModal" class="btn button-add">
                <i class="fas fa-plus-square"></i> Add NoteBook</button>
            </div>
          </div>
        </div>


      </div>

      <!--add note book-->

      <!-- Modal Form-->
      <!-- Modal-->
      <div id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true"
        class="modal fade text-left">
        <div role="document" class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header"><strong id="exampleModalLabel" class="modal-title">ADD NOTEBOOK</strong>
              <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span
                  aria-hidden="true">x</span></button>
            </div>
            <form>
            <div class="modal-body">


                <div class="form-group">
                  <label>NOTE BOOK NAME</label>
                  <input type="text" placeholder="Enter notebook name" class="form-control">
                </div>
                <div class="form-group">
                  <label>Description</label>
                  <input type="password" placeholder="Enter description about notebook" class="form-control">
                </div>

            </div>
            <div class="modal-footer">
              <button type="button" data-dismiss="modal" class="btn btn-secondary">Close</button>
              <button type="button" class="btn btn-primary">Save</button>
            </div>
            </form>
          </div>
        </div>
      </div>

      <!--end add note book-->

      <!--Notebook-->


      <div class="col-lg-12 " id="notebook">

        <div class="card notebookRow" id="1">
          <div class="card-header" style="background-color:#676be6; ">
            <div class="row">
              <div class="col-10" id="cardname">NOTE BOOK-1</div>
              <div class="col-1"> <a href="#"><i class="fas fa-trash-alt"></i> </a> </div>
              <div class="col-1"> <a href="#"><i class="fas fa-pencil-alt"></i> </a> </div>
            </div>

          </div>
          <div class="card-body">
            <h6 class="card-titlet">description about note book 1</h6>
            <p class="card-text">no of notes => 1</p>

          </div>
        </div>


        <div class=" card notebookRow" id="2">
          <div class="card-header" style="background-color:#676be6; ">

            <div class="row">
              <div class="col-10" id="cardname">NOTE BOOK-2</div>
              <div class="col-1"> <a href="#"><i class="fas fa-trash-alt"></i> </a> </div>
              <div class="col-1"> <a href="#"><i class="fas fa-pencil-alt"></i> </a> </div>
            </div>



          </div>
          <div class="card-body">
            <h6 class="card-titlet">description about note book 1</h6>
            <p class="card-text">no of notes => 1</p>

          </div>
        </div>


        <div class=" card notebookRow">
          <div class="card-header" style="background-color:#676be6; ">

            <div class="row">
              <div class="col-10" id="cardname">lOTE BOOK-2</div>
              <div class="col-1"> <a href="#"><i class="fas fa-trash-alt"></i> </a> </div>
              <div class="col-1"> <a href="#"><i class="fas fa-pencil-alt"></i> </a> </div>
            </div>



          </div>
          <div class="card-body">
            <h6 class="card-titlet">description about note book 1</h6>
            <p class="card-text">no of notes => 1</p>

          </div>
        </div>

      </div>

      <!-- end Notebook-->


    </div>
    <!--end main page content-->
  </div>
  <!-- JavaScript files-->
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/vendor/popper.js/umd/popper.min.js"> </script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/vendor/jquery.cookie/jquery.cookie.js"> </script>

  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/vendor/jquery-validation/jquery.validate.min.js"></script>

  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/front.js"></script>
  
  
  <script>


    function searchNote() {
      var input, filter, table, tr, td, i, txtValue, temp;
      input = document.getElementById("myInput");
      filter = input.value.toUpperCase();
      table = document.getElementById("notebook");
      tr = table.getElementsByClassName("notebookRow");



      for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("div").cardname;

        if (td) {
          txtValue = td.innerText;
          if (txtValue.toUpperCase().indexOf(filter) > -1) {
            tr[i].style.display = "";
          }
          else {
            tr[i].style.display = "none";
          }
        }
      }
    }

  </script>
</body>

</html>