package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumendatatimedetalle_wcexportcsv_impl extends GXWebProcedure
{
   public informeproduccionresumendatatimedetalle_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV42InformeProduccionResumenDataTimeDetalle_SDTJson = AV43WebSession.getValue("&InformeProduccionResumenDataTimeDetalle_SDTJson") ;
      AV30InformeProduccionResumenDataTimeDetalle_SDT.fromJSonString(AV42InformeProduccionResumenDataTimeDetalle_SDTJson, null);
      AV43WebSession.remove("&InformeProduccionResumenDataTimeDetalle_SDTJson");
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
      S191 ();
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
      S181 ();
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
      AV12Filename = "./PrivateTempStorage/" + "InformeProduccionResumenDataTimeDetalle_WCExportCSV-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV20Session.getValue("Produccion.InformeProduccionResumenDataTimeDetalle_WCColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV20Session.getValue("Produccion.InformeProduccionResumenDataTimeDetalle_WCColumnsSelector") ;
         AV16ColumnsSelector.fromxml(AV19ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Turno", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "F?", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Minutos", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Art.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TC", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Matiz", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T?", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Sin Dec", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Con Dec", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Marca(calc. minutos)", "") : "") ;
      if ( GXutil.len( AV15TextFileLine) > 0 )
      {
         AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV30InformeProduccionResumenDataTimeDetalle_SDT.size() )
      {
         AV10InformeProduccionResumenDataTimeDetalle_SDTItem = (app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem)((app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem)AV30InformeProduccionResumenDataTimeDetalle_SDT.elementAt(-1+AV46GXV1));
         AV15TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if (returnInSub) return;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += localUtil.dtoc( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs(), 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur(), 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += localUtil.ttoc( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti(), 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += localUtil.ttoc( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf(), 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart(), 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol(), 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod(), 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod(), 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest(), 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2(), 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot(), ";", ","), GXv_char3) ;
            informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10InformeProduccionResumenDataTimeDetalle_SDTItem.getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca(), 1, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if (returnInSub) return;
         if ( GXutil.len( AV15TextFileLine) > 0 )
         {
            AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S181( )
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
            AV28HttpResponse.addHeader("Content-Disposition", "attachment;filename=InformeProduccionResumenDataTimeDetalle_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Barnhdr", "", "N Hdr", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Maqcod", "", "Maquina", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__MaqDsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hisprofec", "", "Fecha", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hisprokgr", "", "Kilos", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hispromtr", "", "Metros", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hispronpzs", "", "Piezas", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hisprotur", "", "Turno", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hisprof", "", "F?", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hisprodti", "", "Inicio", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hisprodtf", "", "Fin", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Minutos", "", "Minutos", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Clicod", "", "Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__CliNom", "", "Nombre", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Barser", "", "Articulo", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Barserdsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__BarTipArt", "", "Tipo Art.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__TipArtdsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Barcolnom", "", "Color", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Barcolnum", "", "Numero", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Bartipcol", "", "TC", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__MatCod", "", "Matiz", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__MatDsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Opecod", "", "Operario", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__OpeNom", "", "Nombre", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Fase", "", "Fase", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Fasdsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__FasActTin", "", "T?", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Parcod", "", "Paro", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Parcodnom", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__HisProEst", "", "Estado", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hisprotre2", "Minutos (formula tdiff)", "Sin Dec", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hisprotre3", "Minutos (formula tdiff)", "Con Dec", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__Hisprolot", "", "Lote", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "InformeProduccionResumenDataTimeDetalle_SDT__FlagMarca", "", "Marca(calc. minutos)", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV21UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.InformeProduccionResumenDataTimeDetalle_WCColumnsSelector", GXv_char3) ;
      informeproduccionresumendatatimedetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV21UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV21UserCustomValue)==0) ) )
      {
         AV17ColumnsSelectorAux.fromxml(AV21UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV17ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV17ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("Produccion.InformeProduccionResumenDataTimeDetalle_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.InformeProduccionResumenDataTimeDetalle_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV20Session.getValue("Produccion.InformeProduccionResumenDataTimeDetalle_WCGridState"), null, null);
      }
      AV47GXV2 = 1 ;
      while ( AV47GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV29FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INEMPRCOD") == 0 )
         {
            AV34INEmprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INHISESTREO") == 0 )
         {
            AV35INHisEstReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INMAQCOD1") == 0 )
         {
            AV36INMaqCod1 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INMAQCOD2") == 0 )
         {
            AV37INMaqCod2 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INHISPROFEC1") == 0 )
         {
            AV38INHisProFec1 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INHISPROFEC2") == 0 )
         {
            AV39INHisProFec2 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPERARIOFROM") == 0 )
         {
            AV40OperarioFrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPERARIOTO") == 0 )
         {
            AV41OperarioTo = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV47GXV2 = (int)(AV47GXV2+1) ;
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
      AV42InformeProduccionResumenDataTimeDetalle_SDTJson = "" ;
      AV43WebSession = httpContext.getWebSession();
      AV30InformeProduccionResumenDataTimeDetalle_SDT = new GXBaseCollection<app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem>(app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem.class, "InformeProduccionResumenDataTimeDetalle_SDTItem", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12Filename = "" ;
      AV11TextFile = new com.genexus.util.GXFile();
      AV15TextFileLine = "" ;
      AV20Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV10InformeProduccionResumenDataTimeDetalle_SDTItem = new app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem(remoteHandle, context);
      AV28HttpResponse = httpContext.getHttpResponse();
      AV13ErrorMessage = "" ;
      AV21UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV29FilterFullText = "" ;
      AV34INEmprcod = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35INHisEstReo ;
   private short gxcookieaux ;
   private short AV36INMaqCod1 ;
   private short AV37INMaqCod2 ;
   private short AV38INHisProFec1 ;
   private short AV39INHisProFec2 ;
   private short AV40OperarioFrom ;
   private short AV41OperarioTo ;
   private short Gx_err ;
   private int AV14Random ;
   private int AV46GXV1 ;
   private int AV47GXV2 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV34INEmprcod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV42InformeProduccionResumenDataTimeDetalle_SDTJson ;
   private String AV15TextFileLine ;
   private String AV19ColumnsSelectorXML ;
   private String AV21UserCustomValue ;
   private String AV12Filename ;
   private String AV13ErrorMessage ;
   private String AV29FilterFullText ;
   private com.genexus.webpanels.WebSession AV43WebSession ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.util.GXFile AV11TextFile ;
   private com.genexus.internet.HttpResponse AV28HttpResponse ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem> AV30InformeProduccionResumenDataTimeDetalle_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem AV10InformeProduccionResumenDataTimeDetalle_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

