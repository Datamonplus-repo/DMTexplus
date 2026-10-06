package app ;
import com.genexus.*;

public final  class StructSdtEmails implements Cloneable, java.io.Serializable
{
   public StructSdtEmails( )
   {
      this( -1, new ModelContext( StructSdtEmails.class ));
   }

   public StructSdtEmails( int remoteHandle ,
                           ModelContext context )
   {
      gxTv_SdtEmails_Title = "" ;
      gxTv_SdtEmails_Subject = "" ;
      gxTv_SdtEmails_Htmltext = "" ;
      gxTv_SdtEmails_To_N = (byte)(1) ;
      gxTv_SdtEmails_Cc_N = (byte)(1) ;
      gxTv_SdtEmails_Cco_N = (byte)(1) ;
      gxTv_SdtEmails_Attached_N = (byte)(1) ;
      gxTv_SdtEmails_Config_N = (byte)(1) ;
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

   public String getTitle( )
   {
      return gxTv_SdtEmails_Title ;
   }

   public void setTitle( String value )
   {
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Title = value ;
   }

   public String getSubject( )
   {
      return gxTv_SdtEmails_Subject ;
   }

   public void setSubject( String value )
   {
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Subject = value ;
   }

   public String getHtmltext( )
   {
      return gxTv_SdtEmails_Htmltext ;
   }

   public void setHtmltext( String value )
   {
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Htmltext = value ;
   }

   public java.util.Vector<app.StructSdtEmails_TOItem> getTo( )
   {
      return gxTv_SdtEmails_To ;
   }

   public void setTo( java.util.Vector<app.StructSdtEmails_TOItem> value )
   {
      gxTv_SdtEmails_To_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_To = value ;
   }

   public java.util.Vector<app.StructSdtEmails_CCitem> getCc( )
   {
      return gxTv_SdtEmails_Cc ;
   }

   public void setCc( java.util.Vector<app.StructSdtEmails_CCitem> value )
   {
      gxTv_SdtEmails_Cc_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Cc = value ;
   }

   public java.util.Vector<app.StructSdtEmails_CCOItem> getCco( )
   {
      return gxTv_SdtEmails_Cco ;
   }

   public void setCco( java.util.Vector<app.StructSdtEmails_CCOItem> value )
   {
      gxTv_SdtEmails_Cco_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Cco = value ;
   }

   public java.util.Vector<app.StructSdtEmails_AttachedItem> getAttached( )
   {
      return gxTv_SdtEmails_Attached ;
   }

   public void setAttached( java.util.Vector<app.StructSdtEmails_AttachedItem> value )
   {
      gxTv_SdtEmails_Attached_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Attached = value ;
   }

   public app.StructSdtEmails_Config getConfig( )
   {
      return gxTv_SdtEmails_Config ;
   }

   public void setConfig( app.StructSdtEmails_Config value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Config = value;
   }

   protected byte gxTv_SdtEmails_To_N ;
   protected byte gxTv_SdtEmails_Cc_N ;
   protected byte gxTv_SdtEmails_Cco_N ;
   protected byte gxTv_SdtEmails_Attached_N ;
   protected byte gxTv_SdtEmails_Config_N ;
   protected byte gxTv_SdtEmails_N ;
   protected String gxTv_SdtEmails_Htmltext ;
   protected String gxTv_SdtEmails_Title ;
   protected String gxTv_SdtEmails_Subject ;
   protected app.StructSdtEmails_Config gxTv_SdtEmails_Config=null ;
   protected java.util.Vector<app.StructSdtEmails_TOItem> gxTv_SdtEmails_To=null ;
   protected java.util.Vector<app.StructSdtEmails_CCitem> gxTv_SdtEmails_Cc=null ;
   protected java.util.Vector<app.StructSdtEmails_CCOItem> gxTv_SdtEmails_Cco=null ;
   protected java.util.Vector<app.StructSdtEmails_AttachedItem> gxTv_SdtEmails_Attached=null ;
}

