package app.gestionlaboratorio ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "NoAceptacionEnsayo_SDT", namespace ="TexplusNET")
public final  class StructSdtNoAceptacionEnsayo_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtNoAceptacionEnsayo_SDT( )
   {
      this( -1, new ModelContext( StructSdtNoAceptacionEnsayo_SDT.class ));
   }

   public StructSdtNoAceptacionEnsayo_SDT( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtNoAceptacionEnsayo_SDT( java.util.Vector<StructSdtNoAceptacionEnsayo_SDT_Item> value )
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
   public java.util.Vector<StructSdtNoAceptacionEnsayo_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtNoAceptacionEnsayo_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtNoAceptacionEnsayo_SDT_Item> item = new java.util.Vector<>();
}

