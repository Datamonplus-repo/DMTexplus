package app.asyncbatch ;
import com.genexus.*;

public final  class StructSdtJOB implements Cloneable, java.io.Serializable
{
   public StructSdtJOB( )
   {
      this( -1, new ModelContext( StructSdtJOB.class ));
   }

   public StructSdtJOB( int remoteHandle ,
                        ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtJOB_Jobid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJOB_Jobdesc = "" ;
      gxTv_SdtJOB_Jobtype = "" ;
      gxTv_SdtJOB_Jobexec = "" ;
      gxTv_SdtJOB_Jobstat = "" ;
      gxTv_SdtJOB_Usrcreat = "" ;
      gxTv_SdtJOB_Usrsocket = "" ;
      gxTv_SdtJOB_Dtcreat = cal.getTime() ;
      gxTv_SdtJOB_Dtstart = cal.getTime() ;
      gxTv_SdtJOB_Dtend = cal.getTime() ;
      gxTv_SdtJOB_Curitem = "" ;
      gxTv_SdtJOB_Basepath = "" ;
      gxTv_SdtJOB_Outpath = "" ;
      gxTv_SdtJOB_Zippath = "" ;
      gxTv_SdtJOB_Zipurl = "" ;
      gxTv_SdtJOB_Lasterr = "" ;
      gxTv_SdtJOB_Lockid = "" ;
      gxTv_SdtJOB_Lockdt = cal.getTime() ;
      gxTv_SdtJOB_Mode = "" ;
      gxTv_SdtJOB_Jobid_Z = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJOB_Jobdesc_Z = "" ;
      gxTv_SdtJOB_Jobtype_Z = "" ;
      gxTv_SdtJOB_Jobexec_Z = "" ;
      gxTv_SdtJOB_Jobstat_Z = "" ;
      gxTv_SdtJOB_Usrcreat_Z = "" ;
      gxTv_SdtJOB_Usrsocket_Z = "" ;
      gxTv_SdtJOB_Dtcreat_Z = cal.getTime() ;
      gxTv_SdtJOB_Dtstart_Z = cal.getTime() ;
      gxTv_SdtJOB_Dtend_Z = cal.getTime() ;
      gxTv_SdtJOB_Curitem_Z = "" ;
      gxTv_SdtJOB_Basepath_Z = "" ;
      gxTv_SdtJOB_Outpath_Z = "" ;
      gxTv_SdtJOB_Zippath_Z = "" ;
      gxTv_SdtJOB_Zipurl_Z = "" ;
      gxTv_SdtJOB_Lockid_Z = "" ;
      gxTv_SdtJOB_Lockdt_Z = cal.getTime() ;
      gxTv_SdtJOB_Jobdesc_N = (byte)(1) ;
      gxTv_SdtJOB_Jobtype_N = (byte)(1) ;
      gxTv_SdtJOB_Jobexec_N = (byte)(1) ;
      gxTv_SdtJOB_Jobstat_N = (byte)(1) ;
      gxTv_SdtJOB_Usrcreat_N = (byte)(1) ;
      gxTv_SdtJOB_Usrsocket_N = (byte)(1) ;
      gxTv_SdtJOB_Dtcreat_N = (byte)(1) ;
      gxTv_SdtJOB_Dtstart_N = (byte)(1) ;
      gxTv_SdtJOB_Dtend_N = (byte)(1) ;
      gxTv_SdtJOB_Totitem_N = (byte)(1) ;
      gxTv_SdtJOB_Prcitem_N = (byte)(1) ;
      gxTv_SdtJOB_Okitem_N = (byte)(1) ;
      gxTv_SdtJOB_Eritem_N = (byte)(1) ;
      gxTv_SdtJOB_Prgpct_N = (byte)(1) ;
      gxTv_SdtJOB_Curitem_N = (byte)(1) ;
      gxTv_SdtJOB_Basepath_N = (byte)(1) ;
      gxTv_SdtJOB_Outpath_N = (byte)(1) ;
      gxTv_SdtJOB_Zippath_N = (byte)(1) ;
      gxTv_SdtJOB_Zipurl_N = (byte)(1) ;
      gxTv_SdtJOB_Lasterr_N = (byte)(1) ;
      gxTv_SdtJOB_Lockid_N = (byte)(1) ;
      gxTv_SdtJOB_Lockdt_N = (byte)(1) ;
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
      return gxTv_SdtJOB_Jobid ;
   }

