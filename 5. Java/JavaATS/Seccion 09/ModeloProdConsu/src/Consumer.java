
class Consumer extends Thread {

    Producer productor;

    Consumer(Producer p) {
        productor = p;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = productor.getMessage();
                System.out.println("Recibi el mensaje: " + message);
                sleep(2000);
            }
        } catch (InterruptedException e) {
            System.err.println("Error RunConsumidor " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        Producer productor = new Producer();
        productor.start();
        new Consumer(productor).start();
    }
}
