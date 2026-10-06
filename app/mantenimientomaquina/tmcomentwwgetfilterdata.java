package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmcomentwwgetfilterdata extends GXProcedure
{
   public tmcomentwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmcomentwwgetfilterdata.class ), "" );
   }

   public tmcomentwwgetfilterdata( int remoteHandle ,
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
      tmcomentwwgetfilterdata.this.aP5 = new String[] {""};
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
      tmcomentwwgetfilterdata.this.AV34DDOName = aP0;
      tmcomentwwgetfilterdata.this.AV32SearchTxt = aP1;
      tmcomentwwgetfilterdata.this.AV33SearchTxtTo = aP2;
      tmcomentwwgetfilterdata.this.aP3 = aP3;
      tmcomentwwgetfilterdata.this.aP4 = aP4;
      tmcomentwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_MCOMEXT") == 0 )
      {
         /* Execute user subroutine: 'LOADMCOMEXTOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV38OptionsJson = AV37Options.toJSonString(false) ;
      AV41OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV42OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("MantenimientoMaquina.TMComEntWWGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMComEntWWGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("MantenimientoMaquina.TMComEntWWGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMCOD") == 0 )
         {
            AV14TFMComCod = GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV15TFMComCod_To = GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEXT") == 0 )
         {
            AV16TFMComExt = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEXT_SEL") == 0 )
         {
            AV17TFMComExt_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMFCH") == 0 )
         {
            AV18TFMComFch = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV20TFPrvNum = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFPrvNum_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV22TFPrvNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV23TFPrvNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLFCH") == 0 )
         {
            AV24TFMComSolFch = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTFCH") == 0 )
         {
            AV26TFMComEntFch = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEST_SEL") == 0 )
         {
            AV28TFMComEst_SelsJson = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV29TFMComEst_Sels.fromJSonString(AV28TFMComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMORI_SEL") == 0 )
         {
            AV30TFMComOri_SelsJson = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV31TFMComOri_Sels.fromJSonString(AV30TFMComOri_SelsJson, null);
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMCOMEXTOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMComExt = AV32SearchTxt ;
      AV17TFMComExt_Sel = "" ;
      AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext = AV50FilterFullText ;
      AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod = AV14TFMComCod ;
      AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to = AV15TFMComCod_To ;
      AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext = AV16TFMComExt ;
      AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel = AV17TFMComExt_Sel ;
      AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch = AV18TFMComFch ;
      AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum = AV20TFPrvNum ;
      AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to = AV21TFPrvNum_To ;
      AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom = AV22TFPrvNom ;
      AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel = AV23TFPrvNom_Sel ;
      AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch = AV24TFMComSolFch ;
      AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch = AV26TFMComEntFch ;
      AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels = AV29TFMComEst_Sels ;
      AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels = AV31TFMComOri_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11049MComEst ,
                                           AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ,
                                           A11050MComOri ,
                                           AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ,
                                           Long.valueOf(AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod) ,
                                           Long.valueOf(AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to) ,
                                           AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ,
                                           AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext ,
                                           AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ,
                                           Integer.valueOf(AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum) ,
                                           Integer.valueOf(AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to) ,
                                           AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ,
                                           AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom ,
                                           AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ,
                                           AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ,
                                           Integer.valueOf(AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels.size()) ,
                                           Integer.valueOf(AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels.size()) ,
                                           Long.valueOf(A11055MComCod) ,
                                           A11045MComExt ,
                                           A11046MComFch ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A11047MComSolFch ,
                                           A11048MComEntFch ,
                                           AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext = GXutil.padr( GXutil.rtrim( AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext), 20, "%") ;
      lV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom = GXutil.padr( GXutil.rtrim( AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom), 30, "%") ;
      /* Using cursor P08JU2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod), Long.valueOf(AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to), lV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext, AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel, AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch, Integer.valueOf(AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum), Integer.valueOf(AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to), lV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom, AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel, AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch, AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8JU2 = false ;
         A396EmprCod = P08JU2_A396EmprCod[0] ;
         A11045MComExt = P08JU2_A11045MComExt[0] ;
         A11048MComEntFch = P08JU2_A11048MComEntFch[0] ;
         A11047MComSolFch = P08JU2_A11047MComSolFch[0] ;
         A794PrvNom = P08JU2_A794PrvNom[0] ;
         n794PrvNom = P08JU2_n794PrvNom[0] ;
         A795PrvNum = P08JU2_A795PrvNum[0] ;
         n795PrvNum = P08JU2_n795PrvNum[0] ;
         A11046MComFch = P08JU2_A11046MComFch[0] ;
         A11055MComCod = P08JU2_A11055MComCod[0] ;
         A11050MComOri = P08JU2_A11050MComOri[0] ;
         A11049MComEst = P08JU2_A11049MComEst[0] ;
         A794PrvNom = P08JU2_A794PrvNom[0] ;
         n794PrvNom = P08JU2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A11055MComCod, 10, 0) , GXutil.padr( "%" + AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11045MComExt) , GXutil.padr( "%" + GXutil.upper( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "confirmada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "enviada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "recibida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automático", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "A", "")) == 0 ) ) ) )
         {
            AV44count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08JU2_A11045MComExt[0], A11045MComExt) == 0 ) )
            {
               brk8JU2 = false ;
               A396EmprCod = P08JU2_A396EmprCod[0] ;
               A11055MComCod = P08JU2_A11055MComCod[0] ;
               AV44count = (long)(AV44count+1) ;
               brk8JU2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A11045MComExt)==0) )
            {
               AV36Option = A11045MComExt ;
               AV37Options.add(AV36Option, 0);
               AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8JU2 )
         {
            brk8JU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFPrvNom = AV32SearchTxt ;
      AV23TFPrvNom_Sel = "" ;
      AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext = AV50FilterFullText ;
      AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod = AV14TFMComCod ;
      AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to = AV15TFMComCod_To ;
      AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext = AV16TFMComExt ;
      AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel = AV17TFMComExt_Sel ;
      AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch = AV18TFMComFch ;
      AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum = AV20TFPrvNum ;
      AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to = AV21TFPrvNum_To ;
      AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom = AV22TFPrvNom ;
      AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel = AV23TFPrvNom_Sel ;
      AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch = AV24TFMComSolFch ;
      AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch = AV26TFMComEntFch ;
      AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels = AV29TFMComEst_Sels ;
      AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels = AV31TFMComOri_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A11049MComEst ,
                                           AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ,
                                           A11050MComOri ,
                                           AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ,
                                           Long.valueOf(AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod) ,
                                           Long.valueOf(AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to) ,
                                           AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ,
                                           AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext ,
                                           AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ,
                                           Integer.valueOf(AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum) ,
                                           Integer.valueOf(AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to) ,
                                           AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ,
                                           AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom ,
                                           AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ,
                                           AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ,
                                           Integer.valueOf(AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels.size()) ,
                                           Integer.valueOf(AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels.size()) ,
                                           Long.valueOf(A11055MComCod) ,
                                           A11045MComExt ,
                                           A11046MComFch ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A11047MComSolFch ,
                                           A11048MComEntFch ,
                                           AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext = GXutil.padr( GXutil.rtrim( AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext), 20, "%") ;
      lV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom = GXutil.padr( GXutil.rtrim( AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom), 30, "%") ;
      /* Using cursor P08JU3 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod), Long.valueOf(AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to), lV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext, AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel, AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch, Integer.valueOf(AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum), Integer.valueOf(AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to), lV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom, AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel, AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch, AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8JU4 = false ;
         A795PrvNum = P08JU3_A795PrvNum[0] ;
         n795PrvNum = P08JU3_n795PrvNum[0] ;
         A396EmprCod = P08JU3_A396EmprCod[0] ;
         A11048MComEntFch = P08JU3_A11048MComEntFch[0] ;
         A11047MComSolFch = P08JU3_A11047MComSolFch[0] ;
         A794PrvNom = P08JU3_A794PrvNom[0] ;
         n794PrvNom = P08JU3_n794PrvNom[0] ;
         A11046MComFch = P08JU3_A11046MComFch[0] ;
         A11045MComExt = P08JU3_A11045MComExt[0] ;
         A11055MComCod = P08JU3_A11055MComCod[0] ;
         A11050MComOri = P08JU3_A11050MComOri[0] ;
         A11049MComEst = P08JU3_A11049MComEst[0] ;
         A794PrvNom = P08JU3_A794PrvNom[0] ;
         n794PrvNom = P08JU3_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A11055MComCod, 10, 0) , GXutil.padr( "%" + AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11045MComExt) , GXutil.padr( "%" + GXutil.upper( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "confirmada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "enviada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "recibida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automático", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "A", "")) == 0 ) ) ) )
         {
            AV44count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08JU3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08JU3_A795PrvNum[0] == A795PrvNum ) )
            {
               brk8JU4 = false ;
               A11055MComCod = P08JU3_A11055MComCod[0] ;
               AV44count = (long)(AV44count+1) ;
               brk8JU4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
            {
               AV36Option = A794PrvNom ;
               AV35InsertIndex = 1 ;
               while ( ( AV35InsertIndex <= AV37Options.size() ) && ( GXutil.strcmp((String)AV37Options.elementAt(-1+AV35InsertIndex), AV36Option) < 0 ) )
               {
                  AV35InsertIndex = (int)(AV35InsertIndex+1) ;
               }
               AV37Options.add(AV36Option, AV35InsertIndex);
               AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), AV35InsertIndex);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8JU4 )
         {
            brk8JU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmcomentwwgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = tmcomentwwgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = tmcomentwwgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38OptionsJson = "" ;
      AV41OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV16TFMComExt = "" ;
      AV17TFMComExt_Sel = "" ;
      AV18TFMComFch = GXutil.nullDate() ;
      AV22TFPrvNom = "" ;
      AV23TFPrvNom_Sel = "" ;
      AV24TFMComSolFch = GXutil.nullDate() ;
      AV26TFMComEntFch = GXutil.nullDate() ;
      AV28TFMComEst_SelsJson = "" ;
      AV29TFMComEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30TFMComOri_SelsJson = "" ;
      AV31TFMComOri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A11045MComExt = "" ;
      AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext = "" ;
      AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext = "" ;
      AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel = "" ;
      AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch = GXutil.nullDate() ;
      AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom = "" ;
      AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel = "" ;
      AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch = GXutil.nullDate() ;
      AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch = GXutil.nullDate() ;
      AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext = "" ;
      lV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom = "" ;
      A11049MComEst = "" ;
      A11050MComOri = "" ;
      A11046MComFch = GXutil.nullDate() ;
      A794PrvNom = "" ;
      A11047MComSolFch = GXutil.nullDate() ;
      A11048MComEntFch = GXutil.nullDate() ;
      P08JU2_A396EmprCod = new String[] {""} ;
      P08JU2_A11045MComExt = new String[] {""} ;
      P08JU2_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08JU2_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08JU2_A794PrvNom = new String[] {""} ;
      P08JU2_n794PrvNom = new boolean[] {false} ;
      P08JU2_A795PrvNum = new int[1] ;
      P08JU2_n795PrvNum = new boolean[] {false} ;
      P08JU2_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08JU2_A11055MComCod = new long[1] ;
      P08JU2_A11050MComOri = new String[] {""} ;
      P08JU2_A11049MComEst = new String[] {""} ;
      A396EmprCod = "" ;
      AV36Option = "" ;
      P08JU3_A795PrvNum = new int[1] ;
      P08JU3_n795PrvNum = new boolean[] {false} ;
      P08JU3_A396EmprCod = new String[] {""} ;
      P08JU3_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08JU3_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08JU3_A794PrvNom = new String[] {""} ;
      P08JU3_n794PrvNom = new boolean[] {false} ;
      P08JU3_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08JU3_A11045MComExt = new String[] {""} ;
      P08JU3_A11055MComCod = new long[1] ;
      P08JU3_A11050MComOri = new String[] {""} ;
      P08JU3_A11049MComEst = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcomentwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08JU2_A396EmprCod, P08JU2_A11045MComExt, P08JU2_A11048MComEntFch, P08JU2_A11047MComSolFch, P08JU2_A794PrvNom, P08JU2_n794PrvNom, P08JU2_A795PrvNum, P08JU2_n795PrvNum, P08JU2_A11046MComFch, P08JU2_A11055MComCod,
            P08JU2_A11050MComOri, P08JU2_A11049MComEst
            }
            , new Object[] {
            P08JU3_A795PrvNum, P08JU3_n795PrvNum, P08JU3_A396EmprCod, P08JU3_A11048MComEntFch, P08JU3_A11047MComSolFch, P08JU3_A794PrvNom, P08JU3_n794PrvNom, P08JU3_A11046MComFch, P08JU3_A11045MComExt, P08JU3_A11055MComCod,
            P08JU3_A11050MComOri, P08JU3_A11049MComEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV20TFPrvNum ;
   private int AV21TFPrvNum_To ;
   private int AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum ;
   private int AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to ;
   private int AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size ;
   private int AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size ;
   private int A795PrvNum ;
   private int AV35InsertIndex ;
   private long AV14TFMComCod ;
   private long AV15TFMComCod_To ;
   private long AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod ;
   private long AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to ;
   private long A11055MComCod ;
   private long AV44count ;
   private String AV16TFMComExt ;
   private String AV17TFMComExt_Sel ;
   private String AV22TFPrvNom ;
   private String AV23TFPrvNom_Sel ;
   private String A11045MComExt ;
   private String AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext ;
   private String AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ;
   private String AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom ;
   private String AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext ;
   private String lV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom ;
   private String A11049MComEst ;
   private String A11050MComOri ;
   private String A794PrvNom ;
   private String A396EmprCod ;
   private java.util.Date AV18TFMComFch ;
   private java.util.Date AV24TFMComSolFch ;
   private java.util.Date AV26TFMComEntFch ;
   private java.util.Date AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ;
   private java.util.Date AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ;
   private java.util.Date AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ;
   private java.util.Date A11046MComFch ;
   private java.util.Date A11047MComSolFch ;
   private java.util.Date A11048MComEntFch ;
   private boolean returnInSub ;
   private boolean brk8JU2 ;
   private boolean n794PrvNom ;
   private boolean n795PrvNum ;
   private boolean brk8JU4 ;
   private String AV38OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV28TFMComEst_SelsJson ;
   private String AV30TFMComOri_SelsJson ;
   private String AV34DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext ;
   private String AV36Option ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08JU2_A396EmprCod ;
   private String[] P08JU2_A11045MComExt ;
   private java.util.Date[] P08JU2_A11048MComEntFch ;
   private java.util.Date[] P08JU2_A11047MComSolFch ;
   private String[] P08JU2_A794PrvNom ;
   private boolean[] P08JU2_n794PrvNom ;
   private int[] P08JU2_A795PrvNum ;
   private boolean[] P08JU2_n795PrvNum ;
   private java.util.Date[] P08JU2_A11046MComFch ;
   private long[] P08JU2_A11055MComCod ;
   private String[] P08JU2_A11050MComOri ;
   private String[] P08JU2_A11049MComEst ;
   private int[] P08JU3_A795PrvNum ;
   private boolean[] P08JU3_n795PrvNum ;
   private String[] P08JU3_A396EmprCod ;
   private java.util.Date[] P08JU3_A11048MComEntFch ;
   private java.util.Date[] P08JU3_A11047MComSolFch ;
   private String[] P08JU3_A794PrvNom ;
   private boolean[] P08JU3_n794PrvNom ;
   private java.util.Date[] P08JU3_A11046MComFch ;
   private String[] P08JU3_A11045MComExt ;
   private long[] P08JU3_A11055MComCod ;
   private String[] P08JU3_A11050MComOri ;
   private String[] P08JU3_A11049MComEst ;
   private GXSimpleCollection<String> AV29TFMComEst_Sels ;
   private GXSimpleCollection<String> AV31TFMComOri_Sels ;
   private GXSimpleCollection<String> AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ;
   private GXSimpleCollection<String> AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class tmcomentwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11049MComEst ,
                                          GXSimpleCollection<String> AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ,
                                          String A11050MComOri ,
                                          GXSimpleCollection<String> AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ,
                                          long AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod ,
                                          long AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to ,
                                          String AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ,
                                          String AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext ,
                                          java.util.Date AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ,
                                          int AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum ,
                                          int AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to ,
                                          String AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ,
                                          String AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom ,
                                          java.util.Date AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ,
                                          java.util.Date AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ,
                                          int AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size ,
                                          int AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size ,
                                          long A11055MComCod ,
                                          String A11045MComExt ,
                                          java.util.Date A11046MComFch ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.util.Date A11047MComSolFch ,
                                          java.util.Date A11048MComEntFch ,
                                          String AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MComExt, T1.MComEntFch, T1.MComSolFch, T2.PrvNom, T1.PrvNum, T1.MComFch, T1.MComCod, T1.MComOri, T1.MComEst FROM (TXPMRepCo T1 LEFT JOIN TXPPRVGEN" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (0==AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod) )
      {
         addWhere(sWhereString, "(T1.MComCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MComCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel)==0) && ( ! (GXutil.strcmp("", AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MComExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MComExt = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch)) )
      {
         addWhere(sWhereString, "(T1.MComFch >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch)) )
      {
         addWhere(sWhereString, "(T1.MComSolFch >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch)) )
      {
         addWhere(sWhereString, "(T1.MComEntFch >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels, "T1.MComEst IN (", ")")+")");
      }
      if ( AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels, "T1.MComOri IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MComExt" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08JU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11049MComEst ,
                                          GXSimpleCollection<String> AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ,
                                          String A11050MComOri ,
                                          GXSimpleCollection<String> AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ,
                                          long AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod ,
                                          long AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to ,
                                          String AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ,
                                          String AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext ,
                                          java.util.Date AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ,
                                          int AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum ,
                                          int AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to ,
                                          String AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ,
                                          String AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom ,
                                          java.util.Date AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ,
                                          java.util.Date AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ,
                                          int AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size ,
                                          int AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size ,
                                          long A11055MComCod ,
                                          String A11045MComExt ,
                                          java.util.Date A11046MComFch ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.util.Date A11047MComSolFch ,
                                          java.util.Date A11048MComEntFch ,
                                          String AV55Mantenimientomaquina_tmcomentwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[11];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.EmprCod, T1.MComEntFch, T1.MComSolFch, T2.PrvNom, T1.MComFch, T1.MComExt, T1.MComCod, T1.MComOri, T1.MComEst FROM (TXPMRepCo T1 LEFT JOIN TXPPRVGEN" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (0==AV56Mantenimientomaquina_tmcomentwwds_2_tfmcomcod) )
      {
         addWhere(sWhereString, "(T1.MComCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV57Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MComCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel)==0) && ( ! (GXutil.strcmp("", AV58Mantenimientomaquina_tmcomentwwds_4_tfmcomext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MComExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MComExt = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Mantenimientomaquina_tmcomentwwds_6_tfmcomfch)) )
      {
         addWhere(sWhereString, "(T1.MComFch >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV61Mantenimientomaquina_tmcomentwwds_7_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV62Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientomaquina_tmcomentwwds_9_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch)) )
      {
         addWhere(sWhereString, "(T1.MComSolFch >= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch)) )
      {
         addWhere(sWhereString, "(T1.MComEntFch >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV67Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels, "T1.MComEst IN (", ")")+")");
      }
      if ( AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV68Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels, "T1.MComOri IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P08JU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P08JU3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((long[]) buf[9])[0] = rslt.getLong(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((long[]) buf[9])[0] = rslt.getLong(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
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
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               return;
      }
   }

}

