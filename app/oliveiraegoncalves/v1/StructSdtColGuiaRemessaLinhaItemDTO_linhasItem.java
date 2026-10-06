package app.oliveiraegoncalves.v1 ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColGuiaRemessaLinhaItemDTO.linhasItem", namespace ="TexplusNET")
public final  class StructSdtColGuiaRemessaLinhaItemDTO_linhasItem implements Cloneable, java.io.Serializable
{
   public StructSdtColGuiaRemessaLinhaItemDTO_linhasItem( )
   {
      this( -1, new ModelContext( StructSdtColGuiaRemessaLinhaItemDTO_linhasItem.class ));
   }

   public StructSdtColGuiaRemessaLinhaItemDTO_linhasItem( int remoteHandle ,
                                                          ModelContext context )
   {
   }

   public  StructSdtColGuiaRemessaLinhaItemDTO_linhasItem( java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO_linhasItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="GuiaRemessaLinhaItemDTO.linhasItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO_linhasItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO_linhasItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO_linhasItem> item = new java.util.Vector<>();
}

