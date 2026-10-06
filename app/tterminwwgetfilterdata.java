package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tterminwwgetfilterdata extends GXProcedure
{
   public tterminwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tterminwwgetfilterdata.class ), "" );
   }

   public tterminwwgetfilterdata( int remoteHandle ,
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
      tterminwwgetfilterdata.this.aP5 = new String[] {""};
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
      tterminwwgetfilterdata.this.AV60DDOName = aP0;
      tterminwwgetfilterdata.this.AV58SearchTxt = aP1;
      tterminwwgetfilterdata.this.AV59SearchTxtTo = aP2;
      tterminwwgetfilterdata.this.aP3 = aP3;
      tterminwwgetfilterdata.this.aP4 = aP4;
      tterminwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV63Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV66OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV68OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV60DDOName), "DDO_TERMCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADTERMCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV60DDOName), "DDO_TERMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTERMDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV60DDOName), "DDO_IMPCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADIMPCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV60DDOName), "DDO_TERMUSU") == 0 )
      {
         /* Execute user subroutine: 'LOADTERMUSUOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV64OptionsJson = AV63Options.toJSonString(false) ;
      AV67OptionsDescJson = AV66OptionsDesc.toJSonString(false) ;
      AV69OptionIndexesJson = AV68OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV71Session.getValue("TTERMINWWGridState"), "") == 0 )
      {
         AV73GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTERMINWWGridState"), null, null);
      }
      else
      {
         AV73GridState.fromxml(AV71Session.getValue("TTERMINWWGridState"), null, null);
      }
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV73GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV74GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV73GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV1));
         if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV76FilterFullText = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMCOD") == 0 )
         {
            AV10TFTermCod = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMCOD_SEL") == 0 )
         {
            AV11TFTermCod_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMDSC") == 0 )
         {
            AV16TFTermDsc = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMDSC_SEL") == 0 )
         {
            AV17TFTermDsc_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIMPCOD") == 0 )
         {
            AV18TFImpCod = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIMPCOD_SEL") == 0 )
         {
            AV19TFImpCod_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMUSU") == 0 )
         {
            AV22TFTermUsu = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMUSU_SEL") == 0 )
         {
            AV23TFTermUsu_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTERMCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFTermCod = AV58SearchTxt ;
      AV11TFTermCod_Sel = "" ;
      AV81Tterminwwds_1_filterfulltext = AV76FilterFullText ;
      AV82Tterminwwds_2_tftermcod = AV10TFTermCod ;
      AV83Tterminwwds_3_tftermcod_sel = AV11TFTermCod_Sel ;
      AV84Tterminwwds_4_tftermdsc = AV16TFTermDsc ;
      AV85Tterminwwds_5_tftermdsc_sel = AV17TFTermDsc_Sel ;
      AV86Tterminwwds_6_tfimpcod = AV18TFImpCod ;
      AV87Tterminwwds_7_tfimpcod_sel = AV19TFImpCod_Sel ;
      AV88Tterminwwds_8_tftermusu = AV22TFTermUsu ;
      AV89Tterminwwds_9_tftermusu_sel = AV23TFTermUsu_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV81Tterminwwds_1_filterfulltext ,
                                           AV83Tterminwwds_3_tftermcod_sel ,
                                           AV82Tterminwwds_2_tftermcod ,
                                           AV85Tterminwwds_5_tftermdsc_sel ,
                                           AV84Tterminwwds_4_tftermdsc ,
                                           AV87Tterminwwds_7_tfimpcod_sel ,
                                           AV86Tterminwwds_6_tfimpcod ,
                                           AV89Tterminwwds_9_tftermusu_sel ,
                                           AV88Tterminwwds_8_tftermusu ,
                                           A942TermCod ,
                                           A8898TermDsc ,
                                           A574ImpCod ,
                                           A1189TermUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV82Tterminwwds_2_tftermcod = GXutil.padr( GXutil.rtrim( AV82Tterminwwds_2_tftermcod), 10, "%") ;
      lV84Tterminwwds_4_tftermdsc = GXutil.padr( GXutil.rtrim( AV84Tterminwwds_4_tftermdsc), 30, "%") ;
      lV86Tterminwwds_6_tfimpcod = GXutil.padr( GXutil.rtrim( AV86Tterminwwds_6_tfimpcod), 10, "%") ;
      lV88Tterminwwds_8_tftermusu = GXutil.padr( GXutil.rtrim( AV88Tterminwwds_8_tftermusu), 8, "%") ;
      /* Using cursor P097H2 */
      pr_default.execute(0, new Object[] {lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV82Tterminwwds_2_tftermcod, AV83Tterminwwds_3_tftermcod_sel, lV84Tterminwwds_4_tftermdsc, AV85Tterminwwds_5_tftermdsc_sel, lV86Tterminwwds_6_tfimpcod, AV87Tterminwwds_7_tfimpcod_sel, lV88Tterminwwds_8_tftermusu, AV89Tterminwwds_9_tftermusu_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1189TermUsu = P097H2_A1189TermUsu[0] ;
         n1189TermUsu = P097H2_n1189TermUsu[0] ;
         A574ImpCod = P097H2_A574ImpCod[0] ;
         n574ImpCod = P097H2_n574ImpCod[0] ;
         A8898TermDsc = P097H2_A8898TermDsc[0] ;
         n8898TermDsc = P097H2_n8898TermDsc[0] ;
         A942TermCod = P097H2_A942TermCod[0] ;
         if ( ! (GXutil.strcmp("", A942TermCod)==0) )
         {
            AV62Option = A942TermCod ;
            AV63Options.add(AV62Option, 0);
         }
         if ( AV63Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTERMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFTermDsc = AV58SearchTxt ;
      AV17TFTermDsc_Sel = "" ;
      AV81Tterminwwds_1_filterfulltext = AV76FilterFullText ;
      AV82Tterminwwds_2_tftermcod = AV10TFTermCod ;
      AV83Tterminwwds_3_tftermcod_sel = AV11TFTermCod_Sel ;
      AV84Tterminwwds_4_tftermdsc = AV16TFTermDsc ;
      AV85Tterminwwds_5_tftermdsc_sel = AV17TFTermDsc_Sel ;
      AV86Tterminwwds_6_tfimpcod = AV18TFImpCod ;
      AV87Tterminwwds_7_tfimpcod_sel = AV19TFImpCod_Sel ;
      AV88Tterminwwds_8_tftermusu = AV22TFTermUsu ;
      AV89Tterminwwds_9_tftermusu_sel = AV23TFTermUsu_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV81Tterminwwds_1_filterfulltext ,
                                           AV83Tterminwwds_3_tftermcod_sel ,
                                           AV82Tterminwwds_2_tftermcod ,
                                           AV85Tterminwwds_5_tftermdsc_sel ,
                                           AV84Tterminwwds_4_tftermdsc ,
                                           AV87Tterminwwds_7_tfimpcod_sel ,
                                           AV86Tterminwwds_6_tfimpcod ,
                                           AV89Tterminwwds_9_tftermusu_sel ,
                                           AV88Tterminwwds_8_tftermusu ,
                                           A942TermCod ,
                                           A8898TermDsc ,
                                           A574ImpCod ,
                                           A1189TermUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV82Tterminwwds_2_tftermcod = GXutil.padr( GXutil.rtrim( AV82Tterminwwds_2_tftermcod), 10, "%") ;
      lV84Tterminwwds_4_tftermdsc = GXutil.padr( GXutil.rtrim( AV84Tterminwwds_4_tftermdsc), 30, "%") ;
      lV86Tterminwwds_6_tfimpcod = GXutil.padr( GXutil.rtrim( AV86Tterminwwds_6_tfimpcod), 10, "%") ;
      lV88Tterminwwds_8_tftermusu = GXutil.padr( GXutil.rtrim( AV88Tterminwwds_8_tftermusu), 8, "%") ;
      /* Using cursor P097H3 */
      pr_default.execute(1, new Object[] {lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV82Tterminwwds_2_tftermcod, AV83Tterminwwds_3_tftermcod_sel, lV84Tterminwwds_4_tftermdsc, AV85Tterminwwds_5_tftermdsc_sel, lV86Tterminwwds_6_tfimpcod, AV87Tterminwwds_7_tfimpcod_sel, lV88Tterminwwds_8_tftermusu, AV89Tterminwwds_9_tftermusu_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk97H3 = false ;
         A8898TermDsc = P097H3_A8898TermDsc[0] ;
         n8898TermDsc = P097H3_n8898TermDsc[0] ;
         A1189TermUsu = P097H3_A1189TermUsu[0] ;
         n1189TermUsu = P097H3_n1189TermUsu[0] ;
         A574ImpCod = P097H3_A574ImpCod[0] ;
         n574ImpCod = P097H3_n574ImpCod[0] ;
         A942TermCod = P097H3_A942TermCod[0] ;
         AV70count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P097H3_A8898TermDsc[0], A8898TermDsc) == 0 ) )
         {
            brk97H3 = false ;
            A942TermCod = P097H3_A942TermCod[0] ;
            AV70count = (long)(AV70count+1) ;
            brk97H3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A8898TermDsc)==0) )
         {
            AV62Option = A8898TermDsc ;
            AV63Options.add(AV62Option, 0);
            AV68OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV63Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97H3 )
         {
            brk97H3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADIMPCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFImpCod = AV58SearchTxt ;
      AV19TFImpCod_Sel = "" ;
      AV81Tterminwwds_1_filterfulltext = AV76FilterFullText ;
      AV82Tterminwwds_2_tftermcod = AV10TFTermCod ;
      AV83Tterminwwds_3_tftermcod_sel = AV11TFTermCod_Sel ;
      AV84Tterminwwds_4_tftermdsc = AV16TFTermDsc ;
      AV85Tterminwwds_5_tftermdsc_sel = AV17TFTermDsc_Sel ;
      AV86Tterminwwds_6_tfimpcod = AV18TFImpCod ;
      AV87Tterminwwds_7_tfimpcod_sel = AV19TFImpCod_Sel ;
      AV88Tterminwwds_8_tftermusu = AV22TFTermUsu ;
      AV89Tterminwwds_9_tftermusu_sel = AV23TFTermUsu_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV81Tterminwwds_1_filterfulltext ,
                                           AV83Tterminwwds_3_tftermcod_sel ,
                                           AV82Tterminwwds_2_tftermcod ,
                                           AV85Tterminwwds_5_tftermdsc_sel ,
                                           AV84Tterminwwds_4_tftermdsc ,
                                           AV87Tterminwwds_7_tfimpcod_sel ,
                                           AV86Tterminwwds_6_tfimpcod ,
                                           AV89Tterminwwds_9_tftermusu_sel ,
                                           AV88Tterminwwds_8_tftermusu ,
                                           A942TermCod ,
                                           A8898TermDsc ,
                                           A574ImpCod ,
                                           A1189TermUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV82Tterminwwds_2_tftermcod = GXutil.padr( GXutil.rtrim( AV82Tterminwwds_2_tftermcod), 10, "%") ;
      lV84Tterminwwds_4_tftermdsc = GXutil.padr( GXutil.rtrim( AV84Tterminwwds_4_tftermdsc), 30, "%") ;
      lV86Tterminwwds_6_tfimpcod = GXutil.padr( GXutil.rtrim( AV86Tterminwwds_6_tfimpcod), 10, "%") ;
      lV88Tterminwwds_8_tftermusu = GXutil.padr( GXutil.rtrim( AV88Tterminwwds_8_tftermusu), 8, "%") ;
      /* Using cursor P097H4 */
      pr_default.execute(2, new Object[] {lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV82Tterminwwds_2_tftermcod, AV83Tterminwwds_3_tftermcod_sel, lV84Tterminwwds_4_tftermdsc, AV85Tterminwwds_5_tftermdsc_sel, lV86Tterminwwds_6_tfimpcod, AV87Tterminwwds_7_tfimpcod_sel, lV88Tterminwwds_8_tftermusu, AV89Tterminwwds_9_tftermusu_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk97H5 = false ;
         A574ImpCod = P097H4_A574ImpCod[0] ;
         n574ImpCod = P097H4_n574ImpCod[0] ;
         A1189TermUsu = P097H4_A1189TermUsu[0] ;
         n1189TermUsu = P097H4_n1189TermUsu[0] ;
         A8898TermDsc = P097H4_A8898TermDsc[0] ;
         n8898TermDsc = P097H4_n8898TermDsc[0] ;
         A942TermCod = P097H4_A942TermCod[0] ;
         AV70count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P097H4_A574ImpCod[0], A574ImpCod) == 0 ) )
         {
            brk97H5 = false ;
            A942TermCod = P097H4_A942TermCod[0] ;
            AV70count = (long)(AV70count+1) ;
            brk97H5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A574ImpCod)==0) )
         {
            AV62Option = A574ImpCod ;
            AV63Options.add(AV62Option, 0);
            AV68OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV63Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97H5 )
         {
            brk97H5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADTERMUSUOPTIONS' Routine */
      returnInSub = false ;
      AV22TFTermUsu = AV58SearchTxt ;
      AV23TFTermUsu_Sel = "" ;
      AV81Tterminwwds_1_filterfulltext = AV76FilterFullText ;
      AV82Tterminwwds_2_tftermcod = AV10TFTermCod ;
      AV83Tterminwwds_3_tftermcod_sel = AV11TFTermCod_Sel ;
      AV84Tterminwwds_4_tftermdsc = AV16TFTermDsc ;
      AV85Tterminwwds_5_tftermdsc_sel = AV17TFTermDsc_Sel ;
      AV86Tterminwwds_6_tfimpcod = AV18TFImpCod ;
      AV87Tterminwwds_7_tfimpcod_sel = AV19TFImpCod_Sel ;
      AV88Tterminwwds_8_tftermusu = AV22TFTermUsu ;
      AV89Tterminwwds_9_tftermusu_sel = AV23TFTermUsu_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV81Tterminwwds_1_filterfulltext ,
                                           AV83Tterminwwds_3_tftermcod_sel ,
                                           AV82Tterminwwds_2_tftermcod ,
                                           AV85Tterminwwds_5_tftermdsc_sel ,
                                           AV84Tterminwwds_4_tftermdsc ,
                                           AV87Tterminwwds_7_tfimpcod_sel ,
                                           AV86Tterminwwds_6_tfimpcod ,
                                           AV89Tterminwwds_9_tftermusu_sel ,
                                           AV88Tterminwwds_8_tftermusu ,
                                           A942TermCod ,
                                           A8898TermDsc ,
                                           A574ImpCod ,
                                           A1189TermUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV81Tterminwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Tterminwwds_1_filterfulltext), "%", "") ;
      lV82Tterminwwds_2_tftermcod = GXutil.padr( GXutil.rtrim( AV82Tterminwwds_2_tftermcod), 10, "%") ;
      lV84Tterminwwds_4_tftermdsc = GXutil.padr( GXutil.rtrim( AV84Tterminwwds_4_tftermdsc), 30, "%") ;
      lV86Tterminwwds_6_tfimpcod = GXutil.padr( GXutil.rtrim( AV86Tterminwwds_6_tfimpcod), 10, "%") ;
      lV88Tterminwwds_8_tftermusu = GXutil.padr( GXutil.rtrim( AV88Tterminwwds_8_tftermusu), 8, "%") ;
      /* Using cursor P097H5 */
      pr_default.execute(3, new Object[] {lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV81Tterminwwds_1_filterfulltext, lV82Tterminwwds_2_tftermcod, AV83Tterminwwds_3_tftermcod_sel, lV84Tterminwwds_4_tftermdsc, AV85Tterminwwds_5_tftermdsc_sel, lV86Tterminwwds_6_tfimpcod, AV87Tterminwwds_7_tfimpcod_sel, lV88Tterminwwds_8_tftermusu, AV89Tterminwwds_9_tftermusu_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk97H7 = false ;
         A1189TermUsu = P097H5_A1189TermUsu[0] ;
         n1189TermUsu = P097H5_n1189TermUsu[0] ;
         A574ImpCod = P097H5_A574ImpCod[0] ;
         n574ImpCod = P097H5_n574ImpCod[0] ;
         A8898TermDsc = P097H5_A8898TermDsc[0] ;
         n8898TermDsc = P097H5_n8898TermDsc[0] ;
         A942TermCod = P097H5_A942TermCod[0] ;
         AV70count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P097H5_A1189TermUsu[0], A1189TermUsu) == 0 ) )
         {
            brk97H7 = false ;
            A942TermCod = P097H5_A942TermCod[0] ;
            AV70count = (long)(AV70count+1) ;
            brk97H7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1189TermUsu)==0) )
         {
            AV62Option = A1189TermUsu ;
            AV65OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A1189TermUsu, "@!"))) ;
            AV63Options.add(AV62Option, 0);
            AV66OptionsDesc.add(AV65OptionDesc, 0);
            AV68OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV63Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97H7 )
         {
            brk97H7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tterminwwgetfilterdata.this.AV64OptionsJson;
      this.aP4[0] = tterminwwgetfilterdata.this.AV67OptionsDescJson;
      this.aP5[0] = tterminwwgetfilterdata.this.AV69OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV64OptionsJson = "" ;
      AV67OptionsDescJson = "" ;
      AV69OptionIndexesJson = "" ;
      AV63Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV71Session = httpContext.getWebSession();
      AV73GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV74GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV76FilterFullText = "" ;
      AV10TFTermCod = "" ;
      AV11TFTermCod_Sel = "" ;
      AV16TFTermDsc = "" ;
      AV17TFTermDsc_Sel = "" ;
      AV18TFImpCod = "" ;
      AV19TFImpCod_Sel = "" ;
      AV22TFTermUsu = "" ;
      AV23TFTermUsu_Sel = "" ;
      A942TermCod = "" ;
      AV81Tterminwwds_1_filterfulltext = "" ;
      AV82Tterminwwds_2_tftermcod = "" ;
      AV83Tterminwwds_3_tftermcod_sel = "" ;
      AV84Tterminwwds_4_tftermdsc = "" ;
      AV85Tterminwwds_5_tftermdsc_sel = "" ;
      AV86Tterminwwds_6_tfimpcod = "" ;
      AV87Tterminwwds_7_tfimpcod_sel = "" ;
      AV88Tterminwwds_8_tftermusu = "" ;
      AV89Tterminwwds_9_tftermusu_sel = "" ;
      scmdbuf = "" ;
      lV81Tterminwwds_1_filterfulltext = "" ;
      lV82Tterminwwds_2_tftermcod = "" ;
      lV84Tterminwwds_4_tftermdsc = "" ;
      lV86Tterminwwds_6_tfimpcod = "" ;
      lV88Tterminwwds_8_tftermusu = "" ;
      A8898TermDsc = "" ;
      A574ImpCod = "" ;
      A1189TermUsu = "" ;
      P097H2_A1189TermUsu = new String[] {""} ;
      P097H2_n1189TermUsu = new boolean[] {false} ;
      P097H2_A574ImpCod = new String[] {""} ;
      P097H2_n574ImpCod = new boolean[] {false} ;
      P097H2_A8898TermDsc = new String[] {""} ;
      P097H2_n8898TermDsc = new boolean[] {false} ;
      P097H2_A942TermCod = new String[] {""} ;
      AV62Option = "" ;
      P097H3_A8898TermDsc = new String[] {""} ;
      P097H3_n8898TermDsc = new boolean[] {false} ;
      P097H3_A1189TermUsu = new String[] {""} ;
      P097H3_n1189TermUsu = new boolean[] {false} ;
      P097H3_A574ImpCod = new String[] {""} ;
      P097H3_n574ImpCod = new boolean[] {false} ;
      P097H3_A942TermCod = new String[] {""} ;
      P097H4_A574ImpCod = new String[] {""} ;
      P097H4_n574ImpCod = new boolean[] {false} ;
      P097H4_A1189TermUsu = new String[] {""} ;
      P097H4_n1189TermUsu = new boolean[] {false} ;
      P097H4_A8898TermDsc = new String[] {""} ;
      P097H4_n8898TermDsc = new boolean[] {false} ;
      P097H4_A942TermCod = new String[] {""} ;
      P097H5_A1189TermUsu = new String[] {""} ;
      P097H5_n1189TermUsu = new boolean[] {false} ;
      P097H5_A574ImpCod = new String[] {""} ;
      P097H5_n574ImpCod = new boolean[] {false} ;
      P097H5_A8898TermDsc = new String[] {""} ;
      P097H5_n8898TermDsc = new boolean[] {false} ;
      P097H5_A942TermCod = new String[] {""} ;
      AV65OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tterminwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P097H2_A1189TermUsu, P097H2_n1189TermUsu, P097H2_A574ImpCod, P097H2_n574ImpCod, P097H2_A8898TermDsc, P097H2_n8898TermDsc, P097H2_A942TermCod
            }
            , new Object[] {
            P097H3_A8898TermDsc, P097H3_n8898TermDsc, P097H3_A1189TermUsu, P097H3_n1189TermUsu, P097H3_A574ImpCod, P097H3_n574ImpCod, P097H3_A942TermCod
            }
            , new Object[] {
            P097H4_A574ImpCod, P097H4_n574ImpCod, P097H4_A1189TermUsu, P097H4_n1189TermUsu, P097H4_A8898TermDsc, P097H4_n8898TermDsc, P097H4_A942TermCod
            }
            , new Object[] {
            P097H5_A1189TermUsu, P097H5_n1189TermUsu, P097H5_A574ImpCod, P097H5_n574ImpCod, P097H5_A8898TermDsc, P097H5_n8898TermDsc, P097H5_A942TermCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV79GXV1 ;
   private long AV70count ;
   private String AV10TFTermCod ;
   private String AV11TFTermCod_Sel ;
   private String AV16TFTermDsc ;
   private String AV17TFTermDsc_Sel ;
   private String AV18TFImpCod ;
   private String AV19TFImpCod_Sel ;
   private String AV22TFTermUsu ;
   private String AV23TFTermUsu_Sel ;
   private String A942TermCod ;
   private String AV82Tterminwwds_2_tftermcod ;
   private String AV83Tterminwwds_3_tftermcod_sel ;
   private String AV84Tterminwwds_4_tftermdsc ;
   private String AV85Tterminwwds_5_tftermdsc_sel ;
   private String AV86Tterminwwds_6_tfimpcod ;
   private String AV87Tterminwwds_7_tfimpcod_sel ;
   private String AV88Tterminwwds_8_tftermusu ;
   private String AV89Tterminwwds_9_tftermusu_sel ;
   private String scmdbuf ;
   private String lV82Tterminwwds_2_tftermcod ;
   private String lV84Tterminwwds_4_tftermdsc ;
   private String lV86Tterminwwds_6_tfimpcod ;
   private String lV88Tterminwwds_8_tftermusu ;
   private String A8898TermDsc ;
   private String A574ImpCod ;
   private String A1189TermUsu ;
   private boolean returnInSub ;
   private boolean n1189TermUsu ;
   private boolean n574ImpCod ;
   private boolean n8898TermDsc ;
   private boolean brk97H3 ;
   private boolean brk97H5 ;
   private boolean brk97H7 ;
   private String AV64OptionsJson ;
   private String AV67OptionsDescJson ;
   private String AV69OptionIndexesJson ;
   private String AV60DDOName ;
   private String AV58SearchTxt ;
   private String AV59SearchTxtTo ;
   private String AV76FilterFullText ;
   private String AV81Tterminwwds_1_filterfulltext ;
   private String lV81Tterminwwds_1_filterfulltext ;
   private String AV62Option ;
   private String AV65OptionDesc ;
   private com.genexus.webpanels.WebSession AV71Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P097H2_A1189TermUsu ;
   private boolean[] P097H2_n1189TermUsu ;
   private String[] P097H2_A574ImpCod ;
   private boolean[] P097H2_n574ImpCod ;
   private String[] P097H2_A8898TermDsc ;
   private boolean[] P097H2_n8898TermDsc ;
   private String[] P097H2_A942TermCod ;
   private String[] P097H3_A8898TermDsc ;
   private boolean[] P097H3_n8898TermDsc ;
   private String[] P097H3_A1189TermUsu ;
   private boolean[] P097H3_n1189TermUsu ;
   private String[] P097H3_A574ImpCod ;
   private boolean[] P097H3_n574ImpCod ;
   private String[] P097H3_A942TermCod ;
   private String[] P097H4_A574ImpCod ;
   private boolean[] P097H4_n574ImpCod ;
   private String[] P097H4_A1189TermUsu ;
   private boolean[] P097H4_n1189TermUsu ;
   private String[] P097H4_A8898TermDsc ;
   private boolean[] P097H4_n8898TermDsc ;
   private String[] P097H4_A942TermCod ;
   private String[] P097H5_A1189TermUsu ;
   private boolean[] P097H5_n1189TermUsu ;
   private String[] P097H5_A574ImpCod ;
   private boolean[] P097H5_n574ImpCod ;
   private String[] P097H5_A8898TermDsc ;
   private boolean[] P097H5_n8898TermDsc ;
   private String[] P097H5_A942TermCod ;
   private GXSimpleCollection<String> AV63Options ;
   private GXSimpleCollection<String> AV66OptionsDesc ;
   private GXSimpleCollection<String> AV68OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV73GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV74GridStateFilterValue ;
}

