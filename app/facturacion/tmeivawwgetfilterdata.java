package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmeivawwgetfilterdata extends GXProcedure
{
   public tmeivawwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmeivawwgetfilterdata.class ), "" );
   }

   public tmeivawwgetfilterdata( int remoteHandle ,
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
      tmeivawwgetfilterdata.this.aP5 = new String[] {""};
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
      tmeivawwgetfilterdata.this.AV28DDOName = aP0;
      tmeivawwgetfilterdata.this.AV29SearchTxt = aP1;
      tmeivawwgetfilterdata.this.AV30SearchTxtTo = aP2;
      tmeivawwgetfilterdata.this.aP3 = aP3;
      tmeivawwgetfilterdata.this.aP4 = aP4;
      tmeivawwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_MEIVAID") == 0 )
      {
         /* Execute user subroutine: 'LOADMEIVAIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_MEIVADSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMEIVADSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_MEIVANORMA") == 0 )
      {
         /* Execute user subroutine: 'LOADMEIVANORMAOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV31OptionsJson = AV18Options.toJSonString(false) ;
      AV32OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV21OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("Facturacion.TMEIVAWWGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TMEIVAWWGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("Facturacion.TMEIVAWWGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVAID") == 0 )
         {
            AV10TFMeivaId = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVAID_SEL") == 0 )
         {
            AV11TFMeivaId_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVADSC") == 0 )
         {
            AV12TFMeivaDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVADSC_SEL") == 0 )
         {
            AV13TFMeivaDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVANORMA") == 0 )
         {
            AV14TFMeivaNorma = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVANORMA_SEL") == 0 )
         {
            AV15TFMeivaNorma_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMEIVAIDOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMeivaId = AV29SearchTxt ;
      AV11TFMeivaId_Sel = "" ;
      AV39Facturacion_tmeivawwds_1_filterfulltext = AV34FilterFullText ;
      AV40Facturacion_tmeivawwds_2_tfmeivaid = AV10TFMeivaId ;
      AV41Facturacion_tmeivawwds_3_tfmeivaid_sel = AV11TFMeivaId_Sel ;
      AV42Facturacion_tmeivawwds_4_tfmeivadsc = AV12TFMeivaDsc ;
      AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel = AV13TFMeivaDsc_Sel ;
      AV44Facturacion_tmeivawwds_6_tfmeivanorma = AV14TFMeivaNorma ;
      AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel = AV15TFMeivaNorma_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Facturacion_tmeivawwds_1_filterfulltext ,
                                           AV41Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                           AV40Facturacion_tmeivawwds_2_tfmeivaid ,
                                           AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                           AV42Facturacion_tmeivawwds_4_tfmeivadsc ,
                                           AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                           AV44Facturacion_tmeivawwds_6_tfmeivanorma ,
                                           A11629MeivaId ,
                                           A11630MeivaDsc ,
                                           A11631MeivaNorma } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV39Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV40Facturacion_tmeivawwds_2_tfmeivaid = GXutil.padr( GXutil.rtrim( AV40Facturacion_tmeivawwds_2_tfmeivaid), 4, "%") ;
      lV42Facturacion_tmeivawwds_4_tfmeivadsc = GXutil.concat( GXutil.rtrim( AV42Facturacion_tmeivawwds_4_tfmeivadsc), "%", "") ;
      lV44Facturacion_tmeivawwds_6_tfmeivanorma = GXutil.concat( GXutil.rtrim( AV44Facturacion_tmeivawwds_6_tfmeivanorma), "%", "") ;
      /* Using cursor P09YW2 */
      pr_default.execute(0, new Object[] {lV39Facturacion_tmeivawwds_1_filterfulltext, lV39Facturacion_tmeivawwds_1_filterfulltext, lV39Facturacion_tmeivawwds_1_filterfulltext, lV40Facturacion_tmeivawwds_2_tfmeivaid, AV41Facturacion_tmeivawwds_3_tfmeivaid_sel, lV42Facturacion_tmeivawwds_4_tfmeivadsc, AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel, lV44Facturacion_tmeivawwds_6_tfmeivanorma, AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9YW2 = false ;
         A11629MeivaId = P09YW2_A11629MeivaId[0] ;
         A11631MeivaNorma = P09YW2_A11631MeivaNorma[0] ;
         n11631MeivaNorma = P09YW2_n11631MeivaNorma[0] ;
         A11630MeivaDsc = P09YW2_A11630MeivaDsc[0] ;
         n11630MeivaDsc = P09YW2_n11630MeivaDsc[0] ;
         A396EmprCod = P09YW2_A396EmprCod[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09YW2_A11629MeivaId[0], A11629MeivaId) == 0 ) )
         {
            brk9YW2 = false ;
            A396EmprCod = P09YW2_A396EmprCod[0] ;
            AV22count = (long)(AV22count+1) ;
            brk9YW2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11629MeivaId)==0) )
         {
            AV17Option = A11629MeivaId ;
            AV18Options.add(AV17Option, 0);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9YW2 )
         {
            brk9YW2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMEIVADSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMeivaDsc = AV29SearchTxt ;
      AV13TFMeivaDsc_Sel = "" ;
      AV39Facturacion_tmeivawwds_1_filterfulltext = AV34FilterFullText ;
      AV40Facturacion_tmeivawwds_2_tfmeivaid = AV10TFMeivaId ;
      AV41Facturacion_tmeivawwds_3_tfmeivaid_sel = AV11TFMeivaId_Sel ;
      AV42Facturacion_tmeivawwds_4_tfmeivadsc = AV12TFMeivaDsc ;
      AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel = AV13TFMeivaDsc_Sel ;
      AV44Facturacion_tmeivawwds_6_tfmeivanorma = AV14TFMeivaNorma ;
      AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel = AV15TFMeivaNorma_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV39Facturacion_tmeivawwds_1_filterfulltext ,
                                           AV41Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                           AV40Facturacion_tmeivawwds_2_tfmeivaid ,
                                           AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                           AV42Facturacion_tmeivawwds_4_tfmeivadsc ,
                                           AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                           AV44Facturacion_tmeivawwds_6_tfmeivanorma ,
                                           A11629MeivaId ,
                                           A11630MeivaDsc ,
                                           A11631MeivaNorma } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV39Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV40Facturacion_tmeivawwds_2_tfmeivaid = GXutil.padr( GXutil.rtrim( AV40Facturacion_tmeivawwds_2_tfmeivaid), 4, "%") ;
      lV42Facturacion_tmeivawwds_4_tfmeivadsc = GXutil.concat( GXutil.rtrim( AV42Facturacion_tmeivawwds_4_tfmeivadsc), "%", "") ;
      lV44Facturacion_tmeivawwds_6_tfmeivanorma = GXutil.concat( GXutil.rtrim( AV44Facturacion_tmeivawwds_6_tfmeivanorma), "%", "") ;
      /* Using cursor P09YW3 */
      pr_default.execute(1, new Object[] {lV39Facturacion_tmeivawwds_1_filterfulltext, lV39Facturacion_tmeivawwds_1_filterfulltext, lV39Facturacion_tmeivawwds_1_filterfulltext, lV40Facturacion_tmeivawwds_2_tfmeivaid, AV41Facturacion_tmeivawwds_3_tfmeivaid_sel, lV42Facturacion_tmeivawwds_4_tfmeivadsc, AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel, lV44Facturacion_tmeivawwds_6_tfmeivanorma, AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9YW4 = false ;
         A11630MeivaDsc = P09YW3_A11630MeivaDsc[0] ;
         n11630MeivaDsc = P09YW3_n11630MeivaDsc[0] ;
         A11631MeivaNorma = P09YW3_A11631MeivaNorma[0] ;
         n11631MeivaNorma = P09YW3_n11631MeivaNorma[0] ;
         A11629MeivaId = P09YW3_A11629MeivaId[0] ;
         A396EmprCod = P09YW3_A396EmprCod[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09YW3_A11630MeivaDsc[0], A11630MeivaDsc) == 0 ) )
         {
            brk9YW4 = false ;
            A11629MeivaId = P09YW3_A11629MeivaId[0] ;
            A396EmprCod = P09YW3_A396EmprCod[0] ;
            AV22count = (long)(AV22count+1) ;
            brk9YW4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A11630MeivaDsc)==0) )
         {
            AV17Option = A11630MeivaDsc ;
            AV18Options.add(AV17Option, 0);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9YW4 )
         {
            brk9YW4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMEIVANORMAOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMeivaNorma = AV29SearchTxt ;
      AV15TFMeivaNorma_Sel = "" ;
      AV39Facturacion_tmeivawwds_1_filterfulltext = AV34FilterFullText ;
      AV40Facturacion_tmeivawwds_2_tfmeivaid = AV10TFMeivaId ;
      AV41Facturacion_tmeivawwds_3_tfmeivaid_sel = AV11TFMeivaId_Sel ;
      AV42Facturacion_tmeivawwds_4_tfmeivadsc = AV12TFMeivaDsc ;
      AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel = AV13TFMeivaDsc_Sel ;
      AV44Facturacion_tmeivawwds_6_tfmeivanorma = AV14TFMeivaNorma ;
      AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel = AV15TFMeivaNorma_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV39Facturacion_tmeivawwds_1_filterfulltext ,
                                           AV41Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                           AV40Facturacion_tmeivawwds_2_tfmeivaid ,
                                           AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                           AV42Facturacion_tmeivawwds_4_tfmeivadsc ,
                                           AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                           AV44Facturacion_tmeivawwds_6_tfmeivanorma ,
                                           A11629MeivaId ,
                                           A11630MeivaDsc ,
                                           A11631MeivaNorma } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV39Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV40Facturacion_tmeivawwds_2_tfmeivaid = GXutil.padr( GXutil.rtrim( AV40Facturacion_tmeivawwds_2_tfmeivaid), 4, "%") ;
      lV42Facturacion_tmeivawwds_4_tfmeivadsc = GXutil.concat( GXutil.rtrim( AV42Facturacion_tmeivawwds_4_tfmeivadsc), "%", "") ;
      lV44Facturacion_tmeivawwds_6_tfmeivanorma = GXutil.concat( GXutil.rtrim( AV44Facturacion_tmeivawwds_6_tfmeivanorma), "%", "") ;
      /* Using cursor P09YW4 */
      pr_default.execute(2, new Object[] {lV39Facturacion_tmeivawwds_1_filterfulltext, lV39Facturacion_tmeivawwds_1_filterfulltext, lV39Facturacion_tmeivawwds_1_filterfulltext, lV40Facturacion_tmeivawwds_2_tfmeivaid, AV41Facturacion_tmeivawwds_3_tfmeivaid_sel, lV42Facturacion_tmeivawwds_4_tfmeivadsc, AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel, lV44Facturacion_tmeivawwds_6_tfmeivanorma, AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9YW6 = false ;
         A11631MeivaNorma = P09YW4_A11631MeivaNorma[0] ;
         n11631MeivaNorma = P09YW4_n11631MeivaNorma[0] ;
         A11630MeivaDsc = P09YW4_A11630MeivaDsc[0] ;
         n11630MeivaDsc = P09YW4_n11630MeivaDsc[0] ;
         A11629MeivaId = P09YW4_A11629MeivaId[0] ;
         A396EmprCod = P09YW4_A396EmprCod[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09YW4_A11631MeivaNorma[0], A11631MeivaNorma) == 0 ) )
         {
            brk9YW6 = false ;
            A11629MeivaId = P09YW4_A11629MeivaId[0] ;
            A396EmprCod = P09YW4_A396EmprCod[0] ;
            AV22count = (long)(AV22count+1) ;
            brk9YW6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11631MeivaNorma)==0) )
         {
            AV17Option = A11631MeivaNorma ;
            AV18Options.add(AV17Option, 0);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9YW6 )
         {
            brk9YW6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmeivawwgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = tmeivawwgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = tmeivawwgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31OptionsJson = "" ;
      AV32OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34FilterFullText = "" ;
      AV10TFMeivaId = "" ;
      AV11TFMeivaId_Sel = "" ;
      AV12TFMeivaDsc = "" ;
      AV13TFMeivaDsc_Sel = "" ;
      AV14TFMeivaNorma = "" ;
      AV15TFMeivaNorma_Sel = "" ;
      A11629MeivaId = "" ;
      AV39Facturacion_tmeivawwds_1_filterfulltext = "" ;
      AV40Facturacion_tmeivawwds_2_tfmeivaid = "" ;
      AV41Facturacion_tmeivawwds_3_tfmeivaid_sel = "" ;
      AV42Facturacion_tmeivawwds_4_tfmeivadsc = "" ;
      AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel = "" ;
      AV44Facturacion_tmeivawwds_6_tfmeivanorma = "" ;
      AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel = "" ;
      scmdbuf = "" ;
      lV39Facturacion_tmeivawwds_1_filterfulltext = "" ;
      lV40Facturacion_tmeivawwds_2_tfmeivaid = "" ;
      lV42Facturacion_tmeivawwds_4_tfmeivadsc = "" ;
      lV44Facturacion_tmeivawwds_6_tfmeivanorma = "" ;
      A11630MeivaDsc = "" ;
      A11631MeivaNorma = "" ;
      P09YW2_A11629MeivaId = new String[] {""} ;
      P09YW2_A11631MeivaNorma = new String[] {""} ;
      P09YW2_n11631MeivaNorma = new boolean[] {false} ;
      P09YW2_A11630MeivaDsc = new String[] {""} ;
      P09YW2_n11630MeivaDsc = new boolean[] {false} ;
      P09YW2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV17Option = "" ;
      P09YW3_A11630MeivaDsc = new String[] {""} ;
      P09YW3_n11630MeivaDsc = new boolean[] {false} ;
      P09YW3_A11631MeivaNorma = new String[] {""} ;
      P09YW3_n11631MeivaNorma = new boolean[] {false} ;
      P09YW3_A11629MeivaId = new String[] {""} ;
      P09YW3_A396EmprCod = new String[] {""} ;
      P09YW4_A11631MeivaNorma = new String[] {""} ;
      P09YW4_n11631MeivaNorma = new boolean[] {false} ;
      P09YW4_A11630MeivaDsc = new String[] {""} ;
      P09YW4_n11630MeivaDsc = new boolean[] {false} ;
      P09YW4_A11629MeivaId = new String[] {""} ;
      P09YW4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmeivawwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09YW2_A11629MeivaId, P09YW2_A11631MeivaNorma, P09YW2_n11631MeivaNorma, P09YW2_A11630MeivaDsc, P09YW2_n11630MeivaDsc, P09YW2_A396EmprCod
            }
            , new Object[] {
            P09YW3_A11630MeivaDsc, P09YW3_n11630MeivaDsc, P09YW3_A11631MeivaNorma, P09YW3_n11631MeivaNorma, P09YW3_A11629MeivaId, P09YW3_A396EmprCod
            }
            , new Object[] {
            P09YW4_A11631MeivaNorma, P09YW4_n11631MeivaNorma, P09YW4_A11630MeivaDsc, P09YW4_n11630MeivaDsc, P09YW4_A11629MeivaId, P09YW4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV22count ;
   private String AV10TFMeivaId ;
   private String AV11TFMeivaId_Sel ;
   private String A11629MeivaId ;
   private String AV40Facturacion_tmeivawwds_2_tfmeivaid ;
   private String AV41Facturacion_tmeivawwds_3_tfmeivaid_sel ;
   private String scmdbuf ;
   private String lV40Facturacion_tmeivawwds_2_tfmeivaid ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9YW2 ;
   private boolean n11631MeivaNorma ;
   private boolean n11630MeivaDsc ;
   private boolean brk9YW4 ;
   private boolean brk9YW6 ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV12TFMeivaDsc ;
   private String AV13TFMeivaDsc_Sel ;
   private String AV14TFMeivaNorma ;
   private String AV15TFMeivaNorma_Sel ;
   private String AV39Facturacion_tmeivawwds_1_filterfulltext ;
   private String AV42Facturacion_tmeivawwds_4_tfmeivadsc ;
   private String AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel ;
   private String AV44Facturacion_tmeivawwds_6_tfmeivanorma ;
   private String AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel ;
   private String lV39Facturacion_tmeivawwds_1_filterfulltext ;
   private String lV42Facturacion_tmeivawwds_4_tfmeivadsc ;
   private String lV44Facturacion_tmeivawwds_6_tfmeivanorma ;
   private String A11630MeivaDsc ;
   private String A11631MeivaNorma ;
   private String AV17Option ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09YW2_A11629MeivaId ;
   private String[] P09YW2_A11631MeivaNorma ;
   private boolean[] P09YW2_n11631MeivaNorma ;
   private String[] P09YW2_A11630MeivaDsc ;
   private boolean[] P09YW2_n11630MeivaDsc ;
   private String[] P09YW2_A396EmprCod ;
   private String[] P09YW3_A11630MeivaDsc ;
   private boolean[] P09YW3_n11630MeivaDsc ;
   private String[] P09YW3_A11631MeivaNorma ;
   private boolean[] P09YW3_n11631MeivaNorma ;
   private String[] P09YW3_A11629MeivaId ;
   private String[] P09YW3_A396EmprCod ;
   private String[] P09YW4_A11631MeivaNorma ;
   private boolean[] P09YW4_n11631MeivaNorma ;
   private String[] P09YW4_A11630MeivaDsc ;
   private boolean[] P09YW4_n11630MeivaDsc ;
   private String[] P09YW4_A11629MeivaId ;
   private String[] P09YW4_A396EmprCod ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class tmeivawwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09YW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Facturacion_tmeivawwds_1_filterfulltext ,
                                          String AV41Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                          String AV40Facturacion_tmeivawwds_2_tfmeivaid ,
                                          String AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                          String AV42Facturacion_tmeivawwds_4_tfmeivadsc ,
                                          String AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                          String AV44Facturacion_tmeivawwds_6_tfmeivanorma ,
                                          String A11629MeivaId ,
                                          String A11630MeivaDsc ,
                                          String A11631MeivaNorma )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MeivaId, MeivaNorma, MeivaDsc, EmprCod FROM TXPMEIVA" ;
      if ( ! (GXutil.strcmp("", AV39Facturacion_tmeivawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MeivaId) like '%' || UPPER(?)) or ( UPPER(MeivaDsc) like '%' || UPPER(?)) or ( UPPER(MeivaNorma) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) && ( ! (GXutil.strcmp("", AV40Facturacion_tmeivawwds_2_tfmeivaid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaId = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV42Facturacion_tmeivawwds_4_tfmeivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) && ( ! (GXutil.strcmp("", AV44Facturacion_tmeivawwds_6_tfmeivanorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaNorma = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MeivaId" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09YW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Facturacion_tmeivawwds_1_filterfulltext ,
                                          String AV41Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                          String AV40Facturacion_tmeivawwds_2_tfmeivaid ,
                                          String AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                          String AV42Facturacion_tmeivawwds_4_tfmeivadsc ,
                                          String AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                          String AV44Facturacion_tmeivawwds_6_tfmeivanorma ,
                                          String A11629MeivaId ,
                                          String A11630MeivaDsc ,
                                          String A11631MeivaNorma )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT MeivaDsc, MeivaNorma, MeivaId, EmprCod FROM TXPMEIVA" ;
      if ( ! (GXutil.strcmp("", AV39Facturacion_tmeivawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MeivaId) like '%' || UPPER(?)) or ( UPPER(MeivaDsc) like '%' || UPPER(?)) or ( UPPER(MeivaNorma) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) && ( ! (GXutil.strcmp("", AV40Facturacion_tmeivawwds_2_tfmeivaid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaId = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV42Facturacion_tmeivawwds_4_tfmeivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) && ( ! (GXutil.strcmp("", AV44Facturacion_tmeivawwds_6_tfmeivanorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaNorma = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MeivaDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09YW4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Facturacion_tmeivawwds_1_filterfulltext ,
                                          String AV41Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                          String AV40Facturacion_tmeivawwds_2_tfmeivaid ,
                                          String AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                          String AV42Facturacion_tmeivawwds_4_tfmeivadsc ,
                                          String AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                          String AV44Facturacion_tmeivawwds_6_tfmeivanorma ,
                                          String A11629MeivaId ,
                                          String A11630MeivaDsc ,
                                          String A11631MeivaNorma )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[9];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT MeivaNorma, MeivaDsc, MeivaId, EmprCod FROM TXPMEIVA" ;
      if ( ! (GXutil.strcmp("", AV39Facturacion_tmeivawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MeivaId) like '%' || UPPER(?)) or ( UPPER(MeivaDsc) like '%' || UPPER(?)) or ( UPPER(MeivaNorma) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) && ( ! (GXutil.strcmp("", AV40Facturacion_tmeivawwds_2_tfmeivaid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaId = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV42Facturacion_tmeivawwds_4_tfmeivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) && ( ! (GXutil.strcmp("", AV44Facturacion_tmeivawwds_6_tfmeivanorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaNorma = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MeivaNorma" ;
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
                  return conditional_P09YW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P09YW3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 2 :
                  return conditional_P09YW4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YW4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 4);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 4);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               return;
      }
   }

}

