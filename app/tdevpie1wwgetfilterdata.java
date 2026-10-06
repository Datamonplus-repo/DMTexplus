package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdevpie1wwgetfilterdata extends GXProcedure
{
   public tdevpie1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpie1wwgetfilterdata.class ), "" );
   }

   public tdevpie1wwgetfilterdata( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      tdevpie1wwgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      tdevpie1wwgetfilterdata.this.AV30DDOName = aP0;
      tdevpie1wwgetfilterdata.this.AV28SearchTxt = aP1;
      tdevpie1wwgetfilterdata.this.AV29SearchTxtTo = aP2;
      tdevpie1wwgetfilterdata.this.aP3 = aP3;
      tdevpie1wwgetfilterdata.this.aP4 = aP4;
      tdevpie1wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_DEVTRNNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVTRNNOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_EMPRTRN") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRTRNOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("TDevPie1WWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDevPie1WWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("TDevPie1WWGridState"), null, null);
      }
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV67FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENCOD") == 0 )
         {
            AV10TFDevGenCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDevGenCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENFEC") == 0 )
         {
            AV12TFDevGenFec = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV14TFAlbRecCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFAlbRecCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV18TFAlbRef = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV19TFAlbRef_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM") == 0 )
         {
            AV20TFDevTrnNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM_SEL") == 0 )
         {
            AV21TFDevTrnNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENUNI") == 0 )
         {
            AV22TFDevGenUni = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFDevGenUni_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV63TFAlbRUni_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV64TFAlbRUni_Sels.fromJSonString(AV63TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENPIE") == 0 )
         {
            AV26TFDevGenPie = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFDevGenPie_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTRN") == 0 )
         {
            AV65TFEmprTrn = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTRN_SEL") == 0 )
         {
            AV66TFEmprTrn_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV28SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV72Tdevpie1wwds_1_filterfulltext = AV67FilterFullText ;
      AV73Tdevpie1wwds_2_tfdevgencod = AV10TFDevGenCod ;
      AV74Tdevpie1wwds_3_tfdevgencod_to = AV11TFDevGenCod_To ;
      AV75Tdevpie1wwds_4_tfdevgenfec = AV12TFDevGenFec ;
      AV76Tdevpie1wwds_5_tfalbreccod = AV14TFAlbRecCod ;
      AV77Tdevpie1wwds_6_tfalbreccod_to = AV15TFAlbRecCod_To ;
      AV78Tdevpie1wwds_7_tfclinom = AV16TFCliNom ;
      AV79Tdevpie1wwds_8_tfclinom_sel = AV17TFCliNom_Sel ;
      AV80Tdevpie1wwds_9_tfalbref = AV18TFAlbRef ;
      AV81Tdevpie1wwds_10_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV82Tdevpie1wwds_11_tfdevtrnnom = AV20TFDevTrnNom ;
      AV83Tdevpie1wwds_12_tfdevtrnnom_sel = AV21TFDevTrnNom_Sel ;
      AV84Tdevpie1wwds_13_tfdevgenuni = AV22TFDevGenUni ;
      AV85Tdevpie1wwds_14_tfdevgenuni_to = AV23TFDevGenUni_To ;
      AV86Tdevpie1wwds_15_tfalbruni_sels = AV64TFAlbRUni_Sels ;
      AV87Tdevpie1wwds_16_tfdevgenpie = AV26TFDevGenPie ;
      AV88Tdevpie1wwds_17_tfdevgenpie_to = AV27TFDevGenPie_To ;
      AV89Tdevpie1wwds_18_tfemprtrn = AV65TFEmprTrn ;
      AV90Tdevpie1wwds_19_tfemprtrn_sel = AV66TFEmprTrn_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV86Tdevpie1wwds_15_tfalbruni_sels ,
                                           Integer.valueOf(AV73Tdevpie1wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV74Tdevpie1wwds_3_tfdevgencod_to) ,
                                           AV75Tdevpie1wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV76Tdevpie1wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV77Tdevpie1wwds_6_tfalbreccod_to) ,
                                           AV79Tdevpie1wwds_8_tfclinom_sel ,
                                           AV78Tdevpie1wwds_7_tfclinom ,
                                           AV81Tdevpie1wwds_10_tfalbref_sel ,
                                           AV80Tdevpie1wwds_9_tfalbref ,
                                           AV83Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                           AV82Tdevpie1wwds_11_tfdevtrnnom ,
                                           AV84Tdevpie1wwds_13_tfdevgenuni ,
                                           AV85Tdevpie1wwds_14_tfdevgenuni_to ,
                                           Integer.valueOf(AV86Tdevpie1wwds_15_tfalbruni_sels.size()) ,
                                           Short.valueOf(AV87Tdevpie1wwds_16_tfdevgenpie) ,
                                           Short.valueOf(AV88Tdevpie1wwds_17_tfdevgenpie_to) ,
                                           AV90Tdevpie1wwds_19_tfemprtrn_sel ,
                                           AV89Tdevpie1wwds_18_tfemprtrn ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A329DevTrnNom ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           A410EmprTrn ,
                                           AV72Tdevpie1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tdevpie1wwds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV78Tdevpie1wwds_7_tfclinom), 30, "%") ;
      lV80Tdevpie1wwds_9_tfalbref = GXutil.padr( GXutil.rtrim( AV80Tdevpie1wwds_9_tfalbref), 16, "%") ;
      lV82Tdevpie1wwds_11_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV82Tdevpie1wwds_11_tfdevtrnnom), 30, "%") ;
      lV89Tdevpie1wwds_18_tfemprtrn = GXutil.padr( GXutil.rtrim( AV89Tdevpie1wwds_18_tfemprtrn), 3, "%") ;
      /* Using cursor P086H2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV73Tdevpie1wwds_2_tfdevgencod), Integer.valueOf(AV74Tdevpie1wwds_3_tfdevgencod_to), AV75Tdevpie1wwds_4_tfdevgenfec, Integer.valueOf(AV76Tdevpie1wwds_5_tfalbreccod), Integer.valueOf(AV77Tdevpie1wwds_6_tfalbreccod_to), lV78Tdevpie1wwds_7_tfclinom, AV79Tdevpie1wwds_8_tfclinom_sel, lV80Tdevpie1wwds_9_tfalbref, AV81Tdevpie1wwds_10_tfalbref_sel, lV82Tdevpie1wwds_11_tfdevtrnnom, AV83Tdevpie1wwds_12_tfdevtrnnom_sel, AV84Tdevpie1wwds_13_tfdevgenuni, AV85Tdevpie1wwds_14_tfdevgenuni_to, Short.valueOf(AV87Tdevpie1wwds_16_tfdevgenpie), Short.valueOf(AV88Tdevpie1wwds_17_tfdevgenpie_to), lV89Tdevpie1wwds_18_tfemprtrn, AV90Tdevpie1wwds_19_tfemprtrn_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk86H2 = false ;
         A396EmprCod = P086H2_A396EmprCod[0] ;
         A252CliCod = P086H2_A252CliCod[0] ;
         n252CliCod = P086H2_n252CliCod[0] ;
         A327DevGenTrn = P086H2_A327DevGenTrn[0] ;
         n327DevGenTrn = P086H2_n327DevGenTrn[0] ;
         A279CliNom = P086H2_A279CliNom[0] ;
         A410EmprTrn = P086H2_A410EmprTrn[0] ;
         n410EmprTrn = P086H2_n410EmprTrn[0] ;
         A326DevGenPie = P086H2_A326DevGenPie[0] ;
         n326DevGenPie = P086H2_n326DevGenPie[0] ;
         A328DevGenUni = P086H2_A328DevGenUni[0] ;
         n328DevGenUni = P086H2_n328DevGenUni[0] ;
         A329DevTrnNom = P086H2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086H2_n329DevTrnNom[0] ;
         A45AlbRef = P086H2_A45AlbRef[0] ;
         A44AlbRecCod = P086H2_A44AlbRecCod[0] ;
         n44AlbRecCod = P086H2_n44AlbRecCod[0] ;
         A325DevGenFec = P086H2_A325DevGenFec[0] ;
         n325DevGenFec = P086H2_n325DevGenFec[0] ;
         A323DevGenCod = P086H2_A323DevGenCod[0] ;
         A56AlbRUni = P086H2_A56AlbRUni[0] ;
         A279CliNom = P086H2_A279CliNom[0] ;
         A329DevTrnNom = P086H2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086H2_n329DevTrnNom[0] ;
         A45AlbRef = P086H2_A45AlbRef[0] ;
         A56AlbRUni = P086H2_A56AlbRUni[0] ;
         if ( (GXutil.strcmp("", AV72Tdevpie1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A410EmprTrn) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV40count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P086H2_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk86H2 = false ;
               A396EmprCod = P086H2_A396EmprCod[0] ;
               A252CliCod = P086H2_A252CliCod[0] ;
               n252CliCod = P086H2_n252CliCod[0] ;
               A323DevGenCod = P086H2_A323DevGenCod[0] ;
               AV40count = (long)(AV40count+1) ;
               brk86H2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV32Option = A279CliNom ;
               AV33Options.add(AV32Option, 0);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV33Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86H2 )
         {
            brk86H2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV18TFAlbRef = AV28SearchTxt ;
      AV19TFAlbRef_Sel = "" ;
      AV72Tdevpie1wwds_1_filterfulltext = AV67FilterFullText ;
      AV73Tdevpie1wwds_2_tfdevgencod = AV10TFDevGenCod ;
      AV74Tdevpie1wwds_3_tfdevgencod_to = AV11TFDevGenCod_To ;
      AV75Tdevpie1wwds_4_tfdevgenfec = AV12TFDevGenFec ;
      AV76Tdevpie1wwds_5_tfalbreccod = AV14TFAlbRecCod ;
      AV77Tdevpie1wwds_6_tfalbreccod_to = AV15TFAlbRecCod_To ;
      AV78Tdevpie1wwds_7_tfclinom = AV16TFCliNom ;
      AV79Tdevpie1wwds_8_tfclinom_sel = AV17TFCliNom_Sel ;
      AV80Tdevpie1wwds_9_tfalbref = AV18TFAlbRef ;
      AV81Tdevpie1wwds_10_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV82Tdevpie1wwds_11_tfdevtrnnom = AV20TFDevTrnNom ;
      AV83Tdevpie1wwds_12_tfdevtrnnom_sel = AV21TFDevTrnNom_Sel ;
      AV84Tdevpie1wwds_13_tfdevgenuni = AV22TFDevGenUni ;
      AV85Tdevpie1wwds_14_tfdevgenuni_to = AV23TFDevGenUni_To ;
      AV86Tdevpie1wwds_15_tfalbruni_sels = AV64TFAlbRUni_Sels ;
      AV87Tdevpie1wwds_16_tfdevgenpie = AV26TFDevGenPie ;
      AV88Tdevpie1wwds_17_tfdevgenpie_to = AV27TFDevGenPie_To ;
      AV89Tdevpie1wwds_18_tfemprtrn = AV65TFEmprTrn ;
      AV90Tdevpie1wwds_19_tfemprtrn_sel = AV66TFEmprTrn_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV86Tdevpie1wwds_15_tfalbruni_sels ,
                                           Integer.valueOf(AV73Tdevpie1wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV74Tdevpie1wwds_3_tfdevgencod_to) ,
                                           AV75Tdevpie1wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV76Tdevpie1wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV77Tdevpie1wwds_6_tfalbreccod_to) ,
                                           AV79Tdevpie1wwds_8_tfclinom_sel ,
                                           AV78Tdevpie1wwds_7_tfclinom ,
                                           AV81Tdevpie1wwds_10_tfalbref_sel ,
                                           AV80Tdevpie1wwds_9_tfalbref ,
                                           AV83Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                           AV82Tdevpie1wwds_11_tfdevtrnnom ,
                                           AV84Tdevpie1wwds_13_tfdevgenuni ,
                                           AV85Tdevpie1wwds_14_tfdevgenuni_to ,
                                           Integer.valueOf(AV86Tdevpie1wwds_15_tfalbruni_sels.size()) ,
                                           Short.valueOf(AV87Tdevpie1wwds_16_tfdevgenpie) ,
                                           Short.valueOf(AV88Tdevpie1wwds_17_tfdevgenpie_to) ,
                                           AV90Tdevpie1wwds_19_tfemprtrn_sel ,
                                           AV89Tdevpie1wwds_18_tfemprtrn ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A329DevTrnNom ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           A410EmprTrn ,
                                           AV72Tdevpie1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tdevpie1wwds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV78Tdevpie1wwds_7_tfclinom), 30, "%") ;
      lV80Tdevpie1wwds_9_tfalbref = GXutil.padr( GXutil.rtrim( AV80Tdevpie1wwds_9_tfalbref), 16, "%") ;
      lV82Tdevpie1wwds_11_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV82Tdevpie1wwds_11_tfdevtrnnom), 30, "%") ;
      lV89Tdevpie1wwds_18_tfemprtrn = GXutil.padr( GXutil.rtrim( AV89Tdevpie1wwds_18_tfemprtrn), 3, "%") ;
      /* Using cursor P086H3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV73Tdevpie1wwds_2_tfdevgencod), Integer.valueOf(AV74Tdevpie1wwds_3_tfdevgencod_to), AV75Tdevpie1wwds_4_tfdevgenfec, Integer.valueOf(AV76Tdevpie1wwds_5_tfalbreccod), Integer.valueOf(AV77Tdevpie1wwds_6_tfalbreccod_to), lV78Tdevpie1wwds_7_tfclinom, AV79Tdevpie1wwds_8_tfclinom_sel, lV80Tdevpie1wwds_9_tfalbref, AV81Tdevpie1wwds_10_tfalbref_sel, lV82Tdevpie1wwds_11_tfdevtrnnom, AV83Tdevpie1wwds_12_tfdevtrnnom_sel, AV84Tdevpie1wwds_13_tfdevgenuni, AV85Tdevpie1wwds_14_tfdevgenuni_to, Short.valueOf(AV87Tdevpie1wwds_16_tfdevgenpie), Short.valueOf(AV88Tdevpie1wwds_17_tfdevgenpie_to), lV89Tdevpie1wwds_18_tfemprtrn, AV90Tdevpie1wwds_19_tfemprtrn_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk86H4 = false ;
         A252CliCod = P086H3_A252CliCod[0] ;
         n252CliCod = P086H3_n252CliCod[0] ;
         A327DevGenTrn = P086H3_A327DevGenTrn[0] ;
         n327DevGenTrn = P086H3_n327DevGenTrn[0] ;
         A44AlbRecCod = P086H3_A44AlbRecCod[0] ;
         n44AlbRecCod = P086H3_n44AlbRecCod[0] ;
         A396EmprCod = P086H3_A396EmprCod[0] ;
         A410EmprTrn = P086H3_A410EmprTrn[0] ;
         n410EmprTrn = P086H3_n410EmprTrn[0] ;
         A326DevGenPie = P086H3_A326DevGenPie[0] ;
         n326DevGenPie = P086H3_n326DevGenPie[0] ;
         A328DevGenUni = P086H3_A328DevGenUni[0] ;
         n328DevGenUni = P086H3_n328DevGenUni[0] ;
         A329DevTrnNom = P086H3_A329DevTrnNom[0] ;
         n329DevTrnNom = P086H3_n329DevTrnNom[0] ;
         A45AlbRef = P086H3_A45AlbRef[0] ;
         A279CliNom = P086H3_A279CliNom[0] ;
         A325DevGenFec = P086H3_A325DevGenFec[0] ;
         n325DevGenFec = P086H3_n325DevGenFec[0] ;
         A323DevGenCod = P086H3_A323DevGenCod[0] ;
         A56AlbRUni = P086H3_A56AlbRUni[0] ;
         A45AlbRef = P086H3_A45AlbRef[0] ;
         A56AlbRUni = P086H3_A56AlbRUni[0] ;
         A279CliNom = P086H3_A279CliNom[0] ;
         A329DevTrnNom = P086H3_A329DevTrnNom[0] ;
         n329DevTrnNom = P086H3_n329DevTrnNom[0] ;
         if ( (GXutil.strcmp("", AV72Tdevpie1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A410EmprTrn) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV40count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P086H3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P086H3_A44AlbRecCod[0] == A44AlbRecCod ) )
            {
               brk86H4 = false ;
               A323DevGenCod = P086H3_A323DevGenCod[0] ;
               AV40count = (long)(AV40count+1) ;
               brk86H4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
            {
               AV32Option = A45AlbRef ;
               AV31InsertIndex = 1 ;
               while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
               {
                  AV31InsertIndex = (int)(AV31InsertIndex+1) ;
               }
               AV33Options.add(AV32Option, AV31InsertIndex);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
            }
            if ( AV33Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86H4 )
         {
            brk86H4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDEVTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFDevTrnNom = AV28SearchTxt ;
      AV21TFDevTrnNom_Sel = "" ;
      AV72Tdevpie1wwds_1_filterfulltext = AV67FilterFullText ;
      AV73Tdevpie1wwds_2_tfdevgencod = AV10TFDevGenCod ;
      AV74Tdevpie1wwds_3_tfdevgencod_to = AV11TFDevGenCod_To ;
      AV75Tdevpie1wwds_4_tfdevgenfec = AV12TFDevGenFec ;
      AV76Tdevpie1wwds_5_tfalbreccod = AV14TFAlbRecCod ;
      AV77Tdevpie1wwds_6_tfalbreccod_to = AV15TFAlbRecCod_To ;
      AV78Tdevpie1wwds_7_tfclinom = AV16TFCliNom ;
      AV79Tdevpie1wwds_8_tfclinom_sel = AV17TFCliNom_Sel ;
      AV80Tdevpie1wwds_9_tfalbref = AV18TFAlbRef ;
      AV81Tdevpie1wwds_10_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV82Tdevpie1wwds_11_tfdevtrnnom = AV20TFDevTrnNom ;
      AV83Tdevpie1wwds_12_tfdevtrnnom_sel = AV21TFDevTrnNom_Sel ;
      AV84Tdevpie1wwds_13_tfdevgenuni = AV22TFDevGenUni ;
      AV85Tdevpie1wwds_14_tfdevgenuni_to = AV23TFDevGenUni_To ;
      AV86Tdevpie1wwds_15_tfalbruni_sels = AV64TFAlbRUni_Sels ;
      AV87Tdevpie1wwds_16_tfdevgenpie = AV26TFDevGenPie ;
      AV88Tdevpie1wwds_17_tfdevgenpie_to = AV27TFDevGenPie_To ;
      AV89Tdevpie1wwds_18_tfemprtrn = AV65TFEmprTrn ;
      AV90Tdevpie1wwds_19_tfemprtrn_sel = AV66TFEmprTrn_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV86Tdevpie1wwds_15_tfalbruni_sels ,
                                           Integer.valueOf(AV73Tdevpie1wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV74Tdevpie1wwds_3_tfdevgencod_to) ,
                                           AV75Tdevpie1wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV76Tdevpie1wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV77Tdevpie1wwds_6_tfalbreccod_to) ,
                                           AV79Tdevpie1wwds_8_tfclinom_sel ,
                                           AV78Tdevpie1wwds_7_tfclinom ,
                                           AV81Tdevpie1wwds_10_tfalbref_sel ,
                                           AV80Tdevpie1wwds_9_tfalbref ,
                                           AV83Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                           AV82Tdevpie1wwds_11_tfdevtrnnom ,
                                           AV84Tdevpie1wwds_13_tfdevgenuni ,
                                           AV85Tdevpie1wwds_14_tfdevgenuni_to ,
                                           Integer.valueOf(AV86Tdevpie1wwds_15_tfalbruni_sels.size()) ,
                                           Short.valueOf(AV87Tdevpie1wwds_16_tfdevgenpie) ,
                                           Short.valueOf(AV88Tdevpie1wwds_17_tfdevgenpie_to) ,
                                           AV90Tdevpie1wwds_19_tfemprtrn_sel ,
                                           AV89Tdevpie1wwds_18_tfemprtrn ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A329DevTrnNom ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           A410EmprTrn ,
                                           AV72Tdevpie1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tdevpie1wwds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV78Tdevpie1wwds_7_tfclinom), 30, "%") ;
      lV80Tdevpie1wwds_9_tfalbref = GXutil.padr( GXutil.rtrim( AV80Tdevpie1wwds_9_tfalbref), 16, "%") ;
      lV82Tdevpie1wwds_11_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV82Tdevpie1wwds_11_tfdevtrnnom), 30, "%") ;
      lV89Tdevpie1wwds_18_tfemprtrn = GXutil.padr( GXutil.rtrim( AV89Tdevpie1wwds_18_tfemprtrn), 3, "%") ;
      /* Using cursor P086H4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV73Tdevpie1wwds_2_tfdevgencod), Integer.valueOf(AV74Tdevpie1wwds_3_tfdevgencod_to), AV75Tdevpie1wwds_4_tfdevgenfec, Integer.valueOf(AV76Tdevpie1wwds_5_tfalbreccod), Integer.valueOf(AV77Tdevpie1wwds_6_tfalbreccod_to), lV78Tdevpie1wwds_7_tfclinom, AV79Tdevpie1wwds_8_tfclinom_sel, lV80Tdevpie1wwds_9_tfalbref, AV81Tdevpie1wwds_10_tfalbref_sel, lV82Tdevpie1wwds_11_tfdevtrnnom, AV83Tdevpie1wwds_12_tfdevtrnnom_sel, AV84Tdevpie1wwds_13_tfdevgenuni, AV85Tdevpie1wwds_14_tfdevgenuni_to, Short.valueOf(AV87Tdevpie1wwds_16_tfdevgenpie), Short.valueOf(AV88Tdevpie1wwds_17_tfdevgenpie_to), lV89Tdevpie1wwds_18_tfemprtrn, AV90Tdevpie1wwds_19_tfemprtrn_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk86H6 = false ;
         A252CliCod = P086H4_A252CliCod[0] ;
         n252CliCod = P086H4_n252CliCod[0] ;
         A327DevGenTrn = P086H4_A327DevGenTrn[0] ;
         n327DevGenTrn = P086H4_n327DevGenTrn[0] ;
         A396EmprCod = P086H4_A396EmprCod[0] ;
         A410EmprTrn = P086H4_A410EmprTrn[0] ;
         n410EmprTrn = P086H4_n410EmprTrn[0] ;
         A326DevGenPie = P086H4_A326DevGenPie[0] ;
         n326DevGenPie = P086H4_n326DevGenPie[0] ;
         A328DevGenUni = P086H4_A328DevGenUni[0] ;
         n328DevGenUni = P086H4_n328DevGenUni[0] ;
         A329DevTrnNom = P086H4_A329DevTrnNom[0] ;
         n329DevTrnNom = P086H4_n329DevTrnNom[0] ;
         A45AlbRef = P086H4_A45AlbRef[0] ;
         A279CliNom = P086H4_A279CliNom[0] ;
         A44AlbRecCod = P086H4_A44AlbRecCod[0] ;
         n44AlbRecCod = P086H4_n44AlbRecCod[0] ;
         A325DevGenFec = P086H4_A325DevGenFec[0] ;
         n325DevGenFec = P086H4_n325DevGenFec[0] ;
         A323DevGenCod = P086H4_A323DevGenCod[0] ;
         A56AlbRUni = P086H4_A56AlbRUni[0] ;
         A279CliNom = P086H4_A279CliNom[0] ;
         A329DevTrnNom = P086H4_A329DevTrnNom[0] ;
         n329DevTrnNom = P086H4_n329DevTrnNom[0] ;
         A45AlbRef = P086H4_A45AlbRef[0] ;
         A56AlbRUni = P086H4_A56AlbRUni[0] ;
         if ( (GXutil.strcmp("", AV72Tdevpie1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A410EmprTrn) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV40count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P086H4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P086H4_A327DevGenTrn[0] == A327DevGenTrn ) )
            {
               brk86H6 = false ;
               A323DevGenCod = P086H4_A323DevGenCod[0] ;
               AV40count = (long)(AV40count+1) ;
               brk86H6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A329DevTrnNom)==0) )
            {
               AV32Option = A329DevTrnNom ;
               AV31InsertIndex = 1 ;
               while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
               {
                  AV31InsertIndex = (int)(AV31InsertIndex+1) ;
               }
               AV33Options.add(AV32Option, AV31InsertIndex);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
            }
            if ( AV33Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86H6 )
         {
            brk86H6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADEMPRTRNOPTIONS' Routine */
      returnInSub = false ;
      AV65TFEmprTrn = AV28SearchTxt ;
      AV66TFEmprTrn_Sel = "" ;
      AV72Tdevpie1wwds_1_filterfulltext = AV67FilterFullText ;
      AV73Tdevpie1wwds_2_tfdevgencod = AV10TFDevGenCod ;
      AV74Tdevpie1wwds_3_tfdevgencod_to = AV11TFDevGenCod_To ;
      AV75Tdevpie1wwds_4_tfdevgenfec = AV12TFDevGenFec ;
      AV76Tdevpie1wwds_5_tfalbreccod = AV14TFAlbRecCod ;
      AV77Tdevpie1wwds_6_tfalbreccod_to = AV15TFAlbRecCod_To ;
      AV78Tdevpie1wwds_7_tfclinom = AV16TFCliNom ;
      AV79Tdevpie1wwds_8_tfclinom_sel = AV17TFCliNom_Sel ;
      AV80Tdevpie1wwds_9_tfalbref = AV18TFAlbRef ;
      AV81Tdevpie1wwds_10_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV82Tdevpie1wwds_11_tfdevtrnnom = AV20TFDevTrnNom ;
      AV83Tdevpie1wwds_12_tfdevtrnnom_sel = AV21TFDevTrnNom_Sel ;
      AV84Tdevpie1wwds_13_tfdevgenuni = AV22TFDevGenUni ;
      AV85Tdevpie1wwds_14_tfdevgenuni_to = AV23TFDevGenUni_To ;
      AV86Tdevpie1wwds_15_tfalbruni_sels = AV64TFAlbRUni_Sels ;
      AV87Tdevpie1wwds_16_tfdevgenpie = AV26TFDevGenPie ;
      AV88Tdevpie1wwds_17_tfdevgenpie_to = AV27TFDevGenPie_To ;
      AV89Tdevpie1wwds_18_tfemprtrn = AV65TFEmprTrn ;
      AV90Tdevpie1wwds_19_tfemprtrn_sel = AV66TFEmprTrn_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV86Tdevpie1wwds_15_tfalbruni_sels ,
                                           Integer.valueOf(AV73Tdevpie1wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV74Tdevpie1wwds_3_tfdevgencod_to) ,
                                           AV75Tdevpie1wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV76Tdevpie1wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV77Tdevpie1wwds_6_tfalbreccod_to) ,
                                           AV79Tdevpie1wwds_8_tfclinom_sel ,
                                           AV78Tdevpie1wwds_7_tfclinom ,
                                           AV81Tdevpie1wwds_10_tfalbref_sel ,
                                           AV80Tdevpie1wwds_9_tfalbref ,
                                           AV83Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                           AV82Tdevpie1wwds_11_tfdevtrnnom ,
                                           AV84Tdevpie1wwds_13_tfdevgenuni ,
                                           AV85Tdevpie1wwds_14_tfdevgenuni_to ,
                                           Integer.valueOf(AV86Tdevpie1wwds_15_tfalbruni_sels.size()) ,
                                           Short.valueOf(AV87Tdevpie1wwds_16_tfdevgenpie) ,
                                           Short.valueOf(AV88Tdevpie1wwds_17_tfdevgenpie_to) ,
                                           AV90Tdevpie1wwds_19_tfemprtrn_sel ,
                                           AV89Tdevpie1wwds_18_tfemprtrn ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A329DevTrnNom ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           A410EmprTrn ,
                                           AV72Tdevpie1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Tdevpie1wwds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV78Tdevpie1wwds_7_tfclinom), 30, "%") ;
      lV80Tdevpie1wwds_9_tfalbref = GXutil.padr( GXutil.rtrim( AV80Tdevpie1wwds_9_tfalbref), 16, "%") ;
      lV82Tdevpie1wwds_11_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV82Tdevpie1wwds_11_tfdevtrnnom), 30, "%") ;
      lV89Tdevpie1wwds_18_tfemprtrn = GXutil.padr( GXutil.rtrim( AV89Tdevpie1wwds_18_tfemprtrn), 3, "%") ;
      /* Using cursor P086H5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV73Tdevpie1wwds_2_tfdevgencod), Integer.valueOf(AV74Tdevpie1wwds_3_tfdevgencod_to), AV75Tdevpie1wwds_4_tfdevgenfec, Integer.valueOf(AV76Tdevpie1wwds_5_tfalbreccod), Integer.valueOf(AV77Tdevpie1wwds_6_tfalbreccod_to), lV78Tdevpie1wwds_7_tfclinom, AV79Tdevpie1wwds_8_tfclinom_sel, lV80Tdevpie1wwds_9_tfalbref, AV81Tdevpie1wwds_10_tfalbref_sel, lV82Tdevpie1wwds_11_tfdevtrnnom, AV83Tdevpie1wwds_12_tfdevtrnnom_sel, AV84Tdevpie1wwds_13_tfdevgenuni, AV85Tdevpie1wwds_14_tfdevgenuni_to, Short.valueOf(AV87Tdevpie1wwds_16_tfdevgenpie), Short.valueOf(AV88Tdevpie1wwds_17_tfdevgenpie_to), lV89Tdevpie1wwds_18_tfemprtrn, AV90Tdevpie1wwds_19_tfemprtrn_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk86H8 = false ;
         A396EmprCod = P086H5_A396EmprCod[0] ;
         A252CliCod = P086H5_A252CliCod[0] ;
         n252CliCod = P086H5_n252CliCod[0] ;
         A327DevGenTrn = P086H5_A327DevGenTrn[0] ;
         n327DevGenTrn = P086H5_n327DevGenTrn[0] ;
         A410EmprTrn = P086H5_A410EmprTrn[0] ;
         n410EmprTrn = P086H5_n410EmprTrn[0] ;
         A326DevGenPie = P086H5_A326DevGenPie[0] ;
         n326DevGenPie = P086H5_n326DevGenPie[0] ;
         A328DevGenUni = P086H5_A328DevGenUni[0] ;
         n328DevGenUni = P086H5_n328DevGenUni[0] ;
         A329DevTrnNom = P086H5_A329DevTrnNom[0] ;
         n329DevTrnNom = P086H5_n329DevTrnNom[0] ;
         A45AlbRef = P086H5_A45AlbRef[0] ;
         A279CliNom = P086H5_A279CliNom[0] ;
         A44AlbRecCod = P086H5_A44AlbRecCod[0] ;
         n44AlbRecCod = P086H5_n44AlbRecCod[0] ;
         A325DevGenFec = P086H5_A325DevGenFec[0] ;
         n325DevGenFec = P086H5_n325DevGenFec[0] ;
         A323DevGenCod = P086H5_A323DevGenCod[0] ;
         A56AlbRUni = P086H5_A56AlbRUni[0] ;
         A279CliNom = P086H5_A279CliNom[0] ;
         A329DevTrnNom = P086H5_A329DevTrnNom[0] ;
         n329DevTrnNom = P086H5_n329DevTrnNom[0] ;
         A45AlbRef = P086H5_A45AlbRef[0] ;
         A56AlbRUni = P086H5_A56AlbRUni[0] ;
         if ( (GXutil.strcmp("", AV72Tdevpie1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV72Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A410EmprTrn) , GXutil.padr( "%" + GXutil.upper( AV72Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV40count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P086H5_A410EmprTrn[0], A410EmprTrn) == 0 ) )
            {
               brk86H8 = false ;
               A396EmprCod = P086H5_A396EmprCod[0] ;
               A323DevGenCod = P086H5_A323DevGenCod[0] ;
               AV40count = (long)(AV40count+1) ;
               brk86H8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A410EmprTrn)==0) )
            {
               AV32Option = A410EmprTrn ;
               AV33Options.add(AV32Option, 0);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV33Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86H8 )
         {
            brk86H8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tdevpie1wwgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = tdevpie1wwgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = tdevpie1wwgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV67FilterFullText = "" ;
      AV12TFDevGenFec = GXutil.nullDate() ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV18TFAlbRef = "" ;
      AV19TFAlbRef_Sel = "" ;
      AV20TFDevTrnNom = "" ;
      AV21TFDevTrnNom_Sel = "" ;
      AV22TFDevGenUni = DecimalUtil.ZERO ;
      AV23TFDevGenUni_To = DecimalUtil.ZERO ;
      AV63TFAlbRUni_SelsJson = "" ;
      AV64TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV65TFEmprTrn = "" ;
      AV66TFEmprTrn_Sel = "" ;
      A279CliNom = "" ;
      AV72Tdevpie1wwds_1_filterfulltext = "" ;
      AV75Tdevpie1wwds_4_tfdevgenfec = GXutil.nullDate() ;
      AV78Tdevpie1wwds_7_tfclinom = "" ;
      AV79Tdevpie1wwds_8_tfclinom_sel = "" ;
      AV80Tdevpie1wwds_9_tfalbref = "" ;
      AV81Tdevpie1wwds_10_tfalbref_sel = "" ;
      AV82Tdevpie1wwds_11_tfdevtrnnom = "" ;
      AV83Tdevpie1wwds_12_tfdevtrnnom_sel = "" ;
      AV84Tdevpie1wwds_13_tfdevgenuni = DecimalUtil.ZERO ;
      AV85Tdevpie1wwds_14_tfdevgenuni_to = DecimalUtil.ZERO ;
      AV86Tdevpie1wwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV89Tdevpie1wwds_18_tfemprtrn = "" ;
      AV90Tdevpie1wwds_19_tfemprtrn_sel = "" ;
      lV72Tdevpie1wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV78Tdevpie1wwds_7_tfclinom = "" ;
      lV80Tdevpie1wwds_9_tfalbref = "" ;
      lV82Tdevpie1wwds_11_tfdevtrnnom = "" ;
      lV89Tdevpie1wwds_18_tfemprtrn = "" ;
      A56AlbRUni = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A329DevTrnNom = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      A410EmprTrn = "" ;
      P086H2_A396EmprCod = new String[] {""} ;
      P086H2_A252CliCod = new int[1] ;
      P086H2_n252CliCod = new boolean[] {false} ;
      P086H2_A327DevGenTrn = new short[1] ;
      P086H2_n327DevGenTrn = new boolean[] {false} ;
      P086H2_A279CliNom = new String[] {""} ;
      P086H2_A410EmprTrn = new String[] {""} ;
      P086H2_n410EmprTrn = new boolean[] {false} ;
      P086H2_A326DevGenPie = new short[1] ;
      P086H2_n326DevGenPie = new boolean[] {false} ;
      P086H2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086H2_n328DevGenUni = new boolean[] {false} ;
      P086H2_A329DevTrnNom = new String[] {""} ;
      P086H2_n329DevTrnNom = new boolean[] {false} ;
      P086H2_A45AlbRef = new String[] {""} ;
      P086H2_A44AlbRecCod = new int[1] ;
      P086H2_n44AlbRecCod = new boolean[] {false} ;
      P086H2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086H2_n325DevGenFec = new boolean[] {false} ;
      P086H2_A323DevGenCod = new int[1] ;
      P086H2_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV32Option = "" ;
      P086H3_A252CliCod = new int[1] ;
      P086H3_n252CliCod = new boolean[] {false} ;
      P086H3_A327DevGenTrn = new short[1] ;
      P086H3_n327DevGenTrn = new boolean[] {false} ;
      P086H3_A44AlbRecCod = new int[1] ;
      P086H3_n44AlbRecCod = new boolean[] {false} ;
      P086H3_A396EmprCod = new String[] {""} ;
      P086H3_A410EmprTrn = new String[] {""} ;
      P086H3_n410EmprTrn = new boolean[] {false} ;
      P086H3_A326DevGenPie = new short[1] ;
      P086H3_n326DevGenPie = new boolean[] {false} ;
      P086H3_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086H3_n328DevGenUni = new boolean[] {false} ;
      P086H3_A329DevTrnNom = new String[] {""} ;
      P086H3_n329DevTrnNom = new boolean[] {false} ;
      P086H3_A45AlbRef = new String[] {""} ;
      P086H3_A279CliNom = new String[] {""} ;
      P086H3_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086H3_n325DevGenFec = new boolean[] {false} ;
      P086H3_A323DevGenCod = new int[1] ;
      P086H3_A56AlbRUni = new String[] {""} ;
      P086H4_A252CliCod = new int[1] ;
      P086H4_n252CliCod = new boolean[] {false} ;
      P086H4_A327DevGenTrn = new short[1] ;
      P086H4_n327DevGenTrn = new boolean[] {false} ;
      P086H4_A396EmprCod = new String[] {""} ;
      P086H4_A410EmprTrn = new String[] {""} ;
      P086H4_n410EmprTrn = new boolean[] {false} ;
      P086H4_A326DevGenPie = new short[1] ;
      P086H4_n326DevGenPie = new boolean[] {false} ;
      P086H4_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086H4_n328DevGenUni = new boolean[] {false} ;
      P086H4_A329DevTrnNom = new String[] {""} ;
      P086H4_n329DevTrnNom = new boolean[] {false} ;
      P086H4_A45AlbRef = new String[] {""} ;
      P086H4_A279CliNom = new String[] {""} ;
      P086H4_A44AlbRecCod = new int[1] ;
      P086H4_n44AlbRecCod = new boolean[] {false} ;
      P086H4_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086H4_n325DevGenFec = new boolean[] {false} ;
      P086H4_A323DevGenCod = new int[1] ;
      P086H4_A56AlbRUni = new String[] {""} ;
      P086H5_A396EmprCod = new String[] {""} ;
      P086H5_A252CliCod = new int[1] ;
      P086H5_n252CliCod = new boolean[] {false} ;
      P086H5_A327DevGenTrn = new short[1] ;
      P086H5_n327DevGenTrn = new boolean[] {false} ;
      P086H5_A410EmprTrn = new String[] {""} ;
      P086H5_n410EmprTrn = new boolean[] {false} ;
      P086H5_A326DevGenPie = new short[1] ;
      P086H5_n326DevGenPie = new boolean[] {false} ;
      P086H5_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086H5_n328DevGenUni = new boolean[] {false} ;
      P086H5_A329DevTrnNom = new String[] {""} ;
      P086H5_n329DevTrnNom = new boolean[] {false} ;
      P086H5_A45AlbRef = new String[] {""} ;
      P086H5_A279CliNom = new String[] {""} ;
      P086H5_A44AlbRecCod = new int[1] ;
      P086H5_n44AlbRecCod = new boolean[] {false} ;
      P086H5_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086H5_n325DevGenFec = new boolean[] {false} ;
      P086H5_A323DevGenCod = new int[1] ;
      P086H5_A56AlbRUni = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P086H2_A396EmprCod, P086H2_A252CliCod, P086H2_n252CliCod, P086H2_A327DevGenTrn, P086H2_n327DevGenTrn, P086H2_A279CliNom, P086H2_A410EmprTrn, P086H2_n410EmprTrn, P086H2_A326DevGenPie, P086H2_n326DevGenPie,
            P086H2_A328DevGenUni, P086H2_n328DevGenUni, P086H2_A329DevTrnNom, P086H2_n329DevTrnNom, P086H2_A45AlbRef, P086H2_A44AlbRecCod, P086H2_n44AlbRecCod, P086H2_A325DevGenFec, P086H2_n325DevGenFec, P086H2_A323DevGenCod,
            P086H2_A56AlbRUni
            }
            , new Object[] {
            P086H3_A252CliCod, P086H3_n252CliCod, P086H3_A327DevGenTrn, P086H3_n327DevGenTrn, P086H3_A44AlbRecCod, P086H3_n44AlbRecCod, P086H3_A396EmprCod, P086H3_A410EmprTrn, P086H3_n410EmprTrn, P086H3_A326DevGenPie,
            P086H3_n326DevGenPie, P086H3_A328DevGenUni, P086H3_n328DevGenUni, P086H3_A329DevTrnNom, P086H3_n329DevTrnNom, P086H3_A45AlbRef, P086H3_A279CliNom, P086H3_A325DevGenFec, P086H3_n325DevGenFec, P086H3_A323DevGenCod,
            P086H3_A56AlbRUni
            }
            , new Object[] {
            P086H4_A252CliCod, P086H4_n252CliCod, P086H4_A327DevGenTrn, P086H4_n327DevGenTrn, P086H4_A396EmprCod, P086H4_A410EmprTrn, P086H4_n410EmprTrn, P086H4_A326DevGenPie, P086H4_n326DevGenPie, P086H4_A328DevGenUni,
            P086H4_n328DevGenUni, P086H4_A329DevTrnNom, P086H4_n329DevTrnNom, P086H4_A45AlbRef, P086H4_A279CliNom, P086H4_A44AlbRecCod, P086H4_n44AlbRecCod, P086H4_A325DevGenFec, P086H4_n325DevGenFec, P086H4_A323DevGenCod,
            P086H4_A56AlbRUni
            }
            , new Object[] {
            P086H5_A396EmprCod, P086H5_A252CliCod, P086H5_n252CliCod, P086H5_A327DevGenTrn, P086H5_n327DevGenTrn, P086H5_A410EmprTrn, P086H5_n410EmprTrn, P086H5_A326DevGenPie, P086H5_n326DevGenPie, P086H5_A328DevGenUni,
            P086H5_n328DevGenUni, P086H5_A329DevTrnNom, P086H5_n329DevTrnNom, P086H5_A45AlbRef, P086H5_A279CliNom, P086H5_A44AlbRecCod, P086H5_n44AlbRecCod, P086H5_A325DevGenFec, P086H5_n325DevGenFec, P086H5_A323DevGenCod,
            P086H5_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV26TFDevGenPie ;
   private short AV27TFDevGenPie_To ;
   private short AV87Tdevpie1wwds_16_tfdevgenpie ;
   private short AV88Tdevpie1wwds_17_tfdevgenpie_to ;
   private short A326DevGenPie ;
   private short A327DevGenTrn ;
   private short Gx_err ;
   private int AV70GXV1 ;
   private int AV10TFDevGenCod ;
   private int AV11TFDevGenCod_To ;
   private int AV14TFAlbRecCod ;
   private int AV15TFAlbRecCod_To ;
   private int AV73Tdevpie1wwds_2_tfdevgencod ;
   private int AV74Tdevpie1wwds_3_tfdevgencod_to ;
   private int AV76Tdevpie1wwds_5_tfalbreccod ;
   private int AV77Tdevpie1wwds_6_tfalbreccod_to ;
   private int AV86Tdevpie1wwds_15_tfalbruni_sels_size ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV31InsertIndex ;
   private long AV40count ;
   private java.math.BigDecimal AV22TFDevGenUni ;
   private java.math.BigDecimal AV23TFDevGenUni_To ;
   private java.math.BigDecimal AV84Tdevpie1wwds_13_tfdevgenuni ;
   private java.math.BigDecimal AV85Tdevpie1wwds_14_tfdevgenuni_to ;
   private java.math.BigDecimal A328DevGenUni ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV18TFAlbRef ;
   private String AV19TFAlbRef_Sel ;
   private String AV20TFDevTrnNom ;
   private String AV21TFDevTrnNom_Sel ;
   private String AV65TFEmprTrn ;
   private String AV66TFEmprTrn_Sel ;
   private String A279CliNom ;
   private String AV78Tdevpie1wwds_7_tfclinom ;
   private String AV79Tdevpie1wwds_8_tfclinom_sel ;
   private String AV80Tdevpie1wwds_9_tfalbref ;
   private String AV81Tdevpie1wwds_10_tfalbref_sel ;
   private String AV82Tdevpie1wwds_11_tfdevtrnnom ;
   private String AV83Tdevpie1wwds_12_tfdevtrnnom_sel ;
   private String AV89Tdevpie1wwds_18_tfemprtrn ;
   private String AV90Tdevpie1wwds_19_tfemprtrn_sel ;
   private String scmdbuf ;
   private String lV78Tdevpie1wwds_7_tfclinom ;
   private String lV80Tdevpie1wwds_9_tfalbref ;
   private String lV82Tdevpie1wwds_11_tfdevtrnnom ;
   private String lV89Tdevpie1wwds_18_tfemprtrn ;
   private String A56AlbRUni ;
   private String A45AlbRef ;
   private String A329DevTrnNom ;
   private String A410EmprTrn ;
   private String A396EmprCod ;
   private java.util.Date AV12TFDevGenFec ;
   private java.util.Date AV75Tdevpie1wwds_4_tfdevgenfec ;
   private java.util.Date A325DevGenFec ;
   private boolean returnInSub ;
   private boolean brk86H2 ;
   private boolean n252CliCod ;
   private boolean n327DevGenTrn ;
   private boolean n410EmprTrn ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean n329DevTrnNom ;
   private boolean n44AlbRecCod ;
   private boolean n325DevGenFec ;
   private boolean brk86H4 ;
   private boolean brk86H6 ;
   private boolean brk86H8 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV63TFAlbRUni_SelsJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV67FilterFullText ;
   private String AV72Tdevpie1wwds_1_filterfulltext ;
   private String lV72Tdevpie1wwds_1_filterfulltext ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P086H2_A396EmprCod ;
   private int[] P086H2_A252CliCod ;
   private boolean[] P086H2_n252CliCod ;
   private short[] P086H2_A327DevGenTrn ;
   private boolean[] P086H2_n327DevGenTrn ;
   private String[] P086H2_A279CliNom ;
   private String[] P086H2_A410EmprTrn ;
   private boolean[] P086H2_n410EmprTrn ;
   private short[] P086H2_A326DevGenPie ;
   private boolean[] P086H2_n326DevGenPie ;
   private java.math.BigDecimal[] P086H2_A328DevGenUni ;
   private boolean[] P086H2_n328DevGenUni ;
   private String[] P086H2_A329DevTrnNom ;
   private boolean[] P086H2_n329DevTrnNom ;
   private String[] P086H2_A45AlbRef ;
   private int[] P086H2_A44AlbRecCod ;
   private boolean[] P086H2_n44AlbRecCod ;
   private java.util.Date[] P086H2_A325DevGenFec ;
   private boolean[] P086H2_n325DevGenFec ;
   private int[] P086H2_A323DevGenCod ;
   private String[] P086H2_A56AlbRUni ;
   private int[] P086H3_A252CliCod ;
   private boolean[] P086H3_n252CliCod ;
   private short[] P086H3_A327DevGenTrn ;
   private boolean[] P086H3_n327DevGenTrn ;
   private int[] P086H3_A44AlbRecCod ;
   private boolean[] P086H3_n44AlbRecCod ;
   private String[] P086H3_A396EmprCod ;
   private String[] P086H3_A410EmprTrn ;
   private boolean[] P086H3_n410EmprTrn ;
   private short[] P086H3_A326DevGenPie ;
   private boolean[] P086H3_n326DevGenPie ;
   private java.math.BigDecimal[] P086H3_A328DevGenUni ;
   private boolean[] P086H3_n328DevGenUni ;
   private String[] P086H3_A329DevTrnNom ;
   private boolean[] P086H3_n329DevTrnNom ;
   private String[] P086H3_A45AlbRef ;
   private String[] P086H3_A279CliNom ;
   private java.util.Date[] P086H3_A325DevGenFec ;
   private boolean[] P086H3_n325DevGenFec ;
   private int[] P086H3_A323DevGenCod ;
   private String[] P086H3_A56AlbRUni ;
   private int[] P086H4_A252CliCod ;
   private boolean[] P086H4_n252CliCod ;
   private short[] P086H4_A327DevGenTrn ;
   private boolean[] P086H4_n327DevGenTrn ;
   private String[] P086H4_A396EmprCod ;
   private String[] P086H4_A410EmprTrn ;
   private boolean[] P086H4_n410EmprTrn ;
   private short[] P086H4_A326DevGenPie ;
   private boolean[] P086H4_n326DevGenPie ;
   private java.math.BigDecimal[] P086H4_A328DevGenUni ;
   private boolean[] P086H4_n328DevGenUni ;
   private String[] P086H4_A329DevTrnNom ;
   private boolean[] P086H4_n329DevTrnNom ;
   private String[] P086H4_A45AlbRef ;
   private String[] P086H4_A279CliNom ;
   private int[] P086H4_A44AlbRecCod ;
   private boolean[] P086H4_n44AlbRecCod ;
   private java.util.Date[] P086H4_A325DevGenFec ;
   private boolean[] P086H4_n325DevGenFec ;
   private int[] P086H4_A323DevGenCod ;
   private String[] P086H4_A56AlbRUni ;
   private String[] P086H5_A396EmprCod ;
   private int[] P086H5_A252CliCod ;
   private boolean[] P086H5_n252CliCod ;
   private short[] P086H5_A327DevGenTrn ;
   private boolean[] P086H5_n327DevGenTrn ;
   private String[] P086H5_A410EmprTrn ;
   private boolean[] P086H5_n410EmprTrn ;
   private short[] P086H5_A326DevGenPie ;
   private boolean[] P086H5_n326DevGenPie ;
   private java.math.BigDecimal[] P086H5_A328DevGenUni ;
   private boolean[] P086H5_n328DevGenUni ;
   private String[] P086H5_A329DevTrnNom ;
   private boolean[] P086H5_n329DevTrnNom ;
   private String[] P086H5_A45AlbRef ;
   private String[] P086H5_A279CliNom ;
   private int[] P086H5_A44AlbRecCod ;
   private boolean[] P086H5_n44AlbRecCod ;
   private java.util.Date[] P086H5_A325DevGenFec ;
   private boolean[] P086H5_n325DevGenFec ;
   private int[] P086H5_A323DevGenCod ;
   private String[] P086H5_A56AlbRUni ;
   private GXSimpleCollection<String> AV64TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV86Tdevpie1wwds_15_tfalbruni_sels ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class tdevpie1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV86Tdevpie1wwds_15_tfalbruni_sels ,
                                          int AV73Tdevpie1wwds_2_tfdevgencod ,
                                          int AV74Tdevpie1wwds_3_tfdevgencod_to ,
                                          java.util.Date AV75Tdevpie1wwds_4_tfdevgenfec ,
                                          int AV76Tdevpie1wwds_5_tfalbreccod ,
                                          int AV77Tdevpie1wwds_6_tfalbreccod_to ,
                                          String AV79Tdevpie1wwds_8_tfclinom_sel ,
                                          String AV78Tdevpie1wwds_7_tfclinom ,
                                          String AV81Tdevpie1wwds_10_tfalbref_sel ,
                                          String AV80Tdevpie1wwds_9_tfalbref ,
                                          String AV83Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                          String AV82Tdevpie1wwds_11_tfdevtrnnom ,
                                          java.math.BigDecimal AV84Tdevpie1wwds_13_tfdevgenuni ,
                                          java.math.BigDecimal AV85Tdevpie1wwds_14_tfdevgenuni_to ,
                                          int AV86Tdevpie1wwds_15_tfalbruni_sels_size ,
                                          short AV87Tdevpie1wwds_16_tfdevgenpie ,
                                          short AV88Tdevpie1wwds_17_tfdevgenpie_to ,
                                          String AV90Tdevpie1wwds_19_tfemprtrn_sel ,
                                          String AV89Tdevpie1wwds_18_tfemprtrn ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String A410EmprTrn ,
                                          String AV72Tdevpie1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.DevGenTrn AS DevGenTrn, T2.CliNom, T1.EmprTrn, T1.DevGenPie, T1.DevGenUni, T3.TrnNom AS DevTrnNom, T4.AlbRef, T1.AlbRecCod, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T4.AlbRUni FROM (((TXPDEVGEN T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TrnCod = T1.DevGenTrn) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod = T1.AlbRecCod)" ;
      if ( ! (0==AV73Tdevpie1wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV74Tdevpie1wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Tdevpie1wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Tdevpie1wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Tdevpie1wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tdevpie1wwds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV78Tdevpie1wwds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tdevpie1wwds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tdevpie1wwds_10_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV80Tdevpie1wwds_9_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tdevpie1wwds_10_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tdevpie1wwds_12_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Tdevpie1wwds_11_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tdevpie1wwds_12_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tdevpie1wwds_13_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tdevpie1wwds_14_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( AV86Tdevpie1wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Tdevpie1wwds_15_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV87Tdevpie1wwds_16_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV88Tdevpie1wwds_17_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tdevpie1wwds_19_tfemprtrn_sel)==0) && ( ! (GXutil.strcmp("", AV89Tdevpie1wwds_18_tfemprtrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTrn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tdevpie1wwds_19_tfemprtrn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTrn = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P086H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV86Tdevpie1wwds_15_tfalbruni_sels ,
                                          int AV73Tdevpie1wwds_2_tfdevgencod ,
                                          int AV74Tdevpie1wwds_3_tfdevgencod_to ,
                                          java.util.Date AV75Tdevpie1wwds_4_tfdevgenfec ,
                                          int AV76Tdevpie1wwds_5_tfalbreccod ,
                                          int AV77Tdevpie1wwds_6_tfalbreccod_to ,
                                          String AV79Tdevpie1wwds_8_tfclinom_sel ,
                                          String AV78Tdevpie1wwds_7_tfclinom ,
                                          String AV81Tdevpie1wwds_10_tfalbref_sel ,
                                          String AV80Tdevpie1wwds_9_tfalbref ,
                                          String AV83Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                          String AV82Tdevpie1wwds_11_tfdevtrnnom ,
                                          java.math.BigDecimal AV84Tdevpie1wwds_13_tfdevgenuni ,
                                          java.math.BigDecimal AV85Tdevpie1wwds_14_tfdevgenuni_to ,
                                          int AV86Tdevpie1wwds_15_tfalbruni_sels_size ,
                                          short AV87Tdevpie1wwds_16_tfdevgenpie ,
                                          short AV88Tdevpie1wwds_17_tfdevgenpie_to ,
                                          String AV90Tdevpie1wwds_19_tfemprtrn_sel ,
                                          String AV89Tdevpie1wwds_18_tfemprtrn ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String A410EmprTrn ,
                                          String AV72Tdevpie1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[17];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.DevGenTrn AS DevGenTrn, T1.AlbRecCod, T1.EmprCod, T1.EmprTrn, T1.DevGenPie, T1.DevGenUni, T4.TrnNom AS DevTrnNom, T2.AlbRef, T3.CliNom, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T2.AlbRUni FROM (((TXPDEVGEN T1 LEFT JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.DevGenTrn)" ;
      if ( ! (0==AV73Tdevpie1wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV74Tdevpie1wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Tdevpie1wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Tdevpie1wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Tdevpie1wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tdevpie1wwds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV78Tdevpie1wwds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tdevpie1wwds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tdevpie1wwds_10_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV80Tdevpie1wwds_9_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tdevpie1wwds_10_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tdevpie1wwds_12_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Tdevpie1wwds_11_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tdevpie1wwds_12_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tdevpie1wwds_13_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tdevpie1wwds_14_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( AV86Tdevpie1wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Tdevpie1wwds_15_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV87Tdevpie1wwds_16_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV88Tdevpie1wwds_17_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tdevpie1wwds_19_tfemprtrn_sel)==0) && ( ! (GXutil.strcmp("", AV89Tdevpie1wwds_18_tfemprtrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTrn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tdevpie1wwds_19_tfemprtrn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTrn = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P086H4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV86Tdevpie1wwds_15_tfalbruni_sels ,
                                          int AV73Tdevpie1wwds_2_tfdevgencod ,
                                          int AV74Tdevpie1wwds_3_tfdevgencod_to ,
                                          java.util.Date AV75Tdevpie1wwds_4_tfdevgenfec ,
                                          int AV76Tdevpie1wwds_5_tfalbreccod ,
                                          int AV77Tdevpie1wwds_6_tfalbreccod_to ,
                                          String AV79Tdevpie1wwds_8_tfclinom_sel ,
                                          String AV78Tdevpie1wwds_7_tfclinom ,
                                          String AV81Tdevpie1wwds_10_tfalbref_sel ,
                                          String AV80Tdevpie1wwds_9_tfalbref ,
                                          String AV83Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                          String AV82Tdevpie1wwds_11_tfdevtrnnom ,
                                          java.math.BigDecimal AV84Tdevpie1wwds_13_tfdevgenuni ,
                                          java.math.BigDecimal AV85Tdevpie1wwds_14_tfdevgenuni_to ,
                                          int AV86Tdevpie1wwds_15_tfalbruni_sels_size ,
                                          short AV87Tdevpie1wwds_16_tfdevgenpie ,
                                          short AV88Tdevpie1wwds_17_tfdevgenpie_to ,
                                          String AV90Tdevpie1wwds_19_tfemprtrn_sel ,
                                          String AV89Tdevpie1wwds_18_tfemprtrn ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String A410EmprTrn ,
                                          String AV72Tdevpie1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.DevGenTrn AS DevGenTrn, T1.EmprCod, T1.EmprTrn, T1.DevGenPie, T1.DevGenUni, T3.TrnNom AS DevTrnNom, T4.AlbRef, T2.CliNom, T1.AlbRecCod, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T4.AlbRUni FROM (((TXPDEVGEN T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TrnCod = T1.DevGenTrn) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod = T1.AlbRecCod)" ;
      if ( ! (0==AV73Tdevpie1wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV74Tdevpie1wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Tdevpie1wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Tdevpie1wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Tdevpie1wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tdevpie1wwds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV78Tdevpie1wwds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tdevpie1wwds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tdevpie1wwds_10_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV80Tdevpie1wwds_9_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tdevpie1wwds_10_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tdevpie1wwds_12_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Tdevpie1wwds_11_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tdevpie1wwds_12_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tdevpie1wwds_13_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tdevpie1wwds_14_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( AV86Tdevpie1wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Tdevpie1wwds_15_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV87Tdevpie1wwds_16_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV88Tdevpie1wwds_17_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tdevpie1wwds_19_tfemprtrn_sel)==0) && ( ! (GXutil.strcmp("", AV89Tdevpie1wwds_18_tfemprtrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTrn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tdevpie1wwds_19_tfemprtrn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTrn = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DevGenTrn" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P086H5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV86Tdevpie1wwds_15_tfalbruni_sels ,
                                          int AV73Tdevpie1wwds_2_tfdevgencod ,
                                          int AV74Tdevpie1wwds_3_tfdevgencod_to ,
                                          java.util.Date AV75Tdevpie1wwds_4_tfdevgenfec ,
                                          int AV76Tdevpie1wwds_5_tfalbreccod ,
                                          int AV77Tdevpie1wwds_6_tfalbreccod_to ,
                                          String AV79Tdevpie1wwds_8_tfclinom_sel ,
                                          String AV78Tdevpie1wwds_7_tfclinom ,
                                          String AV81Tdevpie1wwds_10_tfalbref_sel ,
                                          String AV80Tdevpie1wwds_9_tfalbref ,
                                          String AV83Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                          String AV82Tdevpie1wwds_11_tfdevtrnnom ,
                                          java.math.BigDecimal AV84Tdevpie1wwds_13_tfdevgenuni ,
                                          java.math.BigDecimal AV85Tdevpie1wwds_14_tfdevgenuni_to ,
                                          int AV86Tdevpie1wwds_15_tfalbruni_sels_size ,
                                          short AV87Tdevpie1wwds_16_tfdevgenpie ,
                                          short AV88Tdevpie1wwds_17_tfdevgenpie_to ,
                                          String AV90Tdevpie1wwds_19_tfemprtrn_sel ,
                                          String AV89Tdevpie1wwds_18_tfemprtrn ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String A410EmprTrn ,
                                          String AV72Tdevpie1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[17];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.DevGenTrn AS DevGenTrn, T1.EmprTrn, T1.DevGenPie, T1.DevGenUni, T3.TrnNom AS DevTrnNom, T4.AlbRef, T2.CliNom, T1.AlbRecCod, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T4.AlbRUni FROM (((TXPDEVGEN T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TrnCod = T1.DevGenTrn) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod = T1.AlbRecCod)" ;
      if ( ! (0==AV73Tdevpie1wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV74Tdevpie1wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Tdevpie1wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Tdevpie1wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Tdevpie1wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tdevpie1wwds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV78Tdevpie1wwds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tdevpie1wwds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tdevpie1wwds_10_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV80Tdevpie1wwds_9_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tdevpie1wwds_10_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tdevpie1wwds_12_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Tdevpie1wwds_11_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tdevpie1wwds_12_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tdevpie1wwds_13_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tdevpie1wwds_14_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( AV86Tdevpie1wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Tdevpie1wwds_15_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV87Tdevpie1wwds_16_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV88Tdevpie1wwds_17_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tdevpie1wwds_19_tfemprtrn_sel)==0) && ( ! (GXutil.strcmp("", AV89Tdevpie1wwds_18_tfemprtrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTrn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tdevpie1wwds_19_tfemprtrn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTrn = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprTrn" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P086H2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P086H3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P086H4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 3 :
                  return conditional_P086H5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086H4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086H5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 16);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 16);
               ((String[]) buf[16])[0] = rslt.getString(10, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 16);
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 16);
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               return;
      }
   }

}

