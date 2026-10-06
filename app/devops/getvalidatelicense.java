package app.devops ;
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
   public app.devops.SdtLicenseValidate executeUdp( String aP0 )
   {
      getvalidatelicense.this.aP1 = new app.devops.SdtLicenseValidate[] {new app.devops.SdtLicenseValidate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        app.devops.SdtLicenseValidate[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             app.devops.SdtLicenseValidate[] aP1 )
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
      GXv_SdtWWPContext1[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV13WWPContext = GXv_SdtWWPContext1[0] ;
      AV9LicenseData.setgxTv_SdtLicenseData_Licensekey( AV13WWPContext.getgxTv_SdtWWPContext_Licensekey() );
      AV9LicenseData.setgxTv_SdtLicenseData_Token( AV13WWPContext.getgxTv_SdtWWPContext_Token() );
      AV9LicenseData.setgxTv_SdtLicenseData_Environmentid( AV13WWPContext.getgxTv_SdtWWPContext_Environmentid() );
      AV9LicenseData.setgxTv_SdtLicenseData_Product( AV13WWPContext.getgxTv_SdtWWPContext_Product() );
      AV9LicenseData.setgxTv_SdtLicenseData_Version( AV12Version );
      AV8HttpClient.setHost( httpContext.getMessage( "dmanager.api.datamonplus.com", "") );
      AV8HttpClient.setSecure( (byte)(1) );
      AV8HttpClient.setBaseURL( httpContext.getMessage( "/api/license/", "") );
      AV8HttpClient.addHeader(httpContext.getMessage( "accept", ""), "*/*");
      AV8HttpClient.addHeader(httpContext.getMessage( "Content-Type", ""), httpContext.getMessage( "application/json", ""));
      AV8HttpClient.addString(AV9LicenseData.toJSonString(false, true));
      AV8HttpClient.execute("POST", httpContext.getMessage( "validate", ""));
      if ( AV10LicenseValidate.fromJSonString(AV8HttpClient.getString(), AV11Messages) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV8HttpClient.getString(), AV16Pgmname) ;
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).error(GXutil.format( httpContext.getMessage( "Erro: %1 - %2", ""), GXutil.str( AV8HttpClient.getErrCode(), 10, 2), AV8HttpClient.getErrDescription(), "", "", "", "", "", "", ""), AV16Pgmname) ;
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
      AV10LicenseValidate = new app.devops.SdtLicenseValidate(remoteHandle, context);
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV9LicenseData = new app.devops.SdtLicenseData(remoteHandle, context);
      AV8HttpClient = new com.genexus.internet.HttpClient();
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV16Pgmname = "" ;
      AV16Pgmname = "DevOps.GetValidateLicense" ;
      /* GeneXus formulas. */
      AV16Pgmname = "DevOps.GetValidateLicense" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV16Pgmname ;
   private String AV12Version ;
   private com.genexus.internet.HttpClient AV8HttpClient ;
   private app.devops.SdtLicenseData AV9LicenseData ;
   private app.devops.SdtLicenseValidate[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private app.devops.SdtLicenseValidate AV10LicenseValidate ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

