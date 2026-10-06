package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "MantenimientoRollosPiezaSDT", namespace ="TexplusNET")
public final  class StructSdtMantenimientoRollosPiezaSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMantenimientoRollosPiezaSDT( )
   {
      this( -1, new ModelContext( StructSdtMantenimientoRollosPiezaSDT.class ));
   }

   public StructSdtMantenimientoRollosPiezaSDT( int remoteHandle ,
                                                ModelContext context )
   {
   }

   public  StructSdtMantenimientoRollosPiezaSDT( java.util.Vector<StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MantenimientoRollosPiezaSDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem> item = new java.util.Vector<>();
}

