package app.oliveiraegoncalves.v1 ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getapiv1guiasremessaogdedeateate extends GXProcedure
{
   public getapiv1guiasremessaogdedeateate( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getapiv1guiasremessaogdedeateate.class ), "" );
   }

   public getapiv1guiasremessaogdedeateate( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( com.genexus.util.GXProperties aP0 ,
                              java.util.Date aP1 ,
                              java.util.Date aP2 ,
                              String aP3 ,
                              com.genexus.SdtMessages_Message[] aP4 ,
                              app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO[] aP5 )
   {
      getapiv1guiasremessaogdedeateate.this.aP6 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( com.genexus.util.GXProperties aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        com.genexus.SdtMessages_Message[] aP4 ,
                        app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO[] aP5 ,
                        boolean[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( com.genexus.util.GXProperties aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             com.genexus.SdtMessages_Message[] aP4 ,
                             app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO[] aP5 ,
                             boolean[] aP6 )
   {
      getapiv1guiasremessaogdedeateate.this.AV11ServerUrlTemplatingVar = aP0;
      getapiv1guiasremessaogdedeateate.this.AV8de = aP1;
      getapiv1guiasremessaogdedeateate.this.AV9ate = aP2;
      getapiv1guiasremessaogdedeateate.this.AV10bearer = aP3;
      getapiv1guiasremessaogdedeateate.this.aP4 = aP4;
      getapiv1guiasremessaogdedeateate.this.aP5 = aP5;
      getapiv1guiasremessaogdedeateate.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12localVarPath = "/api/v1/GuiasRemessa/og/de/{de}/ate/{ate}" ;
      AV19localVarHeaders.set("Authorization", GXutil.format( "Bearer %1", new app.oliveiraegoncalves.v1.openapicommon.varchartojsonformat(remoteHandle, context).executeUdp( AV10bearer), "", "", "", "", "", "", "", ""));
      AV13localVarPathParams.set("de", new app.oliveiraegoncalves.v1.openapicommon.datetojsonformat(remoteHandle, context).executeUdp( AV8de));
      AV13localVarPathParams.set("ate", new app.oliveiraegoncalves.v1.openapicommon.datetojsonformat(remoteHandle, context).executeUdp( AV9ate));
      GXt_SdtApiResponse1 = AV15localVarResponse;
      GXt_char2 = "" ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.oliveiraegoncalves.v1.apibaseurloliveiraegoncalves(remoteHandle, context).execute( GXutil.format( "%1 - %2", GXutil.trim( AV12localVarPath), "GET", "", "", "", "", "", "", ""), GXv_char4) ;
      getapiv1guiasremessaogdedeateate.this.GXt_char3 = GXv_char4[0] ;
      GXv_char5[0] = GXt_char2 ;
      new app.oliveiraegoncalves.v1.openapicommon.processserver(remoteHandle, context).execute( GXt_char3, AV11ServerUrlTemplatingVar, GXv_char5) ;
      getapiv1guiasremessaogdedeateate.this.GXt_char2 = GXv_char5[0] ;
      GXv_SdtApiResponse6[0] = GXt_SdtApiResponse1;
      new app.oliveiraegoncalves.v1.openapicommon.callapi(remoteHandle, context).execute( "GET", GXt_char2+AV12localVarPath, AV19localVarHeaders, AV13localVarPathParams, AV14localVarQueryParams, AV18localFileFormParams, AV17localVarFormParams, "", "", (short)(0), (short)(0), GXv_SdtApiResponse6) ;
      GXt_SdtApiResponse1 = GXv_SdtApiResponse6[0] ;
      AV15localVarResponse = GXt_SdtApiResponse1;
      AV16localVarStatusCode = (short)(AV15localVarResponse.getgxTv_SdtApiResponse_Statuscode()) ;
      if ( ( AV16localVarStatusCode >= 200 ) && ( AV16localVarStatusCode < 300 ) )
      {
         AV20IsSuccess = true ;
      }
      else
      {
         AV20IsSuccess = false ;
         AV21HttpMessage.setgxTv_SdtMessages_Message_Type( (byte)(1) );
      }
      if ( AV16localVarStatusCode == 200 )
      {
         AV21HttpMessage.setgxTv_SdtMessages_Message_Id( "200" );
         AV21HttpMessage.setgxTv_SdtMessages_Message_Description( "OK" );
         if ( AV22GuiaRemessaLinhaDTO.fromJSonString(AV15localVarResponse.getgxTv_SdtApiResponse_Content(), AV23Messages) )
         {
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( " GuiaRemessaLinhaDTO :  ", "")+GXutil.str( AV15localVarResponse.getgxTv_SdtApiResponse_Errorcode(), 4, 0)+"-"+AV15localVarResponse.getgxTv_SdtApiResponse_Errormessage(), AV27Pgmname) ;
         }
         else
         {
            AV28GXV1 = 1 ;
            while ( AV28GXV1 <= AV23Messages.size() )
            {
               AV24Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV23Messages.elementAt(-1+AV28GXV1));
               new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "%1-%2", AV24Message.getgxTv_SdtMessages_Message_Id(), AV24Message.getgxTv_SdtMessages_Message_Description(), "", "", "", "", "", "", ""), AV27Pgmname) ;
               AV28GXV1 = (int)(AV28GXV1+1) ;
            }
         }
      }
      else
      {
         AV21HttpMessage.setgxTv_SdtMessages_Message_Description( AV15localVarResponse.getgxTv_SdtApiResponse_Errormessage() );
         AV21HttpMessage.setgxTv_SdtMessages_Message_Id( GXutil.str( AV16localVarStatusCode, 4, 0) );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = getapiv1guiasremessaogdedeateate.this.AV21HttpMessage;
      this.aP5[0] = getapiv1guiasremessaogdedeateate.this.AV22GuiaRemessaLinhaDTO;
      this.aP6[0] = getapiv1guiasremessaogdedeateate.this.AV20IsSuccess;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21HttpMessage = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV22GuiaRemessaLinhaDTO = new app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO(remoteHandle, context);
      AV12localVarPath = "" ;
      AV19localVarHeaders = new com.genexus.util.GXProperties();
      AV13localVarPathParams = new com.genexus.util.GXProperties();
      AV15localVarResponse = new app.oliveiraegoncalves.v1.openapicommon.SdtApiResponse(remoteHandle, context);
      GXt_SdtApiResponse1 = new app.oliveiraegoncalves.v1.openapicommon.SdtApiResponse(remoteHandle, context);
      GXt_char2 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      AV14localVarQueryParams = new com.genexus.util.GXProperties();
      AV18localFileFormParams = new com.genexus.util.GXProperties();
      AV17localVarFormParams = new com.genexus.util.GXProperties();
      GXv_SdtApiResponse6 = new app.oliveiraegoncalves.v1.openapicommon.SdtApiResponse[1] ;
      AV23Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV27Pgmname = "" ;
      AV24Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV27Pgmname = "oliveiraegoncalves.v1.GetApiV1GuiasRemessaOgDeDeAteAte" ;
      /* GeneXus formulas. */
      AV27Pgmname = "oliveiraegoncalves.v1.GetApiV1GuiasRemessaOgDeDeAteAte" ;
      Gx_err = (short)(0) ;
   }

   private short AV16localVarStatusCode ;
   private short Gx_err ;
   private int AV28GXV1 ;
   private String AV12localVarPath ;
   private String GXt_char2 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String AV27Pgmname ;
   private java.util.Date AV8de ;
   private java.util.Date AV9ate ;
   private boolean AV20IsSuccess ;
   private String AV10bearer ;
   private boolean[] aP6 ;
   private com.genexus.SdtMessages_Message[] aP4 ;
   private app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO[] aP5 ;
   private com.genexus.util.GXProperties AV11ServerUrlTemplatingVar ;
   private com.genexus.util.GXProperties AV19localVarHeaders ;
   private com.genexus.util.GXProperties AV13localVarPathParams ;
   private com.genexus.util.GXProperties AV14localVarQueryParams ;
   private com.genexus.util.GXProperties AV18localFileFormParams ;
   private com.genexus.util.GXProperties AV17localVarFormParams ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV23Messages ;
   private com.genexus.SdtMessages_Message AV21HttpMessage ;
   private com.genexus.SdtMessages_Message AV24Message ;
   private app.oliveiraegoncalves.v1.openapicommon.SdtApiResponse AV15localVarResponse ;
   private app.oliveiraegoncalves.v1.openapicommon.SdtApiResponse GXt_SdtApiResponse1 ;
   private app.oliveiraegoncalves.v1.openapicommon.SdtApiResponse GXv_SdtApiResponse6[] ;
   private app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO AV22GuiaRemessaLinhaDTO ;
}