   public void setJobid( java.util.UUID value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobid = value ;
   }

   public String getJobdesc( )
   {
      return gxTv_SdtJOB_Jobdesc ;
   }

   public void setJobdesc( String value )
   {
      gxTv_SdtJOB_Jobdesc_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobdesc = value ;
   }

   public String getJobtype( )
   {
      return gxTv_SdtJOB_Jobtype ;
   }

   public void setJobtype( String value )
   {
      gxTv_SdtJOB_Jobtype_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobtype = value ;
   }

   public String getJobexec( )
   {
      return gxTv_SdtJOB_Jobexec ;
   }

   public void setJobexec( String value )
   {
      gxTv_SdtJOB_Jobexec_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobexec = value ;
   }

   public String getJobstat( )
   {
      return gxTv_SdtJOB_Jobstat ;
   }

   public void setJobstat( String value )
   {
      gxTv_SdtJOB_Jobstat_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobstat = value ;
   }

   public String getUsrcreat( )
   {
      return gxTv_SdtJOB_Usrcreat ;
   }

   public void setUsrcreat( String value )
   {
      gxTv_SdtJOB_Usrcreat_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Usrcreat = value ;
   }

   public String getUsrsocket( )
   {
      return gxTv_SdtJOB_Usrsocket ;
   }

   public void setUsrsocket( String value )
   {
      gxTv_SdtJOB_Usrsocket_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Usrsocket = value ;
   }

   public java.util.Date getDtcreat( )
   {
      return gxTv_SdtJOB_Dtcreat ;
   }

   public void setDtcreat( java.util.Date value )
   {
      gxTv_SdtJOB_Dtcreat_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Dtcreat = value ;
   }

   public java.util.Date getDtstart( )
   {
      return gxTv_SdtJOB_Dtstart ;
   }

   public void setDtstart( java.util.Date value )
   {
      gxTv_SdtJOB_Dtstart_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Dtstart = value ;
   }

   public java.util.Date getDtend( )
   {
      return gxTv_SdtJOB_Dtend ;
   }

   public void setDtend( java.util.Date value )
   {
      gxTv_SdtJOB_Dtend_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Dtend = value ;
   }

   public long getTotitem( )
   {
      return gxTv_SdtJOB_Totitem ;
   }

   public void setTotitem( long value )
   {
      gxTv_SdtJOB_Totitem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Totitem = value ;
   }

   public long getPrcitem( )
   {
      return gxTv_SdtJOB_Prcitem ;
   }

   public void setPrcitem( long value )
   {
      gxTv_SdtJOB_Prcitem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Prcitem = value ;
   }

   public long getOkitem( )
   {
      return gxTv_SdtJOB_Okitem ;
   }

   public void setOkitem( long value )
   {
      gxTv_SdtJOB_Okitem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Okitem = value ;
   }

   public long getEritem( )
   {
      return gxTv_SdtJOB_Eritem ;
   }

   public void setEritem( long value )
   {
      gxTv_SdtJOB_Eritem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Eritem = value ;
   }

   public short getPrgpct( )
   {
      return gxTv_SdtJOB_Prgpct ;
   }

   public void setPrgpct( short value )
   {
      gxTv_SdtJOB_Prgpct_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Prgpct = value ;
   }

   public String getCuritem( )
   {
      return gxTv_SdtJOB_Curitem ;
   }

   public void setCuritem( String value )
   {
      gxTv_SdtJOB_Curitem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Curitem = value ;
   }

   public String getBasepath( )
   {
      return gxTv_SdtJOB_Basepath ;
   }

   public void setBasepath( String value )
   {
      gxTv_SdtJOB_Basepath_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Basepath = value ;
   }

   public String getOutpath( )
   {
      return gxTv_SdtJOB_Outpath ;
   }

   public void setOutpath( String value )
   {
      gxTv_SdtJOB_Outpath_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Outpath = value ;
   }

   public String getZippath( )
   {
      return gxTv_SdtJOB_Zippath ;
   }

   public void setZippath( String value )
   {
      gxTv_SdtJOB_Zippath_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Zippath = value ;
   }

   public String getZipurl( )
   {
      return gxTv_SdtJOB_Zipurl ;
   }

   public void setZipurl( String value )
   {
      gxTv_SdtJOB_Zipurl_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Zipurl = value ;
   }

   public String getLasterr( )
   {
      return gxTv_SdtJOB_Lasterr ;
   }

