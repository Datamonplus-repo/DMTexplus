package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordenloaddvcombo extends GXProcedure
{
   public tmordenloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordenloaddvcombo.class ), "" );
   }

   public tmordenloaddvcombo( int remoteHandle ,
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
      tmordenloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tmordenloaddvcombo.this.AV12ComboName = aP0;
      tmordenloaddvcombo.this.AV13TrnMode = aP1;
      tmordenloaddvcombo.this.AV14EmprCod = aP2;
      tmordenloaddvcombo.this.AV15OMCod = aP3;
      tmordenloaddvcombo.this.aP4 = aP4;
      tmordenloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "TMCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TMCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "OMTipoId") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_OMTIPOID' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "OMMaqCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_OMMAQCOD' */
         S131 ();
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
      /* 'LOADCOMBOITEMS_TMCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A632 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A632_A396EmprCod[0] ;
         A9431TMDsc = P0A632_A9431TMDsc[0] ;
         n9431TMDsc = P0A632_n9431TMDsc[0] ;
         A9430TMCod = P0A632_A9430TMCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A9430TMCod, 8, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A9430TMCod), "ZZZZZZZ9"))+"-"+GXutil.trim( A9431TMDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_OMTIPOID' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A633 */
      pr_default.execute(1, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P0A633_A396EmprCod[0] ;
         A14272PMTipoDsc = P0A633_A14272PMTipoDsc[0] ;
         A14271PMTipoID = P0A633_A14271PMTipoID[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A14271PMTipoID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A14271PMTipoID), "ZZZ9"))+"-"+GXutil.trim( A14272PMTipoDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A634 */
         pr_default.execute(2, new Object[] {AV14EmprCod, Integer.valueOf(AV15OMCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9425OMCod = P0A634_A9425OMCod[0] ;
            A396EmprCod = P0A634_A396EmprCod[0] ;
            A14492OMTipoId = P0A634_A14492OMTipoId[0] ;
            n14492OMTipoId = P0A634_n14492OMTipoId[0] ;
            AV16SelectedValue = ((0==A14492OMTipoId) ? "" : GXutil.trim( GXutil.str( A14492OMTipoId, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_OMMAQCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A635 */
      pr_default.execute(3, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A607MaqEst = P0A635_A607MaqEst[0] ;
         n607MaqEst = P0A635_n607MaqEst[0] ;
         A396EmprCod = P0A635_A396EmprCod[0] ;
         A606MaqDsc = P0A635_A606MaqDsc[0] ;
         n606MaqDsc = P0A635_n606MaqDsc[0] ;
         A602MaqCod = P0A635_A602MaqCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A606MaqDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A636 */
         pr_default.execute(4, new Object[] {AV14EmprCod, Integer.valueOf(AV15OMCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A9425OMCod = P0A636_A9425OMCod[0] ;
            A396EmprCod = P0A636_A396EmprCod[0] ;
            A9426OMMaqCod = P0A636_A9426OMMaqCod[0] ;
            AV16SelectedValue = A9426OMMaqCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_OMMEQUCOD' Routine */
      returnInSub = false ;
      AV22OMMaqCod = AV23WebSession.getValue("&OMMaqCod") ;
      AV10Combo_Data.clear();
      /* Using cursor P0A637 */
      pr_default.execute(5, new Object[] {AV14EmprCod, AV22OMMaqCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A11437MaqPieShw = P0A637_A11437MaqPieShw[0] ;
         A602MaqCod = P0A637_A602MaqCod[0] ;
         A396EmprCod = P0A637_A396EmprCod[0] ;
         A11435MaqEquDsc = P0A637_A11435MaqEquDsc[0] ;
         A11438MaqEquCod = P0A637_A11438MaqEquCod[0] ;
         A11439MaqSEqCod = P0A637_A11439MaqSEqCod[0] ;
         A11440MaqPieCod = P0A637_A11440MaqPieCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11438MaqEquCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A11438MaqEquCod)+"-"+GXutil.trim( A11435MaqEquDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV23WebSession.remove("&OMMaqCod");
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_OMMSEQCOD' Routine */
      returnInSub = false ;
      AV22OMMaqCod = AV23WebSession.getValue("&OMMaqCod") ;
      AV24OMMEquCod = AV23WebSession.getValue("&OMMEquCod") ;
      AV10Combo_Data.clear();
      /* Using cursor P0A638 */
      pr_default.execute(6, new Object[] {AV14EmprCod, AV22OMMaqCod, AV24OMMEquCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A11437MaqPieShw = P0A638_A11437MaqPieShw[0] ;
         A11438MaqEquCod = P0A638_A11438MaqEquCod[0] ;
         A602MaqCod = P0A638_A602MaqCod[0] ;
         A396EmprCod = P0A638_A396EmprCod[0] ;
         A11441MaqSEqDsc = P0A638_A11441MaqSEqDsc[0] ;
         A11439MaqSEqCod = P0A638_A11439MaqSEqCod[0] ;
         A11440MaqPieCod = P0A638_A11440MaqPieCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11439MaqSEqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A11439MaqSEqCod)+"-"+GXutil.trim( A11441MaqSEqDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV23WebSession.remove("&OMMaqCod");
      AV23WebSession.remove("&OMMEquCod");
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_OMMPIECOD' Routine */
      returnInSub = false ;
      AV22OMMaqCod = AV23WebSession.getValue("&OMMaqCod") ;
      AV24OMMEquCod = AV23WebSession.getValue("&OMMEquCod") ;
      AV26OMMSEqCod = AV23WebSession.getValue("&OMMSEqCod") ;
      AV10Combo_Data.clear();
      AV36GXLvl158 = (byte)(0) ;
      /* Using cursor P0A639 */
      pr_default.execute(7, new Object[] {AV14EmprCod, AV22OMMaqCod, AV24OMMEquCod, AV26OMMSEqCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A11437MaqPieShw = P0A639_A11437MaqPieShw[0] ;
         A11439MaqSEqCod = P0A639_A11439MaqSEqCod[0] ;
         A11438MaqEquCod = P0A639_A11438MaqEquCod[0] ;
         A602MaqCod = P0A639_A602MaqCod[0] ;
         A396EmprCod = P0A639_A396EmprCod[0] ;
         A11436MaqPieDsc = P0A639_A11436MaqPieDsc[0] ;
         n11436MaqPieDsc = P0A639_n11436MaqPieDsc[0] ;
         A11440MaqPieCod = P0A639_A11440MaqPieCod[0] ;
         AV36GXLvl158 = (byte)(1) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11440MaqPieCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A11440MaqPieCod)+"-"+GXutil.trim( A11436MaqPieDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      if ( AV36GXLvl158 == 0 )
      {
      }
      AV23WebSession.remove("&OMMaqCod");
      AV23WebSession.remove("&OMMEquCod");
      AV23WebSession.remove("&OMMSEqCod");
   }

   protected void cleanup( )
   {
      this.aP4[0] = tmordenloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tmordenloaddvcombo.this.AV10Combo_Data;
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
      P0A632_A396EmprCod = new String[] {""} ;
      P0A632_A9431TMDsc = new String[] {""} ;
      P0A632_n9431TMDsc = new boolean[] {false} ;
      P0A632_A9430TMCod = new int[1] ;
      A396EmprCod = "" ;
      A9431TMDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A633_A396EmprCod = new String[] {""} ;
      P0A633_A14272PMTipoDsc = new String[] {""} ;
      P0A633_A14271PMTipoID = new short[1] ;
      A14272PMTipoDsc = "" ;
      P0A634_A9425OMCod = new int[1] ;
      P0A634_A396EmprCod = new String[] {""} ;
      P0A634_A14492OMTipoId = new short[1] ;
      P0A634_n14492OMTipoId = new boolean[] {false} ;
      P0A635_A607MaqEst = new String[] {""} ;
      P0A635_n607MaqEst = new boolean[] {false} ;
      P0A635_A396EmprCod = new String[] {""} ;
      P0A635_A606MaqDsc = new String[] {""} ;
      P0A635_n606MaqDsc = new boolean[] {false} ;
      P0A635_A602MaqCod = new String[] {""} ;
      A607MaqEst = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      P0A636_A9425OMCod = new int[1] ;
      P0A636_A396EmprCod = new String[] {""} ;
      P0A636_A9426OMMaqCod = new String[] {""} ;
      A9426OMMaqCod = "" ;
      AV22OMMaqCod = "" ;
      AV23WebSession = httpContext.getWebSession();
      P0A637_A11437MaqPieShw = new byte[1] ;
      P0A637_A602MaqCod = new String[] {""} ;
      P0A637_A396EmprCod = new String[] {""} ;
      P0A637_A11435MaqEquDsc = new String[] {""} ;
      P0A637_A11438MaqEquCod = new String[] {""} ;
      P0A637_A11439MaqSEqCod = new String[] {""} ;
      P0A637_A11440MaqPieCod = new String[] {""} ;
      A11435MaqEquDsc = "" ;
      A11438MaqEquCod = "" ;
      A11439MaqSEqCod = "" ;
      A11440MaqPieCod = "" ;
      AV24OMMEquCod = "" ;
      P0A638_A11437MaqPieShw = new byte[1] ;
      P0A638_A11438MaqEquCod = new String[] {""} ;
      P0A638_A602MaqCod = new String[] {""} ;
      P0A638_A396EmprCod = new String[] {""} ;
      P0A638_A11441MaqSEqDsc = new String[] {""} ;
      P0A638_A11439MaqSEqCod = new String[] {""} ;
      P0A638_A11440MaqPieCod = new String[] {""} ;
      A11441MaqSEqDsc = "" ;
      A11436MaqPieDsc = "" ;
      AV26OMMSEqCod = "" ;
      P0A639_A11437MaqPieShw = new byte[1] ;
      P0A639_A11439MaqSEqCod = new String[] {""} ;
      P0A639_A11438MaqEquCod = new String[] {""} ;
      P0A639_A602MaqCod = new String[] {""} ;
      P0A639_A396EmprCod = new String[] {""} ;
      P0A639_A11436MaqPieDsc = new String[] {""} ;
      P0A639_n11436MaqPieDsc = new boolean[] {false} ;
      P0A639_A11440MaqPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordenloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A632_A396EmprCod, P0A632_A9431TMDsc, P0A632_n9431TMDsc, P0A632_A9430TMCod
            }
            , new Object[] {
            P0A633_A396EmprCod, P0A633_A14272PMTipoDsc, P0A633_A14271PMTipoID
            }
            , new Object[] {
            P0A634_A9425OMCod, P0A634_A396EmprCod, P0A634_A14492OMTipoId, P0A634_n14492OMTipoId
            }
            , new Object[] {
            P0A635_A607MaqEst, P0A635_n607MaqEst, P0A635_A396EmprCod, P0A635_A606MaqDsc, P0A635_n606MaqDsc, P0A635_A602MaqCod
            }
            , new Object[] {
            P0A636_A9425OMCod, P0A636_A396EmprCod, P0A636_A9426OMMaqCod
            }
            , new Object[] {
            P0A637_A11437MaqPieShw, P0A637_A602MaqCod, P0A637_A396EmprCod, P0A637_A11435MaqEquDsc, P0A637_A11438MaqEquCod, P0A637_A11439MaqSEqCod, P0A637_A11440MaqPieCod
            }
            , new Object[] {
            P0A638_A11437MaqPieShw, P0A638_A11438MaqEquCod, P0A638_A602MaqCod, P0A638_A396EmprCod, P0A638_A11441MaqSEqDsc, P0A638_A11439MaqSEqCod, P0A638_A11440MaqPieCod
            }
            , new Object[] {
            P0A639_A11437MaqPieShw, P0A639_A11439MaqSEqCod, P0A639_A11438MaqEquCod, P0A639_A602MaqCod, P0A639_A396EmprCod, P0A639_A11436MaqPieDsc, P0A639_n11436MaqPieDsc, P0A639_A11440MaqPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11437MaqPieShw ;
   private byte AV36GXLvl158 ;
   private short A14271PMTipoID ;
   private short A14492OMTipoId ;
   private short Gx_err ;
   private int AV15OMCod ;
   private int A9430TMCod ;
   private int A9425OMCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9431TMDsc ;
   private String A14272PMTipoDsc ;
   private String A607MaqEst ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String A9426OMMaqCod ;
   private String AV22OMMaqCod ;
   private String A11435MaqEquDsc ;
   private String A11438MaqEquCod ;
   private String A11439MaqSEqCod ;
   private String A11440MaqPieCod ;
   private String AV24OMMEquCod ;
   private String A11441MaqSEqDsc ;
   private String A11436MaqPieDsc ;
   private String AV26OMMSEqCod ;
   private boolean returnInSub ;
   private boolean n9431TMDsc ;
   private boolean n14492OMTipoId ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private boolean n11436MaqPieDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A632_A396EmprCod ;
   private String[] P0A632_A9431TMDsc ;
   private boolean[] P0A632_n9431TMDsc ;
   private int[] P0A632_A9430TMCod ;
   private String[] P0A633_A396EmprCod ;
   private String[] P0A633_A14272PMTipoDsc ;
   private short[] P0A633_A14271PMTipoID ;
   private int[] P0A634_A9425OMCod ;
   private String[] P0A634_A396EmprCod ;
   private short[] P0A634_A14492OMTipoId ;
   private boolean[] P0A634_n14492OMTipoId ;
   private String[] P0A635_A607MaqEst ;
   private boolean[] P0A635_n607MaqEst ;
   private String[] P0A635_A396EmprCod ;
   private String[] P0A635_A606MaqDsc ;
   private boolean[] P0A635_n606MaqDsc ;
   private String[] P0A635_A602MaqCod ;
   private int[] P0A636_A9425OMCod ;
   private String[] P0A636_A396EmprCod ;
   private String[] P0A636_A9426OMMaqCod ;
   private byte[] P0A637_A11437MaqPieShw ;
   private String[] P0A637_A602MaqCod ;
   private String[] P0A637_A396EmprCod ;
   private String[] P0A637_A11435MaqEquDsc ;
   private String[] P0A637_A11438MaqEquCod ;
   private String[] P0A637_A11439MaqSEqCod ;
   private String[] P0A637_A11440MaqPieCod ;
   private byte[] P0A638_A11437MaqPieShw ;
   private String[] P0A638_A11438MaqEquCod ;
   private String[] P0A638_A602MaqCod ;
   private String[] P0A638_A396EmprCod ;
   private String[] P0A638_A11441MaqSEqDsc ;
   private String[] P0A638_A11439MaqSEqCod ;
   private String[] P0A638_A11440MaqPieCod ;
   private byte[] P0A639_A11437MaqPieShw ;
   private String[] P0A639_A11439MaqSEqCod ;
   private String[] P0A639_A11438MaqEquCod ;
   private String[] P0A639_A602MaqCod ;
   private String[] P0A639_A396EmprCod ;
   private String[] P0A639_A11436MaqPieDsc ;
   private boolean[] P0A639_n11436MaqPieDsc ;
   private String[] P0A639_A11440MaqPieCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmordenloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A632", "SELECT EmprCod, TMDsc, TMCod FROM TXPMTAREA WHERE EmprCod = ? ORDER BY EmprCod, TMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A633", "SELECT EmprCod, PMTipoDsc, PMTipoID FROM TXPTIPPRV WHERE EmprCod = ? ORDER BY EmprCod, PMTipoID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A634", "SELECT OMCod, EmprCod, OMTipoId FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A635", "SELECT MaqEst, EmprCod, MaqDsc, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqEst = 'A') ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A636", "SELECT OMCod, EmprCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A637", "SELECT MaqPieShw, MaqCod, EmprCod, MaqEquDsc, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE (EmprCod = ? and MaqCod = ?) AND (MaqPieShw = 2) ORDER BY EmprCod, MaqCod, MaqEquCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A638", "SELECT MaqPieShw, MaqEquCod, MaqCod, EmprCod, MaqSEqDsc, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE (EmprCod = ? and MaqCod = ? and MaqEquCod = ?) AND (MaqPieShw = 3) ORDER BY EmprCod, MaqCod, MaqEquCod, MaqSEqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A639", "SELECT MaqPieShw, MaqSEqCod, MaqEquCod, MaqCod, EmprCod, MaqPieDsc, MaqPieCod FROM TXPMaqPie WHERE (EmprCod = ? and MaqCod = ? and MaqEquCod = ? and MaqSEqCod = ?) AND (MaqPieShw = 4) ORDER BY EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               return;
      }
   }

}

