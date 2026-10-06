package app.gestionlaboratorio ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColEnviodeEnsayo_SDT", namespace ="TexplusNET")
public final  class StructSdtColEnviodeEnsayo_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColEnviodeEnsayo_SDT( )
   {
      this( -1, new ModelContext( StructSdtColEnviodeEnsayo_SDT.class ));
   }

   public StructSdtColEnviodeEnsayo_SDT( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColEnviodeEnsayo_SDT( java.util.Vector<StructSdtEnviodeEnsayo_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="EnviodeEnsayo_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtEnviodeEnsayo_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEnviodeEnsayo_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEnviodeEnsayo_SDT> item = new java.util.Vector<>();
}

