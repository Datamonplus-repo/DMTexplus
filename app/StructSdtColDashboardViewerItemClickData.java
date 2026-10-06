package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDashboardViewerItemClickData", namespace ="TexplusNET")
public final  class StructSdtColDashboardViewerItemClickData implements Cloneable, java.io.Serializable
{
   public StructSdtColDashboardViewerItemClickData( )
   {
      this( -1, new ModelContext( StructSdtColDashboardViewerItemClickData.class ));
   }

   public StructSdtColDashboardViewerItemClickData( int remoteHandle ,
                                                    ModelContext context )
   {
   }

   public  StructSdtColDashboardViewerItemClickData( java.util.Vector<StructSdtDashboardViewerItemClickData> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DashboardViewerItemClickData",namespace="TexplusNET")
   public java.util.Vector<StructSdtDashboardViewerItemClickData> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDashboardViewerItemClickData> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDashboardViewerItemClickData> item = new java.util.Vector<>();
}

