package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfacdivwwexportcsv_impl extends GXWebProcedure
{
   public tfacdivwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TFACDIVWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.TFACDIVWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Facturacion.TFACDIVWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero Factura", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Divisa Traspaso Contable", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Divisa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Abreviatura", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Representante", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Representante", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Facturacion_tfacdivwwds_1_filterfulltext = AV30FilterFullText ;
      AV58Facturacion_tfacdivwwds_2_tfemprcod = AV34TFEmprCod ;
      AV59Facturacion_tfacdivwwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV60Facturacion_tfacdivwwds_4_tffaccod = AV36TFFacCod ;
      AV61Facturacion_tfacdivwwds_5_tffaccod_to = AV37TFFacCod_To ;
      AV62Facturacion_tfacdivwwds_6_tfclicod = AV38TFCliCod ;
      AV63Facturacion_tfacdivwwds_7_tfclicod_to = AV39TFCliCod_To ;
      AV64Facturacion_tfacdivwwds_8_tfclinom = AV40TFCliNom ;
      AV65Facturacion_tfacdivwwds_9_tfclinom_sel = AV41TFCliNom_Sel ;
      AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV43TFFacDivTCod_Sels ;
      AV67Facturacion_tfacdivwwds_11_tffacdivcod = AV44TFFacDivCod ;
      AV68Facturacion_tfacdivwwds_12_tffacdivcod_to = AV45TFFacDivCod_To ;
      AV69Facturacion_tfacdivwwds_13_tffacdivabr = AV46TFFacDivAbr ;
      AV70Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV47TFFacDivAbr_Sel ;
      AV71Facturacion_tfacdivwwds_15_tffacrepcod = AV48TFFacRepCod ;
      AV72Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV49TFFacRepCod_Sel ;
      AV73Facturacion_tfacdivwwds_17_tffacrepnom = AV50TFFacRepNom ;
      AV74Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV51TFFacRepNom_Sel ;
      AV75Facturacion_tfacdivwwds_19_tfemprnom = AV52TFEmprNom ;
      AV76Facturacion_tfacdivwwds_20_tfemprnom_sel = AV53TFEmprNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV59Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV58Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV60Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV61Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV62Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV63Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV65Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV64Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV67Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV68Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV70Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV69Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV72Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV71Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV74Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV73Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV76Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV75Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV57Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV58Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV64Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV64Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV69Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV69Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV71Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV71Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV73Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV73Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV75Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV75Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor P0AVW2 */
      pr_default.execute(0, new Object[] {lV58Facturacion_tfacdivwwds_2_tfemprcod, AV59Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV60Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV61Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV62Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV63Facturacion_tfacdivwwds_7_tfclicod_to), lV64Facturacion_tfacdivwwds_8_tfclinom, AV65Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV67Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV68Facturacion_tfacdivwwds_12_tffacdivcod_to), lV69Facturacion_tfacdivwwds_13_tffacdivabr, AV70Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV71Facturacion_tfacdivwwds_15_tffacrepcod, AV72Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV73Facturacion_tfacdivwwds_17_tffacrepnom, AV74Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV75Facturacion_tfacdivwwds_19_tfemprnom, AV76Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P0AVW2_A407EmprNom[0] ;
         n407EmprNom = P0AVW2_n407EmprNom[0] ;
         A3120FacRepNom = P0AVW2_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVW2_n3120FacRepNom[0] ;
         A3119FacRepCod = P0AVW2_A3119FacRepCod[0] ;
         n3119FacRepCod = P0AVW2_n3119FacRepCod[0] ;
         A3116FacDivAbr = P0AVW2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVW2_n3116FacDivAbr[0] ;
         A3115FacDivCod = P0AVW2_A3115FacDivCod[0] ;
         n3115FacDivCod = P0AVW2_n3115FacDivCod[0] ;
         A279CliNom = P0AVW2_A279CliNom[0] ;
         A252CliCod = P0AVW2_A252CliCod[0] ;
         A430FacCod = P0AVW2_A430FacCod[0] ;
         A396EmprCod = P0AVW2_A396EmprCod[0] ;
         A3096FacDivTCod = P0AVW2_A3096FacDivTCod[0] ;
         n3096FacDivTCod = P0AVW2_n3096FacDivTCod[0] ;
         A3116FacDivAbr = P0AVW2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVW2_n3116FacDivAbr[0] ;
         A407EmprNom = P0AVW2_A407EmprNom[0] ;
         n407EmprNom = P0AVW2_n407EmprNom[0] ;
         A3120FacRepNom = P0AVW2_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVW2_n3120FacRepNom[0] ;
         A279CliNom = P0AVW2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV57Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV57Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV57Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV57Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV57Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV57Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV57Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV57Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV57Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV57Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV14TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S162 ();
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
               tfacdivwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A430FacCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
               tfacdivwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A3096FacDivTCod), "P") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "PESETA", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A3096FacDivTCod), "E") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "EURO", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A3115FacDivCod, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3116FacDivAbr, ";", ","), GXv_char3) ;
               tfacdivwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3119FacRepCod, ";", ","), GXv_char3) ;
               tfacdivwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3120FacRepNom, ";", ","), GXv_char3) ;
               tfacdivwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A407EmprNom, ";", ","), GXv_char3) ;
               tfacdivwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S172 ();
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
            if ( GXutil.len( AV14TextFileLine) > 0 )
            {
               AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
            }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TFACDIVWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCod", "", "Empresa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FacCod", "", "Numero Factura", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FacDivTCod", "", "Divisa Traspaso Contable", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FacDivCod", "", "Divisa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FacDivAbr", "", "Abreviatura", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FacRepCod", "", "Representante", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FacRepNom", "", "Nombre Representante", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.TFACDIVWWColumnsSelector", GXv_char3) ;
      tfacdivwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.TFACDIVWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TFACDIVWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("Facturacion.TFACDIVWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV36TFFacCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFFacCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVTCOD_SEL") == 0 )
         {
            AV42TFFacDivTCod_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV43TFFacDivTCod_Sels.fromJSonString(AV42TFFacDivTCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVCOD") == 0 )
         {
            AV44TFFacDivCod = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFFacDivCod_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR") == 0 )
         {
            AV46TFFacDivAbr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR_SEL") == 0 )
         {
            AV47TFFacDivAbr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD") == 0 )
         {
            AV48TFFacRepCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD_SEL") == 0 )
         {
            AV49TFFacRepCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM") == 0 )
         {
            AV50TFFacRepNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM_SEL") == 0 )
         {
            AV51TFFacRepNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV52TFEmprNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV53TFEmprNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      A279CliNom = "" ;
      A3096FacDivTCod = "" ;
      A3116FacDivAbr = "" ;
      A3119FacRepCod = "" ;
      A3120FacRepNom = "" ;
      A407EmprNom = "" ;
      AV57Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV58Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      AV34TFEmprCod = "" ;
      AV59Facturacion_tfacdivwwds_3_tfemprcod_sel = "" ;
      AV35TFEmprCod_Sel = "" ;
      AV64Facturacion_tfacdivwwds_8_tfclinom = "" ;
      AV40TFCliNom = "" ;
      AV65Facturacion_tfacdivwwds_9_tfclinom_sel = "" ;
      AV41TFCliNom_Sel = "" ;
      AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV43TFFacDivTCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV69Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      AV46TFFacDivAbr = "" ;
      AV70Facturacion_tfacdivwwds_14_tffacdivabr_sel = "" ;
      AV47TFFacDivAbr_Sel = "" ;
      AV71Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      AV48TFFacRepCod = "" ;
      AV72Facturacion_tfacdivwwds_16_tffacrepcod_sel = "" ;
      AV49TFFacRepCod_Sel = "" ;
      AV73Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      AV50TFFacRepNom = "" ;
      AV74Facturacion_tfacdivwwds_18_tffacrepnom_sel = "" ;
      AV51TFFacRepNom_Sel = "" ;
      AV75Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      AV52TFEmprNom = "" ;
      AV76Facturacion_tfacdivwwds_20_tfemprnom_sel = "" ;
      AV53TFEmprNom_Sel = "" ;
      lV57Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV58Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      lV64Facturacion_tfacdivwwds_8_tfclinom = "" ;
      lV69Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      lV71Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      lV73Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      lV75Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      P0AVW2_A407EmprNom = new String[] {""} ;
      P0AVW2_n407EmprNom = new boolean[] {false} ;
      P0AVW2_A3120FacRepNom = new String[] {""} ;
      P0AVW2_n3120FacRepNom = new boolean[] {false} ;
      P0AVW2_A3119FacRepCod = new String[] {""} ;
      P0AVW2_n3119FacRepCod = new boolean[] {false} ;
      P0AVW2_A3116FacDivAbr = new String[] {""} ;
      P0AVW2_n3116FacDivAbr = new boolean[] {false} ;
      P0AVW2_A3115FacDivCod = new byte[1] ;
      P0AVW2_n3115FacDivCod = new boolean[] {false} ;
      P0AVW2_A279CliNom = new String[] {""} ;
      P0AVW2_A252CliCod = new int[1] ;
      P0AVW2_A430FacCod = new int[1] ;
      P0AVW2_A396EmprCod = new String[] {""} ;
      P0AVW2_A3096FacDivTCod = new String[] {""} ;
      P0AVW2_n3096FacDivTCod = new boolean[] {false} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42TFFacDivTCod_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdivwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0AVW2_A407EmprNom, P0AVW2_n407EmprNom, P0AVW2_A3120FacRepNom, P0AVW2_n3120FacRepNom, P0AVW2_A3119FacRepCod, P0AVW2_n3119FacRepCod, P0AVW2_A3116FacDivAbr, P0AVW2_n3116FacDivAbr, P0AVW2_A3115FacDivCod, P0AVW2_n3115FacDivCod,
            P0AVW2_A279CliNom, P0AVW2_A252CliCod, P0AVW2_A430FacCod, P0AVW2_A396EmprCod, P0AVW2_A3096FacDivTCod, P0AVW2_n3096FacDivTCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3115FacDivCod ;
   private byte AV67Facturacion_tfacdivwwds_11_tffacdivcod ;
   private byte AV44TFFacDivCod ;
   private byte AV68Facturacion_tfacdivwwds_12_tffacdivcod_to ;
   private byte AV45TFFacDivCod_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV60Facturacion_tfacdivwwds_4_tffaccod ;
   private int AV36TFFacCod ;
   private int AV61Facturacion_tfacdivwwds_5_tffaccod_to ;
   private int AV37TFFacCod_To ;
   private int AV62Facturacion_tfacdivwwds_6_tfclicod ;
   private int AV38TFCliCod ;
   private int AV63Facturacion_tfacdivwwds_7_tfclicod_to ;
   private int AV39TFCliCod_To ;
   private int AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ;
   private int AV77GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A3096FacDivTCod ;
   private String A3116FacDivAbr ;
   private String A3119FacRepCod ;
   private String A3120FacRepNom ;
   private String A407EmprNom ;
   private String AV58Facturacion_tfacdivwwds_2_tfemprcod ;
   private String AV34TFEmprCod ;
   private String AV59Facturacion_tfacdivwwds_3_tfemprcod_sel ;
   private String AV35TFEmprCod_Sel ;
   private String AV64Facturacion_tfacdivwwds_8_tfclinom ;
   private String AV40TFCliNom ;
   private String AV65Facturacion_tfacdivwwds_9_tfclinom_sel ;
   private String AV41TFCliNom_Sel ;
   private String AV69Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String AV46TFFacDivAbr ;
   private String AV70Facturacion_tfacdivwwds_14_tffacdivabr_sel ;
   private String AV47TFFacDivAbr_Sel ;
   private String AV71Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String AV48TFFacRepCod ;
   private String AV72Facturacion_tfacdivwwds_16_tffacrepcod_sel ;
   private String AV49TFFacRepCod_Sel ;
   private String AV73Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String AV50TFFacRepNom ;
   private String AV74Facturacion_tfacdivwwds_18_tffacrepnom_sel ;
   private String AV51TFFacRepNom_Sel ;
   private String AV75Facturacion_tfacdivwwds_19_tfemprnom ;
   private String AV52TFEmprNom ;
   private String AV76Facturacion_tfacdivwwds_20_tfemprnom_sel ;
   private String AV53TFEmprNom_Sel ;
   private String scmdbuf ;
   private String lV58Facturacion_tfacdivwwds_2_tfemprcod ;
   private String lV64Facturacion_tfacdivwwds_8_tfclinom ;
   private String lV69Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String lV71Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String lV73Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String lV75Facturacion_tfacdivwwds_19_tfemprnom ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n407EmprNom ;
   private boolean n3120FacRepNom ;
   private boolean n3119FacRepCod ;
   private boolean n3116FacDivAbr ;
   private boolean n3115FacDivCod ;
   private boolean n3096FacDivTCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV42TFFacDivTCod_SelsJson ;
   private String AV11Filename ;
   private String AV57Facturacion_tfacdivwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV57Facturacion_tfacdivwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0AVW2_A407EmprNom ;
   private boolean[] P0AVW2_n407EmprNom ;
   private String[] P0AVW2_A3120FacRepNom ;
   private boolean[] P0AVW2_n3120FacRepNom ;
   private String[] P0AVW2_A3119FacRepCod ;
   private boolean[] P0AVW2_n3119FacRepCod ;
   private String[] P0AVW2_A3116FacDivAbr ;
   private boolean[] P0AVW2_n3116FacDivAbr ;
   private byte[] P0AVW2_A3115FacDivCod ;
   private boolean[] P0AVW2_n3115FacDivCod ;
   private String[] P0AVW2_A279CliNom ;
   private int[] P0AVW2_A252CliCod ;
   private int[] P0AVW2_A430FacCod ;
   private String[] P0AVW2_A396EmprCod ;
   private String[] P0AVW2_A3096FacDivTCod ;
   private boolean[] P0AVW2_n3096FacDivTCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels ;
   private GXSimpleCollection<String> AV43TFFacDivTCod_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class tfacdivwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AVW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV59Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV58Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV60Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV61Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV62Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV63Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV65Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV64Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV67Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV68Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV70Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV69Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV72Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV71Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV74Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV73Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV76Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV75Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV57Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.EmprNom, T4.RepNom AS FacRepNom, T1.FacRepCod AS FacRepCod, T2.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T5.CliNom, T1.CliCod, T1.FacCod, T1.EmprCod," ;
      scmdbuf += " T1.FacDivTCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV59Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV60Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV62Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV63Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV66Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV67Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV68Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV69Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV73Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
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
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DivAbr" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DivAbr DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacRepCod" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacRepCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.RepNom" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.RepNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.EmprNom" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.EmprNom DESC" ;
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
                  return conditional_P0AVW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 34);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
      }
   }

}

