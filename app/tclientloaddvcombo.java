package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclientloaddvcombo extends GXProcedure
{
   public tclientloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclientloaddvcombo.class ), "" );
   }

   public tclientloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String[] aP4 )
   {
      tclientloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tclientloaddvcombo.this.AV12ComboName = aP0;
      tclientloaddvcombo.this.AV13TrnMode = aP1;
      tclientloaddvcombo.this.AV14EmprCod = aP2;
      tclientloaddvcombo.this.AV15CliCod = aP3;
      tclientloaddvcombo.this.aP4 = aP4;
      tclientloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "CliTrnCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLITRNCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "TpOpC") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TPOPC' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "Cod_pais") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_COD_PAIS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "ZonGeoCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_ZONGEOCOD' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "PrvCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRVCOD' */
         S151 ();
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
      /* 'LOADCOMBOITEMS_CLITRNCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A4A2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A4A2_A396EmprCod[0] ;
         A840TrnCod = P0A4A2_A840TrnCod[0] ;
         A841TrnNom = P0A4A2_A841TrnNom[0] ;
         n841TrnNom = P0A4A2_n841TrnNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A840TrnCod, 4, 0)), A841TrnNom, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A4A3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P0A4A3_A252CliCod[0] ;
            A396EmprCod = P0A4A3_A396EmprCod[0] ;
            A3631CliTrnCod = P0A4A3_A3631CliTrnCod[0] ;
            AV16SelectedValue = ((0==A3631CliTrnCod) ? "" : GXutil.trim( GXutil.str( A3631CliTrnCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_TPOPC' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A4A4 */
      pr_default.execute(2, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P0A4A4_A396EmprCod[0] ;
         A11180TpOpC = P0A4A4_A11180TpOpC[0] ;
         n11180TpOpC = P0A4A4_n11180TpOpC[0] ;
         A11181TpOpD = P0A4A4_A11181TpOpD[0] ;
         n11181TpOpD = P0A4A4_n11181TpOpD[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11180TpOpC, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A11180TpOpC, 4, 0)), A11181TpOpD, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A4A5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15CliCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A252CliCod = P0A4A5_A252CliCod[0] ;
            A396EmprCod = P0A4A5_A396EmprCod[0] ;
            A11180TpOpC = P0A4A5_A11180TpOpC[0] ;
            n11180TpOpC = P0A4A5_n11180TpOpC[0] ;
            AV16SelectedValue = ((0==A11180TpOpC) ? "" : GXutil.trim( GXutil.str( A11180TpOpC, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_COD_PAIS' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A4A6 */
      pr_default.execute(4, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P0A4A6_A396EmprCod[0] ;
         A10301Cod_pais = P0A4A6_A10301Cod_pais[0] ;
         n10301Cod_pais = P0A4A6_n10301Cod_pais[0] ;
         A10302Dsc_pais = P0A4A6_A10302Dsc_pais[0] ;
         n10302Dsc_pais = P0A4A6_n10302Dsc_pais[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A10301Cod_pais, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A10301Cod_pais, 4, 0)), A10302Dsc_pais, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A4A7 */
         pr_default.execute(5, new Object[] {AV14EmprCod, Integer.valueOf(AV15CliCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A252CliCod = P0A4A7_A252CliCod[0] ;
            A396EmprCod = P0A4A7_A396EmprCod[0] ;
            A10301Cod_pais = P0A4A7_A10301Cod_pais[0] ;
            n10301Cod_pais = P0A4A7_n10301Cod_pais[0] ;
            AV16SelectedValue = ((0==A10301Cod_pais) ? "" : GXutil.trim( GXutil.str( A10301Cod_pais, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_ZONGEOCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A4A8 */
      pr_default.execute(6, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A396EmprCod = P0A4A8_A396EmprCod[0] ;
         A858ZonGeoCod = P0A4A8_A858ZonGeoCod[0] ;
         A1360ZonGeoNom = P0A4A8_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = P0A4A8_n1360ZonGeoNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A858ZonGeoCod, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A858ZonGeoCod, 3, 0)), A1360ZonGeoNom, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A4A9 */
         pr_default.execute(7, new Object[] {AV14EmprCod, Integer.valueOf(AV15CliCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A252CliCod = P0A4A9_A252CliCod[0] ;
            A396EmprCod = P0A4A9_A396EmprCod[0] ;
            A858ZonGeoCod = P0A4A9_A858ZonGeoCod[0] ;
            AV16SelectedValue = ((0==A858ZonGeoCod) ? "" : GXutil.trim( GXutil.str( A858ZonGeoCod, 3, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_PRVCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A4A10 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A781PrvCod = P0A4A10_A781PrvCod[0] ;
         A787PrvDsc = P0A4A10_A787PrvDsc[0] ;
         n787PrvDsc = P0A4A10_n787PrvDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A781PrvCod, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A781PrvCod, 3, 0)), A787PrvDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A4A11 */
         pr_default.execute(9, new Object[] {AV14EmprCod, Integer.valueOf(AV15CliCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A252CliCod = P0A4A11_A252CliCod[0] ;
            A396EmprCod = P0A4A11_A396EmprCod[0] ;
            A781PrvCod = P0A4A11_A781PrvCod[0] ;
            AV16SelectedValue = ((0==A781PrvCod) ? "" : GXutil.trim( GXutil.str( A781PrvCod, 3, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tclientloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tclientloaddvcombo.this.AV10Combo_Data;
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
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0A4A2_A396EmprCod = new String[] {""} ;
      P0A4A2_A840TrnCod = new short[1] ;
      P0A4A2_A841TrnNom = new String[] {""} ;
      P0A4A2_n841TrnNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A841TrnNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A4A3_A252CliCod = new int[1] ;
      P0A4A3_A396EmprCod = new String[] {""} ;
      P0A4A3_A3631CliTrnCod = new short[1] ;
      P0A4A4_A396EmprCod = new String[] {""} ;
      P0A4A4_A11180TpOpC = new short[1] ;
      P0A4A4_n11180TpOpC = new boolean[] {false} ;
      P0A4A4_A11181TpOpD = new String[] {""} ;
      P0A4A4_n11181TpOpD = new boolean[] {false} ;
      A11181TpOpD = "" ;
      P0A4A5_A252CliCod = new int[1] ;
      P0A4A5_A396EmprCod = new String[] {""} ;
      P0A4A5_A11180TpOpC = new short[1] ;
      P0A4A5_n11180TpOpC = new boolean[] {false} ;
      P0A4A6_A396EmprCod = new String[] {""} ;
      P0A4A6_A10301Cod_pais = new short[1] ;
      P0A4A6_n10301Cod_pais = new boolean[] {false} ;
      P0A4A6_A10302Dsc_pais = new String[] {""} ;
      P0A4A6_n10302Dsc_pais = new boolean[] {false} ;
      A10302Dsc_pais = "" ;
      P0A4A7_A252CliCod = new int[1] ;
      P0A4A7_A396EmprCod = new String[] {""} ;
      P0A4A7_A10301Cod_pais = new short[1] ;
      P0A4A7_n10301Cod_pais = new boolean[] {false} ;
      P0A4A8_A396EmprCod = new String[] {""} ;
      P0A4A8_A858ZonGeoCod = new short[1] ;
      P0A4A8_A1360ZonGeoNom = new String[] {""} ;
      P0A4A8_n1360ZonGeoNom = new boolean[] {false} ;
      A1360ZonGeoNom = "" ;
      P0A4A9_A252CliCod = new int[1] ;
      P0A4A9_A396EmprCod = new String[] {""} ;
      P0A4A9_A858ZonGeoCod = new short[1] ;
      P0A4A10_A781PrvCod = new short[1] ;
      P0A4A10_A787PrvDsc = new String[] {""} ;
      P0A4A10_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      P0A4A11_A252CliCod = new int[1] ;
      P0A4A11_A396EmprCod = new String[] {""} ;
      P0A4A11_A781PrvCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclientloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A4A2_A396EmprCod, P0A4A2_A840TrnCod, P0A4A2_A841TrnNom, P0A4A2_n841TrnNom
            }
            , new Object[] {
            P0A4A3_A252CliCod, P0A4A3_A396EmprCod, P0A4A3_A3631CliTrnCod
            }
            , new Object[] {
            P0A4A4_A396EmprCod, P0A4A4_A11180TpOpC, P0A4A4_A11181TpOpD, P0A4A4_n11181TpOpD
            }
            , new Object[] {
            P0A4A5_A252CliCod, P0A4A5_A396EmprCod, P0A4A5_A11180TpOpC, P0A4A5_n11180TpOpC
            }
            , new Object[] {
            P0A4A6_A396EmprCod, P0A4A6_A10301Cod_pais, P0A4A6_A10302Dsc_pais, P0A4A6_n10302Dsc_pais
            }
            , new Object[] {
            P0A4A7_A252CliCod, P0A4A7_A396EmprCod, P0A4A7_A10301Cod_pais, P0A4A7_n10301Cod_pais
            }
            , new Object[] {
            P0A4A8_A396EmprCod, P0A4A8_A858ZonGeoCod, P0A4A8_A1360ZonGeoNom, P0A4A8_n1360ZonGeoNom
            }
            , new Object[] {
            P0A4A9_A252CliCod, P0A4A9_A396EmprCod, P0A4A9_A858ZonGeoCod
            }
            , new Object[] {
            P0A4A10_A781PrvCod, P0A4A10_A787PrvDsc, P0A4A10_n787PrvDsc
            }
            , new Object[] {
            P0A4A11_A252CliCod, P0A4A11_A396EmprCod, P0A4A11_A781PrvCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A840TrnCod ;
   private short A3631CliTrnCod ;
   private short A11180TpOpC ;
   private short A10301Cod_pais ;
   private short A858ZonGeoCod ;
   private short A781PrvCod ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int A252CliCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A841TrnNom ;
   private String A11181TpOpD ;
   private String A10302Dsc_pais ;
   private String A1360ZonGeoNom ;
   private String A787PrvDsc ;
   private boolean returnInSub ;
   private boolean n841TrnNom ;
   private boolean n11180TpOpC ;
   private boolean n11181TpOpD ;
   private boolean n10301Cod_pais ;
   private boolean n10302Dsc_pais ;
   private boolean n1360ZonGeoNom ;
   private boolean n787PrvDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A4A2_A396EmprCod ;
   private short[] P0A4A2_A840TrnCod ;
   private String[] P0A4A2_A841TrnNom ;
   private boolean[] P0A4A2_n841TrnNom ;
   private int[] P0A4A3_A252CliCod ;
   private String[] P0A4A3_A396EmprCod ;
   private short[] P0A4A3_A3631CliTrnCod ;
   private String[] P0A4A4_A396EmprCod ;
   private short[] P0A4A4_A11180TpOpC ;
   private boolean[] P0A4A4_n11180TpOpC ;
   private String[] P0A4A4_A11181TpOpD ;
   private boolean[] P0A4A4_n11181TpOpD ;
   private int[] P0A4A5_A252CliCod ;
   private String[] P0A4A5_A396EmprCod ;
   private short[] P0A4A5_A11180TpOpC ;
   private boolean[] P0A4A5_n11180TpOpC ;
   private String[] P0A4A6_A396EmprCod ;
   private short[] P0A4A6_A10301Cod_pais ;
   private boolean[] P0A4A6_n10301Cod_pais ;
   private String[] P0A4A6_A10302Dsc_pais ;
   private boolean[] P0A4A6_n10302Dsc_pais ;
   private int[] P0A4A7_A252CliCod ;
   private String[] P0A4A7_A396EmprCod ;
   private short[] P0A4A7_A10301Cod_pais ;
   private boolean[] P0A4A7_n10301Cod_pais ;
   private String[] P0A4A8_A396EmprCod ;
   private short[] P0A4A8_A858ZonGeoCod ;
   private String[] P0A4A8_A1360ZonGeoNom ;
   private boolean[] P0A4A8_n1360ZonGeoNom ;
   private int[] P0A4A9_A252CliCod ;
   private String[] P0A4A9_A396EmprCod ;
   private short[] P0A4A9_A858ZonGeoCod ;
   private short[] P0A4A10_A781PrvCod ;
   private String[] P0A4A10_A787PrvDsc ;
   private boolean[] P0A4A10_n787PrvDsc ;
   private int[] P0A4A11_A252CliCod ;
   private String[] P0A4A11_A396EmprCod ;
   private short[] P0A4A11_A781PrvCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tclientloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A4A2", "SELECT EmprCod, TrnCod, TrnNom FROM TXPTRANSP WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A4A3", "SELECT CliCod, EmprCod, CliTrnCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A4A4", "SELECT EmprCod, TpOpC, TpOpD FROM TXPOPASEN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A4A5", "SELECT CliCod, EmprCod, TpOpC FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A4A6", "SELECT EmprCod, Cod_pais, Dsc_pais FROM TXPTR0400 WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A4A7", "SELECT CliCod, EmprCod, Cod_pais FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A4A8", "SELECT EmprCod, ZonGeoCod, ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A4A9", "SELECT CliCod, EmprCod, ZonGeoCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A4A10", "SELECT PrvCod, PrvDsc FROM TXPPROVIN ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A4A11", "SELECT CliCod, EmprCod, PrvCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

