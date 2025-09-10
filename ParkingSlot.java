public class ParkingSlot
{  int slotId;
   boolean isAvailable;

   public ParkingSlot(int id) 
   {  slotId = id;
      isAvailable = true;
   }
   
   public void assignSlot()
   {  isAvailable=false;     }
   
   public void freeSlot()
   {  isAvailable=true;      } 
   
   public boolean checkAvailability()
   {  return isAvailable;    }

   public void printStatus(Vehicle v) 
   { if (isAvailable) 
        System.out.println("Slot " + slotId + " is available");
    else
        System.out.println("Slot " + slotId + " is occupied by vehicle " + v.vehicleNumber );
  }
}
