package app.anticipacionerrores ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtMFil", namespace ="TexplusNET")
public final  class StructSdtColsdtMFil implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtMFil( )
   {
      this( -1, new ModelContext( StructSdtColsdtMFil.class ));
   }

   public StructSdtColsdtMFil( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColsdtMFil( java.util.Vector<StructSdtsdtMFil> value )
   {
      item = value;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   @jakarta.xml.bind.annotation.XmlElement(name="sdtMFil",namespace="TexplusNET")
   public java.util.Vector<StructSdtsdtMFil> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtMFil> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtMFil> item = new java.util.Vector<>();
}

