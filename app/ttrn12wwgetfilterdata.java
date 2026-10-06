package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn12wwgetfilterdata extends GXProcedure
{
   public ttrn12wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn12wwgetfilterdata.class ), "" );
   }

   public ttrn12wwgetfilterdata( int remoteHandle ,
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
      ttrn12wwgetfilterdata.this.aP5 = new String[] {""};
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
      ttrn12wwgetfilterdata.this.AV22DDOName = aP0;
      ttrn12wwgetfilterdata.this.AV20SearchTxt = aP1;
      ttrn12wwgetfilterdata.this.AV21SearchTxtTo = aP2;
      ttrn12wwgetfilterdata.this.aP3 = aP3;
      ttrn12wwgetfilterdata.this.aP4 = aP4;
      ttrn12wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_EMPRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S131 ();
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
      if ( GXutil.strcmp(AV33Session.getValue("TTrn12WWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn12WWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("TTrn12WWGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV49FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV12TFAlbProCod = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV13TFAlbProCod_To = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV14TFEmprNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV15TFEmprNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPOBSCON") == 0 )
         {
            AV16TFAlbPObsCon = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFAlbPObsCon_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST") == 0 )
         {
            AV18TFAlbProEst = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFAlbProEst_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV20SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV54Ttrn12wwds_1_filterfulltext = AV49FilterFullText ;
      AV55Ttrn12wwds_2_tfemprcod = AV10TFEmprCod ;
      AV56Ttrn12wwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV57Ttrn12wwds_4_tfalbprocod = AV12TFAlbProCod ;
      AV58Ttrn12wwds_5_tfalbprocod_to = AV13TFAlbProCod_To ;
      AV59Ttrn12wwds_6_tfemprnom = AV14TFEmprNom ;
      AV60Ttrn12wwds_7_tfemprnom_sel = AV15TFEmprNom_Sel ;
      AV61Ttrn12wwds_8_tfalbpobscon = AV16TFAlbPObsCon ;
      AV62Ttrn12wwds_9_tfalbpobscon_to = AV17TFAlbPObsCon_To ;
      AV63Ttrn12wwds_10_tfalbproest = AV18TFAlbProEst ;
      AV64Ttrn12wwds_11_tfalbproest_to = AV19TFAlbProEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Ttrn12wwds_1_filterfulltext ,
                                           AV56Ttrn12wwds_3_tfemprcod_sel ,
                                           AV55Ttrn12wwds_2_tfemprcod ,
                                           Long.valueOf(AV57Ttrn12wwds_4_tfalbprocod) ,
                                           Long.valueOf(AV58Ttrn12wwds_5_tfalbprocod_to) ,
                                           AV60Ttrn12wwds_7_tfemprnom_sel ,
                                           AV59Ttrn12wwds_6_tfemprnom ,
                                           Byte.valueOf(AV61Ttrn12wwds_8_tfalbpobscon) ,
                                           Byte.valueOf(AV62Ttrn12wwds_9_tfalbpobscon_to) ,
                                           Byte.valueOf(AV63Ttrn12wwds_10_tfalbproest) ,
                                           Byte.valueOf(AV64Ttrn12wwds_11_tfalbproest_to) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A407EmprNom ,
                                           Byte.valueOf(A914AlbPObsCon) ,
                                           Byte.valueOf(A33AlbProEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV55Ttrn12wwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV55Ttrn12wwds_2_tfemprcod), 3, "%") ;
      lV59Ttrn12wwds_6_tfemprnom = GXutil.padr( GXutil.rtrim( AV59Ttrn12wwds_6_tfemprnom), 30, "%") ;
      /* Using cursor P08DX2 */
      pr_default.execute(0, new Object[] {lV54Ttrn12wwds_1_filterfulltext, lV54Ttrn12wwds_1_filterfulltext, lV54Ttrn12wwds_1_filterfulltext, lV54Ttrn12wwds_1_filterfulltext, lV54Ttrn12wwds_1_filterfulltext, lV55Ttrn12wwds_2_tfemprcod, AV56Ttrn12wwds_3_tfemprcod_sel, Long.valueOf(AV57Ttrn12wwds_4_tfalbprocod), Long.valueOf(AV58Ttrn12wwds_5_tfalbprocod_to), lV59Ttrn12wwds_6_tfemprnom, AV60Ttrn12wwds_7_tfemprnom_sel, Byte.valueOf(AV61Ttrn12wwds_8_tfalbpobscon), Byte.valueOf(AV62Ttrn12wwds_9_tfalbpobscon_to), Byte.valueOf(AV63Ttrn12wwds_10_tfalbproest), Byte.valueOf(AV64Ttrn12wwds_11_tfalbproest_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8DX2 = false ;
         A396EmprCod = P08DX2_A396EmprCod[0] ;
         A33AlbProEst = P08DX2_A33AlbProEst[0] ;
         A914AlbPObsCon = P08DX2_A914AlbPObsCon[0] ;
         A407EmprNom = P08DX2_A407EmprNom[0] ;
         n407EmprNom = P08DX2_n407EmprNom[0] ;
         A30AlbProCod = P08DX2_A30AlbProCod[0] ;
         A407EmprNom = P08DX2_A407EmprNom[0] ;
         n407EmprNom = P08DX2_n407EmprNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08DX2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8DX2 = false ;
            A30AlbProCod = P08DX2_A30AlbProCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8DX2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV24Option = A396EmprCod ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV25Options.add(AV24Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8DX2 )
         {
            brk8DX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFEmprNom = AV20SearchTxt ;
      AV15TFEmprNom_Sel = "" ;
      AV54Ttrn12wwds_1_filterfulltext = AV49FilterFullText ;
      AV55Ttrn12wwds_2_tfemprcod = AV10TFEmprCod ;
      AV56Ttrn12wwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV57Ttrn12wwds_4_tfalbprocod = AV12TFAlbProCod ;
      AV58Ttrn12wwds_5_tfalbprocod_to = AV13TFAlbProCod_To ;
      AV59Ttrn12wwds_6_tfemprnom = AV14TFEmprNom ;
      AV60Ttrn12wwds_7_tfemprnom_sel = AV15TFEmprNom_Sel ;
      AV61Ttrn12wwds_8_tfalbpobscon = AV16TFAlbPObsCon ;
      AV62Ttrn12wwds_9_tfalbpobscon_to = AV17TFAlbPObsCon_To ;
      AV63Ttrn12wwds_10_tfalbproest = AV18TFAlbProEst ;
      AV64Ttrn12wwds_11_tfalbproest_to = AV19TFAlbProEst_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV54Ttrn12wwds_1_filterfulltext ,
                                           AV56Ttrn12wwds_3_tfemprcod_sel ,
                                           AV55Ttrn12wwds_2_tfemprcod ,
                                           Long.valueOf(AV57Ttrn12wwds_4_tfalbprocod) ,
                                           Long.valueOf(AV58Ttrn12wwds_5_tfalbprocod_to) ,
                                           AV60Ttrn12wwds_7_tfemprnom_sel ,
                                           AV59Ttrn12wwds_6_tfemprnom ,
                                           Byte.valueOf(AV61Ttrn12wwds_8_tfalbpobscon) ,
                                           Byte.valueOf(AV62Ttrn12wwds_9_tfalbpobscon_to) ,
                                           Byte.valueOf(AV63Ttrn12wwds_10_tfalbproest) ,
                                           Byte.valueOf(AV64Ttrn12wwds_11_tfalbproest_to) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A407EmprNom ,
                                           Byte.valueOf(A914AlbPObsCon) ,
                                           Byte.valueOf(A33AlbProEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn12wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn12wwds_1_filterfulltext), "%", "") ;
      lV55Ttrn12wwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV55Ttrn12wwds_2_tfemprcod), 3, "%") ;
      lV59Ttrn12wwds_6_tfemprnom = GXutil.padr( GXutil.rtrim( AV59Ttrn12wwds_6_tfemprnom), 30, "%") ;
      /* Using cursor P08DX3 */
      pr_default.execute(1, new Object[] {lV54Ttrn12wwds_1_filterfulltext, lV54Ttrn12wwds_1_filterfulltext, lV54Ttrn12wwds_1_filterfulltext, lV54Ttrn12wwds_1_filterfulltext, lV54Ttrn12wwds_1_filterfulltext, lV55Ttrn12wwds_2_tfemprcod, AV56Ttrn12wwds_3_tfemprcod_sel, Long.valueOf(AV57Ttrn12wwds_4_tfalbprocod), Long.valueOf(AV58Ttrn12wwds_5_tfalbprocod_to), lV59Ttrn12wwds_6_tfemprnom, AV60Ttrn12wwds_7_tfemprnom_sel, Byte.valueOf(AV61Ttrn12wwds_8_tfalbpobscon), Byte.valueOf(AV62Ttrn12wwds_9_tfalbpobscon_to), Byte.valueOf(AV63Ttrn12wwds_10_tfalbproest), Byte.valueOf(AV64Ttrn12wwds_11_tfalbproest_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8DX4 = false ;
         A407EmprNom = P08DX3_A407EmprNom[0] ;
         n407EmprNom = P08DX3_n407EmprNom[0] ;
         A33AlbProEst = P08DX3_A33AlbProEst[0] ;
         A914AlbPObsCon = P08DX3_A914AlbPObsCon[0] ;
         A30AlbProCod = P08DX3_A30AlbProCod[0] ;
         A396EmprCod = P08DX3_A396EmprCod[0] ;
         A407EmprNom = P08DX3_A407EmprNom[0] ;
         n407EmprNom = P08DX3_n407EmprNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08DX3_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk8DX4 = false ;
            A30AlbProCod = P08DX3_A30AlbProCod[0] ;
            A396EmprCod = P08DX3_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8DX4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV24Option = A407EmprNom ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8DX4 )
         {
            brk8DX4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttrn12wwgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = ttrn12wwgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = ttrn12wwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV49FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV14TFEmprNom = "" ;
      AV15TFEmprNom_Sel = "" ;
      A396EmprCod = "" ;
      AV54Ttrn12wwds_1_filterfulltext = "" ;
      AV55Ttrn12wwds_2_tfemprcod = "" ;
      AV56Ttrn12wwds_3_tfemprcod_sel = "" ;
      AV59Ttrn12wwds_6_tfemprnom = "" ;
      AV60Ttrn12wwds_7_tfemprnom_sel = "" ;
      scmdbuf = "" ;
      lV54Ttrn12wwds_1_filterfulltext = "" ;
      lV55Ttrn12wwds_2_tfemprcod = "" ;
      lV59Ttrn12wwds_6_tfemprnom = "" ;
      A407EmprNom = "" ;
      P08DX2_A396EmprCod = new String[] {""} ;
      P08DX2_A33AlbProEst = new byte[1] ;
      P08DX2_A914AlbPObsCon = new byte[1] ;
      P08DX2_A407EmprNom = new String[] {""} ;
      P08DX2_n407EmprNom = new boolean[] {false} ;
      P08DX2_A30AlbProCod = new long[1] ;
      AV24Option = "" ;
      AV27OptionDesc = "" ;
      P08DX3_A407EmprNom = new String[] {""} ;
      P08DX3_n407EmprNom = new boolean[] {false} ;
      P08DX3_A33AlbProEst = new byte[1] ;
      P08DX3_A914AlbPObsCon = new byte[1] ;
      P08DX3_A30AlbProCod = new long[1] ;
      P08DX3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn12wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08DX2_A396EmprCod, P08DX2_A33AlbProEst, P08DX2_A914AlbPObsCon, P08DX2_A407EmprNom, P08DX2_n407EmprNom, P08DX2_A30AlbProCod
            }
            , new Object[] {
            P08DX3_A407EmprNom, P08DX3_n407EmprNom, P08DX3_A33AlbProEst, P08DX3_A914AlbPObsCon, P08DX3_A30AlbProCod, P08DX3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFAlbPObsCon ;
   private byte AV17TFAlbPObsCon_To ;
   private byte AV18TFAlbProEst ;
   private byte AV19TFAlbProEst_To ;
   private byte AV61Ttrn12wwds_8_tfalbpobscon ;
   private byte AV62Ttrn12wwds_9_tfalbpobscon_to ;
   private byte AV63Ttrn12wwds_10_tfalbproest ;
   private byte AV64Ttrn12wwds_11_tfalbproest_to ;
   private byte A914AlbPObsCon ;
   private byte A33AlbProEst ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private long AV12TFAlbProCod ;
   private long AV13TFAlbProCod_To ;
   private long AV57Ttrn12wwds_4_tfalbprocod ;
   private long AV58Ttrn12wwds_5_tfalbprocod_to ;
   private long A30AlbProCod ;
   private long AV32count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV14TFEmprNom ;
   private String AV15TFEmprNom_Sel ;
   private String A396EmprCod ;
   private String AV55Ttrn12wwds_2_tfemprcod ;
   private String AV56Ttrn12wwds_3_tfemprcod_sel ;
   private String AV59Ttrn12wwds_6_tfemprnom ;
   private String AV60Ttrn12wwds_7_tfemprnom_sel ;
   private String scmdbuf ;
   private String lV55Ttrn12wwds_2_tfemprcod ;
   private String lV59Ttrn12wwds_6_tfemprnom ;
   private String A407EmprNom ;
   private boolean returnInSub ;
   private boolean brk8DX2 ;
   private boolean n407EmprNom ;
   private boolean brk8DX4 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV49FilterFullText ;
   private String AV54Ttrn12wwds_1_filterfulltext ;
   private String lV54Ttrn12wwds_1_filterfulltext ;
   private String AV24Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08DX2_A396EmprCod ;
   private byte[] P08DX2_A33AlbProEst ;
   private byte[] P08DX2_A914AlbPObsCon ;
   private String[] P08DX2_A407EmprNom ;
   private boolean[] P08DX2_n407EmprNom ;
   private long[] P08DX2_A30AlbProCod ;
   private String[] P08DX3_A407EmprNom ;
   private boolean[] P08DX3_n407EmprNom ;
   private byte[] P08DX3_A33AlbProEst ;
   private byte[] P08DX3_A914AlbPObsCon ;
   private long[] P08DX3_A30AlbProCod ;
   private String[] P08DX3_A396EmprCod ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class ttrn12wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Ttrn12wwds_1_filterfulltext ,
                                          String AV56Ttrn12wwds_3_tfemprcod_sel ,
                                          String AV55Ttrn12wwds_2_tfemprcod ,
                                          long AV57Ttrn12wwds_4_tfalbprocod ,
                                          long AV58Ttrn12wwds_5_tfalbprocod_to ,
                                          String AV60Ttrn12wwds_7_tfemprnom_sel ,
                                          String AV59Ttrn12wwds_6_tfemprnom ,
                                          byte AV61Ttrn12wwds_8_tfalbpobscon ,
                                          byte AV62Ttrn12wwds_9_tfalbpobscon_to ,
                                          byte AV63Ttrn12wwds_10_tfalbproest ,
                                          byte AV64Ttrn12wwds_11_tfalbproest_to ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          String A407EmprNom ,
                                          byte A914AlbPObsCon ,
                                          byte A33AlbProEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProEst, T1.AlbPObsCon, T2.EmprNom, T1.AlbProCod FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV54Ttrn12wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbProCod,'9999999990'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbPObsCon,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.AlbProEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Ttrn12wwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV55Ttrn12wwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Ttrn12wwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV57Ttrn12wwds_4_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV58Ttrn12wwds_5_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Ttrn12wwds_7_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Ttrn12wwds_6_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Ttrn12wwds_7_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Ttrn12wwds_8_tfalbpobscon) )
      {
         addWhere(sWhereString, "(T1.AlbPObsCon >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Ttrn12wwds_9_tfalbpobscon_to) )
      {
         addWhere(sWhereString, "(T1.AlbPObsCon <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Ttrn12wwds_10_tfalbproest) )
      {
         addWhere(sWhereString, "(T1.AlbProEst >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Ttrn12wwds_11_tfalbproest_to) )
      {
         addWhere(sWhereString, "(T1.AlbProEst <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08DX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Ttrn12wwds_1_filterfulltext ,
                                          String AV56Ttrn12wwds_3_tfemprcod_sel ,
                                          String AV55Ttrn12wwds_2_tfemprcod ,
                                          long AV57Ttrn12wwds_4_tfalbprocod ,
                                          long AV58Ttrn12wwds_5_tfalbprocod_to ,
                                          String AV60Ttrn12wwds_7_tfemprnom_sel ,
                                          String AV59Ttrn12wwds_6_tfemprnom ,
                                          byte AV61Ttrn12wwds_8_tfalbpobscon ,
                                          byte AV62Ttrn12wwds_9_tfalbpobscon_to ,
                                          byte AV63Ttrn12wwds_10_tfalbproest ,
                                          byte AV64Ttrn12wwds_11_tfalbproest_to ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          String A407EmprNom ,
                                          byte A914AlbPObsCon ,
                                          byte A33AlbProEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[15];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T1.AlbProEst, T1.AlbPObsCon, T1.AlbProCod, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV54Ttrn12wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbProCod,'9999999990'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbPObsCon,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.AlbProEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Ttrn12wwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV55Ttrn12wwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Ttrn12wwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV57Ttrn12wwds_4_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV58Ttrn12wwds_5_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Ttrn12wwds_7_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Ttrn12wwds_6_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Ttrn12wwds_7_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Ttrn12wwds_8_tfalbpobscon) )
      {
         addWhere(sWhereString, "(T1.AlbPObsCon >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Ttrn12wwds_9_tfalbpobscon_to) )
      {
         addWhere(sWhereString, "(T1.AlbPObsCon <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Ttrn12wwds_10_tfalbproest) )
      {
         addWhere(sWhereString, "(T1.AlbProEst >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Ttrn12wwds_11_tfalbproest_to) )
      {
         addWhere(sWhereString, "(T1.AlbProEst <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
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
                  return conditional_P08DX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() );
            case 1 :
                  return conditional_P08DX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               return;
      }
   }

}

