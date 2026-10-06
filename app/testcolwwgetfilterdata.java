package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class testcolwwgetfilterdata extends GXProcedure
{
   public testcolwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testcolwwgetfilterdata.class ), "" );
   }

   public testcolwwgetfilterdata( int remoteHandle ,
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
      testcolwwgetfilterdata.this.aP5 = new String[] {""};
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
      testcolwwgetfilterdata.this.AV30DDOName = aP0;
      testcolwwgetfilterdata.this.AV28SearchTxt = aP1;
      testcolwwgetfilterdata.this.AV29SearchTxtTo = aP2;
      testcolwwgetfilterdata.this.aP3 = aP3;
      testcolwwgetfilterdata.this.aP4 = aP4;
      testcolwwgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_ESTCOL") == 0 )
      {
         /* Execute user subroutine: 'LOADESTCOLOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_ESTCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADESTCOLDSCOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV41Session.getValue("TEstColWWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TEstColWWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("TEstColWWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOL") == 0 )
         {
            AV18TFEstCol = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOL_SEL") == 0 )
         {
            AV19TFEstCol_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLDSC") == 0 )
         {
            AV20TFEstColDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLDSC_SEL") == 0 )
         {
            AV21TFEstColDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLBCK_SEL") == 0 )
         {
            AV24TFEstColBck_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV25TFEstColBck_Sels.fromJSonString(AV24TFEstColBck_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLRGB") == 0 )
         {
            AV26TFEstColRGB = GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV27TFEstColRGB_To = GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV28SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV51Testcolwwds_1_filterfulltext = AV46FilterFullText ;
      AV52Testcolwwds_2_tfclicod = AV14TFCliCod ;
      AV53Testcolwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV54Testcolwwds_4_tfclinom = AV16TFCliNom ;
      AV55Testcolwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV56Testcolwwds_6_tfestcol = AV18TFEstCol ;
      AV57Testcolwwds_7_tfestcol_sel = AV19TFEstCol_Sel ;
      AV58Testcolwwds_8_tfestcoldsc = AV20TFEstColDsc ;
      AV59Testcolwwds_9_tfestcoldsc_sel = AV21TFEstColDsc_Sel ;
      AV60Testcolwwds_10_tfestcolbck_sels = AV25TFEstColBck_Sels ;
      AV61Testcolwwds_11_tfestcolrgb = AV26TFEstColRGB ;
      AV62Testcolwwds_12_tfestcolrgb_to = AV27TFEstColRGB_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11685EstColBck ,
                                           AV60Testcolwwds_10_tfestcolbck_sels ,
                                           Integer.valueOf(AV52Testcolwwds_2_tfclicod) ,
                                           Integer.valueOf(AV53Testcolwwds_3_tfclicod_to) ,
                                           AV55Testcolwwds_5_tfclinom_sel ,
                                           AV54Testcolwwds_4_tfclinom ,
                                           AV57Testcolwwds_7_tfestcol_sel ,
                                           AV56Testcolwwds_6_tfestcol ,
                                           AV59Testcolwwds_9_tfestcoldsc_sel ,
                                           AV58Testcolwwds_8_tfestcoldsc ,
                                           Integer.valueOf(AV60Testcolwwds_10_tfestcolbck_sels.size()) ,
                                           Long.valueOf(AV61Testcolwwds_11_tfestcolrgb) ,
                                           Long.valueOf(AV62Testcolwwds_12_tfestcolrgb_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4415EstCol ,
                                           A6848EstColDsc ,
                                           Long.valueOf(A12712EstColRGB) ,
                                           AV51Testcolwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV54Testcolwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV54Testcolwwds_4_tfclinom), 30, "%") ;
      lV56Testcolwwds_6_tfestcol = GXutil.padr( GXutil.rtrim( AV56Testcolwwds_6_tfestcol), 20, "%") ;
      lV58Testcolwwds_8_tfestcoldsc = GXutil.padr( GXutil.rtrim( AV58Testcolwwds_8_tfestcoldsc), 30, "%") ;
      /* Using cursor P08WO2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV52Testcolwwds_2_tfclicod), Integer.valueOf(AV53Testcolwwds_3_tfclicod_to), lV54Testcolwwds_4_tfclinom, AV55Testcolwwds_5_tfclinom_sel, lV56Testcolwwds_6_tfestcol, AV57Testcolwwds_7_tfestcol_sel, lV58Testcolwwds_8_tfestcoldsc, AV59Testcolwwds_9_tfestcoldsc_sel, Long.valueOf(AV61Testcolwwds_11_tfestcolrgb), Long.valueOf(AV62Testcolwwds_12_tfestcolrgb_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8WO2 = false ;
         A396EmprCod = P08WO2_A396EmprCod[0] ;
         A279CliNom = P08WO2_A279CliNom[0] ;
         A12712EstColRGB = P08WO2_A12712EstColRGB[0] ;
         n12712EstColRGB = P08WO2_n12712EstColRGB[0] ;
         A6848EstColDsc = P08WO2_A6848EstColDsc[0] ;
         n6848EstColDsc = P08WO2_n6848EstColDsc[0] ;
         A4415EstCol = P08WO2_A4415EstCol[0] ;
         A252CliCod = P08WO2_A252CliCod[0] ;
         A11685EstColBck = P08WO2_A11685EstColBck[0] ;
         n11685EstColBck = P08WO2_n11685EstColBck[0] ;
         A279CliNom = P08WO2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV51Testcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV51Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4415EstCol) , GXutil.padr( "%" + GXutil.upper( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6848EstColDsc) , GXutil.padr( "%" + GXutil.upper( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "blanco", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "WHT", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "rojo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "RED", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "verde", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "GRN", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "azul", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLU", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "amarillo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "YLW", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "negro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLK", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A12712EstColRGB, 10, 0) , GXutil.padr( "%" + AV51Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV40count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08WO2_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk8WO2 = false ;
               A396EmprCod = P08WO2_A396EmprCod[0] ;
               A4415EstCol = P08WO2_A4415EstCol[0] ;
               A252CliCod = P08WO2_A252CliCod[0] ;
               AV40count = (long)(AV40count+1) ;
               brk8WO2 = true ;
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
         if ( ! brk8WO2 )
         {
            brk8WO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADESTCOLOPTIONS' Routine */
      returnInSub = false ;
      AV18TFEstCol = AV28SearchTxt ;
      AV19TFEstCol_Sel = "" ;
      AV51Testcolwwds_1_filterfulltext = AV46FilterFullText ;
      AV52Testcolwwds_2_tfclicod = AV14TFCliCod ;
      AV53Testcolwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV54Testcolwwds_4_tfclinom = AV16TFCliNom ;
      AV55Testcolwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV56Testcolwwds_6_tfestcol = AV18TFEstCol ;
      AV57Testcolwwds_7_tfestcol_sel = AV19TFEstCol_Sel ;
      AV58Testcolwwds_8_tfestcoldsc = AV20TFEstColDsc ;
      AV59Testcolwwds_9_tfestcoldsc_sel = AV21TFEstColDsc_Sel ;
      AV60Testcolwwds_10_tfestcolbck_sels = AV25TFEstColBck_Sels ;
      AV61Testcolwwds_11_tfestcolrgb = AV26TFEstColRGB ;
      AV62Testcolwwds_12_tfestcolrgb_to = AV27TFEstColRGB_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A11685EstColBck ,
                                           AV60Testcolwwds_10_tfestcolbck_sels ,
                                           Integer.valueOf(AV52Testcolwwds_2_tfclicod) ,
                                           Integer.valueOf(AV53Testcolwwds_3_tfclicod_to) ,
                                           AV55Testcolwwds_5_tfclinom_sel ,
                                           AV54Testcolwwds_4_tfclinom ,
                                           AV57Testcolwwds_7_tfestcol_sel ,
                                           AV56Testcolwwds_6_tfestcol ,
                                           AV59Testcolwwds_9_tfestcoldsc_sel ,
                                           AV58Testcolwwds_8_tfestcoldsc ,
                                           Integer.valueOf(AV60Testcolwwds_10_tfestcolbck_sels.size()) ,
                                           Long.valueOf(AV61Testcolwwds_11_tfestcolrgb) ,
                                           Long.valueOf(AV62Testcolwwds_12_tfestcolrgb_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4415EstCol ,
                                           A6848EstColDsc ,
                                           Long.valueOf(A12712EstColRGB) ,
                                           AV51Testcolwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV54Testcolwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV54Testcolwwds_4_tfclinom), 30, "%") ;
      lV56Testcolwwds_6_tfestcol = GXutil.padr( GXutil.rtrim( AV56Testcolwwds_6_tfestcol), 20, "%") ;
      lV58Testcolwwds_8_tfestcoldsc = GXutil.padr( GXutil.rtrim( AV58Testcolwwds_8_tfestcoldsc), 30, "%") ;
      /* Using cursor P08WO3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV52Testcolwwds_2_tfclicod), Integer.valueOf(AV53Testcolwwds_3_tfclicod_to), lV54Testcolwwds_4_tfclinom, AV55Testcolwwds_5_tfclinom_sel, lV56Testcolwwds_6_tfestcol, AV57Testcolwwds_7_tfestcol_sel, lV58Testcolwwds_8_tfestcoldsc, AV59Testcolwwds_9_tfestcoldsc_sel, Long.valueOf(AV61Testcolwwds_11_tfestcolrgb), Long.valueOf(AV62Testcolwwds_12_tfestcolrgb_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8WO4 = false ;
         A396EmprCod = P08WO3_A396EmprCod[0] ;
         A4415EstCol = P08WO3_A4415EstCol[0] ;
         A12712EstColRGB = P08WO3_A12712EstColRGB[0] ;
         n12712EstColRGB = P08WO3_n12712EstColRGB[0] ;
         A6848EstColDsc = P08WO3_A6848EstColDsc[0] ;
         n6848EstColDsc = P08WO3_n6848EstColDsc[0] ;
         A279CliNom = P08WO3_A279CliNom[0] ;
         A252CliCod = P08WO3_A252CliCod[0] ;
         A11685EstColBck = P08WO3_A11685EstColBck[0] ;
         n11685EstColBck = P08WO3_n11685EstColBck[0] ;
         A279CliNom = P08WO3_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV51Testcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV51Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4415EstCol) , GXutil.padr( "%" + GXutil.upper( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6848EstColDsc) , GXutil.padr( "%" + GXutil.upper( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "blanco", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "WHT", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "rojo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "RED", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "verde", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "GRN", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "azul", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLU", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "amarillo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "YLW", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "negro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLK", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A12712EstColRGB, 10, 0) , GXutil.padr( "%" + AV51Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV40count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08WO3_A4415EstCol[0], A4415EstCol) == 0 ) )
            {
               brk8WO4 = false ;
               A396EmprCod = P08WO3_A396EmprCod[0] ;
               A252CliCod = P08WO3_A252CliCod[0] ;
               AV40count = (long)(AV40count+1) ;
               brk8WO4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A4415EstCol)==0) )
            {
               AV32Option = A4415EstCol ;
               AV33Options.add(AV32Option, 0);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV33Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8WO4 )
         {
            brk8WO4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADESTCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFEstColDsc = AV28SearchTxt ;
      AV21TFEstColDsc_Sel = "" ;
      AV51Testcolwwds_1_filterfulltext = AV46FilterFullText ;
      AV52Testcolwwds_2_tfclicod = AV14TFCliCod ;
      AV53Testcolwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV54Testcolwwds_4_tfclinom = AV16TFCliNom ;
      AV55Testcolwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV56Testcolwwds_6_tfestcol = AV18TFEstCol ;
      AV57Testcolwwds_7_tfestcol_sel = AV19TFEstCol_Sel ;
      AV58Testcolwwds_8_tfestcoldsc = AV20TFEstColDsc ;
      AV59Testcolwwds_9_tfestcoldsc_sel = AV21TFEstColDsc_Sel ;
      AV60Testcolwwds_10_tfestcolbck_sels = AV25TFEstColBck_Sels ;
      AV61Testcolwwds_11_tfestcolrgb = AV26TFEstColRGB ;
      AV62Testcolwwds_12_tfestcolrgb_to = AV27TFEstColRGB_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A11685EstColBck ,
                                           AV60Testcolwwds_10_tfestcolbck_sels ,
                                           Integer.valueOf(AV52Testcolwwds_2_tfclicod) ,
                                           Integer.valueOf(AV53Testcolwwds_3_tfclicod_to) ,
                                           AV55Testcolwwds_5_tfclinom_sel ,
                                           AV54Testcolwwds_4_tfclinom ,
                                           AV57Testcolwwds_7_tfestcol_sel ,
                                           AV56Testcolwwds_6_tfestcol ,
                                           AV59Testcolwwds_9_tfestcoldsc_sel ,
                                           AV58Testcolwwds_8_tfestcoldsc ,
                                           Integer.valueOf(AV60Testcolwwds_10_tfestcolbck_sels.size()) ,
                                           Long.valueOf(AV61Testcolwwds_11_tfestcolrgb) ,
                                           Long.valueOf(AV62Testcolwwds_12_tfestcolrgb_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4415EstCol ,
                                           A6848EstColDsc ,
                                           Long.valueOf(A12712EstColRGB) ,
                                           AV51Testcolwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV54Testcolwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV54Testcolwwds_4_tfclinom), 30, "%") ;
      lV56Testcolwwds_6_tfestcol = GXutil.padr( GXutil.rtrim( AV56Testcolwwds_6_tfestcol), 20, "%") ;
      lV58Testcolwwds_8_tfestcoldsc = GXutil.padr( GXutil.rtrim( AV58Testcolwwds_8_tfestcoldsc), 30, "%") ;
      /* Using cursor P08WO4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV52Testcolwwds_2_tfclicod), Integer.valueOf(AV53Testcolwwds_3_tfclicod_to), lV54Testcolwwds_4_tfclinom, AV55Testcolwwds_5_tfclinom_sel, lV56Testcolwwds_6_tfestcol, AV57Testcolwwds_7_tfestcol_sel, lV58Testcolwwds_8_tfestcoldsc, AV59Testcolwwds_9_tfestcoldsc_sel, Long.valueOf(AV61Testcolwwds_11_tfestcolrgb), Long.valueOf(AV62Testcolwwds_12_tfestcolrgb_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8WO6 = false ;
         A396EmprCod = P08WO4_A396EmprCod[0] ;
         A6848EstColDsc = P08WO4_A6848EstColDsc[0] ;
         n6848EstColDsc = P08WO4_n6848EstColDsc[0] ;
         A12712EstColRGB = P08WO4_A12712EstColRGB[0] ;
         n12712EstColRGB = P08WO4_n12712EstColRGB[0] ;
         A4415EstCol = P08WO4_A4415EstCol[0] ;
         A279CliNom = P08WO4_A279CliNom[0] ;
         A252CliCod = P08WO4_A252CliCod[0] ;
         A11685EstColBck = P08WO4_A11685EstColBck[0] ;
         n11685EstColBck = P08WO4_n11685EstColBck[0] ;
         A279CliNom = P08WO4_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV51Testcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV51Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4415EstCol) , GXutil.padr( "%" + GXutil.upper( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6848EstColDsc) , GXutil.padr( "%" + GXutil.upper( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "blanco", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "WHT", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "rojo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "RED", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "verde", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "GRN", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "azul", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLU", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "amarillo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "YLW", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "negro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV51Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLK", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A12712EstColRGB, 10, 0) , GXutil.padr( "%" + AV51Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV40count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08WO4_A6848EstColDsc[0], A6848EstColDsc) == 0 ) )
            {
               brk8WO6 = false ;
               A396EmprCod = P08WO4_A396EmprCod[0] ;
               A4415EstCol = P08WO4_A4415EstCol[0] ;
               A252CliCod = P08WO4_A252CliCod[0] ;
               AV40count = (long)(AV40count+1) ;
               brk8WO6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A6848EstColDsc)==0) )
            {
               AV32Option = A6848EstColDsc ;
               AV33Options.add(AV32Option, 0);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV33Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8WO6 )
         {
            brk8WO6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = testcolwwgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = testcolwwgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = testcolwwgetfilterdata.this.AV39OptionIndexesJson;
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
      AV46FilterFullText = "" ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV18TFEstCol = "" ;
      AV19TFEstCol_Sel = "" ;
      AV20TFEstColDsc = "" ;
      AV21TFEstColDsc_Sel = "" ;
      AV24TFEstColBck_SelsJson = "" ;
      AV25TFEstColBck_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A279CliNom = "" ;
      AV51Testcolwwds_1_filterfulltext = "" ;
      AV54Testcolwwds_4_tfclinom = "" ;
      AV55Testcolwwds_5_tfclinom_sel = "" ;
      AV56Testcolwwds_6_tfestcol = "" ;
      AV57Testcolwwds_7_tfestcol_sel = "" ;
      AV58Testcolwwds_8_tfestcoldsc = "" ;
      AV59Testcolwwds_9_tfestcoldsc_sel = "" ;
      AV60Testcolwwds_10_tfestcolbck_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV51Testcolwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV54Testcolwwds_4_tfclinom = "" ;
      lV56Testcolwwds_6_tfestcol = "" ;
      lV58Testcolwwds_8_tfestcoldsc = "" ;
      A11685EstColBck = "" ;
      A4415EstCol = "" ;
      A6848EstColDsc = "" ;
      P08WO2_A396EmprCod = new String[] {""} ;
      P08WO2_A279CliNom = new String[] {""} ;
      P08WO2_A12712EstColRGB = new long[1] ;
      P08WO2_n12712EstColRGB = new boolean[] {false} ;
      P08WO2_A6848EstColDsc = new String[] {""} ;
      P08WO2_n6848EstColDsc = new boolean[] {false} ;
      P08WO2_A4415EstCol = new String[] {""} ;
      P08WO2_A252CliCod = new int[1] ;
      P08WO2_A11685EstColBck = new String[] {""} ;
      P08WO2_n11685EstColBck = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV32Option = "" ;
      P08WO3_A396EmprCod = new String[] {""} ;
      P08WO3_A4415EstCol = new String[] {""} ;
      P08WO3_A12712EstColRGB = new long[1] ;
      P08WO3_n12712EstColRGB = new boolean[] {false} ;
      P08WO3_A6848EstColDsc = new String[] {""} ;
      P08WO3_n6848EstColDsc = new boolean[] {false} ;
      P08WO3_A279CliNom = new String[] {""} ;
      P08WO3_A252CliCod = new int[1] ;
      P08WO3_A11685EstColBck = new String[] {""} ;
      P08WO3_n11685EstColBck = new boolean[] {false} ;
      P08WO4_A396EmprCod = new String[] {""} ;
      P08WO4_A6848EstColDsc = new String[] {""} ;
      P08WO4_n6848EstColDsc = new boolean[] {false} ;
      P08WO4_A12712EstColRGB = new long[1] ;
      P08WO4_n12712EstColRGB = new boolean[] {false} ;
      P08WO4_A4415EstCol = new String[] {""} ;
      P08WO4_A279CliNom = new String[] {""} ;
      P08WO4_A252CliCod = new int[1] ;
      P08WO4_A11685EstColBck = new String[] {""} ;
      P08WO4_n11685EstColBck = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testcolwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08WO2_A396EmprCod, P08WO2_A279CliNom, P08WO2_A12712EstColRGB, P08WO2_n12712EstColRGB, P08WO2_A6848EstColDsc, P08WO2_n6848EstColDsc, P08WO2_A4415EstCol, P08WO2_A252CliCod, P08WO2_A11685EstColBck, P08WO2_n11685EstColBck
            }
            , new Object[] {
            P08WO3_A396EmprCod, P08WO3_A4415EstCol, P08WO3_A12712EstColRGB, P08WO3_n12712EstColRGB, P08WO3_A6848EstColDsc, P08WO3_n6848EstColDsc, P08WO3_A279CliNom, P08WO3_A252CliCod, P08WO3_A11685EstColBck, P08WO3_n11685EstColBck
            }
            , new Object[] {
            P08WO4_A396EmprCod, P08WO4_A6848EstColDsc, P08WO4_n6848EstColDsc, P08WO4_A12712EstColRGB, P08WO4_n12712EstColRGB, P08WO4_A4415EstCol, P08WO4_A279CliNom, P08WO4_A252CliCod, P08WO4_A11685EstColBck, P08WO4_n11685EstColBck
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV52Testcolwwds_2_tfclicod ;
   private int AV53Testcolwwds_3_tfclicod_to ;
   private int AV60Testcolwwds_10_tfestcolbck_sels_size ;
   private int A252CliCod ;
   private long AV26TFEstColRGB ;
   private long AV27TFEstColRGB_To ;
   private long AV61Testcolwwds_11_tfestcolrgb ;
   private long AV62Testcolwwds_12_tfestcolrgb_to ;
   private long A12712EstColRGB ;
   private long AV40count ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV18TFEstCol ;
   private String AV19TFEstCol_Sel ;
   private String AV20TFEstColDsc ;
   private String AV21TFEstColDsc_Sel ;
   private String A279CliNom ;
   private String AV54Testcolwwds_4_tfclinom ;
   private String AV55Testcolwwds_5_tfclinom_sel ;
   private String AV56Testcolwwds_6_tfestcol ;
   private String AV57Testcolwwds_7_tfestcol_sel ;
   private String AV58Testcolwwds_8_tfestcoldsc ;
   private String AV59Testcolwwds_9_tfestcoldsc_sel ;
   private String scmdbuf ;
   private String lV54Testcolwwds_4_tfclinom ;
   private String lV56Testcolwwds_6_tfestcol ;
   private String lV58Testcolwwds_8_tfestcoldsc ;
   private String A11685EstColBck ;
   private String A4415EstCol ;
   private String A6848EstColDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8WO2 ;
   private boolean n12712EstColRGB ;
   private boolean n6848EstColDsc ;
   private boolean n11685EstColBck ;
   private boolean brk8WO4 ;
   private boolean brk8WO6 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV24TFEstColBck_SelsJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Testcolwwds_1_filterfulltext ;
   private String lV51Testcolwwds_1_filterfulltext ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08WO2_A396EmprCod ;
   private String[] P08WO2_A279CliNom ;
   private long[] P08WO2_A12712EstColRGB ;
   private boolean[] P08WO2_n12712EstColRGB ;
   private String[] P08WO2_A6848EstColDsc ;
   private boolean[] P08WO2_n6848EstColDsc ;
   private String[] P08WO2_A4415EstCol ;
   private int[] P08WO2_A252CliCod ;
   private String[] P08WO2_A11685EstColBck ;
   private boolean[] P08WO2_n11685EstColBck ;
   private String[] P08WO3_A396EmprCod ;
   private String[] P08WO3_A4415EstCol ;
   private long[] P08WO3_A12712EstColRGB ;
   private boolean[] P08WO3_n12712EstColRGB ;
   private String[] P08WO3_A6848EstColDsc ;
   private boolean[] P08WO3_n6848EstColDsc ;
   private String[] P08WO3_A279CliNom ;
   private int[] P08WO3_A252CliCod ;
   private String[] P08WO3_A11685EstColBck ;
   private boolean[] P08WO3_n11685EstColBck ;
   private String[] P08WO4_A396EmprCod ;
   private String[] P08WO4_A6848EstColDsc ;
   private boolean[] P08WO4_n6848EstColDsc ;
   private long[] P08WO4_A12712EstColRGB ;
   private boolean[] P08WO4_n12712EstColRGB ;
   private String[] P08WO4_A4415EstCol ;
   private String[] P08WO4_A279CliNom ;
   private int[] P08WO4_A252CliCod ;
   private String[] P08WO4_A11685EstColBck ;
   private boolean[] P08WO4_n11685EstColBck ;
   private GXSimpleCollection<String> AV25TFEstColBck_Sels ;
   private GXSimpleCollection<String> AV60Testcolwwds_10_tfestcolbck_sels ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class testcolwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11685EstColBck ,
                                          GXSimpleCollection<String> AV60Testcolwwds_10_tfestcolbck_sels ,
                                          int AV52Testcolwwds_2_tfclicod ,
                                          int AV53Testcolwwds_3_tfclicod_to ,
                                          String AV55Testcolwwds_5_tfclinom_sel ,
                                          String AV54Testcolwwds_4_tfclinom ,
                                          String AV57Testcolwwds_7_tfestcol_sel ,
                                          String AV56Testcolwwds_6_tfestcol ,
                                          String AV59Testcolwwds_9_tfestcoldsc_sel ,
                                          String AV58Testcolwwds_8_tfestcoldsc ,
                                          int AV60Testcolwwds_10_tfestcolbck_sels_size ,
                                          long AV61Testcolwwds_11_tfestcolrgb ,
                                          long AV62Testcolwwds_12_tfestcolrgb_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4415EstCol ,
                                          String A6848EstColDsc ,
                                          long A12712EstColRGB ,
                                          String AV51Testcolwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.EstColRGB, T1.EstColDsc, T1.EstCol, T1.CliCod, T1.EstColBck FROM (TXPCEstCo T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV52Testcolwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV53Testcolwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testcolwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV54Testcolwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testcolwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Testcolwwds_7_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV56Testcolwwds_6_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Testcolwwds_7_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCol = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testcolwwds_9_tfestcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Testcolwwds_8_tfestcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testcolwwds_9_tfestcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstColDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV60Testcolwwds_10_tfestcolbck_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV60Testcolwwds_10_tfestcolbck_sels, "T1.EstColBck IN (", ")")+")");
      }
      if ( ! (0==AV61Testcolwwds_11_tfestcolrgb) )
      {
         addWhere(sWhereString, "(T1.EstColRGB >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Testcolwwds_12_tfestcolrgb_to) )
      {
         addWhere(sWhereString, "(T1.EstColRGB <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08WO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11685EstColBck ,
                                          GXSimpleCollection<String> AV60Testcolwwds_10_tfestcolbck_sels ,
                                          int AV52Testcolwwds_2_tfclicod ,
                                          int AV53Testcolwwds_3_tfclicod_to ,
                                          String AV55Testcolwwds_5_tfclinom_sel ,
                                          String AV54Testcolwwds_4_tfclinom ,
                                          String AV57Testcolwwds_7_tfestcol_sel ,
                                          String AV56Testcolwwds_6_tfestcol ,
                                          String AV59Testcolwwds_9_tfestcoldsc_sel ,
                                          String AV58Testcolwwds_8_tfestcoldsc ,
                                          int AV60Testcolwwds_10_tfestcolbck_sels_size ,
                                          long AV61Testcolwwds_11_tfestcolrgb ,
                                          long AV62Testcolwwds_12_tfestcolrgb_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4415EstCol ,
                                          String A6848EstColDsc ,
                                          long A12712EstColRGB ,
                                          String AV51Testcolwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[10];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.EstCol, T1.EstColRGB, T1.EstColDsc, T2.CliNom, T1.CliCod, T1.EstColBck FROM (TXPCEstCo T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV52Testcolwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV53Testcolwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testcolwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV54Testcolwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testcolwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Testcolwwds_7_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV56Testcolwwds_6_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Testcolwwds_7_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCol = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testcolwwds_9_tfestcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Testcolwwds_8_tfestcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testcolwwds_9_tfestcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstColDsc = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV60Testcolwwds_10_tfestcolbck_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV60Testcolwwds_10_tfestcolbck_sels, "T1.EstColBck IN (", ")")+")");
      }
      if ( ! (0==AV61Testcolwwds_11_tfestcolrgb) )
      {
         addWhere(sWhereString, "(T1.EstColRGB >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Testcolwwds_12_tfestcolrgb_to) )
      {
         addWhere(sWhereString, "(T1.EstColRGB <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EstCol" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08WO4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11685EstColBck ,
                                          GXSimpleCollection<String> AV60Testcolwwds_10_tfestcolbck_sels ,
                                          int AV52Testcolwwds_2_tfclicod ,
                                          int AV53Testcolwwds_3_tfclicod_to ,
                                          String AV55Testcolwwds_5_tfclinom_sel ,
                                          String AV54Testcolwwds_4_tfclinom ,
                                          String AV57Testcolwwds_7_tfestcol_sel ,
                                          String AV56Testcolwwds_6_tfestcol ,
                                          String AV59Testcolwwds_9_tfestcoldsc_sel ,
                                          String AV58Testcolwwds_8_tfestcoldsc ,
                                          int AV60Testcolwwds_10_tfestcolbck_sels_size ,
                                          long AV61Testcolwwds_11_tfestcolrgb ,
                                          long AV62Testcolwwds_12_tfestcolrgb_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4415EstCol ,
                                          String A6848EstColDsc ,
                                          long A12712EstColRGB ,
                                          String AV51Testcolwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[10];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.EstColDsc, T1.EstColRGB, T1.EstCol, T2.CliNom, T1.CliCod, T1.EstColBck FROM (TXPCEstCo T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV52Testcolwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV53Testcolwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testcolwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV54Testcolwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testcolwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Testcolwwds_7_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV56Testcolwwds_6_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Testcolwwds_7_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCol = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testcolwwds_9_tfestcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Testcolwwds_8_tfestcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testcolwwds_9_tfestcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstColDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV60Testcolwwds_10_tfestcolbck_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV60Testcolwwds_10_tfestcolbck_sels, "T1.EstColBck IN (", ")")+")");
      }
      if ( ! (0==AV61Testcolwwds_11_tfestcolrgb) )
      {
         addWhere(sWhereString, "(T1.EstColRGB >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Testcolwwds_12_tfestcolrgb_to) )
      {
         addWhere(sWhereString, "(T1.EstColRGB <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EstColDsc" ;
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
                  return conditional_P08WO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P08WO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] );
            case 2 :
                  return conditional_P08WO4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WO4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               return;
      }
   }

}

