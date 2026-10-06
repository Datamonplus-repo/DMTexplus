package app.asyncbatch ;
import com.genexus.*;

public final  class StructSdtJOBITEM implements Cloneable, java.io.Serializable
{
   public StructSdtJOBITEM( )
   {
      this( -1, new ModelContext( StructSdtJOBITEM.class ));
   }

   public StructSdtJOBITEM( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtJOBITEM_Jobid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJOBITEM_Jobtype = "" ;
      gxTv_SdtJOBITEM_Doclbl = "" ;
      gxTv_SdtJOBITEM_Itmsts = "" ;
      gxTv_SdtJOBITEM_Itmdtstart = cal.getTime() ;
      gxTv_SdtJOBITEM_Itmdtend = cal.getTime() ;
      gxTv_SdtJOBITEM_Itmerr = "" ;
      gxTv_SdtJOBITEM_Outfile = "" ;
      gxTv_SdtJOBITEM_Outurl = "" ;
      gxTv_SdtJOBITEM_Filenm = "" ;
      gxTv_SdtJOBITEM_Mode = "" ;
      gxTv_SdtJOBITEM_Jobid_Z = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJOBITEM_Jobtype_Z = "" ;
      gxTv_SdtJOBITEM_Doclbl_Z = "" ;
      gxTv_SdtJOBITEM_Itmsts_Z = "" ;
      gxTv_SdtJOBITEM_Itmdtstart_Z = cal.getTime() ;
      gxTv_SdtJOBITEM_Itmdtend_Z = cal.getTime() ;
      gxTv_SdtJOBITEM_Itmerr_Z = "" ;
      gxTv_SdtJOBITEM_Outfile_Z = "" ;
      gxTv_SdtJOBITEM_Filenm_Z = "" ;
      gxTv_SdtJOBITEM_Jobtype_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Docid_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Doclbl_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Itmsts_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Retryqt_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Itmdtstart_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Itmdtend_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Itmerr_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Outfile_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Outurl_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Filenm_N = (byte)(1) ;
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
      return gxTv_SdtJOBITEM_Jobid ;
   }

   public void setJobid( java.util.UUID value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Jobid = value ;
   }

   public long getItmid( )
   {
      return gxTv_SdtJOBITEM_Itmid ;
   }

   public void setItmid( long value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmid = value ;
   }

   public String getJobtype( )
   {
      return gxTv_SdtJOBITEM_Jobtype ;
   }

   public void setJobtype( String value )
   {
      gxTv_SdtJOBITEM_Jobtype_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Jobtype = value ;
   }

   public long getDocid( )
   {
      return gxTv_SdtJOBITEM_Docid ;
   }

   public void setDocid( long value )
   {
      gxTv_SdtJOBITEM_Docid_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Docid = value ;
   }

   public String getDoclbl( )
   {
      return gxTv_SdtJOBITEM_Doclbl ;
   }

   public void setDoclbl( String value )
   {
      gxTv_SdtJOBITEM_Doclbl_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Doclbl = value ;
   }

   public String getItmsts( )
   {
      return gxTv_SdtJOBITEM_Itmsts ;
   }

   public void setItmsts( String value )
   {
      gxTv_SdtJOBITEM_Itmsts_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmsts = value ;
   }

   public short getRetryqt( )
   {
      return gxTv_SdtJOBITEM_Retryqt ;
   }

   public void setRetryqt( short value )
   {
      gxTv_SdtJOBITEM_Retryqt_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Retryqt = value ;
   }

   public java.util.Date getItmdtstart( )
   {
      return gxTv_SdtJOBITEM_Itmdtstart ;
   }

   public void setItmdtstart( java.util.Date value )
   {
      gxTv_SdtJOBITEM_Itmdtstart_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmdtstart = value ;
   }

   public java.util.Date getItmdtend( )
   {
      return gxTv_SdtJOBITEM_Itmdtend ;
   }

   public void setItmdtend( java.util.Date value )
   {
      gxTv_SdtJOBITEM_Itmdtend_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmdtend = value ;
   }

