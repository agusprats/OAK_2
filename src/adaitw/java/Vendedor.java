package adaitw.java;

import java.io.Console;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Vendedor implements Controller {
    private String id;
    private String nombre;
    List <Cliente> listaClientes;
    List<Oportunidad> listaOportunidades;

    public Vendedor() {
        this.id = id;
        this.nombre = nombre;
        this.listaClientes = new ArrayList<>();
        this.listaOportunidades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Oportunidad> getOportunidades() {
        return listaOportunidades;
    }

    public void agregarOportunidad(Oportunidad oportunidad) {
        this.listaOportunidades.add(oportunidad);
    }

    public void crearCliente(){
        Scanner scanner = new Scanner(System.in);
        Cliente unCliente = new Cliente();
        System.out.println("ID (Sólo números): ");
        int id = scanner.nextInt();
        unCliente.setId(id);
        System.out.println("Empresa: ");
        String empresa = scanner.next();
        unCliente.setEmpresa(empresa);
        System.out.println("Contacto: ");
        String contacto = scanner.next();
        unCliente.setContacto(contacto);
        System.out.println("Cargo: ");
        String cargo = scanner.next();
        unCliente.setCargo(cargo);
        listaClientes.add(unCliente);
        System.out.println(getListaClientes());
}


    public void crearOportunidad() {
        Scanner scanner = new Scanner(System.in);
        Oportunidad op = new Oportunidad();
        System.out.println("Ingrese Numero Oportunidad (Solo números):  ");
        int numeroOp = scanner.nextInt();
        op.setNumeroOp(numeroOp);
        op.setNewCall(Boolean.parseBoolean(Consola.validateNewCall("¿Contactar nuevamente? (true/false): ")));
        listaOportunidades.add(op);
        System.out.println(getOportunidades());

    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "Codigo='" + getId() + '\'' +
                "Nombre='" + getNombre() + '\'' +
                '}';
    }


}



        /*System.out.println("Fecha de contacto ");
        LocalDate contactDate = LocalDate.parse(scanner.next());
        op.setContactDate(contactDate);
        op.setPotencial();

        //List<Prospecto> prospectos = op.getProspecto();
        //Prospecto unProspecto = prospectos.get(0);
        //Prospecto p = (Prospecto) unProspecto; */

   /*

   public List<String> prospectoToString() {
        List<String> data = new ArrayList();
        data.add(this.empresa);
        data.add(this.contacto);
        data.add(this.cargo);

        return data;
    }
    public static void agregarProspecto(Oportunidad oportunidad) {
        Scanner scanner = new Scanner(System.in);
        List<Prospecto> prospectos = new ArrayList<>();
        Prospecto unProspecto = new Prospecto();
        System.out.println("Ingrese ID: ");
        int id = scanner.nextInt();
        unProspecto.setId(id);
        System.out.println("Empresa (Solo caracteres alfabéticos): ");
        String empresa = scanner.next();
        unProspecto.setEmpresa(empresa);
        System.out.println("Ingrese Contacto: ");
        String contacto = scanner.next();
        unProspecto.setContacto(contacto);
        System.out.println("Ingrese email: ");
        String email = scanner.next();
        unProspecto.setEmail(email);
        oportunidad.agregarProspecto(unProspecto);
        prospectos.add(unProspecto);
    }
*/