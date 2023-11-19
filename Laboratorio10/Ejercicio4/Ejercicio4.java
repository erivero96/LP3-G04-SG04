public class Ejercicio4 {

    public static void main(String[] args) {

        Producto[] productos = new Producto[3];
        productos[0] = new Producto("001", "Producto 1", 100);
        productos[1] = new Producto("002", "Producto 2", 200);
        productos[2] = new Producto("003", "Producto 1", 100);
        
        Producto producto = new Producto("003", "Producto 1", 100);

        System.out.println("El elemento se encuentra en la posición: " + buscarElemento(productos, producto));

        Persona2[] personas = new Persona2[3];
        personas[0] = new Persona2(12345678, "Juan", "Calle 1");
        personas[1] = new Persona2(87654321, "Pedro", "Calle 2");
        personas[2] = new Persona2(832323232, "Jose", "Calle 3");

        Persona2 persona2 = new Persona2(12345678, "Pedro", "Calle 1");

        System.out.println("El elemento se encuentra en la posición: " + buscarElemento(personas, persona2));

        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante(12345678, "Juan", "Calle 1", "Ingeniería");
        estudiantes[1] = new Estudiante(87654321, "Pedro", "Calle 2", "Ingeniería");
        estudiantes[2] = new Estudiante(12345678, "Jose", "Calle 1", "Ingeniería");

        Estudiante estudiante = new Estudiante(12345678, "Juan", "Calle 1", "Ingeniería");

        System.out.println("El elemento se encuentra en la posición: " + buscarElemento(estudiantes, estudiante));

    }

    public static <T> boolean isEqualTo(T a, T b) {
        return a.equals(b);
    }

    public static <T> int buscarElemento  (T[] arreglo, T elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (isEqualTo(elemento, arreglo[i])) {
                return i;
            }
        }
        return -1;
    }
}

    class Persona2 {
        protected Integer dni;
        protected String nombre;
        protected String direccion;

        public Persona2(Integer dni, String nombre, String direccion) {
            this.dni = dni;
            this.nombre = nombre;
            this.direccion = direccion;
        }
        
        public Integer getDni() {
            return this.dni;
        }

        public void setDni(Integer dni) {
            this.dni = dni;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return this.direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Persona2) {
                Persona2 p = (Persona2) obj;
                return this.nombre.equals(p.getNombre());
            }
            return false;
        }
        

    }

    class Estudiante extends Persona2{
        private String carrera;

        public Estudiante(Integer dni, String nombre, String direccion, String carrera) {
            super(dni,nombre,direccion);
            this.carrera = carrera;
        }

        public String getCarrera() {
            return this.carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

        @Override
        public boolean equals(Object x) {
            if (x instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) x;
                return this.nombre.equals(estudiante.getNombre()) && this.carrera.equals(estudiante.getCarrera());
            }
            return false;
        }
    }


class Producto {
        private String codigo;
        private String descripcion;
        private double precio;

        public Producto(String codigo, String descripcion, double precio) {
            this.codigo = codigo;
            this.descripcion = descripcion;
            this.precio = precio;
        }

        public String getCodigo() {
            return this.codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getDescripcion() {
            return this.descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public double getPrecio() {
            return this.precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public boolean equals(Object x) {
            if (x instanceof Producto) {
                Producto producto =  (Producto) x;
                return this.codigo.equals(producto.getCodigo());
            }
            return false;
        }
    }
