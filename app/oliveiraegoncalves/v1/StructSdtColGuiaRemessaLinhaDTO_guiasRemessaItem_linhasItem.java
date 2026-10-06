package app.oliveiraegoncalves.v1 ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColGuiaRemessaLinhaDTO.guiasRemessaItem.linhasItem", namespace ="TexplusNET")
public final  class StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem implements Cloneable, java.io.Serializable
{
   public StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem( )
   {
      this( -1, new ModelContext( StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem.class ));
   }

   public StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem( int remoteHandle ,
                                                                       ModelContext context )
   {
   }

   public  StructSdtColGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem( java.util.Vector<StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="GuiaRemessaLinhaDTO.guiasRemessaItem.linhasItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem> item = new java.util.Vector<>();
}

