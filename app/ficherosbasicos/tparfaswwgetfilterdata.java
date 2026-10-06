package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tparfaswwgetfilterdata extends GXProcedure
{
   public tparfaswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tparfaswwgetfilterdata.class ), "" );
   }

   public tparfaswwgetfilterdata( int remoteHandle ,
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
      tparfaswwgetfilterdata.this.aP5 = new String[] {""};
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
      tparfaswwgetfilterdata.this.AV28DDOName = aP0;
      tparfaswwgetfilterdata.this.AV26SearchTxt = aP1;
      tparfaswwgetfilterdata.this.AV27SearchTxtTo = aP2;
      tparfaswwgetfilterdata.this.aP3 = aP3;
      tparfaswwgetfilterdata.this.aP4 = aP4;
      tparfaswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PARFASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPARFASDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PARUNDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPARUNDDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("FicherosBasicos.TPARFASWWGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TPARFASWWGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("FicherosBasicos.TPARFASWWGridState"), null, null);
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV61FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASCOD") == 0 )
         {
            AV10TFParFasCod = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFParFasCod_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASDSC") == 0 )
         {
            AV12TFParFasDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASDSC_SEL") == 0 )
         {
            AV13TFParFasDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDID") == 0 )
         {
            AV22TFParUndID = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFParUndID_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC") == 0 )
         {
            AV24TFParUndDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC_SEL") == 0 )
         {
            AV25TFParUndDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPARFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFParFasDsc = AV26SearchTxt ;
      AV13TFParFasDsc_Sel = "" ;
      AV68Ficherosbasicos_tparfaswwds_1_filterfulltext = AV61FilterFullText ;
      AV69Ficherosbasicos_tparfaswwds_2_tfparfascod = AV10TFParFasCod ;
      AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to = AV11TFParFasCod_To ;
      AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc = AV12TFParFasDsc ;
      AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel = AV13TFParFasDsc_Sel ;
      AV73Ficherosbasicos_tparfaswwds_6_tfparundid = AV22TFParUndID ;
      AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to = AV23TFParUndID_To ;
      AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc = AV24TFParUndDsc ;
      AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel = AV25TFParUndDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV68Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                           Short.valueOf(AV69Ficherosbasicos_tparfaswwds_2_tfparfascod) ,
                                           Short.valueOf(AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to) ,
                                           AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                           AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                           Short.valueOf(AV73Ficherosbasicos_tparfaswwds_6_tfparundid) ,
                                           Short.valueOf(AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to) ,
                                           AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                           AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                           Short.valueOf(A1664ParFasCod) ,
                                           A1665ParFasDsc ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV68Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV68Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV68Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV68Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc = GXutil.padr( GXutil.rtrim( AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc), 30, "%") ;
      lV75Ficherosbasicos_tparfaswwds_8_tfparunddsc = GXutil.padr( GXutil.rtrim( AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc), 15, "%") ;
      /* Using cursor P080N2 */
      pr_default.execute(0, new Object[] {lV68Ficherosbasicos_tparfaswwds_1_filterfulltext, lV68Ficherosbasicos_tparfaswwds_1_filterfulltext, lV68Ficherosbasicos_tparfaswwds_1_filterfulltext, lV68Ficherosbasicos_tparfaswwds_1_filterfulltext, Short.valueOf(AV69Ficherosbasicos_tparfaswwds_2_tfparfascod), Short.valueOf(AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to), lV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc, AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel, Short.valueOf(AV73Ficherosbasicos_tparfaswwds_6_tfparundid), Short.valueOf(AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to), lV75Ficherosbasicos_tparfaswwds_8_tfparunddsc, AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk80N2 = false ;
         A396EmprCod = P080N2_A396EmprCod[0] ;
         A1665ParFasDsc = P080N2_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P080N2_n1665ParFasDsc[0] ;
         A13204ParUndDsc = P080N2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080N2_n13204ParUndDsc[0] ;
         A13203ParUndID = P080N2_A13203ParUndID[0] ;
         n13203ParUndID = P080N2_n13203ParUndID[0] ;
         A1664ParFasCod = P080N2_A1664ParFasCod[0] ;
         A13204ParUndDsc = P080N2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080N2_n13204ParUndDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P080N2_A1665ParFasDsc[0], A1665ParFasDsc) == 0 ) )
         {
            brk80N2 = false ;
            A396EmprCod = P080N2_A396EmprCod[0] ;
            A1664ParFasCod = P080N2_A1664ParFasCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk80N2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1665ParFasDsc)==0) )
         {
            AV30Option = A1665ParFasDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk80N2 )
         {
            brk80N2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPARUNDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFParUndDsc = AV26SearchTxt ;
      AV25TFParUndDsc_Sel = "" ;
      AV68Ficherosbasicos_tparfaswwds_1_filterfulltext = AV61FilterFullText ;
      AV69Ficherosbasicos_tparfaswwds_2_tfparfascod = AV10TFParFasCod ;
      AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to = AV11TFParFasCod_To ;
      AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc = AV12TFParFasDsc ;
      AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel = AV13TFParFasDsc_Sel ;
      AV73Ficherosbasicos_tparfaswwds_6_tfparundid = AV22TFParUndID ;
      AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to = AV23TFParUndID_To ;
      AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc = AV24TFParUndDsc ;
      AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel = AV25TFParUndDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV68Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                           Short.valueOf(AV69Ficherosbasicos_tparfaswwds_2_tfparfascod) ,
                                           Short.valueOf(AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to) ,
                                           AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                           AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                           Short.valueOf(AV73Ficherosbasicos_tparfaswwds_6_tfparundid) ,
                                           Short.valueOf(AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to) ,
                                           AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                           AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                           Short.valueOf(A1664ParFasCod) ,
                                           A1665ParFasDsc ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV68Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV68Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV68Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV68Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc = GXutil.padr( GXutil.rtrim( AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc), 30, "%") ;
      lV75Ficherosbasicos_tparfaswwds_8_tfparunddsc = GXutil.padr( GXutil.rtrim( AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc), 15, "%") ;
      /* Using cursor P080N3 */
      pr_default.execute(1, new Object[] {lV68Ficherosbasicos_tparfaswwds_1_filterfulltext, lV68Ficherosbasicos_tparfaswwds_1_filterfulltext, lV68Ficherosbasicos_tparfaswwds_1_filterfulltext, lV68Ficherosbasicos_tparfaswwds_1_filterfulltext, Short.valueOf(AV69Ficherosbasicos_tparfaswwds_2_tfparfascod), Short.valueOf(AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to), lV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc, AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel, Short.valueOf(AV73Ficherosbasicos_tparfaswwds_6_tfparundid), Short.valueOf(AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to), lV75Ficherosbasicos_tparfaswwds_8_tfparunddsc, AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk80N4 = false ;
         A13203ParUndID = P080N3_A13203ParUndID[0] ;
         n13203ParUndID = P080N3_n13203ParUndID[0] ;
         A396EmprCod = P080N3_A396EmprCod[0] ;
         A13204ParUndDsc = P080N3_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080N3_n13204ParUndDsc[0] ;
         A1665ParFasDsc = P080N3_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P080N3_n1665ParFasDsc[0] ;
         A1664ParFasCod = P080N3_A1664ParFasCod[0] ;
         A13204ParUndDsc = P080N3_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080N3_n13204ParUndDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P080N3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P080N3_A13203ParUndID[0] == A13203ParUndID ) )
         {
            brk80N4 = false ;
            A1664ParFasCod = P080N3_A1664ParFasCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk80N4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13204ParUndDsc)==0) )
         {
            AV30Option = A13204ParUndDsc ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            AV31Options.add(AV30Option, AV29InsertIndex);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk80N4 )
         {
            brk80N4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tparfaswwgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = tparfaswwgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = tparfaswwgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV61FilterFullText = "" ;
      AV12TFParFasDsc = "" ;
      AV13TFParFasDsc_Sel = "" ;
      AV24TFParUndDsc = "" ;
      AV25TFParUndDsc_Sel = "" ;
      A1665ParFasDsc = "" ;
      AV68Ficherosbasicos_tparfaswwds_1_filterfulltext = "" ;
      AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc = "" ;
      AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel = "" ;
      AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc = "" ;
      AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel = "" ;
      scmdbuf = "" ;
      lV68Ficherosbasicos_tparfaswwds_1_filterfulltext = "" ;
      lV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc = "" ;
      lV75Ficherosbasicos_tparfaswwds_8_tfparunddsc = "" ;
      A13204ParUndDsc = "" ;
      P080N2_A396EmprCod = new String[] {""} ;
      P080N2_A1665ParFasDsc = new String[] {""} ;
      P080N2_n1665ParFasDsc = new boolean[] {false} ;
      P080N2_A13204ParUndDsc = new String[] {""} ;
      P080N2_n13204ParUndDsc = new boolean[] {false} ;
      P080N2_A13203ParUndID = new short[1] ;
      P080N2_n13203ParUndID = new boolean[] {false} ;
      P080N2_A1664ParFasCod = new short[1] ;
      A396EmprCod = "" ;
      AV30Option = "" ;
      P080N3_A13203ParUndID = new short[1] ;
      P080N3_n13203ParUndID = new boolean[] {false} ;
      P080N3_A396EmprCod = new String[] {""} ;
      P080N3_A13204ParUndDsc = new String[] {""} ;
      P080N3_n13204ParUndDsc = new boolean[] {false} ;
      P080N3_A1665ParFasDsc = new String[] {""} ;
      P080N3_n1665ParFasDsc = new boolean[] {false} ;
      P080N3_A1664ParFasCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfaswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P080N2_A396EmprCod, P080N2_A1665ParFasDsc, P080N2_n1665ParFasDsc, P080N2_A13204ParUndDsc, P080N2_n13204ParUndDsc, P080N2_A13203ParUndID, P080N2_n13203ParUndID, P080N2_A1664ParFasCod
            }
            , new Object[] {
            P080N3_A13203ParUndID, P080N3_n13203ParUndID, P080N3_A396EmprCod, P080N3_A13204ParUndDsc, P080N3_n13204ParUndDsc, P080N3_A1665ParFasDsc, P080N3_n1665ParFasDsc, P080N3_A1664ParFasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFParFasCod ;
   private short AV11TFParFasCod_To ;
   private short AV22TFParUndID ;
   private short AV23TFParUndID_To ;
   private short AV69Ficherosbasicos_tparfaswwds_2_tfparfascod ;
   private short AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to ;
   private short AV73Ficherosbasicos_tparfaswwds_6_tfparundid ;
   private short AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to ;
   private short A1664ParFasCod ;
   private short A13203ParUndID ;
   private short Gx_err ;
   private int AV66GXV1 ;
   private int AV29InsertIndex ;
   private long AV38count ;
   private String AV12TFParFasDsc ;
   private String AV13TFParFasDsc_Sel ;
   private String AV24TFParUndDsc ;
   private String AV25TFParUndDsc_Sel ;
   private String A1665ParFasDsc ;
   private String AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc ;
   private String AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ;
   private String AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc ;
   private String AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ;
   private String scmdbuf ;
   private String lV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc ;
   private String lV75Ficherosbasicos_tparfaswwds_8_tfparunddsc ;
   private String A13204ParUndDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk80N2 ;
   private boolean n1665ParFasDsc ;
   private boolean n13204ParUndDsc ;
   private boolean n13203ParUndID ;
   private boolean brk80N4 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV61FilterFullText ;
   private String AV68Ficherosbasicos_tparfaswwds_1_filterfulltext ;
   private String lV68Ficherosbasicos_tparfaswwds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P080N2_A396EmprCod ;
   private String[] P080N2_A1665ParFasDsc ;
   private boolean[] P080N2_n1665ParFasDsc ;
   private String[] P080N2_A13204ParUndDsc ;
   private boolean[] P080N2_n13204ParUndDsc ;
   private short[] P080N2_A13203ParUndID ;
   private boolean[] P080N2_n13203ParUndID ;
   private short[] P080N2_A1664ParFasCod ;
   private short[] P080N3_A13203ParUndID ;
   private boolean[] P080N3_n13203ParUndID ;
   private String[] P080N3_A396EmprCod ;
   private String[] P080N3_A13204ParUndDsc ;
   private boolean[] P080N3_n13204ParUndDsc ;
   private String[] P080N3_A1665ParFasDsc ;
   private boolean[] P080N3_n1665ParFasDsc ;
   private short[] P080N3_A1664ParFasCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class tparfaswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                          short AV69Ficherosbasicos_tparfaswwds_2_tfparfascod ,
                                          short AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to ,
                                          String AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                          String AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                          short AV73Ficherosbasicos_tparfaswwds_6_tfparundid ,
                                          short AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to ,
                                          String AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                          String AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                          short A1664ParFasCod ,
                                          String A1665ParFasDsc ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ParFasDsc, T2.ParUndDsc, T1.ParUndID, T1.ParFasCod FROM (TXPPARFAS T1 LEFT JOIN TXPPARUND T2 ON T2.EmprCod = T1.EmprCod AND T2.ParUndID = T1.ParUndID)" ;
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tparfaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ParFasCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ParFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ParUndID,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParUndDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV69Ficherosbasicos_tparfaswwds_2_tfparfascod) )
      {
         addWhere(sWhereString, "(T1.ParFasCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to) )
      {
         addWhere(sWhereString, "(T1.ParFasCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ParFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ParFasDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tparfaswwds_6_tfparundid) )
      {
         addWhere(sWhereString, "(T1.ParUndID >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to) )
      {
         addWhere(sWhereString, "(T1.ParUndID <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParUndDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParUndDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ParFasDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P080N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                          short AV69Ficherosbasicos_tparfaswwds_2_tfparfascod ,
                                          short AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to ,
                                          String AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                          String AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                          short AV73Ficherosbasicos_tparfaswwds_6_tfparundid ,
                                          short AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to ,
                                          String AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                          String AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                          short A1664ParFasCod ,
                                          String A1665ParFasDsc ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ParUndID, T1.EmprCod, T2.ParUndDsc, T1.ParFasDsc, T1.ParFasCod FROM (TXPPARFAS T1 LEFT JOIN TXPPARUND T2 ON T2.EmprCod = T1.EmprCod AND T2.ParUndID = T1.ParUndID)" ;
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tparfaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ParFasCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ParFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ParUndID,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParUndDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV69Ficherosbasicos_tparfaswwds_2_tfparfascod) )
      {
         addWhere(sWhereString, "(T1.ParFasCod >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV70Ficherosbasicos_tparfaswwds_3_tfparfascod_to) )
      {
         addWhere(sWhereString, "(T1.ParFasCod <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Ficherosbasicos_tparfaswwds_4_tfparfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ParFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ParFasDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tparfaswwds_6_tfparundid) )
      {
         addWhere(sWhereString, "(T1.ParUndID >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tparfaswwds_7_tfparundid_to) )
      {
         addWhere(sWhereString, "(T1.ParUndID <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Ficherosbasicos_tparfaswwds_8_tfparunddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParUndDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParUndDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ParUndID" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P080N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P080N3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P080N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
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
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
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
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 15);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 15);
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
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
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
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 15);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 15);
               }
               return;
      }
   }

}

