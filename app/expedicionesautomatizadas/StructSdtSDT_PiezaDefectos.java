package app.expedicionesautomatizadas ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDT_PiezaDefectos", namespace ="TexplusNET")
public final  class StructSdtSDT_PiezaDefectos implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_PiezaDefectos( )
   {
      this( -1, new ModelContext( StructSdtSDT_PiezaDefectos.class ));
   }

   public StructSdtSDT_PiezaDefectos( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtSDT_PiezaDefectos( java.util.Vector<StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDT_PiezaDefecto",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto> item = new java.util.Vector<>();
}

