package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class nwdpfaseswwgetfilterdata extends GXProcedure
{
   public nwdpfaseswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpfaseswwgetfilterdata.class ), "" );
   }

   public nwdpfaseswwgetfilterdata( int remoteHandle ,
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
      nwdpfaseswwgetfilterdata.this.aP5 = new String[] {""};
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
      nwdpfaseswwgetfilterdata.this.AV24DDOName = aP0;
      nwdpfaseswwgetfilterdata.this.AV22SearchTxt = aP1;
      nwdpfaseswwgetfilterdata.this.AV23SearchTxtTo = aP2;
      nwdpfaseswwgetfilterdata.this.aP3 = aP3;
      nwdpfaseswwgetfilterdata.this.aP4 = aP4;
      nwdpfaseswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_EMPRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_DISARTCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("NwDPFasesWWGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "NwDPFasesWWGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("NwDPFasesWWGridState"), null, null);
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV12TFDisCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFDisCod_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV51TFCliCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFCliCod_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV53TFDisArtCod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV54TFDisArtCod_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV18TFProCod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV19TFProCod_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV20TFProDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV21TFProDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV22SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV60Nwdpfaseswwds_1_filterfulltext = AV55FilterFullText ;
      AV61Nwdpfaseswwds_2_tfemprcod = AV10TFEmprCod ;
      AV62Nwdpfaseswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV63Nwdpfaseswwds_4_tfdiscod = AV12TFDisCod ;
      AV64Nwdpfaseswwds_5_tfdiscod_to = AV13TFDisCod_To ;
      AV65Nwdpfaseswwds_6_tfclicod = AV51TFCliCod ;
      AV66Nwdpfaseswwds_7_tfclicod_to = AV52TFCliCod_To ;
      AV67Nwdpfaseswwds_8_tfdisartcod = AV53TFDisArtCod ;
      AV68Nwdpfaseswwds_9_tfdisartcod_sel = AV54TFDisArtCod_Sel ;
      AV69Nwdpfaseswwds_10_tfprocod = AV18TFProCod ;
      AV70Nwdpfaseswwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Nwdpfaseswwds_12_tfprodsc = AV20TFProDsc ;
      AV72Nwdpfaseswwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV60Nwdpfaseswwds_1_filterfulltext ,
                                           AV62Nwdpfaseswwds_3_tfemprcod_sel ,
                                           AV61Nwdpfaseswwds_2_tfemprcod ,
                                           Integer.valueOf(AV63Nwdpfaseswwds_4_tfdiscod) ,
                                           Integer.valueOf(AV64Nwdpfaseswwds_5_tfdiscod_to) ,
                                           Integer.valueOf(AV65Nwdpfaseswwds_6_tfclicod) ,
                                           Integer.valueOf(AV66Nwdpfaseswwds_7_tfclicod_to) ,
                                           AV68Nwdpfaseswwds_9_tfdisartcod_sel ,
                                           AV67Nwdpfaseswwds_8_tfdisartcod ,
                                           AV70Nwdpfaseswwds_11_tfprocod_sel ,
                                           AV69Nwdpfaseswwds_10_tfprocod ,
                                           AV72Nwdpfaseswwds_13_tfprodsc_sel ,
                                           AV71Nwdpfaseswwds_12_tfprodsc ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           A758ProCod ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV61Nwdpfaseswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV61Nwdpfaseswwds_2_tfemprcod), 3, "%") ;
      lV67Nwdpfaseswwds_8_tfdisartcod = GXutil.padr( GXutil.rtrim( AV67Nwdpfaseswwds_8_tfdisartcod), 16, "%") ;
      lV69Nwdpfaseswwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Nwdpfaseswwds_10_tfprocod), 8, "%") ;
      lV71Nwdpfaseswwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Nwdpfaseswwds_12_tfprodsc), 40, "%") ;
      /* Using cursor P08EA2 */
      pr_default.execute(0, new Object[] {lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV61Nwdpfaseswwds_2_tfemprcod, AV62Nwdpfaseswwds_3_tfemprcod_sel, Integer.valueOf(AV63Nwdpfaseswwds_4_tfdiscod), Integer.valueOf(AV64Nwdpfaseswwds_5_tfdiscod_to), Integer.valueOf(AV65Nwdpfaseswwds_6_tfclicod), Integer.valueOf(AV66Nwdpfaseswwds_7_tfclicod_to), lV67Nwdpfaseswwds_8_tfdisartcod, AV68Nwdpfaseswwds_9_tfdisartcod_sel, lV69Nwdpfaseswwds_10_tfprocod, AV70Nwdpfaseswwds_11_tfprocod_sel, lV71Nwdpfaseswwds_12_tfprodsc, AV72Nwdpfaseswwds_13_tfprodsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8EA2 = false ;
         A396EmprCod = P08EA2_A396EmprCod[0] ;
         A759ProDsc = P08EA2_A759ProDsc[0] ;
         A758ProCod = P08EA2_A758ProCod[0] ;
         A335DisArtCod = P08EA2_A335DisArtCod[0] ;
         A252CliCod = P08EA2_A252CliCod[0] ;
         A361DisCod = P08EA2_A361DisCod[0] ;
         A759ProDsc = P08EA2_A759ProDsc[0] ;
         A335DisArtCod = P08EA2_A335DisArtCod[0] ;
         A252CliCod = P08EA2_A252CliCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08EA2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8EA2 = false ;
            A758ProCod = P08EA2_A758ProCod[0] ;
            A361DisCod = P08EA2_A361DisCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8EA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV26Option = A396EmprCod ;
            AV29OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV27Options.add(AV26Option, 0);
            AV30OptionsDesc.add(AV29OptionDesc, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8EA2 )
         {
            brk8EA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDISARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV53TFDisArtCod = AV22SearchTxt ;
      AV54TFDisArtCod_Sel = "" ;
      AV60Nwdpfaseswwds_1_filterfulltext = AV55FilterFullText ;
      AV61Nwdpfaseswwds_2_tfemprcod = AV10TFEmprCod ;
      AV62Nwdpfaseswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV63Nwdpfaseswwds_4_tfdiscod = AV12TFDisCod ;
      AV64Nwdpfaseswwds_5_tfdiscod_to = AV13TFDisCod_To ;
      AV65Nwdpfaseswwds_6_tfclicod = AV51TFCliCod ;
      AV66Nwdpfaseswwds_7_tfclicod_to = AV52TFCliCod_To ;
      AV67Nwdpfaseswwds_8_tfdisartcod = AV53TFDisArtCod ;
      AV68Nwdpfaseswwds_9_tfdisartcod_sel = AV54TFDisArtCod_Sel ;
      AV69Nwdpfaseswwds_10_tfprocod = AV18TFProCod ;
      AV70Nwdpfaseswwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Nwdpfaseswwds_12_tfprodsc = AV20TFProDsc ;
      AV72Nwdpfaseswwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV60Nwdpfaseswwds_1_filterfulltext ,
                                           AV62Nwdpfaseswwds_3_tfemprcod_sel ,
                                           AV61Nwdpfaseswwds_2_tfemprcod ,
                                           Integer.valueOf(AV63Nwdpfaseswwds_4_tfdiscod) ,
                                           Integer.valueOf(AV64Nwdpfaseswwds_5_tfdiscod_to) ,
                                           Integer.valueOf(AV65Nwdpfaseswwds_6_tfclicod) ,
                                           Integer.valueOf(AV66Nwdpfaseswwds_7_tfclicod_to) ,
                                           AV68Nwdpfaseswwds_9_tfdisartcod_sel ,
                                           AV67Nwdpfaseswwds_8_tfdisartcod ,
                                           AV70Nwdpfaseswwds_11_tfprocod_sel ,
                                           AV69Nwdpfaseswwds_10_tfprocod ,
                                           AV72Nwdpfaseswwds_13_tfprodsc_sel ,
                                           AV71Nwdpfaseswwds_12_tfprodsc ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           A758ProCod ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV61Nwdpfaseswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV61Nwdpfaseswwds_2_tfemprcod), 3, "%") ;
      lV67Nwdpfaseswwds_8_tfdisartcod = GXutil.padr( GXutil.rtrim( AV67Nwdpfaseswwds_8_tfdisartcod), 16, "%") ;
      lV69Nwdpfaseswwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Nwdpfaseswwds_10_tfprocod), 8, "%") ;
      lV71Nwdpfaseswwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Nwdpfaseswwds_12_tfprodsc), 40, "%") ;
      /* Using cursor P08EA3 */
      pr_default.execute(1, new Object[] {lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV61Nwdpfaseswwds_2_tfemprcod, AV62Nwdpfaseswwds_3_tfemprcod_sel, Integer.valueOf(AV63Nwdpfaseswwds_4_tfdiscod), Integer.valueOf(AV64Nwdpfaseswwds_5_tfdiscod_to), Integer.valueOf(AV65Nwdpfaseswwds_6_tfclicod), Integer.valueOf(AV66Nwdpfaseswwds_7_tfclicod_to), lV67Nwdpfaseswwds_8_tfdisartcod, AV68Nwdpfaseswwds_9_tfdisartcod_sel, lV69Nwdpfaseswwds_10_tfprocod, AV70Nwdpfaseswwds_11_tfprocod_sel, lV71Nwdpfaseswwds_12_tfprodsc, AV72Nwdpfaseswwds_13_tfprodsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8EA4 = false ;
         A335DisArtCod = P08EA3_A335DisArtCod[0] ;
         A759ProDsc = P08EA3_A759ProDsc[0] ;
         A758ProCod = P08EA3_A758ProCod[0] ;
         A252CliCod = P08EA3_A252CliCod[0] ;
         A361DisCod = P08EA3_A361DisCod[0] ;
         A396EmprCod = P08EA3_A396EmprCod[0] ;
         A335DisArtCod = P08EA3_A335DisArtCod[0] ;
         A252CliCod = P08EA3_A252CliCod[0] ;
         A759ProDsc = P08EA3_A759ProDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08EA3_A335DisArtCod[0], A335DisArtCod) == 0 ) )
         {
            brk8EA4 = false ;
            A758ProCod = P08EA3_A758ProCod[0] ;
            A361DisCod = P08EA3_A361DisCod[0] ;
            A396EmprCod = P08EA3_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8EA4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A335DisArtCod)==0) )
         {
            AV26Option = A335DisArtCod ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8EA4 )
         {
            brk8EA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFProCod = AV22SearchTxt ;
      AV19TFProCod_Sel = "" ;
      AV60Nwdpfaseswwds_1_filterfulltext = AV55FilterFullText ;
      AV61Nwdpfaseswwds_2_tfemprcod = AV10TFEmprCod ;
      AV62Nwdpfaseswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV63Nwdpfaseswwds_4_tfdiscod = AV12TFDisCod ;
      AV64Nwdpfaseswwds_5_tfdiscod_to = AV13TFDisCod_To ;
      AV65Nwdpfaseswwds_6_tfclicod = AV51TFCliCod ;
      AV66Nwdpfaseswwds_7_tfclicod_to = AV52TFCliCod_To ;
      AV67Nwdpfaseswwds_8_tfdisartcod = AV53TFDisArtCod ;
      AV68Nwdpfaseswwds_9_tfdisartcod_sel = AV54TFDisArtCod_Sel ;
      AV69Nwdpfaseswwds_10_tfprocod = AV18TFProCod ;
      AV70Nwdpfaseswwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Nwdpfaseswwds_12_tfprodsc = AV20TFProDsc ;
      AV72Nwdpfaseswwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV60Nwdpfaseswwds_1_filterfulltext ,
                                           AV62Nwdpfaseswwds_3_tfemprcod_sel ,
                                           AV61Nwdpfaseswwds_2_tfemprcod ,
                                           Integer.valueOf(AV63Nwdpfaseswwds_4_tfdiscod) ,
                                           Integer.valueOf(AV64Nwdpfaseswwds_5_tfdiscod_to) ,
                                           Integer.valueOf(AV65Nwdpfaseswwds_6_tfclicod) ,
                                           Integer.valueOf(AV66Nwdpfaseswwds_7_tfclicod_to) ,
                                           AV68Nwdpfaseswwds_9_tfdisartcod_sel ,
                                           AV67Nwdpfaseswwds_8_tfdisartcod ,
                                           AV70Nwdpfaseswwds_11_tfprocod_sel ,
                                           AV69Nwdpfaseswwds_10_tfprocod ,
                                           AV72Nwdpfaseswwds_13_tfprodsc_sel ,
                                           AV71Nwdpfaseswwds_12_tfprodsc ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           A758ProCod ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV61Nwdpfaseswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV61Nwdpfaseswwds_2_tfemprcod), 3, "%") ;
      lV67Nwdpfaseswwds_8_tfdisartcod = GXutil.padr( GXutil.rtrim( AV67Nwdpfaseswwds_8_tfdisartcod), 16, "%") ;
      lV69Nwdpfaseswwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Nwdpfaseswwds_10_tfprocod), 8, "%") ;
      lV71Nwdpfaseswwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Nwdpfaseswwds_12_tfprodsc), 40, "%") ;
      /* Using cursor P08EA4 */
      pr_default.execute(2, new Object[] {lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV61Nwdpfaseswwds_2_tfemprcod, AV62Nwdpfaseswwds_3_tfemprcod_sel, Integer.valueOf(AV63Nwdpfaseswwds_4_tfdiscod), Integer.valueOf(AV64Nwdpfaseswwds_5_tfdiscod_to), Integer.valueOf(AV65Nwdpfaseswwds_6_tfclicod), Integer.valueOf(AV66Nwdpfaseswwds_7_tfclicod_to), lV67Nwdpfaseswwds_8_tfdisartcod, AV68Nwdpfaseswwds_9_tfdisartcod_sel, lV69Nwdpfaseswwds_10_tfprocod, AV70Nwdpfaseswwds_11_tfprocod_sel, lV71Nwdpfaseswwds_12_tfprodsc, AV72Nwdpfaseswwds_13_tfprodsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8EA6 = false ;
         A758ProCod = P08EA4_A758ProCod[0] ;
         A759ProDsc = P08EA4_A759ProDsc[0] ;
         A335DisArtCod = P08EA4_A335DisArtCod[0] ;
         A252CliCod = P08EA4_A252CliCod[0] ;
         A361DisCod = P08EA4_A361DisCod[0] ;
         A396EmprCod = P08EA4_A396EmprCod[0] ;
         A335DisArtCod = P08EA4_A335DisArtCod[0] ;
         A252CliCod = P08EA4_A252CliCod[0] ;
         A759ProDsc = P08EA4_A759ProDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08EA4_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brk8EA6 = false ;
            A361DisCod = P08EA4_A361DisCod[0] ;
            A396EmprCod = P08EA4_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8EA6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV26Option = A758ProCod ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8EA6 )
         {
            brk8EA6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFProDsc = AV22SearchTxt ;
      AV21TFProDsc_Sel = "" ;
      AV60Nwdpfaseswwds_1_filterfulltext = AV55FilterFullText ;
      AV61Nwdpfaseswwds_2_tfemprcod = AV10TFEmprCod ;
      AV62Nwdpfaseswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV63Nwdpfaseswwds_4_tfdiscod = AV12TFDisCod ;
      AV64Nwdpfaseswwds_5_tfdiscod_to = AV13TFDisCod_To ;
      AV65Nwdpfaseswwds_6_tfclicod = AV51TFCliCod ;
      AV66Nwdpfaseswwds_7_tfclicod_to = AV52TFCliCod_To ;
      AV67Nwdpfaseswwds_8_tfdisartcod = AV53TFDisArtCod ;
      AV68Nwdpfaseswwds_9_tfdisartcod_sel = AV54TFDisArtCod_Sel ;
      AV69Nwdpfaseswwds_10_tfprocod = AV18TFProCod ;
      AV70Nwdpfaseswwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Nwdpfaseswwds_12_tfprodsc = AV20TFProDsc ;
      AV72Nwdpfaseswwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV60Nwdpfaseswwds_1_filterfulltext ,
                                           AV62Nwdpfaseswwds_3_tfemprcod_sel ,
                                           AV61Nwdpfaseswwds_2_tfemprcod ,
                                           Integer.valueOf(AV63Nwdpfaseswwds_4_tfdiscod) ,
                                           Integer.valueOf(AV64Nwdpfaseswwds_5_tfdiscod_to) ,
                                           Integer.valueOf(AV65Nwdpfaseswwds_6_tfclicod) ,
                                           Integer.valueOf(AV66Nwdpfaseswwds_7_tfclicod_to) ,
                                           AV68Nwdpfaseswwds_9_tfdisartcod_sel ,
                                           AV67Nwdpfaseswwds_8_tfdisartcod ,
                                           AV70Nwdpfaseswwds_11_tfprocod_sel ,
                                           AV69Nwdpfaseswwds_10_tfprocod ,
                                           AV72Nwdpfaseswwds_13_tfprodsc_sel ,
                                           AV71Nwdpfaseswwds_12_tfprodsc ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           A758ProCod ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV60Nwdpfaseswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Nwdpfaseswwds_1_filterfulltext), "%", "") ;
      lV61Nwdpfaseswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV61Nwdpfaseswwds_2_tfemprcod), 3, "%") ;
      lV67Nwdpfaseswwds_8_tfdisartcod = GXutil.padr( GXutil.rtrim( AV67Nwdpfaseswwds_8_tfdisartcod), 16, "%") ;
      lV69Nwdpfaseswwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Nwdpfaseswwds_10_tfprocod), 8, "%") ;
      lV71Nwdpfaseswwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Nwdpfaseswwds_12_tfprodsc), 40, "%") ;
      /* Using cursor P08EA5 */
      pr_default.execute(3, new Object[] {lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV60Nwdpfaseswwds_1_filterfulltext, lV61Nwdpfaseswwds_2_tfemprcod, AV62Nwdpfaseswwds_3_tfemprcod_sel, Integer.valueOf(AV63Nwdpfaseswwds_4_tfdiscod), Integer.valueOf(AV64Nwdpfaseswwds_5_tfdiscod_to), Integer.valueOf(AV65Nwdpfaseswwds_6_tfclicod), Integer.valueOf(AV66Nwdpfaseswwds_7_tfclicod_to), lV67Nwdpfaseswwds_8_tfdisartcod, AV68Nwdpfaseswwds_9_tfdisartcod_sel, lV69Nwdpfaseswwds_10_tfprocod, AV70Nwdpfaseswwds_11_tfprocod_sel, lV71Nwdpfaseswwds_12_tfprodsc, AV72Nwdpfaseswwds_13_tfprodsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8EA8 = false ;
         A758ProCod = P08EA5_A758ProCod[0] ;
         A396EmprCod = P08EA5_A396EmprCod[0] ;
         A759ProDsc = P08EA5_A759ProDsc[0] ;
         A335DisArtCod = P08EA5_A335DisArtCod[0] ;
         A252CliCod = P08EA5_A252CliCod[0] ;
         A361DisCod = P08EA5_A361DisCod[0] ;
         A759ProDsc = P08EA5_A759ProDsc[0] ;
         A335DisArtCod = P08EA5_A335DisArtCod[0] ;
         A252CliCod = P08EA5_A252CliCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08EA5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08EA5_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brk8EA8 = false ;
            A361DisCod = P08EA5_A361DisCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8EA8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
         {
            AV26Option = A759ProDsc ;
            AV25InsertIndex = 1 ;
            while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
            {
               AV25InsertIndex = (int)(AV25InsertIndex+1) ;
            }
            AV27Options.add(AV26Option, AV25InsertIndex);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8EA8 )
         {
            brk8EA8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = nwdpfaseswwgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = nwdpfaseswwgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = nwdpfaseswwgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV53TFDisArtCod = "" ;
      AV54TFDisArtCod_Sel = "" ;
      AV18TFProCod = "" ;
      AV19TFProCod_Sel = "" ;
      AV20TFProDsc = "" ;
      AV21TFProDsc_Sel = "" ;
      A396EmprCod = "" ;
      AV60Nwdpfaseswwds_1_filterfulltext = "" ;
      AV61Nwdpfaseswwds_2_tfemprcod = "" ;
      AV62Nwdpfaseswwds_3_tfemprcod_sel = "" ;
      AV67Nwdpfaseswwds_8_tfdisartcod = "" ;
      AV68Nwdpfaseswwds_9_tfdisartcod_sel = "" ;
      AV69Nwdpfaseswwds_10_tfprocod = "" ;
      AV70Nwdpfaseswwds_11_tfprocod_sel = "" ;
      AV71Nwdpfaseswwds_12_tfprodsc = "" ;
      AV72Nwdpfaseswwds_13_tfprodsc_sel = "" ;
      scmdbuf = "" ;
      lV60Nwdpfaseswwds_1_filterfulltext = "" ;
      lV61Nwdpfaseswwds_2_tfemprcod = "" ;
      lV67Nwdpfaseswwds_8_tfdisartcod = "" ;
      lV69Nwdpfaseswwds_10_tfprocod = "" ;
      lV71Nwdpfaseswwds_12_tfprodsc = "" ;
      A335DisArtCod = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      P08EA2_A396EmprCod = new String[] {""} ;
      P08EA2_A759ProDsc = new String[] {""} ;
      P08EA2_A758ProCod = new String[] {""} ;
      P08EA2_A335DisArtCod = new String[] {""} ;
      P08EA2_A252CliCod = new int[1] ;
      P08EA2_A361DisCod = new int[1] ;
      AV26Option = "" ;
      AV29OptionDesc = "" ;
      P08EA3_A335DisArtCod = new String[] {""} ;
      P08EA3_A759ProDsc = new String[] {""} ;
      P08EA3_A758ProCod = new String[] {""} ;
      P08EA3_A252CliCod = new int[1] ;
      P08EA3_A361DisCod = new int[1] ;
      P08EA3_A396EmprCod = new String[] {""} ;
      P08EA4_A758ProCod = new String[] {""} ;
      P08EA4_A759ProDsc = new String[] {""} ;
      P08EA4_A335DisArtCod = new String[] {""} ;
      P08EA4_A252CliCod = new int[1] ;
      P08EA4_A361DisCod = new int[1] ;
      P08EA4_A396EmprCod = new String[] {""} ;
      P08EA5_A758ProCod = new String[] {""} ;
      P08EA5_A396EmprCod = new String[] {""} ;
      P08EA5_A759ProDsc = new String[] {""} ;
      P08EA5_A335DisArtCod = new String[] {""} ;
      P08EA5_A252CliCod = new int[1] ;
      P08EA5_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpfaseswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08EA2_A396EmprCod, P08EA2_A759ProDsc, P08EA2_A758ProCod, P08EA2_A335DisArtCod, P08EA2_A252CliCod, P08EA2_A361DisCod
            }
            , new Object[] {
            P08EA3_A335DisArtCod, P08EA3_A759ProDsc, P08EA3_A758ProCod, P08EA3_A252CliCod, P08EA3_A361DisCod, P08EA3_A396EmprCod
            }
            , new Object[] {
            P08EA4_A758ProCod, P08EA4_A759ProDsc, P08EA4_A335DisArtCod, P08EA4_A252CliCod, P08EA4_A361DisCod, P08EA4_A396EmprCod
            }
            , new Object[] {
            P08EA5_A758ProCod, P08EA5_A396EmprCod, P08EA5_A759ProDsc, P08EA5_A335DisArtCod, P08EA5_A252CliCod, P08EA5_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV58GXV1 ;
   private int AV12TFDisCod ;
   private int AV13TFDisCod_To ;
   private int AV51TFCliCod ;
   private int AV52TFCliCod_To ;
   private int AV63Nwdpfaseswwds_4_tfdiscod ;
   private int AV64Nwdpfaseswwds_5_tfdiscod_to ;
   private int AV65Nwdpfaseswwds_6_tfclicod ;
   private int AV66Nwdpfaseswwds_7_tfclicod_to ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV25InsertIndex ;
   private long AV34count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV53TFDisArtCod ;
   private String AV54TFDisArtCod_Sel ;
   private String AV18TFProCod ;
   private String AV19TFProCod_Sel ;
   private String AV20TFProDsc ;
   private String AV21TFProDsc_Sel ;
   private String A396EmprCod ;
   private String AV61Nwdpfaseswwds_2_tfemprcod ;
   private String AV62Nwdpfaseswwds_3_tfemprcod_sel ;
   private String AV67Nwdpfaseswwds_8_tfdisartcod ;
   private String AV68Nwdpfaseswwds_9_tfdisartcod_sel ;
   private String AV69Nwdpfaseswwds_10_tfprocod ;
   private String AV70Nwdpfaseswwds_11_tfprocod_sel ;
   private String AV71Nwdpfaseswwds_12_tfprodsc ;
   private String AV72Nwdpfaseswwds_13_tfprodsc_sel ;
   private String scmdbuf ;
   private String lV61Nwdpfaseswwds_2_tfemprcod ;
   private String lV67Nwdpfaseswwds_8_tfdisartcod ;
   private String lV69Nwdpfaseswwds_10_tfprocod ;
   private String lV71Nwdpfaseswwds_12_tfprodsc ;
   private String A335DisArtCod ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private boolean returnInSub ;
   private boolean brk8EA2 ;
   private boolean brk8EA4 ;
   private boolean brk8EA6 ;
   private boolean brk8EA8 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV55FilterFullText ;
   private String AV60Nwdpfaseswwds_1_filterfulltext ;
   private String lV60Nwdpfaseswwds_1_filterfulltext ;
   private String AV26Option ;
   private String AV29OptionDesc ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08EA2_A396EmprCod ;
   private String[] P08EA2_A759ProDsc ;
   private String[] P08EA2_A758ProCod ;
   private String[] P08EA2_A335DisArtCod ;
   private int[] P08EA2_A252CliCod ;
   private int[] P08EA2_A361DisCod ;
   private String[] P08EA3_A335DisArtCod ;
   private String[] P08EA3_A759ProDsc ;
   private String[] P08EA3_A758ProCod ;
   private int[] P08EA3_A252CliCod ;
   private int[] P08EA3_A361DisCod ;
   private String[] P08EA3_A396EmprCod ;
   private String[] P08EA4_A758ProCod ;
   private String[] P08EA4_A759ProDsc ;
   private String[] P08EA4_A335DisArtCod ;
   private int[] P08EA4_A252CliCod ;
   private int[] P08EA4_A361DisCod ;
   private String[] P08EA4_A396EmprCod ;
   private String[] P08EA5_A758ProCod ;
   private String[] P08EA5_A396EmprCod ;
   private String[] P08EA5_A759ProDsc ;
   private String[] P08EA5_A335DisArtCod ;
   private int[] P08EA5_A252CliCod ;
   private int[] P08EA5_A361DisCod ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class nwdpfaseswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Nwdpfaseswwds_1_filterfulltext ,
                                          String AV62Nwdpfaseswwds_3_tfemprcod_sel ,
                                          String AV61Nwdpfaseswwds_2_tfemprcod ,
                                          int AV63Nwdpfaseswwds_4_tfdiscod ,
                                          int AV64Nwdpfaseswwds_5_tfdiscod_to ,
                                          int AV65Nwdpfaseswwds_6_tfclicod ,
                                          int AV66Nwdpfaseswwds_7_tfclicod_to ,
                                          String AV68Nwdpfaseswwds_9_tfdisartcod_sel ,
                                          String AV67Nwdpfaseswwds_8_tfdisartcod ,
                                          String AV70Nwdpfaseswwds_11_tfprocod_sel ,
                                          String AV69Nwdpfaseswwds_10_tfprocod ,
                                          String AV72Nwdpfaseswwds_13_tfprodsc_sel ,
                                          String AV71Nwdpfaseswwds_12_tfprodsc ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          String A758ProCod ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ProDsc, T1.ProCod, T3.DisArtCod, T3.CliCod, T1.DisCod FROM ((TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod" ;
      scmdbuf += " = T1.ProCod) INNER JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      if ( ! (GXutil.strcmp("", AV60Nwdpfaseswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Nwdpfaseswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Nwdpfaseswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpfaseswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpfaseswwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpfaseswwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV65Nwdpfaseswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Nwdpfaseswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpfaseswwds_9_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpfaseswwds_8_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpfaseswwds_9_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.DisArtCod = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpfaseswwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpfaseswwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpfaseswwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Nwdpfaseswwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Nwdpfaseswwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Nwdpfaseswwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08EA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Nwdpfaseswwds_1_filterfulltext ,
                                          String AV62Nwdpfaseswwds_3_tfemprcod_sel ,
                                          String AV61Nwdpfaseswwds_2_tfemprcod ,
                                          int AV63Nwdpfaseswwds_4_tfdiscod ,
                                          int AV64Nwdpfaseswwds_5_tfdiscod_to ,
                                          int AV65Nwdpfaseswwds_6_tfclicod ,
                                          int AV66Nwdpfaseswwds_7_tfclicod_to ,
                                          String AV68Nwdpfaseswwds_9_tfdisartcod_sel ,
                                          String AV67Nwdpfaseswwds_8_tfdisartcod ,
                                          String AV70Nwdpfaseswwds_11_tfprocod_sel ,
                                          String AV69Nwdpfaseswwds_10_tfprocod ,
                                          String AV72Nwdpfaseswwds_13_tfprodsc_sel ,
                                          String AV71Nwdpfaseswwds_12_tfprodsc ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          String A758ProCod ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.DisArtCod, T3.ProDsc, T1.ProCod, T2.CliCod, T1.DisCod, T1.EmprCod FROM ((TXPDISLIN T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod" ;
      scmdbuf += " = T1.DisCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV60Nwdpfaseswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Nwdpfaseswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Nwdpfaseswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpfaseswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpfaseswwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpfaseswwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV65Nwdpfaseswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Nwdpfaseswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpfaseswwds_9_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpfaseswwds_8_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpfaseswwds_9_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisArtCod = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpfaseswwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpfaseswwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpfaseswwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Nwdpfaseswwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Nwdpfaseswwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Nwdpfaseswwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.DisArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08EA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Nwdpfaseswwds_1_filterfulltext ,
                                          String AV62Nwdpfaseswwds_3_tfemprcod_sel ,
                                          String AV61Nwdpfaseswwds_2_tfemprcod ,
                                          int AV63Nwdpfaseswwds_4_tfdiscod ,
                                          int AV64Nwdpfaseswwds_5_tfdiscod_to ,
                                          int AV65Nwdpfaseswwds_6_tfclicod ,
                                          int AV66Nwdpfaseswwds_7_tfclicod_to ,
                                          String AV68Nwdpfaseswwds_9_tfdisartcod_sel ,
                                          String AV67Nwdpfaseswwds_8_tfdisartcod ,
                                          String AV70Nwdpfaseswwds_11_tfprocod_sel ,
                                          String AV69Nwdpfaseswwds_10_tfprocod ,
                                          String AV72Nwdpfaseswwds_13_tfprodsc_sel ,
                                          String AV71Nwdpfaseswwds_12_tfprodsc ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          String A758ProCod ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T3.ProDsc, T2.DisArtCod, T2.CliCod, T1.DisCod, T1.EmprCod FROM ((TXPDISLIN T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod" ;
      scmdbuf += " = T1.DisCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV60Nwdpfaseswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Nwdpfaseswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Nwdpfaseswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpfaseswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpfaseswwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpfaseswwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV65Nwdpfaseswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Nwdpfaseswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpfaseswwds_9_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpfaseswwds_8_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpfaseswwds_9_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisArtCod = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpfaseswwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpfaseswwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpfaseswwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Nwdpfaseswwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Nwdpfaseswwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Nwdpfaseswwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08EA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Nwdpfaseswwds_1_filterfulltext ,
                                          String AV62Nwdpfaseswwds_3_tfemprcod_sel ,
                                          String AV61Nwdpfaseswwds_2_tfemprcod ,
                                          int AV63Nwdpfaseswwds_4_tfdiscod ,
                                          int AV64Nwdpfaseswwds_5_tfdiscod_to ,
                                          int AV65Nwdpfaseswwds_6_tfclicod ,
                                          int AV66Nwdpfaseswwds_7_tfclicod_to ,
                                          String AV68Nwdpfaseswwds_9_tfdisartcod_sel ,
                                          String AV67Nwdpfaseswwds_8_tfdisartcod ,
                                          String AV70Nwdpfaseswwds_11_tfprocod_sel ,
                                          String AV69Nwdpfaseswwds_10_tfprocod ,
                                          String AV72Nwdpfaseswwds_13_tfprodsc_sel ,
                                          String AV71Nwdpfaseswwds_12_tfprodsc ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          String A758ProCod ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T1.EmprCod, T2.ProDsc, T3.DisArtCod, T3.CliCod, T1.DisCod FROM ((TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod" ;
      scmdbuf += " = T1.ProCod) INNER JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      if ( ! (GXutil.strcmp("", AV60Nwdpfaseswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Nwdpfaseswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Nwdpfaseswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Nwdpfaseswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpfaseswwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Nwdpfaseswwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV65Nwdpfaseswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Nwdpfaseswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpfaseswwds_9_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpfaseswwds_8_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpfaseswwds_9_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Nwdpfaseswwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Nwdpfaseswwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Nwdpfaseswwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Nwdpfaseswwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Nwdpfaseswwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Nwdpfaseswwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProCod" ;
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
                  return conditional_P08EA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P08EA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 2 :
                  return conditional_P08EA4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 3 :
                  return conditional_P08EA5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 40);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 40);
               }
               return;
      }
   }

}

