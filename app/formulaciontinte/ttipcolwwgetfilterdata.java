package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipcolwwgetfilterdata extends GXProcedure
{
   public ttipcolwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipcolwwgetfilterdata.class ), "" );
   }

   public ttipcolwwgetfilterdata( int remoteHandle ,
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
      ttipcolwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipcolwwgetfilterdata.this.AV18DDOName = aP0;
      ttipcolwwgetfilterdata.this.AV16SearchTxt = aP1;
      ttipcolwwgetfilterdata.this.AV17SearchTxtTo = aP2;
      ttipcolwwgetfilterdata.this.aP3 = aP3;
      ttipcolwwgetfilterdata.this.aP4 = aP4;
      ttipcolwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_TIPCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPCOLDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_TIPDSCFAM") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPDSCFAMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("FormulacionTinte.TTIPCOLWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TTIPCOLWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FormulacionTinte.TTIPCOLWWGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV10TFTipColCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTipColCod_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV12TFTipColDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV13TFTipColDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLTIE") == 0 )
         {
            AV14TFTipColTie = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFTipColTie_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTFAM") == 0 )
         {
            AV35TFTipArtFam = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFTipArtFam_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDSCFAM") == 0 )
         {
            AV37TFTipDscFam = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDSCFAM_SEL") == 0 )
         {
            AV38TFTipDscFam_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipColDsc = AV16SearchTxt ;
      AV13TFTipColDsc_Sel = "" ;
      AV43Formulaciontinte_ttipcolwwds_1_filterfulltext = AV34FilterFullText ;
      AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod = AV10TFTipColCod ;
      AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to = AV11TFTipColCod_To ;
      AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc = AV12TFTipColDsc ;
      AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel = AV13TFTipColDsc_Sel ;
      AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie = AV14TFTipColTie ;
      AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to = AV15TFTipColTie_To ;
      AV50Formulaciontinte_ttipcolwwds_8_tftipartfam = AV35TFTipArtFam ;
      AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to = AV36TFTipArtFam_To ;
      AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam = AV37TFTipDscFam ;
      AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel = AV38TFTipDscFam_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod) ,
                                           Byte.valueOf(AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) ,
                                           AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                           AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                           Integer.valueOf(AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie) ,
                                           Integer.valueOf(AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) ,
                                           Short.valueOf(AV50Formulaciontinte_ttipcolwwds_8_tftipartfam) ,
                                           Short.valueOf(AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A4999TipColTie) ,
                                           Short.valueOf(A5723TipArtFam) ,
                                           AV43Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                           A5724TipDscFam ,
                                           AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                           AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc), 30, "%") ;
      /* Using cursor P08GX2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod), Byte.valueOf(AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to), lV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc, AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel, Integer.valueOf(AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie), Integer.valueOf(AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to), Short.valueOf(AV50Formulaciontinte_ttipcolwwds_8_tftipartfam), Short.valueOf(AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8GX2 = false ;
         A832TipColDsc = P08GX2_A832TipColDsc[0] ;
         n832TipColDsc = P08GX2_n832TipColDsc[0] ;
         A4999TipColTie = P08GX2_A4999TipColTie[0] ;
         n4999TipColTie = P08GX2_n4999TipColTie[0] ;
         A831TipColCod = P08GX2_A831TipColCod[0] ;
         A5723TipArtFam = P08GX2_A5723TipArtFam[0] ;
         n5723TipArtFam = P08GX2_n5723TipArtFam[0] ;
         A396EmprCod = P08GX2_A396EmprCod[0] ;
         GXt_char2 = A5724TipDscFam ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5723TipArtFam ;
         GXv_char5[0] = GXt_char2 ;
         new app.pfamdsc(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         ttipcolwwgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         ttipcolwwgetfilterdata.this.A5723TipArtFam = GXv_int4[0] ;
         ttipcolwwgetfilterdata.this.GXt_char2 = GXv_char5[0] ;
         A5724TipDscFam = GXt_char2 ;
         if ( (GXutil.strcmp("", AV43Formulaciontinte_ttipcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV43Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV43Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4999TipColTie, 6, 0) , GXutil.padr( "%" + AV43Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5723TipArtFam, 4, 0) , GXutil.padr( "%" + AV43Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV43Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam)==0) ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) || ( ( GXutil.strcmp(A5724TipDscFam, AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel) == 0 ) ) )
               {
                  AV28count = 0 ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08GX2_A832TipColDsc[0], A832TipColDsc) == 0 ) )
                  {
                     brk8GX2 = false ;
                     A831TipColCod = P08GX2_A831TipColCod[0] ;
                     A396EmprCod = P08GX2_A396EmprCod[0] ;
                     AV28count = (long)(AV28count+1) ;
                     brk8GX2 = true ;
                     pr_default.readNext(0);
                  }
                  if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
                  {
                     AV20Option = A832TipColDsc ;
                     AV21Options.add(AV20Option, 0);
                     AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV21Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk8GX2 )
         {
            brk8GX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTIPDSCFAMOPTIONS' Routine */
      returnInSub = false ;
      AV37TFTipDscFam = AV16SearchTxt ;
      AV38TFTipDscFam_Sel = "" ;
      AV43Formulaciontinte_ttipcolwwds_1_filterfulltext = AV34FilterFullText ;
      AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod = AV10TFTipColCod ;
      AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to = AV11TFTipColCod_To ;
      AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc = AV12TFTipColDsc ;
      AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel = AV13TFTipColDsc_Sel ;
      AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie = AV14TFTipColTie ;
      AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to = AV15TFTipColTie_To ;
      AV50Formulaciontinte_ttipcolwwds_8_tftipartfam = AV35TFTipArtFam ;
      AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to = AV36TFTipArtFam_To ;
      AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam = AV37TFTipDscFam ;
      AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel = AV38TFTipDscFam_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod) ,
                                           Byte.valueOf(AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) ,
                                           AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                           AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                           Integer.valueOf(AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie) ,
                                           Integer.valueOf(AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) ,
                                           Short.valueOf(AV50Formulaciontinte_ttipcolwwds_8_tftipartfam) ,
                                           Short.valueOf(AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A4999TipColTie) ,
                                           Short.valueOf(A5723TipArtFam) ,
                                           AV43Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                           A5724TipDscFam ,
                                           AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                           AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc), 30, "%") ;
      /* Using cursor P08GX3 */
      pr_default.execute(1, new Object[] {Byte.valueOf(AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod), Byte.valueOf(AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to), lV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc, AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel, Integer.valueOf(AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie), Integer.valueOf(AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to), Short.valueOf(AV50Formulaciontinte_ttipcolwwds_8_tftipartfam), Short.valueOf(AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4999TipColTie = P08GX3_A4999TipColTie[0] ;
         n4999TipColTie = P08GX3_n4999TipColTie[0] ;
         A832TipColDsc = P08GX3_A832TipColDsc[0] ;
         n832TipColDsc = P08GX3_n832TipColDsc[0] ;
         A831TipColCod = P08GX3_A831TipColCod[0] ;
         A5723TipArtFam = P08GX3_A5723TipArtFam[0] ;
         n5723TipArtFam = P08GX3_n5723TipArtFam[0] ;
         A396EmprCod = P08GX3_A396EmprCod[0] ;
         GXt_char2 = A5724TipDscFam ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A5723TipArtFam ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfamdsc(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         ttipcolwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         ttipcolwwgetfilterdata.this.A5723TipArtFam = GXv_int4[0] ;
         ttipcolwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A5724TipDscFam = GXt_char2 ;
         if ( (GXutil.strcmp("", AV43Formulaciontinte_ttipcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV43Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV43Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4999TipColTie, 6, 0) , GXutil.padr( "%" + AV43Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5723TipArtFam, 4, 0) , GXutil.padr( "%" + AV43Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV43Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam)==0) ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) || ( ( GXutil.strcmp(A5724TipDscFam, AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A5724TipDscFam)==0) )
                  {
                     AV20Option = A5724TipDscFam ;
                     AV19InsertIndex = 1 ;
                     while ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) < 0 ) )
                     {
                        AV19InsertIndex = (int)(AV19InsertIndex+1) ;
                     }
                     if ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) == 0 ) )
                     {
                        AV28count = GXutil.lval( (String)AV26OptionIndexes.elementAt(-1+AV19InsertIndex)) ;
                        AV28count = (long)(AV28count+1) ;
                        AV26OptionIndexes.removeItem(AV19InsertIndex);
                        AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV19InsertIndex);
                     }
                     else
                     {
                        AV21Options.add(AV20Option, AV19InsertIndex);
                        AV26OptionIndexes.add("1", AV19InsertIndex);
                     }
                  }
                  if ( AV21Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipcolwwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = ttipcolwwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = ttipcolwwgetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34FilterFullText = "" ;
      AV12TFTipColDsc = "" ;
      AV13TFTipColDsc_Sel = "" ;
      AV37TFTipDscFam = "" ;
      AV38TFTipDscFam_Sel = "" ;
      A832TipColDsc = "" ;
      AV43Formulaciontinte_ttipcolwwds_1_filterfulltext = "" ;
      AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc = "" ;
      AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel = "" ;
      AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam = "" ;
      AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel = "" ;
      scmdbuf = "" ;
      lV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc = "" ;
      A5724TipDscFam = "" ;
      P08GX2_A832TipColDsc = new String[] {""} ;
      P08GX2_n832TipColDsc = new boolean[] {false} ;
      P08GX2_A4999TipColTie = new int[1] ;
      P08GX2_n4999TipColTie = new boolean[] {false} ;
      P08GX2_A831TipColCod = new byte[1] ;
      P08GX2_A5723TipArtFam = new short[1] ;
      P08GX2_n5723TipArtFam = new boolean[] {false} ;
      P08GX2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      P08GX3_A4999TipColTie = new int[1] ;
      P08GX3_n4999TipColTie = new boolean[] {false} ;
      P08GX3_A832TipColDsc = new String[] {""} ;
      P08GX3_n832TipColDsc = new boolean[] {false} ;
      P08GX3_A831TipColCod = new byte[1] ;
      P08GX3_A5723TipArtFam = new short[1] ;
      P08GX3_n5723TipArtFam = new boolean[] {false} ;
      P08GX3_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcolwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08GX2_A832TipColDsc, P08GX2_n832TipColDsc, P08GX2_A4999TipColTie, P08GX2_n4999TipColTie, P08GX2_A831TipColCod, P08GX2_A5723TipArtFam, P08GX2_n5723TipArtFam, P08GX2_A396EmprCod
            }
            , new Object[] {
            P08GX3_A4999TipColTie, P08GX3_n4999TipColTie, P08GX3_A832TipColDsc, P08GX3_n832TipColDsc, P08GX3_A831TipColCod, P08GX3_A5723TipArtFam, P08GX3_n5723TipArtFam, P08GX3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFTipColCod ;
   private byte AV11TFTipColCod_To ;
   private byte AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod ;
   private byte AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to ;
   private byte A831TipColCod ;
   private short AV35TFTipArtFam ;
   private short AV36TFTipArtFam_To ;
   private short AV50Formulaciontinte_ttipcolwwds_8_tftipartfam ;
   private short AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to ;
   private short A5723TipArtFam ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private int AV14TFTipColTie ;
   private int AV15TFTipColTie_To ;
   private int AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie ;
   private int AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to ;
   private int A4999TipColTie ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private String AV12TFTipColDsc ;
   private String AV13TFTipColDsc_Sel ;
   private String AV37TFTipDscFam ;
   private String AV38TFTipDscFam_Sel ;
   private String A832TipColDsc ;
   private String AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc ;
   private String AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ;
   private String AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam ;
   private String AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ;
   private String scmdbuf ;
   private String lV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc ;
   private String A5724TipDscFam ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean brk8GX2 ;
   private boolean n832TipColDsc ;
   private boolean n4999TipColTie ;
   private boolean n5723TipArtFam ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV43Formulaciontinte_ttipcolwwds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08GX2_A832TipColDsc ;
   private boolean[] P08GX2_n832TipColDsc ;
   private int[] P08GX2_A4999TipColTie ;
   private boolean[] P08GX2_n4999TipColTie ;
   private byte[] P08GX2_A831TipColCod ;
   private short[] P08GX2_A5723TipArtFam ;
   private boolean[] P08GX2_n5723TipArtFam ;
   private String[] P08GX2_A396EmprCod ;
   private int[] P08GX3_A4999TipColTie ;
   private boolean[] P08GX3_n4999TipColTie ;
   private String[] P08GX3_A832TipColDsc ;
   private boolean[] P08GX3_n832TipColDsc ;
   private byte[] P08GX3_A831TipColCod ;
   private short[] P08GX3_A5723TipArtFam ;
   private boolean[] P08GX3_n5723TipArtFam ;
   private String[] P08GX3_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class ttipcolwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod ,
                                          byte AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to ,
                                          String AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                          String AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                          int AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie ,
                                          int AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to ,
                                          short AV50Formulaciontinte_ttipcolwwds_8_tftipartfam ,
                                          short AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A4999TipColTie ,
                                          short A5723TipArtFam ,
                                          String AV43Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                          String A5724TipDscFam ,
                                          String AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                          String AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[8];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT TipColDsc, TipColTie, TipColCod, TipArtFam, EmprCod FROM TXPTIPCOL" ;
      if ( ! (0==AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipColDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie) )
      {
         addWhere(sWhereString, "(TipColTie >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) )
      {
         addWhere(sWhereString, "(TipColTie <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_ttipcolwwds_8_tftipartfam) )
      {
         addWhere(sWhereString, "(TipArtFam >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to) )
      {
         addWhere(sWhereString, "(TipArtFam <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipColDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08GX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod ,
                                          byte AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to ,
                                          String AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                          String AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                          int AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie ,
                                          int AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to ,
                                          short AV50Formulaciontinte_ttipcolwwds_8_tftipartfam ,
                                          short AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A4999TipColTie ,
                                          short A5723TipArtFam ,
                                          String AV43Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                          String A5724TipDscFam ,
                                          String AV53Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                          String AV52Formulaciontinte_ttipcolwwds_10_tftipdscfam )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[8];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT TipColTie, TipColDsc, TipColCod, TipArtFam, EmprCod FROM TXPTIPCOL" ;
      if ( ! (0==AV44Formulaciontinte_ttipcolwwds_2_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV45Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_ttipcolwwds_4_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipColDsc = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV48Formulaciontinte_ttipcolwwds_6_tftipcoltie) )
      {
         addWhere(sWhereString, "(TipColTie >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) )
      {
         addWhere(sWhereString, "(TipColTie <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_ttipcolwwds_8_tftipartfam) )
      {
         addWhere(sWhereString, "(TipArtFam >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_ttipcolwwds_9_tftipartfam_to) )
      {
         addWhere(sWhereString, "(TipArtFam <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, TipColCod" ;
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
                  return conditional_P08GX2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P08GX3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               return;
      }
   }

}

