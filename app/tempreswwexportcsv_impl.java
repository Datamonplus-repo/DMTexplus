package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tempreswwexportcsv_impl extends GXWebProcedure
{
   public tempreswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TEMPRESWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TEMPRESWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TEMPRESWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dirección", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Postal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Población", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "CIF", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Teléfono", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fax", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo IVA", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion IVA", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "IVA General", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV102Tempreswwds_1_filterfulltext = AV98FilterFullText ;
      AV103Tempreswwds_2_tfemprcod = AV48TFEmprCod ;
      AV104Tempreswwds_3_tfemprcod_sel = AV49TFEmprCod_Sel ;
      AV105Tempreswwds_4_tfemprnom = AV50TFEmprNom ;
      AV106Tempreswwds_5_tfemprnom_sel = AV51TFEmprNom_Sel ;
      AV107Tempreswwds_6_tfemprdir = AV52TFEmprDir ;
      AV108Tempreswwds_7_tfemprdir_sel = AV53TFEmprDir_Sel ;
      AV109Tempreswwds_8_tfemprcpo = AV54TFEmprCpo ;
      AV110Tempreswwds_9_tfemprcpo_sel = AV55TFEmprCpo_Sel ;
      AV111Tempreswwds_10_tfemprpob = AV56TFEmprPob ;
      AV112Tempreswwds_11_tfemprpob_sel = AV57TFEmprPob_Sel ;
      AV113Tempreswwds_12_tfemprcif = AV58TFEmprCif ;
      AV114Tempreswwds_13_tfemprcif_sel = AV59TFEmprCif_Sel ;
      AV115Tempreswwds_14_tfemprtel = AV60TFEmprTel ;
      AV116Tempreswwds_15_tfemprtel_sel = AV61TFEmprTel_Sel ;
      AV117Tempreswwds_16_tfemprfax = AV62TFEmprFax ;
      AV118Tempreswwds_17_tfemprfax_sel = AV63TFEmprFax_Sel ;
      AV119Tempreswwds_18_tfivacod = AV64TFIvaCod ;
      AV120Tempreswwds_19_tfivacod_sel = AV65TFIvaCod_Sel ;
      AV121Tempreswwds_20_tfivadsc = AV66TFIvaDsc ;
      AV122Tempreswwds_21_tfivadsc_sel = AV67TFIvaDsc_Sel ;
      AV123Tempreswwds_22_tfivapor = AV68TFIvaPor ;
      AV124Tempreswwds_23_tfivapor_to = AV69TFIvaPor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV102Tempreswwds_1_filterfulltext ,
                                           AV104Tempreswwds_3_tfemprcod_sel ,
                                           AV103Tempreswwds_2_tfemprcod ,
                                           AV106Tempreswwds_5_tfemprnom_sel ,
                                           AV105Tempreswwds_4_tfemprnom ,
                                           AV108Tempreswwds_7_tfemprdir_sel ,
                                           AV107Tempreswwds_6_tfemprdir ,
                                           AV110Tempreswwds_9_tfemprcpo_sel ,
                                           AV109Tempreswwds_8_tfemprcpo ,
                                           AV112Tempreswwds_11_tfemprpob_sel ,
                                           AV111Tempreswwds_10_tfemprpob ,
                                           AV114Tempreswwds_13_tfemprcif_sel ,
                                           AV113Tempreswwds_12_tfemprcif ,
                                           AV116Tempreswwds_15_tfemprtel_sel ,
                                           AV115Tempreswwds_14_tfemprtel ,
                                           AV118Tempreswwds_17_tfemprfax_sel ,
                                           AV117Tempreswwds_16_tfemprfax ,
                                           AV120Tempreswwds_19_tfivacod_sel ,
                                           AV119Tempreswwds_18_tfivacod ,
                                           AV122Tempreswwds_21_tfivadsc_sel ,
                                           AV121Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV123Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV124Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV102Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Tempreswwds_1_filterfulltext), "%", "") ;
      lV103Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Tempreswwds_2_tfemprcod), 3, "%") ;
      lV105Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV105Tempreswwds_4_tfemprnom), 30, "%") ;
      lV107Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV107Tempreswwds_6_tfemprdir), 35, "%") ;
      lV109Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV109Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV111Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV111Tempreswwds_10_tfemprpob), 35, "%") ;
      lV113Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV113Tempreswwds_12_tfemprcif), 15, "%") ;
      lV115Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV115Tempreswwds_14_tfemprtel), 15, "%") ;
      lV117Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV117Tempreswwds_16_tfemprfax), 15, "%") ;
      lV119Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV119Tempreswwds_18_tfivacod), 3, "%") ;
      lV121Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV121Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OZ2 */
      pr_default.execute(0, new Object[] {lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV102Tempreswwds_1_filterfulltext, lV103Tempreswwds_2_tfemprcod, AV104Tempreswwds_3_tfemprcod_sel, lV105Tempreswwds_4_tfemprnom, AV106Tempreswwds_5_tfemprnom_sel, lV107Tempreswwds_6_tfemprdir, AV108Tempreswwds_7_tfemprdir_sel, lV109Tempreswwds_8_tfemprcpo, AV110Tempreswwds_9_tfemprcpo_sel, lV111Tempreswwds_10_tfemprpob, AV112Tempreswwds_11_tfemprpob_sel, lV113Tempreswwds_12_tfemprcif, AV114Tempreswwds_13_tfemprcif_sel, lV115Tempreswwds_14_tfemprtel, AV116Tempreswwds_15_tfemprtel_sel, lV117Tempreswwds_16_tfemprfax, AV118Tempreswwds_17_tfemprfax_sel, lV119Tempreswwds_18_tfivacod, AV120Tempreswwds_19_tfivacod_sel, lV121Tempreswwds_20_tfivadsc, AV122Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV123Tempreswwds_22_tfivapor), Byte.valueOf(AV124Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A588IvaPor = P08OZ2_A588IvaPor[0] ;
         n588IvaPor = P08OZ2_n588IvaPor[0] ;
         A954IvaDsc = P08OZ2_A954IvaDsc[0] ;
         n954IvaDsc = P08OZ2_n954IvaDsc[0] ;
         A953IvaCod = P08OZ2_A953IvaCod[0] ;
         n953IvaCod = P08OZ2_n953IvaCod[0] ;
         A405EmprFax = P08OZ2_A405EmprFax[0] ;
         n405EmprFax = P08OZ2_n405EmprFax[0] ;
         A409EmprTel = P08OZ2_A409EmprTel[0] ;
         n409EmprTel = P08OZ2_n409EmprTel[0] ;
         A395EmprCif = P08OZ2_A395EmprCif[0] ;
         n395EmprCif = P08OZ2_n395EmprCif[0] ;
         A408EmprPob = P08OZ2_A408EmprPob[0] ;
         n408EmprPob = P08OZ2_n408EmprPob[0] ;
         A403EmprCpo = P08OZ2_A403EmprCpo[0] ;
         n403EmprCpo = P08OZ2_n403EmprCpo[0] ;
         A404EmprDir = P08OZ2_A404EmprDir[0] ;
         n404EmprDir = P08OZ2_n404EmprDir[0] ;
         A407EmprNom = P08OZ2_A407EmprNom[0] ;
         n407EmprNom = P08OZ2_n407EmprNom[0] ;
         A396EmprCod = P08OZ2_A396EmprCod[0] ;
         A588IvaPor = P08OZ2_A588IvaPor[0] ;
         n588IvaPor = P08OZ2_n588IvaPor[0] ;
         A954IvaDsc = P08OZ2_A954IvaDsc[0] ;
         n954IvaDsc = P08OZ2_n954IvaDsc[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A407EmprNom, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A404EmprDir, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A403EmprCpo, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A408EmprPob, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A395EmprCif, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A409EmprTel, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A405EmprFax, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A953IvaCod, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A954IvaDsc, ";", ","), GXv_char3) ;
            tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A588IvaPor, 2, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TEMPRESWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprDir", "", "Dirección", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCpo", "", "Código Postal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprPob", "", "Población", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCif", "", "CIF", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprTel", "", "Teléfono", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprFax", "", "Fax", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IvaCod", "", "Codigo IVA", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IvaDsc", "", "Descripcion IVA", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IvaPor", "", "IVA General", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TEMPRESWWColumnsSelector", GXv_char3) ;
      tempreswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TEMPRESWWGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TEMPRESWWGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("TEMPRESWWGridState"), null, null);
      }
      AV28OrderedBy = AV46GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV46GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV125GXV1 = 1 ;
      while ( AV125GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV125GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV98FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV48TFEmprCod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV49TFEmprCod_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV50TFEmprNom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV51TFEmprNom_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR") == 0 )
         {
            AV52TFEmprDir = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR_SEL") == 0 )
         {
            AV53TFEmprDir_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO") == 0 )
         {
            AV54TFEmprCpo = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO_SEL") == 0 )
         {
            AV55TFEmprCpo_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB") == 0 )
         {
            AV56TFEmprPob = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB_SEL") == 0 )
         {
            AV57TFEmprPob_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF") == 0 )
         {
            AV58TFEmprCif = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF_SEL") == 0 )
         {
            AV59TFEmprCif_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL") == 0 )
         {
            AV60TFEmprTel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL_SEL") == 0 )
         {
            AV61TFEmprTel_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX") == 0 )
         {
            AV62TFEmprFax = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX_SEL") == 0 )
         {
            AV63TFEmprFax_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD") == 0 )
         {
            AV64TFIvaCod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD_SEL") == 0 )
         {
            AV65TFIvaCod_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC") == 0 )
         {
            AV66TFIvaDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC_SEL") == 0 )
         {
            AV67TFIvaDsc_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVAPOR") == 0 )
         {
            AV68TFIvaPor = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFIvaPor_To = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV125GXV1 = (int)(AV125GXV1+1) ;
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
      A404EmprDir = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      A395EmprCif = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A953IvaCod = "" ;
      A954IvaDsc = "" ;
      AV102Tempreswwds_1_filterfulltext = "" ;
      AV98FilterFullText = "" ;
      AV103Tempreswwds_2_tfemprcod = "" ;
      AV48TFEmprCod = "" ;
      AV104Tempreswwds_3_tfemprcod_sel = "" ;
      AV49TFEmprCod_Sel = "" ;
      AV105Tempreswwds_4_tfemprnom = "" ;
      AV50TFEmprNom = "" ;
      AV106Tempreswwds_5_tfemprnom_sel = "" ;
      AV51TFEmprNom_Sel = "" ;
      AV107Tempreswwds_6_tfemprdir = "" ;
      AV52TFEmprDir = "" ;
      AV108Tempreswwds_7_tfemprdir_sel = "" ;
      AV53TFEmprDir_Sel = "" ;
      AV109Tempreswwds_8_tfemprcpo = "" ;
      AV54TFEmprCpo = "" ;
      AV110Tempreswwds_9_tfemprcpo_sel = "" ;
      AV55TFEmprCpo_Sel = "" ;
      AV111Tempreswwds_10_tfemprpob = "" ;
      AV56TFEmprPob = "" ;
      AV112Tempreswwds_11_tfemprpob_sel = "" ;
      AV57TFEmprPob_Sel = "" ;
      AV113Tempreswwds_12_tfemprcif = "" ;
      AV58TFEmprCif = "" ;
      AV114Tempreswwds_13_tfemprcif_sel = "" ;
      AV59TFEmprCif_Sel = "" ;
      AV115Tempreswwds_14_tfemprtel = "" ;
      AV60TFEmprTel = "" ;
      AV116Tempreswwds_15_tfemprtel_sel = "" ;
      AV61TFEmprTel_Sel = "" ;
      AV117Tempreswwds_16_tfemprfax = "" ;
      AV62TFEmprFax = "" ;
      AV118Tempreswwds_17_tfemprfax_sel = "" ;
      AV63TFEmprFax_Sel = "" ;
      AV119Tempreswwds_18_tfivacod = "" ;
      AV64TFIvaCod = "" ;
      AV120Tempreswwds_19_tfivacod_sel = "" ;
      AV65TFIvaCod_Sel = "" ;
      AV121Tempreswwds_20_tfivadsc = "" ;
      AV66TFIvaDsc = "" ;
      AV122Tempreswwds_21_tfivadsc_sel = "" ;
      AV67TFIvaDsc_Sel = "" ;
      scmdbuf = "" ;
      lV102Tempreswwds_1_filterfulltext = "" ;
      lV103Tempreswwds_2_tfemprcod = "" ;
      lV105Tempreswwds_4_tfemprnom = "" ;
      lV107Tempreswwds_6_tfemprdir = "" ;
      lV109Tempreswwds_8_tfemprcpo = "" ;
      lV111Tempreswwds_10_tfemprpob = "" ;
      lV113Tempreswwds_12_tfemprcif = "" ;
      lV115Tempreswwds_14_tfemprtel = "" ;
      lV117Tempreswwds_16_tfemprfax = "" ;
      lV119Tempreswwds_18_tfivacod = "" ;
      lV121Tempreswwds_20_tfivadsc = "" ;
      P08OZ2_A588IvaPor = new byte[1] ;
      P08OZ2_n588IvaPor = new boolean[] {false} ;
      P08OZ2_A954IvaDsc = new String[] {""} ;
      P08OZ2_n954IvaDsc = new boolean[] {false} ;
      P08OZ2_A953IvaCod = new String[] {""} ;
      P08OZ2_n953IvaCod = new boolean[] {false} ;
      P08OZ2_A405EmprFax = new String[] {""} ;
      P08OZ2_n405EmprFax = new boolean[] {false} ;
      P08OZ2_A409EmprTel = new String[] {""} ;
      P08OZ2_n409EmprTel = new boolean[] {false} ;
      P08OZ2_A395EmprCif = new String[] {""} ;
      P08OZ2_n395EmprCif = new boolean[] {false} ;
      P08OZ2_A408EmprPob = new String[] {""} ;
      P08OZ2_n408EmprPob = new boolean[] {false} ;
      P08OZ2_A403EmprCpo = new String[] {""} ;
      P08OZ2_n403EmprCpo = new boolean[] {false} ;
      P08OZ2_A404EmprDir = new String[] {""} ;
      P08OZ2_n404EmprDir = new boolean[] {false} ;
      P08OZ2_A407EmprNom = new String[] {""} ;
      P08OZ2_n407EmprNom = new boolean[] {false} ;
      P08OZ2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tempreswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08OZ2_A588IvaPor, P08OZ2_n588IvaPor, P08OZ2_A954IvaDsc, P08OZ2_n954IvaDsc, P08OZ2_A953IvaCod, P08OZ2_n953IvaCod, P08OZ2_A405EmprFax, P08OZ2_n405EmprFax, P08OZ2_A409EmprTel, P08OZ2_n409EmprTel,
            P08OZ2_A395EmprCif, P08OZ2_n395EmprCif, P08OZ2_A408EmprPob, P08OZ2_n408EmprPob, P08OZ2_A403EmprCpo, P08OZ2_n403EmprCpo, P08OZ2_A404EmprDir, P08OZ2_n404EmprDir, P08OZ2_A407EmprNom, P08OZ2_n407EmprNom,
            P08OZ2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A588IvaPor ;
   private byte AV123Tempreswwds_22_tfivapor ;
   private byte AV68TFIvaPor ;
   private byte AV124Tempreswwds_23_tfivapor_to ;
   private byte AV69TFIvaPor_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV125GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A403EmprCpo ;
   private String A408EmprPob ;
   private String A395EmprCif ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A953IvaCod ;
   private String A954IvaDsc ;
   private String AV103Tempreswwds_2_tfemprcod ;
   private String AV48TFEmprCod ;
   private String AV104Tempreswwds_3_tfemprcod_sel ;
   private String AV49TFEmprCod_Sel ;
   private String AV105Tempreswwds_4_tfemprnom ;
   private String AV50TFEmprNom ;
   private String AV106Tempreswwds_5_tfemprnom_sel ;
   private String AV51TFEmprNom_Sel ;
   private String AV107Tempreswwds_6_tfemprdir ;
   private String AV52TFEmprDir ;
   private String AV108Tempreswwds_7_tfemprdir_sel ;
   private String AV53TFEmprDir_Sel ;
   private String AV109Tempreswwds_8_tfemprcpo ;
   private String AV54TFEmprCpo ;
   private String AV110Tempreswwds_9_tfemprcpo_sel ;
   private String AV55TFEmprCpo_Sel ;
   private String AV111Tempreswwds_10_tfemprpob ;
   private String AV56TFEmprPob ;
   private String AV112Tempreswwds_11_tfemprpob_sel ;
   private String AV57TFEmprPob_Sel ;
   private String AV113Tempreswwds_12_tfemprcif ;
   private String AV58TFEmprCif ;
   private String AV114Tempreswwds_13_tfemprcif_sel ;
   private String AV59TFEmprCif_Sel ;
   private String AV115Tempreswwds_14_tfemprtel ;
   private String AV60TFEmprTel ;
   private String AV116Tempreswwds_15_tfemprtel_sel ;
   private String AV61TFEmprTel_Sel ;
   private String AV117Tempreswwds_16_tfemprfax ;
   private String AV62TFEmprFax ;
   private String AV118Tempreswwds_17_tfemprfax_sel ;
   private String AV63TFEmprFax_Sel ;
   private String AV119Tempreswwds_18_tfivacod ;
   private String AV64TFIvaCod ;
   private String AV120Tempreswwds_19_tfivacod_sel ;
   private String AV65TFIvaCod_Sel ;
   private String AV121Tempreswwds_20_tfivadsc ;
   private String AV66TFIvaDsc ;
   private String AV122Tempreswwds_21_tfivadsc_sel ;
   private String AV67TFIvaDsc_Sel ;
   private String scmdbuf ;
   private String lV103Tempreswwds_2_tfemprcod ;
   private String lV105Tempreswwds_4_tfemprnom ;
   private String lV107Tempreswwds_6_tfemprdir ;
   private String lV109Tempreswwds_8_tfemprcpo ;
   private String lV111Tempreswwds_10_tfemprpob ;
   private String lV113Tempreswwds_12_tfemprcif ;
   private String lV115Tempreswwds_14_tfemprtel ;
   private String lV117Tempreswwds_16_tfemprfax ;
   private String lV119Tempreswwds_18_tfivacod ;
   private String lV121Tempreswwds_20_tfivadsc ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n588IvaPor ;
   private boolean n954IvaDsc ;
   private boolean n953IvaCod ;
   private boolean n405EmprFax ;
   private boolean n409EmprTel ;
   private boolean n395EmprCif ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n404EmprDir ;
   private boolean n407EmprNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV102Tempreswwds_1_filterfulltext ;
   private String AV98FilterFullText ;
   private String lV102Tempreswwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P08OZ2_A588IvaPor ;
   private boolean[] P08OZ2_n588IvaPor ;
   private String[] P08OZ2_A954IvaDsc ;
   private boolean[] P08OZ2_n954IvaDsc ;
   private String[] P08OZ2_A953IvaCod ;
   private boolean[] P08OZ2_n953IvaCod ;
   private String[] P08OZ2_A405EmprFax ;
   private boolean[] P08OZ2_n405EmprFax ;
   private String[] P08OZ2_A409EmprTel ;
   private boolean[] P08OZ2_n409EmprTel ;
   private String[] P08OZ2_A395EmprCif ;
   private boolean[] P08OZ2_n395EmprCif ;
   private String[] P08OZ2_A408EmprPob ;
   private boolean[] P08OZ2_n408EmprPob ;
   private String[] P08OZ2_A403EmprCpo ;
   private boolean[] P08OZ2_n403EmprCpo ;
   private String[] P08OZ2_A404EmprDir ;
   private boolean[] P08OZ2_n404EmprDir ;
   private String[] P08OZ2_A407EmprNom ;
   private boolean[] P08OZ2_n407EmprNom ;
   private String[] P08OZ2_A396EmprCod ;
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

final  class tempreswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08OZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV102Tempreswwds_1_filterfulltext ,
                                          String AV104Tempreswwds_3_tfemprcod_sel ,
                                          String AV103Tempreswwds_2_tfemprcod ,
                                          String AV106Tempreswwds_5_tfemprnom_sel ,
                                          String AV105Tempreswwds_4_tfemprnom ,
                                          String AV108Tempreswwds_7_tfemprdir_sel ,
                                          String AV107Tempreswwds_6_tfemprdir ,
                                          String AV110Tempreswwds_9_tfemprcpo_sel ,
                                          String AV109Tempreswwds_8_tfemprcpo ,
                                          String AV112Tempreswwds_11_tfemprpob_sel ,
                                          String AV111Tempreswwds_10_tfemprpob ,
                                          String AV114Tempreswwds_13_tfemprcif_sel ,
                                          String AV113Tempreswwds_12_tfemprcif ,
                                          String AV116Tempreswwds_15_tfemprtel_sel ,
                                          String AV115Tempreswwds_14_tfemprtel ,
                                          String AV118Tempreswwds_17_tfemprfax_sel ,
                                          String AV117Tempreswwds_16_tfemprfax ,
                                          String AV120Tempreswwds_19_tfivacod_sel ,
                                          String AV119Tempreswwds_18_tfivacod ,
                                          String AV122Tempreswwds_21_tfivadsc_sel ,
                                          String AV121Tempreswwds_20_tfivadsc ,
                                          byte AV123Tempreswwds_22_tfivapor ,
                                          byte AV124Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV102Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV104Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV105Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV107Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV109Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV111Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV113Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV115Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV117Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV119Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV123Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV124Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprNom DESC" ;
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
         scmdbuf += " ORDER BY T1.EmprDir" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprDir DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCpo" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCpo DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprPob" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprPob DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCif" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCif DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprTel" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprTel DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprFax" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprFax DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IvaCod" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IvaCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IvaDsc" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IvaDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IvaPor" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IvaPor DESC" ;
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
                  return conditional_P08OZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
      }
   }

}

