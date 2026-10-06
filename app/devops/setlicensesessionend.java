package app.devops ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class setlicensesessionend extends GXProcedure
{
   public setlicensesessionend( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( setlicensesessionend.class ), "" );
   }

   public setlicensesessionend( int remoteHandle ,
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
      setlicensesessionend.this.AV12WWPContext = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14LicenseSessionEnd.setgxTv_SdtLicenseSessionEnd_Licensekey( httpContext.getMessage( "LK-B9WZ8-JZAXY-SGCMT", "") );
      AV14LicenseSessionEnd.setgxTv_SdtLicenseSessionEnd_Environmentid( httpContext.getMessage( "69b1b33a3e8899bb8d18c6c1", "") );
      AV14LicenseSessionEnd.setgxTv_SdtLicenseSessionEnd_Userid( AV12WWPContext.getgxTv_SdtWWPContext_Userguid().toString() );
      AV14LicenseSessionEnd.setgxTv_SdtLicenseSessionEnd_Sessionid( AV12WWPContext.getgxTv_SdtWWPContext_Usursockt() );
      AV11HttpClient.setHost( httpContext.getMessage( "localhost", "") );
      AV11HttpClient.setBaseURL( httpContext.getMessage( "/api/license/session/", "") );
      AV11HttpClient.setPort( 3000 );
      AV11HttpClient.addHeader(httpContext.getMessage( "accept", ""), httpContext.getMessage( "application/json", ""));
      AV11HttpClient.addHeader(httpContext.getMessage( "Content-Type", ""), httpContext.getMessage( "application/json", ""));
      AV11HttpClient.addString(AV14LicenseSessionEnd.toJSonString(false, true));
      AV11HttpClient.execute("POST", httpContext.getMessage( "end", ""));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "-----------------END SESSION---------------------", ""), AV17Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV11HttpClient.getString(), AV17Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "-----------------END SESSION---------------------", ""), AV17Pgmname) ;
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
      AV14LicenseSessionEnd = new app.devops.SdtLicenseSessionEnd(remoteHandle, context);
      AV11HttpClient = new com.genexus.internet.HttpClient();
      AV17Pgmname = "" ;
      AV17Pgmname = "DevOps.SetLicenseSessionEnd" ;
      /* GeneXus formulas. */
      AV17Pgmname = "DevOps.SetLicenseSessionEnd" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV17Pgmname ;
   private com.genexus.internet.HttpClient AV11HttpClient ;
   private app.devops.SdtLicenseSessionEnd AV14LicenseSessionEnd ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
}

