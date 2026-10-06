package app.oliveiraegoncalves.v1 ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColGuiaRemessaLinhaItemDTO", namespace ="TexplusNET")
public final  class StructSdtColGuiaRemessaLinhaItemDTO implements Cloneable, java.io.Serializable
{
   public StructSdtColGuiaRemessaLinhaItemDTO( )
   {
      this( -1, new ModelContext( StructSdtColGuiaRemessaLinhaItemDTO.class ));
   }

   public StructSdtColGuiaRemessaLinhaItemDTO( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtColGuiaRemessaLinhaItemDTO( java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="GuiaRemessaLinhaItemDTO",namespace="TexplusNET")
   public java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO> item = new java.util.Vector<>();
}

