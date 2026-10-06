package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp006 extends GXProcedure
{
   public pdyrp006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp006.class ), "" );
   }

   public pdyrp006( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            byte[] aP3 ,
                            int[] aP4 ,
                            byte[] aP5 ,
                            String[] aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            String[] aP8 ,
                            String[] aP9 )
   {
      pdyrp006.this.aP10 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 )
   {
      pdyrp006.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp006.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pdyrp006.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pdyrp006.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pdyrp006.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pdyrp006.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pdyrp006.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pdyrp006.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pdyrp006.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pdyrp006.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pdyrp006.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV130ClaveC ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int2) ;
      pdyrp006.this.GXt_int1 = GXv_int2[0] ;
      AV130ClaveC = GXt_int1 ;
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CK", "")) == 0 )
      {
         AV134CC = GXutil.substring( AV16Clave, 4, 2) + "%" ;
         AV23Accion = GXutil.substring( AV16Clave, 7, 1) ;
         /* Execute user subroutine: 'BARCAD' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         lV134CC = GXutil.padr( GXutil.rtrim( AV134CC), 2, "%") ;
         /* Using cursor P098Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), lV134CC});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1191ForNomCli = P098Y2_A1191ForNomCli[0] ;
            n1191ForNomCli = P098Y2_n1191ForNomCli[0] ;
            A831TipColCod = P098Y2_A831TipColCod[0] ;
            A483ForColNum = P098Y2_A483ForColNum[0] ;
            A482ForColNom = P098Y2_A482ForColNom[0] ;
            A494ForSer = P098Y2_A494ForSer[0] ;
            A252CliCod = P098Y2_A252CliCod[0] ;
            n252CliCod = P098Y2_n252CliCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CT", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 7, 1) ;
         AV131barTipCol = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
         /* Execute user subroutine: 'BARCAD' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'TC' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV17PrdVal = AV132Ok_tc ;
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AZ", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         AV80ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         AV30CodMaq = GXutil.substring( AV16Clave, 9, 6) ;
         /* Using cursor P098Y3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P098Y3_A130BarCodPar[0] ;
            A132BarCodReo = P098Y3_A132BarCodReo[0] ;
            A129BarCod = P098Y3_A129BarCod[0] ;
            A212BarSer = P098Y3_A212BarSer[0] ;
            A252CliCod = P098Y3_A252CliCod[0] ;
            n252CliCod = P098Y3_n252CliCod[0] ;
            A120BarAgrEst = P098Y3_A120BarAgrEst[0] ;
            A180BarMaqCod = P098Y3_A180BarMaqCod[0] ;
            AV126Artcod = A212BarSer ;
            AV127Clicodf = A252CliCod ;
            /* Execute user subroutine: 'ARTICU' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'BARAGR' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            if ( AV17PrdVal == 1 )
            {
               AV17PrdVal = (byte)(0) ;
               if ( GXutil.like( A180BarMaqCod , GXutil.padr( AV30CodMaq , 6 , "%"),  ' ' ) )
               {
                  AV17PrdVal = (byte)(1) ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "H1", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV114GruMaq = GXutil.substring( AV16Clave, 4, 6) ;
         AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 11, 2))) ;
         AV50FlagCol = (byte)(0) ;
         AV17PrdVal = (byte)(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(GXutil.substring( AV105BarMaqCod, 1, 4), GXutil.substring( AV114GruMaq, 1, 4)) == 0 )
         {
            AV81BarSer = AV46ForSer ;
            AV52CliCod = AV41BarCliCod ;
            AV17PrdVal = (byte)(1) ;
            Gx_msg += AV105BarMaqCod + "=" + AV114GruMaq + GXutil.newLine( ) ;
         }
         else
         {
            Gx_msg += AV105BarMaqCod + httpContext.getMessage( " not = ", "") + AV114GruMaq + GXutil.newLine( ) ;
         }
         /* Execute user subroutine: 'INTENS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV97Ok_intens == 0 )
         {
            AV17PrdVal = (byte)(0) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      /* Using cursor P098Y4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV127Clicodf), AV126Artcod, Short.valueOf(AV80ClasCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4295ClasCod = P098Y4_A4295ClasCod[0] ;
         n4295ClasCod = P098Y4_n4295ClasCod[0] ;
         A65ArtCod = P098Y4_A65ArtCod[0] ;
         A252CliCod = P098Y4_A252CliCod[0] ;
         n252CliCod = P098Y4_n252CliCod[0] ;
         AV17PrdVal = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'BARAGR' Routine */
      returnInSub = false ;
      /* Using cursor P098Y5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P098Y5_A130BarCodPar[0] ;
         A132BarCodReo = P098Y5_A132BarCodReo[0] ;
         A129BarCod = P098Y5_A129BarCod[0] ;
         A1245BarAgrSer = P098Y5_A1245BarAgrSer[0] ;
         A1508CliCodAgr = P098Y5_A1508CliCodAgr[0] ;
         A119BarAgrCod = P098Y5_A119BarAgrCod[0] ;
         A124BarAgrReo = P098Y5_A124BarAgrReo[0] ;
         A122BarAgrPar = P098Y5_A122BarAgrPar[0] ;
         AV126Artcod = A1245BarAgrSer ;
         AV127Clicodf = A1508CliCodAgr ;
         /* Execute user subroutine: 'ARTICU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S131( )
   {
      /* 'LFORMU' Routine */
      returnInSub = false ;
      AV17PrdVal = (byte)(0) ;
      /* Using cursor P098Y6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = P098Y6_A831TipColCod[0] ;
         A483ForColNum = P098Y6_A483ForColNum[0] ;
         A482ForColNom = P098Y6_A482ForColNom[0] ;
         A494ForSer = P098Y6_A494ForSer[0] ;
         A252CliCod = P098Y6_A252CliCod[0] ;
         n252CliCod = P098Y6_n252CliCod[0] ;
         A764ProForCod = P098Y6_A764ProForCod[0] ;
         A1160ProForL = P098Y6_A1160ProForL[0] ;
         if ( GXutil.strcmp(A764ProForCod, AV39Proceso) == 0 )
         {
            AV17PrdVal = (byte)(1) ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S141( )
   {
      /* 'MATIZ' Routine */
      returnInSub = false ;
      AV100Ok_matiz = (byte)(0) ;
      /* Using cursor P098Y7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Short.valueOf(AV31Matiz)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A626MatCod = P098Y7_A626MatCod[0] ;
         A831TipColCod = P098Y7_A831TipColCod[0] ;
         A483ForColNum = P098Y7_A483ForColNum[0] ;
         A482ForColNom = P098Y7_A482ForColNom[0] ;
         A494ForSer = P098Y7_A494ForSer[0] ;
         A252CliCod = P098Y7_A252CliCod[0] ;
         n252CliCod = P098Y7_n252CliCod[0] ;
         AV100Ok_matiz = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S151( )
   {
      /* 'INTENS' Routine */
      returnInSub = false ;
      AV97Ok_intens = (byte)(0) ;
      /* Using cursor P098Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Byte.valueOf(AV51IntCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A583IntCod = P098Y8_A583IntCod[0] ;
         A831TipColCod = P098Y8_A831TipColCod[0] ;
         A483ForColNum = P098Y8_A483ForColNum[0] ;
         A482ForColNom = P098Y8_A482ForColNom[0] ;
         A494ForSer = P098Y8_A494ForSer[0] ;
         A252CliCod = P098Y8_A252CliCod[0] ;
         n252CliCod = P098Y8_n252CliCod[0] ;
         AV97Ok_intens = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S161( )
   {
      /* 'TC' Routine */
      returnInSub = false ;
      AV132Ok_tc = (byte)(0) ;
      /* Using cursor P098Y9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV131barTipCol)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A831TipColCod = P098Y9_A831TipColCod[0] ;
         A483ForColNum = P098Y9_A483ForColNum[0] ;
         A482ForColNom = P098Y9_A482ForColNom[0] ;
         A494ForSer = P098Y9_A494ForSer[0] ;
         A252CliCod = P098Y9_A252CliCod[0] ;
         n252CliCod = P098Y9_n252CliCod[0] ;
         AV132Ok_tc = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S171( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV99BarAcc = GXutil.space( (short)(1)) ;
      AV41BarCliCod = 0 ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      AV48ForColNum = 0 ;
      AV49TipColCod = (byte)(0) ;
      AV110BarTra1 = "" ;
      AV111BarTra2 = "" ;
      AV112BarTra3 = "" ;
      AV72Color13_1 = "" ;
      AV76BarSer34 = "" ;
      AV26RelBany = (byte)(0) ;
      AV105BarMaqCod = "" ;
      /* Using cursor P098Y10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P098Y10_A130BarCodPar[0] ;
         A132BarCodReo = P098Y10_A132BarCodReo[0] ;
         A129BarCod = P098Y10_A129BarCod[0] ;
         A252CliCod = P098Y10_A252CliCod[0] ;
         n252CliCod = P098Y10_n252CliCod[0] ;
         A212BarSer = P098Y10_A212BarSer[0] ;
         A135BarColNom = P098Y10_A135BarColNom[0] ;
         A136BarColNum = P098Y10_A136BarColNum[0] ;
         A218BarTipCol = P098Y10_A218BarTipCol[0] ;
         A221BarTra1 = P098Y10_A221BarTra1[0] ;
         A222BarTra2 = P098Y10_A222BarTra2[0] ;
         A223BarTra3 = P098Y10_A223BarTra3[0] ;
         A236BarVolMaq = P098Y10_A236BarVolMaq[0] ;
         A5253BarAcc = P098Y10_A5253BarAcc[0] ;
         A180BarMaqCod = P098Y10_A180BarMaqCod[0] ;
         AV41BarCliCod = A252CliCod ;
         AV46ForSer = A212BarSer ;
         AV47ForColNom = A135BarColNom ;
         AV48ForColNum = A136BarColNum ;
         AV49TipColCod = A218BarTipCol ;
         AV110BarTra1 = A221BarTra1 ;
         AV111BarTra2 = A222BarTra2 ;
         AV112BarTra3 = A223BarTra3 ;
         AV72Color13_1 = GXutil.substring( A135BarColNom, 13, 1) ;
         AV76BarSer34 = GXutil.substring( A212BarSer, 3, 2) ;
         AV26RelBany = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A236BarVolMaq).divide(AV21TotKil, 18, java.math.RoundingMode.DOWN)), 0))) ;
         if ( AV26RelBany > 99 )
         {
            AV26RelBany = (byte)(99) ;
         }
         AV99BarAcc = A5253BarAcc ;
         AV105BarMaqCod = A180BarMaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp006.this.A396EmprCod;
      this.aP1[0] = pdyrp006.this.AV15Descrip;
      this.aP2[0] = pdyrp006.this.AV16Clave;
      this.aP3[0] = pdyrp006.this.AV17PrdVal;
      this.aP4[0] = pdyrp006.this.AV18BarCod;
      this.aP5[0] = pdyrp006.this.AV19BarCodReo;
      this.aP6[0] = pdyrp006.this.AV20BarCodPar;
      this.aP7[0] = pdyrp006.this.AV21TotKil;
      this.aP8[0] = pdyrp006.this.AV22PrdDesc;
      this.aP9[0] = pdyrp006.this.AV23Accion;
      this.aP10[0] = pdyrp006.this.AV67BarLinMaq;
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
      AV24Opcion = "" ;
      AV134CC = "" ;
      lV134CC = "" ;
      scmdbuf = "" ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      P098Y2_A396EmprCod = new String[] {""} ;
      P098Y2_A1191ForNomCli = new String[] {""} ;
      P098Y2_n1191ForNomCli = new boolean[] {false} ;
      P098Y2_A831TipColCod = new byte[1] ;
      P098Y2_A483ForColNum = new int[1] ;
      P098Y2_A482ForColNom = new String[] {""} ;
      P098Y2_A494ForSer = new String[] {""} ;
      P098Y2_A252CliCod = new int[1] ;
      P098Y2_n252CliCod = new boolean[] {false} ;
      A1191ForNomCli = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV30CodMaq = "" ;
      P098Y3_A396EmprCod = new String[] {""} ;
      P098Y3_A130BarCodPar = new String[] {""} ;
      P098Y3_A132BarCodReo = new byte[1] ;
      P098Y3_A129BarCod = new int[1] ;
      P098Y3_A212BarSer = new String[] {""} ;
      P098Y3_A252CliCod = new int[1] ;
      P098Y3_n252CliCod = new boolean[] {false} ;
      P098Y3_A120BarAgrEst = new String[] {""} ;
      P098Y3_A180BarMaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A120BarAgrEst = "" ;
      A180BarMaqCod = "" ;
      AV126Artcod = "" ;
      AV114GruMaq = "" ;
      AV105BarMaqCod = "" ;
      AV81BarSer = "" ;
      Gx_msg = "" ;
      P098Y4_A396EmprCod = new String[] {""} ;
      P098Y4_A4295ClasCod = new short[1] ;
      P098Y4_n4295ClasCod = new boolean[] {false} ;
      P098Y4_A65ArtCod = new String[] {""} ;
      P098Y4_A252CliCod = new int[1] ;
      P098Y4_n252CliCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      P098Y5_A396EmprCod = new String[] {""} ;
      P098Y5_A130BarCodPar = new String[] {""} ;
      P098Y5_A132BarCodReo = new byte[1] ;
      P098Y5_A129BarCod = new int[1] ;
      P098Y5_A1245BarAgrSer = new String[] {""} ;
      P098Y5_A1508CliCodAgr = new int[1] ;
      P098Y5_A119BarAgrCod = new int[1] ;
      P098Y5_A124BarAgrReo = new byte[1] ;
      P098Y5_A122BarAgrPar = new String[] {""} ;
      A1245BarAgrSer = "" ;
      A122BarAgrPar = "" ;
      P098Y6_A396EmprCod = new String[] {""} ;
      P098Y6_A831TipColCod = new byte[1] ;
      P098Y6_A483ForColNum = new int[1] ;
      P098Y6_A482ForColNom = new String[] {""} ;
      P098Y6_A494ForSer = new String[] {""} ;
      P098Y6_A252CliCod = new int[1] ;
      P098Y6_n252CliCod = new boolean[] {false} ;
      P098Y6_A764ProForCod = new String[] {""} ;
      P098Y6_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      AV39Proceso = "" ;
      P098Y7_A396EmprCod = new String[] {""} ;
      P098Y7_A626MatCod = new short[1] ;
      P098Y7_A831TipColCod = new byte[1] ;
      P098Y7_A483ForColNum = new int[1] ;
      P098Y7_A482ForColNom = new String[] {""} ;
      P098Y7_A494ForSer = new String[] {""} ;
      P098Y7_A252CliCod = new int[1] ;
      P098Y7_n252CliCod = new boolean[] {false} ;
      P098Y8_A396EmprCod = new String[] {""} ;
      P098Y8_A583IntCod = new byte[1] ;
      P098Y8_A831TipColCod = new byte[1] ;
      P098Y8_A483ForColNum = new int[1] ;
      P098Y8_A482ForColNom = new String[] {""} ;
      P098Y8_A494ForSer = new String[] {""} ;
      P098Y8_A252CliCod = new int[1] ;
      P098Y8_n252CliCod = new boolean[] {false} ;
      P098Y9_A396EmprCod = new String[] {""} ;
      P098Y9_A831TipColCod = new byte[1] ;
      P098Y9_A483ForColNum = new int[1] ;
      P098Y9_A482ForColNom = new String[] {""} ;
      P098Y9_A494ForSer = new String[] {""} ;
      P098Y9_A252CliCod = new int[1] ;
      P098Y9_n252CliCod = new boolean[] {false} ;
      AV99BarAcc = "" ;
      AV110BarTra1 = "" ;
      AV111BarTra2 = "" ;
      AV112BarTra3 = "" ;
      AV72Color13_1 = "" ;
      AV76BarSer34 = "" ;
      P098Y10_A396EmprCod = new String[] {""} ;
      P098Y10_A130BarCodPar = new String[] {""} ;
      P098Y10_A132BarCodReo = new byte[1] ;
      P098Y10_A129BarCod = new int[1] ;
      P098Y10_A252CliCod = new int[1] ;
      P098Y10_n252CliCod = new boolean[] {false} ;
      P098Y10_A212BarSer = new String[] {""} ;
      P098Y10_A135BarColNom = new String[] {""} ;
      P098Y10_A136BarColNum = new int[1] ;
      P098Y10_A218BarTipCol = new byte[1] ;
      P098Y10_A221BarTra1 = new String[] {""} ;
      P098Y10_A222BarTra2 = new String[] {""} ;
      P098Y10_A223BarTra3 = new String[] {""} ;
      P098Y10_A236BarVolMaq = new int[1] ;
      P098Y10_A5253BarAcc = new String[] {""} ;
      P098Y10_A180BarMaqCod = new String[] {""} ;
      A135BarColNom = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A5253BarAcc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp006__default(),
         new Object[] {
             new Object[] {
            P098Y2_A396EmprCod, P098Y2_A1191ForNomCli, P098Y2_n1191ForNomCli, P098Y2_A831TipColCod, P098Y2_A483ForColNum, P098Y2_A482ForColNom, P098Y2_A494ForSer, P098Y2_A252CliCod
            }
            , new Object[] {
            P098Y3_A396EmprCod, P098Y3_A130BarCodPar, P098Y3_A132BarCodReo, P098Y3_A129BarCod, P098Y3_A212BarSer, P098Y3_A252CliCod, P098Y3_n252CliCod, P098Y3_A120BarAgrEst, P098Y3_A180BarMaqCod
            }
            , new Object[] {
            P098Y4_A396EmprCod, P098Y4_A4295ClasCod, P098Y4_n4295ClasCod, P098Y4_A65ArtCod, P098Y4_A252CliCod
            }
            , new Object[] {
            P098Y5_A396EmprCod, P098Y5_A130BarCodPar, P098Y5_A132BarCodReo, P098Y5_A129BarCod, P098Y5_A1245BarAgrSer, P098Y5_A1508CliCodAgr, P098Y5_A119BarAgrCod, P098Y5_A124BarAgrReo, P098Y5_A122BarAgrPar
            }
            , new Object[] {
            P098Y6_A396EmprCod, P098Y6_A831TipColCod, P098Y6_A483ForColNum, P098Y6_A482ForColNom, P098Y6_A494ForSer, P098Y6_A252CliCod, P098Y6_A764ProForCod, P098Y6_A1160ProForL
            }
            , new Object[] {
            P098Y7_A396EmprCod, P098Y7_A626MatCod, P098Y7_A831TipColCod, P098Y7_A483ForColNum, P098Y7_A482ForColNom, P098Y7_A494ForSer, P098Y7_A252CliCod
            }
            , new Object[] {
            P098Y8_A396EmprCod, P098Y8_A583IntCod, P098Y8_A831TipColCod, P098Y8_A483ForColNum, P098Y8_A482ForColNom, P098Y8_A494ForSer, P098Y8_A252CliCod
            }
            , new Object[] {
            P098Y9_A396EmprCod, P098Y9_A831TipColCod, P098Y9_A483ForColNum, P098Y9_A482ForColNom, P098Y9_A494ForSer, P098Y9_A252CliCod
            }
            , new Object[] {
            P098Y10_A396EmprCod, P098Y10_A130BarCodPar, P098Y10_A132BarCodReo, P098Y10_A129BarCod, P098Y10_A252CliCod, P098Y10_n252CliCod, P098Y10_A212BarSer, P098Y10_A135BarColNom, P098Y10_A136BarColNum, P098Y10_A218BarTipCol,
            P098Y10_A221BarTra1, P098Y10_A222BarTra2, P098Y10_A223BarTra3, P098Y10_A236BarVolMaq, P098Y10_A5253BarAcc, P098Y10_A180BarMaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV130ClaveC ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV49TipColCod ;
   private byte A831TipColCod ;
   private byte AV131barTipCol ;
   private byte AV132Ok_tc ;
   private byte A132BarCodReo ;
   private byte AV51IntCod ;
   private byte AV50FlagCol ;
   private byte AV97Ok_intens ;
   private byte A124BarAgrReo ;
   private byte AV100Ok_matiz ;
   private byte A583IntCod ;
   private byte AV26RelBany ;
   private byte A218BarTipCol ;
   private short AV67BarLinMaq ;
   private short AV80ClasCod ;
   private short A4295ClasCod ;
   private short A1160ProForL ;
   private short AV31Matiz ;
   private short A626MatCod ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int AV41BarCliCod ;
   private int AV48ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV127Clicodf ;
   private int AV52CliCod ;
   private int A1508CliCodAgr ;
   private int A119BarAgrCod ;
   private int A136BarColNum ;
   private int A236BarVolMaq ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV24Opcion ;
   private String AV134CC ;
   private String lV134CC ;
   private String scmdbuf ;
   private String AV46ForSer ;
   private String AV47ForColNom ;
   private String A1191ForNomCli ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV30CodMaq ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A120BarAgrEst ;
   private String A180BarMaqCod ;
   private String AV126Artcod ;
   private String AV114GruMaq ;
   private String AV105BarMaqCod ;
   private String AV81BarSer ;
   private String Gx_msg ;
   private String A65ArtCod ;
   private String A1245BarAgrSer ;
   private String A122BarAgrPar ;
   private String A764ProForCod ;
   private String AV39Proceso ;
   private String AV99BarAcc ;
   private String AV110BarTra1 ;
   private String AV111BarTra2 ;
   private String AV112BarTra3 ;
   private String AV72Color13_1 ;
   private String AV76BarSer34 ;
   private String A135BarColNom ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A5253BarAcc ;
   private boolean returnInSub ;
   private boolean n1191ForNomCli ;
   private boolean n252CliCod ;
   private boolean n4295ClasCod ;
   private short[] aP10 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P098Y2_A396EmprCod ;
   private String[] P098Y2_A1191ForNomCli ;
   private boolean[] P098Y2_n1191ForNomCli ;
   private byte[] P098Y2_A831TipColCod ;
   private int[] P098Y2_A483ForColNum ;
   private String[] P098Y2_A482ForColNom ;
   private String[] P098Y2_A494ForSer ;
   private int[] P098Y2_A252CliCod ;
   private boolean[] P098Y2_n252CliCod ;
   private String[] P098Y3_A396EmprCod ;
   private String[] P098Y3_A130BarCodPar ;
   private byte[] P098Y3_A132BarCodReo ;
   private int[] P098Y3_A129BarCod ;
   private String[] P098Y3_A212BarSer ;
   private int[] P098Y3_A252CliCod ;
   private boolean[] P098Y3_n252CliCod ;
   private String[] P098Y3_A120BarAgrEst ;
   private String[] P098Y3_A180BarMaqCod ;
   private String[] P098Y4_A396EmprCod ;
   private short[] P098Y4_A4295ClasCod ;
   private boolean[] P098Y4_n4295ClasCod ;
   private String[] P098Y4_A65ArtCod ;
   private int[] P098Y4_A252CliCod ;
   private boolean[] P098Y4_n252CliCod ;
   private String[] P098Y5_A396EmprCod ;
   private String[] P098Y5_A130BarCodPar ;
   private byte[] P098Y5_A132BarCodReo ;
   private int[] P098Y5_A129BarCod ;
   private String[] P098Y5_A1245BarAgrSer ;
   private int[] P098Y5_A1508CliCodAgr ;
   private int[] P098Y5_A119BarAgrCod ;
   private byte[] P098Y5_A124BarAgrReo ;
   private String[] P098Y5_A122BarAgrPar ;
   private String[] P098Y6_A396EmprCod ;
   private byte[] P098Y6_A831TipColCod ;
   private int[] P098Y6_A483ForColNum ;
   private String[] P098Y6_A482ForColNom ;
   private String[] P098Y6_A494ForSer ;
   private int[] P098Y6_A252CliCod ;
   private boolean[] P098Y6_n252CliCod ;
   private String[] P098Y6_A764ProForCod ;
   private short[] P098Y6_A1160ProForL ;
   private String[] P098Y7_A396EmprCod ;
   private short[] P098Y7_A626MatCod ;
   private byte[] P098Y7_A831TipColCod ;
   private int[] P098Y7_A483ForColNum ;
   private String[] P098Y7_A482ForColNom ;
   private String[] P098Y7_A494ForSer ;
   private int[] P098Y7_A252CliCod ;
   private boolean[] P098Y7_n252CliCod ;
   private String[] P098Y8_A396EmprCod ;
   private byte[] P098Y8_A583IntCod ;
   private byte[] P098Y8_A831TipColCod ;
   private int[] P098Y8_A483ForColNum ;
   private String[] P098Y8_A482ForColNom ;
   private String[] P098Y8_A494ForSer ;
   private int[] P098Y8_A252CliCod ;
   private boolean[] P098Y8_n252CliCod ;
   private String[] P098Y9_A396EmprCod ;
   private byte[] P098Y9_A831TipColCod ;
   private int[] P098Y9_A483ForColNum ;
   private String[] P098Y9_A482ForColNom ;
   private String[] P098Y9_A494ForSer ;
   private int[] P098Y9_A252CliCod ;
   private boolean[] P098Y9_n252CliCod ;
   private String[] P098Y10_A396EmprCod ;
   private String[] P098Y10_A130BarCodPar ;
   private byte[] P098Y10_A132BarCodReo ;
   private int[] P098Y10_A129BarCod ;
   private int[] P098Y10_A252CliCod ;
   private boolean[] P098Y10_n252CliCod ;
   private String[] P098Y10_A212BarSer ;
   private String[] P098Y10_A135BarColNom ;
   private int[] P098Y10_A136BarColNum ;
   private byte[] P098Y10_A218BarTipCol ;
   private String[] P098Y10_A221BarTra1 ;
   private String[] P098Y10_A222BarTra2 ;
   private String[] P098Y10_A223BarTra3 ;
   private int[] P098Y10_A236BarVolMaq ;
   private String[] P098Y10_A5253BarAcc ;
   private String[] P098Y10_A180BarMaqCod ;
}

final  class pdyrp006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P098Y2", "SELECT EmprCod, ForNomCli, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (ForNomCli like ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098Y3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSer, CliCod, BarAgrEst, BarMaqCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098Y4", "SELECT EmprCod, ClasCod, ArtCod, CliCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ClasCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098Y5", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrSer, CliCodAgr, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098Y6", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ProForCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098Y7", "SELECT EmprCod, MatCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (MatCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098Y8", "SELECT EmprCod, IntCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (IntCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098Y9", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098Y10", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarTra1, BarTra2, BarTra3, BarVolMaq, BarAcc, BarMaqCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 4);
               ((String[]) buf[11])[0] = rslt.getString(11, 4);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 6);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 2);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