   public String getItmerr( )
   {
      return gxTv_SdtJOBITEM_Itmerr ;
   }

   public void setItmerr( String value )
   {
      gxTv_SdtJOBITEM_Itmerr_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmerr = value ;
   }

   public String getOutfile( )
   {
      return gxTv_SdtJOBITEM_Outfile ;
   }

   public void setOutfile( String value )
   {
      gxTv_SdtJOBITEM_Outfile_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Outfile = value ;
   }

   public String getOuturl( )
   {
      return gxTv_SdtJOBITEM_Outurl ;
   }

   public void setOuturl( String value )
   {
      gxTv_SdtJOBITEM_Outurl_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Outurl = value ;
   }

   public String getFilenm( )
   {
      return gxTv_SdtJOBITEM_Filenm ;
   }

   public void setFilenm( String value )
   {
      gxTv_SdtJOBITEM_Filenm_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Filenm = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtJOBITEM_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtJOBITEM_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Initialized = value ;
   }

   public java.util.UUID getJobid_Z( )
   {
      return gxTv_SdtJOBITEM_Jobid_Z ;
   }

   public void setJobid_Z( java.util.UUID value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Jobid_Z = value ;
   }

   public long getItmid_Z( )
   {
      return gxTv_SdtJOBITEM_Itmid_Z ;
   }

   public void setItmid_Z( long value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmid_Z = value ;
   }

   public String getJobtype_Z( )
   {
      return gxTv_SdtJOBITEM_Jobtype_Z ;
   }

