package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl extends GXWebProcedure
{
   public analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "AnalisisCostesHistoricosRecetas_ToJson") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV56AnalisisCostesHistoricosRecetas_ToJson = gxfirstwebparm ;
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV55WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV55WWPContext = GXv_SdtWWPContext1[0] ;
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
      AV45Random = (int)(GXutil.random( )*10000) ;
      AV34Filename = "AnalisisCostesHistoricoRecetas_ExportCSV-" + GXutil.trim( GXutil.str( AV45Random, 8, 0)) + ".csv" ;
      AV47TextFile.setSource( AV34Filename );
      AV47TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV47TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV48TextFileLine = "" ;
      if ( GXutil.strcmp(AV46Session.getValue("FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV46Session.getValue("FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "ToA", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Cierre", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Marca", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "A?", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos Total", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Volumen", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rb", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Inicial", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Total", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dif", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"%" : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste kg", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo de Articulo", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tc", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Intensidad", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido Cliente", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proceso", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Costes Quimicos I", "") : "") ;
      AV48TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Costes Quimicos A", "") : "") ;
      if ( GXutil.len( AV48TextFileLine) > 0 )
      {
         AV47TextFile.writeLine(GXutil.substring( AV48TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV8AnalisisCostesHistoricosRecetas_SDTs.fromJSonString(AV56AnalisisCostesHistoricosRecetas_ToJson, null);
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV8AnalisisCostesHistoricosRecetas_SDTs.size() )
      {
         AV9AnalisisCostesHistoricosRecetas_SDTsItem = (app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV8AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV59GXV1));
         AV48TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if (returnInSub) return;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += localUtil.dtoc( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd(), 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb(), 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei(), 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet(), 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif(), 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc(), 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek(), 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            GXt_char2 = AV48TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot(), ";", ","), GXv_char3) ;
            analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
            AV48TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi(), 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48TextFileLine += ";" ;
            AV48TextFileLine += GXutil.str( AV9AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa(), 10, 2) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if (returnInSub) return;
         if ( GXutil.len( AV48TextFileLine) > 0 )
         {
            AV47TextFile.writeLine(GXutil.substring( AV48TextFileLine, 2, -1));
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV47TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV47TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV40HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV40HttpResponse.addHeader("Content-Disposition", "attachment;filename=AnalisisCostesHistoricosRecetas_SDT_WCExportCSV.csv");
         }
         AV40HttpResponse.addFile(AV47TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV47TextFile.getErrCode() != 0 )
      {
         AV34Filename = "" ;
         AV31ErrorMessage = AV47TextFile.getErrDescription() ;
         AV47TextFile.close();
         AV40HttpResponse.addString(AV31ErrorMessage);
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__ToA", "", "ToA", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreFectin", "", "Fecha Cierre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__Marca", "", "Marca", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__Hdr", "", "Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__BarAgrest", "", "A?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreBarKgm", "", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreTotKgm", "", "Kilos Total", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreMaqcod", "", "Maquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreVolPrd", "", "Volumen", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__Rb", "", "Rb", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__Costei", "", "Coste Inicial", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__CosteT", "", "Coste Total", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__Dif", "", "Dif", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__Porc", "", "%", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__Costek", "", "Coste kg", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__Clicod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__CliNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__Hrebarser", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreBarDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreTipArtd", "", "Tipo de Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreColnom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreTipColN", "", "Tc", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreIntDsc", "", "Intensidad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__EncCli", "", "Pedido Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreProcod", "", "Proceso", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__HreProDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__PrvDsc", "", "Tipo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__BarAgrlot", "", "Lote", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__CostesQuimicosI", "", "Costes Quimicos I", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AnalisisCostesHistoricosRecetas_SDTs__CostesQuimicosA", "", "Costes Quimicos A", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV53UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCColumnsSelector", GXv_char3) ;
      analisiscosteshistoricosrecetas_sdt_wcexportcsv_modif_impl.this.GXt_char2 = GXv_char3[0] ;
      AV53UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV53UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV53UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV46Session.getValue("FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCGridState"), "") == 0 )
      {
         AV36GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCGridState"), null, null);
      }
      else
      {
         AV36GridState.fromxml(AV46Session.getValue("FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCGridState"), null, null);
      }
      AV60GXV2 = 1 ;
      while ( AV60GXV2 <= AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV37GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV2));
         if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV35FilterFullText = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV30Emprcod = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV39HreRacab = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV32Fec1 = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV33Fec2 = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CALCULO") == 0 )
         {
            AV19Calculo = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV12barcod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV14barcodreo = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV13barcodpar = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD1") == 0 )
         {
            AV10ARtcod1 = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD3") == 0 )
         {
            AV11ARtcod3 = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM1") == 0 )
         {
            AV15Barcolnom1 = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM3") == 0 )
         {
            AV16Barcolnom3 = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM1") == 0 )
         {
            AV17Barcolnum1 = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM3") == 0 )
         {
            AV18Barcolnum3 = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD1") == 0 )
         {
            AV20Clicod1 = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD3") == 0 )
         {
            AV21Clicod3 = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD1") == 0 )
         {
            AV41Intcod1 = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD3") == 0 )
         {
            AV42Intcod3 = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD1") == 0 )
         {
            AV49TipArtCod1 = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD3") == 0 )
         {
            AV50TipArtCod3 = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD1") == 0 )
         {
            AV51Tipcolcod1 = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD3") == 0 )
         {
            AV52Tipcolcod3 = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV60GXV2 = (int)(AV60GXV2+1) ;
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
      AV56AnalisisCostesHistoricosRecetas_ToJson = "" ;
      AV55WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV34Filename = "" ;
      AV47TextFile = new com.genexus.util.GXFile();
      AV48TextFileLine = "" ;
      AV46Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV8AnalisisCostesHistoricosRecetas_SDTs = new GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>(app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT.class, "AnalisisCostesHistoricosRecetas_SDT", "TexplusNET", remoteHandle);
      AV9AnalisisCostesHistoricosRecetas_SDTsItem = new app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT(remoteHandle, context);
      AV40HttpResponse = httpContext.getHttpResponse();
      AV31ErrorMessage = "" ;
      AV53UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV36GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV37GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV35FilterFullText = "" ;
      AV30Emprcod = "" ;
      AV39HreRacab = "" ;
      AV32Fec1 = GXutil.nullDate() ;
      AV33Fec2 = GXutil.nullDate() ;
      AV13barcodpar = "" ;
      AV10ARtcod1 = "" ;
      AV11ARtcod3 = "" ;
      AV15Barcolnom1 = "" ;
      AV16Barcolnom3 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Calculo ;
   private byte AV14barcodreo ;
   private byte AV41Intcod1 ;
   private byte AV42Intcod3 ;
   private byte AV51Tipcolcod1 ;
   private byte AV52Tipcolcod3 ;
   private short gxcookieaux ;
   private short AV49TipArtCod1 ;
   private short AV50TipArtCod3 ;
   private short Gx_err ;
   private int AV45Random ;
   private int AV59GXV1 ;
   private int AV60GXV2 ;
   private int AV12barcod ;
   private int AV17Barcolnum1 ;
   private int AV18Barcolnum3 ;
   private int AV20Clicod1 ;
   private int AV21Clicod3 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV30Emprcod ;
   private String AV39HreRacab ;
   private String AV13barcodpar ;
   private String AV10ARtcod1 ;
   private String AV11ARtcod3 ;
   private String AV15Barcolnom1 ;
   private String AV16Barcolnom3 ;
   private java.util.Date AV32Fec1 ;
   private java.util.Date AV33Fec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV56AnalisisCostesHistoricosRecetas_ToJson ;
   private String AV48TextFileLine ;
   private String AV26ColumnsSelectorXML ;
   private String AV53UserCustomValue ;
   private String AV34Filename ;
   private String AV31ErrorMessage ;
   private String AV35FilterFullText ;
   private com.genexus.webpanels.WebSession AV46Session ;
   private com.genexus.util.GXFile AV47TextFile ;
   private com.genexus.internet.HttpResponse AV40HttpResponse ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> AV8AnalisisCostesHistoricosRecetas_SDTs ;
   private app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT AV9AnalisisCostesHistoricosRecetas_SDTsItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV36GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV37GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV55WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

