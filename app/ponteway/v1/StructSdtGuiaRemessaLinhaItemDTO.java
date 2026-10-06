package app.ponteway.v1 ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "GuiaRemessaLinhaItemDTO", namespace ="TexplusNET")
public final  class StructSdtGuiaRemessaLinhaItemDTO implements Cloneable, java.io.Serializable
{
   public StructSdtGuiaRemessaLinhaItemDTO( )
   {
      this( -1, new ModelContext( StructSdtGuiaRemessaLinhaItemDTO.class ));
   }

   public StructSdtGuiaRemessaLinhaItemDTO( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtGuiaRemessaLinhaItemDTO( java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO_linhas> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="linhas",namespace="TexplusNET")
   public java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO_linhas> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO_linhas> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGuiaRemessaLinhaItemDTO_linhas> item = new java.util.Vector<>();
}

