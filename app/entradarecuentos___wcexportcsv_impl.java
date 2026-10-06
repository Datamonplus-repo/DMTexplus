package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradarecuentos___wcexportcsv_impl extends GXWebProcedure
{
   public entradarecuentos___wcexportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36EntradaRecuentos_SDT_json = AV37WebSession.getValue(httpContext.getMessage( "&EntradaRecuentos_SDT_json", "")) ;
      AV30EntradaRecuentos_SDT.fromJSonString(AV36EntradaRecuentos_SDT_json, null);
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S181 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S171 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV14Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "./PrivateTempStorage/" + "EntradaRecuentos___WCExportCSV-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".csv" ;
      AV11TextFile.setSource( AV12Filename );
      AV11TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV15TextFileLine = "" ;
      AV15TextFileLine += httpContext.getMessage( "Producto", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Descripcion", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Exis. Teo. Alm.", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Exis. Real Alm.", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Diferencia", "") ;
      AV15TextFileLine += ";" ;
      AV15TextFileLine += httpContext.getMessage( "Lote", "") ;
      AV11TextFile.writeLine(AV15TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV40GXV1 = 1 ;
      while ( AV40GXV1 <= AV30EntradaRecuentos_SDT.size() )
      {
         AV10EntradaRecuentos_SDTItem = (app.SdtEntradaRecuentos_SDT_Item)((app.SdtEntradaRecuentos_SDT_Item)AV30EntradaRecuentos_SDT.elementAt(-1+AV40GXV1));
         AV15TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S151 ();
         if (returnInSub) return;
         GXt_char2 = AV15TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10EntradaRecuentos_SDTItem.getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnum(), ";", ","), GXv_char3) ;
         entradarecuentos___wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV15TextFileLine += GXt_char2 ;
         AV15TextFileLine += ";" ;
         GXt_char2 = AV15TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10EntradaRecuentos_SDTItem.getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnom(), ";", ","), GXv_char3) ;
         entradarecuentos___wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV15TextFileLine += GXt_char2 ;
         AV15TextFileLine += ";" ;
         AV15TextFileLine += GXutil.str( AV10EntradaRecuentos_SDTItem.getgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo(), 12, 4) ;
         AV15TextFileLine += ";" ;
         AV15TextFileLine += GXutil.str( AV10EntradaRecuentos_SDTItem.getgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea(), 12, 4) ;
         AV15TextFileLine += ";" ;
         AV15TextFileLine += GXutil.str( AV10EntradaRecuentos_SDTItem.getgxTv_SdtEntradaRecuentos_SDT_Item_Difer(), 12, 4) ;
         AV15TextFileLine += ";" ;
         GXt_char2 = AV15TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10EntradaRecuentos_SDTItem.getgxTv_SdtEntradaRecuentos_SDT_Item_Reclot(), ";", ","), GXv_char3) ;
         entradarecuentos___wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV15TextFileLine += GXt_char2 ;
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S161 ();
         if (returnInSub) return;
         AV11TextFile.writeLine(AV15TextFileLine);
         AV40GXV1 = (int)(AV40GXV1+1) ;
      }
   }

   public void S171( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV11TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV11TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV28HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV28HttpResponse.addHeader("Content-Disposition", "attachment;filename=EntradaRecuentos___WCExportCSV.csv");
         }
         AV28HttpResponse.addFile(AV11TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV11TextFile.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV13ErrorMessage = AV11TextFile.getErrDescription() ;
         AV11TextFile.close();
         AV28HttpResponse.addString(AV13ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S181( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("EntradaRecuentos___WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntradaRecuentos___WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV20Session.getValue("EntradaRecuentos___WCGridState"), null, null);
      }
      AV41GXV2 = 1 ;
      while ( AV41GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV29FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV35RecFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV41GXV2 = (int)(AV41GXV2+1) ;
      }
   }

   public void S151( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S161( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV36EntradaRecuentos_SDT_json = "" ;
      AV37WebSession = httpContext.getWebSession();
      AV30EntradaRecuentos_SDT = new GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item>(app.SdtEntradaRecuentos_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12Filename = "" ;
      AV11TextFile = new com.genexus.util.GXFile();
      AV15TextFileLine = "" ;
      AV10EntradaRecuentos_SDTItem = new app.SdtEntradaRecuentos_SDT_Item(remoteHandle, context);
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV28HttpResponse = httpContext.getHttpResponse();
      AV13ErrorMessage = "" ;
      AV20Session = httpContext.getWebSession();
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV29FilterFullText = "" ;
      AV34Emprcod = "" ;
      AV35RecFec = GXutil.nullDate() ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV14Random ;
   private int AV40GXV1 ;
   private int AV41GXV2 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV34Emprcod ;
   private java.util.Date AV35RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV36EntradaRecuentos_SDT_json ;
   private String AV15TextFileLine ;
   private String AV12Filename ;
   private String AV13ErrorMessage ;
   private String AV29FilterFullText ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.util.GXFile AV11TextFile ;
   private com.genexus.internet.HttpResponse AV28HttpResponse ;
   private GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item> AV30EntradaRecuentos_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.SdtEntradaRecuentos_SDT_Item AV10EntradaRecuentos_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

