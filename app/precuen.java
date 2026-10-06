package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precuen extends GXProcedure
{
   public precuen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precuen.class ), "" );
   }

   public precuen( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     String[] aP2 ,
                                     int[] aP3 ,
                                     int[] aP4 ,
                                     byte[] aP5 ,
                                     java.util.Date[] aP6 )
   {
      precuen.this.aP7 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.util.Date[] aP6 ,
                        java.util.Date[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.util.Date[] aP7 )
   {
      precuen.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precuen.this.AV15PProd = aP1[0];
      this.aP1 = aP1;
      precuen.this.AV16UProd = aP2[0];
      this.aP2 = aP2;
      precuen.this.AV17PProv = aP3[0];
      this.aP3 = aP3;
      precuen.this.AV18UProv = aP4[0];
      this.aP4 = aP4;
      precuen.this.AV19FlagStk = aP5[0];
      this.aP5 = aP5;
      precuen.this.AV26FecRec = aP6[0];
      this.aP6 = aP6;
      precuen.this.AV27FecRechhmm = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV20Rontaltex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RONTAL", ""), GXv_int2) ;
      precuen.this.GXt_int1 = GXv_int2[0] ;
      AV20Rontaltex = GXt_int1 ;
      GXt_int1 = AV23Nalmcc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int2) ;
      precuen.this.GXt_int1 = GXv_int2[0] ;
      AV23Nalmcc = GXt_int1 ;
      GXt_int1 = AV28Ubicacion ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LOCPRD", ""), GXv_int2) ;
      precuen.this.GXt_int1 = GXv_int2[0] ;
      AV28Ubicacion = GXt_int1 ;
      AV22Recfechr = AV27FecRechhmm ;
      /* Using cursor P001X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15PProd, Integer.valueOf(AV17PProv), Integer.valueOf(AV18UProv), AV16UProd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A704PrdExiAlm = P001X2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P001X2_A705PrdExiCC[0] ;
         A8659PrdExiAlmc = P001X2_A8659PrdExiAlmc[0] ;
         A9734PrdNCAS = P001X2_A9734PrdNCAS[0] ;
         A13457PrdUbicaci = P001X2_A13457PrdUbicaci[0] ;
         A10881PrdLote = P001X2_A10881PrdLote[0] ;
         A719PrdNum = P001X2_A719PrdNum[0] ;
         A856ValCod = P001X2_A856ValCod[0] ;
         A795PrvNum = P001X2_A795PrvNum[0] ;
         A727PrdRec = P001X2_A727PrdRec[0] ;
         A724PrdPreAct = P001X2_A724PrdPreAct[0] ;
         W396EmprCod = A396EmprCod ;
         if ( ( AV20Rontaltex == 0 ) || ( ( AV20Rontaltex == 1 ) && ( GXutil.len( A719PrdNum) >= 4 ) ) )
         {
            if ( ( AV19FlagStk == 0 ) || ( ( AV19FlagStk == 1 ) && ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) ) )
            {
               A727PrdRec = httpContext.getMessage( "S", "") ;
               AV25RecPreRec = A724PrdPreAct ;
               Gx_msg = httpContext.getMessage( "Producto=", "") + A719PrdNum + httpContext.getMessage( " 1.PRECUEN.Tabla RECUEN", "") ;
               System.out.println( Gx_msg );
               /*
                  INSERT RECORD ON TABLE TXPRECUEN

               */
               W396EmprCod = A396EmprCod ;
               W719PrdNum = A719PrdNum ;
               A810RecFec = AV26FecRec ;
               A809RecExiTeo = A704PrdExiAlm ;
               A807RecExiRea = DecimalUtil.doubleToDec(0) ;
               A808RecExiTcc = A705PrdExiCC ;
               A806RecExiRcc = DecimalUtil.doubleToDec(0) ;
               A8668RecExiTAc = A8659PrdExiAlmc ;
               A8669RecExiRAc = DecimalUtil.doubleToDec(0) ;
               A6573RecPreRec = AV25RecPreRec ;
               A11195RecUbic = ((AV28Ubicacion==1) ? A13457PrdUbicaci : GXutil.substring( A9734PrdNCAS, 1, 20)) ;
               A11624RecMemCant = (byte)(0) ;
               A12285RecLot = A10881PrdLote ;
               A13416RecEstInv = (byte)(0) ;
               A13455Rechora = AV27FecRechhmm ;
               /* Using cursor P001X3 */
               pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A810RecFec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, A6573RecPreRec, A8668RecExiTAc, A8669RecExiRAc, A11195RecUbic, Byte.valueOf(A11624RecMemCant), A12285RecLot, Byte.valueOf(A13416RecEstInv), A13455Rechora});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
               if ( (pr_default.getStatus(1) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  /* Using cursor P001X4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A396EmprCod = P001X4_A396EmprCod[0] ;
                     A719PrdNum = P001X4_A719PrdNum[0] ;
                     A810RecFec = P001X4_A810RecFec[0] ;
                     A809RecExiTeo = P001X4_A809RecExiTeo[0] ;
                     A807RecExiRea = P001X4_A807RecExiRea[0] ;
                     A808RecExiTcc = P001X4_A808RecExiTcc[0] ;
                     A806RecExiRcc = P001X4_A806RecExiRcc[0] ;
                     A8668RecExiTAc = P001X4_A8668RecExiTAc[0] ;
                     A8669RecExiRAc = P001X4_A8669RecExiRAc[0] ;
                     A6573RecPreRec = P001X4_A6573RecPreRec[0] ;
                     A11624RecMemCant = P001X4_A11624RecMemCant[0] ;
                     A12285RecLot = P001X4_A12285RecLot[0] ;
                     A13455Rechora = P001X4_A13455Rechora[0] ;
                     A11195RecUbic = P001X4_A11195RecUbic[0] ;
                     A13416RecEstInv = P001X4_A13416RecEstInv[0] ;
                     A809RecExiTeo = A704PrdExiAlm ;
                     A807RecExiRea = DecimalUtil.doubleToDec(0) ;
                     A808RecExiTcc = A705PrdExiCC ;
                     A806RecExiRcc = DecimalUtil.doubleToDec(0) ;
                     A8668RecExiTAc = A8659PrdExiAlmc ;
                     A8669RecExiRAc = DecimalUtil.doubleToDec(0) ;
                     A6573RecPreRec = AV25RecPreRec ;
                     A11624RecMemCant = (byte)(0) ;
                     A12285RecLot = A10881PrdLote ;
                     A13455Rechora = AV27FecRechhmm ;
                     A11195RecUbic = ((AV28Ubicacion==1) ? A13457PrdUbicaci : GXutil.substring( A9734PrdNCAS, 1, 20)) ;
                     A13416RecEstInv = (byte)(0) ;
                     /* Using cursor P001X5 */
                     pr_default.execute(3, new Object[] {A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, A8668RecExiTAc, A8669RecExiRAc, A6573RecPreRec, Byte.valueOf(A11624RecMemCant), A12285RecLot, A13455Rechora, A11195RecUbic, Byte.valueOf(A13416RecEstInv), A396EmprCod, A719PrdNum, A810RecFec});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(2);
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               A719PrdNum = W719PrdNum ;
               /* End Insert */
               Gx_msg = httpContext.getMessage( "Producto=", "") + A719PrdNum + httpContext.getMessage( " 1.PRECUEN.Tabla INVPRD", "") ;
               System.out.println( Gx_msg );
               /*
                  INSERT RECORD ON TABLE TXPINVPRD

               */
               W396EmprCod = A396EmprCod ;
               W719PrdNum = A719PrdNum ;
               A8577RecFecHr = AV22Recfechr ;
               A8578RecExTeo = A704PrdExiAlm ;
               n8578RecExTeo = false ;
               A8579RecExRea = DecimalUtil.doubleToDec(0) ;
               n8579RecExRea = false ;
               A8580RecExTcc = A705PrdExiCC ;
               n8580RecExTcc = false ;
               A8581RecExRcc = DecimalUtil.doubleToDec(0) ;
               n8581RecExRcc = false ;
               A8582RecPreInv = DecimalUtil.doubleToDec(0) ;
               n8582RecPreInv = false ;
               A8583RecInvSt = (byte)(0) ;
               n8583RecInvSt = false ;
               A8670RecExTAc = A8659PrdExiAlmc ;
               n8670RecExTAc = false ;
               A8671RecExRAc = DecimalUtil.doubleToDec(0) ;
               n8671RecExRAc = false ;
               A8582RecPreInv = AV25RecPreRec ;
               n8582RecPreInv = false ;
               A12286RecLot2 = A10881PrdLote ;
               n12286RecLot2 = false ;
               /* Using cursor P001X6 */
               pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, A8577RecFecHr, Boolean.valueOf(n8578RecExTeo), A8578RecExTeo, Boolean.valueOf(n8579RecExRea), A8579RecExRea, Boolean.valueOf(n8580RecExTcc), A8580RecExTcc, Boolean.valueOf(n8581RecExRcc), A8581RecExRcc, Boolean.valueOf(n8582RecPreInv), A8582RecPreInv, Boolean.valueOf(n8583RecInvSt), Byte.valueOf(A8583RecInvSt), Boolean.valueOf(n8670RecExTAc), A8670RecExTAc, Boolean.valueOf(n8671RecExRAc), A8671RecExRAc, Boolean.valueOf(n12286RecLot2), A12286RecLot2});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVPRD");
               if ( (pr_default.getStatus(4) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               A719PrdNum = W719PrdNum ;
               /* End Insert */
               if ( AV23Nalmcc == 1 )
               {
                  AV24PrdAlmc = (byte)(0) ;
                  /* Using cursor P001X7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A8918CC_ExisCC = P001X7_A8918CC_ExisCC[0] ;
                     n8918CC_ExisCC = P001X7_n8918CC_ExisCC[0] ;
                     A8908CC_AlmCod = P001X7_A8908CC_AlmCod[0] ;
                     W396EmprCod = A396EmprCod ;
                     W719PrdNum = A719PrdNum ;
                     AV24PrdAlmc = (byte)(1) ;
                     /*
                        INSERT RECORD ON TABLE TXPRECALM

                     */
                     W396EmprCod = A396EmprCod ;
                     W719PrdNum = A719PrdNum ;
                     W8908CC_AlmCod = A8908CC_AlmCod ;
                     A810RecFec = AV26FecRec ;
                     A8920CC_ExiReaC = A8918CC_ExisCC ;
                     n8920CC_ExiReaC = false ;
                     A8919CC_ExiTeoC = A8918CC_ExisCC ;
                     n8919CC_ExiTeoC = false ;
                     A8923CC_Estado = (byte)(0) ;
                     n8923CC_Estado = false ;
                     A11625CC_MemCant = (byte)(0) ;
                     n11625CC_MemCant = false ;
                     /* Using cursor P001X8 */
                     pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod), Boolean.valueOf(n8919CC_ExiTeoC), A8919CC_ExiTeoC, Boolean.valueOf(n8920CC_ExiReaC), A8920CC_ExiReaC, Boolean.valueOf(n8923CC_Estado), Byte.valueOf(A8923CC_Estado), Boolean.valueOf(n11625CC_MemCant), Byte.valueOf(A11625CC_MemCant)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECALM");
                     if ( (pr_default.getStatus(6) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                        /* Using cursor P001X9 */
                        pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod)});
                        while ( (pr_default.getStatus(7) != 101) )
                        {
                           A396EmprCod = P001X9_A396EmprCod[0] ;
                           A719PrdNum = P001X9_A719PrdNum[0] ;
                           A810RecFec = P001X9_A810RecFec[0] ;
                           A8908CC_AlmCod = P001X9_A8908CC_AlmCod[0] ;
                           A8920CC_ExiReaC = P001X9_A8920CC_ExiReaC[0] ;
                           n8920CC_ExiReaC = P001X9_n8920CC_ExiReaC[0] ;
                           A8919CC_ExiTeoC = P001X9_A8919CC_ExiTeoC[0] ;
                           n8919CC_ExiTeoC = P001X9_n8919CC_ExiTeoC[0] ;
                           A8923CC_Estado = P001X9_A8923CC_Estado[0] ;
                           n8923CC_Estado = P001X9_n8923CC_Estado[0] ;
                           A11625CC_MemCant = P001X9_A11625CC_MemCant[0] ;
                           n11625CC_MemCant = P001X9_n11625CC_MemCant[0] ;
                           A8920CC_ExiReaC = A8918CC_ExisCC ;
                           n8920CC_ExiReaC = false ;
                           A8919CC_ExiTeoC = A8918CC_ExisCC ;
                           n8919CC_ExiTeoC = false ;
                           A8923CC_Estado = (byte)(0) ;
                           n8923CC_Estado = false ;
                           A11625CC_MemCant = (byte)(0) ;
                           n11625CC_MemCant = false ;
                           /* Using cursor P001X10 */
                           pr_default.execute(8, new Object[] {Boolean.valueOf(n8920CC_ExiReaC), A8920CC_ExiReaC, Boolean.valueOf(n8919CC_ExiTeoC), A8919CC_ExiTeoC, Boolean.valueOf(n8923CC_Estado), Byte.valueOf(A8923CC_Estado), Boolean.valueOf(n11625CC_MemCant), Byte.valueOf(A11625CC_MemCant), A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod)});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECALM");
                           /* Exiting from a For First loop. */
                           if (true) break;
                        }
                        pr_default.close(7);
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     A396EmprCod = W396EmprCod ;
                     A719PrdNum = W719PrdNum ;
                     A8908CC_AlmCod = W8908CC_AlmCod ;
                     /* End Insert */
                     /*
                        INSERT RECORD ON TABLE TXPINVALM

                     */
                     W396EmprCod = A396EmprCod ;
                     W719PrdNum = A719PrdNum ;
                     W8908CC_AlmCod = A8908CC_AlmCod ;
                     A8577RecFecHr = AV22Recfechr ;
                     A8922Inv_ExiRea = DecimalUtil.doubleToDec(0) ;
                     n8922Inv_ExiRea = false ;
                     A8921Inv_ExiTeo = A8918CC_ExisCC ;
                     n8921Inv_ExiTeo = false ;
                     A8924Inv_Status = (byte)(0) ;
                     n8924Inv_Status = false ;
                     /* Using cursor P001X11 */
                     pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum, A8577RecFecHr, Byte.valueOf(A8908CC_AlmCod), Boolean.valueOf(n8921Inv_ExiTeo), A8921Inv_ExiTeo, Boolean.valueOf(n8922Inv_ExiRea), A8922Inv_ExiRea, Boolean.valueOf(n8924Inv_Status), Byte.valueOf(A8924Inv_Status)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVALM");
                     if ( (pr_default.getStatus(9) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     A396EmprCod = W396EmprCod ;
                     A719PrdNum = W719PrdNum ;
                     A8908CC_AlmCod = W8908CC_AlmCod ;
                     /* End Insert */
                     A396EmprCod = W396EmprCod ;
                     A719PrdNum = W719PrdNum ;
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
                  if ( AV24PrdAlmc == 0 )
                  {
                     /*
                        INSERT RECORD ON TABLE TXPRECALM

                     */
                     W396EmprCod = A396EmprCod ;
                     W719PrdNum = A719PrdNum ;
                     A810RecFec = AV26FecRec ;
                     A8908CC_AlmCod = (byte)(99) ;
                     A8920CC_ExiReaC = DecimalUtil.doubleToDec(0) ;
                     n8920CC_ExiReaC = false ;
                     A8919CC_ExiTeoC = DecimalUtil.doubleToDec(0) ;
                     n8919CC_ExiTeoC = false ;
                     A8923CC_Estado = (byte)(0) ;
                     n8923CC_Estado = false ;
                     /* Using cursor P001X12 */
                     pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod), Boolean.valueOf(n8919CC_ExiTeoC), A8919CC_ExiTeoC, Boolean.valueOf(n8920CC_ExiReaC), A8920CC_ExiReaC, Boolean.valueOf(n8923CC_Estado), Byte.valueOf(A8923CC_Estado)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECALM");
                     if ( (pr_default.getStatus(10) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     A396EmprCod = W396EmprCod ;
                     A719PrdNum = W719PrdNum ;
                     /* End Insert */
                     /*
                        INSERT RECORD ON TABLE TXPINVALM

                     */
                     W396EmprCod = A396EmprCod ;
                     W719PrdNum = A719PrdNum ;
                     A8577RecFecHr = AV22Recfechr ;
                     A8908CC_AlmCod = (byte)(99) ;
                     A8922Inv_ExiRea = DecimalUtil.doubleToDec(0) ;
                     n8922Inv_ExiRea = false ;
                     A8921Inv_ExiTeo = DecimalUtil.doubleToDec(0) ;
                     n8921Inv_ExiTeo = false ;
                     A8924Inv_Status = (byte)(0) ;
                     n8924Inv_Status = false ;
                     /* Using cursor P001X13 */
                     pr_default.execute(11, new Object[] {A396EmprCod, A719PrdNum, A8577RecFecHr, Byte.valueOf(A8908CC_AlmCod), Boolean.valueOf(n8921Inv_ExiTeo), A8921Inv_ExiTeo, Boolean.valueOf(n8922Inv_ExiRea), A8922Inv_ExiRea, Boolean.valueOf(n8924Inv_Status), Byte.valueOf(A8924Inv_Status)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVALM");
                     if ( (pr_default.getStatus(11) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     A396EmprCod = W396EmprCod ;
                     A719PrdNum = W719PrdNum ;
                     /* End Insert */
                  }
               }
            }
         }
         /* Using cursor P001X14 */
         pr_default.execute(12, new Object[] {A727PrdRec, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = precuen.this.A396EmprCod;
      this.aP1[0] = precuen.this.AV15PProd;
      this.aP2[0] = precuen.this.AV16UProd;
      this.aP3[0] = precuen.this.AV17PProv;
      this.aP4[0] = precuen.this.AV18UProv;
      this.aP5[0] = precuen.this.AV19FlagStk;
      this.aP6[0] = precuen.this.AV26FecRec;
      this.aP7[0] = precuen.this.AV27FecRechhmm;
      Application.commitDataStores(context, remoteHandle, pr_default, "precuen");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV22Recfechr = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P001X2_A396EmprCod = new String[] {""} ;
      P001X2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X2_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X2_A9734PrdNCAS = new String[] {""} ;
      P001X2_A13457PrdUbicaci = new String[] {""} ;
      P001X2_A10881PrdLote = new String[] {""} ;
      P001X2_A719PrdNum = new String[] {""} ;
      P001X2_A856ValCod = new byte[1] ;
      P001X2_A795PrvNum = new int[1] ;
      P001X2_A727PrdRec = new String[] {""} ;
      P001X2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      A9734PrdNCAS = "" ;
      A13457PrdUbicaci = "" ;
      A10881PrdLote = "" ;
      A719PrdNum = "" ;
      A727PrdRec = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      AV25RecPreRec = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      W719PrdNum = "" ;
      A810RecFec = GXutil.nullDate() ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A8668RecExiTAc = DecimalUtil.ZERO ;
      A8669RecExiRAc = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A11195RecUbic = "" ;
      A12285RecLot = "" ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      P001X4_A396EmprCod = new String[] {""} ;
      P001X4_A719PrdNum = new String[] {""} ;
      P001X4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001X4_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X4_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X4_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X4_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X4_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X4_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X4_A11624RecMemCant = new byte[1] ;
      P001X4_A12285RecLot = new String[] {""} ;
      P001X4_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P001X4_A11195RecUbic = new String[] {""} ;
      P001X4_A13416RecEstInv = new byte[1] ;
      A8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      A8578RecExTeo = DecimalUtil.ZERO ;
      A8579RecExRea = DecimalUtil.ZERO ;
      A8580RecExTcc = DecimalUtil.ZERO ;
      A8581RecExRcc = DecimalUtil.ZERO ;
      A8582RecPreInv = DecimalUtil.ZERO ;
      A8670RecExTAc = DecimalUtil.ZERO ;
      A8671RecExRAc = DecimalUtil.ZERO ;
      A12286RecLot2 = "" ;
      P001X7_A396EmprCod = new String[] {""} ;
      P001X7_A719PrdNum = new String[] {""} ;
      P001X7_A8918CC_ExisCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X7_n8918CC_ExisCC = new boolean[] {false} ;
      P001X7_A8908CC_AlmCod = new byte[1] ;
      A8918CC_ExisCC = DecimalUtil.ZERO ;
      A8920CC_ExiReaC = DecimalUtil.ZERO ;
      A8919CC_ExiTeoC = DecimalUtil.ZERO ;
      P001X9_A396EmprCod = new String[] {""} ;
      P001X9_A719PrdNum = new String[] {""} ;
      P001X9_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001X9_A8908CC_AlmCod = new byte[1] ;
      P001X9_A8920CC_ExiReaC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X9_n8920CC_ExiReaC = new boolean[] {false} ;
      P001X9_A8919CC_ExiTeoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X9_n8919CC_ExiTeoC = new boolean[] {false} ;
      P001X9_A8923CC_Estado = new byte[1] ;
      P001X9_n8923CC_Estado = new boolean[] {false} ;
      P001X9_A11625CC_MemCant = new byte[1] ;
      P001X9_n11625CC_MemCant = new boolean[] {false} ;
      A8922Inv_ExiRea = DecimalUtil.ZERO ;
      A8921Inv_ExiTeo = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precuen__default(),
         new Object[] {
             new Object[] {
            P001X2_A396EmprCod, P001X2_A704PrdExiAlm, P001X2_A705PrdExiCC, P001X2_A8659PrdExiAlmc, P001X2_A9734PrdNCAS, P001X2_A13457PrdUbicaci, P001X2_A10881PrdLote, P001X2_A719PrdNum, P001X2_A856ValCod, P001X2_A795PrvNum,
            P001X2_A727PrdRec, P001X2_A724PrdPreAct
            }
            , new Object[] {
            }
            , new Object[] {
            P001X4_A396EmprCod, P001X4_A719PrdNum, P001X4_A810RecFec, P001X4_A809RecExiTeo, P001X4_A807RecExiRea, P001X4_A808RecExiTcc, P001X4_A806RecExiRcc, P001X4_A8668RecExiTAc, P001X4_A8669RecExiRAc, P001X4_A6573RecPreRec,
            P001X4_A11624RecMemCant, P001X4_A12285RecLot, P001X4_A13455Rechora, P001X4_A11195RecUbic, P001X4_A13416RecEstInv
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001X7_A396EmprCod, P001X7_A719PrdNum, P001X7_A8918CC_ExisCC, P001X7_n8918CC_ExisCC, P001X7_A8908CC_AlmCod
            }
            , new Object[] {
            }
            , new Object[] {
            P001X9_A396EmprCod, P001X9_A719PrdNum, P001X9_A810RecFec, P001X9_A8908CC_AlmCod, P001X9_A8920CC_ExiReaC, P001X9_n8920CC_ExiReaC, P001X9_A8919CC_ExiTeoC, P001X9_n8919CC_ExiTeoC, P001X9_A8923CC_Estado, P001X9_n8923CC_Estado,
            P001X9_A11625CC_MemCant, P001X9_n11625CC_MemCant
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19FlagStk ;
   private byte AV20Rontaltex ;
   private byte AV23Nalmcc ;
   private byte AV28Ubicacion ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A856ValCod ;
   private byte A11624RecMemCant ;
   private byte A13416RecEstInv ;
   private byte A8583RecInvSt ;
   private byte AV24PrdAlmc ;
   private byte A8908CC_AlmCod ;
   private byte W8908CC_AlmCod ;
   private byte A8923CC_Estado ;
   private byte A11625CC_MemCant ;
   private byte A8924Inv_Status ;
   private short Gx_err ;
   private int AV17PProv ;
   private int AV18UProv ;
   private int A795PrvNum ;
   private int GX_INS98 ;
   private int GX_INS1177 ;
   private int GX_INS1213 ;
   private int GX_INS1214 ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A8659PrdExiAlmc ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV25RecPreRec ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A8668RecExiTAc ;
   private java.math.BigDecimal A8669RecExiRAc ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A8578RecExTeo ;
   private java.math.BigDecimal A8579RecExRea ;
   private java.math.BigDecimal A8580RecExTcc ;
   private java.math.BigDecimal A8581RecExRcc ;
   private java.math.BigDecimal A8582RecPreInv ;
   private java.math.BigDecimal A8670RecExTAc ;
   private java.math.BigDecimal A8671RecExRAc ;
   private java.math.BigDecimal A8918CC_ExisCC ;
   private java.math.BigDecimal A8920CC_ExiReaC ;
   private java.math.BigDecimal A8919CC_ExiTeoC ;
   private java.math.BigDecimal A8922Inv_ExiRea ;
   private java.math.BigDecimal A8921Inv_ExiTeo ;
   private String A396EmprCod ;
   private String AV15PProd ;
   private String AV16UProd ;
   private String scmdbuf ;
   private String A9734PrdNCAS ;
   private String A13457PrdUbicaci ;
   private String A10881PrdLote ;
   private String A719PrdNum ;
   private String A727PrdRec ;
   private String W396EmprCod ;
   private String Gx_msg ;
   private String W719PrdNum ;
   private String A11195RecUbic ;
   private String A12285RecLot ;
   private String Gx_emsg ;
   private String A12286RecLot2 ;
   private java.util.Date AV27FecRechhmm ;
   private java.util.Date AV22Recfechr ;
   private java.util.Date A13455Rechora ;
   private java.util.Date A8577RecFecHr ;
   private java.util.Date AV26FecRec ;
   private java.util.Date A810RecFec ;
   private boolean n8578RecExTeo ;
   private boolean n8579RecExRea ;
   private boolean n8580RecExTcc ;
   private boolean n8581RecExRcc ;
   private boolean n8582RecPreInv ;
   private boolean n8583RecInvSt ;
   private boolean n8670RecExTAc ;
   private boolean n8671RecExRAc ;
   private boolean n12286RecLot2 ;
   private boolean n8918CC_ExisCC ;
   private boolean n8920CC_ExiReaC ;
   private boolean n8919CC_ExiTeoC ;
   private boolean n8923CC_Estado ;
   private boolean n11625CC_MemCant ;
   private boolean n8922Inv_ExiRea ;
   private boolean n8921Inv_ExiTeo ;
   private boolean n8924Inv_Status ;
   private java.util.Date[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P001X2_A396EmprCod ;
   private java.math.BigDecimal[] P001X2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P001X2_A705PrdExiCC ;
   private java.math.BigDecimal[] P001X2_A8659PrdExiAlmc ;
   private String[] P001X2_A9734PrdNCAS ;
   private String[] P001X2_A13457PrdUbicaci ;
   private String[] P001X2_A10881PrdLote ;
   private String[] P001X2_A719PrdNum ;
   private byte[] P001X2_A856ValCod ;
   private int[] P001X2_A795PrvNum ;
   private String[] P001X2_A727PrdRec ;
   private java.math.BigDecimal[] P001X2_A724PrdPreAct ;
   private String[] P001X4_A396EmprCod ;
   private String[] P001X4_A719PrdNum ;
   private java.util.Date[] P001X4_A810RecFec ;
   private java.math.BigDecimal[] P001X4_A809RecExiTeo ;
   private java.math.BigDecimal[] P001X4_A807RecExiRea ;
   private java.math.BigDecimal[] P001X4_A808RecExiTcc ;
   private java.math.BigDecimal[] P001X4_A806RecExiRcc ;
   private java.math.BigDecimal[] P001X4_A8668RecExiTAc ;
   private java.math.BigDecimal[] P001X4_A8669RecExiRAc ;
   private java.math.BigDecimal[] P001X4_A6573RecPreRec ;
   private byte[] P001X4_A11624RecMemCant ;
   private String[] P001X4_A12285RecLot ;
   private java.util.Date[] P001X4_A13455Rechora ;
   private String[] P001X4_A11195RecUbic ;
   private byte[] P001X4_A13416RecEstInv ;
   private String[] P001X7_A396EmprCod ;
   private String[] P001X7_A719PrdNum ;
   private java.math.BigDecimal[] P001X7_A8918CC_ExisCC ;
   private boolean[] P001X7_n8918CC_ExisCC ;
   private byte[] P001X7_A8908CC_AlmCod ;
   private String[] P001X9_A396EmprCod ;
   private String[] P001X9_A719PrdNum ;
   private java.util.Date[] P001X9_A810RecFec ;
   private byte[] P001X9_A8908CC_AlmCod ;
   private java.math.BigDecimal[] P001X9_A8920CC_ExiReaC ;
   private boolean[] P001X9_n8920CC_ExiReaC ;
   private java.math.BigDecimal[] P001X9_A8919CC_ExiTeoC ;
   private boolean[] P001X9_n8919CC_ExiTeoC ;
   private byte[] P001X9_A8923CC_Estado ;
   private boolean[] P001X9_n8923CC_Estado ;
   private byte[] P001X9_A11625CC_MemCant ;
   private boolean[] P001X9_n11625CC_MemCant ;
}

final  class precuen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001X2", "SELECT EmprCod, PrdExiAlm, PrdExiCC, PrdExiAlmc, PrdNCAS, PrdUbicaci, PrdLote, PrdNum, ValCod, PrvNum, PrdRec, PrdPreAct FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (PrvNum >= ? and PrvNum <= ?) AND (ValCod <> 3) AND (LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5) AND (PrdNum <= ?) ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001X3", "INSERT INTO TXPRECUEN(EmprCod, PrdNum, RecFec, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECUEN")
         ,new ForEachCursor("P001X4", "SELECT EmprCod, PrdNum, RecFec, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecExiTAc, RecExiRAc, RecPreRec, RecMemCant, RecLot, Rechora, RecUbic, RecEstInv FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001X5", "UPDATE TXPRECUEN SET RecExiTeo=?, RecExiRea=?, RecExiTcc=?, RecExiRcc=?, RecExiTAc=?, RecExiRAc=?, RecPreRec=?, RecMemCant=?, RecLot=?, Rechora=?, RecUbic=?, RecEstInv=?  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECUEN")
         ,new UpdateCursor("P001X6", "INSERT INTO TXPINVPRD(EmprCod, PrdNum, RecFecHr, RecExTeo, RecExRea, RecExTcc, RecExRcc, RecPreInv, RecInvSt, RecExTAc, RecExRAc, RecLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVPRD")
         ,new ForEachCursor("P001X7", "SELECT EmprCod, PrdNum, CC_ExisCC, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CC_AlmCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001X8", "INSERT INTO TXPRECALM(EmprCod, PrdNum, RecFec, CC_AlmCod, CC_ExiTeoC, CC_ExiReaC, CC_Estado, CC_MemCant) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECALM")
         ,new ForEachCursor("P001X9", "SELECT EmprCod, PrdNum, RecFec, CC_AlmCod, CC_ExiReaC, CC_ExiTeoC, CC_Estado, CC_MemCant FROM TXPRECALM WHERE EmprCod = ? and PrdNum = ? and RecFec = ? and CC_AlmCod = ? ORDER BY EmprCod, PrdNum, RecFec, CC_AlmCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001X10", "UPDATE TXPRECALM SET CC_ExiReaC=?, CC_ExiTeoC=?, CC_Estado=?, CC_MemCant=?  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? AND CC_AlmCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECALM")
         ,new UpdateCursor("P001X11", "INSERT INTO TXPINVALM(EmprCod, PrdNum, RecFecHr, CC_AlmCod, Inv_ExiTeo, Inv_ExiRea, Inv_Status) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVALM")
         ,new UpdateCursor("P001X12", "INSERT INTO TXPRECALM(EmprCod, PrdNum, RecFec, CC_AlmCod, CC_ExiTeoC, CC_ExiReaC, CC_Estado, CC_MemCant) VALUES(?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECALM")
         ,new UpdateCursor("P001X13", "INSERT INTO TXPINVALM(EmprCod, PrdNum, RecFecHr, CC_AlmCod, Inv_ExiTeo, Inv_ExiRea, Inv_Status) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVALM")
         ,new UpdateCursor("P001X14", "UPDATE TXPPRODUC SET PrdRec=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 4);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 4);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 4);
               stmt.setString(11, (String)parms[10], 20);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 26);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setDateTime(15, (java.util.Date)parms[14], false);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 26);
               stmt.setDateTime(10, (java.util.Date)parms[9], false);
               stmt.setString(11, (String)parms[10], 20);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 3);
               stmt.setString(14, (String)parms[13], 6);
               stmt.setDate(15, (java.util.Date)parms[14]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 4);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 4);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 4);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 4);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 4);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 26);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setString(6, (String)parms[9], 6);
               stmt.setDate(7, (java.util.Date)parms[10]);
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

