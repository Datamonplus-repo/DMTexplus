package app.devops ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class setlicensestart extends GXProcedure
{
   public setlicensestart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( setlicensestart.class ), "" );
   }

   public setlicensestart( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( app.wwpbaseobjects.SdtWWPContext aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( app.wwpbaseobjects.SdtWWPContext aP0 )
   {
      setlicensestart.this.AV18WWPContext = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Licensekey( AV18WWPContext.getgxTv_SdtWWPContext_Licensekey() );
      AV19LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Token( AV18WWPContext.getgxTv_SdtWWPContext_Token() );
      AV19LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Environmentid( AV18WWPContext.getgxTv_SdtWWPContext_Environmentid() );
      AV19LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Userid( AV18WWPContext.getgxTv_SdtWWPContext_Userguid().toString() );
      AV19LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Sessionid( AV18WWPContext.getgxTv_SdtWWPContext_Usursockt() );
      AV15HttpClient.setHost( httpContext.getMessage( "dmanager.api.datamonplus.com", "") );
      AV15HttpClient.setSecure( (byte)(1) );
      AV15HttpClient.setBaseURL( httpContext.getMessage( "/api/license/session/", "") );
      AV15HttpClient.addHeader(httpContext.getMessage( "accept", ""), "*/*");
      AV15HttpClient.addHeader(httpContext.getMessage( "Content-Type", ""), httpContext.getMessage( "application/json", ""));
      AV15HttpClient.addString(AV19LicenseSessionStart.toJSonString(false, true));
      AV15HttpClient.execute("POST", httpContext.getMessage( "start", ""));
      if ( AV20LicenseValidate.fromJSonString(AV15HttpClient.getString(), AV21Messages) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV15HttpClient.getString(), AV24Pgmname) ;
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).error(GXutil.format( httpContext.getMessage( "Erro: %1 - %2", ""), GXutil.str( AV15HttpClient.getErrCode(), 10, 2), AV15HttpClient.getErrDescription(), "", "", "", "", "", "", ""), AV24Pgmname) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      AV15HttpClient.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19LicenseSessionStart = new app.devops.SdtLicenseSessionStart(remoteHandle, context);
      AV15HttpClient = new com.genexus.internet.HttpClient();
      AV21Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV20LicenseValidate = new app.devops.SdtLicenseValidate(remoteHandle, context);
      AV24Pgmname = "" ;
      AV24Pgmname = "DevOps.SetLicenseStart" ;
      /* GeneXus formulas. */
      AV24Pgmname = "DevOps.SetLicenseStart" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV24Pgmname ;
   private com.genexus.internet.HttpClient AV15HttpClient ;
   private app.devops.SdtLicenseSessionStart AV19LicenseSessionStart ;
   private app.devops.SdtLicenseValidate AV20LicenseValidate ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV21Messages ;
   private app.wwpbaseobjects.SdtWWPContext AV18WWPContext ;
}

