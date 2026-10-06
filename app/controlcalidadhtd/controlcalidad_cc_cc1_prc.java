package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_cc_cc1_prc extends GXProcedure
{
   public controlcalidad_cc_cc1_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc_cc1_prc.class ), "" );
   }

   public controlcalidad_cc_cc1_prc( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      controlcalidad_cc_cc1_prc.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      controlcalidad_cc_cc1_prc.this.AV12EmprCod = aP0;
      controlcalidad_cc_cc1_prc.this.AV8BarcodIN = aP1;
      controlcalidad_cc_cc1_prc.this.AV10BarcodreoIN = aP2;
      controlcalidad_cc_cc1_prc.this.AV9BarCodParIn = aP3;
      controlcalidad_cc_cc1_prc.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11ControlCalidad_CC_CC1_SDT.clear();
      AV33ControlCalidad_CC_CC1_SDT_json = "" ;
      /* Using cursor P0APX2 */
      pr_default.execute(0, new Object[] {AV12EmprCod, Integer.valueOf(AV8BarcodIN), Byte.valueOf(AV10BarcodreoIN), AV9BarCodParIn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0APX2_A130BarCodPar[0] ;
         A132BarCodReo = P0APX2_A132BarCodReo[0] ;
         A129BarCod = P0APX2_A129BarCod[0] ;
         A396EmprCod = P0APX2_A396EmprCod[0] ;
         A252CliCod = P0APX2_A252CliCod[0] ;
         n252CliCod = P0APX2_n252CliCod[0] ;
         A279CliNom = P0APX2_A279CliNom[0] ;
         A212BarSer = P0APX2_A212BarSer[0] ;
         A1652BarSerDsc = P0APX2_A1652BarSerDsc[0] ;
         A135BarColNom = P0APX2_A135BarColNom[0] ;
         A136BarColNum = P0APX2_A136BarColNum[0] ;
         A4466BarAcaAnh = P0APX2_A4466BarAcaAnh[0] ;
         A279CliNom = P0APX2_A279CliNom[0] ;
         AV30Clicod = A252CliCod ;
         AV34CliNom = A279CliNom ;
         AV29Artcod = A212BarSer ;
         AV35ARtDsc = A1652BarSerDsc ;
         AV28CCFColNom = A135BarColNom ;
         AV27CCFColNum = A136BarColNum ;
         AV26Cuaderno = A4466BarAcaAnh ;
         /* Execute user subroutine: 'CCSER1' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P0APX3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A457FasCod = P0APX3_A457FasCod[0] ;
            A460FasDsc = P0APX3_A460FasDsc[0] ;
            A759ProDsc = P0APX3_A759ProDsc[0] ;
            A153BarFasEst = P0APX3_A153BarFasEst[0] ;
            A194BarOrdLin = P0APX3_A194BarOrdLin[0] ;
            A758ProCod = P0APX3_A758ProCod[0] ;
            A460FasDsc = P0APX3_A460FasDsc[0] ;
            A759ProDsc = P0APX3_A759ProDsc[0] ;
            AV14Barordlin = A194BarOrdLin ;
            AV15Fascod = A457FasCod ;
            AV32fasdsc = A460FasDsc ;
            AV16Procod = A758ProCod ;
            AV17Prodsc = A759ProDsc ;
            AV18barfasest = A153BarFasEst ;
            /* Execute user subroutine: 'CCFAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV33ControlCalidad_CC_CC1_SDT_json = AV11ControlCalidad_CC_CC1_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'CCFAS' Routine */
      returnInSub = false ;
      AV19Cctcod = 0 ;
      AV20CCtdsc = " " ;
      AV21Ccfas = (short)(0) ;
      AV22CCOpeCod = 0 ;
      /* Using cursor P0APX4 */
      pr_default.execute(2, new Object[] {AV12EmprCod, AV15Fascod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P0APX4_A457FasCod[0] ;
         A396EmprCod = P0APX4_A396EmprCod[0] ;
         A4036CCTDsc = P0APX4_A4036CCTDsc[0] ;
         A4031CCTCod = P0APX4_A4031CCTCod[0] ;
         A4036CCTDsc = P0APX4_A4036CCTDsc[0] ;
         AV19Cctcod = A4031CCTCod ;
         AV20CCtdsc = A4036CCTDsc ;
         AV21Ccfas = (short)(1) ;
         /* Execute user subroutine: 'OPERARIO' */
         S124 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV23Cctcodout = AV19Cctcod ;
         GXv_int1[0] = (byte)(AV31errControl) ;
         new app.pprc251(remoteHandle, context).execute( AV12EmprCod, AV30Clicod, AV29Artcod, AV28CCFColNom, AV27CCFColNum, AV26Cuaderno, AV23Cctcodout, (byte)(AV25CCCno5), (byte)(AV24Ccser1), GXv_int1) ;
         controlcalidad_cc_cc1_prc.this.AV31errControl = GXv_int1[0] ;
         if ( AV21Ccfas == 1 )
         {
            if ( ( AV24Ccser1 == 1 ) && ( AV31errControl == 0 ) )
            {
               AV13ControlCalidad_CC_CC1_SDT_Item = (app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)new app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item(remoteHandle, context);
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin( AV14Barordlin );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod( AV16Procod );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc( AV17Prodsc );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod( AV15Fascod );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc( AV32fasdsc );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod( AV19Cctcod );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc( AV20CCtdsc );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas( AV21Ccfas );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol( AV31errControl );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod( AV22CCOpeCod );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest( AV18barfasest );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch( AV36ccfch );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc( AV37cc );
               AV13ControlCalidad_CC_CC1_SDT_Item.setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1( AV24Ccser1 );
               AV11ControlCalidad_CC_CC1_SDT.add(AV13ControlCalidad_CC_CC1_SDT_Item, 0);
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S124( )
   {
      /* 'OPERARIO' Routine */
      returnInSub = false ;
      AV22CCOpeCod = 0 ;
      AV36ccfch = GXutil.nullDate() ;
      AV37cc = (short)(0) ;
      /* Using cursor P0APX5 */
      pr_default.execute(3, new Object[] {AV12EmprCod, Integer.valueOf(AV8BarcodIN), Byte.valueOf(AV10BarcodreoIN), AV9BarCodParIn, AV16Procod, Short.valueOf(AV14Barordlin), Integer.valueOf(AV19Cctcod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4031CCTCod = P0APX5_A4031CCTCod[0] ;
         A194BarOrdLin = P0APX5_A194BarOrdLin[0] ;
         A758ProCod = P0APX5_A758ProCod[0] ;
         A130BarCodPar = P0APX5_A130BarCodPar[0] ;
         A132BarCodReo = P0APX5_A132BarCodReo[0] ;
         A129BarCod = P0APX5_A129BarCod[0] ;
         A396EmprCod = P0APX5_A396EmprCod[0] ;
         A4032CCOpeCod = P0APX5_A4032CCOpeCod[0] ;
         n4032CCOpeCod = P0APX5_n4032CCOpeCod[0] ;
         A4033CCFch = P0APX5_A4033CCFch[0] ;
         n4033CCFch = P0APX5_n4033CCFch[0] ;
         AV22CCOpeCod = A4032CCOpeCod ;
         AV36ccfch = A4033CCFch ;
         AV37cc = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S131( )
   {
      /* 'CCSER1' Routine */
      returnInSub = false ;
      AV24Ccser1 = (short)(0) ;
      /* Using cursor P0APX6 */
      pr_default.execute(4, new Object[] {AV12EmprCod, AV29Artcod, AV28CCFColNom, Integer.valueOf(AV27CCFColNum), Integer.valueOf(AV30Clicod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A4059CCFColNum = P0APX6_A4059CCFColNum[0] ;
         A4058CCFColNom = P0APX6_A4058CCFColNom[0] ;
         A65ArtCod = P0APX6_A65ArtCod[0] ;
         A252CliCod = P0APX6_A252CliCod[0] ;
         n252CliCod = P0APX6_n252CliCod[0] ;
         A396EmprCod = P0APX6_A396EmprCod[0] ;
         A4031CCTCod = P0APX6_A4031CCTCod[0] ;
         AV24Ccser1 = (short)(1) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP4[0] = controlcalidad_cc_cc1_prc.this.AV33ControlCalidad_CC_CC1_SDT_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33ControlCalidad_CC_CC1_SDT_json = "" ;
      AV11ControlCalidad_CC_CC1_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item>(app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0APX2_A130BarCodPar = new String[] {""} ;
      P0APX2_A132BarCodReo = new byte[1] ;
      P0APX2_A129BarCod = new int[1] ;
      P0APX2_A396EmprCod = new String[] {""} ;
      P0APX2_A252CliCod = new int[1] ;
      P0APX2_n252CliCod = new boolean[] {false} ;
      P0APX2_A279CliNom = new String[] {""} ;
      P0APX2_A212BarSer = new String[] {""} ;
      P0APX2_A1652BarSerDsc = new String[] {""} ;
      P0APX2_A135BarColNom = new String[] {""} ;
      P0APX2_A136BarColNum = new int[1] ;
      P0APX2_A4466BarAcaAnh = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      AV34CliNom = "" ;
      AV29Artcod = "" ;
      AV35ARtDsc = "" ;
      AV28CCFColNom = "" ;
      P0APX3_A396EmprCod = new String[] {""} ;
      P0APX3_A129BarCod = new int[1] ;
      P0APX3_A132BarCodReo = new byte[1] ;
      P0APX3_A130BarCodPar = new String[] {""} ;
      P0APX3_A457FasCod = new String[] {""} ;
      P0APX3_A460FasDsc = new String[] {""} ;
      P0APX3_A759ProDsc = new String[] {""} ;
      P0APX3_A153BarFasEst = new byte[1] ;
      P0APX3_A194BarOrdLin = new short[1] ;
      P0APX3_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      AV15Fascod = "" ;
      AV32fasdsc = "" ;
      AV16Procod = "" ;
      AV17Prodsc = "" ;
      AV20CCtdsc = "" ;
      P0APX4_A457FasCod = new String[] {""} ;
      P0APX4_A396EmprCod = new String[] {""} ;
      P0APX4_A4036CCTDsc = new String[] {""} ;
      P0APX4_A4031CCTCod = new int[1] ;
      A4036CCTDsc = "" ;
      GXv_int1 = new byte[1] ;
      AV13ControlCalidad_CC_CC1_SDT_Item = new app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item(remoteHandle, context);
      AV36ccfch = GXutil.nullDate() ;
      P0APX5_A4031CCTCod = new int[1] ;
      P0APX5_A194BarOrdLin = new short[1] ;
      P0APX5_A758ProCod = new String[] {""} ;
      P0APX5_A130BarCodPar = new String[] {""} ;
      P0APX5_A132BarCodReo = new byte[1] ;
      P0APX5_A129BarCod = new int[1] ;
      P0APX5_A396EmprCod = new String[] {""} ;
      P0APX5_A4032CCOpeCod = new int[1] ;
      P0APX5_n4032CCOpeCod = new boolean[] {false} ;
      P0APX5_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0APX5_n4033CCFch = new boolean[] {false} ;
      A4033CCFch = GXutil.nullDate() ;
      P0APX6_A4059CCFColNum = new int[1] ;
      P0APX6_A4058CCFColNom = new String[] {""} ;
      P0APX6_A65ArtCod = new String[] {""} ;
      P0APX6_A252CliCod = new int[1] ;
      P0APX6_n252CliCod = new boolean[] {false} ;
      P0APX6_A396EmprCod = new String[] {""} ;
      P0APX6_A4031CCTCod = new int[1] ;
      A4058CCFColNom = "" ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_cc_cc1_prc__default(),
         new Object[] {
             new Object[] {
            P0APX2_A130BarCodPar, P0APX2_A132BarCodReo, P0APX2_A129BarCod, P0APX2_A396EmprCod, P0APX2_A252CliCod, P0APX2_n252CliCod, P0APX2_A279CliNom, P0APX2_A212BarSer, P0APX2_A1652BarSerDsc, P0APX2_A135BarColNom,
            P0APX2_A136BarColNum, P0APX2_A4466BarAcaAnh
            }
            , new Object[] {
            P0APX3_A396EmprCod, P0APX3_A129BarCod, P0APX3_A132BarCodReo, P0APX3_A130BarCodPar, P0APX3_A457FasCod, P0APX3_A460FasDsc, P0APX3_A759ProDsc, P0APX3_A153BarFasEst, P0APX3_A194BarOrdLin, P0APX3_A758ProCod
            }
            , new Object[] {
            P0APX4_A457FasCod, P0APX4_A396EmprCod, P0APX4_A4036CCTDsc, P0APX4_A4031CCTCod
            }
            , new Object[] {
            P0APX5_A4031CCTCod, P0APX5_A194BarOrdLin, P0APX5_A758ProCod, P0APX5_A130BarCodPar, P0APX5_A132BarCodReo, P0APX5_A129BarCod, P0APX5_A396EmprCod, P0APX5_A4032CCOpeCod, P0APX5_n4032CCOpeCod, P0APX5_A4033CCFch,
            P0APX5_n4033CCFch
            }
            , new Object[] {
            P0APX6_A4059CCFColNum, P0APX6_A4058CCFColNom, P0APX6_A65ArtCod, P0APX6_A252CliCod, P0APX6_A396EmprCod, P0APX6_A4031CCTCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarcodreoIN ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte AV18barfasest ;
   private byte GXv_int1[] ;
   private short A4466BarAcaAnh ;
   private short AV26Cuaderno ;
   private short A194BarOrdLin ;
   private short AV14Barordlin ;
   private short AV21Ccfas ;
   private short AV25CCCno5 ;
   private short AV24Ccser1 ;
   private short AV31errControl ;
   private short AV37cc ;
   private short Gx_err ;
   private int AV8BarcodIN ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV30Clicod ;
   private int AV27CCFColNum ;
   private int AV19Cctcod ;
   private int AV22CCOpeCod ;
   private int A4031CCTCod ;
   private int AV23Cctcodout ;
   private int A4032CCOpeCod ;
   private int A4059CCFColNum ;
   private String AV12EmprCod ;
   private String AV9BarCodParIn ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String AV34CliNom ;
   private String AV29Artcod ;
   private String AV35ARtDsc ;
   private String AV28CCFColNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String AV15Fascod ;
   private String AV32fasdsc ;
   private String AV16Procod ;
   private String AV17Prodsc ;
   private String AV20CCtdsc ;
   private String A4036CCTDsc ;
   private String A4058CCFColNom ;
   private String A65ArtCod ;
   private java.util.Date AV36ccfch ;
   private java.util.Date A4033CCFch ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n4032CCOpeCod ;
   private boolean n4033CCFch ;
   private String AV33ControlCalidad_CC_CC1_SDT_json ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0APX2_A130BarCodPar ;
   private byte[] P0APX2_A132BarCodReo ;
   private int[] P0APX2_A129BarCod ;
   private String[] P0APX2_A396EmprCod ;
   private int[] P0APX2_A252CliCod ;
   private boolean[] P0APX2_n252CliCod ;
   private String[] P0APX2_A279CliNom ;
   private String[] P0APX2_A212BarSer ;
   private String[] P0APX2_A1652BarSerDsc ;
   private String[] P0APX2_A135BarColNom ;
   private int[] P0APX2_A136BarColNum ;
   private short[] P0APX2_A4466BarAcaAnh ;
   private String[] P0APX3_A396EmprCod ;
   private int[] P0APX3_A129BarCod ;
   private byte[] P0APX3_A132BarCodReo ;
   private String[] P0APX3_A130BarCodPar ;
   private String[] P0APX3_A457FasCod ;
   private String[] P0APX3_A460FasDsc ;
   private String[] P0APX3_A759ProDsc ;
   private byte[] P0APX3_A153BarFasEst ;
   private short[] P0APX3_A194BarOrdLin ;
   private String[] P0APX3_A758ProCod ;
   private String[] P0APX4_A457FasCod ;
   private String[] P0APX4_A396EmprCod ;
   private String[] P0APX4_A4036CCTDsc ;
   private int[] P0APX4_A4031CCTCod ;
   private int[] P0APX5_A4031CCTCod ;
   private short[] P0APX5_A194BarOrdLin ;
   private String[] P0APX5_A758ProCod ;
   private String[] P0APX5_A130BarCodPar ;
   private byte[] P0APX5_A132BarCodReo ;
   private int[] P0APX5_A129BarCod ;
   private String[] P0APX5_A396EmprCod ;
   private int[] P0APX5_A4032CCOpeCod ;
   private boolean[] P0APX5_n4032CCOpeCod ;
   private java.util.Date[] P0APX5_A4033CCFch ;
   private boolean[] P0APX5_n4033CCFch ;
   private int[] P0APX6_A4059CCFColNum ;
   private String[] P0APX6_A4058CCFColNom ;
   private String[] P0APX6_A65ArtCod ;
   private int[] P0APX6_A252CliCod ;
   private boolean[] P0APX6_n252CliCod ;
   private String[] P0APX6_A396EmprCod ;
   private int[] P0APX6_A4031CCTCod ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item> AV11ControlCalidad_CC_CC1_SDT ;
   private app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item AV13ControlCalidad_CC_CC1_SDT_Item ;
}

final  class controlcalidad_cc_cc1_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APX2", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarAcaAnh FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APX3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T2.FasDsc, T3.ProDsc, T1.BarFasEst, T1.BarOrdLin, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0APX4", "SELECT T1.FasCod, T1.EmprCod, T2.CCTDsc, T1.CCTCod FROM (TXPCCFas T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0APX5", "SELECT CCTCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, CCOpeCod, CCFch FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APX6", "SELECT CCFColNum, CCFColNom, ArtCod, CliCod, EmprCod, CCTCod FROM TXPCCSer1 WHERE (EmprCod = ?) AND (ArtCod = ? or (rtrim(ArtCod) IS NULL AND NOT(ArtCod IS NULL))) AND (CCFColNom = ? or (rtrim(CCFColNom) IS NULL AND NOT(CCFColNom IS NULL))) AND (CCFColNum = ? or (CCFColNum = 0)) AND (CliCod = ?) ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

