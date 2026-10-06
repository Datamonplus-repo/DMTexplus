package app.anticipacionerrores ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMAnt_ErroresClienteArticuloSDT", namespace ="TexplusNET")
public final  class StructSdtColMAnt_ErroresClienteArticuloSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMAnt_ErroresClienteArticuloSDT( )
   {
      this( -1, new ModelContext( StructSdtColMAnt_ErroresClienteArticuloSDT.class ));
   }

   public StructSdtColMAnt_ErroresClienteArticuloSDT( int remoteHandle ,
                                                      ModelContext context )
   {
   }

   public  StructSdtColMAnt_ErroresClienteArticuloSDT( java.util.Vector<StructSdtMAnt_ErroresClienteArticuloSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MAnt_ErroresClienteArticuloSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMAnt_ErroresClienteArticuloSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMAnt_ErroresClienteArticuloSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMAnt_ErroresClienteArticuloSDT> item = new java.util.Vector<>();
}

