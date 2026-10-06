package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSalidasManualesSDT.Cabecera", namespace ="TexplusNET")
public final  class StructSdtColSalidasManualesSDT_Cabecera implements Cloneable, java.io.Serializable
{
   public StructSdtColSalidasManualesSDT_Cabecera( )
   {
      this( -1, new ModelContext( StructSdtColSalidasManualesSDT_Cabecera.class ));
   }

   public StructSdtColSalidasManualesSDT_Cabecera( int remoteHandle ,
                                                   ModelContext context )
   {
   }

   public  StructSdtColSalidasManualesSDT_Cabecera( java.util.Vector<StructSdtSalidasManualesSDT_Cabecera> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SalidasManualesSDT.Cabecera",namespace="TexplusNET")
   public java.util.Vector<StructSdtSalidasManualesSDT_Cabecera> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSalidasManualesSDT_Cabecera> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSalidasManualesSDT_Cabecera> item = new java.util.Vector<>();
}

