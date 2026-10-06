package app.devops ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class statuslicenseheartbeat extends GXProcedure
{
   public statuslicenseheartbeat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( statuslicenseheartbeat.class ), "" );
   }

   public statuslicenseheartbeat( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( app.wwpbaseobjects.SdtWWPContext aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( app.wwpbaseobjects.SdtWWPContext aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      statuslicenseheartbeat.this.AV14WWPContext = aP0;
      statuslicenseheartbeat.this.AV17ProgranName = aP1;
      statuslicenseheartbeat.this.AV18ProgramDesc = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Licensekey( AV14WWPContext.getgxTv_SdtWWPContext_Licensekey() );
      AV10LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Token( AV14WWPContext.getgxTv_SdtWWPContext_Token() );
      AV10LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Environmentid( AV14WWPContext.getgxTv_SdtWWPContext_Environmentid() );
      AV10LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Userid( AV14WWPContext.getgxTv_SdtWWPContext_Userguid().toString() );
      AV10LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Sessionid( AV14WWPContext.getgxTv_SdtWWPContext_Usursockt() );
      AV10LicenseSessionStart.setgxTv_SdtLicenseSessionStart_Program( GXutil.format( "%1-%2", AV17ProgranName, AV18ProgramDesc, "", "", "", "", "", "", "") );
      AV11HttpClient.setHost( httpContext.getMessage( "dmanager.api.datamonplus.com", "") );
      AV11HttpClient.setSecure( (byte)(1) );
      AV11HttpClient.setBaseURL( httpContext.getMessage( "api/license/session/", "") );
      AV11HttpClient.addHeader(httpContext.getMessage( "accept", ""), "*/*");
      AV11HttpClient.addHeader(httpContext.getMessage( "Content-Type", ""), httpContext.getMessage( "application/json", ""));
      AV11HttpClient.addString(AV10LicenseSessionStart.toJSonString(false, true));
      AV11HttpClient.execute("POST", httpContext.getMessage( "heartbeat", ""));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV10LicenseSessionStart.toJSonString(false, true), AV21Pgmname) ;
      if ( AV15ResponseHeartBeat.fromJSonString(AV11HttpClient.getString(), AV16Messages) )
      {
         if ( AV15ResponseHeartBeat.getgxTv_SdtResponseHeartBeat_Statuscode().doubleValue() == 409 )
         {
            httpContext.GX_msglist.addItem(AV15ResponseHeartBeat.getgxTv_SdtResponseHeartBeat_Message());
         }
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).error(GXutil.format( httpContext.getMessage( "Erro: %1 - %2", ""), GXutil.str( AV11HttpClient.getErrCode(), 10, 2), AV11HttpClient.getErrDescription(), "", "", "", "", "", "", ""), AV21Pgmname) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      AV11HttpClient.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10LicenseSessionStart = new app.devops.SdtLicenseSessionStart(remoteHandle, context);
      AV11HttpClient = new com.genexus.internet.HttpClient();
      AV21Pgmname = "" ;
      AV16Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV15ResponseHeartBeat = new app.devops.SdtResponseHeartBeat(remoteHandle, context);
      AV21Pgmname = "DevOps.StatusLicenseHeartBeat" ;
      /* GeneXus formulas. */
      AV21Pgmname = "DevOps.StatusLicenseHeartBeat" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV21Pgmname ;
   private String AV17ProgranName ;
   private String AV18ProgramDesc ;
   private com.genexus.internet.HttpClient AV11HttpClient ;
   private app.devops.SdtLicenseSessionStart AV10LicenseSessionStart ;
   private app.devops.SdtResponseHeartBeat AV15ResponseHeartBeat ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV16Messages ;
   private app.wwpbaseobjects.SdtWWPContext AV14WWPContext ;
}

