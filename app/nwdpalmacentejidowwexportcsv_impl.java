package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class nwdpalmacentejidowwexportcsv_impl extends GXWebProcedure
{
   public nwdpalmacentejidowwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "NwDPAlmacenTejidoWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("NwDPAlmacenTejidoWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("NwDPAlmacenTejidoWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Disposicion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Desglose", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Recepciones", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Medida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Localizacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Disposicion Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reclamaciones", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Nwdpalmacentejidowwds_1_filterfulltext = AV53FilterFullText ;
      AV58Nwdpalmacentejidowwds_2_tfemprcod = AV33TFEmprCod ;
      AV59Nwdpalmacentejidowwds_3_tfemprcod_sel = AV34TFEmprCod_Sel ;
      AV60Nwdpalmacentejidowwds_4_tfdiscod = AV35TFDisCod ;
      AV61Nwdpalmacentejidowwds_5_tfdiscod_to = AV36TFDisCod_To ;
      AV62Nwdpalmacentejidowwds_6_tfdisdes_sel = AV38TFDisDes_Sel ;
      AV63Nwdpalmacentejidowwds_7_tfclicod = AV39TFCliCod ;
      AV64Nwdpalmacentejidowwds_8_tfclicod_to = AV40TFCliCod_To ;
      AV65Nwdpalmacentejidowwds_9_tfdisartcod = AV41TFDisArtCod ;
      AV66Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV42TFDisArtCod_Sel ;
      AV67Nwdpalmacentejidowwds_11_tfdistotrec = AV43TFDisTotRec ;
      AV68Nwdpalmacentejidowwds_12_tfdistotrec_to = AV44TFDisTotRec_To ;
      AV69Nwdpalmacentejidowwds_13_tfdisunimed = AV45TFDisUniMed ;
      AV70Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV46TFDisUniMed_Sel ;
      AV71Nwdpalmacentejidowwds_15_tfdisloc = AV47TFDisLoc ;
      AV72Nwdpalmacentejidowwds_16_tfdisloc_sel = AV48TFDisLoc_Sel ;
      AV73Nwdpalmacentejidowwds_17_tfdisclinum = AV49TFDisCliNum ;
      AV74Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV50TFDisCliNum_Sel ;
      AV75Nwdpalmacentejidowwds_19_tfdiscanrec = AV51TFDisCanRec ;
      AV76Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV52TFDisCanRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           AV58Nwdpalmacentejidowwds_2_tfemprcod ,
                                           Integer.valueOf(AV60Nwdpalmacentejidowwds_4_tfdiscod) ,
                                           Integer.valueOf(AV61Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                           AV62Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           Integer.valueOf(AV63Nwdpalmacentejidowwds_7_tfclicod) ,
                                           Integer.valueOf(AV64Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                           AV66Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           AV65Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           Integer.valueOf(AV67Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                           Integer.valueOf(AV68Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                           AV70Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           AV69Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           AV72Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           AV71Nwdpalmacentejidowwds_15_tfdisloc ,
                                           AV74Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           AV73Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A365DisDes ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           Integer.valueOf(A13733DisTotRec) ,
                                           A392DisUniMed ,
                                           A1430DisLoc ,
                                           A360DisCliNum ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV57Nwdpalmacentejidowwds_1_filterfulltext ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV75Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                           Short.valueOf(AV76Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV57Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV57Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV57Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV57Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV57Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV57Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV57Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV57Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV57Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV58Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
      lV65Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV65Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
      lV69Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV69Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
      lV71Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV71Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
      lV73Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV73Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
      /* Using cursor P08E54 */
      pr_default.execute(0, new Object[] {AV57Nwdpalmacentejidowwds_1_filterfulltext, lV57Nwdpalmacentejidowwds_1_filterfulltext, lV57Nwdpalmacentejidowwds_1_filterfulltext, lV57Nwdpalmacentejidowwds_1_filterfulltext, lV57Nwdpalmacentejidowwds_1_filterfulltext, lV57Nwdpalmacentejidowwds_1_filterfulltext, lV57Nwdpalmacentejidowwds_1_filterfulltext, lV57Nwdpalmacentejidowwds_1_filterfulltext, lV57Nwdpalmacentejidowwds_1_filterfulltext, lV57Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV75Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV75Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV76Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV76Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV58Nwdpalmacentejidowwds_2_tfemprcod, AV59Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV60Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV61Nwdpalmacentejidowwds_5_tfdiscod_to), AV62Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV63Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV64Nwdpalmacentejidowwds_8_tfclicod_to), lV65Nwdpalmacentejidowwds_9_tfdisartcod, AV66Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV67Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV68Nwdpalmacentejidowwds_12_tfdistotrec_to), lV69Nwdpalmacentejidowwds_13_tfdisunimed, AV70Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV71Nwdpalmacentejidowwds_15_tfdisloc, AV72Nwdpalmacentejidowwds_16_tfdisloc_sel, lV73Nwdpalmacentejidowwds_17_tfdisclinum, AV74Nwdpalmacentejidowwds_18_tfdisclinum_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A360DisCliNum = P08E54_A360DisCliNum[0] ;
         A1430DisLoc = P08E54_A1430DisLoc[0] ;
         A392DisUniMed = P08E54_A392DisUniMed[0] ;
         A335DisArtCod = P08E54_A335DisArtCod[0] ;
         A252CliCod = P08E54_A252CliCod[0] ;
         A365DisDes = P08E54_A365DisDes[0] ;
         A361DisCod = P08E54_A361DisCod[0] ;
         A396EmprCod = P08E54_A396EmprCod[0] ;
         A13732DisCanRec = P08E54_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E54_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E54_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E54_n13733DisTotRec[0] ;
         A13732DisCanRec = P08E54_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E54_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E54_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E54_n13733DisTotRec[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
            nwdpalmacentejidowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A361DisCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A365DisDes, ";", ","), GXv_char3) ;
            nwdpalmacentejidowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A335DisArtCod, ";", ","), GXv_char3) ;
            nwdpalmacentejidowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13733DisTotRec, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A392DisUniMed, ";", ","), GXv_char3) ;
            nwdpalmacentejidowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1430DisLoc, ";", ","), GXv_char3) ;
            nwdpalmacentejidowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A360DisCliNum, ";", ","), GXv_char3) ;
            nwdpalmacentejidowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13732DisCanRec, 4, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=NwDPAlmacenTejidoWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCod", "", "Código Empresa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisCod", "", "Codigo Disposicion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisDes", "", "Desglose", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisArtCod", "", "Código Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisTotRec", "", "Recepciones", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisUniMed", "", "Unidades Medida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisLoc", "", "Localizacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisCliNum", "", "Codigo Disposicion Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisCanRec", "", "Reclamaciones", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "NwDPAlmacenTejidoWWColumnsSelector", GXv_char3) ;
      nwdpalmacentejidowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("NwDPAlmacenTejidoWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "NwDPAlmacenTejidoWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("NwDPAlmacenTejidoWWGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV53FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV33TFEmprCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV34TFEmprCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV35TFDisCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFDisCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISDES_SEL") == 0 )
         {
            AV38TFDisDes_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV39TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV41TFDisArtCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV42TFDisArtCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTOTREC") == 0 )
         {
            AV43TFDisTotRec = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFDisTotRec_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV45TFDisUniMed = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV46TFDisUniMed_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC") == 0 )
         {
            AV47TFDisLoc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC_SEL") == 0 )
         {
            AV48TFDisLoc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV49TFDisCliNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV50TFDisCliNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV51TFDisCanRec = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFDisCanRec_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A396EmprCod = "" ;
      A365DisDes = "" ;
      A335DisArtCod = "" ;
      A392DisUniMed = "" ;
      A1430DisLoc = "" ;
      A360DisCliNum = "" ;
      AV57Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      AV53FilterFullText = "" ;
      AV58Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      AV33TFEmprCod = "" ;
      AV59Nwdpalmacentejidowwds_3_tfemprcod_sel = "" ;
      AV34TFEmprCod_Sel = "" ;
      AV62Nwdpalmacentejidowwds_6_tfdisdes_sel = "" ;
      AV38TFDisDes_Sel = "" ;
      AV65Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      AV41TFDisArtCod = "" ;
      AV66Nwdpalmacentejidowwds_10_tfdisartcod_sel = "" ;
      AV42TFDisArtCod_Sel = "" ;
      AV69Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      AV45TFDisUniMed = "" ;
      AV70Nwdpalmacentejidowwds_14_tfdisunimed_sel = "" ;
      AV46TFDisUniMed_Sel = "" ;
      AV71Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      AV47TFDisLoc = "" ;
      AV72Nwdpalmacentejidowwds_16_tfdisloc_sel = "" ;
      AV48TFDisLoc_Sel = "" ;
      AV73Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      AV49TFDisCliNum = "" ;
      AV74Nwdpalmacentejidowwds_18_tfdisclinum_sel = "" ;
      AV50TFDisCliNum_Sel = "" ;
      lV57Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV58Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      lV65Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      lV69Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      lV71Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      lV73Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      P08E54_A360DisCliNum = new String[] {""} ;
      P08E54_A1430DisLoc = new String[] {""} ;
      P08E54_A392DisUniMed = new String[] {""} ;
      P08E54_A335DisArtCod = new String[] {""} ;
      P08E54_A252CliCod = new int[1] ;
      P08E54_A365DisDes = new String[] {""} ;
      P08E54_A361DisCod = new int[1] ;
      P08E54_A396EmprCod = new String[] {""} ;
      P08E54_A13732DisCanRec = new short[1] ;
      P08E54_n13732DisCanRec = new boolean[] {false} ;
      P08E54_A13733DisTotRec = new int[1] ;
      P08E54_n13733DisTotRec = new boolean[] {false} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejidowwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08E54_A360DisCliNum, P08E54_A1430DisLoc, P08E54_A392DisUniMed, P08E54_A335DisArtCod, P08E54_A252CliCod, P08E54_A365DisDes, P08E54_A361DisCod, P08E54_A396EmprCod, P08E54_A13732DisCanRec, P08E54_n13732DisCanRec,
            P08E54_A13733DisTotRec, P08E54_n13733DisTotRec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A13732DisCanRec ;
   private short AV75Nwdpalmacentejidowwds_19_tfdiscanrec ;
   private short AV51TFDisCanRec ;
   private short AV76Nwdpalmacentejidowwds_20_tfdiscanrec_to ;
   private short AV52TFDisCanRec_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A13733DisTotRec ;
   private int AV60Nwdpalmacentejidowwds_4_tfdiscod ;
   private int AV35TFDisCod ;
   private int AV61Nwdpalmacentejidowwds_5_tfdiscod_to ;
   private int AV36TFDisCod_To ;
   private int AV63Nwdpalmacentejidowwds_7_tfclicod ;
   private int AV39TFCliCod ;
   private int AV64Nwdpalmacentejidowwds_8_tfclicod_to ;
   private int AV40TFCliCod_To ;
   private int AV67Nwdpalmacentejidowwds_11_tfdistotrec ;
   private int AV43TFDisTotRec ;
   private int AV68Nwdpalmacentejidowwds_12_tfdistotrec_to ;
   private int AV44TFDisTotRec_To ;
   private int AV77GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String A335DisArtCod ;
   private String A392DisUniMed ;
   private String A1430DisLoc ;
   private String A360DisCliNum ;
   private String AV58Nwdpalmacentejidowwds_2_tfemprcod ;
   private String AV33TFEmprCod ;
   private String AV59Nwdpalmacentejidowwds_3_tfemprcod_sel ;
   private String AV34TFEmprCod_Sel ;
   private String AV62Nwdpalmacentejidowwds_6_tfdisdes_sel ;
   private String AV38TFDisDes_Sel ;
   private String AV65Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String AV41TFDisArtCod ;
   private String AV66Nwdpalmacentejidowwds_10_tfdisartcod_sel ;
   private String AV42TFDisArtCod_Sel ;
   private String AV69Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String AV45TFDisUniMed ;
   private String AV70Nwdpalmacentejidowwds_14_tfdisunimed_sel ;
   private String AV46TFDisUniMed_Sel ;
   private String AV71Nwdpalmacentejidowwds_15_tfdisloc ;
   private String AV47TFDisLoc ;
   private String AV72Nwdpalmacentejidowwds_16_tfdisloc_sel ;
   private String AV48TFDisLoc_Sel ;
   private String AV73Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String AV49TFDisCliNum ;
   private String AV74Nwdpalmacentejidowwds_18_tfdisclinum_sel ;
   private String AV50TFDisCliNum_Sel ;
   private String scmdbuf ;
   private String lV58Nwdpalmacentejidowwds_2_tfemprcod ;
   private String lV65Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String lV69Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String lV71Nwdpalmacentejidowwds_15_tfdisloc ;
   private String lV73Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13732DisCanRec ;
   private boolean n13733DisTotRec ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV57Nwdpalmacentejidowwds_1_filterfulltext ;
   private String AV53FilterFullText ;
   private String lV57Nwdpalmacentejidowwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08E54_A360DisCliNum ;
   private String[] P08E54_A1430DisLoc ;
   private String[] P08E54_A392DisUniMed ;
   private String[] P08E54_A335DisArtCod ;
   private int[] P08E54_A252CliCod ;
   private String[] P08E54_A365DisDes ;
   private int[] P08E54_A361DisCod ;
   private String[] P08E54_A396EmprCod ;
   private short[] P08E54_A13732DisCanRec ;
   private boolean[] P08E54_n13732DisCanRec ;
   private int[] P08E54_A13733DisTotRec ;
   private boolean[] P08E54_n13733DisTotRec ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class nwdpalmacentejidowwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08E54( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                          String AV58Nwdpalmacentejidowwds_2_tfemprcod ,
                                          int AV60Nwdpalmacentejidowwds_4_tfdiscod ,
                                          int AV61Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                          String AV62Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                          int AV63Nwdpalmacentejidowwds_7_tfclicod ,
                                          int AV64Nwdpalmacentejidowwds_8_tfclicod_to ,
                                          String AV66Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                          String AV65Nwdpalmacentejidowwds_9_tfdisartcod ,
                                          int AV67Nwdpalmacentejidowwds_11_tfdistotrec ,
                                          int AV68Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                          String AV70Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                          String AV69Nwdpalmacentejidowwds_13_tfdisunimed ,
                                          String AV72Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                          String AV71Nwdpalmacentejidowwds_15_tfdisloc ,
                                          String AV74Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                          String AV73Nwdpalmacentejidowwds_17_tfdisclinum ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          String A365DisDes ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          int A13733DisTotRec ,
                                          String A392DisUniMed ,
                                          String A1430DisLoc ,
                                          String A360DisCliNum ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV57Nwdpalmacentejidowwds_1_filterfulltext ,
                                          short A13732DisCanRec ,
                                          short AV75Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                          short AV76Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[31];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.DisCliNum, T1.DisLoc, T1.DisUniMed, T1.DisArtCod, T1.CliCod, T1.DisDes, T1.DisCod, T1.EmprCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisCanRec," ;
      scmdbuf += " 0) AS DisTotRec FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod" ;
      scmdbuf += " AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT" ;
      scmdbuf += " COUNT(*) AS DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV59Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV60Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV61Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV71Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV73Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisDes" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisDes DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisLoc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisLoc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P08E54(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08E54", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               return;
      }
   }

}

