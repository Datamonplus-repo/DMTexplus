package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class calprd_trnwwgetfilterdata extends GXProcedure
{
   public calprd_trnwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calprd_trnwwgetfilterdata.class ), "" );
   }

   public calprd_trnwwgetfilterdata( int remoteHandle ,
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
      calprd_trnwwgetfilterdata.this.aP5 = new String[] {""};
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
      calprd_trnwwgetfilterdata.this.AV62DDOName = aP0;
      calprd_trnwwgetfilterdata.this.AV60SearchTxt = aP1;
      calprd_trnwwgetfilterdata.this.AV61SearchTxtTo = aP2;
      calprd_trnwwgetfilterdata.this.aP3 = aP3;
      calprd_trnwwgetfilterdata.this.aP4 = aP4;
      calprd_trnwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_ALBPROPRI") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROPRIOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_ALBHORSAL") == 0 )
      {
         /* Execute user subroutine: 'LOADALBHORSALOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_ALBLIC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBLICOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV66OptionsJson = AV65Options.toJSonString(false) ;
      AV69OptionsDescJson = AV68OptionsDesc.toJSonString(false) ;
      AV71OptionIndexesJson = AV70OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV73Session.getValue("Calprd_TRNWWGridState"), "") == 0 )
      {
         AV75GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Calprd_TRNWWGridState"), null, null);
      }
      else
      {
         AV75GridState.fromxml(AV73Session.getValue("Calprd_TRNWWGridState"), null, null);
      }
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV76GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV1));
         if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV78FilterFullText = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV12TFAlbProCod = GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV13TFAlbProCod_To = GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV14TFAlbProPri = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV15TFAlbProPri_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV79TFAlbProEst_SelsJson = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV80TFAlbProEst_Sels.fromJSonString(AV79TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV18TFAlbProfch = localUtil.ctod( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFECSAL") == 0 )
         {
            AV20TFAlbFecSal = localUtil.ctod( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHORSAL") == 0 )
         {
            AV22TFAlbHorSal = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHORSAL_SEL") == 0 )
         {
            AV23TFAlbHorSal_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV83TFAlbMarca_SelsJson = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV84TFAlbMarca_Sels.fromJSonString(AV83TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV44TFAlbLic = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV45TFAlbLic_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV87GXV1 = (int)(AV87GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBPROPRIOPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbProPri = AV60SearchTxt ;
      AV15TFAlbProPri_Sel = "" ;
      AV89Calprd_trnwwds_1_filterfulltext = AV78FilterFullText ;
      AV90Calprd_trnwwds_2_tfalbprocod = AV12TFAlbProCod ;
      AV91Calprd_trnwwds_3_tfalbprocod_to = AV13TFAlbProCod_To ;
      AV92Calprd_trnwwds_4_tfalbpropri = AV14TFAlbProPri ;
      AV93Calprd_trnwwds_5_tfalbpropri_sel = AV15TFAlbProPri_Sel ;
      AV94Calprd_trnwwds_6_tfalbproest_sels = AV80TFAlbProEst_Sels ;
      AV95Calprd_trnwwds_7_tfalbprofch = AV18TFAlbProfch ;
      AV96Calprd_trnwwds_8_tfalbfecsal = AV20TFAlbFecSal ;
      AV97Calprd_trnwwds_9_tfalbhorsal = AV22TFAlbHorSal ;
      AV98Calprd_trnwwds_10_tfalbhorsal_sel = AV23TFAlbHorSal_Sel ;
      AV99Calprd_trnwwds_11_tfalbmarca_sels = AV84TFAlbMarca_Sels ;
      AV100Calprd_trnwwds_12_tfalblic = AV44TFAlbLic ;
      AV101Calprd_trnwwds_13_tfalblic_sel = AV45TFAlbLic_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV94Calprd_trnwwds_6_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV99Calprd_trnwwds_11_tfalbmarca_sels ,
                                           Long.valueOf(AV90Calprd_trnwwds_2_tfalbprocod) ,
                                           Long.valueOf(AV91Calprd_trnwwds_3_tfalbprocod_to) ,
                                           AV93Calprd_trnwwds_5_tfalbpropri_sel ,
                                           AV92Calprd_trnwwds_4_tfalbpropri ,
                                           Integer.valueOf(AV94Calprd_trnwwds_6_tfalbproest_sels.size()) ,
                                           AV95Calprd_trnwwds_7_tfalbprofch ,
                                           AV96Calprd_trnwwds_8_tfalbfecsal ,
                                           AV98Calprd_trnwwds_10_tfalbhorsal_sel ,
                                           AV97Calprd_trnwwds_9_tfalbhorsal ,
                                           Integer.valueOf(AV99Calprd_trnwwds_11_tfalbmarca_sels.size()) ,
                                           AV101Calprd_trnwwds_13_tfalblic_sel ,
                                           AV100Calprd_trnwwds_12_tfalblic ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           A34AlbProfch ,
                                           A4023AlbFecSal ,
                                           A3865AlbHorSal ,
                                           A7101AlbLic ,
                                           AV89Calprd_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV92Calprd_trnwwds_4_tfalbpropri = GXutil.padr( GXutil.rtrim( AV92Calprd_trnwwds_4_tfalbpropri), 1, "%") ;
      lV97Calprd_trnwwds_9_tfalbhorsal = GXutil.padr( GXutil.rtrim( AV97Calprd_trnwwds_9_tfalbhorsal), 8, "%") ;
      lV100Calprd_trnwwds_12_tfalblic = GXutil.padr( GXutil.rtrim( AV100Calprd_trnwwds_12_tfalblic), 20, "%") ;
      /* Using cursor P092X2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV90Calprd_trnwwds_2_tfalbprocod), Long.valueOf(AV91Calprd_trnwwds_3_tfalbprocod_to), lV92Calprd_trnwwds_4_tfalbpropri, AV93Calprd_trnwwds_5_tfalbpropri_sel, AV95Calprd_trnwwds_7_tfalbprofch, AV96Calprd_trnwwds_8_tfalbfecsal, lV97Calprd_trnwwds_9_tfalbhorsal, AV98Calprd_trnwwds_10_tfalbhorsal_sel, lV100Calprd_trnwwds_12_tfalblic, AV101Calprd_trnwwds_13_tfalblic_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk92X2 = false ;
         A39AlbProPri = P092X2_A39AlbProPri[0] ;
         A7101AlbLic = P092X2_A7101AlbLic[0] ;
         A3865AlbHorSal = P092X2_A3865AlbHorSal[0] ;
         A4023AlbFecSal = P092X2_A4023AlbFecSal[0] ;
         A34AlbProfch = P092X2_A34AlbProfch[0] ;
         A33AlbProEst = P092X2_A33AlbProEst[0] ;
         A30AlbProCod = P092X2_A30AlbProCod[0] ;
         A5140AlbMarca = P092X2_A5140AlbMarca[0] ;
         A396EmprCod = P092X2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV89Calprd_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV89Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV89Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3865AlbHorSal) , GXutil.padr( "%" + GXutil.upper( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P092X2_A39AlbProPri[0], A39AlbProPri) == 0 ) )
            {
               brk92X2 = false ;
               A30AlbProCod = P092X2_A30AlbProCod[0] ;
               A396EmprCod = P092X2_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk92X2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A39AlbProPri)==0) )
            {
               AV64Option = A39AlbProPri ;
               AV67OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A39AlbProPri, "9"))) ;
               AV65Options.add(AV64Option, 0);
               AV68OptionsDesc.add(AV67OptionDesc, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk92X2 )
         {
            brk92X2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBHORSALOPTIONS' Routine */
      returnInSub = false ;
      AV22TFAlbHorSal = AV60SearchTxt ;
      AV23TFAlbHorSal_Sel = "" ;
      AV89Calprd_trnwwds_1_filterfulltext = AV78FilterFullText ;
      AV90Calprd_trnwwds_2_tfalbprocod = AV12TFAlbProCod ;
      AV91Calprd_trnwwds_3_tfalbprocod_to = AV13TFAlbProCod_To ;
      AV92Calprd_trnwwds_4_tfalbpropri = AV14TFAlbProPri ;
      AV93Calprd_trnwwds_5_tfalbpropri_sel = AV15TFAlbProPri_Sel ;
      AV94Calprd_trnwwds_6_tfalbproest_sels = AV80TFAlbProEst_Sels ;
      AV95Calprd_trnwwds_7_tfalbprofch = AV18TFAlbProfch ;
      AV96Calprd_trnwwds_8_tfalbfecsal = AV20TFAlbFecSal ;
      AV97Calprd_trnwwds_9_tfalbhorsal = AV22TFAlbHorSal ;
      AV98Calprd_trnwwds_10_tfalbhorsal_sel = AV23TFAlbHorSal_Sel ;
      AV99Calprd_trnwwds_11_tfalbmarca_sels = AV84TFAlbMarca_Sels ;
      AV100Calprd_trnwwds_12_tfalblic = AV44TFAlbLic ;
      AV101Calprd_trnwwds_13_tfalblic_sel = AV45TFAlbLic_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV94Calprd_trnwwds_6_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV99Calprd_trnwwds_11_tfalbmarca_sels ,
                                           Long.valueOf(AV90Calprd_trnwwds_2_tfalbprocod) ,
                                           Long.valueOf(AV91Calprd_trnwwds_3_tfalbprocod_to) ,
                                           AV93Calprd_trnwwds_5_tfalbpropri_sel ,
                                           AV92Calprd_trnwwds_4_tfalbpropri ,
                                           Integer.valueOf(AV94Calprd_trnwwds_6_tfalbproest_sels.size()) ,
                                           AV95Calprd_trnwwds_7_tfalbprofch ,
                                           AV96Calprd_trnwwds_8_tfalbfecsal ,
                                           AV98Calprd_trnwwds_10_tfalbhorsal_sel ,
                                           AV97Calprd_trnwwds_9_tfalbhorsal ,
                                           Integer.valueOf(AV99Calprd_trnwwds_11_tfalbmarca_sels.size()) ,
                                           AV101Calprd_trnwwds_13_tfalblic_sel ,
                                           AV100Calprd_trnwwds_12_tfalblic ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           A34AlbProfch ,
                                           A4023AlbFecSal ,
                                           A3865AlbHorSal ,
                                           A7101AlbLic ,
                                           AV89Calprd_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV92Calprd_trnwwds_4_tfalbpropri = GXutil.padr( GXutil.rtrim( AV92Calprd_trnwwds_4_tfalbpropri), 1, "%") ;
      lV97Calprd_trnwwds_9_tfalbhorsal = GXutil.padr( GXutil.rtrim( AV97Calprd_trnwwds_9_tfalbhorsal), 8, "%") ;
      lV100Calprd_trnwwds_12_tfalblic = GXutil.padr( GXutil.rtrim( AV100Calprd_trnwwds_12_tfalblic), 20, "%") ;
      /* Using cursor P092X3 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV90Calprd_trnwwds_2_tfalbprocod), Long.valueOf(AV91Calprd_trnwwds_3_tfalbprocod_to), lV92Calprd_trnwwds_4_tfalbpropri, AV93Calprd_trnwwds_5_tfalbpropri_sel, AV95Calprd_trnwwds_7_tfalbprofch, AV96Calprd_trnwwds_8_tfalbfecsal, lV97Calprd_trnwwds_9_tfalbhorsal, AV98Calprd_trnwwds_10_tfalbhorsal_sel, lV100Calprd_trnwwds_12_tfalblic, AV101Calprd_trnwwds_13_tfalblic_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk92X4 = false ;
         A3865AlbHorSal = P092X3_A3865AlbHorSal[0] ;
         A7101AlbLic = P092X3_A7101AlbLic[0] ;
         A4023AlbFecSal = P092X3_A4023AlbFecSal[0] ;
         A34AlbProfch = P092X3_A34AlbProfch[0] ;
         A33AlbProEst = P092X3_A33AlbProEst[0] ;
         A39AlbProPri = P092X3_A39AlbProPri[0] ;
         A30AlbProCod = P092X3_A30AlbProCod[0] ;
         A5140AlbMarca = P092X3_A5140AlbMarca[0] ;
         A396EmprCod = P092X3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV89Calprd_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV89Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV89Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3865AlbHorSal) , GXutil.padr( "%" + GXutil.upper( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P092X3_A3865AlbHorSal[0], A3865AlbHorSal) == 0 ) )
            {
               brk92X4 = false ;
               A30AlbProCod = P092X3_A30AlbProCod[0] ;
               A396EmprCod = P092X3_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk92X4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A3865AlbHorSal)==0) )
            {
               AV64Option = A3865AlbHorSal ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk92X4 )
         {
            brk92X4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBLICOPTIONS' Routine */
      returnInSub = false ;
      AV44TFAlbLic = AV60SearchTxt ;
      AV45TFAlbLic_Sel = "" ;
      AV89Calprd_trnwwds_1_filterfulltext = AV78FilterFullText ;
      AV90Calprd_trnwwds_2_tfalbprocod = AV12TFAlbProCod ;
      AV91Calprd_trnwwds_3_tfalbprocod_to = AV13TFAlbProCod_To ;
      AV92Calprd_trnwwds_4_tfalbpropri = AV14TFAlbProPri ;
      AV93Calprd_trnwwds_5_tfalbpropri_sel = AV15TFAlbProPri_Sel ;
      AV94Calprd_trnwwds_6_tfalbproest_sels = AV80TFAlbProEst_Sels ;
      AV95Calprd_trnwwds_7_tfalbprofch = AV18TFAlbProfch ;
      AV96Calprd_trnwwds_8_tfalbfecsal = AV20TFAlbFecSal ;
      AV97Calprd_trnwwds_9_tfalbhorsal = AV22TFAlbHorSal ;
      AV98Calprd_trnwwds_10_tfalbhorsal_sel = AV23TFAlbHorSal_Sel ;
      AV99Calprd_trnwwds_11_tfalbmarca_sels = AV84TFAlbMarca_Sels ;
      AV100Calprd_trnwwds_12_tfalblic = AV44TFAlbLic ;
      AV101Calprd_trnwwds_13_tfalblic_sel = AV45TFAlbLic_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV94Calprd_trnwwds_6_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV99Calprd_trnwwds_11_tfalbmarca_sels ,
                                           Long.valueOf(AV90Calprd_trnwwds_2_tfalbprocod) ,
                                           Long.valueOf(AV91Calprd_trnwwds_3_tfalbprocod_to) ,
                                           AV93Calprd_trnwwds_5_tfalbpropri_sel ,
                                           AV92Calprd_trnwwds_4_tfalbpropri ,
                                           Integer.valueOf(AV94Calprd_trnwwds_6_tfalbproest_sels.size()) ,
                                           AV95Calprd_trnwwds_7_tfalbprofch ,
                                           AV96Calprd_trnwwds_8_tfalbfecsal ,
                                           AV98Calprd_trnwwds_10_tfalbhorsal_sel ,
                                           AV97Calprd_trnwwds_9_tfalbhorsal ,
                                           Integer.valueOf(AV99Calprd_trnwwds_11_tfalbmarca_sels.size()) ,
                                           AV101Calprd_trnwwds_13_tfalblic_sel ,
                                           AV100Calprd_trnwwds_12_tfalblic ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           A34AlbProfch ,
                                           A4023AlbFecSal ,
                                           A3865AlbHorSal ,
                                           A7101AlbLic ,
                                           AV89Calprd_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV92Calprd_trnwwds_4_tfalbpropri = GXutil.padr( GXutil.rtrim( AV92Calprd_trnwwds_4_tfalbpropri), 1, "%") ;
      lV97Calprd_trnwwds_9_tfalbhorsal = GXutil.padr( GXutil.rtrim( AV97Calprd_trnwwds_9_tfalbhorsal), 8, "%") ;
      lV100Calprd_trnwwds_12_tfalblic = GXutil.padr( GXutil.rtrim( AV100Calprd_trnwwds_12_tfalblic), 20, "%") ;
      /* Using cursor P092X4 */
      pr_default.execute(2, new Object[] {Long.valueOf(AV90Calprd_trnwwds_2_tfalbprocod), Long.valueOf(AV91Calprd_trnwwds_3_tfalbprocod_to), lV92Calprd_trnwwds_4_tfalbpropri, AV93Calprd_trnwwds_5_tfalbpropri_sel, AV95Calprd_trnwwds_7_tfalbprofch, AV96Calprd_trnwwds_8_tfalbfecsal, lV97Calprd_trnwwds_9_tfalbhorsal, AV98Calprd_trnwwds_10_tfalbhorsal_sel, lV100Calprd_trnwwds_12_tfalblic, AV101Calprd_trnwwds_13_tfalblic_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk92X6 = false ;
         A7101AlbLic = P092X4_A7101AlbLic[0] ;
         A3865AlbHorSal = P092X4_A3865AlbHorSal[0] ;
         A4023AlbFecSal = P092X4_A4023AlbFecSal[0] ;
         A34AlbProfch = P092X4_A34AlbProfch[0] ;
         A33AlbProEst = P092X4_A33AlbProEst[0] ;
         A39AlbProPri = P092X4_A39AlbProPri[0] ;
         A30AlbProCod = P092X4_A30AlbProCod[0] ;
         A5140AlbMarca = P092X4_A5140AlbMarca[0] ;
         A396EmprCod = P092X4_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV89Calprd_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV89Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV89Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3865AlbHorSal) , GXutil.padr( "%" + GXutil.upper( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV89Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV72count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P092X4_A7101AlbLic[0], A7101AlbLic) == 0 ) )
            {
               brk92X6 = false ;
               A30AlbProCod = P092X4_A30AlbProCod[0] ;
               A396EmprCod = P092X4_A396EmprCod[0] ;
               AV72count = (long)(AV72count+1) ;
               brk92X6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A7101AlbLic)==0) )
            {
               AV64Option = A7101AlbLic ;
               AV65Options.add(AV64Option, 0);
               AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV65Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk92X6 )
         {
            brk92X6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = calprd_trnwwgetfilterdata.this.AV66OptionsJson;
      this.aP4[0] = calprd_trnwwgetfilterdata.this.AV69OptionsDescJson;
      this.aP5[0] = calprd_trnwwgetfilterdata.this.AV71OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV66OptionsJson = "" ;
      AV69OptionsDescJson = "" ;
      AV71OptionIndexesJson = "" ;
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV73Session = httpContext.getWebSession();
      AV75GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV76GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV78FilterFullText = "" ;
      AV14TFAlbProPri = "" ;
      AV15TFAlbProPri_Sel = "" ;
      AV79TFAlbProEst_SelsJson = "" ;
      AV80TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV18TFAlbProfch = GXutil.nullDate() ;
      AV20TFAlbFecSal = GXutil.nullDate() ;
      AV22TFAlbHorSal = "" ;
      AV23TFAlbHorSal_Sel = "" ;
      AV83TFAlbMarca_SelsJson = "" ;
      AV84TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44TFAlbLic = "" ;
      AV45TFAlbLic_Sel = "" ;
      A39AlbProPri = "" ;
      AV89Calprd_trnwwds_1_filterfulltext = "" ;
      AV92Calprd_trnwwds_4_tfalbpropri = "" ;
      AV93Calprd_trnwwds_5_tfalbpropri_sel = "" ;
      AV94Calprd_trnwwds_6_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV95Calprd_trnwwds_7_tfalbprofch = GXutil.nullDate() ;
      AV96Calprd_trnwwds_8_tfalbfecsal = GXutil.nullDate() ;
      AV97Calprd_trnwwds_9_tfalbhorsal = "" ;
      AV98Calprd_trnwwds_10_tfalbhorsal_sel = "" ;
      AV99Calprd_trnwwds_11_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV100Calprd_trnwwds_12_tfalblic = "" ;
      AV101Calprd_trnwwds_13_tfalblic_sel = "" ;
      lV89Calprd_trnwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV92Calprd_trnwwds_4_tfalbpropri = "" ;
      lV97Calprd_trnwwds_9_tfalbhorsal = "" ;
      lV100Calprd_trnwwds_12_tfalblic = "" ;
      A5140AlbMarca = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A7101AlbLic = "" ;
      P092X2_A39AlbProPri = new String[] {""} ;
      P092X2_A7101AlbLic = new String[] {""} ;
      P092X2_A3865AlbHorSal = new String[] {""} ;
      P092X2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P092X2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P092X2_A33AlbProEst = new byte[1] ;
      P092X2_A30AlbProCod = new long[1] ;
      P092X2_A5140AlbMarca = new String[] {""} ;
      P092X2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV64Option = "" ;
      AV67OptionDesc = "" ;
      P092X3_A3865AlbHorSal = new String[] {""} ;
      P092X3_A7101AlbLic = new String[] {""} ;
      P092X3_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P092X3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P092X3_A33AlbProEst = new byte[1] ;
      P092X3_A39AlbProPri = new String[] {""} ;
      P092X3_A30AlbProCod = new long[1] ;
      P092X3_A5140AlbMarca = new String[] {""} ;
      P092X3_A396EmprCod = new String[] {""} ;
      P092X4_A7101AlbLic = new String[] {""} ;
      P092X4_A3865AlbHorSal = new String[] {""} ;
      P092X4_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P092X4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P092X4_A33AlbProEst = new byte[1] ;
      P092X4_A39AlbProPri = new String[] {""} ;
      P092X4_A30AlbProCod = new long[1] ;
      P092X4_A5140AlbMarca = new String[] {""} ;
      P092X4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calprd_trnwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P092X2_A39AlbProPri, P092X2_A7101AlbLic, P092X2_A3865AlbHorSal, P092X2_A4023AlbFecSal, P092X2_A34AlbProfch, P092X2_A33AlbProEst, P092X2_A30AlbProCod, P092X2_A5140AlbMarca, P092X2_A396EmprCod
            }
            , new Object[] {
            P092X3_A3865AlbHorSal, P092X3_A7101AlbLic, P092X3_A4023AlbFecSal, P092X3_A34AlbProfch, P092X3_A33AlbProEst, P092X3_A39AlbProPri, P092X3_A30AlbProCod, P092X3_A5140AlbMarca, P092X3_A396EmprCod
            }
            , new Object[] {
            P092X4_A7101AlbLic, P092X4_A3865AlbHorSal, P092X4_A4023AlbFecSal, P092X4_A34AlbProfch, P092X4_A33AlbProEst, P092X4_A39AlbProPri, P092X4_A30AlbProCod, P092X4_A5140AlbMarca, P092X4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private short Gx_err ;
   private int AV87GXV1 ;
   private int AV94Calprd_trnwwds_6_tfalbproest_sels_size ;
   private int AV99Calprd_trnwwds_11_tfalbmarca_sels_size ;
   private long AV12TFAlbProCod ;
   private long AV13TFAlbProCod_To ;
   private long AV90Calprd_trnwwds_2_tfalbprocod ;
   private long AV91Calprd_trnwwds_3_tfalbprocod_to ;
   private long A30AlbProCod ;
   private long AV72count ;
   private String AV14TFAlbProPri ;
   private String AV15TFAlbProPri_Sel ;
   private String AV22TFAlbHorSal ;
   private String AV23TFAlbHorSal_Sel ;
   private String AV44TFAlbLic ;
   private String AV45TFAlbLic_Sel ;
   private String A39AlbProPri ;
   private String AV92Calprd_trnwwds_4_tfalbpropri ;
   private String AV93Calprd_trnwwds_5_tfalbpropri_sel ;
   private String AV97Calprd_trnwwds_9_tfalbhorsal ;
   private String AV98Calprd_trnwwds_10_tfalbhorsal_sel ;
   private String AV100Calprd_trnwwds_12_tfalblic ;
   private String AV101Calprd_trnwwds_13_tfalblic_sel ;
   private String scmdbuf ;
   private String lV92Calprd_trnwwds_4_tfalbpropri ;
   private String lV97Calprd_trnwwds_9_tfalbhorsal ;
   private String lV100Calprd_trnwwds_12_tfalblic ;
   private String A5140AlbMarca ;
   private String A3865AlbHorSal ;
   private String A7101AlbLic ;
   private String A396EmprCod ;
   private java.util.Date AV18TFAlbProfch ;
   private java.util.Date AV20TFAlbFecSal ;
   private java.util.Date AV95Calprd_trnwwds_7_tfalbprofch ;
   private java.util.Date AV96Calprd_trnwwds_8_tfalbfecsal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private boolean returnInSub ;
   private boolean brk92X2 ;
   private boolean brk92X4 ;
   private boolean brk92X6 ;
   private String AV66OptionsJson ;
   private String AV69OptionsDescJson ;
   private String AV71OptionIndexesJson ;
   private String AV79TFAlbProEst_SelsJson ;
   private String AV83TFAlbMarca_SelsJson ;
   private String AV62DDOName ;
   private String AV60SearchTxt ;
   private String AV61SearchTxtTo ;
   private String AV78FilterFullText ;
   private String AV89Calprd_trnwwds_1_filterfulltext ;
   private String lV89Calprd_trnwwds_1_filterfulltext ;
   private String AV64Option ;
   private String AV67OptionDesc ;
   private GXSimpleCollection<Byte> AV80TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV94Calprd_trnwwds_6_tfalbproest_sels ;
   private com.genexus.webpanels.WebSession AV73Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P092X2_A39AlbProPri ;
   private String[] P092X2_A7101AlbLic ;
   private String[] P092X2_A3865AlbHorSal ;
   private java.util.Date[] P092X2_A4023AlbFecSal ;
   private java.util.Date[] P092X2_A34AlbProfch ;
   private byte[] P092X2_A33AlbProEst ;
   private long[] P092X2_A30AlbProCod ;
   private String[] P092X2_A5140AlbMarca ;
   private String[] P092X2_A396EmprCod ;
   private String[] P092X3_A3865AlbHorSal ;
   private String[] P092X3_A7101AlbLic ;
   private java.util.Date[] P092X3_A4023AlbFecSal ;
   private java.util.Date[] P092X3_A34AlbProfch ;
   private byte[] P092X3_A33AlbProEst ;
   private String[] P092X3_A39AlbProPri ;
   private long[] P092X3_A30AlbProCod ;
   private String[] P092X3_A5140AlbMarca ;
   private String[] P092X3_A396EmprCod ;
   private String[] P092X4_A7101AlbLic ;
   private String[] P092X4_A3865AlbHorSal ;
   private java.util.Date[] P092X4_A4023AlbFecSal ;
   private java.util.Date[] P092X4_A34AlbProfch ;
   private byte[] P092X4_A33AlbProEst ;
   private String[] P092X4_A39AlbProPri ;
   private long[] P092X4_A30AlbProCod ;
   private String[] P092X4_A5140AlbMarca ;
   private String[] P092X4_A396EmprCod ;
   private GXSimpleCollection<String> AV84TFAlbMarca_Sels ;
   private GXSimpleCollection<String> AV99Calprd_trnwwds_11_tfalbmarca_sels ;
   private GXSimpleCollection<String> AV65Options ;
   private GXSimpleCollection<String> AV68OptionsDesc ;
   private GXSimpleCollection<String> AV70OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV75GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV76GridStateFilterValue ;
}