   public void setLasterr( String value )
   {
      gxTv_SdtJOB_Lasterr_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Lasterr = value ;
   }

   public String getLockid( )
   {
      return gxTv_SdtJOB_Lockid ;
   }

   public void setLockid( String value )
   {
      gxTv_SdtJOB_Lockid_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Lockid = value ;
   }

   public java.util.Date getLockdt( )
   {
      return gxTv_SdtJOB_Lockdt ;
   }

   public void setLockdt( java.util.Date value )
   {
      gxTv_SdtJOB_Lockdt_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Lockdt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtJOB_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtJOB_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Initialized = value ;
   }

   public java.util.UUID getJobid_Z( )
   {
      return gxTv_SdtJOB_Jobid_Z ;
   }

   public void setJobid_Z( java.util.UUID value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobid_Z = value ;
   }

   public String getJobdesc_Z( )
   {
      return gxTv_SdtJOB_Jobdesc_Z ;
   }

   public void setJobdesc_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobdesc_Z = value ;
   }

   public String getJobtype_Z( )
   {
      return gxTv_SdtJOB_Jobtype_Z ;
   }

   public void setJobtype_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobtype_Z = value ;
   }

   public String getJobexec_Z( )
   {
      return gxTv_SdtJOB_Jobexec_Z ;
   }

   public void setJobexec_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobexec_Z = value ;
   }

   public String getJobstat_Z( )
   {
      return gxTv_SdtJOB_Jobstat_Z ;
   }

   public void setJobstat_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobstat_Z = value ;
   }

   public String getUsrcreat_Z( )
   {
      return gxTv_SdtJOB_Usrcreat_Z ;
   }

   public void setUsrcreat_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Usrcreat_Z = value ;
   }

   public String getUsrsocket_Z( )
   {
      return gxTv_SdtJOB_Usrsocket_Z ;
   }

   public void setUsrsocket_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Usrsocket_Z = value ;
   }

   public java.util.Date getDtcreat_Z( )
   {
      return gxTv_SdtJOB_Dtcreat_Z ;
   }

   public void setDtcreat_Z( java.util.Date value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Dtcreat_Z = value ;
   }

   public java.util.Date getDtstart_Z( )
   {
      return gxTv_SdtJOB_Dtstart_Z ;
   }

   public void setDtstart_Z( java.util.Date value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Dtstart_Z = value ;
   }

   public java.util.Date getDtend_Z( )
   {
      return gxTv_SdtJOB_Dtend_Z ;
   }

   public void setDtend_Z( java.util.Date value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Dtend_Z = value ;
   }

   public long getTotitem_Z( )
   {
      return gxTv_SdtJOB_Totitem_Z ;
   }

   public void setTotitem_Z( long value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Totitem_Z = value ;
   }

   public long getPrcitem_Z( )
   {
      return gxTv_SdtJOB_Prcitem_Z ;
   }

   public void setPrcitem_Z( long value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Prcitem_Z = value ;
   }

   public long getOkitem_Z( )
   {
      return gxTv_SdtJOB_Okitem_Z ;
   }

   public void setOkitem_Z( long value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Okitem_Z = value ;
   }

   public long getEritem_Z( )
   {
      return gxTv_SdtJOB_Eritem_Z ;
   }

   public void setEritem_Z( long value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Eritem_Z = value ;
   }

   public short getPrgpct_Z( )
   {
      return gxTv_SdtJOB_Prgpct_Z ;
   }

   public void setPrgpct_Z( short value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Prgpct_Z = value ;
   }

   public String getCuritem_Z( )
   {
      return gxTv_SdtJOB_Curitem_Z ;
   }

   public void setCuritem_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Curitem_Z = value ;
   }

   public String getBasepath_Z( )
   {
      return gxTv_SdtJOB_Basepath_Z ;
   }

   public void setBasepath_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Basepath_Z = value ;
   }

   public String getOutpath_Z( )
   {
      return gxTv_SdtJOB_Outpath_Z ;
   }

   public void setOutpath_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Outpath_Z = value ;
   }

   public String getZippath_Z( )
   {
      return gxTv_SdtJOB_Zippath_Z ;
   }

   public void setZippath_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Zippath_Z = value ;
   }

   public String getZipurl_Z( )
   {
      return gxTv_SdtJOB_Zipurl_Z ;
   }

   public void setZipurl_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Zipurl_Z = value ;
   }

   public String getLockid_Z( )
   {
      return gxTv_SdtJOB_Lockid_Z ;
   }

   public void setLockid_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Lockid_Z = value ;
   }

   public java.util.Date getLockdt_Z( )
   {
      return gxTv_SdtJOB_Lockdt_Z ;
   }

   public void setLockdt_Z( java.util.Date value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Lockdt_Z = value ;
   }

   public byte getJobdesc_N( )
   {
      return gxTv_SdtJOB_Jobdesc_N ;
   }

   public void setJobdesc_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobdesc_N = value ;
   }

   public byte getJobtype_N( )
   {
      return gxTv_SdtJOB_Jobtype_N ;
   }

   public void setJobtype_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobtype_N = value ;
   }

   public byte getJobexec_N( )
   {
      return gxTv_SdtJOB_Jobexec_N ;
   }

   public void setJobexec_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobexec_N = value ;
   }

   public byte getJobstat_N( )
   {
      return gxTv_SdtJOB_Jobstat_N ;
   }

   public void setJobstat_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Jobstat_N = value ;
   }

   public byte getUsrcreat_N( )
   {
      return gxTv_SdtJOB_Usrcreat_N ;
   }

   public void setUsrcreat_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Usrcreat_N = value ;
   }

   public byte getUsrsocket_N( )
   {
      return gxTv_SdtJOB_Usrsocket_N ;
   }

   public void setUsrsocket_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Usrsocket_N = value ;
   }

   public byte getDtcreat_N( )
   {
      return gxTv_SdtJOB_Dtcreat_N ;
   }

   public void setDtcreat_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Dtcreat_N = value ;
   }

   public byte getDtstart_N( )
   {
      return gxTv_SdtJOB_Dtstart_N ;
   }

   public void setDtstart_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Dtstart_N = value ;
   }

   public byte getDtend_N( )
   {
      return gxTv_SdtJOB_Dtend_N ;
   }

   public void setDtend_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Dtend_N = value ;
   }

   public byte getTotitem_N( )
   {
      return gxTv_SdtJOB_Totitem_N ;
   }

   public void setTotitem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Totitem_N = value ;
   }

   public byte getPrcitem_N( )
   {
      return gxTv_SdtJOB_Prcitem_N ;
   }

   public void setPrcitem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Prcitem_N = value ;
   }

   public byte getOkitem_N( )
   {
      return gxTv_SdtJOB_Okitem_N ;
   }

   public void setOkitem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Okitem_N = value ;
   }

   public byte getEritem_N( )
   {
      return gxTv_SdtJOB_Eritem_N ;
   }

   public void setEritem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Eritem_N = value ;
   }

   public byte getPrgpct_N( )
   {
      return gxTv_SdtJOB_Prgpct_N ;
   }

   public void setPrgpct_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Prgpct_N = value ;
   }

   public byte getCuritem_N( )
   {
      return gxTv_SdtJOB_Curitem_N ;
   }

   public void setCuritem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Curitem_N = value ;
   }

   public byte getBasepath_N( )
   {
      return gxTv_SdtJOB_Basepath_N ;
   }

   public void setBasepath_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Basepath_N = value ;
   }

   public byte getOutpath_N( )
   {
      return gxTv_SdtJOB_Outpath_N ;
   }

   public void setOutpath_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Outpath_N = value ;
   }

   public byte getZippath_N( )
   {
      return gxTv_SdtJOB_Zippath_N ;
   }

   public void setZippath_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Zippath_N = value ;
   }

   public byte getZipurl_N( )
   {
      return gxTv_SdtJOB_Zipurl_N ;
   }

   public void setZipurl_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Zipurl_N = value ;
   }

   public byte getLasterr_N( )
   {
      return gxTv_SdtJOB_Lasterr_N ;
   }

   public void setLasterr_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Lasterr_N = value ;
   }

   public byte getLockid_N( )
   {
      return gxTv_SdtJOB_Lockid_N ;
   }

   public void setLockid_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Lockid_N = value ;
   }

   public byte getLockdt_N( )
   {
      return gxTv_SdtJOB_Lockdt_N ;
   }

   public void setLockdt_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      gxTv_SdtJOB_Lockdt_N = value ;
   }

   protected byte gxTv_SdtJOB_Jobdesc_N ;
   protected byte gxTv_SdtJOB_Jobtype_N ;
   protected byte gxTv_SdtJOB_Jobexec_N ;
   protected byte gxTv_SdtJOB_Jobstat_N ;
   protected byte gxTv_SdtJOB_Usrcreat_N ;
   protected byte gxTv_SdtJOB_Usrsocket_N ;
   protected byte gxTv_SdtJOB_Dtcreat_N ;
   protected byte gxTv_SdtJOB_Dtstart_N ;
   protected byte gxTv_SdtJOB_Dtend_N ;
   protected byte gxTv_SdtJOB_Totitem_N ;
   protected byte gxTv_SdtJOB_Prcitem_N ;
   protected byte gxTv_SdtJOB_Okitem_N ;
   protected byte gxTv_SdtJOB_Eritem_N ;
   protected byte gxTv_SdtJOB_Prgpct_N ;
   protected byte gxTv_SdtJOB_Curitem_N ;
   protected byte gxTv_SdtJOB_Basepath_N ;
   protected byte gxTv_SdtJOB_Outpath_N ;
   protected byte gxTv_SdtJOB_Zippath_N ;
   protected byte gxTv_SdtJOB_Zipurl_N ;
   protected byte gxTv_SdtJOB_Lasterr_N ;
   protected byte gxTv_SdtJOB_Lockid_N ;
   protected byte gxTv_SdtJOB_Lockdt_N ;
   private byte gxTv_SdtJOB_N ;
   protected short gxTv_SdtJOB_Prgpct ;
   protected short gxTv_SdtJOB_Initialized ;
   protected short gxTv_SdtJOB_Prgpct_Z ;
   protected long gxTv_SdtJOB_Totitem ;
   protected long gxTv_SdtJOB_Prcitem ;
   protected long gxTv_SdtJOB_Okitem ;
   protected long gxTv_SdtJOB_Eritem ;
   protected long gxTv_SdtJOB_Totitem_Z ;
   protected long gxTv_SdtJOB_Prcitem_Z ;
   protected long gxTv_SdtJOB_Okitem_Z ;
   protected long gxTv_SdtJOB_Eritem_Z ;
   protected String gxTv_SdtJOB_Mode ;
   protected String gxTv_SdtJOB_Lasterr ;
   protected String gxTv_SdtJOB_Jobdesc ;
   protected String gxTv_SdtJOB_Jobtype ;
   protected String gxTv_SdtJOB_Jobexec ;
   protected String gxTv_SdtJOB_Jobstat ;
   protected String gxTv_SdtJOB_Usrcreat ;
   protected String gxTv_SdtJOB_Usrsocket ;
   protected String gxTv_SdtJOB_Curitem ;
   protected String gxTv_SdtJOB_Basepath ;
   protected String gxTv_SdtJOB_Outpath ;
   protected String gxTv_SdtJOB_Zippath ;
   protected String gxTv_SdtJOB_Zipurl ;
   protected String gxTv_SdtJOB_Lockid ;
   protected String gxTv_SdtJOB_Jobdesc_Z ;
   protected String gxTv_SdtJOB_Jobtype_Z ;
   protected String gxTv_SdtJOB_Jobexec_Z ;
   protected String gxTv_SdtJOB_Jobstat_Z ;
   protected String gxTv_SdtJOB_Usrcreat_Z ;
   protected String gxTv_SdtJOB_Usrsocket_Z ;
   protected String gxTv_SdtJOB_Curitem_Z ;
   protected String gxTv_SdtJOB_Basepath_Z ;
   protected String gxTv_SdtJOB_Outpath_Z ;
   protected String gxTv_SdtJOB_Zippath_Z ;
   protected String gxTv_SdtJOB_Zipurl_Z ;
   protected String gxTv_SdtJOB_Lockid_Z ;
   protected java.util.UUID gxTv_SdtJOB_Jobid ;
   protected java.util.UUID gxTv_SdtJOB_Jobid_Z ;
   protected java.util.Date gxTv_SdtJOB_Dtcreat ;
   protected java.util.Date gxTv_SdtJOB_Dtstart ;
   protected java.util.Date gxTv_SdtJOB_Dtend ;
   protected java.util.Date gxTv_SdtJOB_Lockdt ;
   protected java.util.Date gxTv_SdtJOB_Dtcreat_Z ;
   protected java.util.Date gxTv_SdtJOB_Dtstart_Z ;
   protected java.util.Date gxTv_SdtJOB_Dtend_Z ;
   protected java.util.Date gxTv_SdtJOB_Lockdt_Z ;
}

