package app.anticipacionerrores ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMAnt_ErroresClienteArticuloColorSDT", namespace ="TexplusNET")
public final  class StructSdtColMAnt_ErroresClienteArticuloColorSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMAnt_ErroresClienteArticuloColorSDT( )
   {
      this( -1, new ModelContext( StructSdtColMAnt_ErroresClienteArticuloColorSDT.class ));
   }

   public StructSdtColMAnt_ErroresClienteArticuloColorSDT( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColMAnt_ErroresClienteArticuloColorSDT( java.util.Vector<StructSdtMAnt_ErroresClienteArticuloColorSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MAnt_ErroresClienteArticuloColorSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMAnt_ErroresClienteArticuloColorSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMAnt_ErroresClienteArticuloColorSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMAnt_ErroresClienteArticuloColorSDT> item = new java.util.Vector<>();
}

