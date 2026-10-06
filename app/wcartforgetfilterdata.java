package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcartforgetfilterdata extends GXProcedure
{
   public wcartforgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcartforgetfilterdata.class ), "" );
   }

   public wcartforgetfilterdata( int remoteHandle ,
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
      wcartforgetfilterdata.this.aP5 = new String[] {""};
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
      wcartforgetfilterdata.this.AV22DDOName = aP0;
      wcartforgetfilterdata.this.AV20SearchTxt = aP1;
      wcartforgetfilterdata.this.AV21SearchTxtTo = aP2;
      wcartforgetfilterdata.this.aP3 = aP3;
      wcartforgetfilterdata.this.aP4 = aP4;
      wcartforgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASFORMUL") == 0 )
      {
         /* Execute user subroutine: 'LOADFASFORMULOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASACAB") == 0 )
      {
         /* Execute user subroutine: 'LOADFASACABOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("WCArtForGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCArtForGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WCArtForGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMLIN") == 0 )
         {
            AV10TFProNumLin = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFProNumLin_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV16TFFasForMul = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV17TFFasForMul_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV18TFFasAcab = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV19TFFasAcab_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV38Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV39Clicod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV40CliNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD") == 0 )
         {
            AV41Artcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCOD") == 0 )
         {
            AV42Procod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRODSC") == 0 )
         {
            AV43Prodsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV20SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV51Wcartfords_1_filterfulltext = AV46FilterFullText ;
      AV52Wcartfords_2_tfpronumlin = AV10TFProNumLin ;
      AV53Wcartfords_3_tfpronumlin_to = AV11TFProNumLin_To ;
      AV54Wcartfords_4_tffascod = AV12TFFasCod ;
      AV55Wcartfords_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV56Wcartfords_6_tffasdsc = AV14TFFasDsc ;
      AV57Wcartfords_7_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV58Wcartfords_8_tffasformul = AV16TFFasForMul ;
      AV59Wcartfords_9_tffasformul_sel = AV17TFFasForMul_Sel ;
      AV60Wcartfords_10_tffasacab = AV18TFFasAcab ;
      AV61Wcartfords_11_tffasacab_sel = AV19TFFasAcab_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Wcartfords_1_filterfulltext ,
                                           Short.valueOf(AV52Wcartfords_2_tfpronumlin) ,
                                           Short.valueOf(AV53Wcartfords_3_tfpronumlin_to) ,
                                           AV55Wcartfords_5_tffascod_sel ,
                                           AV54Wcartfords_4_tffascod ,
                                           AV57Wcartfords_7_tffasdsc_sel ,
                                           AV56Wcartfords_6_tffasdsc ,
                                           AV59Wcartfords_9_tffasformul_sel ,
                                           AV58Wcartfords_8_tffasformul ,
                                           AV61Wcartfords_11_tffasacab_sel ,
                                           AV60Wcartfords_10_tffasacab ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           A4903FasAcab ,
                                           A758ProCod ,
                                           AV42Procod ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV54Wcartfords_4_tffascod = GXutil.padr( GXutil.rtrim( AV54Wcartfords_4_tffascod), 8, "%") ;
      lV56Wcartfords_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV56Wcartfords_6_tffasdsc), 28, "%") ;
      lV58Wcartfords_8_tffasformul = GXutil.padr( GXutil.rtrim( AV58Wcartfords_8_tffasformul), 1, "%") ;
      lV60Wcartfords_10_tffasacab = GXutil.padr( GXutil.rtrim( AV60Wcartfords_10_tffasacab), 1, "%") ;
      /* Using cursor P08GM2 */
      pr_default.execute(0, new Object[] {AV38Emprcod, AV42Procod, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, Short.valueOf(AV52Wcartfords_2_tfpronumlin), Short.valueOf(AV53Wcartfords_3_tfpronumlin_to), lV54Wcartfords_4_tffascod, AV55Wcartfords_5_tffascod_sel, lV56Wcartfords_6_tffasdsc, AV57Wcartfords_7_tffasdsc_sel, lV58Wcartfords_8_tffasformul, AV59Wcartfords_9_tffasformul_sel, lV60Wcartfords_10_tffasacab, AV61Wcartfords_11_tffasacab_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8GM2 = false ;
         A396EmprCod = P08GM2_A396EmprCod[0] ;
         A457FasCod = P08GM2_A457FasCod[0] ;
         A758ProCod = P08GM2_A758ProCod[0] ;
         A4903FasAcab = P08GM2_A4903FasAcab[0] ;
         n4903FasAcab = P08GM2_n4903FasAcab[0] ;
         A4286FasForMul = P08GM2_A4286FasForMul[0] ;
         n4286FasForMul = P08GM2_n4286FasForMul[0] ;
         A460FasDsc = P08GM2_A460FasDsc[0] ;
         A774ProNumLin = P08GM2_A774ProNumLin[0] ;
         A4903FasAcab = P08GM2_A4903FasAcab[0] ;
         n4903FasAcab = P08GM2_n4903FasAcab[0] ;
         A4286FasForMul = P08GM2_A4286FasForMul[0] ;
         n4286FasForMul = P08GM2_n4286FasForMul[0] ;
         A460FasDsc = P08GM2_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08GM2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08GM2_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk8GM2 = false ;
            A758ProCod = P08GM2_A758ProCod[0] ;
            A774ProNumLin = P08GM2_A774ProNumLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8GM2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV24Option = A457FasCod ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV25Options.add(AV24Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GM2 )
         {
            brk8GM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV20SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      AV51Wcartfords_1_filterfulltext = AV46FilterFullText ;
      AV52Wcartfords_2_tfpronumlin = AV10TFProNumLin ;
      AV53Wcartfords_3_tfpronumlin_to = AV11TFProNumLin_To ;
      AV54Wcartfords_4_tffascod = AV12TFFasCod ;
      AV55Wcartfords_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV56Wcartfords_6_tffasdsc = AV14TFFasDsc ;
      AV57Wcartfords_7_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV58Wcartfords_8_tffasformul = AV16TFFasForMul ;
      AV59Wcartfords_9_tffasformul_sel = AV17TFFasForMul_Sel ;
      AV60Wcartfords_10_tffasacab = AV18TFFasAcab ;
      AV61Wcartfords_11_tffasacab_sel = AV19TFFasAcab_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Wcartfords_1_filterfulltext ,
                                           Short.valueOf(AV52Wcartfords_2_tfpronumlin) ,
                                           Short.valueOf(AV53Wcartfords_3_tfpronumlin_to) ,
                                           AV55Wcartfords_5_tffascod_sel ,
                                           AV54Wcartfords_4_tffascod ,
                                           AV57Wcartfords_7_tffasdsc_sel ,
                                           AV56Wcartfords_6_tffasdsc ,
                                           AV59Wcartfords_9_tffasformul_sel ,
                                           AV58Wcartfords_8_tffasformul ,
                                           AV61Wcartfords_11_tffasacab_sel ,
                                           AV60Wcartfords_10_tffasacab ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           A4903FasAcab ,
                                           A758ProCod ,
                                           AV42Procod ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV54Wcartfords_4_tffascod = GXutil.padr( GXutil.rtrim( AV54Wcartfords_4_tffascod), 8, "%") ;
      lV56Wcartfords_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV56Wcartfords_6_tffasdsc), 28, "%") ;
      lV58Wcartfords_8_tffasformul = GXutil.padr( GXutil.rtrim( AV58Wcartfords_8_tffasformul), 1, "%") ;
      lV60Wcartfords_10_tffasacab = GXutil.padr( GXutil.rtrim( AV60Wcartfords_10_tffasacab), 1, "%") ;
      /* Using cursor P08GM3 */
      pr_default.execute(1, new Object[] {AV38Emprcod, AV42Procod, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, Short.valueOf(AV52Wcartfords_2_tfpronumlin), Short.valueOf(AV53Wcartfords_3_tfpronumlin_to), lV54Wcartfords_4_tffascod, AV55Wcartfords_5_tffascod_sel, lV56Wcartfords_6_tffasdsc, AV57Wcartfords_7_tffasdsc_sel, lV58Wcartfords_8_tffasformul, AV59Wcartfords_9_tffasformul_sel, lV60Wcartfords_10_tffasacab, AV61Wcartfords_11_tffasacab_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8GM4 = false ;
         A457FasCod = P08GM3_A457FasCod[0] ;
         A396EmprCod = P08GM3_A396EmprCod[0] ;
         A758ProCod = P08GM3_A758ProCod[0] ;
         A4903FasAcab = P08GM3_A4903FasAcab[0] ;
         n4903FasAcab = P08GM3_n4903FasAcab[0] ;
         A4286FasForMul = P08GM3_A4286FasForMul[0] ;
         n4286FasForMul = P08GM3_n4286FasForMul[0] ;
         A460FasDsc = P08GM3_A460FasDsc[0] ;
         A774ProNumLin = P08GM3_A774ProNumLin[0] ;
         A4903FasAcab = P08GM3_A4903FasAcab[0] ;
         n4903FasAcab = P08GM3_n4903FasAcab[0] ;
         A4286FasForMul = P08GM3_A4286FasForMul[0] ;
         n4286FasForMul = P08GM3_n4286FasForMul[0] ;
         A460FasDsc = P08GM3_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08GM3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08GM3_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk8GM4 = false ;
            A758ProCod = P08GM3_A758ProCod[0] ;
            A774ProNumLin = P08GM3_A774ProNumLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8GM4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV24Option = A460FasDsc ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            AV25Options.add(AV24Option, AV23InsertIndex);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GM4 )
         {
            brk8GM4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFASFORMULOPTIONS' Routine */
      returnInSub = false ;
      AV16TFFasForMul = AV20SearchTxt ;
      AV17TFFasForMul_Sel = "" ;
      AV51Wcartfords_1_filterfulltext = AV46FilterFullText ;
      AV52Wcartfords_2_tfpronumlin = AV10TFProNumLin ;
      AV53Wcartfords_3_tfpronumlin_to = AV11TFProNumLin_To ;
      AV54Wcartfords_4_tffascod = AV12TFFasCod ;
      AV55Wcartfords_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV56Wcartfords_6_tffasdsc = AV14TFFasDsc ;
      AV57Wcartfords_7_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV58Wcartfords_8_tffasformul = AV16TFFasForMul ;
      AV59Wcartfords_9_tffasformul_sel = AV17TFFasForMul_Sel ;
      AV60Wcartfords_10_tffasacab = AV18TFFasAcab ;
      AV61Wcartfords_11_tffasacab_sel = AV19TFFasAcab_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV51Wcartfords_1_filterfulltext ,
                                           Short.valueOf(AV52Wcartfords_2_tfpronumlin) ,
                                           Short.valueOf(AV53Wcartfords_3_tfpronumlin_to) ,
                                           AV55Wcartfords_5_tffascod_sel ,
                                           AV54Wcartfords_4_tffascod ,
                                           AV57Wcartfords_7_tffasdsc_sel ,
                                           AV56Wcartfords_6_tffasdsc ,
                                           AV59Wcartfords_9_tffasformul_sel ,
                                           AV58Wcartfords_8_tffasformul ,
                                           AV61Wcartfords_11_tffasacab_sel ,
                                           AV60Wcartfords_10_tffasacab ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           A4903FasAcab ,
                                           A396EmprCod ,
                                           AV38Emprcod ,
                                           A758ProCod ,
                                           AV42Procod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV54Wcartfords_4_tffascod = GXutil.padr( GXutil.rtrim( AV54Wcartfords_4_tffascod), 8, "%") ;
      lV56Wcartfords_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV56Wcartfords_6_tffasdsc), 28, "%") ;
      lV58Wcartfords_8_tffasformul = GXutil.padr( GXutil.rtrim( AV58Wcartfords_8_tffasformul), 1, "%") ;
      lV60Wcartfords_10_tffasacab = GXutil.padr( GXutil.rtrim( AV60Wcartfords_10_tffasacab), 1, "%") ;
      /* Using cursor P08GM4 */
      pr_default.execute(2, new Object[] {AV38Emprcod, AV42Procod, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, Short.valueOf(AV52Wcartfords_2_tfpronumlin), Short.valueOf(AV53Wcartfords_3_tfpronumlin_to), lV54Wcartfords_4_tffascod, AV55Wcartfords_5_tffascod_sel, lV56Wcartfords_6_tffasdsc, AV57Wcartfords_7_tffasdsc_sel, lV58Wcartfords_8_tffasformul, AV59Wcartfords_9_tffasformul_sel, lV60Wcartfords_10_tffasacab, AV61Wcartfords_11_tffasacab_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8GM6 = false ;
         A396EmprCod = P08GM4_A396EmprCod[0] ;
         A758ProCod = P08GM4_A758ProCod[0] ;
         A4286FasForMul = P08GM4_A4286FasForMul[0] ;
         n4286FasForMul = P08GM4_n4286FasForMul[0] ;
         A4903FasAcab = P08GM4_A4903FasAcab[0] ;
         n4903FasAcab = P08GM4_n4903FasAcab[0] ;
         A460FasDsc = P08GM4_A460FasDsc[0] ;
         A457FasCod = P08GM4_A457FasCod[0] ;
         A774ProNumLin = P08GM4_A774ProNumLin[0] ;
         A4286FasForMul = P08GM4_A4286FasForMul[0] ;
         n4286FasForMul = P08GM4_n4286FasForMul[0] ;
         A4903FasAcab = P08GM4_A4903FasAcab[0] ;
         n4903FasAcab = P08GM4_n4903FasAcab[0] ;
         A460FasDsc = P08GM4_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08GM4_A4286FasForMul[0], A4286FasForMul) == 0 ) )
         {
            brk8GM6 = false ;
            A396EmprCod = P08GM4_A396EmprCod[0] ;
            A758ProCod = P08GM4_A758ProCod[0] ;
            A457FasCod = P08GM4_A457FasCod[0] ;
            A774ProNumLin = P08GM4_A774ProNumLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8GM6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4286FasForMul)==0) )
         {
            AV24Option = A4286FasForMul ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4286FasForMul, "@!"))) ;
            AV25Options.add(AV24Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GM6 )
         {
            brk8GM6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFASACABOPTIONS' Routine */
      returnInSub = false ;
      AV18TFFasAcab = AV20SearchTxt ;
      AV19TFFasAcab_Sel = "" ;
      AV51Wcartfords_1_filterfulltext = AV46FilterFullText ;
      AV52Wcartfords_2_tfpronumlin = AV10TFProNumLin ;
      AV53Wcartfords_3_tfpronumlin_to = AV11TFProNumLin_To ;
      AV54Wcartfords_4_tffascod = AV12TFFasCod ;
      AV55Wcartfords_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV56Wcartfords_6_tffasdsc = AV14TFFasDsc ;
      AV57Wcartfords_7_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV58Wcartfords_8_tffasformul = AV16TFFasForMul ;
      AV59Wcartfords_9_tffasformul_sel = AV17TFFasForMul_Sel ;
      AV60Wcartfords_10_tffasacab = AV18TFFasAcab ;
      AV61Wcartfords_11_tffasacab_sel = AV19TFFasAcab_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV51Wcartfords_1_filterfulltext ,
                                           Short.valueOf(AV52Wcartfords_2_tfpronumlin) ,
                                           Short.valueOf(AV53Wcartfords_3_tfpronumlin_to) ,
                                           AV55Wcartfords_5_tffascod_sel ,
                                           AV54Wcartfords_4_tffascod ,
                                           AV57Wcartfords_7_tffasdsc_sel ,
                                           AV56Wcartfords_6_tffasdsc ,
                                           AV59Wcartfords_9_tffasformul_sel ,
                                           AV58Wcartfords_8_tffasformul ,
                                           AV61Wcartfords_11_tffasacab_sel ,
                                           AV60Wcartfords_10_tffasacab ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           A4903FasAcab ,
                                           A396EmprCod ,
                                           AV38Emprcod ,
                                           A758ProCod ,
                                           AV42Procod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV51Wcartfords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcartfords_1_filterfulltext), "%", "") ;
      lV54Wcartfords_4_tffascod = GXutil.padr( GXutil.rtrim( AV54Wcartfords_4_tffascod), 8, "%") ;
      lV56Wcartfords_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV56Wcartfords_6_tffasdsc), 28, "%") ;
      lV58Wcartfords_8_tffasformul = GXutil.padr( GXutil.rtrim( AV58Wcartfords_8_tffasformul), 1, "%") ;
      lV60Wcartfords_10_tffasacab = GXutil.padr( GXutil.rtrim( AV60Wcartfords_10_tffasacab), 1, "%") ;
      /* Using cursor P08GM5 */
      pr_default.execute(3, new Object[] {AV38Emprcod, AV42Procod, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, lV51Wcartfords_1_filterfulltext, Short.valueOf(AV52Wcartfords_2_tfpronumlin), Short.valueOf(AV53Wcartfords_3_tfpronumlin_to), lV54Wcartfords_4_tffascod, AV55Wcartfords_5_tffascod_sel, lV56Wcartfords_6_tffasdsc, AV57Wcartfords_7_tffasdsc_sel, lV58Wcartfords_8_tffasformul, AV59Wcartfords_9_tffasformul_sel, lV60Wcartfords_10_tffasacab, AV61Wcartfords_11_tffasacab_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8GM8 = false ;
         A396EmprCod = P08GM5_A396EmprCod[0] ;
         A758ProCod = P08GM5_A758ProCod[0] ;
         A4286FasForMul = P08GM5_A4286FasForMul[0] ;
         n4286FasForMul = P08GM5_n4286FasForMul[0] ;
         A4903FasAcab = P08GM5_A4903FasAcab[0] ;
         n4903FasAcab = P08GM5_n4903FasAcab[0] ;
         A460FasDsc = P08GM5_A460FasDsc[0] ;
         A457FasCod = P08GM5_A457FasCod[0] ;
         A774ProNumLin = P08GM5_A774ProNumLin[0] ;
         A4286FasForMul = P08GM5_A4286FasForMul[0] ;
         n4286FasForMul = P08GM5_n4286FasForMul[0] ;
         A4903FasAcab = P08GM5_A4903FasAcab[0] ;
         n4903FasAcab = P08GM5_n4903FasAcab[0] ;
         A460FasDsc = P08GM5_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08GM5_A4903FasAcab[0], A4903FasAcab) == 0 ) )
         {
            brk8GM8 = false ;
            A396EmprCod = P08GM5_A396EmprCod[0] ;
            A758ProCod = P08GM5_A758ProCod[0] ;
            A457FasCod = P08GM5_A457FasCod[0] ;
            A774ProNumLin = P08GM5_A774ProNumLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8GM8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4903FasAcab)==0) )
         {
            AV24Option = A4903FasAcab ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4903FasAcab, "@!"))) ;
            AV25Options.add(AV24Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GM8 )
         {
            brk8GM8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcartforgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = wcartforgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = wcartforgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46FilterFullText = "" ;
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV16TFFasForMul = "" ;
      AV17TFFasForMul_Sel = "" ;
      AV18TFFasAcab = "" ;
      AV19TFFasAcab_Sel = "" ;
      AV38Emprcod = "" ;
      AV40CliNom = "" ;
      AV41Artcod = "" ;
      AV42Procod = "" ;
      AV43Prodsc = "" ;
      A457FasCod = "" ;
      AV51Wcartfords_1_filterfulltext = "" ;
      AV54Wcartfords_4_tffascod = "" ;
      AV55Wcartfords_5_tffascod_sel = "" ;
      AV56Wcartfords_6_tffasdsc = "" ;
      AV57Wcartfords_7_tffasdsc_sel = "" ;
      AV58Wcartfords_8_tffasformul = "" ;
      AV59Wcartfords_9_tffasformul_sel = "" ;
      AV60Wcartfords_10_tffasacab = "" ;
      AV61Wcartfords_11_tffasacab_sel = "" ;
      scmdbuf = "" ;
      lV51Wcartfords_1_filterfulltext = "" ;
      lV54Wcartfords_4_tffascod = "" ;
      lV56Wcartfords_6_tffasdsc = "" ;
      lV58Wcartfords_8_tffasformul = "" ;
      lV60Wcartfords_10_tffasacab = "" ;
      A460FasDsc = "" ;
      A4286FasForMul = "" ;
      A4903FasAcab = "" ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      P08GM2_A396EmprCod = new String[] {""} ;
      P08GM2_A457FasCod = new String[] {""} ;
      P08GM2_A758ProCod = new String[] {""} ;
      P08GM2_A4903FasAcab = new String[] {""} ;
      P08GM2_n4903FasAcab = new boolean[] {false} ;
      P08GM2_A4286FasForMul = new String[] {""} ;
      P08GM2_n4286FasForMul = new boolean[] {false} ;
      P08GM2_A460FasDsc = new String[] {""} ;
      P08GM2_A774ProNumLin = new short[1] ;
      AV24Option = "" ;
      AV27OptionDesc = "" ;
      P08GM3_A457FasCod = new String[] {""} ;
      P08GM3_A396EmprCod = new String[] {""} ;
      P08GM3_A758ProCod = new String[] {""} ;
      P08GM3_A4903FasAcab = new String[] {""} ;
      P08GM3_n4903FasAcab = new boolean[] {false} ;
      P08GM3_A4286FasForMul = new String[] {""} ;
      P08GM3_n4286FasForMul = new boolean[] {false} ;
      P08GM3_A460FasDsc = new String[] {""} ;
      P08GM3_A774ProNumLin = new short[1] ;
      P08GM4_A396EmprCod = new String[] {""} ;
      P08GM4_A758ProCod = new String[] {""} ;
      P08GM4_A4286FasForMul = new String[] {""} ;
      P08GM4_n4286FasForMul = new boolean[] {false} ;
      P08GM4_A4903FasAcab = new String[] {""} ;
      P08GM4_n4903FasAcab = new boolean[] {false} ;
      P08GM4_A460FasDsc = new String[] {""} ;
      P08GM4_A457FasCod = new String[] {""} ;
      P08GM4_A774ProNumLin = new short[1] ;
      P08GM5_A396EmprCod = new String[] {""} ;
      P08GM5_A758ProCod = new String[] {""} ;
      P08GM5_A4286FasForMul = new String[] {""} ;
      P08GM5_n4286FasForMul = new boolean[] {false} ;
      P08GM5_A4903FasAcab = new String[] {""} ;
      P08GM5_n4903FasAcab = new boolean[] {false} ;
      P08GM5_A460FasDsc = new String[] {""} ;
      P08GM5_A457FasCod = new String[] {""} ;
      P08GM5_A774ProNumLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcartforgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08GM2_A396EmprCod, P08GM2_A457FasCod, P08GM2_A758ProCod, P08GM2_A4903FasAcab, P08GM2_n4903FasAcab, P08GM2_A4286FasForMul, P08GM2_n4286FasForMul, P08GM2_A460FasDsc, P08GM2_A774ProNumLin
            }
            , new Object[] {
            P08GM3_A457FasCod, P08GM3_A396EmprCod, P08GM3_A758ProCod, P08GM3_A4903FasAcab, P08GM3_n4903FasAcab, P08GM3_A4286FasForMul, P08GM3_n4286FasForMul, P08GM3_A460FasDsc, P08GM3_A774ProNumLin
            }
            , new Object[] {
            P08GM4_A396EmprCod, P08GM4_A758ProCod, P08GM4_A4286FasForMul, P08GM4_n4286FasForMul, P08GM4_A4903FasAcab, P08GM4_n4903FasAcab, P08GM4_A460FasDsc, P08GM4_A457FasCod, P08GM4_A774ProNumLin
            }
            , new Object[] {
            P08GM5_A396EmprCod, P08GM5_A758ProCod, P08GM5_A4286FasForMul, P08GM5_n4286FasForMul, P08GM5_A4903FasAcab, P08GM5_n4903FasAcab, P08GM5_A460FasDsc, P08GM5_A457FasCod, P08GM5_A774ProNumLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFProNumLin ;
   private short AV11TFProNumLin_To ;
   private short AV52Wcartfords_2_tfpronumlin ;
   private short AV53Wcartfords_3_tfpronumlin_to ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV39Clicod ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV16TFFasForMul ;
   private String AV17TFFasForMul_Sel ;
   private String AV18TFFasAcab ;
   private String AV19TFFasAcab_Sel ;
   private String AV38Emprcod ;
   private String AV40CliNom ;
   private String AV41Artcod ;
   private String AV42Procod ;
   private String AV43Prodsc ;
   private String A457FasCod ;
   private String AV54Wcartfords_4_tffascod ;
   private String AV55Wcartfords_5_tffascod_sel ;
   private String AV56Wcartfords_6_tffasdsc ;
   private String AV57Wcartfords_7_tffasdsc_sel ;
   private String AV58Wcartfords_8_tffasformul ;
   private String AV59Wcartfords_9_tffasformul_sel ;
   private String AV60Wcartfords_10_tffasacab ;
   private String AV61Wcartfords_11_tffasacab_sel ;
   private String scmdbuf ;
   private String lV54Wcartfords_4_tffascod ;
   private String lV56Wcartfords_6_tffasdsc ;
   private String lV58Wcartfords_8_tffasformul ;
   private String lV60Wcartfords_10_tffasacab ;
   private String A460FasDsc ;
   private String A4286FasForMul ;
   private String A4903FasAcab ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8GM2 ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private boolean brk8GM4 ;
   private boolean brk8GM6 ;
   private boolean brk8GM8 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Wcartfords_1_filterfulltext ;
   private String lV51Wcartfords_1_filterfulltext ;
   private String AV24Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08GM2_A396EmprCod ;
   private String[] P08GM2_A457FasCod ;
   private String[] P08GM2_A758ProCod ;
   private String[] P08GM2_A4903FasAcab ;
   private boolean[] P08GM2_n4903FasAcab ;
   private String[] P08GM2_A4286FasForMul ;
   private boolean[] P08GM2_n4286FasForMul ;
   private String[] P08GM2_A460FasDsc ;
   private short[] P08GM2_A774ProNumLin ;
   private String[] P08GM3_A457FasCod ;
   private String[] P08GM3_A396EmprCod ;
   private String[] P08GM3_A758ProCod ;
   private String[] P08GM3_A4903FasAcab ;
   private boolean[] P08GM3_n4903FasAcab ;
   private String[] P08GM3_A4286FasForMul ;
   private boolean[] P08GM3_n4286FasForMul ;
   private String[] P08GM3_A460FasDsc ;
   private short[] P08GM3_A774ProNumLin ;
   private String[] P08GM4_A396EmprCod ;
   private String[] P08GM4_A758ProCod ;
   private String[] P08GM4_A4286FasForMul ;
   private boolean[] P08GM4_n4286FasForMul ;
   private String[] P08GM4_A4903FasAcab ;
   private boolean[] P08GM4_n4903FasAcab ;
   private String[] P08GM4_A460FasDsc ;
   private String[] P08GM4_A457FasCod ;
   private short[] P08GM4_A774ProNumLin ;
   private String[] P08GM5_A396EmprCod ;
   private String[] P08GM5_A758ProCod ;
   private String[] P08GM5_A4286FasForMul ;
   private boolean[] P08GM5_n4286FasForMul ;
   private String[] P08GM5_A4903FasAcab ;
   private boolean[] P08GM5_n4903FasAcab ;
   private String[] P08GM5_A460FasDsc ;
   private String[] P08GM5_A457FasCod ;
   private short[] P08GM5_A774ProNumLin ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class wcartforgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Wcartfords_1_filterfulltext ,
                                          short AV52Wcartfords_2_tfpronumlin ,
                                          short AV53Wcartfords_3_tfpronumlin_to ,
                                          String AV55Wcartfords_5_tffascod_sel ,
                                          String AV54Wcartfords_4_tffascod ,
                                          String AV57Wcartfords_7_tffasdsc_sel ,
                                          String AV56Wcartfords_6_tffasdsc ,
                                          String AV59Wcartfords_9_tffasformul_sel ,
                                          String AV58Wcartfords_8_tffasformul ,
                                          String AV61Wcartfords_11_tffasacab_sel ,
                                          String AV60Wcartfords_10_tffasacab ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          String A4903FasAcab ,
                                          String A758ProCod ,
                                          String AV42Procod ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.ProCod, T2.FasAcab, T2.FasForMul, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(T2.FasForMul = 'S')");
      if ( ! (GXutil.strcmp("", AV51Wcartfords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( UPPER(T2.FasAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV52Wcartfords_2_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcartfords_3_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wcartfords_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV54Wcartfords_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wcartfords_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcartfords_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcartfords_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcartfords_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Wcartfords_9_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcartfords_8_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcartfords_9_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Wcartfords_11_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcartfords_10_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcartfords_11_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08GM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Wcartfords_1_filterfulltext ,
                                          short AV52Wcartfords_2_tfpronumlin ,
                                          short AV53Wcartfords_3_tfpronumlin_to ,
                                          String AV55Wcartfords_5_tffascod_sel ,
                                          String AV54Wcartfords_4_tffascod ,
                                          String AV57Wcartfords_7_tffasdsc_sel ,
                                          String AV56Wcartfords_6_tffasdsc ,
                                          String AV59Wcartfords_9_tffasformul_sel ,
                                          String AV58Wcartfords_8_tffasformul ,
                                          String AV61Wcartfords_11_tffasacab_sel ,
                                          String AV60Wcartfords_10_tffasacab ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          String A4903FasAcab ,
                                          String A758ProCod ,
                                          String AV42Procod ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[17];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.FasCod, T1.EmprCod, T1.ProCod, T2.FasAcab, T2.FasForMul, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(T2.FasForMul = 'S')");
      if ( ! (GXutil.strcmp("", AV51Wcartfords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( UPPER(T2.FasAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV52Wcartfords_2_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcartfords_3_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wcartfords_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV54Wcartfords_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wcartfords_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcartfords_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcartfords_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcartfords_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Wcartfords_9_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcartfords_8_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcartfords_9_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Wcartfords_11_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcartfords_10_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcartfords_11_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08GM4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Wcartfords_1_filterfulltext ,
                                          short AV52Wcartfords_2_tfpronumlin ,
                                          short AV53Wcartfords_3_tfpronumlin_to ,
                                          String AV55Wcartfords_5_tffascod_sel ,
                                          String AV54Wcartfords_4_tffascod ,
                                          String AV57Wcartfords_7_tffasdsc_sel ,
                                          String AV56Wcartfords_6_tffasdsc ,
                                          String AV59Wcartfords_9_tffasformul_sel ,
                                          String AV58Wcartfords_8_tffasformul ,
                                          String AV61Wcartfords_11_tffasacab_sel ,
                                          String AV60Wcartfords_10_tffasacab ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          String A4903FasAcab ,
                                          String A396EmprCod ,
                                          String AV38Emprcod ,
                                          String A758ProCod ,
                                          String AV42Procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[17];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T2.FasForMul, T2.FasAcab, T2.FasDsc, T1.FasCod, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T2.FasForMul = 'S')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (GXutil.strcmp("", AV51Wcartfords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( UPPER(T2.FasAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV52Wcartfords_2_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcartfords_3_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wcartfords_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV54Wcartfords_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wcartfords_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcartfords_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcartfords_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcartfords_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Wcartfords_9_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcartfords_8_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcartfords_9_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Wcartfords_11_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcartfords_10_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcartfords_11_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasForMul" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08GM5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Wcartfords_1_filterfulltext ,
                                          short AV52Wcartfords_2_tfpronumlin ,
                                          short AV53Wcartfords_3_tfpronumlin_to ,
                                          String AV55Wcartfords_5_tffascod_sel ,
                                          String AV54Wcartfords_4_tffascod ,
                                          String AV57Wcartfords_7_tffasdsc_sel ,
                                          String AV56Wcartfords_6_tffasdsc ,
                                          String AV59Wcartfords_9_tffasformul_sel ,
                                          String AV58Wcartfords_8_tffasformul ,
                                          String AV61Wcartfords_11_tffasacab_sel ,
                                          String AV60Wcartfords_10_tffasacab ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          String A4903FasAcab ,
                                          String A396EmprCod ,
                                          String AV38Emprcod ,
                                          String A758ProCod ,
                                          String AV42Procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T2.FasForMul, T2.FasAcab, T2.FasDsc, T1.FasCod, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(T2.FasForMul = 'S')");
      if ( ! (GXutil.strcmp("", AV51Wcartfords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( UPPER(T2.FasAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV52Wcartfords_2_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcartfords_3_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wcartfords_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV54Wcartfords_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wcartfords_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcartfords_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcartfords_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcartfords_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Wcartfords_9_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcartfords_8_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcartfords_9_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Wcartfords_11_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcartfords_10_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcartfords_11_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasAcab" ;
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
                  return conditional_P08GM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
            case 1 :
                  return conditional_P08GM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
            case 2 :
                  return conditional_P08GM4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
            case 3 :
                  return conditional_P08GM5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GM4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GM5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 28);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 28);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 28);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 28);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((short[]) buf[8])[0] = rslt.getShort(7);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               return;
      }
   }

}

