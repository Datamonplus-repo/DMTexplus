package app.license ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getvalidatelicense extends GXProcedure
{
   public getvalidatelicense( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getvalidatelicense.class ), "" );
   }

   public getvalidatelicense( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.license.SdtLicenseValidate executeUdp( String aP0 )
   {
      getvalidatelicense.this.aP1 = new app.license.SdtLicenseValidate[] {new app.license.SdtLicenseValidate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        app.license.SdtLicenseValidate[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             app.license.SdtLicenseValidate[] aP1 )
   {
      getvalidatelicense.this.AV12Version = aP0;
      getvalidatelicense.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9LicenseData.setgxTv_SdtLicenseData_Licensekey( httpContext.getMessage( "LK-SV5JO-V2BIE-3HW07", "") );
      AV9LicenseData.setgxTv_SdtLicenseData_Token( httpContext.getMessage( "b2179aa7-fa74-dba0-ac35-b535d2473fc8", "") );
      AV9LicenseData.setgxTv_SdtLicenseData_Environmentid( httpContext.getMessage( "69acf3d97da34fb0ce539dfd", "") );
      AV9LicenseData.setgxTv_SdtLicenseData_Version( AV12Version );
      AV8HttpClient.setHost( httpContext.getMessage( "localhost", "") );
      AV8HttpClient.setBaseURL( httpContext.getMessage( "/api/license/", "") );
      AV8HttpClient.setPort( 3000 );
      AV8HttpClient.addHeader(httpContext.getMessage( "accept", ""), "*/*");
      AV8HttpClient.addHeader(httpContext.getMessage( "Content-Type", ""), httpContext.getMessage( "application/json", ""));
      AV8HttpClient.addString(AV9LicenseData.toJSonString(false, true));
      AV8HttpClient.execute("POST", httpContext.getMessage( "validate", ""));
      if ( AV10LicenseValidate.fromJSonString(AV8HttpClient.getString(), AV11Messages) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV8HttpClient.getString(), AV15Pgmname) ;
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).error(GXutil.format( httpContext.getMessage( "Erro: %1 - %2", ""), GXutil.str( AV8HttpClient.getErrCode(), 10, 2), AV8HttpClient.getErrDescription(), "", "", "", "", "", "", ""), AV15Pgmname) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = getvalidatelicense.this.AV10LicenseValidate;
      CloseOpenCursors();
      AV8HttpClient.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10LicenseValidate = new app.license.SdtLicenseValidate(remoteHandle, context);
      AV9LicenseData = new app.license.SdtLicenseData(remoteHandle, context);
      AV8HttpClient = new com.genexus.internet.HttpClient();
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV15Pgmname = "" ;
      AV15Pgmname = "License.GetValidateLicense" ;
      /* GeneXus formulas. */
      AV15Pgmname = "License.GetValidateLicense" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV15Pgmname ;
   private String AV12Version ;
   private com.genexus.internet.HttpClient AV8HttpClient ;
   private app.license.SdtLicenseData AV9LicenseData ;
   private app.license.SdtLicenseValidate[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private app.license.SdtLicenseValidate AV10LicenseValidate ;
}

