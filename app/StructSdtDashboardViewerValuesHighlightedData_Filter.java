package app ;
import com.genexus.*;

public final  class StructSdtDashboardViewerValuesHighlightedData_Filter implements Cloneable, java.io.Serializable
{
   public StructSdtDashboardViewerValuesHighlightedData_Filter( )
   {
      this( -1, new ModelContext( StructSdtDashboardViewerValuesHighlightedData_Filter.class ));
   }

   public StructSdtDashboardViewerValuesHighlightedData_Filter( int remoteHandle ,
                                                                ModelContext context )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Name = "" ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Values_N = (byte)(1) ;
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

   public String getName( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Filter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Name = value ;
   }

   public java.util.Vector getValues( )
   {
      return gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Values ;
   }

   public void setValues( java.util.Vector value )
   {
      gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Values_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Filter_N = (byte)(0) ;
      gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Values = value ;
   }

   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Values_N ;
   protected byte gxTv_SdtDashboardViewerValuesHighlightedData_Filter_N ;
   protected String gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Name ;
   protected java.util.Vector gxTv_SdtDashboardViewerValuesHighlightedData_Filter_Values=null ;
}

