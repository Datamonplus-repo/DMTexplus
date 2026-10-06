package app.ponteway.v1 ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class postapiauthlogin extends GXProcedure
{
   public postapiauthlogin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( postapiauthlogin.class ), "" );
   }

   public postapiauthlogin( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( com.genexus.util.GXProperties aP0 ,
                              app.ponteway.v1.SdtLoginRequest aP1 ,
                              String aP2 ,
                              com.genexus.SdtMessages_Message[] aP3 )
   {
      postapiauthlogin.this.aP4 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( com.genexus.util.GXProperties aP0 ,
                        app.ponteway.v1.SdtLoginRequest aP1 ,
                        String aP2 ,
                        com.genexus.SdtMessages_Message[] aP3 ,
                        boolean[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( com.genexus.util.GXProperties aP0 ,
                             app.ponteway.v1.SdtLoginRequest aP1 ,
                             String aP2 ,
                             com.genexus.SdtMessages_Message[] aP3 ,
                             boolean[] aP4 )
   {
      postapiauthlogin.this.AV10ServerUrlTemplatingVar = aP0;
      postapiauthlogin.this.AV8body = aP1;
      postapiauthlogin.this.AV9bearer = aP2;
      postapiauthlogin.this.aP3 = aP3;
      postapiauthlogin.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11localVarPath = "/api/Auth/login" ;
      AV18localVarHeaders.set("Authorization", GXutil.format( "Bearer %1", new app.ponteway.v1.openapicommon.varchartojsonformat(remoteHandle, context).executeUdp( AV9bearer), "", "", "", "", "", "", "", ""));
      GXt_SdtApiResponse1 = AV14localVarResponse;
      GXt_char2 = "" ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.ponteway.v1.apibaseurloliveiraegoncalves(remoteHandle, context).execute( GXutil.format( "%1 - %2", GXutil.trim( AV11localVarPath), "POST", "", "", "", "", "", "", ""), GXv_char4) ;
      postapiauthlogin.this.GXt_char3 = GXv_char4[0] ;
      GXv_char5[0] = GXt_char2 ;
      new app.ponteway.v1.openapicommon.processserver(remoteHandle, context).execute( GXt_char3, AV10ServerUrlTemplatingVar, GXv_char5) ;
      postapiauthlogin.this.GXt_char2 = GXv_char5[0] ;
      GXv_SdtApiResponse6[0] = GXt_SdtApiResponse1;
      new app.ponteway.v1.openapicommon.callapi(remoteHandle, context).execute( "POST", GXt_char2+AV11localVarPath, AV18localVarHeaders, AV12localVarPathParams, AV13localVarQueryParams, AV17localFileFormParams, AV16localVarFormParams, AV8body.toJSonString(false, true), "", (short)(0), (short)(0), GXv_SdtApiResponse6) ;
      GXt_SdtApiResponse1 = GXv_SdtApiResponse6[0] ;
      AV14localVarResponse = GXt_SdtApiResponse1;
      AV15localVarStatusCode = (short)(AV14localVarResponse.getgxTv_SdtApiResponse_Statuscode()) ;
      if ( ( AV15localVarStatusCode >= 200 ) && ( AV15localVarStatusCode < 300 ) )
      {
         AV19IsSuccess = true ;
      }
      else
      {
         AV19IsSuccess = false ;
         AV20HttpMessage.setgxTv_SdtMessages_Message_Type( (byte)(1) );
      }
      if ( AV15localVarStatusCode == 200 )
      {
         AV20HttpMessage.setgxTv_SdtMessages_Message_Id( "200" );
         AV20HttpMessage.setgxTv_SdtMessages_Message_Description( "OK" );
         AV22LoginResponse.fromJSonString(AV14localVarResponse.getgxTv_SdtApiResponse_Content(), null);
         AV21WebSession.setValue("t7Lo7sxMP3o=", GXutil.trim( AV22LoginResponse.getgxTv_SdtLoginResponse_Accesstoken()));
      }
      else
      {
         AV20HttpMessage.setgxTv_SdtMessages_Message_Description( AV14localVarResponse.getgxTv_SdtApiResponse_Errormessage() );
         AV20HttpMessage.setgxTv_SdtMessages_Message_Id( GXutil.str( AV15localVarStatusCode, 4, 0) );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = postapiauthlogin.this.AV20HttpMessage;
      this.aP4[0] = postapiauthlogin.this.AV19IsSuccess;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20HttpMessage = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV11localVarPath = "" ;
      AV18localVarHeaders = new com.genexus.util.GXProperties();
      AV14localVarResponse = new app.ponteway.v1.openapicommon.SdtApiResponse(remoteHandle, context);
      GXt_SdtApiResponse1 = new app.ponteway.v1.openapicommon.SdtApiResponse(remoteHandle, context);
      GXt_char2 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      AV12localVarPathParams = new com.genexus.util.GXProperties();
      AV13localVarQueryParams = new com.genexus.util.GXProperties();
      AV17localFileFormParams = new com.genexus.util.GXProperties();
      AV16localVarFormParams = new com.genexus.util.GXProperties();
      GXv_SdtApiResponse6 = new app.ponteway.v1.openapicommon.SdtApiResponse[1] ;
      AV22LoginResponse = new app.ponteway.v1.SdtLoginResponse(remoteHandle, context);
      AV21WebSession = httpContext.getWebSession();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15localVarStatusCode ;
   private short Gx_err ;
   private String AV9bearer ;
   private String AV11localVarPath ;
   private String GXt_char2 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private boolean AV19IsSuccess ;
   private boolean[] aP4 ;
   private com.genexus.SdtMessages_Message[] aP3 ;
   private com.genexus.webpanels.WebSession AV21WebSession ;
   private com.genexus.util.GXProperties AV10ServerUrlTemplatingVar ;
   private com.genexus.util.GXProperties AV18localVarHeaders ;
   private com.genexus.util.GXProperties AV12localVarPathParams ;
   private com.genexus.util.GXProperties AV13localVarQueryParams ;
   private com.genexus.util.GXProperties AV17localFileFormParams ;
   private com.genexus.util.GXProperties AV16localVarFormParams ;
   private com.genexus.SdtMessages_Message AV20HttpMessage ;
   private app.ponteway.v1.SdtLoginRequest AV8body ;
   private app.ponteway.v1.openapicommon.SdtApiResponse AV14localVarResponse ;
   private app.ponteway.v1.openapicommon.SdtApiResponse GXt_SdtApiResponse1 ;
   private app.ponteway.v1.openapicommon.SdtApiResponse GXv_SdtApiResponse6[] ;
   private app.ponteway.v1.SdtLoginResponse AV22LoginResponse ;
}