final  class calprd_trnwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P092X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV94Calprd_trnwwds_6_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV99Calprd_trnwwds_11_tfalbmarca_sels ,
                                          long AV90Calprd_trnwwds_2_tfalbprocod ,
                                          long AV91Calprd_trnwwds_3_tfalbprocod_to ,
                                          String AV93Calprd_trnwwds_5_tfalbpropri_sel ,
                                          String AV92Calprd_trnwwds_4_tfalbpropri ,
                                          int AV94Calprd_trnwwds_6_tfalbproest_sels_size ,
                                          java.util.Date AV95Calprd_trnwwds_7_tfalbprofch ,
                                          java.util.Date AV96Calprd_trnwwds_8_tfalbfecsal ,
                                          String AV98Calprd_trnwwds_10_tfalbhorsal_sel ,
                                          String AV97Calprd_trnwwds_9_tfalbhorsal ,
                                          int AV99Calprd_trnwwds_11_tfalbmarca_sels_size ,
                                          String AV101Calprd_trnwwds_13_tfalblic_sel ,
                                          String AV100Calprd_trnwwds_12_tfalblic ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          java.util.Date A34AlbProfch ,
                                          java.util.Date A4023AlbFecSal ,
                                          String A3865AlbHorSal ,
                                          String A7101AlbLic ,
                                          String AV89Calprd_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT AlbProPri, AlbLic, AlbHorSal, AlbFecSal, AlbProfch, AlbProEst, AlbProCod, AlbMarca, EmprCod FROM TXPCALPRD" ;
      if ( ! (0==AV90Calprd_trnwwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV91Calprd_trnwwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Calprd_trnwwds_5_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV92Calprd_trnwwds_4_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Calprd_trnwwds_5_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProPri = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV94Calprd_trnwwds_6_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV94Calprd_trnwwds_6_tfalbproest_sels, "AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Calprd_trnwwds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Calprd_trnwwds_8_tfalbfecsal)) )
      {
         addWhere(sWhereString, "(AlbFecSal >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Calprd_trnwwds_10_tfalbhorsal_sel)==0) && ( ! (GXutil.strcmp("", AV97Calprd_trnwwds_9_tfalbhorsal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHorSal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Calprd_trnwwds_10_tfalbhorsal_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHorSal = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV99Calprd_trnwwds_11_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Calprd_trnwwds_11_tfalbmarca_sels, "AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV101Calprd_trnwwds_13_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV100Calprd_trnwwds_12_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Calprd_trnwwds_13_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(AlbLic = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbProPri" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P092X3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV94Calprd_trnwwds_6_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV99Calprd_trnwwds_11_tfalbmarca_sels ,
                                          long AV90Calprd_trnwwds_2_tfalbprocod ,
                                          long AV91Calprd_trnwwds_3_tfalbprocod_to ,
                                          String AV93Calprd_trnwwds_5_tfalbpropri_sel ,
                                          String AV92Calprd_trnwwds_4_tfalbpropri ,
                                          int AV94Calprd_trnwwds_6_tfalbproest_sels_size ,
                                          java.util.Date AV95Calprd_trnwwds_7_tfalbprofch ,
                                          java.util.Date AV96Calprd_trnwwds_8_tfalbfecsal ,
                                          String AV98Calprd_trnwwds_10_tfalbhorsal_sel ,
                                          String AV97Calprd_trnwwds_9_tfalbhorsal ,
                                          int AV99Calprd_trnwwds_11_tfalbmarca_sels_size ,
                                          String AV101Calprd_trnwwds_13_tfalblic_sel ,
                                          String AV100Calprd_trnwwds_12_tfalblic ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          java.util.Date A34AlbProfch ,
                                          java.util.Date A4023AlbFecSal ,
                                          String A3865AlbHorSal ,
                                          String A7101AlbLic ,
                                          String AV89Calprd_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[10];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT AlbHorSal, AlbLic, AlbFecSal, AlbProfch, AlbProEst, AlbProPri, AlbProCod, AlbMarca, EmprCod FROM TXPCALPRD" ;
      if ( ! (0==AV90Calprd_trnwwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV91Calprd_trnwwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Calprd_trnwwds_5_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV92Calprd_trnwwds_4_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Calprd_trnwwds_5_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProPri = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( AV94Calprd_trnwwds_6_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV94Calprd_trnwwds_6_tfalbproest_sels, "AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Calprd_trnwwds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Calprd_trnwwds_8_tfalbfecsal)) )
      {
         addWhere(sWhereString, "(AlbFecSal >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Calprd_trnwwds_10_tfalbhorsal_sel)==0) && ( ! (GXutil.strcmp("", AV97Calprd_trnwwds_9_tfalbhorsal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHorSal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Calprd_trnwwds_10_tfalbhorsal_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHorSal = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV99Calprd_trnwwds_11_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Calprd_trnwwds_11_tfalbmarca_sels, "AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV101Calprd_trnwwds_13_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV100Calprd_trnwwds_12_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Calprd_trnwwds_13_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(AlbLic = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbHorSal" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P092X4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV94Calprd_trnwwds_6_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV99Calprd_trnwwds_11_tfalbmarca_sels ,
                                          long AV90Calprd_trnwwds_2_tfalbprocod ,
                                          long AV91Calprd_trnwwds_3_tfalbprocod_to ,
                                          String AV93Calprd_trnwwds_5_tfalbpropri_sel ,
                                          String AV92Calprd_trnwwds_4_tfalbpropri ,
                                          int AV94Calprd_trnwwds_6_tfalbproest_sels_size ,
                                          java.util.Date AV95Calprd_trnwwds_7_tfalbprofch ,
                                          java.util.Date AV96Calprd_trnwwds_8_tfalbfecsal ,
                                          String AV98Calprd_trnwwds_10_tfalbhorsal_sel ,
                                          String AV97Calprd_trnwwds_9_tfalbhorsal ,
                                          int AV99Calprd_trnwwds_11_tfalbmarca_sels_size ,
                                          String AV101Calprd_trnwwds_13_tfalblic_sel ,
                                          String AV100Calprd_trnwwds_12_tfalblic ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          java.util.Date A34AlbProfch ,
                                          java.util.Date A4023AlbFecSal ,
                                          String A3865AlbHorSal ,
                                          String A7101AlbLic ,
                                          String AV89Calprd_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[10];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT AlbLic, AlbHorSal, AlbFecSal, AlbProfch, AlbProEst, AlbProPri, AlbProCod, AlbMarca, EmprCod FROM TXPCALPRD" ;
      if ( ! (0==AV90Calprd_trnwwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV91Calprd_trnwwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Calprd_trnwwds_5_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV92Calprd_trnwwds_4_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Calprd_trnwwds_5_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProPri = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( AV94Calprd_trnwwds_6_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV94Calprd_trnwwds_6_tfalbproest_sels, "AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Calprd_trnwwds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Calprd_trnwwds_8_tfalbfecsal)) )
      {
         addWhere(sWhereString, "(AlbFecSal >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Calprd_trnwwds_10_tfalbhorsal_sel)==0) && ( ! (GXutil.strcmp("", AV97Calprd_trnwwds_9_tfalbhorsal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHorSal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Calprd_trnwwds_10_tfalbhorsal_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHorSal = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV99Calprd_trnwwds_11_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Calprd_trnwwds_11_tfalbmarca_sels, "AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV101Calprd_trnwwds_13_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV100Calprd_trnwwds_12_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Calprd_trnwwds_13_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(AlbLic = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbLic" ;
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
                  return conditional_P092X2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] );
            case 1 :
                  return conditional_P092X3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] );
            case 2 :
                  return conditional_P092X4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P092X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092X3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092X4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               return;
      }
   }

}

