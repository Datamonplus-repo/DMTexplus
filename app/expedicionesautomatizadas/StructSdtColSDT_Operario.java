package app.expedicionesautomatizadas ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDT_Operario", namespace ="TexplusNET")
public final  class StructSdtColSDT_Operario implements Cloneable, java.io.Serializable
{
   public StructSdtColSDT_Operario( )
   {
      this( -1, new ModelContext( StructSdtColSDT_Operario.class ));
   }

   public StructSdtColSDT_Operario( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSDT_Operario( java.util.Vector<StructSdtSDT_Operario> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDT_Operario",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDT_Operario> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_Operario> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_Operario> item = new java.util.Vector<>();
}

