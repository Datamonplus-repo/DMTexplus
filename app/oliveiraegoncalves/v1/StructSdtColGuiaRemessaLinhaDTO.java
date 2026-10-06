package app.oliveiraegoncalves.v1 ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColGuiaRemessaLinhaDTO", namespace ="TexplusNET")
public final  class StructSdtColGuiaRemessaLinhaDTO implements Cloneable, java.io.Serializable
{
   public StructSdtColGuiaRemessaLinhaDTO( )
   {
      this( -1, new ModelContext( StructSdtColGuiaRemessaLinhaDTO.class ));
   }

   public StructSdtColGuiaRemessaLinhaDTO( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColGuiaRemessaLinhaDTO( java.util.Vector<StructSdtGuiaRemessaLinhaDTO> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="GuiaRemessaLinhaDTO",namespace="TexplusNET")
   public java.util.Vector<StructSdtGuiaRemessaLinhaDTO> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGuiaRemessaLinhaDTO> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGuiaRemessaLinhaDTO> item = new java.util.Vector<>();
}

