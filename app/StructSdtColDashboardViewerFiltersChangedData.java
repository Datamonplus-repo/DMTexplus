package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDashboardViewerFiltersChangedData", namespace ="TexplusNET")
public final  class StructSdtColDashboardViewerFiltersChangedData implements Cloneable, java.io.Serializable
{
   public StructSdtColDashboardViewerFiltersChangedData( )
   {
      this( -1, new ModelContext( StructSdtColDashboardViewerFiltersChangedData.class ));
   }

   public StructSdtColDashboardViewerFiltersChangedData( int remoteHandle ,
                                                         ModelContext context )
   {
   }

   public  StructSdtColDashboardViewerFiltersChangedData( java.util.Vector<StructSdtDashboardViewerFiltersChangedData> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DashboardViewerFiltersChangedData",namespace="TexplusNET")
   public java.util.Vector<StructSdtDashboardViewerFiltersChangedData> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDashboardViewerFiltersChangedData> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDashboardViewerFiltersChangedData> item = new java.util.Vector<>();
}

