package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class costesquimicosanalisisdetalleexportcsv_impl extends GXWebProcedure
{
   public costesquimicosanalisisdetalleexportcsv_impl( com.genexus.internet.HttpContext context )
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
         AV35Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV38HreRacab = httpContext.GetPar( "HreRacab") ;
            AV36Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
            AV37Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
            AV58Calculo = (byte)(GXutil.lval( httpContext.GetPar( "Calculo"))) ;
            AV53barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
            AV54barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
            AV55barcodpar = httpContext.GetPar( "barcodpar") ;
            AV41ARtcod1 = httpContext.GetPar( "ARtcod1") ;
            AV42ARtcod3 = httpContext.GetPar( "ARtcod3") ;
            AV45Barcolnom1 = httpContext.GetPar( "Barcolnom1") ;
            AV46Barcolnom3 = httpContext.GetPar( "Barcolnom3") ;
            AV47Barcolnum1 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum1"))) ;
            AV48Barcolnum3 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum3"))) ;
            AV39Clicod1 = (int)(GXutil.lval( httpContext.GetPar( "Clicod1"))) ;
            AV40Clicod3 = (int)(GXutil.lval( httpContext.GetPar( "Clicod3"))) ;
            AV51Intcod1 = (short)(GXutil.lval( httpContext.GetPar( "Intcod1"))) ;
            AV52Intcod3 = (short)(GXutil.lval( httpContext.GetPar( "Intcod3"))) ;
            AV43TipArtCod1 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod1"))) ;
            AV44TipArtCod3 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod3"))) ;
            AV49Tipcolcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipcolcod1"))) ;
            AV50Tipcolcod3 = (short)(GXutil.lval( httpContext.GetPar( "Tipcolcod3"))) ;
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
      AV11Filename = "./PrivateTempStorage/" + "CostesQuimicosAnalisisDetalleExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CostesQuimicosAnalisisDetalleColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("CostesQuimicosAnalisisDetalleColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Cierre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Agr?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos Tot", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Volumen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rb", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Ini", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Tot", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dif", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"%" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Kg", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Tipo Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Tc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Intensidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disp Cliente", "") : "") ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30ToA, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( AV29HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV84Marca, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV56Hdr, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV59BarAGrest, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV60HreBarKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV61HreTotKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV62HreMaqCod, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV63HreVolPrd, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV64Rb, 7, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV65Costei, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV66CosteT, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV67Dif, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV68Porc, 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV69CosteK, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV70CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV71CliNom, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV72HreBarSer, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV73HreBarDsc, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV74HreTipArtD, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV75HreColNom, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV76HreColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV77HreTipColN, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV78HreIntDsc, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( AV81HreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( AV82HreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV83EncCli, ";", ","), GXv_char3) ;
            costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      /* Using cursor P08YA2 */
      pr_default.execute(0, new Object[] {AV35Emprcod, AV36Fec1, AV38HreRacab, AV38HreRacab, Integer.valueOf(AV39Clicod1), Integer.valueOf(AV40Clicod3), AV41ARtcod1, AV42ARtcod3, Short.valueOf(AV43TipArtCod1), Short.valueOf(AV44TipArtCod3), AV45Barcolnom1, AV46Barcolnom3, Integer.valueOf(AV47Barcolnum1), Integer.valueOf(AV48Barcolnum3), Short.valueOf(AV49Tipcolcod1), Short.valueOf(AV50Tipcolcod3), Short.valueOf(AV51Intcod1), Short.valueOf(AV52Intcod3), Integer.valueOf(AV53barcod), Integer.valueOf(AV53barcod), Byte.valueOf(AV54barcodreo), Byte.valueOf(AV54barcodreo), AV55barcodpar, AV55barcodpar, AV37Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8YA2 = false ;
         A396EmprCod = P08YA2_A396EmprCod[0] ;
         A4529HreFecTin = P08YA2_A4529HreFecTin[0] ;
         n4529HreFecTin = P08YA2_n4529HreFecTin[0] ;
         A4547HreVolPrd = P08YA2_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P08YA2_n4547HreVolPrd[0] ;
         A8607HreCosPD = P08YA2_A8607HreCosPD[0] ;
         n8607HreCosPD = P08YA2_n8607HreCosPD[0] ;
         A8606HreCosPA = P08YA2_A8606HreCosPA[0] ;
         n8606HreCosPA = P08YA2_n8606HreCosPA[0] ;
         A8605HreCosCol = P08YA2_A8605HreCosCol[0] ;
         n8605HreCosCol = P08YA2_n8605HreCosCol[0] ;
         A8604HreCosAnc = P08YA2_A8604HreCosAnc[0] ;
         n8604HreCosAnc = P08YA2_n8604HreCosAnc[0] ;
         A8603HrecosAd = P08YA2_A8603HrecosAd[0] ;
         n8603HrecosAd = P08YA2_n8603HrecosAd[0] ;
         A8602HreCosAA = P08YA2_A8602HreCosAA[0] ;
         n8602HreCosAA = P08YA2_n8602HreCosAA[0] ;
         A4532HreBarKgm = P08YA2_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08YA2_n4532HreBarKgm[0] ;
         A4542HreTotKgm = P08YA2_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08YA2_n4542HreTotKgm[0] ;
         A4546HreMaqCod = P08YA2_A4546HreMaqCod[0] ;
         n4546HreMaqCod = P08YA2_n4546HreMaqCod[0] ;
         A4545HreLinMaq = P08YA2_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08YA2_A4495HreNumCie[0] ;
         A4539HreIntCod = P08YA2_A4539HreIntCod[0] ;
         n4539HreIntCod = P08YA2_n4539HreIntCod[0] ;
         A4525HreTipCol = P08YA2_A4525HreTipCol[0] ;
         n4525HreTipCol = P08YA2_n4525HreTipCol[0] ;
         A4522HreColNum = P08YA2_A4522HreColNum[0] ;
         n4522HreColNum = P08YA2_n4522HreColNum[0] ;
         A4521HreColNom = P08YA2_A4521HreColNom[0] ;
         n4521HreColNom = P08YA2_n4521HreColNom[0] ;
         A4519HreTipArt = P08YA2_A4519HreTipArt[0] ;
         n4519HreTipArt = P08YA2_n4519HreTipArt[0] ;
         A4517HreBarSer = P08YA2_A4517HreBarSer[0] ;
         n4517HreBarSer = P08YA2_n4517HreBarSer[0] ;
         A252CliCod = P08YA2_A252CliCod[0] ;
         n252CliCod = P08YA2_n252CliCod[0] ;
         A9808HreRacab = P08YA2_A9808HreRacab[0] ;
         n9808HreRacab = P08YA2_n9808HreRacab[0] ;
         A279CliNom = P08YA2_A279CliNom[0] ;
         A4518HreBarDsc = P08YA2_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08YA2_n4518HreBarDsc[0] ;
         A4520HreTipArtD = P08YA2_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08YA2_n4520HreTipArtD[0] ;
         A4526HreTipColN = P08YA2_A4526HreTipColN[0] ;
         n4526HreTipColN = P08YA2_n4526HreTipColN[0] ;
         A4540HreIntDsc = P08YA2_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08YA2_n4540HreIntDsc[0] ;
         A10104HreDtf = P08YA2_A10104HreDtf[0] ;
         n10104HreDtf = P08YA2_n10104HreDtf[0] ;
         A10103HreDti = P08YA2_A10103HreDti[0] ;
         n10103HreDti = P08YA2_n10103HreDti[0] ;
         A4516HreDisCli = P08YA2_A4516HreDisCli[0] ;
         n4516HreDisCli = P08YA2_n4516HreDisCli[0] ;
         A11318HreDispCli = P08YA2_A11318HreDispCli[0] ;
         n11318HreDispCli = P08YA2_n11318HreDispCli[0] ;
         A4494HreBarPar = P08YA2_A4494HreBarPar[0] ;
         A4493HreBarReo = P08YA2_A4493HreBarReo[0] ;
         A4492HreBarCod = P08YA2_A4492HreBarCod[0] ;
         A4529HreFecTin = P08YA2_A4529HreFecTin[0] ;
         n4529HreFecTin = P08YA2_n4529HreFecTin[0] ;
         A4532HreBarKgm = P08YA2_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08YA2_n4532HreBarKgm[0] ;
         A4542HreTotKgm = P08YA2_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08YA2_n4542HreTotKgm[0] ;
         A4539HreIntCod = P08YA2_A4539HreIntCod[0] ;
         n4539HreIntCod = P08YA2_n4539HreIntCod[0] ;
         A4525HreTipCol = P08YA2_A4525HreTipCol[0] ;
         n4525HreTipCol = P08YA2_n4525HreTipCol[0] ;
         A4522HreColNum = P08YA2_A4522HreColNum[0] ;
         n4522HreColNum = P08YA2_n4522HreColNum[0] ;
         A4521HreColNom = P08YA2_A4521HreColNom[0] ;
         n4521HreColNom = P08YA2_n4521HreColNom[0] ;
         A4519HreTipArt = P08YA2_A4519HreTipArt[0] ;
         n4519HreTipArt = P08YA2_n4519HreTipArt[0] ;
         A4517HreBarSer = P08YA2_A4517HreBarSer[0] ;
         n4517HreBarSer = P08YA2_n4517HreBarSer[0] ;
         A252CliCod = P08YA2_A252CliCod[0] ;
         n252CliCod = P08YA2_n252CliCod[0] ;
         A9808HreRacab = P08YA2_A9808HreRacab[0] ;
         n9808HreRacab = P08YA2_n9808HreRacab[0] ;
         A4518HreBarDsc = P08YA2_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08YA2_n4518HreBarDsc[0] ;
         A4520HreTipArtD = P08YA2_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08YA2_n4520HreTipArtD[0] ;
         A4526HreTipColN = P08YA2_A4526HreTipColN[0] ;
         n4526HreTipColN = P08YA2_n4526HreTipColN[0] ;
         A4540HreIntDsc = P08YA2_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08YA2_n4540HreIntDsc[0] ;
         A4516HreDisCli = P08YA2_A4516HreDisCli[0] ;
         n4516HreDisCli = P08YA2_n4516HreDisCli[0] ;
         A11318HreDispCli = P08YA2_A11318HreDispCli[0] ;
         n11318HreDispCli = P08YA2_n11318HreDispCli[0] ;
         A279CliNom = P08YA2_A279CliNom[0] ;
         A13842BarNhdr_Hi = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
         AV60HreBarKgm = A4532HreBarKgm ;
         AV61HreTotKgm = A4542HreTotKgm ;
         AV29HreFecTin = A4529HreFecTin ;
         AV56Hdr = A13842BarNhdr_Hi ;
         AV70CliCod = A252CliCod ;
         AV71CliNom = A279CliNom ;
         AV72HreBarSer = A4517HreBarSer ;
         AV73HreBarDsc = A4518HreBarDsc ;
         AV75HreColNom = A4521HreColNom ;
         AV76HreColNum = A4522HreColNum ;
         AV74HreTipArtD = A4520HreTipArtD ;
         AV77HreTipColN = A4526HreTipColN ;
         AV78HreIntDsc = A4540HreIntDsc ;
         AV85HreBarCod = A4492HreBarCod ;
         AV86HreBarPar = A4494HreBarPar ;
         AV87HreBarReo = A4493HreBarReo ;
         AV88HreNumCie = A4495HreNumCie ;
         AV38HreRacab = A9808HreRacab ;
         AV82HreDtf = A10104HreDtf ;
         AV81HreDti = A10103HreDti ;
         AV83EncCli = ((GXutil.strcmp("", A11318HreDispCli)==0) ? A4516HreDisCli : A11318HreDispCli) ;
         GXt_char2 = AV89PrvDsc ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_char5[0] = GXt_char2 ;
         new app.pprc252(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
         costesquimicosanalisisdetalleexportcsv_impl.this.A252CliCod = GXv_int4[0] ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
         AV89PrvDsc = GXt_char2 ;
         AV57TablaA = (byte)(0) ;
         AV84Marca = "*" ;
         AV30ToA = ((GXutil.strcmp("", A9808HreRacab)==0) ? httpContext.getMessage( "T", "") : httpContext.getMessage( "A", "")) ;
         AV59BarAGrest = httpContext.getMessage( "N", "") ;
         if ( GXutil.strcmp(AV30ToA, httpContext.getMessage( "T", "")) == 0 )
         {
            /* Using cursor P08YA3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4497HreAgrCod = P08YA3_A4497HreAgrCod[0] ;
               A4498HreAgrReo = P08YA3_A4498HreAgrReo[0] ;
               A4499HreAgrPar = P08YA3_A4499HreAgrPar[0] ;
               AV59BarAGrest = httpContext.getMessage( "S", "") ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         else
         {
            /* Using cursor P08YA4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A9985HreAcCod = P08YA4_A9985HreAcCod[0] ;
               A9986HreAcReo = P08YA4_A9986HreAcReo[0] ;
               A9987HreAcPar = P08YA4_A9987HreAcPar[0] ;
               AV59BarAGrest = httpContext.getMessage( "S", "") ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         while ( (pr_default.getStatus(0) != 101) && GXutil.dateCompare(GXutil.resetTime(P08YA2_A4529HreFecTin[0]), GXutil.resetTime(A4529HreFecTin)) && ( GXutil.strcmp(P08YA2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08YA2_A4492HreBarCod[0] == A4492HreBarCod ) && ( P08YA2_A4493HreBarReo[0] == A4493HreBarReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P08YA2_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( P08YA2_A4495HreNumCie[0] == A4495HreNumCie ) ) )
            {
               if (true) break;
            }
            brk8YA2 = false ;
            A4547HreVolPrd = P08YA2_A4547HreVolPrd[0] ;
            n4547HreVolPrd = P08YA2_n4547HreVolPrd[0] ;
            A8607HreCosPD = P08YA2_A8607HreCosPD[0] ;
            n8607HreCosPD = P08YA2_n8607HreCosPD[0] ;
            A8606HreCosPA = P08YA2_A8606HreCosPA[0] ;
            n8606HreCosPA = P08YA2_n8606HreCosPA[0] ;
            A8605HreCosCol = P08YA2_A8605HreCosCol[0] ;
            n8605HreCosCol = P08YA2_n8605HreCosCol[0] ;
            A8604HreCosAnc = P08YA2_A8604HreCosAnc[0] ;
            n8604HreCosAnc = P08YA2_n8604HreCosAnc[0] ;
            A8603HrecosAd = P08YA2_A8603HrecosAd[0] ;
            n8603HrecosAd = P08YA2_n8603HrecosAd[0] ;
            A8602HreCosAA = P08YA2_A8602HreCosAA[0] ;
            n8602HreCosAA = P08YA2_n8602HreCosAA[0] ;
            A4532HreBarKgm = P08YA2_A4532HreBarKgm[0] ;
            n4532HreBarKgm = P08YA2_n4532HreBarKgm[0] ;
            A4542HreTotKgm = P08YA2_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P08YA2_n4542HreTotKgm[0] ;
            A4546HreMaqCod = P08YA2_A4546HreMaqCod[0] ;
            n4546HreMaqCod = P08YA2_n4546HreMaqCod[0] ;
            A4545HreLinMaq = P08YA2_A4545HreLinMaq[0] ;
            A4532HreBarKgm = P08YA2_A4532HreBarKgm[0] ;
            n4532HreBarKgm = P08YA2_n4532HreBarKgm[0] ;
            A4542HreTotKgm = P08YA2_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P08YA2_n4542HreTotKgm[0] ;
            AV90HreLinMaq = A4545HreLinMaq ;
            AV64Rb = ((AV61HreTotKgm.doubleValue()>0)&&(GXutil.strcmp(AV30ToA, httpContext.getMessage( "T", ""))==0) ? DecimalUtil.doubleToDec(A4547HreVolPrd).divide(AV61HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV63HreVolPrd = A4547HreVolPrd ;
            AV66CosteT = ((A4542HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
            AV65Costei = ((AV61HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
            AV67Dif = AV65Costei.subtract(AV66CosteT) ;
            AV68Porc = ((AV65Costei.doubleValue()!=0) ? GXutil.roundDecimal( (AV67Dif.divide(AV65Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
            AV69CosteK = ((AV60HreBarKgm.doubleValue()>0) ? GXutil.roundDecimal( AV66CosteT.divide(AV60HreBarKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
            AV62HreMaqCod = A4546HreMaqCod ;
            AV91CosteTotCal = (short)(0) ;
            AV92CosteTotC = (short)(0) ;
            AV79HreProCod = " " ;
            AV80HreProDsc = " " ;
            if ( GXutil.strcmp(AV30ToA, httpContext.getMessage( "T", "")) != 0 )
            {
               /* Using cursor P08YA5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A4551HreProCod = P08YA5_A4551HreProCod[0] ;
                  A4552HreProDsc = P08YA5_A4552HreProDsc[0] ;
                  A4550HreLinPro = P08YA5_A4550HreLinPro[0] ;
                  AV79HreProCod = A4551HreProCod ;
                  AV80HreProDsc = A4552HreProDsc ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            /* Execute user subroutine: 'ESCRIBOCSV' */
            S185 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.strcmp(AV59BarAGrest, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( GXutil.strcmp(AV30ToA, httpContext.getMessage( "T", "")) == 0 )
               {
                  AV57TablaA = (byte)(0) ;
                  /* Using cursor P08YA6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A4500HreAgrKgm = P08YA6_A4500HreAgrKgm[0] ;
                     A4499HreAgrPar = P08YA6_A4499HreAgrPar[0] ;
                     A4498HreAgrReo = P08YA6_A4498HreAgrReo[0] ;
                     A4503HreAgrCli = P08YA6_A4503HreAgrCli[0] ;
                     A4504HreAgrSer = P08YA6_A4504HreAgrSer[0] ;
                     A4505HreAgrDsc = P08YA6_A4505HreAgrDsc[0] ;
                     A4497HreAgrCod = P08YA6_A4497HreAgrCod[0] ;
                     AV57TablaA = (byte)(1) ;
                     AV84Marca = "" ;
                     AV65Costei = A4500HreAgrKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(AV61HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV66CosteT = A4500HreAgrKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(AV61HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV67Dif = AV65Costei.subtract(AV66CosteT) ;
                     AV68Porc = ((AV65Costei.doubleValue()!=0) ? GXutil.roundDecimal( (AV67Dif.divide(AV65Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
                     AV69CosteK = ((A4500HreAgrKgm.doubleValue()>0) ? GXutil.roundDecimal( AV66CosteT.divide(A4500HreAgrKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
                     AV91CosteTotCal = (short)(DecimalUtil.decToDouble(A4500HreAgrKgm.multiply(DecimalUtil.doubleToDec(AV92CosteTotC)).divide(AV61HreTotKgm, 18, java.math.RoundingMode.DOWN))) ;
                     AV94CosteKCal = (short)(0) ;
                     AV94CosteKCal = (short)(DecimalUtil.decToDouble(((A4500HreAgrKgm.doubleValue()>0) ? GXutil.roundDecimal( DecimalUtil.doubleToDec(AV91CosteTotCal).divide(A4500HreAgrKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)))) ;
                     AV56Hdr = GXutil.str( A4497HreAgrCod, 8, 0) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
                     AV60HreBarKgm = A4500HreAgrKgm ;
                     AV70CliCod = A4503HreAgrCli ;
                     AV93fecha = GXutil.nullDate() ;
                     GXv_char5[0] = A396EmprCod ;
                     GXv_int4[0] = A4497HreAgrCod ;
                     GXv_int6[0] = A4498HreAgrReo ;
                     GXv_char3[0] = A4499HreAgrPar ;
                     GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_int9[0] = 0 ;
                     GXv_char10[0] = "" ;
                     GXv_char11[0] = "" ;
                     GXv_int12[0] = 0 ;
                     GXv_int13[0] = (byte)(0) ;
                     GXv_char14[0] = "" ;
                     GXv_date15[0] = AV93fecha ;
                     GXv_int16[0] = (byte)(0) ;
                     GXv_char17[0] = AV83EncCli ;
                     GXv_char18[0] = "" ;
                     GXv_int19[0] = 0 ;
                     GXv_date20[0] = AV93fecha ;
                     GXv_char21[0] = "" ;
                     GXv_char22[0] = "" ;
                     GXv_int23[0] = 0 ;
                     GXv_date24[0] = AV93fecha ;
                     GXv_char25[0] = "" ;
                     new app.pinfagr(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_int6, GXv_char3, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char10, GXv_char11, GXv_int12, GXv_int13, GXv_char14, GXv_date15, GXv_int16, GXv_char17, GXv_char18, GXv_int19, GXv_date20, GXv_char21, GXv_char22, GXv_int23, GXv_date24, GXv_char25) ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A396EmprCod = GXv_char5[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A4497HreAgrCod = GXv_int4[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A4498HreAgrReo = GXv_int6[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A4499HreAgrPar = GXv_char3[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV93fecha = GXv_date15[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV83EncCli = GXv_char17[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV93fecha = GXv_date20[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV93fecha = GXv_date24[0] ;
                     GXt_char2 = AV89PrvDsc ;
                     GXv_char25[0] = A396EmprCod ;
                     GXv_int23[0] = AV70CliCod ;
                     GXv_char22[0] = GXt_char2 ;
                     new app.pprc252(remoteHandle, context).execute( GXv_char25, GXv_int23, GXv_char22) ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A396EmprCod = GXv_char25[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV70CliCod = GXv_int23[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char22[0] ;
                     AV89PrvDsc = GXt_char2 ;
                     GXt_char2 = AV71CliNom ;
                     GXv_char25[0] = GXt_char2 ;
                     new app.pclinom(remoteHandle, context).execute( A396EmprCod, A4503HreAgrCli, GXv_char25) ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
                     AV71CliNom = GXt_char2 ;
                     AV72HreBarSer = A4504HreAgrSer ;
                     AV73HreBarDsc = A4505HreAgrDsc ;
                     /* Execute user subroutine: 'ESCRIBOCSV' */
                     S185 ();
                     if ( returnInSub )
                     {
                        pr_default.close(4);
                        pr_default.close(0);
                        pr_default.close(0);
                        pr_default.close(0);
                        returnInSub = true;
                        if (true) return;
                     }
                     pr_default.readNext(4);
                  }
                  pr_default.close(4);
               }
               if ( GXutil.strcmp(AV30ToA, httpContext.getMessage( "A", "")) == 0 )
               {
                  AV57TablaA = (byte)(0) ;
                  /* Using cursor P08YA7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A9988HreAcKgm = P08YA7_A9988HreAcKgm[0] ;
                     n9988HreAcKgm = P08YA7_n9988HreAcKgm[0] ;
                     A9987HreAcPar = P08YA7_A9987HreAcPar[0] ;
                     A9986HreAcReo = P08YA7_A9986HreAcReo[0] ;
                     A9991HreAcCli = P08YA7_A9991HreAcCli[0] ;
                     n9991HreAcCli = P08YA7_n9991HreAcCli[0] ;
                     A9992HreAcSer = P08YA7_A9992HreAcSer[0] ;
                     n9992HreAcSer = P08YA7_n9992HreAcSer[0] ;
                     A9993HreAcDsc = P08YA7_A9993HreAcDsc[0] ;
                     n9993HreAcDsc = P08YA7_n9993HreAcDsc[0] ;
                     A9985HreAcCod = P08YA7_A9985HreAcCod[0] ;
                     AV57TablaA = (byte)(1) ;
                     AV84Marca = "" ;
                     AV65Costei = A9988HreAcKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(AV61HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV66CosteT = A9988HreAcKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(AV61HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV67Dif = AV65Costei.subtract(AV66CosteT) ;
                     AV68Porc = ((AV65Costei.doubleValue()!=0) ? GXutil.roundDecimal( (AV67Dif.divide(AV65Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
                     AV69CosteK = ((A9988HreAcKgm.doubleValue()>0) ? GXutil.roundDecimal( AV66CosteT.divide(A9988HreAcKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
                     AV91CosteTotCal = (short)(DecimalUtil.decToDouble(A9988HreAcKgm.multiply(DecimalUtil.doubleToDec(AV92CosteTotC)).divide(AV61HreTotKgm, 18, java.math.RoundingMode.DOWN))) ;
                     AV94CosteKCal = (short)(DecimalUtil.decToDouble(((A9988HreAcKgm.doubleValue()>0) ? GXutil.roundDecimal( DecimalUtil.doubleToDec(AV91CosteTotCal).divide(A9988HreAcKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)))) ;
                     AV56Hdr = GXutil.str( A9985HreAcCod, 8, 0) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
                     AV60HreBarKgm = A9988HreAcKgm ;
                     AV70CliCod = A9991HreAcCli ;
                     AV93fecha = GXutil.nullDate() ;
                     GXv_char25[0] = A396EmprCod ;
                     GXv_int23[0] = A9985HreAcCod ;
                     GXv_int16[0] = A9986HreAcReo ;
                     GXv_char22[0] = A9987HreAcPar ;
                     GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_int19[0] = 0 ;
                     GXv_char21[0] = "" ;
                     GXv_char18[0] = "" ;
                     GXv_int12[0] = 0 ;
                     GXv_int13[0] = (byte)(0) ;
                     GXv_char17[0] = "" ;
                     GXv_date24[0] = AV93fecha ;
                     GXv_int6[0] = (byte)(0) ;
                     GXv_char14[0] = AV83EncCli ;
                     GXv_char11[0] = "" ;
                     GXv_int9[0] = 0 ;
                     GXv_date20[0] = AV93fecha ;
                     GXv_char10[0] = "" ;
                     GXv_char5[0] = "" ;
                     GXv_int4[0] = 0 ;
                     GXv_date15[0] = AV93fecha ;
                     GXv_char3[0] = "" ;
                     new app.pinfagr(remoteHandle, context).execute( GXv_char25, GXv_int23, GXv_int16, GXv_char22, GXv_decimal8, GXv_decimal7, GXv_int19, GXv_char21, GXv_char18, GXv_int12, GXv_int13, GXv_char17, GXv_date24, GXv_int6, GXv_char14, GXv_char11, GXv_int9, GXv_date20, GXv_char10, GXv_char5, GXv_int4, GXv_date15, GXv_char3) ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A396EmprCod = GXv_char25[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A9985HreAcCod = GXv_int23[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A9986HreAcReo = GXv_int16[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A9987HreAcPar = GXv_char22[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV93fecha = GXv_date24[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV83EncCli = GXv_char14[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV93fecha = GXv_date20[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV93fecha = GXv_date15[0] ;
                     GXt_char2 = AV89PrvDsc ;
                     GXv_char25[0] = A396EmprCod ;
                     GXv_int23[0] = AV70CliCod ;
                     GXv_char22[0] = GXt_char2 ;
                     new app.pprc252(remoteHandle, context).execute( GXv_char25, GXv_int23, GXv_char22) ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.A396EmprCod = GXv_char25[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.AV70CliCod = GXv_int23[0] ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char22[0] ;
                     AV89PrvDsc = GXt_char2 ;
                     GXt_char2 = AV71CliNom ;
                     GXv_char25[0] = GXt_char2 ;
                     new app.pclinom(remoteHandle, context).execute( A396EmprCod, A9991HreAcCli, GXv_char25) ;
                     costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
                     AV71CliNom = GXt_char2 ;
                     AV72HreBarSer = A9992HreAcSer ;
                     AV73HreBarDsc = A9993HreAcDsc ;
                     /* Execute user subroutine: 'ESCRIBOCSV' */
                     S185 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        pr_default.close(0);
                        pr_default.close(0);
                        pr_default.close(0);
                        returnInSub = true;
                        if (true) return;
                     }
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
               }
            }
            brk8YA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk8YA2 )
         {
            brk8YA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=CostesQuimicosAnalisisDetalleExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&ToA", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreFecTin", "", "Fecha Cierre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&Marca", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&Hdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&BarAGrest", "", "Agr?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreBarKgm", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreTotKgm", "", "Kilos Tot", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreMaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreVolPrd", "", "Volumen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&Rb", "", "Rb", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&Costei", "", "Coste Ini", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&CosteT", "", "Coste Tot", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&Dif", "", "Dif", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&Porc", "", "%", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&CosteK", "", "Coste Kg", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreBarSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreBarDsc", "", "Descripcion ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreTipArtD", "", "Descripcion Tipo Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreTipColN", "", "Descripcion Tc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreIntDsc", "", "Descripcion Intensidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreDti", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&HreDtf", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXv_SdtWWPColumnsSelector26[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, "&EncCli", "", "Disp Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char25[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CostesQuimicosAnalisisDetalleColumnsSelector", GXv_char25) ;
      costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector26[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector27[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector26, GXv_SdtWWPColumnsSelector27) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector26[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector27[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("CostesQuimicosAnalisisDetalleGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CostesQuimicosAnalisisDetalleGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("CostesQuimicosAnalisisDetalleGridState"), null, null);
      }
      AV104GXV1 = 1 ;
      while ( AV104GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV104GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV28FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV38HreRacab = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV36Fec1 = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV37Fec2 = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CALCULO") == 0 )
         {
            AV58Calculo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV53barcod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV54barcodreo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV55barcodpar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD1") == 0 )
         {
            AV41ARtcod1 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD3") == 0 )
         {
            AV42ARtcod3 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM1") == 0 )
         {
            AV45Barcolnom1 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM3") == 0 )
         {
            AV46Barcolnom3 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM1") == 0 )
         {
            AV47Barcolnum1 = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM3") == 0 )
         {
            AV48Barcolnum3 = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD1") == 0 )
         {
            AV39Clicod1 = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD3") == 0 )
         {
            AV40Clicod3 = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD1") == 0 )
         {
            AV51Intcod1 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD3") == 0 )
         {
            AV52Intcod3 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD1") == 0 )
         {
            AV43TipArtCod1 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD3") == 0 )
         {
            AV44TipArtCod3 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD1") == 0 )
         {
            AV49Tipcolcod1 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD3") == 0 )
         {
            AV50Tipcolcod3 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV104GXV1 = (int)(AV104GXV1+1) ;
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

   public void S185( )
   {
      /* 'ESCRIBOCSV' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      /* Execute user subroutine: 'BEFOREWRITELINE' */
      S161 ();
      if (returnInSub) return;
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30ToA, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += localUtil.dtoc( AV29HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV84Marca, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV56Hdr, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV59BarAGrest, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV60HreBarKgm, 9, 2) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV61HreTotKgm, 9, 2) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV62HreMaqCod, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV63HreVolPrd, 5, 0) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV64Rb, 7, 2) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV65Costei, 10, 2) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV66CosteT, 10, 2) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV67Dif, 10, 2) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV68Porc, 6, 2) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV69CosteK, 10, 2) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV70CliCod, 6, 0) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV71CliNom, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV72HreBarSer, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV73HreBarDsc, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV74HreTipArtD, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV75HreColNom, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV76HreColNum, 6, 0) ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV77HreTipColN, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV78HreIntDsc, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
         AV14TextFileLine += GXt_char2 ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += localUtil.ttoc( AV81HreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         AV14TextFileLine += localUtil.ttoc( AV82HreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      }
      if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
      {
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char25[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV83EncCli, ";", ","), GXv_char25) ;
         costesquimicosanalisisdetalleexportcsv_impl.this.GXt_char2 = GXv_char25[0] ;
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
      AV35Emprcod = "" ;
      AV38HreRacab = "" ;
      AV36Fec1 = GXutil.nullDate() ;
      AV37Fec2 = GXutil.nullDate() ;
      AV55barcodpar = "" ;
      AV41ARtcod1 = "" ;
      AV42ARtcod3 = "" ;
      AV45Barcolnom1 = "" ;
      AV46Barcolnom3 = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV30ToA = "" ;
      AV29HreFecTin = GXutil.nullDate() ;
      AV84Marca = "" ;
      AV56Hdr = "" ;
      AV59BarAGrest = "" ;
      AV60HreBarKgm = DecimalUtil.ZERO ;
      AV61HreTotKgm = DecimalUtil.ZERO ;
      AV62HreMaqCod = "" ;
      AV64Rb = DecimalUtil.ZERO ;
      AV65Costei = DecimalUtil.ZERO ;
      AV66CosteT = DecimalUtil.ZERO ;
      AV67Dif = DecimalUtil.ZERO ;
      AV68Porc = DecimalUtil.ZERO ;
      AV69CosteK = DecimalUtil.ZERO ;
      AV71CliNom = "" ;
      AV72HreBarSer = "" ;
      AV73HreBarDsc = "" ;
      AV74HreTipArtD = "" ;
      AV75HreColNom = "" ;
      AV77HreTipColN = "" ;
      AV78HreIntDsc = "" ;
      AV81HreDti = GXutil.resetTime( GXutil.nullDate() );
      AV82HreDtf = GXutil.resetTime( GXutil.nullDate() );
      AV83EncCli = "" ;
      scmdbuf = "" ;
      P08YA2_A396EmprCod = new String[] {""} ;
      P08YA2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08YA2_n4529HreFecTin = new boolean[] {false} ;
      P08YA2_A4547HreVolPrd = new int[1] ;
      P08YA2_n4547HreVolPrd = new boolean[] {false} ;
      P08YA2_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA2_n8607HreCosPD = new boolean[] {false} ;
      P08YA2_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA2_n8606HreCosPA = new boolean[] {false} ;
      P08YA2_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA2_n8605HreCosCol = new boolean[] {false} ;
      P08YA2_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA2_n8604HreCosAnc = new boolean[] {false} ;
      P08YA2_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA2_n8603HrecosAd = new boolean[] {false} ;
      P08YA2_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA2_n8602HreCosAA = new boolean[] {false} ;
      P08YA2_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA2_n4532HreBarKgm = new boolean[] {false} ;
      P08YA2_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA2_n4542HreTotKgm = new boolean[] {false} ;
      P08YA2_A4546HreMaqCod = new String[] {""} ;
      P08YA2_n4546HreMaqCod = new boolean[] {false} ;
      P08YA2_A4545HreLinMaq = new short[1] ;
      P08YA2_A4495HreNumCie = new byte[1] ;
      P08YA2_A4539HreIntCod = new byte[1] ;
      P08YA2_n4539HreIntCod = new boolean[] {false} ;
      P08YA2_A4525HreTipCol = new byte[1] ;
      P08YA2_n4525HreTipCol = new boolean[] {false} ;
      P08YA2_A4522HreColNum = new int[1] ;
      P08YA2_n4522HreColNum = new boolean[] {false} ;
      P08YA2_A4521HreColNom = new String[] {""} ;
      P08YA2_n4521HreColNom = new boolean[] {false} ;
      P08YA2_A4519HreTipArt = new short[1] ;
      P08YA2_n4519HreTipArt = new boolean[] {false} ;
      P08YA2_A4517HreBarSer = new String[] {""} ;
      P08YA2_n4517HreBarSer = new boolean[] {false} ;
      P08YA2_A252CliCod = new int[1] ;
      P08YA2_n252CliCod = new boolean[] {false} ;
      P08YA2_A9808HreRacab = new String[] {""} ;
      P08YA2_n9808HreRacab = new boolean[] {false} ;
      P08YA2_A279CliNom = new String[] {""} ;
      P08YA2_A4518HreBarDsc = new String[] {""} ;
      P08YA2_n4518HreBarDsc = new boolean[] {false} ;
      P08YA2_A4520HreTipArtD = new String[] {""} ;
      P08YA2_n4520HreTipArtD = new boolean[] {false} ;
      P08YA2_A4526HreTipColN = new String[] {""} ;
      P08YA2_n4526HreTipColN = new boolean[] {false} ;
      P08YA2_A4540HreIntDsc = new String[] {""} ;
      P08YA2_n4540HreIntDsc = new boolean[] {false} ;
      P08YA2_A10104HreDtf = new java.util.Date[] {GXutil.nullDate()} ;
      P08YA2_n10104HreDtf = new boolean[] {false} ;
      P08YA2_A10103HreDti = new java.util.Date[] {GXutil.nullDate()} ;
      P08YA2_n10103HreDti = new boolean[] {false} ;
      P08YA2_A4516HreDisCli = new String[] {""} ;
      P08YA2_n4516HreDisCli = new boolean[] {false} ;
      P08YA2_A11318HreDispCli = new String[] {""} ;
      P08YA2_n11318HreDispCli = new boolean[] {false} ;
      P08YA2_A4494HreBarPar = new String[] {""} ;
      P08YA2_A4493HreBarReo = new byte[1] ;
      P08YA2_A4492HreBarCod = new int[1] ;
      A396EmprCod = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4546HreMaqCod = "" ;
      A4521HreColNom = "" ;
      A4517HreBarSer = "" ;
      A9808HreRacab = "" ;
      A279CliNom = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      A4526HreTipColN = "" ;
      A4540HreIntDsc = "" ;
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      A4516HreDisCli = "" ;
      A11318HreDispCli = "" ;
      A4494HreBarPar = "" ;
      A13842BarNhdr_Hi = "" ;
      AV86HreBarPar = "" ;
      AV89PrvDsc = "" ;
      P08YA3_A396EmprCod = new String[] {""} ;
      P08YA3_A4492HreBarCod = new int[1] ;
      P08YA3_A4493HreBarReo = new byte[1] ;
      P08YA3_A4494HreBarPar = new String[] {""} ;
      P08YA3_A4495HreNumCie = new byte[1] ;
      P08YA3_A4497HreAgrCod = new int[1] ;
      P08YA3_A4498HreAgrReo = new byte[1] ;
      P08YA3_A4499HreAgrPar = new String[] {""} ;
      A4499HreAgrPar = "" ;
      P08YA4_A396EmprCod = new String[] {""} ;
      P08YA4_A4492HreBarCod = new int[1] ;
      P08YA4_A4493HreBarReo = new byte[1] ;
      P08YA4_A4494HreBarPar = new String[] {""} ;
      P08YA4_A4495HreNumCie = new byte[1] ;
      P08YA4_A9985HreAcCod = new int[1] ;
      P08YA4_A9986HreAcReo = new byte[1] ;
      P08YA4_A9987HreAcPar = new String[] {""} ;
      A9987HreAcPar = "" ;
      AV79HreProCod = "" ;
      AV80HreProDsc = "" ;
      P08YA5_A396EmprCod = new String[] {""} ;
      P08YA5_A4492HreBarCod = new int[1] ;
      P08YA5_A4493HreBarReo = new byte[1] ;
      P08YA5_A4494HreBarPar = new String[] {""} ;
      P08YA5_A4495HreNumCie = new byte[1] ;
      P08YA5_A4545HreLinMaq = new short[1] ;
      P08YA5_A4551HreProCod = new String[] {""} ;
      P08YA5_A4552HreProDsc = new String[] {""} ;
      P08YA5_A4550HreLinPro = new byte[1] ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      P08YA6_A396EmprCod = new String[] {""} ;
      P08YA6_A4492HreBarCod = new int[1] ;
      P08YA6_A4493HreBarReo = new byte[1] ;
      P08YA6_A4494HreBarPar = new String[] {""} ;
      P08YA6_A4495HreNumCie = new byte[1] ;
      P08YA6_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA6_A4499HreAgrPar = new String[] {""} ;
      P08YA6_A4498HreAgrReo = new byte[1] ;
      P08YA6_A4503HreAgrCli = new int[1] ;
      P08YA6_A4504HreAgrSer = new String[] {""} ;
      P08YA6_A4505HreAgrDsc = new String[] {""} ;
      P08YA6_A4497HreAgrCod = new int[1] ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      AV93fecha = GXutil.nullDate() ;
      P08YA7_A396EmprCod = new String[] {""} ;
      P08YA7_A4492HreBarCod = new int[1] ;
      P08YA7_A4493HreBarReo = new byte[1] ;
      P08YA7_A4494HreBarPar = new String[] {""} ;
      P08YA7_A4495HreNumCie = new byte[1] ;
      P08YA7_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YA7_n9988HreAcKgm = new boolean[] {false} ;
      P08YA7_A9987HreAcPar = new String[] {""} ;
      P08YA7_A9986HreAcReo = new byte[1] ;
      P08YA7_A9991HreAcCli = new int[1] ;
      P08YA7_n9991HreAcCli = new boolean[] {false} ;
      P08YA7_A9992HreAcSer = new String[] {""} ;
      P08YA7_n9992HreAcSer = new boolean[] {false} ;
      P08YA7_A9993HreAcDsc = new String[] {""} ;
      P08YA7_n9993HreAcDsc = new boolean[] {false} ;
      P08YA7_A9985HreAcCod = new int[1] ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9992HreAcSer = "" ;
      A9993HreAcDsc = "" ;
      GXv_int16 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int19 = new int[1] ;
      GXv_char21 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char17 = new String[1] ;
      GXv_date24 = new java.util.Date[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_date20 = new java.util.Date[1] ;
      GXv_char10 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_char3 = new String[1] ;
      GXv_int23 = new int[1] ;
      GXv_char22 = new String[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector26 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector27 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV28FilterFullText = "" ;
      GXt_char2 = "" ;
      GXv_char25 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesquimicosanalisisdetalleexportcsv__default(),
         new Object[] {
             new Object[] {
            P08YA2_A396EmprCod, P08YA2_A4529HreFecTin, P08YA2_n4529HreFecTin, P08YA2_A4547HreVolPrd, P08YA2_n4547HreVolPrd, P08YA2_A8607HreCosPD, P08YA2_n8607HreCosPD, P08YA2_A8606HreCosPA, P08YA2_n8606HreCosPA, P08YA2_A8605HreCosCol,
            P08YA2_n8605HreCosCol, P08YA2_A8604HreCosAnc, P08YA2_n8604HreCosAnc, P08YA2_A8603HrecosAd, P08YA2_n8603HrecosAd, P08YA2_A8602HreCosAA, P08YA2_n8602HreCosAA, P08YA2_A4532HreBarKgm, P08YA2_n4532HreBarKgm, P08YA2_A4542HreTotKgm,
            P08YA2_n4542HreTotKgm, P08YA2_A4546HreMaqCod, P08YA2_n4546HreMaqCod, P08YA2_A4545HreLinMaq, P08YA2_A4495HreNumCie, P08YA2_A4539HreIntCod, P08YA2_n4539HreIntCod, P08YA2_A4525HreTipCol, P08YA2_n4525HreTipCol, P08YA2_A4522HreColNum,
            P08YA2_n4522HreColNum, P08YA2_A4521HreColNom, P08YA2_n4521HreColNom, P08YA2_A4519HreTipArt, P08YA2_n4519HreTipArt, P08YA2_A4517HreBarSer, P08YA2_n4517HreBarSer, P08YA2_A252CliCod, P08YA2_n252CliCod, P08YA2_A9808HreRacab,
            P08YA2_n9808HreRacab, P08YA2_A279CliNom, P08YA2_A4518HreBarDsc, P08YA2_n4518HreBarDsc, P08YA2_A4520HreTipArtD, P08YA2_n4520HreTipArtD, P08YA2_A4526HreTipColN, P08YA2_n4526HreTipColN, P08YA2_A4540HreIntDsc, P08YA2_n4540HreIntDsc,
            P08YA2_A10104HreDtf, P08YA2_n10104HreDtf, P08YA2_A10103HreDti, P08YA2_n10103HreDti, P08YA2_A4516HreDisCli, P08YA2_n4516HreDisCli, P08YA2_A11318HreDispCli, P08YA2_n11318HreDispCli, P08YA2_A4494HreBarPar, P08YA2_A4493HreBarReo,
            P08YA2_A4492HreBarCod
            }
            , new Object[] {
            P08YA3_A396EmprCod, P08YA3_A4492HreBarCod, P08YA3_A4493HreBarReo, P08YA3_A4494HreBarPar, P08YA3_A4495HreNumCie, P08YA3_A4497HreAgrCod, P08YA3_A4498HreAgrReo, P08YA3_A4499HreAgrPar
            }
            , new Object[] {
            P08YA4_A396EmprCod, P08YA4_A4492HreBarCod, P08YA4_A4493HreBarReo, P08YA4_A4494HreBarPar, P08YA4_A4495HreNumCie, P08YA4_A9985HreAcCod, P08YA4_A9986HreAcReo, P08YA4_A9987HreAcPar
            }
            , new Object[] {
            P08YA5_A396EmprCod, P08YA5_A4492HreBarCod, P08YA5_A4493HreBarReo, P08YA5_A4494HreBarPar, P08YA5_A4495HreNumCie, P08YA5_A4545HreLinMaq, P08YA5_A4551HreProCod, P08YA5_A4552HreProDsc, P08YA5_A4550HreLinPro
            }
            , new Object[] {
            P08YA6_A396EmprCod, P08YA6_A4492HreBarCod, P08YA6_A4493HreBarReo, P08YA6_A4494HreBarPar, P08YA6_A4495HreNumCie, P08YA6_A4500HreAgrKgm, P08YA6_A4499HreAgrPar, P08YA6_A4498HreAgrReo, P08YA6_A4503HreAgrCli, P08YA6_A4504HreAgrSer,
            P08YA6_A4505HreAgrDsc, P08YA6_A4497HreAgrCod
            }
            , new Object[] {
            P08YA7_A396EmprCod, P08YA7_A4492HreBarCod, P08YA7_A4493HreBarReo, P08YA7_A4494HreBarPar, P08YA7_A4495HreNumCie, P08YA7_A9988HreAcKgm, P08YA7_n9988HreAcKgm, P08YA7_A9987HreAcPar, P08YA7_A9986HreAcReo, P08YA7_A9991HreAcCli,
            P08YA7_n9991HreAcCli, P08YA7_A9992HreAcSer, P08YA7_n9992HreAcSer, P08YA7_A9993HreAcDsc, P08YA7_n9993HreAcDsc, P08YA7_A9985HreAcCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV58Calculo ;
   private byte AV54barcodreo ;
   private byte A4495HreNumCie ;
   private byte A4539HreIntCod ;
   private byte A4525HreTipCol ;
   private byte A4493HreBarReo ;
   private byte AV87HreBarReo ;
   private byte AV88HreNumCie ;
   private byte AV57TablaA ;
   private byte A4498HreAgrReo ;
   private byte A9986HreAcReo ;
   private byte A4550HreLinPro ;
   private byte GXv_int16[] ;
   private byte GXv_int13[] ;
   private byte GXv_int6[] ;
   private short gxcookieaux ;
   private short AV51Intcod1 ;
   private short AV52Intcod3 ;
   private short AV43TipArtCod1 ;
   private short AV44TipArtCod3 ;
   private short AV49Tipcolcod1 ;
   private short AV50Tipcolcod3 ;
   private short A4545HreLinMaq ;
   private short A4519HreTipArt ;
   private short AV90HreLinMaq ;
   private short AV91CosteTotCal ;
   private short AV92CosteTotC ;
   private short AV94CosteKCal ;
   private short Gx_err ;
   private int AV53barcod ;
   private int AV47Barcolnum1 ;
   private int AV48Barcolnum3 ;
   private int AV39Clicod1 ;
   private int AV40Clicod3 ;
   private int AV13Random ;
   private int AV63HreVolPrd ;
   private int AV70CliCod ;
   private int AV76HreColNum ;
   private int A4547HreVolPrd ;
   private int A4522HreColNum ;
   private int A252CliCod ;
   private int A4492HreBarCod ;
   private int AV85HreBarCod ;
   private int A4497HreAgrCod ;
   private int A9985HreAcCod ;
   private int A4503HreAgrCli ;
   private int A9991HreAcCli ;
   private int GXv_int19[] ;
   private int GXv_int12[] ;
   private int GXv_int9[] ;
   private int GXv_int4[] ;
   private int GXv_int23[] ;
   private int AV104GXV1 ;
   private java.math.BigDecimal AV60HreBarKgm ;
   private java.math.BigDecimal AV61HreTotKgm ;
   private java.math.BigDecimal AV64Rb ;
   private java.math.BigDecimal AV65Costei ;
   private java.math.BigDecimal AV66CosteT ;
   private java.math.BigDecimal AV67Dif ;
   private java.math.BigDecimal AV68Porc ;
   private java.math.BigDecimal AV69CosteK ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8602HreCosAA ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV35Emprcod ;
   private String AV38HreRacab ;
   private String AV55barcodpar ;
   private String AV41ARtcod1 ;
   private String AV42ARtcod3 ;
   private String AV45Barcolnom1 ;
   private String AV46Barcolnom3 ;
   private String AV30ToA ;
   private String AV84Marca ;
   private String AV56Hdr ;
   private String AV59BarAGrest ;
   private String AV62HreMaqCod ;
   private String AV71CliNom ;
   private String AV72HreBarSer ;
   private String AV73HreBarDsc ;
   private String AV74HreTipArtD ;
   private String AV75HreColNom ;
   private String AV77HreTipColN ;
   private String AV78HreIntDsc ;
   private String AV83EncCli ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4546HreMaqCod ;
   private String A4521HreColNom ;
   private String A4517HreBarSer ;
   private String A9808HreRacab ;
   private String A279CliNom ;
   private String A4518HreBarDsc ;
   private String A4520HreTipArtD ;
   private String A4526HreTipColN ;
   private String A4540HreIntDsc ;
   private String A4516HreDisCli ;
   private String A11318HreDispCli ;
   private String A4494HreBarPar ;
   private String A13842BarNhdr_Hi ;
   private String AV86HreBarPar ;
   private String AV89PrvDsc ;
   private String A4499HreAgrPar ;
   private String A9987HreAcPar ;
   private String AV79HreProCod ;
   private String AV80HreProDsc ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String A4504HreAgrSer ;
   private String A4505HreAgrDsc ;
   private String A9992HreAcSer ;
   private String A9993HreAcDsc ;
   private String GXv_char21[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char14[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String GXv_char22[] ;
   private String GXt_char2 ;
   private String GXv_char25[] ;
   private java.util.Date AV81HreDti ;
   private java.util.Date AV82HreDtf ;
   private java.util.Date A10104HreDtf ;
   private java.util.Date A10103HreDti ;
   private java.util.Date AV36Fec1 ;
   private java.util.Date AV37Fec2 ;
   private java.util.Date AV29HreFecTin ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV93fecha ;
   private java.util.Date GXv_date24[] ;
   private java.util.Date GXv_date20[] ;
   private java.util.Date GXv_date15[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean brk8YA2 ;
   private boolean n4529HreFecTin ;
   private boolean n4547HreVolPrd ;
   private boolean n8607HreCosPD ;
   private boolean n8606HreCosPA ;
   private boolean n8605HreCosCol ;
   private boolean n8604HreCosAnc ;
   private boolean n8603HrecosAd ;
   private boolean n8602HreCosAA ;
   private boolean n4532HreBarKgm ;
   private boolean n4542HreTotKgm ;
   private boolean n4546HreMaqCod ;
   private boolean n4539HreIntCod ;
   private boolean n4525HreTipCol ;
   private boolean n4522HreColNum ;
   private boolean n4521HreColNom ;
   private boolean n4519HreTipArt ;
   private boolean n4517HreBarSer ;
   private boolean n252CliCod ;
   private boolean n9808HreRacab ;
   private boolean n4518HreBarDsc ;
   private boolean n4520HreTipArtD ;
   private boolean n4526HreTipColN ;
   private boolean n4540HreIntDsc ;
   private boolean n10104HreDtf ;
   private boolean n10103HreDti ;
   private boolean n4516HreDisCli ;
   private boolean n11318HreDispCli ;
   private boolean n9988HreAcKgm ;
   private boolean n9991HreAcCli ;
   private boolean n9992HreAcSer ;
   private boolean n9993HreAcDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV28FilterFullText ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08YA2_A396EmprCod ;
   private java.util.Date[] P08YA2_A4529HreFecTin ;
   private boolean[] P08YA2_n4529HreFecTin ;
   private int[] P08YA2_A4547HreVolPrd ;
   private boolean[] P08YA2_n4547HreVolPrd ;
   private java.math.BigDecimal[] P08YA2_A8607HreCosPD ;
   private boolean[] P08YA2_n8607HreCosPD ;
   private java.math.BigDecimal[] P08YA2_A8606HreCosPA ;
   private boolean[] P08YA2_n8606HreCosPA ;
   private java.math.BigDecimal[] P08YA2_A8605HreCosCol ;
   private boolean[] P08YA2_n8605HreCosCol ;
   private java.math.BigDecimal[] P08YA2_A8604HreCosAnc ;
   private boolean[] P08YA2_n8604HreCosAnc ;
   private java.math.BigDecimal[] P08YA2_A8603HrecosAd ;
   private boolean[] P08YA2_n8603HrecosAd ;
   private java.math.BigDecimal[] P08YA2_A8602HreCosAA ;
   private boolean[] P08YA2_n8602HreCosAA ;
   private java.math.BigDecimal[] P08YA2_A4532HreBarKgm ;
   private boolean[] P08YA2_n4532HreBarKgm ;
   private java.math.BigDecimal[] P08YA2_A4542HreTotKgm ;
   private boolean[] P08YA2_n4542HreTotKgm ;
   private String[] P08YA2_A4546HreMaqCod ;
   private boolean[] P08YA2_n4546HreMaqCod ;
   private short[] P08YA2_A4545HreLinMaq ;
   private byte[] P08YA2_A4495HreNumCie ;
   private byte[] P08YA2_A4539HreIntCod ;
   private boolean[] P08YA2_n4539HreIntCod ;
   private byte[] P08YA2_A4525HreTipCol ;
   private boolean[] P08YA2_n4525HreTipCol ;
   private int[] P08YA2_A4522HreColNum ;
   private boolean[] P08YA2_n4522HreColNum ;
   private String[] P08YA2_A4521HreColNom ;
   private boolean[] P08YA2_n4521HreColNom ;
   private short[] P08YA2_A4519HreTipArt ;
   private boolean[] P08YA2_n4519HreTipArt ;
   private String[] P08YA2_A4517HreBarSer ;
   private boolean[] P08YA2_n4517HreBarSer ;
   private int[] P08YA2_A252CliCod ;
   private boolean[] P08YA2_n252CliCod ;
   private String[] P08YA2_A9808HreRacab ;
   private boolean[] P08YA2_n9808HreRacab ;
   private String[] P08YA2_A279CliNom ;
   private String[] P08YA2_A4518HreBarDsc ;
   private boolean[] P08YA2_n4518HreBarDsc ;
   private String[] P08YA2_A4520HreTipArtD ;
   private boolean[] P08YA2_n4520HreTipArtD ;
   private String[] P08YA2_A4526HreTipColN ;
   private boolean[] P08YA2_n4526HreTipColN ;
   private String[] P08YA2_A4540HreIntDsc ;
   private boolean[] P08YA2_n4540HreIntDsc ;
   private java.util.Date[] P08YA2_A10104HreDtf ;
   private boolean[] P08YA2_n10104HreDtf ;
   private java.util.Date[] P08YA2_A10103HreDti ;
   private boolean[] P08YA2_n10103HreDti ;
   private String[] P08YA2_A4516HreDisCli ;
   private boolean[] P08YA2_n4516HreDisCli ;
   private String[] P08YA2_A11318HreDispCli ;
   private boolean[] P08YA2_n11318HreDispCli ;
   private String[] P08YA2_A4494HreBarPar ;
   private byte[] P08YA2_A4493HreBarReo ;
   private int[] P08YA2_A4492HreBarCod ;
   private String[] P08YA3_A396EmprCod ;
   private int[] P08YA3_A4492HreBarCod ;
   private byte[] P08YA3_A4493HreBarReo ;
   private String[] P08YA3_A4494HreBarPar ;
   private byte[] P08YA3_A4495HreNumCie ;
   private int[] P08YA3_A4497HreAgrCod ;
   private byte[] P08YA3_A4498HreAgrReo ;
   private String[] P08YA3_A4499HreAgrPar ;
   private String[] P08YA4_A396EmprCod ;
   private int[] P08YA4_A4492HreBarCod ;
   private byte[] P08YA4_A4493HreBarReo ;
   private String[] P08YA4_A4494HreBarPar ;
   private byte[] P08YA4_A4495HreNumCie ;
   private int[] P08YA4_A9985HreAcCod ;
   private byte[] P08YA4_A9986HreAcReo ;
   private String[] P08YA4_A9987HreAcPar ;
   private String[] P08YA5_A396EmprCod ;
   private int[] P08YA5_A4492HreBarCod ;
   private byte[] P08YA5_A4493HreBarReo ;
   private String[] P08YA5_A4494HreBarPar ;
   private byte[] P08YA5_A4495HreNumCie ;
   private short[] P08YA5_A4545HreLinMaq ;
   private String[] P08YA5_A4551HreProCod ;
   private String[] P08YA5_A4552HreProDsc ;
   private byte[] P08YA5_A4550HreLinPro ;
   private String[] P08YA6_A396EmprCod ;
   private int[] P08YA6_A4492HreBarCod ;
   private byte[] P08YA6_A4493HreBarReo ;
   private String[] P08YA6_A4494HreBarPar ;
   private byte[] P08YA6_A4495HreNumCie ;
   private java.math.BigDecimal[] P08YA6_A4500HreAgrKgm ;
   private String[] P08YA6_A4499HreAgrPar ;
   private byte[] P08YA6_A4498HreAgrReo ;
   private int[] P08YA6_A4503HreAgrCli ;
   private String[] P08YA6_A4504HreAgrSer ;
   private String[] P08YA6_A4505HreAgrDsc ;
   private int[] P08YA6_A4497HreAgrCod ;
   private String[] P08YA7_A396EmprCod ;
   private int[] P08YA7_A4492HreBarCod ;
   private byte[] P08YA7_A4493HreBarReo ;
   private String[] P08YA7_A4494HreBarPar ;
   private byte[] P08YA7_A4495HreNumCie ;
   private java.math.BigDecimal[] P08YA7_A9988HreAcKgm ;
   private boolean[] P08YA7_n9988HreAcKgm ;
   private String[] P08YA7_A9987HreAcPar ;
   private byte[] P08YA7_A9986HreAcReo ;
   private int[] P08YA7_A9991HreAcCli ;
   private boolean[] P08YA7_n9991HreAcCli ;
   private String[] P08YA7_A9992HreAcSer ;
   private boolean[] P08YA7_n9992HreAcSer ;
   private String[] P08YA7_A9993HreAcDsc ;
   private boolean[] P08YA7_n9993HreAcDsc ;
   private int[] P08YA7_A9985HreAcCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector26[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector27[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class costesquimicosanalisisdetalleexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YA2", "SELECT T1.EmprCod, T2.HreFecTin, T1.HreVolPrd, T1.HreCosPD, T1.HreCosPA, T1.HreCosCol, T1.HreCosAnc, T1.HrecosAd, T1.HreCosAA, T2.HreBarKgm, T2.HreTotKgm, T1.HreMaqCod, T1.HreLinMaq, T1.HreNumCie, T2.HreIntCod, T2.HreTipCol, T2.HreColNum, T2.HreColNom, T2.HreTipArt, T2.HreBarSer, T2.CliCod, T2.HreRacab, T3.CliNom, T2.HreBarDsc, T2.HreTipArtD, T2.HreTipColN, T2.HreIntDsc, T1.HreDtf, T1.HreDti, T2.HreDisCli, T2.HreDispCli, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod FROM ((TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE (T1.EmprCod = ? and T2.HreFecTin >= ?) AND (T2.HreRacab = ? or ? = 'T') AND (T2.CliCod >= ?) AND (T2.CliCod <= ?) AND (T2.HreBarSer >= ?) AND (T2.HreBarSer <= ?) AND (T2.HreTipArt >= ?) AND (T2.HreTipArt <= ?) AND (T2.HreColNom >= ?) AND (T2.HreColNom <= ?) AND (T2.HreColNum >= ?) AND (T2.HreColNum <= ?) AND (T2.HreTipCol >= ?) AND (T2.HreTipCol <= ?) AND (T2.HreIntCod >= ?) AND (T2.HreIntCod <= ?) AND (T1.HreBarCod = ? or (? = 0)) AND (T1.HreBarReo = ? or (? = 0)) AND (T1.HreBarPar = ? or (rtrim(?) IS NULL)) AND (T2.HreFecTin <= ?) ORDER BY T2.HreFecTin, T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YA3", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YA4", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YA5", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreProCod, HreProDsc, HreLinPro FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YA6", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrKgm, HreAgrPar, HreAgrReo, HreAgrCli, HreAgrSer, HreAgrDsc, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YA7", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcKgm, HreAcPar, HreAcReo, HreAcCli, HreAcSer, HreAcDsc, HreAcCod FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 13);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 30);
               ((String[]) buf[42])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDateTime(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDateTime(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(30, 8);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 20);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 1);
               ((byte[]) buf[59])[0] = rslt.getByte(33);
               ((int[]) buf[60])[0] = rslt.getInt(34);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 13);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setString(23, (String)parms[22], 1);
               stmt.setString(24, (String)parms[23], 1);
               stmt.setDate(25, (java.util.Date)parms[24]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

