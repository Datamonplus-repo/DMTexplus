package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDashboardViewerFiltersChangedData.Filter", namespace ="TexplusNET")
public final  class StructSdtColDashboardViewerFiltersChangedData_Filter implements Cloneable, java.io.Serializable
{
   public StructSdtColDashboardViewerFiltersChangedData_Filter( )
   {
      this( -1, new ModelContext( StructSdtColDashboardViewerFiltersChangedData_Filter.class ));
   }

   public StructSdtColDashboardViewerFiltersChangedData_Filter( int remoteHandle ,
                                                                ModelContext context )
   {
   }

   public  StructSdtColDashboardViewerFiltersChangedData_Filter( java.util.Vector<StructSdtDashboardViewerFiltersChangedData_Filter> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DashboardViewerFiltersChangedData.Filter",namespace="TexplusNET")
   public java.util.Vector<StructSdtDashboardViewerFiltersChangedData_Filter> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDashboardViewerFiltersChangedData_Filter> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDashboardViewerFiltersChangedData_Filter> item = new java.util.Vector<>();
}

