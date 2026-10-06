package app.ponteway.v1 ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColGuiaRemessaLinhaDTO.guiasRemessaItem", namespace ="TexplusNET")
public final  class StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem implements Cloneable, java.io.Serializable
{
   public StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem( )
   {
      this( -1, new ModelContext( StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem.class ));
   }

   public StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem( java.util.Vector<StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="GuiaRemessaLinhaDTO.guiasRemessaItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem> item = new java.util.Vector<>();
}

