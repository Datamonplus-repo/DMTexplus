package app.gestionlaboratorio ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ImpresionLabDipEnviados_y_o_Aceptados_SDT", namespace ="TexplusNET")
public final  class StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT( )
   {
      this( -1, new ModelContext( StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT.class ));
   }

   public StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT( int remoteHandle ,
                                                              ModelContext context )
   {
   }

   public  StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT( java.util.Vector<StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> value )
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
   public java.util.Vector<StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> item = new java.util.Vector<>();
}

