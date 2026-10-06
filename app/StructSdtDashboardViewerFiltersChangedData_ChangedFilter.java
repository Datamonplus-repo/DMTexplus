package app ;
import com.genexus.*;

public final  class StructSdtDashboardViewerFiltersChangedData_ChangedFilter implements Cloneable, java.io.Serializable
{
   public StructSdtDashboardViewerFiltersChangedData_ChangedFilter( )
   {
      this( -1, new ModelContext( StructSdtDashboardViewerFiltersChangedData_ChangedFilter.class ));
   }

   public StructSdtDashboardViewerFiltersChangedData_ChangedFilter( int remoteHandle ,
                                                                    ModelContext context )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name = "" ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N = (byte)(1) ;
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

   public boolean getEnabled( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled ;
   }

   public void setEnabled( boolean value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled = value ;
   }

   public String getName( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name = value ;
   }

   public java.util.Vector getValues( )
   {
      return gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values ;
   }

   public void setValues( java.util.Vector value )
   {
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values = value ;
   }

   protected byte gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values_N ;
   protected byte gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_N ;
   protected String gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Name ;
   protected boolean gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Enabled ;
   protected java.util.Vector gxTv_SdtDashboardViewerFiltersChangedData_ChangedFilter_Values=null ;
}

