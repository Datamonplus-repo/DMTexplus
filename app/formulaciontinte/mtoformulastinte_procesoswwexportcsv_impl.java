package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mtoformulastinte_procesoswwexportcsv_impl extends GXWebProcedure
{
   public mtoformulastinte_procesoswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "MtoFormulasTinte_ProcesosWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.MtoFormulasTinte_ProcesosWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.MtoFormulasTinte_ProcesosWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ultima linea", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = AV30FilterFullText ;
      AV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = AV34TFEmprCod ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = AV36TFEmprNom ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = AV37TFEmprNom_Sel ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod = AV38TFCliCod ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to = AV39TFCliCod_To ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = AV40TFCliNom ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = AV41TFCliNom_Sel ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = AV42TFForSer ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = AV43TFForSer_Sel ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = AV44TFForSerDsc ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = AV45TFForSerDsc_Sel ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = AV46TFForColNom ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = AV47TFForColNom_Sel ;
      AV72Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum = AV48TFForColNum ;
      AV73Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to = AV49TFForColNum_To ;
      AV74Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod = AV50TFTipColCod ;
      AV75Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to = AV51TFTipColCod_To ;
      AV76Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin = AV52TFForUltLin ;
      AV77Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to = AV53TFForUltLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                           AV59Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                           AV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                           AV61Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                           AV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                           Integer.valueOf(AV62Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV63Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) ,
                                           AV65Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                           AV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                           AV67Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                           AV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                           AV69Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                           AV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                           AV71Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                           AV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                           Integer.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) ,
                                           Integer.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV74Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV75Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) ,
                                           Short.valueOf(AV76Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) ,
                                           Short.valueOf(AV77Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Short.valueOf(A1159ForUltLin) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod), 3, "%") ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom), 30, "%") ;
      lV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom), 30, "%") ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser), 16, "%") ;
      lV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc), 26, "%") ;
      lV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom), 13, "%") ;
      /* Using cursor P095G2 */
      pr_default.execute(0, new Object[] {lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod, AV59Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel, lV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom, AV61Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel, Integer.valueOf(AV62Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod), Integer.valueOf(AV63Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to), lV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom, AV65Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel, lV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser, AV67Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel, lV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc, AV69Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel, lV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom, AV71Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel, Integer.valueOf(AV72Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum), Integer.valueOf(AV73Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to), Byte.valueOf(AV74Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod), Byte.valueOf(AV75Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to), Short.valueOf(AV76Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin), Short.valueOf(AV77Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1159ForUltLin = P095G2_A1159ForUltLin[0] ;
         n1159ForUltLin = P095G2_n1159ForUltLin[0] ;
         A831TipColCod = P095G2_A831TipColCod[0] ;
         A483ForColNum = P095G2_A483ForColNum[0] ;
         A482ForColNom = P095G2_A482ForColNom[0] ;
         A5742ForSerDsc = P095G2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095G2_n5742ForSerDsc[0] ;
         A494ForSer = P095G2_A494ForSer[0] ;
         A279CliNom = P095G2_A279CliNom[0] ;
         A252CliCod = P095G2_A252CliCod[0] ;
         A407EmprNom = P095G2_A407EmprNom[0] ;
         n407EmprNom = P095G2_n407EmprNom[0] ;
         A396EmprCod = P095G2_A396EmprCod[0] ;
         A407EmprNom = P095G2_A407EmprNom[0] ;
         n407EmprNom = P095G2_n407EmprNom[0] ;
         A279CliNom = P095G2_A279CliNom[0] ;
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
            mtoformulastinte_procesoswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A407EmprNom, ";", ","), GXv_char3) ;
            mtoformulastinte_procesoswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            mtoformulastinte_procesoswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A494ForSer, ";", ","), GXv_char3) ;
            mtoformulastinte_procesoswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5742ForSerDsc, ";", ","), GXv_char3) ;
            mtoformulastinte_procesoswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A482ForColNom, ";", ","), GXv_char3) ;
            mtoformulastinte_procesoswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A483ForColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A831TipColCod, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1159ForUltLin, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=MtoFormulasTinte_ProcesosWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSer", "", "Codigo Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSerDsc", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColCod", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForUltLin", "", "Ultima linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.MtoFormulasTinte_ProcesosWWColumnsSelector", GXv_char3) ;
      mtoformulastinte_procesoswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.MtoFormulasTinte_ProcesosWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.MtoFormulasTinte_ProcesosWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FormulacionTinte.MtoFormulasTinte_ProcesosWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
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
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV36TFEmprNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV37TFEmprNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV42TFForSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV43TFForSer_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV44TFForSerDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV45TFForSerDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV46TFForColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV47TFForColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV48TFForColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFForColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV50TFTipColCod = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFTipColCod_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTLIN") == 0 )
         {
            AV52TFForUltLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFForUltLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
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
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = "" ;
      AV34TFEmprCod = "" ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = "" ;
      AV35TFEmprCod_Sel = "" ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = "" ;
      AV36TFEmprNom = "" ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = "" ;
      AV37TFEmprNom_Sel = "" ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = "" ;
      AV40TFCliNom = "" ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = "" ;
      AV41TFCliNom_Sel = "" ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = "" ;
      AV42TFForSer = "" ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = "" ;
      AV43TFForSer_Sel = "" ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = "" ;
      AV44TFForSerDsc = "" ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = "" ;
      AV45TFForSerDsc_Sel = "" ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = "" ;
      AV46TFForColNom = "" ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = "" ;
      AV47TFForColNom_Sel = "" ;
      scmdbuf = "" ;
      lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = "" ;
      lV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = "" ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = "" ;
      lV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = "" ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = "" ;
      lV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = "" ;
      lV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = "" ;
      P095G2_A1159ForUltLin = new short[1] ;
      P095G2_n1159ForUltLin = new boolean[] {false} ;
      P095G2_A831TipColCod = new byte[1] ;
      P095G2_A483ForColNum = new int[1] ;
      P095G2_A482ForColNom = new String[] {""} ;
      P095G2_A5742ForSerDsc = new String[] {""} ;
      P095G2_n5742ForSerDsc = new boolean[] {false} ;
      P095G2_A494ForSer = new String[] {""} ;
      P095G2_A279CliNom = new String[] {""} ;
      P095G2_A252CliCod = new int[1] ;
      P095G2_A407EmprNom = new String[] {""} ;
      P095G2_n407EmprNom = new boolean[] {false} ;
      P095G2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinte_procesoswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P095G2_A1159ForUltLin, P095G2_n1159ForUltLin, P095G2_A831TipColCod, P095G2_A483ForColNum, P095G2_A482ForColNom, P095G2_A5742ForSerDsc, P095G2_n5742ForSerDsc, P095G2_A494ForSer, P095G2_A279CliNom, P095G2_A252CliCod,
            P095G2_A407EmprNom, P095G2_n407EmprNom, P095G2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV74Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ;
   private byte AV50TFTipColCod ;
   private byte AV75Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ;
   private byte AV51TFTipColCod_To ;
   private short gxcookieaux ;
   private short A1159ForUltLin ;
   private short AV76Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ;
   private short AV52TFForUltLin ;
   private short AV77Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ;
   private short AV53TFForUltLin_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV62Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ;
   private int AV38TFCliCod ;
   private int AV63Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ;
   private int AV39TFCliCod_To ;
   private int AV72Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ;
   private int AV48TFForColNum ;
   private int AV73Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ;
   private int AV49TFForColNum_To ;
   private int AV78GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String AV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ;
   private String AV34TFEmprCod ;
   private String AV59Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ;
   private String AV35TFEmprCod_Sel ;
   private String AV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ;
   private String AV36TFEmprNom ;
   private String AV61Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ;
   private String AV37TFEmprNom_Sel ;
   private String AV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ;
   private String AV40TFCliNom ;
   private String AV65Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ;
   private String AV41TFCliNom_Sel ;
   private String AV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ;
   private String AV42TFForSer ;
   private String AV67Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ;
   private String AV43TFForSer_Sel ;
   private String AV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ;
   private String AV44TFForSerDsc ;
   private String AV69Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ;
   private String AV45TFForSerDsc_Sel ;
   private String AV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ;
   private String AV46TFForColNom ;
   private String AV71Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ;
   private String AV47TFForColNom_Sel ;
   private String scmdbuf ;
   private String lV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ;
   private String lV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ;
   private String lV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ;
   private String lV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ;
   private String lV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ;
   private String lV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n1159ForUltLin ;
   private boolean n5742ForSerDsc ;
   private boolean n407EmprNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P095G2_A1159ForUltLin ;
   private boolean[] P095G2_n1159ForUltLin ;
   private byte[] P095G2_A831TipColCod ;
   private int[] P095G2_A483ForColNum ;
   private String[] P095G2_A482ForColNom ;
   private String[] P095G2_A5742ForSerDsc ;
   private boolean[] P095G2_n5742ForSerDsc ;
   private String[] P095G2_A494ForSer ;
   private String[] P095G2_A279CliNom ;
   private int[] P095G2_A252CliCod ;
   private String[] P095G2_A407EmprNom ;
   private boolean[] P095G2_n407EmprNom ;
   private String[] P095G2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class mtoformulastinte_procesoswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                          String AV59Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                          String AV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                          String AV61Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                          String AV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                          int AV62Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ,
                                          int AV63Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ,
                                          String AV65Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                          String AV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                          String AV67Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                          String AV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                          String AV69Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                          String AV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                          String AV71Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                          String AV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                          int AV72Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ,
                                          int AV73Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ,
                                          byte AV74Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ,
                                          byte AV75Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ,
                                          short AV76Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ,
                                          short AV77Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short A1159ForUltLin ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForUltLin, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod, T2.EmprNom, T1.EmprCod FROM ((TXPCFORMU T1 INNER JOIN" ;
      scmdbuf += " TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForUltLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) )
      {
         addWhere(sWhereString, "(T1.ForUltLin >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) )
      {
         addWhere(sWhereString, "(T1.ForUltLin <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
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
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
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
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltLin" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltLin DESC" ;
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
                  return conditional_P095G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               return;
      }
   }

}

