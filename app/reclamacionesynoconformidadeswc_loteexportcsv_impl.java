package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class reclamacionesynoconformidadeswc_loteexportcsv_impl extends GXWebProcedure
{
   public reclamacionesynoconformidadeswc_loteexportcsv_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV48Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV49Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
            AV53Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
            AV39HisReoFec = localUtil.parseDateParm( httpContext.GetPar( "HisReoFec")) ;
            AV54HisReoFec_to = localUtil.parseDateParm( httpContext.GetPar( "HisReoFec_to")) ;
            AV50HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
         }
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
      S201 ();
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
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "ReclamacionesyNoConformidadesWC_loteExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("ReclamacionesyNoConformidadesWC_loteColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ReclamacionesyNoConformidadesWC_loteColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N OS", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Quilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Custo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descriçao", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cor Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Data", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Turno", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Defeito", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Causa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Responsabilidade", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Os(s)", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if (returnInSub) return;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV29CliNom, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30BarNHdr, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV31KilosLote, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV32Valcostelote, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV33HisreoLote, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV34HisBarSer, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV35HisReoDsc, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV36HisColNom, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV37HisNomCli, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV38MaqCod, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( AV39HisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV40HisOpeTur, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV41TipDefDsc, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV42DscCausa, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV43Rps_Dsc, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV44Hdrs, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if (returnInSub) return;
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
      }
      AV55LastLote = "" ;
      AV56LastHdr = "" ;
      AV31KilosLote = DecimalUtil.doubleToDec(0) ;
      AV32Valcostelote = DecimalUtil.doubleToDec(0) ;
      AV44Hdrs = "" ;
      /* Using cursor P08YS2 */
      pr_default.execute(0, new Object[] {AV48Emprcod, Integer.valueOf(AV49Clicod), Integer.valueOf(AV53Clicod_to), AV39HisReoFec, AV54HisReoFec_to, Byte.valueOf(AV50HisEstReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A833TipDefCod = P08YS2_A833TipDefCod[0] ;
         A5085CodCausa = P08YS2_A5085CodCausa[0] ;
         n5085CodCausa = P08YS2_n5085CodCausa[0] ;
         A7000Rps_Cod = P08YS2_A7000Rps_Cod[0] ;
         n7000Rps_Cod = P08YS2_n7000Rps_Cod[0] ;
         A396EmprCod = P08YS2_A396EmprCod[0] ;
         A548HisEstReo = P08YS2_A548HisEstReo[0] ;
         n548HisEstReo = P08YS2_n548HisEstReo[0] ;
         A569HisReoFec = P08YS2_A569HisReoFec[0] ;
         n569HisReoFec = P08YS2_n569HisReoFec[0] ;
         A252CliCod = P08YS2_A252CliCod[0] ;
         n252CliCod = P08YS2_n252CliCod[0] ;
         A279CliNom = P08YS2_A279CliNom[0] ;
         A540HisBarKgm = P08YS2_A540HisBarKgm[0] ;
         n540HisBarKgm = P08YS2_n540HisBarKgm[0] ;
         A13699CostCausa = P08YS2_A13699CostCausa[0] ;
         n13699CostCausa = P08YS2_n13699CostCausa[0] ;
         A542HisBarSer = P08YS2_A542HisBarSer[0] ;
         n542HisBarSer = P08YS2_n542HisBarSer[0] ;
         A2299HisReoDsc = P08YS2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P08YS2_n2299HisReoDsc[0] ;
         A546HisColNom = P08YS2_A546HisColNom[0] ;
         n546HisColNom = P08YS2_n546HisColNom[0] ;
         A8889HisNomCli = P08YS2_A8889HisNomCli[0] ;
         n8889HisNomCli = P08YS2_n8889HisNomCli[0] ;
         A12950HisOpeTur = P08YS2_A12950HisOpeTur[0] ;
         n12950HisOpeTur = P08YS2_n12950HisOpeTur[0] ;
         A602MaqCod = P08YS2_A602MaqCod[0] ;
         n602MaqCod = P08YS2_n602MaqCod[0] ;
         A12949HisOpecod = P08YS2_A12949HisOpecod[0] ;
         n12949HisOpecod = P08YS2_n12949HisOpecod[0] ;
         A834TipDefDsc = P08YS2_A834TipDefDsc[0] ;
         n834TipDefDsc = P08YS2_n834TipDefDsc[0] ;
         A5086DscCausa = P08YS2_A5086DscCausa[0] ;
         n5086DscCausa = P08YS2_n5086DscCausa[0] ;
         A7001Rps_Dsc = P08YS2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P08YS2_n7001Rps_Dsc[0] ;
         A544HisCodPar = P08YS2_A544HisCodPar[0] ;
         A545HisCodReo = P08YS2_A545HisCodReo[0] ;
         A539HisBarCod = P08YS2_A539HisBarCod[0] ;
         A13698HisreoLote = P08YS2_A13698HisreoLote[0] ;
         n13698HisreoLote = P08YS2_n13698HisreoLote[0] ;
         A834TipDefDsc = P08YS2_A834TipDefDsc[0] ;
         n834TipDefDsc = P08YS2_n834TipDefDsc[0] ;
         A13699CostCausa = P08YS2_A13699CostCausa[0] ;
         n13699CostCausa = P08YS2_n13699CostCausa[0] ;
         A5086DscCausa = P08YS2_A5086DscCausa[0] ;
         n5086DscCausa = P08YS2_n5086DscCausa[0] ;
         A7001Rps_Dsc = P08YS2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P08YS2_n7001Rps_Dsc[0] ;
         A279CliNom = P08YS2_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A13698HisreoLote, AV55LastLote) == 0 ) && ( GXutil.strcmp(AV55LastLote, " ") != 0 ) )
         {
            if ( AV51lastHisBarcod == A539HisBarCod )
            {
               /* Execute user subroutine: 'WRITELINE' */
               S182 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               AV31KilosLote = DecimalUtil.doubleToDec(0) ;
               AV32Valcostelote = DecimalUtil.doubleToDec(0) ;
               AV44Hdrs = "" ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV55LastLote, " ") != 0 )
            {
               /* Execute user subroutine: 'WRITELINE' */
               S182 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               AV31KilosLote = DecimalUtil.doubleToDec(0) ;
               AV32Valcostelote = DecimalUtil.doubleToDec(0) ;
               AV44Hdrs = "" ;
            }
         }
         AV30BarNHdr = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         AV29CliNom = A279CliNom ;
         AV33HisreoLote = A13698HisreoLote ;
         if ( GXutil.strcmp(AV44Hdrs, "") == 0 )
         {
            AV44Hdrs = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         }
         else
         {
            AV44Hdrs += "/" + GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         }
         AV31KilosLote = AV31KilosLote.add(A540HisBarKgm) ;
         AV32Valcostelote = AV32Valcostelote.add((GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2))) ;
         AV34HisBarSer = A542HisBarSer ;
         AV35HisReoDsc = A2299HisReoDsc ;
         AV36HisColNom = A546HisColNom ;
         AV37HisNomCli = A8889HisNomCli ;
         AV40HisOpeTur = A12950HisOpeTur ;
         AV38MaqCod = A602MaqCod ;
         AV39HisReoFec = A569HisReoFec ;
         AV52HisOpecod = A12949HisOpecod ;
         AV41TipDefDsc = A834TipDefDsc ;
         AV42DscCausa = A5086DscCausa ;
         AV43Rps_Dsc = A7001Rps_Dsc ;
         AV55LastLote = A13698HisreoLote ;
         AV56LastHdr = GXutil.str( A539HisBarCod, 8, 0) + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         AV51lastHisBarcod = A539HisBarCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Execute user subroutine: 'WRITELINE' */
      S182 ();
      if (returnInSub) return;
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ReclamacionesyNoConformidadesWC_loteExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
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
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&CliNom", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarNHdr", "", "N OS", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&KilosLote", "", "Quilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Valcostelote", "", "Custo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HisreoLote", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HisBarSer", "", "Artigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HisReoDsc", "", "Descriçao", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HisColNom", "", "Cor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HisNomCli", "", "Cor Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&MaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HisReoFec", "", "Data", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HisOpeTur", "", "Turno", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TipDefDsc", "", "Defeito", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&DscCausa", "", "Causa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Rps_Dsc", "", "Responsabilidade", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Hdrs", "", "Os(s)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWC_loteColumnsSelector", GXv_char3) ;
      reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ReclamacionesyNoConformidadesWC_loteGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ReclamacionesyNoConformidadesWC_loteGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("ReclamacionesyNoConformidadesWC_loteGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV28FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV49Clicod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV53Clicod_to = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISREOFEC") == 0 )
         {
            AV39HisReoFec = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISREOFEC_TO") == 0 )
         {
            AV54HisReoFec_to = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISESTREO") == 0 )
         {
            AV50HisEstReo = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
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

   public void S182( )
   {
      /* 'WRITELINE' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      /* Execute user subroutine: 'BEFOREWRITELINE' */
      S161 ();
      if (returnInSub) return;
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV29CliNom, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30BarNHdr, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV31KilosLote, 9, 2) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV32Valcostelote, 11, 3) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV33HisreoLote, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV34HisBarSer, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV35HisReoDsc, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV36HisColNom, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV37HisNomCli, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV38MaqCod, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += localUtil.dtoc( AV39HisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV40HisOpeTur, 1, 0) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV41TipDefDsc, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV42DscCausa, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV43Rps_Dsc, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV44Hdrs, ";", ","), GXv_char3) ;
         reclamacionesynoconformidadeswc_loteexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      /* Execute user subroutine: 'AFTERWRITELINE' */
      S171 ();
      if (returnInSub) return;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
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
      AV48Emprcod = "" ;
      AV39HisReoFec = GXutil.nullDate() ;
      AV54HisReoFec_to = GXutil.nullDate() ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV29CliNom = "" ;
      AV30BarNHdr = "" ;
      AV31KilosLote = DecimalUtil.ZERO ;
      AV32Valcostelote = DecimalUtil.ZERO ;
      AV33HisreoLote = "" ;
      AV34HisBarSer = "" ;
      AV35HisReoDsc = "" ;
      AV36HisColNom = "" ;
      AV37HisNomCli = "" ;
      AV38MaqCod = "" ;
      AV41TipDefDsc = "" ;
      AV42DscCausa = "" ;
      AV43Rps_Dsc = "" ;
      AV44Hdrs = "" ;
      AV55LastLote = "" ;
      AV56LastHdr = "" ;
      scmdbuf = "" ;
      P08YS2_A833TipDefCod = new short[1] ;
      P08YS2_A5085CodCausa = new short[1] ;
      P08YS2_n5085CodCausa = new boolean[] {false} ;
      P08YS2_A7000Rps_Cod = new short[1] ;
      P08YS2_n7000Rps_Cod = new boolean[] {false} ;
      P08YS2_A396EmprCod = new String[] {""} ;
      P08YS2_A548HisEstReo = new byte[1] ;
      P08YS2_n548HisEstReo = new boolean[] {false} ;
      P08YS2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08YS2_n569HisReoFec = new boolean[] {false} ;
      P08YS2_A252CliCod = new int[1] ;
      P08YS2_n252CliCod = new boolean[] {false} ;
      P08YS2_A279CliNom = new String[] {""} ;
      P08YS2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YS2_n540HisBarKgm = new boolean[] {false} ;
      P08YS2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YS2_n13699CostCausa = new boolean[] {false} ;
      P08YS2_A542HisBarSer = new String[] {""} ;
      P08YS2_n542HisBarSer = new boolean[] {false} ;
      P08YS2_A2299HisReoDsc = new String[] {""} ;
      P08YS2_n2299HisReoDsc = new boolean[] {false} ;
      P08YS2_A546HisColNom = new String[] {""} ;
      P08YS2_n546HisColNom = new boolean[] {false} ;
      P08YS2_A8889HisNomCli = new String[] {""} ;
      P08YS2_n8889HisNomCli = new boolean[] {false} ;
      P08YS2_A12950HisOpeTur = new byte[1] ;
      P08YS2_n12950HisOpeTur = new boolean[] {false} ;
      P08YS2_A602MaqCod = new String[] {""} ;
      P08YS2_n602MaqCod = new boolean[] {false} ;
      P08YS2_A12949HisOpecod = new int[1] ;
      P08YS2_n12949HisOpecod = new boolean[] {false} ;
      P08YS2_A834TipDefDsc = new String[] {""} ;
      P08YS2_n834TipDefDsc = new boolean[] {false} ;
      P08YS2_A5086DscCausa = new String[] {""} ;
      P08YS2_n5086DscCausa = new boolean[] {false} ;
      P08YS2_A7001Rps_Dsc = new String[] {""} ;
      P08YS2_n7001Rps_Dsc = new boolean[] {false} ;
      P08YS2_A544HisCodPar = new String[] {""} ;
      P08YS2_A545HisCodReo = new byte[1] ;
      P08YS2_A539HisBarCod = new int[1] ;
      P08YS2_A13698HisreoLote = new String[] {""} ;
      P08YS2_n13698HisreoLote = new boolean[] {false} ;
      A396EmprCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A13699CostCausa = DecimalUtil.ZERO ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A602MaqCod = "" ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      A544HisCodPar = "" ;
      A13698HisreoLote = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV28FilterFullText = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.reclamacionesynoconformidadeswc_loteexportcsv__default(),
         new Object[] {
             new Object[] {
            P08YS2_A833TipDefCod, P08YS2_A5085CodCausa, P08YS2_n5085CodCausa, P08YS2_A7000Rps_Cod, P08YS2_n7000Rps_Cod, P08YS2_A396EmprCod, P08YS2_A548HisEstReo, P08YS2_n548HisEstReo, P08YS2_A569HisReoFec, P08YS2_n569HisReoFec,
            P08YS2_A252CliCod, P08YS2_n252CliCod, P08YS2_A279CliNom, P08YS2_A540HisBarKgm, P08YS2_n540HisBarKgm, P08YS2_A13699CostCausa, P08YS2_n13699CostCausa, P08YS2_A542HisBarSer, P08YS2_n542HisBarSer, P08YS2_A2299HisReoDsc,
            P08YS2_n2299HisReoDsc, P08YS2_A546HisColNom, P08YS2_n546HisColNom, P08YS2_A8889HisNomCli, P08YS2_n8889HisNomCli, P08YS2_A12950HisOpeTur, P08YS2_n12950HisOpeTur, P08YS2_A602MaqCod, P08YS2_n602MaqCod, P08YS2_A12949HisOpecod,
            P08YS2_n12949HisOpecod, P08YS2_A834TipDefDsc, P08YS2_n834TipDefDsc, P08YS2_A5086DscCausa, P08YS2_n5086DscCausa, P08YS2_A7001Rps_Dsc, P08YS2_n7001Rps_Dsc, P08YS2_A544HisCodPar, P08YS2_A545HisCodReo, P08YS2_A539HisBarCod,
            P08YS2_A13698HisreoLote, P08YS2_n13698HisreoLote
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50HisEstReo ;
   private byte AV40HisOpeTur ;
   private byte A548HisEstReo ;
   private byte A12950HisOpeTur ;
   private byte A545HisCodReo ;
   private short gxcookieaux ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private int AV49Clicod ;
   private int AV53Clicod_to ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A12949HisOpecod ;
   private int A539HisBarCod ;
   private int AV51lastHisBarcod ;
   private int AV52HisOpecod ;
   private int AV60GXV1 ;
   private java.math.BigDecimal AV31KilosLote ;
   private java.math.BigDecimal AV32Valcostelote ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A13699CostCausa ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV48Emprcod ;
   private String AV29CliNom ;
   private String AV30BarNHdr ;
   private String AV33HisreoLote ;
   private String AV34HisBarSer ;
   private String AV35HisReoDsc ;
   private String AV36HisColNom ;
   private String AV37HisNomCli ;
   private String AV38MaqCod ;
   private String AV41TipDefDsc ;
   private String AV42DscCausa ;
   private String AV43Rps_Dsc ;
   private String AV55LastLote ;
   private String AV56LastHdr ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A542HisBarSer ;
   private String A2299HisReoDsc ;
   private String A546HisColNom ;
   private String A8889HisNomCli ;
   private String A602MaqCod ;
   private String A834TipDefDsc ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private String A544HisCodPar ;
   private String A13698HisreoLote ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV39HisReoFec ;
   private java.util.Date AV54HisReoFec_to ;
   private java.util.Date A569HisReoFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n548HisEstReo ;
   private boolean n569HisReoFec ;
   private boolean n252CliCod ;
   private boolean n540HisBarKgm ;
   private boolean n13699CostCausa ;
   private boolean n542HisBarSer ;
   private boolean n2299HisReoDsc ;
   private boolean n546HisColNom ;
   private boolean n8889HisNomCli ;
   private boolean n12950HisOpeTur ;
   private boolean n602MaqCod ;
   private boolean n12949HisOpecod ;
   private boolean n834TipDefDsc ;
   private boolean n5086DscCausa ;
   private boolean n7001Rps_Dsc ;
   private boolean n13698HisreoLote ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV44Hdrs ;
   private String AV12ErrorMessage ;
   private String AV28FilterFullText ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P08YS2_A833TipDefCod ;
   private short[] P08YS2_A5085CodCausa ;
   private boolean[] P08YS2_n5085CodCausa ;
   private short[] P08YS2_A7000Rps_Cod ;
   private boolean[] P08YS2_n7000Rps_Cod ;
   private String[] P08YS2_A396EmprCod ;
   private byte[] P08YS2_A548HisEstReo ;
   private boolean[] P08YS2_n548HisEstReo ;
   private java.util.Date[] P08YS2_A569HisReoFec ;
   private boolean[] P08YS2_n569HisReoFec ;
   private int[] P08YS2_A252CliCod ;
   private boolean[] P08YS2_n252CliCod ;
   private String[] P08YS2_A279CliNom ;
   private java.math.BigDecimal[] P08YS2_A540HisBarKgm ;
   private boolean[] P08YS2_n540HisBarKgm ;
   private java.math.BigDecimal[] P08YS2_A13699CostCausa ;
   private boolean[] P08YS2_n13699CostCausa ;
   private String[] P08YS2_A542HisBarSer ;
   private boolean[] P08YS2_n542HisBarSer ;
   private String[] P08YS2_A2299HisReoDsc ;
   private boolean[] P08YS2_n2299HisReoDsc ;
   private String[] P08YS2_A546HisColNom ;
   private boolean[] P08YS2_n546HisColNom ;
   private String[] P08YS2_A8889HisNomCli ;
   private boolean[] P08YS2_n8889HisNomCli ;
   private byte[] P08YS2_A12950HisOpeTur ;
   private boolean[] P08YS2_n12950HisOpeTur ;
   private String[] P08YS2_A602MaqCod ;
   private boolean[] P08YS2_n602MaqCod ;
   private int[] P08YS2_A12949HisOpecod ;
   private boolean[] P08YS2_n12949HisOpecod ;
   private String[] P08YS2_A834TipDefDsc ;
   private boolean[] P08YS2_n834TipDefDsc ;
   private String[] P08YS2_A5086DscCausa ;
   private boolean[] P08YS2_n5086DscCausa ;
   private String[] P08YS2_A7001Rps_Dsc ;
   private boolean[] P08YS2_n7001Rps_Dsc ;
   private String[] P08YS2_A544HisCodPar ;
   private byte[] P08YS2_A545HisCodReo ;
   private int[] P08YS2_A539HisBarCod ;
   private String[] P08YS2_A13698HisreoLote ;
   private boolean[] P08YS2_n13698HisreoLote ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
}

final  class reclamacionesynoconformidadeswc_loteexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YS2", "SELECT T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T1.EmprCod, T1.HisEstReo, T1.HisReoFec, T1.CliCod, T5.CliNom, T1.HisBarKgm, T3.CostCausa, T1.HisBarSer, T1.HisReoDsc, T1.HisColNom, T1.HisNomCli, T1.HisOpeTur, T1.MaqCod, T1.HisOpecod, T2.TipDefDsc, T3.DscCausa, T4.Rps_Dsc, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.HisreoLote FROM ((((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T3 ON T3.EmprCod = T1.EmprCod AND T3.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T4 ON T4.EmprCod = T1.EmprCod AND T4.Rps_Cod = T1.Rps_Cod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.HisEstReo = ?) ORDER BY T1.EmprCod, T1.HisreoLote, T1.HisBarCod DESC, T1.HisCodReo DESC, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 60);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 40);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((byte[]) buf[38])[0] = rslt.getByte(22);
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((String[]) buf[40])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

