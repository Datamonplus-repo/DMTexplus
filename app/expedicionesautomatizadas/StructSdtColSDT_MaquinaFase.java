package app.expedicionesautomatizadas ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDT_MaquinaFase", namespace ="TexplusNET")
public final  class StructSdtColSDT_MaquinaFase implements Cloneable, java.io.Serializable
{
   public StructSdtColSDT_MaquinaFase( )
   {
      this( -1, new ModelContext( StructSdtColSDT_MaquinaFase.class ));
   }

   public StructSdtColSDT_MaquinaFase( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColSDT_MaquinaFase( java.util.Vector<StructSdtSDT_MaquinaFase> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDT_MaquinaFase",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDT_MaquinaFase> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_MaquinaFase> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_MaquinaFase> item = new java.util.Vector<>();
}

