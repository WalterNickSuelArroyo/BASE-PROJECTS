
import java.util.Vector;

class Producer extends Thread {

    static final int MAX = 7;
    private Vector mensajes = new Vector();

    @Override
    public void run() {
        try {
            while (true) {
                putMessage();
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Error RunProductor " + e.getMessage());
        }
    }

    synchronized void putMessage() throws InterruptedException {
        while (mensajes.size() == MAX) {
            wait();
        }

        mensajes.addElement(new java.util.Date().toString());
        notify();
    }

    synchronized String getMessage() throws InterruptedException {
        while (mensajes.isEmpty()) {
            wait();
        }
        String mensaje = (String) mensajes.firstElement();
        mensajes.removeElement(mensaje);
        return mensaje;
    }
    
    
}
