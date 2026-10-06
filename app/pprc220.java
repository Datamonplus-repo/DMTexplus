package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc220 extends GXProcedure
{
   public pprc220( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc220.class ), "" );
   }

   public pprc220( int remoteHandle ,
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
      pprc220.this.AV8EmprCod = aP0;
      pprc220.this.AV38Fecha1 = aP1;
      pprc220.this.AV39Fecha2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pprc220.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = AV8EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      pprc220.this.AV8EmprCod = GXv_char2[0] ;
      pprc220.this.AV11EmprNom = GXv_char3[0] ;
      pprc220.this.AV9UsurCod = GXv_char4[0] ;
      /* Using cursor P05TU2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV38Fecha1, AV39Fecha2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05TU2_A396EmprCod[0] ;
         A213BarSit = P05TU2_A213BarSit[0] ;
         A159BarFecGen = P05TU2_A159BarFecGen[0] ;
         A129BarCod = P05TU2_A129BarCod[0] ;
         A132BarCodReo = P05TU2_A132BarCodReo[0] ;
         A130BarCodPar = P05TU2_A130BarCodPar[0] ;
         A120BarAgrEst = P05TU2_A120BarAgrEst[0] ;
         A921BarMatiz = P05TU2_A921BarMatiz[0] ;
         A3594BarPriTin = P05TU2_A3594BarPriTin[0] ;
         A180BarMaqCod = P05TU2_A180BarMaqCod[0] ;
         AV34Maqcod = A180BarMaqCod ;
         /* Execute user subroutine: 'MAQUIN' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(AV31MaqEst, httpContext.getMessage( "A", "")) == 0 ) && ( AV32MaqPln == 1 ) && ( GXutil.strcmp(AV33MaqTip, httpContext.getMessage( "E", "")) == 0 ) )
         {
            AV35Barcodm = A129BarCod ;
            AV36Barcodreom = A132BarCodReo ;
            AV37Barcodparm = A130BarCodPar ;
            AV43Op = "" ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV35Barcodm, AV36Barcodreom, AV37Barcodparm) ;
               if ( ( A129BarCod == AV35Barcodm ) && ( A132BarCodReo == AV36Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV37Barcodparm) == 0 ) )
               {
                  AV43Op = "*" ;
               }
            }
            else
            {
               AV43Op = "*" ;
            }
            if ( GXutil.strcmp(AV43Op, "*") == 0 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_int5[0] = A129BarCod ;
               GXv_int6[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_int7[0] = AV13BarFasEst ;
               GXv_date8[0] = AV15fecha ;
               GXv_char2[0] = " " ;
               new app.pplat07(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_date8, GXv_char2) ;
               pprc220.this.A396EmprCod = GXv_char4[0] ;
               pprc220.this.A129BarCod = GXv_int5[0] ;
               pprc220.this.A132BarCodReo = GXv_int6[0] ;
               pprc220.this.A130BarCodPar = GXv_char3[0] ;
               pprc220.this.AV13BarFasEst = GXv_int7[0] ;
               pprc220.this.AV15fecha = GXv_date8[0] ;
               AV30Observacion = ((AV13BarFasEst==1) ? httpContext.getMessage( "Fase Tinte Iniciada,Cambio PP", "") : httpContext.getMessage( "Fase Tinte NO Iniciada,NO Cambio PP", "")) ;
               AV14RecPripla = (byte)(((AV13BarFasEst==1) ? 1 : A3594BarPriTin)) ;
               A3594BarPriTin = AV14RecPripla ;
               A921BarMatiz = (short)(0) ;
            }
         }
         /* Using cursor P05TU3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A921BarMatiz), Byte.valueOf(A3594BarPriTin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      new app.pcommit(remoteHandle, context).execute( ) ;
      /* Using cursor P05TU4 */
      pr_default.execute(2, new Object[] {AV8EmprCod, AV38Fecha1, AV39Fecha2});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P05TU4_A396EmprCod[0] ;
         A213BarSit = P05TU4_A213BarSit[0] ;
         A159BarFecGen = P05TU4_A159BarFecGen[0] ;
         A129BarCod = P05TU4_A129BarCod[0] ;
         A132BarCodReo = P05TU4_A132BarCodReo[0] ;
         A130BarCodPar = P05TU4_A130BarCodPar[0] ;
         A120BarAgrEst = P05TU4_A120BarAgrEst[0] ;
         A921BarMatiz = P05TU4_A921BarMatiz[0] ;
         A3594BarPriTin = P05TU4_A3594BarPriTin[0] ;
         A180BarMaqCod = P05TU4_A180BarMaqCod[0] ;
         AV34Maqcod = A180BarMaqCod ;
         /* Execute user subroutine: 'MAQUIN' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(AV31MaqEst, httpContext.getMessage( "A", "")) == 0 ) && ( AV32MaqPln == 1 ) && ( GXutil.strcmp(AV33MaqTip, httpContext.getMessage( "E", "")) == 0 ) )
         {
            AV35Barcodm = A129BarCod ;
            AV36Barcodreom = A132BarCodReo ;
            AV37Barcodparm = A130BarCodPar ;
            AV43Op = "" ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV35Barcodm, AV36Barcodreom, AV37Barcodparm) ;
               if ( ( A129BarCod == AV35Barcodm ) && ( A132BarCodReo == AV36Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV37Barcodparm) == 0 ) )
               {
                  AV43Op = "*" ;
               }
            }
            else
            {
               AV43Op = "*" ;
            }
            if ( GXutil.strcmp(AV43Op, "*") == 0 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_int5[0] = A129BarCod ;
               GXv_int7[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_int6[0] = AV13BarFasEst ;
               GXv_date8[0] = AV15fecha ;
               GXv_char2[0] = " " ;
               new app.pplat07(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int7, GXv_char3, GXv_int6, GXv_date8, GXv_char2) ;
               pprc220.this.A396EmprCod = GXv_char4[0] ;
               pprc220.this.A129BarCod = GXv_int5[0] ;
               pprc220.this.A132BarCodReo = GXv_int7[0] ;
               pprc220.this.A130BarCodPar = GXv_char3[0] ;
               pprc220.this.AV13BarFasEst = GXv_int6[0] ;
               pprc220.this.AV15fecha = GXv_date8[0] ;
               if ( AV13BarFasEst < 2 )
               {
                  if ( A3594BarPriTin < 80 )
                  {
                     AV16PP = A3594BarPriTin ;
                  }
                  else
                  {
                     AV17barcod = A129BarCod ;
                     AV18barcodreo = A132BarCodReo ;
                     AV19Barcodpar = A130BarCodPar ;
                     /* Execute user subroutine: 'BARFAS' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     GXv_char4[0] = AV8EmprCod ;
                     GXv_int5[0] = AV17barcod ;
                     GXv_int7[0] = AV18barcodreo ;
                     GXv_char3[0] = AV19Barcodpar ;
                     GXv_int9[0] = AV20BarOrdLin ;
                     GXv_char2[0] = " " ;
                     GXv_int6[0] = AV21BarfasestAnt ;
                     GXv_char10[0] = " " ;
                     GXv_int11[0] = (short)(0) ;
                     GXv_char12[0] = " " ;
                     GXv_int13[0] = (byte)(0) ;
                     GXv_char14[0] = " " ;
                     GXv_int15[0] = (short)(0) ;
                     new app.pprc39(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int7, GXv_char3, GXv_int9, GXv_char2, GXv_int6, GXv_char10, GXv_int11, GXv_char12, GXv_int13, GXv_char14, GXv_int15) ;
                     pprc220.this.AV8EmprCod = GXv_char4[0] ;
                     pprc220.this.AV17barcod = GXv_int5[0] ;
                     pprc220.this.AV18barcodreo = GXv_int7[0] ;
                     pprc220.this.AV19Barcodpar = GXv_char3[0] ;
                     pprc220.this.AV20BarOrdLin = GXv_int9[0] ;
                     pprc220.this.AV21BarfasestAnt = GXv_int6[0] ;
                     if ( AV21BarfasestAnt > 0 )
                     {
                        AV16PP = (byte)(AV16PP+1) ;
                        AV30Observacion = httpContext.getMessage( "Actualizo BarMatiz como auxiliar", "") ;
                        AV29Control = A180BarMaqCod + ";" + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + GXutil.str( A3594BarPriTin, 2, 0) + ";" + "0" + ";" + GXutil.str( AV16PP, 2, 0) + ";" + AV30Observacion + ";" + httpContext.getMessage( "Segunda Lectura, Fase Anteriore iniciadao finalizada", "") ;
                        A921BarMatiz = AV16PP ;
                     }
                  }
               }
            }
         }
         /* Using cursor P05TU5 */
         pr_default.execute(3, new Object[] {Short.valueOf(A921BarMatiz), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      new app.pcommit(remoteHandle, context).execute( ) ;
      /* Using cursor P05TU6 */
      pr_default.execute(4, new Object[] {AV8EmprCod, AV38Fecha1, AV39Fecha2});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A213BarSit = P05TU6_A213BarSit[0] ;
         A159BarFecGen = P05TU6_A159BarFecGen[0] ;
         A396EmprCod = P05TU6_A396EmprCod[0] ;
         A129BarCod = P05TU6_A129BarCod[0] ;
         A132BarCodReo = P05TU6_A132BarCodReo[0] ;
         A130BarCodPar = P05TU6_A130BarCodPar[0] ;
         A120BarAgrEst = P05TU6_A120BarAgrEst[0] ;
         A921BarMatiz = P05TU6_A921BarMatiz[0] ;
         A3594BarPriTin = P05TU6_A3594BarPriTin[0] ;
         A180BarMaqCod = P05TU6_A180BarMaqCod[0] ;
         AV34Maqcod = A180BarMaqCod ;
         /* Execute user subroutine: 'MAQUIN' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(AV31MaqEst, httpContext.getMessage( "A", "")) == 0 ) && ( AV32MaqPln == 1 ) && ( GXutil.strcmp(AV33MaqTip, httpContext.getMessage( "E", "")) == 0 ) )
         {
            AV35Barcodm = A129BarCod ;
            AV36Barcodreom = A132BarCodReo ;
            AV37Barcodparm = A130BarCodPar ;
            AV43Op = "" ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV35Barcodm, AV36Barcodreom, AV37Barcodparm) ;
               if ( ( A129BarCod == AV35Barcodm ) && ( A132BarCodReo == AV36Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV37Barcodparm) == 0 ) )
               {
                  AV43Op = "*" ;
               }
            }
            else
            {
               AV43Op = "*" ;
            }
            if ( GXutil.strcmp(AV43Op, "*") == 0 )
            {
               AV30Observacion = ((A921BarMatiz>0) ? httpContext.getMessage( "Cambio BarPritin", "") : httpContext.getMessage( "NO Cambio BarPritin", "")) ;
               AV29Control = A180BarMaqCod + ";" + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + GXutil.str( A3594BarPriTin, 2, 0) + ";" + ((A921BarMatiz>0) ? GXutil.str( A921BarMatiz, 3, 0) : GXutil.str( A3594BarPriTin, 2, 0)) + ";" + "0" + ";" + AV30Observacion + ";" + httpContext.getMessage( "Tercera Lectura, Actualizo BarPritin f(BarPritin)", "") ;
               AV29Control = httpContext.getMessage( "Maquina", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Item BarPritin", "") + ";" + httpContext.getMessage( "Var &RecPriPla", "") + ";" + httpContext.getMessage( "Item BarMatiz", "") + ";" + httpContext.getMessage( "Observacion", "") + ";" + httpContext.getMessage( "Descripcion", "") ;
               A3594BarPriTin = (byte)(((A921BarMatiz>0) ? A921BarMatiz : A3594BarPriTin)) ;
            }
         }
         /* Using cursor P05TU7 */
         pr_default.execute(5, new Object[] {Byte.valueOf(A3594BarPriTin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(4);
      }
      pr_default.close(4);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV20BarOrdLin = (short)(0) ;
      /* Using cursor P05TU8 */
      pr_default.execute(6, new Object[] {AV8EmprCod, Integer.valueOf(AV17barcod), Byte.valueOf(AV18barcodreo), AV19Barcodpar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A150BarFacTin = P05TU8_A150BarFacTin[0] ;
         A130BarCodPar = P05TU8_A130BarCodPar[0] ;
         A132BarCodReo = P05TU8_A132BarCodReo[0] ;
         A129BarCod = P05TU8_A129BarCod[0] ;
         A396EmprCod = P05TU8_A396EmprCod[0] ;
         A194BarOrdLin = P05TU8_A194BarOrdLin[0] ;
         A758ProCod = P05TU8_A758ProCod[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV20BarOrdLin = A194BarOrdLin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S121( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV31MaqEst = "" ;
      AV32MaqPln = (byte)(0) ;
      AV33MaqTip = " " ;
      /* Using cursor P05TU9 */
      pr_default.execute(7, new Object[] {AV8EmprCod, AV34Maqcod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A602MaqCod = P05TU9_A602MaqCod[0] ;
         A396EmprCod = P05TU9_A396EmprCod[0] ;
         A607MaqEst = P05TU9_A607MaqEst[0] ;
         n607MaqEst = P05TU9_n607MaqEst[0] ;
         A6432MaqPln = P05TU9_A6432MaqPln[0] ;
         n6432MaqPln = P05TU9_n6432MaqPln[0] ;
         A620MaqTip = P05TU9_A620MaqTip[0] ;
         n620MaqTip = P05TU9_n620MaqTip[0] ;
         AV31MaqEst = A607MaqEst ;
         AV32MaqPln = A6432MaqPln ;
         AV33MaqTip = A620MaqTip ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc220");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Station = "" ;
      GXt_char1 = "" ;
      AV11EmprNom = "" ;
      AV9UsurCod = "" ;
      scmdbuf = "" ;
      P05TU2_A396EmprCod = new String[] {""} ;
      P05TU2_A213BarSit = new byte[1] ;
      P05TU2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05TU2_A129BarCod = new int[1] ;
      P05TU2_A132BarCodReo = new byte[1] ;
      P05TU2_A130BarCodPar = new String[] {""} ;
      P05TU2_A120BarAgrEst = new String[] {""} ;
      P05TU2_A921BarMatiz = new short[1] ;
      P05TU2_A3594BarPriTin = new byte[1] ;
      P05TU2_A180BarMaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A180BarMaqCod = "" ;
      AV34Maqcod = "" ;
      AV31MaqEst = "" ;
      AV33MaqTip = "" ;
      AV37Barcodparm = "" ;
      AV43Op = "" ;
      AV15fecha = GXutil.nullDate() ;
      AV30Observacion = "" ;
      P05TU4_A396EmprCod = new String[] {""} ;
      P05TU4_A213BarSit = new byte[1] ;
      P05TU4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05TU4_A129BarCod = new int[1] ;
      P05TU4_A132BarCodReo = new byte[1] ;
      P05TU4_A130BarCodPar = new String[] {""} ;
      P05TU4_A120BarAgrEst = new String[] {""} ;
      P05TU4_A921BarMatiz = new short[1] ;
      P05TU4_A3594BarPriTin = new byte[1] ;
      P05TU4_A180BarMaqCod = new String[] {""} ;
      GXv_date8 = new java.util.Date[1] ;
      AV19Barcodpar = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new short[1] ;
      AV29Control = "" ;
      P05TU6_A213BarSit = new byte[1] ;
      P05TU6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05TU6_A396EmprCod = new String[] {""} ;
      P05TU6_A129BarCod = new int[1] ;
      P05TU6_A132BarCodReo = new byte[1] ;
      P05TU6_A130BarCodPar = new String[] {""} ;
      P05TU6_A120BarAgrEst = new String[] {""} ;
      P05TU6_A921BarMatiz = new short[1] ;
      P05TU6_A3594BarPriTin = new byte[1] ;
      P05TU6_A180BarMaqCod = new String[] {""} ;
      P05TU8_A150BarFacTin = new String[] {""} ;
      P05TU8_A130BarCodPar = new String[] {""} ;
      P05TU8_A132BarCodReo = new byte[1] ;
      P05TU8_A129BarCod = new int[1] ;
      P05TU8_A396EmprCod = new String[] {""} ;
      P05TU8_A194BarOrdLin = new short[1] ;
      P05TU8_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      P05TU9_A602MaqCod = new String[] {""} ;
      P05TU9_A396EmprCod = new String[] {""} ;
      P05TU9_A607MaqEst = new String[] {""} ;
      P05TU9_n607MaqEst = new boolean[] {false} ;
      P05TU9_A6432MaqPln = new byte[1] ;
      P05TU9_n6432MaqPln = new boolean[] {false} ;
      P05TU9_A620MaqTip = new String[] {""} ;
      P05TU9_n620MaqTip = new boolean[] {false} ;
      A602MaqCod = "" ;
      A607MaqEst = "" ;
      A620MaqTip = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc220__default(),
         new Object[] {
             new Object[] {
            P05TU2_A396EmprCod, P05TU2_A213BarSit, P05TU2_A159BarFecGen, P05TU2_A129BarCod, P05TU2_A132BarCodReo, P05TU2_A130BarCodPar, P05TU2_A120BarAgrEst, P05TU2_A921BarMatiz, P05TU2_A3594BarPriTin, P05TU2_A180BarMaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05TU4_A396EmprCod, P05TU4_A213BarSit, P05TU4_A159BarFecGen, P05TU4_A129BarCod, P05TU4_A132BarCodReo, P05TU4_A130BarCodPar, P05TU4_A120BarAgrEst, P05TU4_A921BarMatiz, P05TU4_A3594BarPriTin, P05TU4_A180BarMaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05TU6_A213BarSit, P05TU6_A159BarFecGen, P05TU6_A396EmprCod, P05TU6_A129BarCod, P05TU6_A132BarCodReo, P05TU6_A130BarCodPar, P05TU6_A120BarAgrEst, P05TU6_A921BarMatiz, P05TU6_A3594BarPriTin, P05TU6_A180BarMaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05TU8_A150BarFacTin, P05TU8_A130BarCodPar, P05TU8_A132BarCodReo, P05TU8_A129BarCod, P05TU8_A396EmprCod, P05TU8_A194BarOrdLin, P05TU8_A758ProCod
            }
            , new Object[] {
            P05TU9_A602MaqCod, P05TU9_A396EmprCod, P05TU9_A607MaqEst, P05TU9_n607MaqEst, P05TU9_A6432MaqPln, P05TU9_n6432MaqPln, P05TU9_A620MaqTip, P05TU9_n620MaqTip
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A3594BarPriTin ;
   private byte AV32MaqPln ;
   private byte AV36Barcodreom ;
   private byte AV13BarFasEst ;
   private byte AV14RecPripla ;
   private byte AV16PP ;
   private byte AV18barcodreo ;
   private byte GXv_int7[] ;
   private byte AV21BarfasestAnt ;
   private byte GXv_int6[] ;
   private byte GXv_int13[] ;
   private byte A6432MaqPln ;
   private short A921BarMatiz ;
   private short AV20BarOrdLin ;
   private short GXv_int9[] ;
   private short GXv_int11[] ;
   private short GXv_int15[] ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV35Barcodm ;
   private int AV17barcod ;
   private int GXv_int5[] ;
   private String AV8EmprCod ;
   private String AV10Station ;
   private String GXt_char1 ;
   private String AV11EmprNom ;
   private String AV9UsurCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A180BarMaqCod ;
   private String AV34Maqcod ;
   private String AV31MaqEst ;
   private String AV33MaqTip ;
   private String AV37Barcodparm ;
   private String AV43Op ;
   private String AV30Observacion ;
   private String AV19Barcodpar ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private String GXv_char12[] ;
   private String GXv_char14[] ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String A602MaqCod ;
   private String A607MaqEst ;
   private String A620MaqTip ;
   private java.util.Date AV38Fecha1 ;
   private java.util.Date AV39Fecha2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV15fecha ;
   private java.util.Date GXv_date8[] ;
   private boolean returnInSub ;
   private boolean n607MaqEst ;
   private boolean n6432MaqPln ;
   private boolean n620MaqTip ;
   private String AV29Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05TU2_A396EmprCod ;
   private byte[] P05TU2_A213BarSit ;
   private java.util.Date[] P05TU2_A159BarFecGen ;
   private int[] P05TU2_A129BarCod ;
   private byte[] P05TU2_A132BarCodReo ;
   private String[] P05TU2_A130BarCodPar ;
   private String[] P05TU2_A120BarAgrEst ;
   private short[] P05TU2_A921BarMatiz ;
   private byte[] P05TU2_A3594BarPriTin ;
   private String[] P05TU2_A180BarMaqCod ;
   private String[] P05TU4_A396EmprCod ;
   private byte[] P05TU4_A213BarSit ;
   private java.util.Date[] P05TU4_A159BarFecGen ;
   private int[] P05TU4_A129BarCod ;
   private byte[] P05TU4_A132BarCodReo ;
   private String[] P05TU4_A130BarCodPar ;
   private String[] P05TU4_A120BarAgrEst ;
   private short[] P05TU4_A921BarMatiz ;
   private byte[] P05TU4_A3594BarPriTin ;
   private String[] P05TU4_A180BarMaqCod ;
   private byte[] P05TU6_A213BarSit ;
   private java.util.Date[] P05TU6_A159BarFecGen ;
   private String[] P05TU6_A396EmprCod ;
   private int[] P05TU6_A129BarCod ;
   private byte[] P05TU6_A132BarCodReo ;
   private String[] P05TU6_A130BarCodPar ;
   private String[] P05TU6_A120BarAgrEst ;
   private short[] P05TU6_A921BarMatiz ;
   private byte[] P05TU6_A3594BarPriTin ;
   private String[] P05TU6_A180BarMaqCod ;
   private String[] P05TU8_A150BarFacTin ;
   private String[] P05TU8_A130BarCodPar ;
   private byte[] P05TU8_A132BarCodReo ;
   private int[] P05TU8_A129BarCod ;
   private String[] P05TU8_A396EmprCod ;
   private short[] P05TU8_A194BarOrdLin ;
   private String[] P05TU8_A758ProCod ;
   private String[] P05TU9_A602MaqCod ;
   private String[] P05TU9_A396EmprCod ;
   private String[] P05TU9_A607MaqEst ;
   private boolean[] P05TU9_n607MaqEst ;
   private byte[] P05TU9_A6432MaqPln ;
   private boolean[] P05TU9_n6432MaqPln ;
   private String[] P05TU9_A620MaqTip ;
   private boolean[] P05TU9_n620MaqTip ;
}

final  class pprc220__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05TU2", "SELECT EmprCod, BarSit, BarFecGen, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMatiz, BarPriTin, BarMaqCod FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarFecGen >= ?) AND (BarFecGen <= ?) AND (BarSit < 5) ORDER BY EmprCod, BarMaqCod, BarPriTin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05TU3", "UPDATE TXPBARCAD SET BarMatiz=?, BarPriTin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P05TU4", "SELECT EmprCod, BarSit, BarFecGen, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMatiz, BarPriTin, BarMaqCod FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarFecGen >= ?) AND (BarFecGen <= ?) AND (BarSit < 5) ORDER BY EmprCod, BarMaqCod, BarPriTin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05TU5", "UPDATE TXPBARCAD SET BarMatiz=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P05TU6", "SELECT BarSit, BarFecGen, EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMatiz, BarPriTin, BarMaqCod FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarFecGen >= ?) AND (BarFecGen <= ?) AND (BarSit < 5) ORDER BY EmprCod, BarMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05TU7", "UPDATE TXPBARCAD SET BarPriTin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P05TU8", "SELECT BarFacTin, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05TU9", "SELECT MaqCod, EmprCod, MaqEst, MaqPln, MaqTip FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

