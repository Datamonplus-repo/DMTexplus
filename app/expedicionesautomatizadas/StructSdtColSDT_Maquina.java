package app.expedicionesautomatizadas ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDT_Maquina", namespace ="TexplusNET")
public final  class StructSdtColSDT_Maquina implements Cloneable, java.io.Serializable
{
   public StructSdtColSDT_Maquina( )
   {
      this( -1, new ModelContext( StructSdtColSDT_Maquina.class ));
   }

   public StructSdtColSDT_Maquina( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColSDT_Maquina( java.util.Vector<StructSdtSDT_Maquina> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDT_Maquina",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDT_Maquina> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_Maquina> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_Maquina> item = new java.util.Vector<>();
}

