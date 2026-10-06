package app.ponteway.v1.openapicommon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class callapi extends GXProcedure
{
   public callapi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( callapi.class ), "" );
   }

   public callapi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.ponteway.v1.openapicommon.SdtApiResponse executeUdp( String aP0 ,
                                                                   String aP1 ,
                                                                   com.genexus.util.GXProperties aP2 ,
                                                                   com.genexus.util.GXProperties aP3 ,
                                                                   com.genexus.util.GXProperties aP4 ,
                                                                   com.genexus.util.GXProperties aP5 ,
                                                                   com.genexus.util.GXProperties aP6 ,
                                                                   String aP7 ,
                                                                   String aP8 ,
                                                                   short aP9 ,
                                                                   short aP10 )
   {
      callapi.this.aP11 = new app.ponteway.v1.openapicommon.SdtApiResponse[] {new app.ponteway.v1.openapicommon.SdtApiResponse()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        com.genexus.util.GXProperties aP2 ,
                        com.genexus.util.GXProperties aP3 ,
                        com.genexus.util.GXProperties aP4 ,
                        com.genexus.util.GXProperties aP5 ,
                        com.genexus.util.GXProperties aP6 ,
                        String aP7 ,
                        String aP8 ,
                        short aP9 ,
                        short aP10 ,
                        app.ponteway.v1.openapicommon.SdtApiResponse[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             com.genexus.util.GXProperties aP2 ,
                             com.genexus.util.GXProperties aP3 ,
                             com.genexus.util.GXProperties aP4 ,
                             com.genexus.util.GXProperties aP5 ,
                             com.genexus.util.GXProperties aP6 ,
                             String aP7 ,
                             String aP8 ,
                             short aP9 ,
                             short aP10 ,
                             app.ponteway.v1.openapicommon.SdtApiResponse[] aP11 )
   {
      callapi.this.AV12Method = aP0;
      callapi.this.AV20Url = aP1;
      callapi.this.AV28VarHeaders = aP2;
      callapi.this.AV22VarPathParams = aP3;
      callapi.this.AV24VarQueryParams = aP4;
      callapi.this.AV26FileFormParams = aP5;
      callapi.this.AV13VarFormParams = aP6;
      callapi.this.AV14PostData = aP7;
      callapi.this.AV11ContentType = aP8;
      callapi.this.AV19RetryCount = aP9;
      callapi.this.AV18RequestSecondsTimeout = aP10;
      callapi.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9httpClient.setTimeout( AV18RequestSecondsTimeout );
      if ( (GXutil.strcmp("", AV11ContentType)==0) )
      {
         AV9httpClient.addHeader("Content-Type", "application/json; char-set=utf-8");
      }
      else
      {
         AV9httpClient.addHeader("Content-Type", AV11ContentType);
      }
      AV29VarProperty = (com.genexus.util.GXProperty)AV28VarHeaders.first();
      while ( ! AV28VarHeaders.eof() )
      {
         AV9httpClient.addHeader(AV29VarProperty.getKey(), AV29VarProperty.getValue());
         AV29VarProperty = (com.genexus.util.GXProperty)AV28VarHeaders.next();
      }
      AV29VarProperty = (com.genexus.util.GXProperty)AV13VarFormParams.first();
      while ( ! AV13VarFormParams.eof() )
      {
         AV9httpClient.addVariable(AV29VarProperty.getKey(), AV29VarProperty.getValue());
         AV29VarProperty = (com.genexus.util.GXProperty)AV13VarFormParams.next();
      }
      if ( GXutil.strcmp(AV14PostData, AV15EmptyPostData.toJSonString()) != 0 )
      {
         AV9httpClient.addString(AV14PostData);
      }
      AV27File = (com.genexus.util.GXProperty)AV26FileFormParams.first();
      while ( ! AV26FileFormParams.eof() )
      {
         AV9httpClient.addFile(AV27File.getValue(), AV27File.getKey());
         AV27File = (com.genexus.util.GXProperty)AV26FileFormParams.next();
      }
      AV21UrlWithParms = AV20Url ;
      AV17RegularExpression = "(\\{(\\w+?)\\})" ;
      AV16RegExMatchCollection = GxRegex.Matches(AV21UrlWithParms,AV17RegularExpression) ;
      AV33GXV1 = 1 ;
      while ( AV33GXV1 <= AV16RegExMatchCollection.size() )
      {
         AV10RegExMatch = (GxRegexMatch)((GxRegexMatch)AV16RegExMatchCollection.elementAt(-1+AV33GXV1));
         AV23VarPathValue = AV22VarPathParams.get(AV10RegExMatch.getGroups().item(2)) ;
         AV21UrlWithParms = GXutil.strReplace( AV21UrlWithParms, AV10RegExMatch.getValue(), AV23VarPathValue) ;
         AV33GXV1 = (int)(AV33GXV1+1) ;
      }
      AV25VarQueryValue = (com.genexus.util.GXProperty)AV24VarQueryParams.first();
      while ( ! AV24VarQueryParams.eof() )
      {
         AV30QueryParams += GXutil.format( "%1=%2&", AV25VarQueryValue.getKey(), AV25VarQueryValue.getValue(), "", "", "", "", "", "", "") ;
         AV25VarQueryValue = (com.genexus.util.GXProperty)AV24VarQueryParams.next();
      }
      if ( ! (GXutil.strcmp("", AV30QueryParams)==0) )
      {
         AV21UrlWithParms += "?" + AV30QueryParams ;
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).warning("---------------", AV34Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).warning(AV21UrlWithParms, AV34Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).warning("---------------", AV34Pgmname) ;
      AV9httpClient.execute(AV12Method, AV21UrlWithParms);
      AV8ApiResponse.setgxTv_SdtApiResponse_Content( AV9httpClient.getString() );
      AV8ApiResponse.setgxTv_SdtApiResponse_Statuscode( AV9httpClient.getStatusCode() );
      AV8ApiResponse.setgxTv_SdtApiResponse_Errorcode( AV9httpClient.getErrCode() );
      AV8ApiResponse.setgxTv_SdtApiResponse_Errormessage( AV9httpClient.getReasonLine() );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP11[0] = callapi.this.AV8ApiResponse;
      CloseOpenCursors();
      AV9httpClient.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ApiResponse = new app.ponteway.v1.openapicommon.SdtApiResponse(remoteHandle, context);
      AV9httpClient = new com.genexus.internet.HttpClient();
      AV29VarProperty = new com.genexus.util.GXProperty();
      AV15EmptyPostData = new com.genexus.util.GXProperties();
      AV27File = new com.genexus.util.GXProperty();
      AV21UrlWithParms = "" ;
      AV17RegularExpression = "" ;
      AV16RegExMatchCollection = new com.genexus.GxUnknownObjectCollection();
      AV10RegExMatch = new GxRegexMatch();
      AV23VarPathValue = "" ;
      AV25VarQueryValue = new com.genexus.util.GXProperty();
      AV30QueryParams = "" ;
      AV34Pgmname = "" ;
      AV34Pgmname = "PonteWay.v1.OpenAPICommon.CallApi" ;
      /* GeneXus formulas. */
      AV34Pgmname = "PonteWay.v1.OpenAPICommon.CallApi" ;
      Gx_err = (short)(0) ;
   }

   private short AV19RetryCount ;
   private short AV18RequestSecondsTimeout ;
   private short Gx_err ;
   private int AV33GXV1 ;
   private String AV12Method ;
   private String AV11ContentType ;
   private String AV17RegularExpression ;
   private String AV23VarPathValue ;
   private String AV30QueryParams ;
   private String AV34Pgmname ;
   private String AV20Url ;
   private String AV14PostData ;
   private String AV21UrlWithParms ;
   private com.genexus.internet.HttpClient AV9httpClient ;
   private com.genexus.util.GXProperties AV15EmptyPostData ;
   private app.ponteway.v1.openapicommon.SdtApiResponse[] aP11 ;
   private com.genexus.util.GXProperties AV28VarHeaders ;
   private com.genexus.util.GXProperties AV22VarPathParams ;
   private com.genexus.util.GXProperties AV24VarQueryParams ;
   private com.genexus.util.GXProperties AV26FileFormParams ;
   private com.genexus.util.GXProperties AV13VarFormParams ;
   private com.genexus.util.GXProperty AV29VarProperty ;
   private com.genexus.util.GXProperty AV27File ;
   private com.genexus.util.GXProperty AV25VarQueryValue ;
   private GxRegexMatch AV10RegExMatch ;
   private com.genexus.GxUnknownObjectCollection AV16RegExMatchCollection ;
   private app.ponteway.v1.openapicommon.SdtApiResponse AV8ApiResponse ;
}

