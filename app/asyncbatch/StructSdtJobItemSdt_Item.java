package app.asyncbatch ;
import com.genexus.*;

public final  class StructSdtJobItemSdt_Item implements Cloneable, java.io.Serializable
{
   public StructSdtJobItemSdt_Item( )
   {
      this( -1, new ModelContext( StructSdtJobItemSdt_Item.class ));
   }

   public StructSdtJobItemSdt_Item( int remoteHandle ,
                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtJobItemSdt_Item_Jobid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJobItemSdt_Item_Doclbl = "" ;
      gxTv_SdtJobItemSdt_Item_Itmsts = "" ;
      gxTv_SdtJobItemSdt_Item_Itmdtstart = cal.getTime() ;
      gxTv_SdtJobItemSdt_Item_Itmdtend = cal.getTime() ;
      gxTv_SdtJobItemSdt_Item_Outfile = "" ;
      gxTv_SdtJobItemSdt_Item_Outurl = "" ;
      gxTv_SdtJobItemSdt_Item_Filenm = "" ;
      gxTv_SdtJobItemSdt_Item_Itmdtstart_N = (byte)(1) ;
      gxTv_SdtJobItemSdt_Item_Itmdtend_N = (byte)(1) ;
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

   public java.util.UUID getJobid( )
   {
      return gxTv_SdtJobItemSdt_Item_Jobid ;
   }

   public void setJobid( java.util.UUID value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Jobid = value ;
   }

   public long getItmid( )
   {
      return gxTv_SdtJobItemSdt_Item_Itmid ;
   }

   public void setItmid( long value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Itmid = value ;
   }

   public long getDocid( )
   {
      return gxTv_SdtJobItemSdt_Item_Docid ;
   }

   public void setDocid( long value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Docid = value ;
   }

   public String getDoclbl( )
   {
      return gxTv_SdtJobItemSdt_Item_Doclbl ;
   }

   public void setDoclbl( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Doclbl = value ;
   }

   public String getItmsts( )
   {
      return gxTv_SdtJobItemSdt_Item_Itmsts ;
   }

   public void setItmsts( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Itmsts = value ;
   }

   public short getRetryqt( )
   {
      return gxTv_SdtJobItemSdt_Item_Retryqt ;
   }

   public void setRetryqt( short value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Retryqt = value ;
   }

   public java.util.Date getItmdtstart( )
   {
      return gxTv_SdtJobItemSdt_Item_Itmdtstart ;
   }

   public void setItmdtstart( java.util.Date value )
   {
      gxTv_SdtJobItemSdt_Item_Itmdtstart_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Itmdtstart = value ;
   }

   public java.util.Date getItmdtend( )
   {
      return gxTv_SdtJobItemSdt_Item_Itmdtend ;
   }

   public void setItmdtend( java.util.Date value )
   {
      gxTv_SdtJobItemSdt_Item_Itmdtend_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Itmdtend = value ;
   }

   public String getOutfile( )
   {
      return gxTv_SdtJobItemSdt_Item_Outfile ;
   }

   public void setOutfile( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Outfile = value ;
   }

   public String getOuturl( )
   {
      return gxTv_SdtJobItemSdt_Item_Outurl ;
   }

   public void setOuturl( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Outurl = value ;
   }

   public String getFilenm( )
   {
      return gxTv_SdtJobItemSdt_Item_Filenm ;
   }

   public void setFilenm( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Filenm = value ;
   }

   protected byte gxTv_SdtJobItemSdt_Item_Itmdtstart_N ;
   protected byte gxTv_SdtJobItemSdt_Item_Itmdtend_N ;
   protected byte gxTv_SdtJobItemSdt_Item_N ;
   protected short gxTv_SdtJobItemSdt_Item_Retryqt ;
   protected long gxTv_SdtJobItemSdt_Item_Itmid ;
   protected long gxTv_SdtJobItemSdt_Item_Docid ;
   protected String gxTv_SdtJobItemSdt_Item_Outurl ;
   protected String gxTv_SdtJobItemSdt_Item_Doclbl ;
   protected String gxTv_SdtJobItemSdt_Item_Itmsts ;
   protected String gxTv_SdtJobItemSdt_Item_Outfile ;
   protected String gxTv_SdtJobItemSdt_Item_Filenm ;
   protected java.util.UUID gxTv_SdtJobItemSdt_Item_Jobid ;
   protected java.util.Date gxTv_SdtJobItemSdt_Item_Itmdtstart ;
   protected java.util.Date gxTv_SdtJobItemSdt_Item_Itmdtend ;
}

