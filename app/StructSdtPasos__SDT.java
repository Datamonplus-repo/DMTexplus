package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Pasos__SDT", namespace ="TexplusNET")
public final  class StructSdtPasos__SDT implements Cloneable, java.io.Serializable
{
   public StructSdtPasos__SDT( )
   {
      this( -1, new ModelContext( StructSdtPasos__SDT.class ));
   }

   public StructSdtPasos__SDT( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtPasos__SDT( java.util.Vector<StructSdtPasos__SDT_Pasos__SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pasos__SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtPasos__SDT_Pasos__SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPasos__SDT_Pasos__SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPasos__SDT_Pasos__SDTItem> item = new java.util.Vector<>();
}

