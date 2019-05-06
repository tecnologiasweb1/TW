<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<!-- BARRA LAYOUT -->
<nav class="navbar navbar-expand-lg navbar-light bg-light" style="margin-bottom:15px;">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="portafolio">Link</a>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Dropdown
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Something else here</a>
            </div>
        </li>
        <li class="nav-item">
            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
        </li>
        <li class="nav-item dropdown" style="float:right;">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Usuarios
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">Register/Login</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Exit</a>
                </div>
            </li>
            </ul>
<!--             action="/Producto/FilterProducto" method="post" -->
<!--             <form class="form-inline my-2 my-lg-0" > -->
<!--             <input class="form-control mr-sm-3" type="search" placeholder="Search" aria-label="Search" id="filterProducto" name="filterProducto"> -->
<!--             <button class="btn btn-outline-success my-3 my-sm-1 mr-sm-3" type="button" onclick="filterProductos()">Search</button> -->
<!--             </form> -->
<!-- 			<sprin.url value="/Producto/FilterProducto" var="SaveURL"> -->
<%-- 			<form:form class="form-inline my-2 my-lg-0" method="POST" action="${SaveURL}" /> --%>
<!-- 			<input class="form-control mr-sm-3" type="search" placeholder="Search" aria-label="Search" id="filterProducto" name="filterProducto"> -->
<!--             <button class="btn btn-outline-success my-3 my-sm-1 mr-sm-3" type="submit">Search</button> -->
<!-- 			</form:form> -->
<span class="navbar-text mr-sm-3">Juan Pablo
<img src="content/Icons/glyph/svg/si-glyph-person-people.svg" height="20" width="20"/>
</span>
<!-- CARRITO -->
<button type="button" class="btn btn-sm" data-toggle="modal" data-target="#myModalCarrito">
	<img src="content/Icons/glyph/svg/si-glyph-basket.svg" height="20" width="20"/>
</button>
<button type="button" class="btn btn-sm" data-toggle="tooltip" title="Documentacion!">
	<img src="content/Icons/glyph/svg/si-glyph-document.svg" height="20" width="20"/>
</button>
        </div>
    </nav>