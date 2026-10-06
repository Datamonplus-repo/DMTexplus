package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class nwdpalmacentejidowwgetfilterdata extends GXProcedure
{
   public nwdpalmacentejidowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpalmacentejidowwgetfilterdata.class ), "" );
   }

   public nwdpalmacentejidowwgetfilterdata( int remoteHandle ,
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
      nwdpalmacentejidowwgetfilterdata.this.aP5 = new String[] {""};
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
      nwdpalmacentejidowwgetfilterdata.this.AV32DDOName = aP0;
      nwdpalmacentejidowwgetfilterdata.this.AV30SearchTxt = aP1;
      nwdpalmacentejidowwgetfilterdata.this.AV31SearchTxtTo = aP2;
      nwdpalmacentejidowwgetfilterdata.this.aP3 = aP3;
      nwdpalmacentejidowwgetfilterdata.this.aP4 = aP4;
      nwdpalmacentejidowwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DISARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DISUNIMED") == 0 )
      {
         /* Execute user subroutine: 'LOADDISUNIMEDOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DISLOC") == 0 )
      {
         /* Execute user subroutine: 'LOADDISLOCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DISCLINUM") == 0 )
      {
         /* Execute user subroutine: 'LOADDISCLINUMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("NwDPAlmacenTejidoWWGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "NwDPAlmacenTejidoWWGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("NwDPAlmacenTejidoWWGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV12TFDisCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFDisCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISDES_SEL") == 0 )
         {
            AV15TFDisDes_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV16TFCliCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCliCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV18TFDisArtCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV19TFDisArtCod_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTOTREC") == 0 )
         {
            AV20TFDisTotRec = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFDisTotRec_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV22TFDisUniMed = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV23TFDisUniMed_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC") == 0 )
         {
            AV24TFDisLoc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC_SEL") == 0 )
         {
            AV25TFDisLoc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV26TFDisCliNum = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV27TFDisCliNum_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV28TFDisCanRec = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFDisCanRec_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV30SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV53Nwdpalmacentejidowwds_1_filterfulltext = AV48FilterFullText ;
      AV54Nwdpalmacentejidowwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Nwdpalmacentejidowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Nwdpalmacentejidowwds_4_tfdiscod = AV12TFDisCod ;
      AV57Nwdpalmacentejidowwds_5_tfdiscod_to = AV13TFDisCod_To ;
      AV58Nwdpalmacentejidowwds_6_tfdisdes_sel = AV15TFDisDes_Sel ;
      AV59Nwdpalmacentejidowwds_7_tfclicod = AV16TFCliCod ;
      AV60Nwdpalmacentejidowwds_8_tfclicod_to = AV17TFCliCod_To ;
      AV61Nwdpalmacentejidowwds_9_tfdisartcod = AV18TFDisArtCod ;
      AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV19TFDisArtCod_Sel ;
      AV63Nwdpalmacentejidowwds_11_tfdistotrec = AV20TFDisTotRec ;
      AV64Nwdpalmacentejidowwds_12_tfdistotrec_to = AV21TFDisTotRec_To ;
      AV65Nwdpalmacentejidowwds_13_tfdisunimed = AV22TFDisUniMed ;
      AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV23TFDisUniMed_Sel ;
      AV67Nwdpalmacentejidowwds_15_tfdisloc = AV24TFDisLoc ;
      AV68Nwdpalmacentejidowwds_16_tfdisloc_sel = AV25TFDisLoc_Sel ;
      AV69Nwdpalmacentejidowwds_17_tfdisclinum = AV26TFDisCliNum ;
      AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV27TFDisCliNum_Sel ;
      AV71Nwdpalmacentejidowwds_19_tfdiscanrec = AV28TFDisCanRec ;
      AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV29TFDisCanRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod) ,
                                           Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                           AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod) ,
                                           Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                           AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                           Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                           AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                           AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A365DisDes ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           Integer.valueOf(A13733DisTotRec) ,
                                           A392DisUniMed ,
                                           A1430DisLoc ,
                                           A360DisCliNum ,
                                           AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                           Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV54Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
      lV61Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV61Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
      lV65Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV65Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
      lV67Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV67Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
      lV69Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV69Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
      /* Using cursor P08E24 */
      pr_default.execute(0, new Object[] {AV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV54Nwdpalmacentejidowwds_2_tfemprcod, AV55Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to), AV58Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to), lV61Nwdpalmacentejidowwds_9_tfdisartcod, AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to), lV65Nwdpalmacentejidowwds_13_tfdisunimed, AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV67Nwdpalmacentejidowwds_15_tfdisloc, AV68Nwdpalmacentejidowwds_16_tfdisloc_sel, lV69Nwdpalmacentejidowwds_17_tfdisclinum, AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8E22 = false ;
         A396EmprCod = P08E24_A396EmprCod[0] ;
         A360DisCliNum = P08E24_A360DisCliNum[0] ;
         A1430DisLoc = P08E24_A1430DisLoc[0] ;
         A392DisUniMed = P08E24_A392DisUniMed[0] ;
         A335DisArtCod = P08E24_A335DisArtCod[0] ;
         A252CliCod = P08E24_A252CliCod[0] ;
         A365DisDes = P08E24_A365DisDes[0] ;
         A361DisCod = P08E24_A361DisCod[0] ;
         A13732DisCanRec = P08E24_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E24_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E24_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E24_n13733DisTotRec[0] ;
         A13732DisCanRec = P08E24_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E24_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E24_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E24_n13733DisTotRec[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08E24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8E22 = false ;
            A361DisCod = P08E24_A361DisCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8E22 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV34Option = A396EmprCod ;
            AV37OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV35Options.add(AV34Option, 0);
            AV38OptionsDesc.add(AV37OptionDesc, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8E22 )
         {
            brk8E22 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDISARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFDisArtCod = AV30SearchTxt ;
      AV19TFDisArtCod_Sel = "" ;
      AV53Nwdpalmacentejidowwds_1_filterfulltext = AV48FilterFullText ;
      AV54Nwdpalmacentejidowwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Nwdpalmacentejidowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Nwdpalmacentejidowwds_4_tfdiscod = AV12TFDisCod ;
      AV57Nwdpalmacentejidowwds_5_tfdiscod_to = AV13TFDisCod_To ;
      AV58Nwdpalmacentejidowwds_6_tfdisdes_sel = AV15TFDisDes_Sel ;
      AV59Nwdpalmacentejidowwds_7_tfclicod = AV16TFCliCod ;
      AV60Nwdpalmacentejidowwds_8_tfclicod_to = AV17TFCliCod_To ;
      AV61Nwdpalmacentejidowwds_9_tfdisartcod = AV18TFDisArtCod ;
      AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV19TFDisArtCod_Sel ;
      AV63Nwdpalmacentejidowwds_11_tfdistotrec = AV20TFDisTotRec ;
      AV64Nwdpalmacentejidowwds_12_tfdistotrec_to = AV21TFDisTotRec_To ;
      AV65Nwdpalmacentejidowwds_13_tfdisunimed = AV22TFDisUniMed ;
      AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV23TFDisUniMed_Sel ;
      AV67Nwdpalmacentejidowwds_15_tfdisloc = AV24TFDisLoc ;
      AV68Nwdpalmacentejidowwds_16_tfdisloc_sel = AV25TFDisLoc_Sel ;
      AV69Nwdpalmacentejidowwds_17_tfdisclinum = AV26TFDisCliNum ;
      AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV27TFDisCliNum_Sel ;
      AV71Nwdpalmacentejidowwds_19_tfdiscanrec = AV28TFDisCanRec ;
      AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV29TFDisCanRec_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod) ,
                                           Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                           AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod) ,
                                           Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                           AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                           Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                           AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                           AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A365DisDes ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           Integer.valueOf(A13733DisTotRec) ,
                                           A392DisUniMed ,
                                           A1430DisLoc ,
                                           A360DisCliNum ,
                                           AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                           Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV54Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
      lV61Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV61Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
      lV65Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV65Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
      lV67Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV67Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
      lV69Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV69Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
      /* Using cursor P08E27 */
      pr_default.execute(1, new Object[] {AV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV54Nwdpalmacentejidowwds_2_tfemprcod, AV55Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to), AV58Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to), lV61Nwdpalmacentejidowwds_9_tfdisartcod, AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to), lV65Nwdpalmacentejidowwds_13_tfdisunimed, AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV67Nwdpalmacentejidowwds_15_tfdisloc, AV68Nwdpalmacentejidowwds_16_tfdisloc_sel, lV69Nwdpalmacentejidowwds_17_tfdisclinum, AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8E24 = false ;
         A335DisArtCod = P08E27_A335DisArtCod[0] ;
         A360DisCliNum = P08E27_A360DisCliNum[0] ;
         A1430DisLoc = P08E27_A1430DisLoc[0] ;
         A392DisUniMed = P08E27_A392DisUniMed[0] ;
         A252CliCod = P08E27_A252CliCod[0] ;
         A365DisDes = P08E27_A365DisDes[0] ;
         A361DisCod = P08E27_A361DisCod[0] ;
         A396EmprCod = P08E27_A396EmprCod[0] ;
         A13732DisCanRec = P08E27_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E27_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E27_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E27_n13733DisTotRec[0] ;
         A13732DisCanRec = P08E27_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E27_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E27_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E27_n13733DisTotRec[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08E27_A335DisArtCod[0], A335DisArtCod) == 0 ) )
         {
            brk8E24 = false ;
            A361DisCod = P08E27_A361DisCod[0] ;
            A396EmprCod = P08E27_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8E24 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A335DisArtCod)==0) )
         {
            AV34Option = A335DisArtCod ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8E24 )
         {
            brk8E24 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDISUNIMEDOPTIONS' Routine */
      returnInSub = false ;
      AV22TFDisUniMed = AV30SearchTxt ;
      AV23TFDisUniMed_Sel = "" ;
      AV53Nwdpalmacentejidowwds_1_filterfulltext = AV48FilterFullText ;
      AV54Nwdpalmacentejidowwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Nwdpalmacentejidowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Nwdpalmacentejidowwds_4_tfdiscod = AV12TFDisCod ;
      AV57Nwdpalmacentejidowwds_5_tfdiscod_to = AV13TFDisCod_To ;
      AV58Nwdpalmacentejidowwds_6_tfdisdes_sel = AV15TFDisDes_Sel ;
      AV59Nwdpalmacentejidowwds_7_tfclicod = AV16TFCliCod ;
      AV60Nwdpalmacentejidowwds_8_tfclicod_to = AV17TFCliCod_To ;
      AV61Nwdpalmacentejidowwds_9_tfdisartcod = AV18TFDisArtCod ;
      AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV19TFDisArtCod_Sel ;
      AV63Nwdpalmacentejidowwds_11_tfdistotrec = AV20TFDisTotRec ;
      AV64Nwdpalmacentejidowwds_12_tfdistotrec_to = AV21TFDisTotRec_To ;
      AV65Nwdpalmacentejidowwds_13_tfdisunimed = AV22TFDisUniMed ;
      AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV23TFDisUniMed_Sel ;
      AV67Nwdpalmacentejidowwds_15_tfdisloc = AV24TFDisLoc ;
      AV68Nwdpalmacentejidowwds_16_tfdisloc_sel = AV25TFDisLoc_Sel ;
      AV69Nwdpalmacentejidowwds_17_tfdisclinum = AV26TFDisCliNum ;
      AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV27TFDisCliNum_Sel ;
      AV71Nwdpalmacentejidowwds_19_tfdiscanrec = AV28TFDisCanRec ;
      AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV29TFDisCanRec_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod) ,
                                           Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                           AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod) ,
                                           Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                           AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                           Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                           AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                           AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A365DisDes ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           Integer.valueOf(A13733DisTotRec) ,
                                           A392DisUniMed ,
                                           A1430DisLoc ,
                                           A360DisCliNum ,
                                           AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                           Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV54Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
      lV61Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV61Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
      lV65Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV65Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
      lV67Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV67Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
      lV69Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV69Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
      /* Using cursor P08E210 */
      pr_default.execute(2, new Object[] {AV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV54Nwdpalmacentejidowwds_2_tfemprcod, AV55Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to), AV58Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to), lV61Nwdpalmacentejidowwds_9_tfdisartcod, AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to), lV65Nwdpalmacentejidowwds_13_tfdisunimed, AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV67Nwdpalmacentejidowwds_15_tfdisloc, AV68Nwdpalmacentejidowwds_16_tfdisloc_sel, lV69Nwdpalmacentejidowwds_17_tfdisclinum, AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8E26 = false ;
         A392DisUniMed = P08E210_A392DisUniMed[0] ;
         A360DisCliNum = P08E210_A360DisCliNum[0] ;
         A1430DisLoc = P08E210_A1430DisLoc[0] ;
         A335DisArtCod = P08E210_A335DisArtCod[0] ;
         A252CliCod = P08E210_A252CliCod[0] ;
         A365DisDes = P08E210_A365DisDes[0] ;
         A361DisCod = P08E210_A361DisCod[0] ;
         A396EmprCod = P08E210_A396EmprCod[0] ;
         A13732DisCanRec = P08E210_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E210_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E210_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E210_n13733DisTotRec[0] ;
         A13732DisCanRec = P08E210_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E210_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E210_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E210_n13733DisTotRec[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08E210_A392DisUniMed[0], A392DisUniMed) == 0 ) )
         {
            brk8E26 = false ;
            A361DisCod = P08E210_A361DisCod[0] ;
            A396EmprCod = P08E210_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8E26 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A392DisUniMed)==0) )
         {
            AV34Option = A392DisUniMed ;
            AV37OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A392DisUniMed, "@!"))) ;
            AV35Options.add(AV34Option, 0);
            AV38OptionsDesc.add(AV37OptionDesc, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8E26 )
         {
            brk8E26 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADDISLOCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFDisLoc = AV30SearchTxt ;
      AV25TFDisLoc_Sel = "" ;
      AV53Nwdpalmacentejidowwds_1_filterfulltext = AV48FilterFullText ;
      AV54Nwdpalmacentejidowwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Nwdpalmacentejidowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Nwdpalmacentejidowwds_4_tfdiscod = AV12TFDisCod ;
      AV57Nwdpalmacentejidowwds_5_tfdiscod_to = AV13TFDisCod_To ;
      AV58Nwdpalmacentejidowwds_6_tfdisdes_sel = AV15TFDisDes_Sel ;
      AV59Nwdpalmacentejidowwds_7_tfclicod = AV16TFCliCod ;
      AV60Nwdpalmacentejidowwds_8_tfclicod_to = AV17TFCliCod_To ;
      AV61Nwdpalmacentejidowwds_9_tfdisartcod = AV18TFDisArtCod ;
      AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV19TFDisArtCod_Sel ;
      AV63Nwdpalmacentejidowwds_11_tfdistotrec = AV20TFDisTotRec ;
      AV64Nwdpalmacentejidowwds_12_tfdistotrec_to = AV21TFDisTotRec_To ;
      AV65Nwdpalmacentejidowwds_13_tfdisunimed = AV22TFDisUniMed ;
      AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV23TFDisUniMed_Sel ;
      AV67Nwdpalmacentejidowwds_15_tfdisloc = AV24TFDisLoc ;
      AV68Nwdpalmacentejidowwds_16_tfdisloc_sel = AV25TFDisLoc_Sel ;
      AV69Nwdpalmacentejidowwds_17_tfdisclinum = AV26TFDisCliNum ;
      AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV27TFDisCliNum_Sel ;
      AV71Nwdpalmacentejidowwds_19_tfdiscanrec = AV28TFDisCanRec ;
      AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV29TFDisCanRec_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod) ,
                                           Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                           AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod) ,
                                           Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                           AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                           Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                           AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                           AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A365DisDes ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           Integer.valueOf(A13733DisTotRec) ,
                                           A392DisUniMed ,
                                           A1430DisLoc ,
                                           A360DisCliNum ,
                                           AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                           Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV54Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
      lV61Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV61Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
      lV65Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV65Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
      lV67Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV67Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
      lV69Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV69Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
      /* Using cursor P08E213 */
      pr_default.execute(3, new Object[] {AV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV54Nwdpalmacentejidowwds_2_tfemprcod, AV55Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to), AV58Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to), lV61Nwdpalmacentejidowwds_9_tfdisartcod, AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to), lV65Nwdpalmacentejidowwds_13_tfdisunimed, AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV67Nwdpalmacentejidowwds_15_tfdisloc, AV68Nwdpalmacentejidowwds_16_tfdisloc_sel, lV69Nwdpalmacentejidowwds_17_tfdisclinum, AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8E28 = false ;
         A1430DisLoc = P08E213_A1430DisLoc[0] ;
         A360DisCliNum = P08E213_A360DisCliNum[0] ;
         A392DisUniMed = P08E213_A392DisUniMed[0] ;
         A335DisArtCod = P08E213_A335DisArtCod[0] ;
         A252CliCod = P08E213_A252CliCod[0] ;
         A365DisDes = P08E213_A365DisDes[0] ;
         A361DisCod = P08E213_A361DisCod[0] ;
         A396EmprCod = P08E213_A396EmprCod[0] ;
         A13732DisCanRec = P08E213_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E213_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E213_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E213_n13733DisTotRec[0] ;
         A13732DisCanRec = P08E213_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E213_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E213_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E213_n13733DisTotRec[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08E213_A1430DisLoc[0], A1430DisLoc) == 0 ) )
         {
            brk8E28 = false ;
            A361DisCod = P08E213_A361DisCod[0] ;
            A396EmprCod = P08E213_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8E28 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1430DisLoc)==0) )
         {
            AV34Option = A1430DisLoc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8E28 )
         {
            brk8E28 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADDISCLINUMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFDisCliNum = AV30SearchTxt ;
      AV27TFDisCliNum_Sel = "" ;
      AV53Nwdpalmacentejidowwds_1_filterfulltext = AV48FilterFullText ;
      AV54Nwdpalmacentejidowwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Nwdpalmacentejidowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Nwdpalmacentejidowwds_4_tfdiscod = AV12TFDisCod ;
      AV57Nwdpalmacentejidowwds_5_tfdiscod_to = AV13TFDisCod_To ;
      AV58Nwdpalmacentejidowwds_6_tfdisdes_sel = AV15TFDisDes_Sel ;
      AV59Nwdpalmacentejidowwds_7_tfclicod = AV16TFCliCod ;
      AV60Nwdpalmacentejidowwds_8_tfclicod_to = AV17TFCliCod_To ;
      AV61Nwdpalmacentejidowwds_9_tfdisartcod = AV18TFDisArtCod ;
      AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV19TFDisArtCod_Sel ;
      AV63Nwdpalmacentejidowwds_11_tfdistotrec = AV20TFDisTotRec ;
      AV64Nwdpalmacentejidowwds_12_tfdistotrec_to = AV21TFDisTotRec_To ;
      AV65Nwdpalmacentejidowwds_13_tfdisunimed = AV22TFDisUniMed ;
      AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV23TFDisUniMed_Sel ;
      AV67Nwdpalmacentejidowwds_15_tfdisloc = AV24TFDisLoc ;
      AV68Nwdpalmacentejidowwds_16_tfdisloc_sel = AV25TFDisLoc_Sel ;
      AV69Nwdpalmacentejidowwds_17_tfdisclinum = AV26TFDisCliNum ;
      AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV27TFDisCliNum_Sel ;
      AV71Nwdpalmacentejidowwds_19_tfdiscanrec = AV28TFDisCanRec ;
      AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV29TFDisCanRec_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod) ,
                                           Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                           AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod) ,
                                           Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                           AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                           Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                           AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                           AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A365DisDes ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           Integer.valueOf(A13733DisTotRec) ,
                                           A392DisUniMed ,
                                           A1430DisLoc ,
                                           A360DisCliNum ,
                                           AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                           Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV54Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
      lV61Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV61Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
      lV65Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV65Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
      lV67Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV67Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
      lV69Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV69Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
      /* Using cursor P08E216 */
      pr_default.execute(4, new Object[] {AV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, lV53Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV71Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV54Nwdpalmacentejidowwds_2_tfemprcod, AV55Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV56Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV57Nwdpalmacentejidowwds_5_tfdiscod_to), AV58Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV59Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV60Nwdpalmacentejidowwds_8_tfclicod_to), lV61Nwdpalmacentejidowwds_9_tfdisartcod, AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV63Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV64Nwdpalmacentejidowwds_12_tfdistotrec_to), lV65Nwdpalmacentejidowwds_13_tfdisunimed, AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV67Nwdpalmacentejidowwds_15_tfdisloc, AV68Nwdpalmacentejidowwds_16_tfdisloc_sel, lV69Nwdpalmacentejidowwds_17_tfdisclinum, AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8E210 = false ;
         A360DisCliNum = P08E216_A360DisCliNum[0] ;
         A1430DisLoc = P08E216_A1430DisLoc[0] ;
         A392DisUniMed = P08E216_A392DisUniMed[0] ;
         A335DisArtCod = P08E216_A335DisArtCod[0] ;
         A252CliCod = P08E216_A252CliCod[0] ;
         A365DisDes = P08E216_A365DisDes[0] ;
         A361DisCod = P08E216_A361DisCod[0] ;
         A396EmprCod = P08E216_A396EmprCod[0] ;
         A13732DisCanRec = P08E216_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E216_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E216_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E216_n13733DisTotRec[0] ;
         A13732DisCanRec = P08E216_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E216_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E216_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E216_n13733DisTotRec[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08E216_A360DisCliNum[0], A360DisCliNum) == 0 ) )
         {
            brk8E210 = false ;
            A361DisCod = P08E216_A361DisCod[0] ;
            A396EmprCod = P08E216_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8E210 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A360DisCliNum)==0) )
         {
            AV34Option = A360DisCliNum ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8E210 )
         {
            brk8E210 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = nwdpalmacentejidowwgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = nwdpalmacentejidowwgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = nwdpalmacentejidowwgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV15TFDisDes_Sel = "" ;
      AV18TFDisArtCod = "" ;
      AV19TFDisArtCod_Sel = "" ;
      AV22TFDisUniMed = "" ;
      AV23TFDisUniMed_Sel = "" ;
      AV24TFDisLoc = "" ;
      AV25TFDisLoc_Sel = "" ;
      AV26TFDisCliNum = "" ;
      AV27TFDisCliNum_Sel = "" ;
      A396EmprCod = "" ;
      AV53Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      AV54Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      AV55Nwdpalmacentejidowwds_3_tfemprcod_sel = "" ;
      AV58Nwdpalmacentejidowwds_6_tfdisdes_sel = "" ;
      AV61Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel = "" ;
      AV65Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel = "" ;
      AV67Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      AV68Nwdpalmacentejidowwds_16_tfdisloc_sel = "" ;
      AV69Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel = "" ;
      lV53Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV54Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      lV61Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      lV65Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      lV67Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      lV69Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      A365DisDes = "" ;
      A335DisArtCod = "" ;
      A392DisUniMed = "" ;
      A1430DisLoc = "" ;
      A360DisCliNum = "" ;
      P08E24_A396EmprCod = new String[] {""} ;
      P08E24_A360DisCliNum = new String[] {""} ;
      P08E24_A1430DisLoc = new String[] {""} ;
      P08E24_A392DisUniMed = new String[] {""} ;
      P08E24_A335DisArtCod = new String[] {""} ;
      P08E24_A252CliCod = new int[1] ;
      P08E24_A365DisDes = new String[] {""} ;
      P08E24_A361DisCod = new int[1] ;
      P08E24_A13732DisCanRec = new short[1] ;
      P08E24_n13732DisCanRec = new boolean[] {false} ;
      P08E24_A13733DisTotRec = new int[1] ;
      P08E24_n13733DisTotRec = new boolean[] {false} ;
      AV34Option = "" ;
      AV37OptionDesc = "" ;
      P08E27_A335DisArtCod = new String[] {""} ;
      P08E27_A360DisCliNum = new String[] {""} ;
      P08E27_A1430DisLoc = new String[] {""} ;
      P08E27_A392DisUniMed = new String[] {""} ;
      P08E27_A252CliCod = new int[1] ;
      P08E27_A365DisDes = new String[] {""} ;
      P08E27_A361DisCod = new int[1] ;
      P08E27_A396EmprCod = new String[] {""} ;
      P08E27_A13732DisCanRec = new short[1] ;
      P08E27_n13732DisCanRec = new boolean[] {false} ;
      P08E27_A13733DisTotRec = new int[1] ;
      P08E27_n13733DisTotRec = new boolean[] {false} ;
      P08E210_A392DisUniMed = new String[] {""} ;
      P08E210_A360DisCliNum = new String[] {""} ;
      P08E210_A1430DisLoc = new String[] {""} ;
      P08E210_A335DisArtCod = new String[] {""} ;
      P08E210_A252CliCod = new int[1] ;
      P08E210_A365DisDes = new String[] {""} ;
      P08E210_A361DisCod = new int[1] ;
      P08E210_A396EmprCod = new String[] {""} ;
      P08E210_A13732DisCanRec = new short[1] ;
      P08E210_n13732DisCanRec = new boolean[] {false} ;
      P08E210_A13733DisTotRec = new int[1] ;
      P08E210_n13733DisTotRec = new boolean[] {false} ;
      P08E213_A1430DisLoc = new String[] {""} ;
      P08E213_A360DisCliNum = new String[] {""} ;
      P08E213_A392DisUniMed = new String[] {""} ;
      P08E213_A335DisArtCod = new String[] {""} ;
      P08E213_A252CliCod = new int[1] ;
      P08E213_A365DisDes = new String[] {""} ;
      P08E213_A361DisCod = new int[1] ;
      P08E213_A396EmprCod = new String[] {""} ;
      P08E213_A13732DisCanRec = new short[1] ;
      P08E213_n13732DisCanRec = new boolean[] {false} ;
      P08E213_A13733DisTotRec = new int[1] ;
      P08E213_n13733DisTotRec = new boolean[] {false} ;
      P08E216_A360DisCliNum = new String[] {""} ;
      P08E216_A1430DisLoc = new String[] {""} ;
      P08E216_A392DisUniMed = new String[] {""} ;
      P08E216_A335DisArtCod = new String[] {""} ;
      P08E216_A252CliCod = new int[1] ;
      P08E216_A365DisDes = new String[] {""} ;
      P08E216_A361DisCod = new int[1] ;
      P08E216_A396EmprCod = new String[] {""} ;
      P08E216_A13732DisCanRec = new short[1] ;
      P08E216_n13732DisCanRec = new boolean[] {false} ;
      P08E216_A13733DisTotRec = new int[1] ;
      P08E216_n13733DisTotRec = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejidowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08E24_A396EmprCod, P08E24_A360DisCliNum, P08E24_A1430DisLoc, P08E24_A392DisUniMed, P08E24_A335DisArtCod, P08E24_A252CliCod, P08E24_A365DisDes, P08E24_A361DisCod, P08E24_A13732DisCanRec, P08E24_n13732DisCanRec,
            P08E24_A13733DisTotRec, P08E24_n13733DisTotRec
            }
            , new Object[] {
            P08E27_A335DisArtCod, P08E27_A360DisCliNum, P08E27_A1430DisLoc, P08E27_A392DisUniMed, P08E27_A252CliCod, P08E27_A365DisDes, P08E27_A361DisCod, P08E27_A396EmprCod, P08E27_A13732DisCanRec, P08E27_n13732DisCanRec,
            P08E27_A13733DisTotRec, P08E27_n13733DisTotRec
            }
            , new Object[] {
            P08E210_A392DisUniMed, P08E210_A360DisCliNum, P08E210_A1430DisLoc, P08E210_A335DisArtCod, P08E210_A252CliCod, P08E210_A365DisDes, P08E210_A361DisCod, P08E210_A396EmprCod, P08E210_A13732DisCanRec, P08E210_n13732DisCanRec,
            P08E210_A13733DisTotRec, P08E210_n13733DisTotRec
            }
            , new Object[] {
            P08E213_A1430DisLoc, P08E213_A360DisCliNum, P08E213_A392DisUniMed, P08E213_A335DisArtCod, P08E213_A252CliCod, P08E213_A365DisDes, P08E213_A361DisCod, P08E213_A396EmprCod, P08E213_A13732DisCanRec, P08E213_n13732DisCanRec,
            P08E213_A13733DisTotRec, P08E213_n13733DisTotRec
            }
            , new Object[] {
            P08E216_A360DisCliNum, P08E216_A1430DisLoc, P08E216_A392DisUniMed, P08E216_A335DisArtCod, P08E216_A252CliCod, P08E216_A365DisDes, P08E216_A361DisCod, P08E216_A396EmprCod, P08E216_A13732DisCanRec, P08E216_n13732DisCanRec,
            P08E216_A13733DisTotRec, P08E216_n13733DisTotRec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV28TFDisCanRec ;
   private short AV29TFDisCanRec_To ;
   private short AV71Nwdpalmacentejidowwds_19_tfdiscanrec ;
   private short AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to ;
   private short A13732DisCanRec ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV12TFDisCod ;
   private int AV13TFDisCod_To ;
   private int AV16TFCliCod ;
   private int AV17TFCliCod_To ;
   private int AV20TFDisTotRec ;
   private int AV21TFDisTotRec_To ;
   private int AV56Nwdpalmacentejidowwds_4_tfdiscod ;
   private int AV57Nwdpalmacentejidowwds_5_tfdiscod_to ;
   private int AV59Nwdpalmacentejidowwds_7_tfclicod ;
   private int AV60Nwdpalmacentejidowwds_8_tfclicod_to ;
   private int AV63Nwdpalmacentejidowwds_11_tfdistotrec ;
   private int AV64Nwdpalmacentejidowwds_12_tfdistotrec_to ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A13733DisTotRec ;
   private long AV42count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV15TFDisDes_Sel ;
   private String AV18TFDisArtCod ;
   private String AV19TFDisArtCod_Sel ;
   private String AV22TFDisUniMed ;
   private String AV23TFDisUniMed_Sel ;
   private String AV24TFDisLoc ;
   private String AV25TFDisLoc_Sel ;
   private String AV26TFDisCliNum ;
   private String AV27TFDisCliNum_Sel ;
   private String A396EmprCod ;
   private String AV54Nwdpalmacentejidowwds_2_tfemprcod ;
   private String AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ;
   private String AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ;
   private String AV61Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ;
   private String AV65Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ;
   private String AV67Nwdpalmacentejidowwds_15_tfdisloc ;
   private String AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ;
   private String AV69Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ;
   private String scmdbuf ;
   private String lV54Nwdpalmacentejidowwds_2_tfemprcod ;
   private String lV61Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String lV65Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String lV67Nwdpalmacentejidowwds_15_tfdisloc ;
   private String lV69Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String A365DisDes ;
   private String A335DisArtCod ;
   private String A392DisUniMed ;
   private String A1430DisLoc ;
   private String A360DisCliNum ;
   private boolean returnInSub ;
   private boolean brk8E22 ;
   private boolean n13732DisCanRec ;
   private boolean n13733DisTotRec ;
   private boolean brk8E24 ;
   private boolean brk8E26 ;
   private boolean brk8E28 ;
   private boolean brk8E210 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV53Nwdpalmacentejidowwds_1_filterfulltext ;
   private String lV53Nwdpalmacentejidowwds_1_filterfulltext ;
   private String AV34Option ;
   private String AV37OptionDesc ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08E24_A396EmprCod ;
   private String[] P08E24_A360DisCliNum ;
   private String[] P08E24_A1430DisLoc ;
   private String[] P08E24_A392DisUniMed ;
   private String[] P08E24_A335DisArtCod ;
   private int[] P08E24_A252CliCod ;
   private String[] P08E24_A365DisDes ;
   private int[] P08E24_A361DisCod ;
   private short[] P08E24_A13732DisCanRec ;
   private boolean[] P08E24_n13732DisCanRec ;
   private int[] P08E24_A13733DisTotRec ;
   private boolean[] P08E24_n13733DisTotRec ;
   private String[] P08E27_A335DisArtCod ;
   private String[] P08E27_A360DisCliNum ;
   private String[] P08E27_A1430DisLoc ;
   private String[] P08E27_A392DisUniMed ;
   private int[] P08E27_A252CliCod ;
   private String[] P08E27_A365DisDes ;
   private int[] P08E27_A361DisCod ;
   private String[] P08E27_A396EmprCod ;
   private short[] P08E27_A13732DisCanRec ;
   private boolean[] P08E27_n13732DisCanRec ;
   private int[] P08E27_A13733DisTotRec ;
   private boolean[] P08E27_n13733DisTotRec ;
   private String[] P08E210_A392DisUniMed ;
   private String[] P08E210_A360DisCliNum ;
   private String[] P08E210_A1430DisLoc ;
   private String[] P08E210_A335DisArtCod ;
   private int[] P08E210_A252CliCod ;
   private String[] P08E210_A365DisDes ;
   private int[] P08E210_A361DisCod ;
   private String[] P08E210_A396EmprCod ;
   private short[] P08E210_A13732DisCanRec ;
   private boolean[] P08E210_n13732DisCanRec ;
   private int[] P08E210_A13733DisTotRec ;
   private boolean[] P08E210_n13733DisTotRec ;
   private String[] P08E213_A1430DisLoc ;
   private String[] P08E213_A360DisCliNum ;
   private String[] P08E213_A392DisUniMed ;
   private String[] P08E213_A335DisArtCod ;
   private int[] P08E213_A252CliCod ;
   private String[] P08E213_A365DisDes ;
   private int[] P08E213_A361DisCod ;
   private String[] P08E213_A396EmprCod ;
   private short[] P08E213_A13732DisCanRec ;
   private boolean[] P08E213_n13732DisCanRec ;
   private int[] P08E213_A13733DisTotRec ;
   private boolean[] P08E213_n13733DisTotRec ;
   private String[] P08E216_A360DisCliNum ;
   private String[] P08E216_A1430DisLoc ;
   private String[] P08E216_A392DisUniMed ;
   private String[] P08E216_A335DisArtCod ;
   private int[] P08E216_A252CliCod ;
   private String[] P08E216_A365DisDes ;
   private int[] P08E216_A361DisCod ;
   private String[] P08E216_A396EmprCod ;
   private short[] P08E216_A13732DisCanRec ;
   private boolean[] P08E216_n13732DisCanRec ;
   private int[] P08E216_A13733DisTotRec ;
   private boolean[] P08E216_n13733DisTotRec ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class nwdpalmacentejidowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08E24( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                          String AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                          int AV56Nwdpalmacentejidowwds_4_tfdiscod ,
                                          int AV57Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                          String AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                          int AV59Nwdpalmacentejidowwds_7_tfclicod ,
                                          int AV60Nwdpalmacentejidowwds_8_tfclicod_to ,
                                          String AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                          String AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                          int AV63Nwdpalmacentejidowwds_11_tfdistotrec ,
                                          int AV64Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                          String AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                          String AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                          String AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                          String AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                          String AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                          String AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          String A365DisDes ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          int A13733DisTotRec ,
                                          String A392DisUniMed ,
                                          String A1430DisLoc ,
                                          String A360DisCliNum ,
                                          String AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                          short A13732DisCanRec ,
                                          short AV71Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                          short AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[31];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisCliNum, T1.DisLoc, T1.DisUniMed, T1.DisArtCod, T1.CliCod, T1.DisDes, T1.DisCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisCanRec," ;
      scmdbuf += " 0) AS DisTotRec FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod" ;
      scmdbuf += " AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT" ;
      scmdbuf += " COUNT(*) AS DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV56Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV57Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV59Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV60Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV65Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08E27( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                          String AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                          int AV56Nwdpalmacentejidowwds_4_tfdiscod ,
                                          int AV57Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                          String AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                          int AV59Nwdpalmacentejidowwds_7_tfclicod ,
                                          int AV60Nwdpalmacentejidowwds_8_tfclicod_to ,
                                          String AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                          String AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                          int AV63Nwdpalmacentejidowwds_11_tfdistotrec ,
                                          int AV64Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                          String AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                          String AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                          String AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                          String AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                          String AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                          String AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          String A365DisDes ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          int A13733DisTotRec ,
                                          String A392DisUniMed ,
                                          String A1430DisLoc ,
                                          String A360DisCliNum ,
                                          String AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                          short A13732DisCanRec ,
                                          short AV71Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                          short AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[31];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.DisArtCod, T1.DisCliNum, T1.DisLoc, T1.DisUniMed, T1.CliCod, T1.DisDes, T1.DisCod, T1.EmprCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisCanRec," ;
      scmdbuf += " 0) AS DisTotRec FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod" ;
      scmdbuf += " AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT" ;
      scmdbuf += " COUNT(*) AS DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV56Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV57Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV59Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV60Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV65Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08E210( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           String AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                           int AV56Nwdpalmacentejidowwds_4_tfdiscod ,
                                           int AV57Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                           String AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           int AV59Nwdpalmacentejidowwds_7_tfclicod ,
                                           int AV60Nwdpalmacentejidowwds_8_tfclicod_to ,
                                           String AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           String AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           int AV63Nwdpalmacentejidowwds_11_tfdistotrec ,
                                           int AV64Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                           String AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           String AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           String AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           String AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                           String AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           String AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           String A396EmprCod ,
                                           int A361DisCod ,
                                           String A365DisDes ,
                                           int A252CliCod ,
                                           String A335DisArtCod ,
                                           int A13733DisTotRec ,
                                           String A392DisUniMed ,
                                           String A1430DisLoc ,
                                           String A360DisCliNum ,
                                           String AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                           short A13732DisCanRec ,
                                           short AV71Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                           short AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[31];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.DisUniMed, T1.DisCliNum, T1.DisLoc, T1.DisArtCod, T1.CliCod, T1.DisDes, T1.DisCod, T1.EmprCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisCanRec," ;
      scmdbuf += " 0) AS DisTotRec FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod" ;
      scmdbuf += " AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT" ;
      scmdbuf += " COUNT(*) AS DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV56Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV57Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV59Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV60Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV65Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisUniMed" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08E213( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           String AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                           int AV56Nwdpalmacentejidowwds_4_tfdiscod ,
                                           int AV57Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                           String AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           int AV59Nwdpalmacentejidowwds_7_tfclicod ,
                                           int AV60Nwdpalmacentejidowwds_8_tfclicod_to ,
                                           String AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           String AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           int AV63Nwdpalmacentejidowwds_11_tfdistotrec ,
                                           int AV64Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                           String AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           String AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           String AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           String AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                           String AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           String AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           String A396EmprCod ,
                                           int A361DisCod ,
                                           String A365DisDes ,
                                           int A252CliCod ,
                                           String A335DisArtCod ,
                                           int A13733DisTotRec ,
                                           String A392DisUniMed ,
                                           String A1430DisLoc ,
                                           String A360DisCliNum ,
                                           String AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                           short A13732DisCanRec ,
                                           short AV71Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                           short AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[31];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.DisLoc, T1.DisCliNum, T1.DisUniMed, T1.DisArtCod, T1.CliCod, T1.DisDes, T1.DisCod, T1.EmprCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisCanRec," ;
      scmdbuf += " 0) AS DisTotRec FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod" ;
      scmdbuf += " AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT" ;
      scmdbuf += " COUNT(*) AS DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV56Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV57Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV59Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV60Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV65Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisLoc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08E216( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV55Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           String AV54Nwdpalmacentejidowwds_2_tfemprcod ,
                                           int AV56Nwdpalmacentejidowwds_4_tfdiscod ,
                                           int AV57Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                           String AV58Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           int AV59Nwdpalmacentejidowwds_7_tfclicod ,
                                           int AV60Nwdpalmacentejidowwds_8_tfclicod_to ,
                                           String AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           String AV61Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           int AV63Nwdpalmacentejidowwds_11_tfdistotrec ,
                                           int AV64Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                           String AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           String AV65Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           String AV68Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           String AV67Nwdpalmacentejidowwds_15_tfdisloc ,
                                           String AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           String AV69Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           String A396EmprCod ,
                                           int A361DisCod ,
                                           String A365DisDes ,
                                           int A252CliCod ,
                                           String A335DisArtCod ,
                                           int A13733DisTotRec ,
                                           String A392DisUniMed ,
                                           String A1430DisLoc ,
                                           String A360DisCliNum ,
                                           String AV53Nwdpalmacentejidowwds_1_filterfulltext ,
                                           short A13732DisCanRec ,
                                           short AV71Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                           short AV72Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[31];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.DisCliNum, T1.DisLoc, T1.DisUniMed, T1.DisArtCod, T1.CliCod, T1.DisDes, T1.DisCod, T1.EmprCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisCanRec," ;
      scmdbuf += " 0) AS DisTotRec FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod" ;
      scmdbuf += " AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT" ;
      scmdbuf += " COUNT(*) AS DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV56Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV57Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV59Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV60Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV65Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisCliNum" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P08E24(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() );
            case 1 :
                  return conditional_P08E27(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() );
            case 2 :
                  return conditional_P08E210(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() );
            case 3 :
                  return conditional_P08E213(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() );
            case 4 :
                  return conditional_P08E216(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08E24", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08E27", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08E210", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08E213", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08E216", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
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
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
            case 4 :
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
            case 1 :
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
            case 2 :
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
            case 3 :
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
            case 4 :
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

