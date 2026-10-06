package app.anticipacionerrores ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMAnt_ErroresClienteSDT", namespace ="TexplusNET")
public final  class StructSdtColMAnt_ErroresClienteSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMAnt_ErroresClienteSDT( )
   {
      this( -1, new ModelContext( StructSdtColMAnt_ErroresClienteSDT.class ));
   }

   public StructSdtColMAnt_ErroresClienteSDT( int remoteHandle ,
                                              ModelContext context )
   {
   }

   public  StructSdtColMAnt_ErroresClienteSDT( java.util.Vector<StructSdtMAnt_ErroresClienteSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MAnt_ErroresClienteSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMAnt_ErroresClienteSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMAnt_ErroresClienteSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMAnt_ErroresClienteSDT> item = new java.util.Vector<>();
}