final  class tterminwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Tterminwwds_1_filterfulltext ,
                                          String AV83Tterminwwds_3_tftermcod_sel ,
                                          String AV82Tterminwwds_2_tftermcod ,
                                          String AV85Tterminwwds_5_tftermdsc_sel ,
                                          String AV84Tterminwwds_4_tftermdsc ,
                                          String AV87Tterminwwds_7_tfimpcod_sel ,
                                          String AV86Tterminwwds_6_tfimpcod ,
                                          String AV89Tterminwwds_9_tftermusu_sel ,
                                          String AV88Tterminwwds_8_tftermusu ,
                                          String A942TermCod ,
                                          String A8898TermDsc ,
                                          String A574ImpCod ,
                                          String A1189TermUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS TermUsu, NULL AS ImpCod, NULL AS TermDsc, TermCod FROM ( SELECT TermUsu, ImpCod, TermDsc, TermCod FROM TXPTERMIN" ;
      if ( ! (GXutil.strcmp("", AV81Tterminwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TermCod) like '%' || UPPER(?)) or ( UPPER(TermDsc) like '%' || UPPER(?)) or ( UPPER(ImpCod) like '%' || UPPER(?)) or ( UPPER(TermUsu) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tterminwwds_3_tftermcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Tterminwwds_2_tftermcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tterminwwds_3_tftermcod_sel)==0) )
      {
         addWhere(sWhereString, "(TermCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tterminwwds_5_tftermdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Tterminwwds_4_tftermdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tterminwwds_5_tftermdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TermDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tterminwwds_7_tfimpcod_sel)==0) && ( ! (GXutil.strcmp("", AV86Tterminwwds_6_tfimpcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ImpCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tterminwwds_7_tfimpcod_sel)==0) )
      {
         addWhere(sWhereString, "(ImpCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tterminwwds_9_tftermusu_sel)==0) && ( ! (GXutil.strcmp("", AV88Tterminwwds_8_tftermusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tterminwwds_9_tftermusu_sel)==0) )
      {
         addWhere(sWhereString, "(TermUsu = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TermCod" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY TermCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P097H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Tterminwwds_1_filterfulltext ,
                                          String AV83Tterminwwds_3_tftermcod_sel ,
                                          String AV82Tterminwwds_2_tftermcod ,
                                          String AV85Tterminwwds_5_tftermdsc_sel ,
                                          String AV84Tterminwwds_4_tftermdsc ,
                                          String AV87Tterminwwds_7_tfimpcod_sel ,
                                          String AV86Tterminwwds_6_tfimpcod ,
                                          String AV89Tterminwwds_9_tftermusu_sel ,
                                          String AV88Tterminwwds_8_tftermusu ,
                                          String A942TermCod ,
                                          String A8898TermDsc ,
                                          String A574ImpCod ,
                                          String A1189TermUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT TermDsc, TermUsu, ImpCod, TermCod FROM TXPTERMIN" ;
      if ( ! (GXutil.strcmp("", AV81Tterminwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TermCod) like '%' || UPPER(?)) or ( UPPER(TermDsc) like '%' || UPPER(?)) or ( UPPER(ImpCod) like '%' || UPPER(?)) or ( UPPER(TermUsu) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tterminwwds_3_tftermcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Tterminwwds_2_tftermcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tterminwwds_3_tftermcod_sel)==0) )
      {
         addWhere(sWhereString, "(TermCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tterminwwds_5_tftermdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Tterminwwds_4_tftermdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tterminwwds_5_tftermdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TermDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tterminwwds_7_tfimpcod_sel)==0) && ( ! (GXutil.strcmp("", AV86Tterminwwds_6_tfimpcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ImpCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tterminwwds_7_tfimpcod_sel)==0) )
      {
         addWhere(sWhereString, "(ImpCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tterminwwds_9_tftermusu_sel)==0) && ( ! (GXutil.strcmp("", AV88Tterminwwds_8_tftermusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tterminwwds_9_tftermusu_sel)==0) )
      {
         addWhere(sWhereString, "(TermUsu = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TermDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P097H4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Tterminwwds_1_filterfulltext ,
                                          String AV83Tterminwwds_3_tftermcod_sel ,
                                          String AV82Tterminwwds_2_tftermcod ,
                                          String AV85Tterminwwds_5_tftermdsc_sel ,
                                          String AV84Tterminwwds_4_tftermdsc ,
                                          String AV87Tterminwwds_7_tfimpcod_sel ,
                                          String AV86Tterminwwds_6_tfimpcod ,
                                          String AV89Tterminwwds_9_tftermusu_sel ,
                                          String AV88Tterminwwds_8_tftermusu ,
                                          String A942TermCod ,
                                          String A8898TermDsc ,
                                          String A574ImpCod ,
                                          String A1189TermUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ImpCod, TermUsu, TermDsc, TermCod FROM TXPTERMIN" ;
      if ( ! (GXutil.strcmp("", AV81Tterminwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TermCod) like '%' || UPPER(?)) or ( UPPER(TermDsc) like '%' || UPPER(?)) or ( UPPER(ImpCod) like '%' || UPPER(?)) or ( UPPER(TermUsu) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tterminwwds_3_tftermcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Tterminwwds_2_tftermcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tterminwwds_3_tftermcod_sel)==0) )
      {
         addWhere(sWhereString, "(TermCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tterminwwds_5_tftermdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Tterminwwds_4_tftermdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tterminwwds_5_tftermdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TermDsc = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tterminwwds_7_tfimpcod_sel)==0) && ( ! (GXutil.strcmp("", AV86Tterminwwds_6_tfimpcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ImpCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tterminwwds_7_tfimpcod_sel)==0) )
      {
         addWhere(sWhereString, "(ImpCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tterminwwds_9_tftermusu_sel)==0) && ( ! (GXutil.strcmp("", AV88Tterminwwds_8_tftermusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tterminwwds_9_tftermusu_sel)==0) )
      {
         addWhere(sWhereString, "(TermUsu = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ImpCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P097H5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Tterminwwds_1_filterfulltext ,
                                          String AV83Tterminwwds_3_tftermcod_sel ,
                                          String AV82Tterminwwds_2_tftermcod ,
                                          String AV85Tterminwwds_5_tftermdsc_sel ,
                                          String AV84Tterminwwds_4_tftermdsc ,
                                          String AV87Tterminwwds_7_tfimpcod_sel ,
                                          String AV86Tterminwwds_6_tfimpcod ,
                                          String AV89Tterminwwds_9_tftermusu_sel ,
                                          String AV88Tterminwwds_8_tftermusu ,
                                          String A942TermCod ,
                                          String A8898TermDsc ,
                                          String A574ImpCod ,
                                          String A1189TermUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[12];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT TermUsu, ImpCod, TermDsc, TermCod FROM TXPTERMIN" ;
      if ( ! (GXutil.strcmp("", AV81Tterminwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TermCod) like '%' || UPPER(?)) or ( UPPER(TermDsc) like '%' || UPPER(?)) or ( UPPER(ImpCod) like '%' || UPPER(?)) or ( UPPER(TermUsu) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tterminwwds_3_tftermcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Tterminwwds_2_tftermcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tterminwwds_3_tftermcod_sel)==0) )
      {
         addWhere(sWhereString, "(TermCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tterminwwds_5_tftermdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Tterminwwds_4_tftermdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tterminwwds_5_tftermdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TermDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tterminwwds_7_tfimpcod_sel)==0) && ( ! (GXutil.strcmp("", AV86Tterminwwds_6_tfimpcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ImpCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tterminwwds_7_tfimpcod_sel)==0) )
      {
         addWhere(sWhereString, "(ImpCod = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tterminwwds_9_tftermusu_sel)==0) && ( ! (GXutil.strcmp("", AV88Tterminwwds_8_tftermusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TermUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tterminwwds_9_tftermusu_sel)==0) )
      {
         addWhere(sWhereString, "(TermUsu = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TermUsu" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P097H2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P097H3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P097H4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 3 :
                  return conditional_P097H5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097H4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097H5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 10);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 8);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 8);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 8);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 8);
               }
               return;
      }
   }

}

