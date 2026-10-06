package app.formulaciontinte ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "RecetadeTinte_Cierre_SDT", namespace ="TexplusNET")
public final  class StructSdtRecetadeTinte_Cierre_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtRecetadeTinte_Cierre_SDT( )
   {
      this( -1, new ModelContext( StructSdtRecetadeTinte_Cierre_SDT.class ));
   }

   public StructSdtRecetadeTinte_Cierre_SDT( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtRecetadeTinte_Cierre_SDT( java.util.Vector<StructSdtRecetadeTinte_Cierre_SDT_Item> value )
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
   public java.util.Vector<StructSdtRecetadeTinte_Cierre_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRecetadeTinte_Cierre_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRecetadeTinte_Cierre_SDT_Item> item = new java.util.Vector<>();
}

