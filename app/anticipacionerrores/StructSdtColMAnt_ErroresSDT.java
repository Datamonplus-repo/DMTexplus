package app.anticipacionerrores ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMAnt_ErroresSDT", namespace ="TexplusNET")
public final  class StructSdtColMAnt_ErroresSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMAnt_ErroresSDT( )
   {
      this( -1, new ModelContext( StructSdtColMAnt_ErroresSDT.class ));
   }

   public StructSdtColMAnt_ErroresSDT( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColMAnt_ErroresSDT( java.util.Vector<StructSdtMAnt_ErroresSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MAnt_ErroresSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMAnt_ErroresSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMAnt_ErroresSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMAnt_ErroresSDT> item = new java.util.Vector<>();
}

