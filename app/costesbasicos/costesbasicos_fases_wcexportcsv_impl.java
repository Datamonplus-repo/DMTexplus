package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class costesbasicos_fases_wcexportcsv_impl extends GXWebProcedure
{
   public costesbasicos_fases_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      GXt_char1 = AV43Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Station = GXt_char1 ;
      GXv_char2[0] = AV34Emprcod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char4[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char2, GXv_char3, GXv_char4) ;
      costesbasicos_fases_wcexportcsv_impl.this.AV34Emprcod = GXv_char2[0] ;
      costesbasicos_fases_wcexportcsv_impl.this.AV44EmprNom = GXv_char3[0] ;
      costesbasicos_fases_wcexportcsv_impl.this.AV45UsurCod = GXv_char4[0] ;
      AV39CostesBasicos_Fases_SDTjson = AV40Websession.getValue(httpContext.getMessage( "CostesBasicos_Fases_SDT", "")) ;
      AV30CostesBasicos_Fases_SDT.fromJSonString(AV39CostesBasicos_Fases_SDTjson, null);
      AV40Websession.remove(httpContext.getMessage( "CostesBasicos_Fases_SDT", ""));
      GXt_int5 = (byte)(AV41TasasEstandar) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV34Emprcod, httpContext.getMessage( "TASSTD", ""), GXv_int6) ;
      costesbasicos_fases_wcexportcsv_impl.this.GXt_int5 = GXv_int6[0] ;
      AV41TasasEstandar = GXt_int5 ;
      GXt_int5 = (byte)(AV42Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV34Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      costesbasicos_fases_wcexportcsv_impl.this.GXt_int5 = GXv_int6[0] ;
      AV42Moda21 = GXt_int5 ;
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
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
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
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
      AV12Filename = "./PrivateTempStorage/" + "CostesBasicos_Fases_WCExportCSV-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV20Session.getValue("CostesBasicos.CostesBasicos_Fases_WCColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV20Session.getValue("CostesBasicos.CostesBasicos_Fases_WCColumnsSelector") ;
         AV16ColumnsSelector.fromxml(AV19ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Tot.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T. Real", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T. Teo", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T. Teo (calc.)", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Mm", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Real", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Teo.", "") : "") ;
      if ( AV38IsAuthorizedCostesBasicos_Fases_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "MOD", "") : "") ;
      }
      if ( AV38IsAuthorizedCostesBasicos_Fases_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "MOI", "") : "") ;
      }
      if ( AV38IsAuthorizedCostesBasicos_Fases_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Energia", "") : "") ;
      }
      if ( AV38IsAuthorizedCostesBasicos_Fases_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Gas", "") : "") ;
      }
      if ( AV38IsAuthorizedCostesBasicos_Fases_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Agua", "") : "") ;
      }
      if ( AV38IsAuthorizedCostesBasicos_Fases_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Gastos Ind.", "") : "") ;
      }
      if ( AV38IsAuthorizedCostesBasicos_Fases_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Adm. Cent.", "") : "") ;
      }
      if ( AV38IsAuthorizedCostesBasicos_Fases_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Amortizaciones", "") : "") ;
      }
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tiempo m", "") : "") ;
      if ( GXutil.len( AV15TextFileLine) > 0 )
      {
         AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV30CostesBasicos_Fases_SDT.size() )
      {
         AV10CostesBasicos_Fases_SDTItem = (app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)((app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)AV30CostesBasicos_Fases_SDT.elementAt(-1+AV66GXV1));
         AV15TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if (returnInSub) return;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char1 = AV15TextFileLine ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec(), ";", ","), GXv_char4) ;
            costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char4[0] ;
            AV15TextFileLine += GXt_char1 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin(), 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char1 = AV15TextFileLine ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod(), ";", ","), GXv_char4) ;
            costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char4[0] ;
            AV15TextFileLine += GXt_char1 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char1 = AV15TextFileLine ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc(), ";", ","), GXv_char4) ;
            costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char4[0] ;
            AV15TextFileLine += GXt_char1 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char1 = AV15TextFileLine ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod(), ";", ","), GXv_char4) ;
            costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char4[0] ;
            AV15TextFileLine += GXt_char1 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char1 = AV15TextFileLine ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc(), ";", ","), GXv_char4) ;
            costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char4[0] ;
            AV15TextFileLine += GXt_char1 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char1 = AV15TextFileLine ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed(), ";", ","), GXv_char4) ;
            costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char4[0] ;
            AV15TextFileLine += GXt_char1 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char1 = AV15TextFileLine ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5(), ";", ","), GXv_char4) ;
            costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char4[0] ;
            AV15TextFileLine += GXt_char1 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char1 = AV15TextFileLine ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5(), ";", ","), GXv_char4) ;
            costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char4[0] ;
            AV15TextFileLine += GXt_char1 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea(), 5, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo(), 5, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo(), 5, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin(), 10, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m(), 16, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm(), 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod(), 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi(), 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia(), 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas(), 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua(), 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi(), 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc(), 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam(), 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10CostesBasicos_Fases_SDTItem.getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m(), 6, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if (returnInSub) return;
         if ( GXutil.len( AV15TextFileLine) > 0 )
         {
            AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S181( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      AV38IsAuthorizedCostesBasicos_Fases_SDT = (boolean)(((AV41TasasEstandar==1))) ;
      AV38IsAuthorizedCostesBasicos_Fases_SDT = (boolean)(((AV41TasasEstandar==1))) ;
      AV38IsAuthorizedCostesBasicos_Fases_SDT = (boolean)(((AV41TasasEstandar==1))) ;
      AV38IsAuthorizedCostesBasicos_Fases_SDT = (boolean)(((AV41TasasEstandar==1))) ;
      AV38IsAuthorizedCostesBasicos_Fases_SDT = (boolean)(((AV41TasasEstandar==1))) ;
      AV38IsAuthorizedCostesBasicos_Fases_SDT = (boolean)(((AV41TasasEstandar==1))) ;
      AV38IsAuthorizedCostesBasicos_Fases_SDT = (boolean)(((AV41TasasEstandar==1))) ;
      AV38IsAuthorizedCostesBasicos_Fases_SDT = (boolean)(((AV41TasasEstandar==1))) ;
   }

   public void S191( )
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
            AV28HttpResponse.addHeader("Content-Disposition", "attachment;filename=CostesBasicos_Fases_WCExportCSV.csv");
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

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV16ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Barfassec", "", "", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Barordlin", "", "Orden", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Fascod", "", "Fase", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Fasdsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Maqcod", "", "Maquina", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__MaqDsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Unidades", "", "Unidades", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__UnidadesT", "", "Unidades Tot.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__BarUnimed", "", "Und", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__HorIni_5", "", "Inicio", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__HorFin_5", "", "Fin", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__BarTieRea", "", "T. Real", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__TieTeo", "", "T. Teo", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__TTeo", "", "T. Teo (calc.)", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__MaqCosMin", "", "Coste Mm", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Coste_m", "", "Coste Real", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Coste_tm", "", "Coste Teo.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      if ( AV41TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Mmod", "", "MOD", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      if ( AV41TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Mmoi", "", "MOI", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      if ( AV41TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Menergia", "", "Energia", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      if ( AV41TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Mgas", "", "Gas", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      if ( AV41TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Magua", "", "Agua", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      if ( AV41TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Mgi", "", "Gastos Ind.", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      if ( AV41TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Madc", "", "Adm. Cent.", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      if ( AV41TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Mam", "", "Amortizaciones", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CostesBasicos_Fases_SDT__Tiempo_m", "", "Tiempo m", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV21UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CostesBasicos.CostesBasicos_Fases_WCColumnsSelector", GXv_char4) ;
      costesbasicos_fases_wcexportcsv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV21UserCustomValue)==0) ) )
      {
         AV17ColumnsSelectorAux.fromxml(AV21UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV17ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV17ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("CostesBasicos.CostesBasicos_Fases_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CostesBasicos.CostesBasicos_Fases_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV20Session.getValue("CostesBasicos.CostesBasicos_Fases_WCGridState"), null, null);
      }
      AV67GXV2 = 1 ;
      while ( AV67GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV29FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV35Barcod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV36Barcodreo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV37Barcodpar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV46clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV47Clinom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV48barser = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV49barserdsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV50barcolnom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV51Barcolnum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARKGM") == 0 )
         {
            AV52barkgm = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARMTR") == 0 )
         {
            AV53Barmtr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COSTEFAB2") == 0 )
         {
            AV54costefab2 = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAGUA") == 0 )
         {
            AV55mAgua = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MENERGIA") == 0 )
         {
            AV56menergia = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MGAS") == 0 )
         {
            AV57mgas = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MMOD") == 0 )
         {
            AV58mmod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MMOI") == 0 )
         {
            AV59mmoi = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MADC") == 0 )
         {
            AV60madc = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAM") == 0 )
         {
            AV61mam = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MGI") == 0 )
         {
            AV62mgi = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COSTEOPERARIO1") == 0 )
         {
            AV63costeoperario1 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV67GXV2 = (int)(AV67GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S171( )
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
      AV43Station = "" ;
      AV34Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV44EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV45UsurCod = "" ;
      AV39CostesBasicos_Fases_SDTjson = "" ;
      AV40Websession = httpContext.getWebSession();
      AV30CostesBasicos_Fases_SDT = new GXBaseCollection<app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem>(app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem.class, "CostesBasicos_Fases_SDTItem", "TexplusNET", remoteHandle);
      GXv_int6 = new byte[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12Filename = "" ;
      AV11TextFile = new com.genexus.util.GXFile();
      AV15TextFileLine = "" ;
      AV20Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV10CostesBasicos_Fases_SDTItem = new app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem(remoteHandle, context);
      AV28HttpResponse = httpContext.getHttpResponse();
      AV13ErrorMessage = "" ;
      AV21UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV29FilterFullText = "" ;
      AV37Barcodpar = "" ;
      AV47Clinom = "" ;
      AV48barser = "" ;
      AV49barserdsc = "" ;
      AV50barcolnom = "" ;
      AV52barkgm = DecimalUtil.ZERO ;
      AV53Barmtr = DecimalUtil.ZERO ;
      AV54costefab2 = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV36Barcodreo ;
   private short gxcookieaux ;
   private short AV41TasasEstandar ;
   private short AV42Moda21 ;
   private short AV55mAgua ;
   private short AV56menergia ;
   private short AV57mgas ;
   private short AV58mmod ;
   private short AV59mmoi ;
   private short AV60madc ;
   private short AV61mam ;
   private short AV62mgi ;
   private short AV63costeoperario1 ;
   private short Gx_err ;
   private int AV14Random ;
   private int AV66GXV1 ;
   private int AV67GXV2 ;
   private int AV35Barcod ;
   private int AV46clicod ;
   private int AV51Barcolnum ;
   private java.math.BigDecimal AV52barkgm ;
   private java.math.BigDecimal AV53Barmtr ;
   private java.math.BigDecimal AV54costefab2 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV43Station ;
   private String AV34Emprcod ;
   private String GXv_char2[] ;
   private String AV44EmprNom ;
   private String GXv_char3[] ;
   private String AV45UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV37Barcodpar ;
   private String AV47Clinom ;
   private String AV48barser ;
   private String AV49barserdsc ;
   private String AV50barcolnom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV38IsAuthorizedCostesBasicos_Fases_SDT ;
   private String AV39CostesBasicos_Fases_SDTjson ;
   private String AV15TextFileLine ;
   private String AV19ColumnsSelectorXML ;
   private String AV21UserCustomValue ;
   private String AV12Filename ;
   private String AV13ErrorMessage ;
   private String AV29FilterFullText ;
   private com.genexus.webpanels.WebSession AV40Websession ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.util.GXFile AV11TextFile ;
   private com.genexus.internet.HttpResponse AV28HttpResponse ;
   private GXBaseCollection<app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem> AV30CostesBasicos_Fases_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem AV10CostesBasicos_Fases_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