   public void setJobtype_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Jobtype_Z = value ;
   }

   public long getDocid_Z( )
   {
      return gxTv_SdtJOBITEM_Docid_Z ;
   }

   public void setDocid_Z( long value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Docid_Z = value ;
   }

   public String getDoclbl_Z( )
   {
      return gxTv_SdtJOBITEM_Doclbl_Z ;
   }

   public void setDoclbl_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Doclbl_Z = value ;
   }

   public String getItmsts_Z( )
   {
      return gxTv_SdtJOBITEM_Itmsts_Z ;
   }

   public void setItmsts_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmsts_Z = value ;
   }

   public short getRetryqt_Z( )
   {
      return gxTv_SdtJOBITEM_Retryqt_Z ;
   }

   public void setRetryqt_Z( short value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Retryqt_Z = value ;
   }

   public java.util.Date getItmdtstart_Z( )
   {
      return gxTv_SdtJOBITEM_Itmdtstart_Z ;
   }

   public void setItmdtstart_Z( java.util.Date value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmdtstart_Z = value ;
   }

   public java.util.Date getItmdtend_Z( )
   {
      return gxTv_SdtJOBITEM_Itmdtend_Z ;
   }

   public void setItmdtend_Z( java.util.Date value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmdtend_Z = value ;
   }

   public String getItmerr_Z( )
   {
      return gxTv_SdtJOBITEM_Itmerr_Z ;
   }

   public void setItmerr_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmerr_Z = value ;
   }

   public String getOutfile_Z( )
   {
      return gxTv_SdtJOBITEM_Outfile_Z ;
   }

   public void setOutfile_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Outfile_Z = value ;
   }

   public String getFilenm_Z( )
   {
      return gxTv_SdtJOBITEM_Filenm_Z ;
   }

   public void setFilenm_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Filenm_Z = value ;
   }

   public byte getJobtype_N( )
   {
      return gxTv_SdtJOBITEM_Jobtype_N ;
   }

   public void setJobtype_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Jobtype_N = value ;
   }

   public byte getDocid_N( )
   {
      return gxTv_SdtJOBITEM_Docid_N ;
   }

   public void setDocid_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Docid_N = value ;
   }

   public byte getDoclbl_N( )
   {
      return gxTv_SdtJOBITEM_Doclbl_N ;
   }

   public void setDoclbl_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Doclbl_N = value ;
   }

   public byte getItmsts_N( )
   {
      return gxTv_SdtJOBITEM_Itmsts_N ;
   }

   public void setItmsts_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmsts_N = value ;
   }

   public byte getRetryqt_N( )
   {
      return gxTv_SdtJOBITEM_Retryqt_N ;
   }

   public void setRetryqt_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Retryqt_N = value ;
   }

   public byte getItmdtstart_N( )
   {
      return gxTv_SdtJOBITEM_Itmdtstart_N ;
   }

   public void setItmdtstart_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmdtstart_N = value ;
   }

   public byte getItmdtend_N( )
   {
      return gxTv_SdtJOBITEM_Itmdtend_N ;
   }

   public void setItmdtend_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmdtend_N = value ;
   }

   public byte getItmerr_N( )
   {
      return gxTv_SdtJOBITEM_Itmerr_N ;
   }

   public void setItmerr_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Itmerr_N = value ;
   }

   public byte getOutfile_N( )
   {
      return gxTv_SdtJOBITEM_Outfile_N ;
   }

   public void setOutfile_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Outfile_N = value ;
   }

   public byte getOuturl_N( )
   {
      return gxTv_SdtJOBITEM_Outurl_N ;
   }

   public void setOuturl_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Outurl_N = value ;
   }

   public byte getFilenm_N( )
   {
      return gxTv_SdtJOBITEM_Filenm_N ;
   }

   public void setFilenm_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      gxTv_SdtJOBITEM_Filenm_N = value ;
   }

   protected byte gxTv_SdtJOBITEM_Jobtype_N ;
   protected byte gxTv_SdtJOBITEM_Docid_N ;
   protected byte gxTv_SdtJOBITEM_Doclbl_N ;
   protected byte gxTv_SdtJOBITEM_Itmsts_N ;
   protected byte gxTv_SdtJOBITEM_Retryqt_N ;
   protected byte gxTv_SdtJOBITEM_Itmdtstart_N ;
   protected byte gxTv_SdtJOBITEM_Itmdtend_N ;
   protected byte gxTv_SdtJOBITEM_Itmerr_N ;
   protected byte gxTv_SdtJOBITEM_Outfile_N ;
   protected byte gxTv_SdtJOBITEM_Outurl_N ;
   protected byte gxTv_SdtJOBITEM_Filenm_N ;
   private byte gxTv_SdtJOBITEM_N ;
   protected short gxTv_SdtJOBITEM_Retryqt ;
   protected short gxTv_SdtJOBITEM_Initialized ;
   protected short gxTv_SdtJOBITEM_Retryqt_Z ;
   protected long gxTv_SdtJOBITEM_Itmid ;
   protected long gxTv_SdtJOBITEM_Docid ;
   protected long gxTv_SdtJOBITEM_Itmid_Z ;
   protected long gxTv_SdtJOBITEM_Docid_Z ;
   protected String gxTv_SdtJOBITEM_Mode ;
   protected String gxTv_SdtJOBITEM_Outurl ;
   protected String gxTv_SdtJOBITEM_Jobtype ;
   protected String gxTv_SdtJOBITEM_Doclbl ;
   protected String gxTv_SdtJOBITEM_Itmsts ;
   protected String gxTv_SdtJOBITEM_Itmerr ;
   protected String gxTv_SdtJOBITEM_Outfile ;
   protected String gxTv_SdtJOBITEM_Filenm ;
   protected String gxTv_SdtJOBITEM_Jobtype_Z ;
   protected String gxTv_SdtJOBITEM_Doclbl_Z ;
   protected String gxTv_SdtJOBITEM_Itmsts_Z ;
   protected String gxTv_SdtJOBITEM_Itmerr_Z ;
   protected String gxTv_SdtJOBITEM_Outfile_Z ;
   protected String gxTv_SdtJOBITEM_Filenm_Z ;
   protected java.util.UUID gxTv_SdtJOBITEM_Jobid ;
   protected java.util.UUID gxTv_SdtJOBITEM_Jobid_Z ;
   protected java.util.Date gxTv_SdtJOBITEM_Itmdtstart ;
   protected java.util.Date gxTv_SdtJOBITEM_Itmdtend ;
   protected java.util.Date gxTv_SdtJOBITEM_Itmdtstart_Z ;
   protected java.util.Date gxTv_SdtJOBITEM_Itmdtend_Z ;
}

