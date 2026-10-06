package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procedure1 extends GXProcedure
{
   public procedure1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procedure1.class ), "" );
   }

   public procedure1( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 )
   {
      procedure1.this.AV20EmprCod = aP0;
      procedure1.this.AV23fecha1 = aP1;
      procedure1.this.AV24fecha2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40NomInf = httpContext.getMessage( "MAQUINASAPROGRAMAR", "") + httpContext.getMessage( ".txt", "") ;
      AV25File.setSource( GXutil.trim( AV40NomInf) );
      if ( AV25File.exists() )
      {
         AV25File.delete();
      }
      AV25File.openWrite("");
      new app.pprc220(remoteHandle, context).execute( AV20EmprCod, AV23fecha1, AV24fecha2) ;
      AV30LastPP = (byte)(80) ;
      AV43PPno80 = (byte)(0) ;
      AV29LastMaquina = " " ;
      /* Using cursor P084Z4 */
      pr_default.execute(0, new Object[] {AV20EmprCod, AV23fecha1, AV24fecha2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P084Z4_A396EmprCod[0] ;
         A213BarSit = P084Z4_A213BarSit[0] ;
         A159BarFecGen = P084Z4_A159BarFecGen[0] ;
         A129BarCod = P084Z4_A129BarCod[0] ;
         A132BarCodReo = P084Z4_A132BarCodReo[0] ;
         A130BarCodPar = P084Z4_A130BarCodPar[0] ;
         A120BarAgrEst = P084Z4_A120BarAgrEst[0] ;
         A252CliCod = P084Z4_A252CliCod[0] ;
         n252CliCod = P084Z4_n252CliCod[0] ;
         A212BarSer = P084Z4_A212BarSer[0] ;
         A135BarColNom = P084Z4_A135BarColNom[0] ;
         A136BarColNum = P084Z4_A136BarColNum[0] ;
         A218BarTipCol = P084Z4_A218BarTipCol[0] ;
         A13234BarRGB = P084Z4_A13234BarRGB[0] ;
         A1234BarNomCli = P084Z4_A1234BarNomCli[0] ;
         A3594BarPriTin = P084Z4_A3594BarPriTin[0] ;
         A180BarMaqCod = P084Z4_A180BarMaqCod[0] ;
         A166BarKgm = P084Z4_A166BarKgm[0] ;
         n166BarKgm = P084Z4_n166BarKgm[0] ;
         A219BarTotAgr = P084Z4_A219BarTotAgr[0] ;
         n219BarTotAgr = P084Z4_n219BarTotAgr[0] ;
         A219BarTotAgr = P084Z4_A219BarTotAgr[0] ;
         n219BarTotAgr = P084Z4_n219BarTotAgr[0] ;
         A166BarKgm = P084Z4_A166BarKgm[0] ;
         n166BarKgm = P084Z4_n166BarKgm[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         AV34Maqcod = A180BarMaqCod ;
         AV9barcod = A129BarCod ;
         AV13barcodreo = A132BarCodReo ;
         AV11Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'BARFAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV17BarOrdLin > 0 ) && ( AV21EstadoFaseHdr < 2 ) )
         {
            /* Execute user subroutine: 'MAQUIN' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( GXutil.strcmp(AV35MaqEst, httpContext.getMessage( "A", "")) == 0 ) && ( AV36MaqPln == 1 ) && ( GXutil.strcmp(AV37MaqTip, httpContext.getMessage( "E", "")) == 0 ) )
            {
               AV10Barcodm = A129BarCod ;
               AV14Barcodreom = A132BarCodReo ;
               AV12Barcodparm = A130BarCodPar ;
               AV53Op = "" ;
               if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
               {
                  new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV10Barcodm, AV14Barcodreom, AV12Barcodparm) ;
                  if ( ( A129BarCod == AV10Barcodm ) && ( A132BarCodReo == AV14Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV12Barcodparm) == 0 ) )
                  {
                     AV53Op = "*" ;
                  }
               }
               else
               {
                  AV53Op = "*" ;
               }
               if ( GXutil.strcmp(AV53Op, "*") == 0 )
               {
                  GXv_char1[0] = A396EmprCod ;
                  GXv_int2[0] = A129BarCod ;
                  GXv_int3[0] = A132BarCodReo ;
                  GXv_char4[0] = A130BarCodPar ;
                  GXv_int5[0] = AV15BarFasEst ;
                  GXv_date6[0] = AV22fecha ;
                  GXv_char7[0] = " " ;
                  new app.pplat07(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_date6, GXv_char7) ;
                  procedure1.this.A396EmprCod = GXv_char1[0] ;
                  procedure1.this.A129BarCod = GXv_int2[0] ;
                  procedure1.this.A132BarCodReo = GXv_int3[0] ;
                  procedure1.this.A130BarCodPar = GXv_char4[0] ;
                  procedure1.this.AV15BarFasEst = GXv_int5[0] ;
                  procedure1.this.AV22fecha = GXv_date6[0] ;
                  if ( AV15BarFasEst < 2 )
                  {
                     if ( GXutil.strcmp(A180BarMaqCod, AV29LastMaquina) != 0 )
                     {
                        AV43PPno80 = (byte)(0) ;
                     }
                     AV9barcod = A129BarCod ;
                     AV13barcodreo = A132BarCodReo ;
                     AV11Barcodpar = A130BarCodPar ;
                     /* Execute user subroutine: 'BARFAS' */
                     S121 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
                        pr_default.close(0);
                        pr_default.close(0);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     GXv_char7[0] = AV20EmprCod ;
                     GXv_int2[0] = AV9barcod ;
                     GXv_int5[0] = AV13barcodreo ;
                     GXv_char4[0] = AV11Barcodpar ;
                     GXv_int8[0] = AV17BarOrdLin ;
                     GXv_char1[0] = " " ;
                     GXv_int3[0] = AV16BarfasestAnt ;
                     GXv_char9[0] = " " ;
                     GXv_int10[0] = (short)(0) ;
                     GXv_char11[0] = " " ;
                     GXv_int12[0] = (byte)(0) ;
                     GXv_char13[0] = " " ;
                     GXv_int14[0] = (short)(0) ;
                     new app.pprc39(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_int5, GXv_char4, GXv_int8, GXv_char1, GXv_int3, GXv_char9, GXv_int10, GXv_char11, GXv_int12, GXv_char13, GXv_int14) ;
                     procedure1.this.AV20EmprCod = GXv_char7[0] ;
                     procedure1.this.AV9barcod = GXv_int2[0] ;
                     procedure1.this.AV13barcodreo = GXv_int5[0] ;
                     procedure1.this.AV11Barcodpar = GXv_char4[0] ;
                     procedure1.this.AV17BarOrdLin = GXv_int8[0] ;
                     procedure1.this.AV16BarfasestAnt = GXv_int3[0] ;
                     GXv_char13[0] = A396EmprCod ;
                     GXv_int2[0] = A252CliCod ;
                     GXv_char11[0] = A212BarSer ;
                     GXv_char9[0] = A135BarColNom ;
                     GXv_int15[0] = A136BarColNum ;
                     GXv_int12[0] = A218BarTipCol ;
                     GXv_int16[0] = AV26Forrgb ;
                     new app.pbusrgb(remoteHandle, context).execute( GXv_char13, GXv_int2, GXv_char11, GXv_char9, GXv_int15, GXv_int12, GXv_int16) ;
                     procedure1.this.A396EmprCod = GXv_char13[0] ;
                     procedure1.this.A252CliCod = GXv_int2[0] ;
                     procedure1.this.A212BarSer = GXv_char11[0] ;
                     procedure1.this.A135BarColNom = GXv_char9[0] ;
                     procedure1.this.A136BarColNum = GXv_int15[0] ;
                     procedure1.this.A218BarTipCol = GXv_int12[0] ;
                     procedure1.this.AV26Forrgb = GXv_int16[0] ;
                     AV26Forrgb = ((A13234BarRGB<0) ? 16777215 : A13234BarRGB) ;
                     AV34Maqcod = A180BarMaqCod ;
                     AV48Tot_kgs = A812RecTotKgm ;
                     AV44RecPripla = A3594BarPriTin ;
                     AV31Maq1 = "" ;
                     AV32Maq2 = "" ;
                     if ( GXutil.strcmp(AV33MaqChp, httpContext.getMessage( "S", "")) == 0 )
                     {
                        /* Execute user subroutine: 'MAQLIN' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        AV19Control = GXutil.padr( GXutil.trim( A180BarMaqCod), 6, " ") + GXutil.padr( GXutil.trim( AV31Maq1), 6, " ") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + (!(GXutil.strcmp("", A1234BarNomCli)==0) ? GXutil.padr( GXutil.trim( A1234BarNomCli), 13, " ") : GXutil.padr( GXutil.trim( A135BarColNom), 13, " ")) + GXutil.padr( GXutil.trim( A212BarSer), 13, " ") + GXutil.str( AV48Tot_kgs, 10, 2) + GXutil.str( AV26Forrgb, 10, 0) + httpContext.getMessage( "P", "") + GXutil.str( AV44RecPripla, 2, 0) + httpContext.getMessage( "HDR", "") ;
                        AV25File.writeLine(AV19Control);
                        AV48Tot_kgs = DecimalUtil.doubleToDec(0) ;
                        AV19Control = GXutil.padr( GXutil.trim( A180BarMaqCod), 6, " ") + GXutil.padr( GXutil.trim( AV32Maq2), 6, " ") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + (!(GXutil.strcmp("", A1234BarNomCli)==0) ? GXutil.padr( GXutil.trim( A1234BarNomCli), 13, " ") : GXutil.padr( GXutil.trim( A135BarColNom), 13, " ")) + GXutil.padr( GXutil.trim( A212BarSer), 13, " ") + GXutil.str( AV48Tot_kgs, 10, 2) + GXutil.str( AV26Forrgb, 10, 0) + "*" + GXutil.str( AV44RecPripla, 2, 0) + httpContext.getMessage( "HDR", "") ;
                        AV25File.writeLine(AV19Control);
                     }
                     else
                     {
                        AV19Control = GXutil.padr( GXutil.trim( A180BarMaqCod), 6, " ") + GXutil.padr( GXutil.trim( AV34Maqcod), 6, " ") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + (!(GXutil.strcmp("", A1234BarNomCli)==0) ? GXutil.padr( GXutil.trim( A1234BarNomCli), 13, " ") : GXutil.padr( GXutil.trim( A135BarColNom), 13, " ")) + GXutil.padr( GXutil.trim( A212BarSer), 13, " ") + GXutil.str( AV48Tot_kgs, 10, 2) + GXutil.str( AV26Forrgb, 10, 0) + httpContext.getMessage( "P", "") + GXutil.str( AV44RecPripla, 2, 0) + httpContext.getMessage( "HDR", "") ;
                        AV25File.writeLine(AV19Control);
                     }
                     AV29LastMaquina = A180BarMaqCod ;
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV49Texto = httpContext.getMessage( "FIN", "") ;
      AV25File.writeLine(AV49Texto);
      AV25File.close();
      cleanup();
   }

   public void S111( )
   {
      /* 'MAQLIN' Routine */
      returnInSub = false ;
      AV31Maq1 = " " ;
      AV32Maq2 = " " ;
      /* Using cursor P084Z5 */
      pr_default.execute(1, new Object[] {AV20EmprCod, AV34Maqcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P084Z5_A602MaqCod[0] ;
         A396EmprCod = P084Z5_A396EmprCod[0] ;
         A613MaqLinTex = P084Z5_A613MaqLinTex[0] ;
         A320DesTecLin = P084Z5_A320DesTecLin[0] ;
         AV31Maq1 = GXutil.substring( A613MaqLinTex, 1, 6) ;
         AV32Maq2 = GXutil.substring( A613MaqLinTex, 7, 6) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV17BarOrdLin = (short)(0) ;
      AV21EstadoFaseHdr = (byte)(0) ;
      /* Using cursor P084Z6 */
      pr_default.execute(2, new Object[] {AV20EmprCod, Integer.valueOf(AV9barcod), Byte.valueOf(AV13barcodreo), AV11Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A153BarFasEst = P084Z6_A153BarFasEst[0] ;
         A150BarFacTin = P084Z6_A150BarFacTin[0] ;
         A130BarCodPar = P084Z6_A130BarCodPar[0] ;
         A132BarCodReo = P084Z6_A132BarCodReo[0] ;
         A129BarCod = P084Z6_A129BarCod[0] ;
         A396EmprCod = P084Z6_A396EmprCod[0] ;
         A194BarOrdLin = P084Z6_A194BarOrdLin[0] ;
         A758ProCod = P084Z6_A758ProCod[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV17BarOrdLin = A194BarOrdLin ;
            AV21EstadoFaseHdr = A153BarFasEst ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV35MaqEst = "" ;
      AV36MaqPln = (byte)(0) ;
      AV37MaqTip = " " ;
      AV33MaqChp = httpContext.getMessage( "N", "") ;
      /* Using cursor P084Z7 */
      pr_default.execute(3, new Object[] {AV20EmprCod, AV34Maqcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A602MaqCod = P084Z7_A602MaqCod[0] ;
         A396EmprCod = P084Z7_A396EmprCod[0] ;
         A607MaqEst = P084Z7_A607MaqEst[0] ;
         n607MaqEst = P084Z7_n607MaqEst[0] ;
         A6432MaqPln = P084Z7_A6432MaqPln[0] ;
         n6432MaqPln = P084Z7_n6432MaqPln[0] ;
         A620MaqTip = P084Z7_A620MaqTip[0] ;
         n620MaqTip = P084Z7_n620MaqTip[0] ;
         A601MaqChp = P084Z7_A601MaqChp[0] ;
         n601MaqChp = P084Z7_n601MaqChp[0] ;
         AV35MaqEst = A607MaqEst ;
         AV36MaqPln = A6432MaqPln ;
         AV37MaqTip = A620MaqTip ;
         AV33MaqChp = A601MaqChp ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40NomInf = "" ;
      AV25File = new com.genexus.util.GXFile();
      AV29LastMaquina = "" ;
      scmdbuf = "" ;
      P084Z4_A396EmprCod = new String[] {""} ;
      P084Z4_A213BarSit = new byte[1] ;
      P084Z4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P084Z4_A129BarCod = new int[1] ;
      P084Z4_A132BarCodReo = new byte[1] ;
      P084Z4_A130BarCodPar = new String[] {""} ;
      P084Z4_A120BarAgrEst = new String[] {""} ;
      P084Z4_A252CliCod = new int[1] ;
      P084Z4_n252CliCod = new boolean[] {false} ;
      P084Z4_A212BarSer = new String[] {""} ;
      P084Z4_A135BarColNom = new String[] {""} ;
      P084Z4_A136BarColNum = new int[1] ;
      P084Z4_A218BarTipCol = new byte[1] ;
      P084Z4_A13234BarRGB = new long[1] ;
      P084Z4_A1234BarNomCli = new String[] {""} ;
      P084Z4_A3594BarPriTin = new byte[1] ;
      P084Z4_A180BarMaqCod = new String[] {""} ;
      P084Z4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084Z4_n166BarKgm = new boolean[] {false} ;
      P084Z4_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084Z4_n219BarTotAgr = new boolean[] {false} ;
      A396EmprCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A180BarMaqCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV34Maqcod = "" ;
      AV11Barcodpar = "" ;
      AV35MaqEst = "" ;
      AV37MaqTip = "" ;
      AV12Barcodparm = "" ;
      AV53Op = "" ;
      AV22fecha = GXutil.nullDate() ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char7 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int10 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_char13 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int16 = new long[1] ;
      AV48Tot_kgs = DecimalUtil.ZERO ;
      AV31Maq1 = "" ;
      AV32Maq2 = "" ;
      AV33MaqChp = "" ;
      AV19Control = "" ;
      AV49Texto = "" ;
      P084Z5_A602MaqCod = new String[] {""} ;
      P084Z5_A396EmprCod = new String[] {""} ;
      P084Z5_A613MaqLinTex = new String[] {""} ;
      P084Z5_A320DesTecLin = new byte[1] ;
      A602MaqCod = "" ;
      A613MaqLinTex = "" ;
      P084Z6_A153BarFasEst = new byte[1] ;
      P084Z6_A150BarFacTin = new String[] {""} ;
      P084Z6_A130BarCodPar = new String[] {""} ;
      P084Z6_A132BarCodReo = new byte[1] ;
      P084Z6_A129BarCod = new int[1] ;
      P084Z6_A396EmprCod = new String[] {""} ;
      P084Z6_A194BarOrdLin = new short[1] ;
      P084Z6_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      P084Z7_A602MaqCod = new String[] {""} ;
      P084Z7_A396EmprCod = new String[] {""} ;
      P084Z7_A607MaqEst = new String[] {""} ;
      P084Z7_n607MaqEst = new boolean[] {false} ;
      P084Z7_A6432MaqPln = new byte[1] ;
      P084Z7_n6432MaqPln = new boolean[] {false} ;
      P084Z7_A620MaqTip = new String[] {""} ;
      P084Z7_n620MaqTip = new boolean[] {false} ;
      P084Z7_A601MaqChp = new String[] {""} ;
      P084Z7_n601MaqChp = new boolean[] {false} ;
      A607MaqEst = "" ;
      A620MaqTip = "" ;
      A601MaqChp = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.procedure1__default(),
         new Object[] {
             new Object[] {
            P084Z4_A396EmprCod, P084Z4_A213BarSit, P084Z4_A159BarFecGen, P084Z4_A129BarCod, P084Z4_A132BarCodReo, P084Z4_A130BarCodPar, P084Z4_A120BarAgrEst, P084Z4_A252CliCod, P084Z4_n252CliCod, P084Z4_A212BarSer,
            P084Z4_A135BarColNom, P084Z4_A136BarColNum, P084Z4_A218BarTipCol, P084Z4_A13234BarRGB, P084Z4_A1234BarNomCli, P084Z4_A3594BarPriTin, P084Z4_A180BarMaqCod, P084Z4_A166BarKgm, P084Z4_n166BarKgm, P084Z4_A219BarTotAgr,
            P084Z4_n219BarTotAgr
            }
            , new Object[] {
            P084Z5_A602MaqCod, P084Z5_A396EmprCod, P084Z5_A613MaqLinTex, P084Z5_A320DesTecLin
            }
            , new Object[] {
            P084Z6_A153BarFasEst, P084Z6_A150BarFacTin, P084Z6_A130BarCodPar, P084Z6_A132BarCodReo, P084Z6_A129BarCod, P084Z6_A396EmprCod, P084Z6_A194BarOrdLin, P084Z6_A758ProCod
            }
            , new Object[] {
            P084Z7_A602MaqCod, P084Z7_A396EmprCod, P084Z7_A607MaqEst, P084Z7_n607MaqEst, P084Z7_A6432MaqPln, P084Z7_n6432MaqPln, P084Z7_A620MaqTip, P084Z7_n620MaqTip, P084Z7_A601MaqChp, P084Z7_n601MaqChp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30LastPP ;
   private byte AV43PPno80 ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A3594BarPriTin ;
   private byte AV13barcodreo ;
   private byte AV21EstadoFaseHdr ;
   private byte AV36MaqPln ;
   private byte AV14Barcodreom ;
   private byte AV15BarFasEst ;
   private byte GXv_int5[] ;
   private byte AV16BarfasestAnt ;
   private byte GXv_int3[] ;
   private byte GXv_int12[] ;
   private byte AV44RecPripla ;
   private byte A320DesTecLin ;
   private byte A153BarFasEst ;
   private byte A6432MaqPln ;
   private short AV17BarOrdLin ;
   private short GXv_int8[] ;
   private short GXv_int10[] ;
   private short GXv_int14[] ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV9barcod ;
   private int AV10Barcodm ;
   private int GXv_int2[] ;
   private int GXv_int15[] ;
   private long A13234BarRGB ;
   private long AV26Forrgb ;
   private long GXv_int16[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV48Tot_kgs ;
   private String AV20EmprCod ;
   private String AV40NomInf ;
   private String AV29LastMaquina ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A180BarMaqCod ;
   private String AV34Maqcod ;
   private String AV11Barcodpar ;
   private String AV35MaqEst ;
   private String AV37MaqTip ;
   private String AV12Barcodparm ;
   private String AV53Op ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char9[] ;
   private String AV31Maq1 ;
   private String AV32Maq2 ;
   private String AV33MaqChp ;
   private String AV49Texto ;
   private String A602MaqCod ;
   private String A613MaqLinTex ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String A607MaqEst ;
   private String A620MaqTip ;
   private String A601MaqChp ;
   private java.util.Date AV23fecha1 ;
   private java.util.Date AV24fecha2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV22fecha ;
   private java.util.Date GXv_date6[] ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean n219BarTotAgr ;
   private boolean returnInSub ;
   private boolean n607MaqEst ;
   private boolean n6432MaqPln ;
   private boolean n620MaqTip ;
   private boolean n601MaqChp ;
   private String AV19Control ;
   private com.genexus.util.GXFile AV25File ;
   private IDataStoreProvider pr_default ;
   private String[] P084Z4_A396EmprCod ;
   private byte[] P084Z4_A213BarSit ;
   private java.util.Date[] P084Z4_A159BarFecGen ;
   private int[] P084Z4_A129BarCod ;
   private byte[] P084Z4_A132BarCodReo ;
   private String[] P084Z4_A130BarCodPar ;
   private String[] P084Z4_A120BarAgrEst ;
   private int[] P084Z4_A252CliCod ;
   private boolean[] P084Z4_n252CliCod ;
   private String[] P084Z4_A212BarSer ;
   private String[] P084Z4_A135BarColNom ;
   private int[] P084Z4_A136BarColNum ;
   private byte[] P084Z4_A218BarTipCol ;
   private long[] P084Z4_A13234BarRGB ;
   private String[] P084Z4_A1234BarNomCli ;
   private byte[] P084Z4_A3594BarPriTin ;
   private String[] P084Z4_A180BarMaqCod ;
   private java.math.BigDecimal[] P084Z4_A166BarKgm ;
   private boolean[] P084Z4_n166BarKgm ;
   private java.math.BigDecimal[] P084Z4_A219BarTotAgr ;
   private boolean[] P084Z4_n219BarTotAgr ;
   private String[] P084Z5_A602MaqCod ;
   private String[] P084Z5_A396EmprCod ;
   private String[] P084Z5_A613MaqLinTex ;
   private byte[] P084Z5_A320DesTecLin ;
   private byte[] P084Z6_A153BarFasEst ;
   private String[] P084Z6_A150BarFacTin ;
   private String[] P084Z6_A130BarCodPar ;
   private byte[] P084Z6_A132BarCodReo ;
   private int[] P084Z6_A129BarCod ;
   private String[] P084Z6_A396EmprCod ;
   private short[] P084Z6_A194BarOrdLin ;
   private String[] P084Z6_A758ProCod ;
   private String[] P084Z7_A602MaqCod ;
   private String[] P084Z7_A396EmprCod ;
   private String[] P084Z7_A607MaqEst ;
   private boolean[] P084Z7_n607MaqEst ;
   private byte[] P084Z7_A6432MaqPln ;
   private boolean[] P084Z7_n6432MaqPln ;
   private String[] P084Z7_A620MaqTip ;
   private boolean[] P084Z7_n620MaqTip ;
   private String[] P084Z7_A601MaqChp ;
   private boolean[] P084Z7_n601MaqChp ;
}

final  class procedure1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084Z4", "SELECT T1.EmprCod, T1.BarSit, T1.BarFecGen, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAgrEst, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarRGB, T1.BarNomCli, T1.BarPriTin, T1.BarMaqCod, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.BarFecGen >= ?) AND (T1.BarFecGen <= ?) AND (T1.BarSit < 6) ORDER BY T1.EmprCod, T1.BarMaqCod, T1.BarPriTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084Z5", "SELECT * FROM (SELECT MaqCod, EmprCod, MaqLinTex, DesTecLin FROM TXPMAQLIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, DesTecLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P084Z6", "SELECT BarFasEst, BarFacTin, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst < 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084Z7", "SELECT MaqCod, EmprCod, MaqEst, MaqPln, MaqTip, MaqChp FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((long[]) buf[13])[0] = rslt.getLong(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 6);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 70);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

