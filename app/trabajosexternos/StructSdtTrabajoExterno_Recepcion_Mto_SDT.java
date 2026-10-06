package app.trabajosexternos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "TrabajoExterno_Recepcion_Mto_SDT", namespace ="TexplusNET")
public final  class StructSdtTrabajoExterno_Recepcion_Mto_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtTrabajoExterno_Recepcion_Mto_SDT( )
   {
      this( -1, new ModelContext( StructSdtTrabajoExterno_Recepcion_Mto_SDT.class ));
   }

   public StructSdtTrabajoExterno_Recepcion_Mto_SDT( int remoteHandle ,
                                                     ModelContext context )
   {
   }

   public  StructSdtTrabajoExterno_Recepcion_Mto_SDT( java.util.Vector<StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item> item = new java.util.Vector<>();
}

