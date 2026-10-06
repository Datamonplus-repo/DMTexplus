package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranloaddvcombo extends GXProcedure
{
   public albaranloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranloaddvcombo.class ), "" );
   }

   public albaranloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             boolean aP2 ,
                             String aP3 ,
                             long aP4 ,
                             String aP5 ,
                             int aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      albaranloaddvcombo.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        boolean aP2 ,
                        String aP3 ,
                        long aP4 ,
                        String aP5 ,
                        int aP6 ,
                        String aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             boolean aP2 ,
                             String aP3 ,
                             long aP4 ,
                             String aP5 ,
                             int aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      albaranloaddvcombo.this.AV12ComboName = aP0;
      albaranloaddvcombo.this.AV13TrnMode = aP1;
      albaranloaddvcombo.this.AV21IsDynamicCall = aP2;
      albaranloaddvcombo.this.AV14EmprCod = aP3;
      albaranloaddvcombo.this.AV15AlbProCod = aP4;
      albaranloaddvcombo.this.AV26Cond_EmprCod = aP5;
      albaranloaddvcombo.this.AV25Cond_GuiRemCli = aP6;
      albaranloaddvcombo.this.AV20SearchTxt = aP7;
      albaranloaddvcombo.this.aP8 = aP8;
      albaranloaddvcombo.this.aP9 = aP9;
      albaranloaddvcombo.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      AV19MaxItems = 100 ;
      if ( GXutil.strcmp(AV12ComboName, "TrnCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TRNCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "GuiRemCli") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_GUIREMCLI' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "AlbDomEnv") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_ALBDOMENV' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "AlbDivCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_ALBDIVCOD' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADCOMBOITEMS_TRNCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09UQ2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09UQ2_A396EmprCod[0] ;
         A840TrnCod = P09UQ2_A840TrnCod[0] ;
         A841TrnNom = P09UQ2_A841TrnNom[0] ;
         n841TrnNom = P09UQ2_n841TrnNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A840TrnCod, 4, 0)), A841TrnNom, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      AV23Combo_DataJson = AV10Combo_Data.toJSonString(false) ;
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09UQ3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Long.valueOf(AV15AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A30AlbProCod = P09UQ3_A30AlbProCod[0] ;
            A396EmprCod = P09UQ3_A396EmprCod[0] ;
            A840TrnCod = P09UQ3_A840TrnCod[0] ;
            AV16SelectedValue = ((0==A840TrnCod) ? "" : GXutil.trim( GXutil.str( A840TrnCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_GUIREMCLI' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09UQ4 */
      pr_default.execute(2, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P09UQ4_A396EmprCod[0] ;
         A252CliCod = P09UQ4_A252CliCod[0] ;
         A279CliNom = P09UQ4_A279CliNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV10Combo_Data.sort("Title");
      AV23Combo_DataJson = AV10Combo_Data.toJSonString(false) ;
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09UQ5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Long.valueOf(AV15AlbProCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A30AlbProCod = P09UQ5_A30AlbProCod[0] ;
            A396EmprCod = P09UQ5_A396EmprCod[0] ;
            A1243GuiRemCli = P09UQ5_A1243GuiRemCli[0] ;
            AV16SelectedValue = ((0==A1243GuiRemCli) ? "" : GXutil.trim( GXutil.str( A1243GuiRemCli, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_ALBDOMENV' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      AV33GXLvl85 = (byte)(0) ;
      /* Using cursor P09UQ6 */
      pr_default.execute(4, new Object[] {AV26Cond_EmprCod, Integer.valueOf(AV25Cond_GuiRemCli)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A252CliCod = P09UQ6_A252CliCod[0] ;
         A396EmprCod = P09UQ6_A396EmprCod[0] ;
         A266CliEnvLin = P09UQ6_A266CliEnvLin[0] ;
         A268CliEnvPob = P09UQ6_A268CliEnvPob[0] ;
         A265CliEnvDom = P09UQ6_A265CliEnvDom[0] ;
         AV33GXLvl85 = (byte)(1) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A266CliEnvLin, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2 %3", GXutil.trim( GXutil.str( A266CliEnvLin, 1, 0)), A265CliEnvDom, A268CliEnvPob, "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV33GXLvl85 == 0 )
      {
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "0" );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( httpContext.getMessage( "Sin domicilio registrado", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
      }
      if ( AV21IsDynamicCall )
      {
         AV10Combo_Data.sort("Title");
         AV23Combo_DataJson = AV10Combo_Data.toJSonString(false) ;
      }
      else
      {
         if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
         {
            /* Using cursor P09UQ7 */
            pr_default.execute(5, new Object[] {AV14EmprCod, Long.valueOf(AV15AlbProCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A30AlbProCod = P09UQ7_A30AlbProCod[0] ;
               A396EmprCod = P09UQ7_A396EmprCod[0] ;
               A1259AlbDomEnv = P09UQ7_A1259AlbDomEnv[0] ;
               n1259AlbDomEnv = P09UQ7_n1259AlbDomEnv[0] ;
               AV16SelectedValue = ((0==A1259AlbDomEnv) ? "" : GXutil.trim( GXutil.str( A1259AlbDomEnv, 1, 0))) ;
               AV22SelectedText = AV16SelectedValue ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
         }
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_ALBDIVCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09UQ8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A3099DivCod = P09UQ8_A3099DivCod[0] ;
         A3100DivNom = P09UQ8_A3100DivNom[0] ;
         n3100DivNom = P09UQ8_n3100DivNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A3099DivCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A3099DivCod, 2, 0)), A3100DivNom, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV10Combo_Data.sort("Title");
      AV23Combo_DataJson = AV10Combo_Data.toJSonString(false) ;
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09UQ9 */
         pr_default.execute(7, new Object[] {AV14EmprCod, Long.valueOf(AV15AlbProCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A30AlbProCod = P09UQ9_A30AlbProCod[0] ;
            A396EmprCod = P09UQ9_A396EmprCod[0] ;
            A3108AlbDivCod = P09UQ9_A3108AlbDivCod[0] ;
            n3108AlbDivCod = P09UQ9_n3108AlbDivCod[0] ;
            AV16SelectedValue = ((0==A3108AlbDivCod) ? "" : GXutil.trim( GXutil.str( A3108AlbDivCod, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
   }

   protected void cleanup( )
   {
      this.aP8[0] = albaranloaddvcombo.this.AV16SelectedValue;
      this.aP9[0] = albaranloaddvcombo.this.AV22SelectedText;
      this.aP10[0] = albaranloaddvcombo.this.AV23Combo_DataJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16SelectedValue = "" ;
      AV22SelectedText = "" ;
      AV23Combo_DataJson = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      scmdbuf = "" ;
      P09UQ2_A396EmprCod = new String[] {""} ;
      P09UQ2_A840TrnCod = new short[1] ;
      P09UQ2_A841TrnNom = new String[] {""} ;
      P09UQ2_n841TrnNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A841TrnNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09UQ3_A30AlbProCod = new long[1] ;
      P09UQ3_A396EmprCod = new String[] {""} ;
      P09UQ3_A840TrnCod = new short[1] ;
      P09UQ4_A396EmprCod = new String[] {""} ;
      P09UQ4_A252CliCod = new int[1] ;
      P09UQ4_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      P09UQ5_A30AlbProCod = new long[1] ;
      P09UQ5_A396EmprCod = new String[] {""} ;
      P09UQ5_A1243GuiRemCli = new int[1] ;
      A265CliEnvDom = "" ;
      A268CliEnvPob = "" ;
      P09UQ6_A252CliCod = new int[1] ;
      P09UQ6_A396EmprCod = new String[] {""} ;
      P09UQ6_A266CliEnvLin = new byte[1] ;
      P09UQ6_A268CliEnvPob = new String[] {""} ;
      P09UQ6_A265CliEnvDom = new String[] {""} ;
      P09UQ7_A30AlbProCod = new long[1] ;
      P09UQ7_A396EmprCod = new String[] {""} ;
      P09UQ7_A1259AlbDomEnv = new byte[1] ;
      P09UQ7_n1259AlbDomEnv = new boolean[] {false} ;
      P09UQ8_A3099DivCod = new byte[1] ;
      P09UQ8_A3100DivNom = new String[] {""} ;
      P09UQ8_n3100DivNom = new boolean[] {false} ;
      A3100DivNom = "" ;
      P09UQ9_A30AlbProCod = new long[1] ;
      P09UQ9_A396EmprCod = new String[] {""} ;
      P09UQ9_A3108AlbDivCod = new byte[1] ;
      P09UQ9_n3108AlbDivCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09UQ2_A396EmprCod, P09UQ2_A840TrnCod, P09UQ2_A841TrnNom, P09UQ2_n841TrnNom
            }
            , new Object[] {
            P09UQ3_A30AlbProCod, P09UQ3_A396EmprCod, P09UQ3_A840TrnCod
            }
            , new Object[] {
            P09UQ4_A396EmprCod, P09UQ4_A252CliCod, P09UQ4_A279CliNom
            }
            , new Object[] {
            P09UQ5_A30AlbProCod, P09UQ5_A396EmprCod, P09UQ5_A1243GuiRemCli
            }
            , new Object[] {
            P09UQ6_A252CliCod, P09UQ6_A396EmprCod, P09UQ6_A266CliEnvLin, P09UQ6_A268CliEnvPob, P09UQ6_A265CliEnvDom
            }
            , new Object[] {
            P09UQ7_A30AlbProCod, P09UQ7_A396EmprCod, P09UQ7_A1259AlbDomEnv, P09UQ7_n1259AlbDomEnv
            }
            , new Object[] {
            P09UQ8_A3099DivCod, P09UQ8_A3100DivNom, P09UQ8_n3100DivNom
            }
            , new Object[] {
            P09UQ9_A30AlbProCod, P09UQ9_A396EmprCod, P09UQ9_A3108AlbDivCod, P09UQ9_n3108AlbDivCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A266CliEnvLin ;
   private byte AV33GXLvl85 ;
   private byte A1259AlbDomEnv ;
   private byte A3099DivCod ;
   private byte A3108AlbDivCod ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV25Cond_GuiRemCli ;
   private int AV19MaxItems ;
   private int A252CliCod ;
   private int A1243GuiRemCli ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV26Cond_EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A841TrnNom ;
   private String A279CliNom ;
   private String A265CliEnvDom ;
   private String A268CliEnvPob ;
   private String A3100DivNom ;
   private boolean AV21IsDynamicCall ;
   private boolean returnInSub ;
   private boolean n841TrnNom ;
   private boolean n1259AlbDomEnv ;
   private boolean n3100DivNom ;
   private boolean n3108AlbDivCod ;
   private String AV23Combo_DataJson ;
   private String AV12ComboName ;
   private String AV20SearchTxt ;
   private String AV16SelectedValue ;
   private String AV22SelectedText ;
   private String[] aP10 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P09UQ2_A396EmprCod ;
   private short[] P09UQ2_A840TrnCod ;
   private String[] P09UQ2_A841TrnNom ;
   private boolean[] P09UQ2_n841TrnNom ;
   private long[] P09UQ3_A30AlbProCod ;
   private String[] P09UQ3_A396EmprCod ;
   private short[] P09UQ3_A840TrnCod ;
   private String[] P09UQ4_A396EmprCod ;
   private int[] P09UQ4_A252CliCod ;
   private String[] P09UQ4_A279CliNom ;
   private long[] P09UQ5_A30AlbProCod ;
   private String[] P09UQ5_A396EmprCod ;
   private int[] P09UQ5_A1243GuiRemCli ;
   private int[] P09UQ6_A252CliCod ;
   private String[] P09UQ6_A396EmprCod ;
   private byte[] P09UQ6_A266CliEnvLin ;
   private String[] P09UQ6_A268CliEnvPob ;
   private String[] P09UQ6_A265CliEnvDom ;
   private long[] P09UQ7_A30AlbProCod ;
   private String[] P09UQ7_A396EmprCod ;
   private byte[] P09UQ7_A1259AlbDomEnv ;
   private boolean[] P09UQ7_n1259AlbDomEnv ;
   private byte[] P09UQ8_A3099DivCod ;
   private String[] P09UQ8_A3100DivNom ;
   private boolean[] P09UQ8_n3100DivNom ;
   private long[] P09UQ9_A30AlbProCod ;
   private String[] P09UQ9_A396EmprCod ;
   private byte[] P09UQ9_A3108AlbDivCod ;
   private boolean[] P09UQ9_n3108AlbDivCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class albaranloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UQ2", "SELECT EmprCod, TrnCod, TrnNom FROM TXPTRANSP WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UQ3", "SELECT AlbProCod, EmprCod, TrnCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09UQ4", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UQ5", "SELECT AlbProCod, EmprCod, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09UQ6", "SELECT CliCod, EmprCod, CliEnvLin, CliEnvPob, CliEnvDom FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UQ7", "SELECT AlbProCod, EmprCod, AlbDomEnv FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09UQ8", "SELECT DivCod, DivNom FROM TXPDIVISA ORDER BY DivCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UQ9", "SELECT AlbProCod, EmprCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

