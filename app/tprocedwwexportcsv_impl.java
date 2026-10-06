package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprocedwwexportcsv_impl extends GXWebProcedure
{
   public tprocedwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TPROCEDWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPROCEDWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TPROCEDWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Domicilio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Población", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Provincia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Postal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Teléfono", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Teléfono", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Telex", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Persona Contacto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Email", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nif", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Postal (PT)", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV85Tprocedwwds_1_filterfulltext = AV79FilterFullText ;
      AV86Tprocedwwds_2_tfprocenom = AV74TFProceNom ;
      AV87Tprocedwwds_3_tfprocenom_sel = AV75TFProceNom_Sel ;
      AV88Tprocedwwds_4_tfprocecod = AV50TFProceCod ;
      AV89Tprocedwwds_5_tfprocecod_to = AV51TFProceCod_To ;
      AV90Tprocedwwds_6_tfprocedom = AV54TFProceDom ;
      AV91Tprocedwwds_7_tfprocedom_sel = AV55TFProceDom_Sel ;
      AV92Tprocedwwds_8_tfprocepob = AV56TFProcePob ;
      AV93Tprocedwwds_9_tfprocepob_sel = AV57TFProcePob_Sel ;
      AV94Tprocedwwds_10_tfprvcod = AV58TFPrvCod ;
      AV95Tprocedwwds_11_tfprvcod_to = AV59TFPrvCod_To ;
      AV96Tprocedwwds_12_tfprvdsc = AV60TFPrvDsc ;
      AV97Tprocedwwds_13_tfprvdsc_sel = AV61TFPrvDsc_Sel ;
      AV98Tprocedwwds_14_tfpocecp = AV62TFPoceCp ;
      AV99Tprocedwwds_15_tfpocecp_sel = AV63TFPoceCp_Sel ;
      AV100Tprocedwwds_16_tfprocetel1 = AV64TFProceTel1 ;
      AV101Tprocedwwds_17_tfprocetel1_sel = AV65TFProceTel1_Sel ;
      AV102Tprocedwwds_18_tfprocetel2 = AV66TFProceTel2 ;
      AV103Tprocedwwds_19_tfprocetel2_sel = AV67TFProceTel2_Sel ;
      AV104Tprocedwwds_20_tfprocetelex = AV68TFProceTelex ;
      AV105Tprocedwwds_21_tfprocetelex_sel = AV69TFProceTelex_Sel ;
      AV106Tprocedwwds_22_tfpropers = AV70TFProPers ;
      AV107Tprocedwwds_23_tfpropers_sel = AV71TFProPers_Sel ;
      AV108Tprocedwwds_24_tfproemail = AV72TFProEmail ;
      AV109Tprocedwwds_25_tfproemail_sel = AV73TFProEmail_Sel ;
      AV110Tprocedwwds_26_tfprocenif = AV52TFProceNif ;
      AV111Tprocedwwds_27_tfprocenif_sel = AV53TFProceNif_Sel ;
      AV112Tprocedwwds_28_tfpocecp2 = AV80TFPoceCp2 ;
      AV113Tprocedwwds_29_tfpocecp2_sel = AV81TFPoceCp2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV85Tprocedwwds_1_filterfulltext ,
                                           AV87Tprocedwwds_3_tfprocenom_sel ,
                                           AV86Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV88Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV89Tprocedwwds_5_tfprocecod_to) ,
                                           AV91Tprocedwwds_7_tfprocedom_sel ,
                                           AV90Tprocedwwds_6_tfprocedom ,
                                           AV93Tprocedwwds_9_tfprocepob_sel ,
                                           AV92Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV94Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV95Tprocedwwds_11_tfprvcod_to) ,
                                           AV97Tprocedwwds_13_tfprvdsc_sel ,
                                           AV96Tprocedwwds_12_tfprvdsc ,
                                           AV99Tprocedwwds_15_tfpocecp_sel ,
                                           AV98Tprocedwwds_14_tfpocecp ,
                                           AV101Tprocedwwds_17_tfprocetel1_sel ,
                                           AV100Tprocedwwds_16_tfprocetel1 ,
                                           AV103Tprocedwwds_19_tfprocetel2_sel ,
                                           AV102Tprocedwwds_18_tfprocetel2 ,
                                           AV105Tprocedwwds_21_tfprocetelex_sel ,
                                           AV104Tprocedwwds_20_tfprocetelex ,
                                           AV107Tprocedwwds_23_tfpropers_sel ,
                                           AV106Tprocedwwds_22_tfpropers ,
                                           AV109Tprocedwwds_25_tfproemail_sel ,
                                           AV108Tprocedwwds_24_tfproemail ,
                                           AV111Tprocedwwds_27_tfprocenif_sel ,
                                           AV110Tprocedwwds_26_tfprocenif ,
                                           AV113Tprocedwwds_29_tfpocecp2_sel ,
                                           AV112Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV85Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Tprocedwwds_1_filterfulltext), "%", "") ;
      lV86Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV86Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV90Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV90Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV92Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV92Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV96Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV96Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV98Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV98Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV100Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV100Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV102Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV102Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV104Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV104Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV106Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV106Tprocedwwds_22_tfpropers), 40, "%") ;
      lV108Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV108Tprocedwwds_24_tfproemail), 40, "%") ;
      lV110Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV110Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV112Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV112Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084J2 */
      pr_default.execute(0, new Object[] {lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV85Tprocedwwds_1_filterfulltext, lV86Tprocedwwds_2_tfprocenom, AV87Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV88Tprocedwwds_4_tfprocecod), Short.valueOf(AV89Tprocedwwds_5_tfprocecod_to), lV90Tprocedwwds_6_tfprocedom, AV91Tprocedwwds_7_tfprocedom_sel, lV92Tprocedwwds_8_tfprocepob, AV93Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV94Tprocedwwds_10_tfprvcod), Short.valueOf(AV95Tprocedwwds_11_tfprvcod_to), lV96Tprocedwwds_12_tfprvdsc, AV97Tprocedwwds_13_tfprvdsc_sel, lV98Tprocedwwds_14_tfpocecp, AV99Tprocedwwds_15_tfpocecp_sel, lV100Tprocedwwds_16_tfprocetel1, AV101Tprocedwwds_17_tfprocetel1_sel, lV102Tprocedwwds_18_tfprocetel2, AV103Tprocedwwds_19_tfprocetel2_sel, lV104Tprocedwwds_20_tfprocetelex, AV105Tprocedwwds_21_tfprocetelex_sel, lV106Tprocedwwds_22_tfpropers, AV107Tprocedwwds_23_tfpropers_sel, lV108Tprocedwwds_24_tfproemail, AV109Tprocedwwds_25_tfproemail_sel, lV110Tprocedwwds_26_tfprocenif, AV111Tprocedwwds_27_tfprocenif_sel, lV112Tprocedwwds_28_tfpocecp2, AV113Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14029PoceCp2 = P084J2_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084J2_n14029PoceCp2[0] ;
         A993ProceNif = P084J2_A993ProceNif[0] ;
         n993ProceNif = P084J2_n993ProceNif[0] ;
         A10391ProEmail = P084J2_A10391ProEmail[0] ;
         n10391ProEmail = P084J2_n10391ProEmail[0] ;
         A10390ProPers = P084J2_A10390ProPers[0] ;
         n10390ProPers = P084J2_n10390ProPers[0] ;
         A992ProceTelex = P084J2_A992ProceTelex[0] ;
         n992ProceTelex = P084J2_n992ProceTelex[0] ;
         A991ProceTel2 = P084J2_A991ProceTel2[0] ;
         n991ProceTel2 = P084J2_n991ProceTel2[0] ;
         A990ProceTel1 = P084J2_A990ProceTel1[0] ;
         n990ProceTel1 = P084J2_n990ProceTel1[0] ;
         A989PoceCp = P084J2_A989PoceCp[0] ;
         n989PoceCp = P084J2_n989PoceCp[0] ;
         A787PrvDsc = P084J2_A787PrvDsc[0] ;
         n787PrvDsc = P084J2_n787PrvDsc[0] ;
         A781PrvCod = P084J2_A781PrvCod[0] ;
         n781PrvCod = P084J2_n781PrvCod[0] ;
         A988ProcePob = P084J2_A988ProcePob[0] ;
         n988ProcePob = P084J2_n988ProcePob[0] ;
         A994ProceDom = P084J2_A994ProceDom[0] ;
         n994ProceDom = P084J2_n994ProceDom[0] ;
         A970ProceCod = P084J2_A970ProceCod[0] ;
         A971ProceNom = P084J2_A971ProceNom[0] ;
         n971ProceNom = P084J2_n971ProceNom[0] ;
         A396EmprCod = P084J2_A396EmprCod[0] ;
         A787PrvDsc = P084J2_A787PrvDsc[0] ;
         n787PrvDsc = P084J2_n787PrvDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A971ProceNom, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A970ProceCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A994ProceDom, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A988ProcePob, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A781PrvCod, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A787PrvDsc, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A989PoceCp, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A990ProceTel1, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A991ProceTel2, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A992ProceTelex, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10390ProPers, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10391ProEmail, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A993ProceNif, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14029PoceCp2, ";", ","), GXv_char3) ;
            tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TPROCEDWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceCod", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceDom", "", "Domicilio", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProcePob", "", "Población", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvCod", "", "Codigo", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvDsc", "", "Provincia", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PoceCp", "", "Código Postal", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceTel1", "", "Teléfono", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceTel2", "", "Teléfono", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceTelex", "", "Telex", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProPers", "", "Persona Contacto", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProEmail", "", "Email", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceNif", "", "Nif", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PoceCp2", "", "Postal (PT)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPROCEDWWColumnsSelector", GXv_char3) ;
      tprocedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPROCEDWWGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPROCEDWWGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("TPROCEDWWGridState"), null, null);
      }
      AV28OrderedBy = AV46GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV46GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV79FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV74TFProceNom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV75TFProceNom_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV50TFProceCod = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFProceCod_To = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM") == 0 )
         {
            AV54TFProceDom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM_SEL") == 0 )
         {
            AV55TFProceDom_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB") == 0 )
         {
            AV56TFProcePob = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB_SEL") == 0 )
         {
            AV57TFProcePob_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV58TFPrvCod = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFPrvCod_To = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV60TFPrvDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV61TFPrvDsc_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP") == 0 )
         {
            AV62TFPoceCp = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP_SEL") == 0 )
         {
            AV63TFPoceCp_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1") == 0 )
         {
            AV64TFProceTel1 = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1_SEL") == 0 )
         {
            AV65TFProceTel1_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2") == 0 )
         {
            AV66TFProceTel2 = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2_SEL") == 0 )
         {
            AV67TFProceTel2_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX") == 0 )
         {
            AV68TFProceTelex = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX_SEL") == 0 )
         {
            AV69TFProceTelex_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS") == 0 )
         {
            AV70TFProPers = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS_SEL") == 0 )
         {
            AV71TFProPers_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL") == 0 )
         {
            AV72TFProEmail = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL_SEL") == 0 )
         {
            AV73TFProEmail_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF") == 0 )
         {
            AV52TFProceNif = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF_SEL") == 0 )
         {
            AV53TFProceNif_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2") == 0 )
         {
            AV80TFPoceCp2 = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2_SEL") == 0 )
         {
            AV81TFPoceCp2_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
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
      A971ProceNom = "" ;
      A994ProceDom = "" ;
      A988ProcePob = "" ;
      A787PrvDsc = "" ;
      A989PoceCp = "" ;
      A990ProceTel1 = "" ;
      A991ProceTel2 = "" ;
      A992ProceTelex = "" ;
      A10390ProPers = "" ;
      A10391ProEmail = "" ;
      A993ProceNif = "" ;
      A14029PoceCp2 = "" ;
      AV85Tprocedwwds_1_filterfulltext = "" ;
      AV79FilterFullText = "" ;
      AV86Tprocedwwds_2_tfprocenom = "" ;
      AV74TFProceNom = "" ;
      AV87Tprocedwwds_3_tfprocenom_sel = "" ;
      AV75TFProceNom_Sel = "" ;
      AV90Tprocedwwds_6_tfprocedom = "" ;
      AV54TFProceDom = "" ;
      AV91Tprocedwwds_7_tfprocedom_sel = "" ;
      AV55TFProceDom_Sel = "" ;
      AV92Tprocedwwds_8_tfprocepob = "" ;
      AV56TFProcePob = "" ;
      AV93Tprocedwwds_9_tfprocepob_sel = "" ;
      AV57TFProcePob_Sel = "" ;
      AV96Tprocedwwds_12_tfprvdsc = "" ;
      AV60TFPrvDsc = "" ;
      AV97Tprocedwwds_13_tfprvdsc_sel = "" ;
      AV61TFPrvDsc_Sel = "" ;
      AV98Tprocedwwds_14_tfpocecp = "" ;
      AV62TFPoceCp = "" ;
      AV99Tprocedwwds_15_tfpocecp_sel = "" ;
      AV63TFPoceCp_Sel = "" ;
      AV100Tprocedwwds_16_tfprocetel1 = "" ;
      AV64TFProceTel1 = "" ;
      AV101Tprocedwwds_17_tfprocetel1_sel = "" ;
      AV65TFProceTel1_Sel = "" ;
      AV102Tprocedwwds_18_tfprocetel2 = "" ;
      AV66TFProceTel2 = "" ;
      AV103Tprocedwwds_19_tfprocetel2_sel = "" ;
      AV67TFProceTel2_Sel = "" ;
      AV104Tprocedwwds_20_tfprocetelex = "" ;
      AV68TFProceTelex = "" ;
      AV105Tprocedwwds_21_tfprocetelex_sel = "" ;
      AV69TFProceTelex_Sel = "" ;
      AV106Tprocedwwds_22_tfpropers = "" ;
      AV70TFProPers = "" ;
      AV107Tprocedwwds_23_tfpropers_sel = "" ;
      AV71TFProPers_Sel = "" ;
      AV108Tprocedwwds_24_tfproemail = "" ;
      AV72TFProEmail = "" ;
      AV109Tprocedwwds_25_tfproemail_sel = "" ;
      AV73TFProEmail_Sel = "" ;
      AV110Tprocedwwds_26_tfprocenif = "" ;
      AV52TFProceNif = "" ;
      AV111Tprocedwwds_27_tfprocenif_sel = "" ;
      AV53TFProceNif_Sel = "" ;
      AV112Tprocedwwds_28_tfpocecp2 = "" ;
      AV80TFPoceCp2 = "" ;
      AV113Tprocedwwds_29_tfpocecp2_sel = "" ;
      AV81TFPoceCp2_Sel = "" ;
      scmdbuf = "" ;
      lV85Tprocedwwds_1_filterfulltext = "" ;
      lV86Tprocedwwds_2_tfprocenom = "" ;
      lV90Tprocedwwds_6_tfprocedom = "" ;
      lV92Tprocedwwds_8_tfprocepob = "" ;
      lV96Tprocedwwds_12_tfprvdsc = "" ;
      lV98Tprocedwwds_14_tfpocecp = "" ;
      lV100Tprocedwwds_16_tfprocetel1 = "" ;
      lV102Tprocedwwds_18_tfprocetel2 = "" ;
      lV104Tprocedwwds_20_tfprocetelex = "" ;
      lV106Tprocedwwds_22_tfpropers = "" ;
      lV108Tprocedwwds_24_tfproemail = "" ;
      lV110Tprocedwwds_26_tfprocenif = "" ;
      lV112Tprocedwwds_28_tfpocecp2 = "" ;
      P084J2_A14029PoceCp2 = new String[] {""} ;
      P084J2_n14029PoceCp2 = new boolean[] {false} ;
      P084J2_A993ProceNif = new String[] {""} ;
      P084J2_n993ProceNif = new boolean[] {false} ;
      P084J2_A10391ProEmail = new String[] {""} ;
      P084J2_n10391ProEmail = new boolean[] {false} ;
      P084J2_A10390ProPers = new String[] {""} ;
      P084J2_n10390ProPers = new boolean[] {false} ;
      P084J2_A992ProceTelex = new String[] {""} ;
      P084J2_n992ProceTelex = new boolean[] {false} ;
      P084J2_A991ProceTel2 = new String[] {""} ;
      P084J2_n991ProceTel2 = new boolean[] {false} ;
      P084J2_A990ProceTel1 = new String[] {""} ;
      P084J2_n990ProceTel1 = new boolean[] {false} ;
      P084J2_A989PoceCp = new String[] {""} ;
      P084J2_n989PoceCp = new boolean[] {false} ;
      P084J2_A787PrvDsc = new String[] {""} ;
      P084J2_n787PrvDsc = new boolean[] {false} ;
      P084J2_A781PrvCod = new short[1] ;
      P084J2_n781PrvCod = new boolean[] {false} ;
      P084J2_A988ProcePob = new String[] {""} ;
      P084J2_n988ProcePob = new boolean[] {false} ;
      P084J2_A994ProceDom = new String[] {""} ;
      P084J2_n994ProceDom = new boolean[] {false} ;
      P084J2_A970ProceCod = new short[1] ;
      P084J2_A971ProceNom = new String[] {""} ;
      P084J2_n971ProceNom = new boolean[] {false} ;
      P084J2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprocedwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P084J2_A14029PoceCp2, P084J2_n14029PoceCp2, P084J2_A993ProceNif, P084J2_n993ProceNif, P084J2_A10391ProEmail, P084J2_n10391ProEmail, P084J2_A10390ProPers, P084J2_n10390ProPers, P084J2_A992ProceTelex, P084J2_n992ProceTelex,
            P084J2_A991ProceTel2, P084J2_n991ProceTel2, P084J2_A990ProceTel1, P084J2_n990ProceTel1, P084J2_A989PoceCp, P084J2_n989PoceCp, P084J2_A787PrvDsc, P084J2_n787PrvDsc, P084J2_A781PrvCod, P084J2_n781PrvCod,
            P084J2_A988ProcePob, P084J2_n988ProcePob, P084J2_A994ProceDom, P084J2_n994ProceDom, P084J2_A970ProceCod, P084J2_A971ProceNom, P084J2_n971ProceNom, P084J2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A970ProceCod ;
   private short A781PrvCod ;
   private short AV88Tprocedwwds_4_tfprocecod ;
   private short AV50TFProceCod ;
   private short AV89Tprocedwwds_5_tfprocecod_to ;
   private short AV51TFProceCod_To ;
   private short AV94Tprocedwwds_10_tfprvcod ;
   private short AV58TFPrvCod ;
   private short AV95Tprocedwwds_11_tfprvcod_to ;
   private short AV59TFPrvCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV114GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A971ProceNom ;
   private String A994ProceDom ;
   private String A988ProcePob ;
   private String A787PrvDsc ;
   private String A989PoceCp ;
   private String A990ProceTel1 ;
   private String A991ProceTel2 ;
   private String A992ProceTelex ;
   private String A10390ProPers ;
   private String A10391ProEmail ;
   private String A993ProceNif ;
   private String A14029PoceCp2 ;
   private String AV86Tprocedwwds_2_tfprocenom ;
   private String AV74TFProceNom ;
   private String AV87Tprocedwwds_3_tfprocenom_sel ;
   private String AV75TFProceNom_Sel ;
   private String AV90Tprocedwwds_6_tfprocedom ;
   private String AV54TFProceDom ;
   private String AV91Tprocedwwds_7_tfprocedom_sel ;
   private String AV55TFProceDom_Sel ;
   private String AV92Tprocedwwds_8_tfprocepob ;
   private String AV56TFProcePob ;
   private String AV93Tprocedwwds_9_tfprocepob_sel ;
   private String AV57TFProcePob_Sel ;
   private String AV96Tprocedwwds_12_tfprvdsc ;
   private String AV60TFPrvDsc ;
   private String AV97Tprocedwwds_13_tfprvdsc_sel ;
   private String AV61TFPrvDsc_Sel ;
   private String AV98Tprocedwwds_14_tfpocecp ;
   private String AV62TFPoceCp ;
   private String AV99Tprocedwwds_15_tfpocecp_sel ;
   private String AV63TFPoceCp_Sel ;
   private String AV100Tprocedwwds_16_tfprocetel1 ;
   private String AV64TFProceTel1 ;
   private String AV101Tprocedwwds_17_tfprocetel1_sel ;
   private String AV65TFProceTel1_Sel ;
   private String AV102Tprocedwwds_18_tfprocetel2 ;
   private String AV66TFProceTel2 ;
   private String AV103Tprocedwwds_19_tfprocetel2_sel ;
   private String AV67TFProceTel2_Sel ;
   private String AV104Tprocedwwds_20_tfprocetelex ;
   private String AV68TFProceTelex ;
   private String AV105Tprocedwwds_21_tfprocetelex_sel ;
   private String AV69TFProceTelex_Sel ;
   private String AV106Tprocedwwds_22_tfpropers ;
   private String AV70TFProPers ;
   private String AV107Tprocedwwds_23_tfpropers_sel ;
   private String AV71TFProPers_Sel ;
   private String AV108Tprocedwwds_24_tfproemail ;
   private String AV72TFProEmail ;
   private String AV109Tprocedwwds_25_tfproemail_sel ;
   private String AV73TFProEmail_Sel ;
   private String AV110Tprocedwwds_26_tfprocenif ;
   private String AV52TFProceNif ;
   private String AV111Tprocedwwds_27_tfprocenif_sel ;
   private String AV53TFProceNif_Sel ;
   private String AV112Tprocedwwds_28_tfpocecp2 ;
   private String AV80TFPoceCp2 ;
   private String AV113Tprocedwwds_29_tfpocecp2_sel ;
   private String AV81TFPoceCp2_Sel ;
   private String scmdbuf ;
   private String lV86Tprocedwwds_2_tfprocenom ;
   private String lV90Tprocedwwds_6_tfprocedom ;
   private String lV92Tprocedwwds_8_tfprocepob ;
   private String lV96Tprocedwwds_12_tfprvdsc ;
   private String lV98Tprocedwwds_14_tfpocecp ;
   private String lV100Tprocedwwds_16_tfprocetel1 ;
   private String lV102Tprocedwwds_18_tfprocetel2 ;
   private String lV104Tprocedwwds_20_tfprocetelex ;
   private String lV106Tprocedwwds_22_tfpropers ;
   private String lV108Tprocedwwds_24_tfproemail ;
   private String lV110Tprocedwwds_26_tfprocenif ;
   private String lV112Tprocedwwds_28_tfpocecp2 ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n14029PoceCp2 ;
   private boolean n993ProceNif ;
   private boolean n10391ProEmail ;
   private boolean n10390ProPers ;
   private boolean n992ProceTelex ;
   private boolean n991ProceTel2 ;
   private boolean n990ProceTel1 ;
   private boolean n989PoceCp ;
   private boolean n787PrvDsc ;
   private boolean n781PrvCod ;
   private boolean n988ProcePob ;
   private boolean n994ProceDom ;
   private boolean n971ProceNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV85Tprocedwwds_1_filterfulltext ;
   private String AV79FilterFullText ;
   private String lV85Tprocedwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P084J2_A14029PoceCp2 ;
   private boolean[] P084J2_n14029PoceCp2 ;
   private String[] P084J2_A993ProceNif ;
   private boolean[] P084J2_n993ProceNif ;
   private String[] P084J2_A10391ProEmail ;
   private boolean[] P084J2_n10391ProEmail ;
   private String[] P084J2_A10390ProPers ;
   private boolean[] P084J2_n10390ProPers ;
   private String[] P084J2_A992ProceTelex ;
   private boolean[] P084J2_n992ProceTelex ;
   private String[] P084J2_A991ProceTel2 ;
   private boolean[] P084J2_n991ProceTel2 ;
   private String[] P084J2_A990ProceTel1 ;
   private boolean[] P084J2_n990ProceTel1 ;
   private String[] P084J2_A989PoceCp ;
   private boolean[] P084J2_n989PoceCp ;
   private String[] P084J2_A787PrvDsc ;
   private boolean[] P084J2_n787PrvDsc ;
   private short[] P084J2_A781PrvCod ;
   private boolean[] P084J2_n781PrvCod ;
   private String[] P084J2_A988ProcePob ;
   private boolean[] P084J2_n988ProcePob ;
   private String[] P084J2_A994ProceDom ;
   private boolean[] P084J2_n994ProceDom ;
   private short[] P084J2_A970ProceCod ;
   private String[] P084J2_A971ProceNom ;
   private boolean[] P084J2_n971ProceNom ;
   private String[] P084J2_A396EmprCod ;
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

final  class tprocedwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P084J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV85Tprocedwwds_1_filterfulltext ,
                                          String AV87Tprocedwwds_3_tfprocenom_sel ,
                                          String AV86Tprocedwwds_2_tfprocenom ,
                                          short AV88Tprocedwwds_4_tfprocecod ,
                                          short AV89Tprocedwwds_5_tfprocecod_to ,
                                          String AV91Tprocedwwds_7_tfprocedom_sel ,
                                          String AV90Tprocedwwds_6_tfprocedom ,
                                          String AV93Tprocedwwds_9_tfprocepob_sel ,
                                          String AV92Tprocedwwds_8_tfprocepob ,
                                          short AV94Tprocedwwds_10_tfprvcod ,
                                          short AV95Tprocedwwds_11_tfprvcod_to ,
                                          String AV97Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV96Tprocedwwds_12_tfprvdsc ,
                                          String AV99Tprocedwwds_15_tfpocecp_sel ,
                                          String AV98Tprocedwwds_14_tfpocecp ,
                                          String AV101Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV100Tprocedwwds_16_tfprocetel1 ,
                                          String AV103Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV102Tprocedwwds_18_tfprocetel2 ,
                                          String AV105Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV104Tprocedwwds_20_tfprocetelex ,
                                          String AV107Tprocedwwds_23_tfpropers_sel ,
                                          String AV106Tprocedwwds_22_tfpropers ,
                                          String AV109Tprocedwwds_25_tfproemail_sel ,
                                          String AV108Tprocedwwds_24_tfproemail ,
                                          String AV111Tprocedwwds_27_tfprocenif_sel ,
                                          String AV110Tprocedwwds_26_tfprocenif ,
                                          String AV113Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV112Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[42];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV85Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV86Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV88Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV90Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV92Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV106Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV108Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV112Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceDom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceDom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProcePob" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProcePob DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PoceCp" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PoceCp DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceTel1" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceTel1 DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceTel2" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceTel2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceTelex" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceTelex DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProPers" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProPers DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProEmail" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProEmail DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceNif" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceNif DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PoceCp2" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PoceCp2 DESC" ;
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
                  return conditional_P084J2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
      }
   }

}

