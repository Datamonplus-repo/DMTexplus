package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptablal extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptablal pgm = new aptablal (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptablal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptablal.class ), "" );
   }

   public aptablal( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV22Emprcod ;
      GXv_char2[0] = AV23EmprNom ;
      GXv_char3[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char1, GXv_char2, GXv_char3) ;
      aptablal.this.AV22Emprcod = GXv_char1[0] ;
      aptablal.this.AV23EmprNom = GXv_char2[0] ;
      aptablal.this.AV24Usurcod = GXv_char3[0] ;
      System.out.println( httpContext.getMessage( "Tabla Dt005...", "") );
      /* Using cursor P03Y12 */
      pr_default.execute(0, new Object[] {AV22Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7934Dtb_Ordl = P03Y12_A7934Dtb_Ordl[0] ;
         A194BarOrdLin = P03Y12_A194BarOrdLin[0] ;
         A758ProCod = P03Y12_A758ProCod[0] ;
         A130BarCodPar = P03Y12_A130BarCodPar[0] ;
         A132BarCodReo = P03Y12_A132BarCodReo[0] ;
         A129BarCod = P03Y12_A129BarCod[0] ;
         A396EmprCod = P03Y12_A396EmprCod[0] ;
         AV17Barcod = A129BarCod ;
         AV19Barcodreo = A132BarCodReo ;
         AV18Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV20TBarpie == 0 )
         {
            /* Optimized DELETE. */
            /* Using cursor P03Y13 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
            /* End optimized DELETE. */
            /* Using cursor P03Y14 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Tabla Dt000...", "") );
      /* Using cursor P03Y15 */
      pr_default.execute(3, new Object[] {AV22Emprcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A7870Dt_Orden = P03Y15_A7870Dt_Orden[0] ;
         A7869Dt_Opp = P03Y15_A7869Dt_Opp[0] ;
         A7868Dt_Opr = P03Y15_A7868Dt_Opr[0] ;
         A7867Dt_Op = P03Y15_A7867Dt_Op[0] ;
         A396EmprCod = P03Y15_A396EmprCod[0] ;
         AV17Barcod = A7867Dt_Op ;
         AV19Barcodreo = A7868Dt_Opr ;
         AV18Barcodpar = A7869Dt_Opp ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV20TBarpie == 0 )
         {
            /* Using cursor P03Y16 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A7891Dt_Ordl = P03Y16_A7891Dt_Ordl[0] ;
               /* Optimized DELETE. */
               /* Using cursor P03Y17 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0011");
               /* End optimized DELETE. */
               /* Using cursor P03Y18 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT001");
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P03Y19 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT000");
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      System.out.println( httpContext.getMessage( "Tabla audfi0...", "") );
      /* Using cursor P03Y110 */
      pr_default.execute(8, new Object[] {AV22Emprcod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A7173Auf_codpar = P03Y110_A7173Auf_codpar[0] ;
         A7172Auf_codreo = P03Y110_A7172Auf_codreo[0] ;
         A7171Auf_barcod = P03Y110_A7171Auf_barcod[0] ;
         A396EmprCod = P03Y110_A396EmprCod[0] ;
         A7528Auf_UltNum = P03Y110_A7528Auf_UltNum[0] ;
         n7528Auf_UltNum = P03Y110_n7528Auf_UltNum[0] ;
         AV17Barcod = A7171Auf_barcod ;
         AV19Barcodreo = A7172Auf_codreo ;
         AV18Barcodpar = A7173Auf_codpar ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV20TBarpie == 0 )
         {
            /* Using cursor P03Y111 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A7171Auf_barcod), Byte.valueOf(A7172Auf_codreo), A7173Auf_codpar});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A7527Auf_NumAud = P03Y111_A7527Auf_NumAud[0] ;
               /* Optimized DELETE. */
               /* Using cursor P03Y112 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A7171Auf_barcod), Byte.valueOf(A7172Auf_codreo), A7173Auf_codpar, Short.valueOf(A7527Auf_NumAud)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDFI1");
               /* End optimized DELETE. */
               /* Using cursor P03Y113 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A7171Auf_barcod), Byte.valueOf(A7172Auf_codreo), A7173Auf_codpar, Short.valueOf(A7527Auf_NumAud)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDFIN");
               pr_default.readNext(9);
            }
            pr_default.close(9);
            /* Using cursor P03Y114 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A7171Auf_barcod), Byte.valueOf(A7172Auf_codreo), A7173Auf_codpar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDFI0");
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
      System.out.println( httpContext.getMessage( "Tabla audin0...", "") );
      /* Using cursor P03Y115 */
      pr_default.execute(13, new Object[] {AV22Emprcod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A7188Aui_codpar = P03Y115_A7188Aui_codpar[0] ;
         A7187Aui_codreo = P03Y115_A7187Aui_codreo[0] ;
         A7186Aui_barcod = P03Y115_A7186Aui_barcod[0] ;
         A396EmprCod = P03Y115_A396EmprCod[0] ;
         A7416Aui_UltNum = P03Y115_A7416Aui_UltNum[0] ;
         n7416Aui_UltNum = P03Y115_n7416Aui_UltNum[0] ;
         AV17Barcod = A7186Aui_barcod ;
         AV19Barcodreo = A7187Aui_codreo ;
         AV18Barcodpar = A7188Aui_codpar ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(13);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV20TBarpie == 0 )
         {
            /* Using cursor P03Y116 */
            pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A7186Aui_barcod), Byte.valueOf(A7187Aui_codreo), A7188Aui_codpar});
            while ( (pr_default.getStatus(14) != 101) )
            {
               A7417Aui_NumAud = P03Y116_A7417Aui_NumAud[0] ;
               /* Optimized DELETE. */
               /* Using cursor P03Y117 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A7186Aui_barcod), Byte.valueOf(A7187Aui_codreo), A7188Aui_codpar, Short.valueOf(A7417Aui_NumAud)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDIN1");
               /* End optimized DELETE. */
               /* Using cursor P03Y118 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A7186Aui_barcod), Byte.valueOf(A7187Aui_codreo), A7188Aui_codpar, Short.valueOf(A7417Aui_NumAud)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDINT");
               pr_default.readNext(14);
            }
            pr_default.close(14);
            /* Using cursor P03Y119 */
            pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A7186Aui_barcod), Byte.valueOf(A7187Aui_codreo), A7188Aui_codpar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDIN0");
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
      System.out.println( httpContext.getMessage( "Tabla audop0...", "") );
      /* Using cursor P03Y120 */
      pr_default.execute(18, new Object[] {AV22Emprcod});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A7247Aud_Hdrp = P03Y120_A7247Aud_Hdrp[0] ;
         A7246Aud_Hdrr = P03Y120_A7246Aud_Hdrr[0] ;
         A7245Aud_Hdr = P03Y120_A7245Aud_Hdr[0] ;
         A396EmprCod = P03Y120_A396EmprCod[0] ;
         A7248Aud_UltL = P03Y120_A7248Aud_UltL[0] ;
         n7248Aud_UltL = P03Y120_n7248Aud_UltL[0] ;
         AV17Barcod = A7245Aud_Hdr ;
         AV19Barcodreo = A7246Aud_Hdrr ;
         AV18Barcodpar = A7247Aud_Hdrp ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(18);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV20TBarpie == 0 )
         {
            /* Optimized DELETE. */
            /* Using cursor P03Y121 */
            pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOP1");
            /* End optimized DELETE. */
            /* Using cursor P03Y122 */
            pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOPO");
         }
         pr_default.readNext(18);
      }
      pr_default.close(18);
      System.out.println( httpContext.getMessage( "Tabla XLFORM  ...", "") );
      /* Using cursor P03Y123 */
      pr_default.execute(21, new Object[] {AV22Emprcod});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A396EmprCod = P03Y123_A396EmprCod[0] ;
         A5577XUltLinF = P03Y123_A5577XUltLinF[0] ;
         n5577XUltLinF = P03Y123_n5577XUltLinF[0] ;
         A5581XCodParf = P03Y123_A5581XCodParf[0] ;
         A5580XCodReof = P03Y123_A5580XCodReof[0] ;
         A5579XBarCodf = P03Y123_A5579XBarCodf[0] ;
         A5571XCliCodf = P03Y123_A5571XCliCodf[0] ;
         A5572XForSer = P03Y123_A5572XForSer[0] ;
         A5573XForColNom = P03Y123_A5573XForColNom[0] ;
         A5574XForColNum = P03Y123_A5574XForColNum[0] ;
         A5575XTipColCod = P03Y123_A5575XTipColCod[0] ;
         AV17Barcod = A5579XBarCodf ;
         AV19Barcodreo = A5580XCodReof ;
         AV18Barcodpar = A5581XCodParf ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(21);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV20TBarpie == 0 )
         {
            /* Using cursor P03Y124 */
            pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFORM");
         }
         pr_default.readNext(21);
      }
      pr_default.close(21);
      /* Using cursor P03Y125 */
      pr_default.execute(23, new Object[] {AV22Emprcod});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A396EmprCod = P03Y125_A396EmprCod[0] ;
         A5576XProForCod = P03Y125_A5576XProForCod[0] ;
         n5576XProForCod = P03Y125_n5576XProForCod[0] ;
         A5581XCodParf = P03Y125_A5581XCodParf[0] ;
         A5580XCodReof = P03Y125_A5580XCodReof[0] ;
         A5579XBarCodf = P03Y125_A5579XBarCodf[0] ;
         A5571XCliCodf = P03Y125_A5571XCliCodf[0] ;
         A5572XForSer = P03Y125_A5572XForSer[0] ;
         A5573XForColNom = P03Y125_A5573XForColNom[0] ;
         A5574XForColNum = P03Y125_A5574XForColNum[0] ;
         A5575XTipColCod = P03Y125_A5575XTipColCod[0] ;
         A5578XProForLn = P03Y125_A5578XProForLn[0] ;
         AV17Barcod = A5579XBarCodf ;
         AV19Barcodreo = A5580XCodReof ;
         AV18Barcodpar = A5581XCodParf ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(23);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV20TBarpie == 0 )
         {
            /* Using cursor P03Y126 */
            pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf, Short.valueOf(A5578XProForLn)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFOR1");
         }
         pr_default.readNext(23);
      }
      pr_default.close(23);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Proceso", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV20TBarpie = (byte)(0) ;
      /* Using cursor P03Y127 */
      pr_default.execute(25, new Object[] {AV22Emprcod, Integer.valueOf(AV17Barcod), Byte.valueOf(AV19Barcodreo), AV18Barcodpar});
      while ( (pr_default.getStatus(25) != 101) )
      {
         A130BarCodPar = P03Y127_A130BarCodPar[0] ;
         A132BarCodReo = P03Y127_A132BarCodReo[0] ;
         A129BarCod = P03Y127_A129BarCod[0] ;
         A396EmprCod = P03Y127_A396EmprCod[0] ;
         AV20TBarpie = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(25);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptablal.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptablal");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Station = "" ;
      AV22Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV23EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV24Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P03Y12_A7934Dtb_Ordl = new short[1] ;
      P03Y12_A194BarOrdLin = new short[1] ;
      P03Y12_A758ProCod = new String[] {""} ;
      P03Y12_A130BarCodPar = new String[] {""} ;
      P03Y12_A132BarCodReo = new byte[1] ;
      P03Y12_A129BarCod = new int[1] ;
      P03Y12_A396EmprCod = new String[] {""} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV18Barcodpar = "" ;
      P03Y15_A7870Dt_Orden = new short[1] ;
      P03Y15_A7869Dt_Opp = new String[] {""} ;
      P03Y15_A7868Dt_Opr = new byte[1] ;
      P03Y15_A7867Dt_Op = new int[1] ;
      P03Y15_A396EmprCod = new String[] {""} ;
      A7869Dt_Opp = "" ;
      P03Y16_A396EmprCod = new String[] {""} ;
      P03Y16_A7867Dt_Op = new int[1] ;
      P03Y16_A7868Dt_Opr = new byte[1] ;
      P03Y16_A7869Dt_Opp = new String[] {""} ;
      P03Y16_A7870Dt_Orden = new short[1] ;
      P03Y16_A7891Dt_Ordl = new short[1] ;
      P03Y110_A7173Auf_codpar = new String[] {""} ;
      P03Y110_A7172Auf_codreo = new byte[1] ;
      P03Y110_A7171Auf_barcod = new int[1] ;
      P03Y110_A396EmprCod = new String[] {""} ;
      P03Y110_A7528Auf_UltNum = new short[1] ;
      P03Y110_n7528Auf_UltNum = new boolean[] {false} ;
      A7173Auf_codpar = "" ;
      P03Y111_A396EmprCod = new String[] {""} ;
      P03Y111_A7171Auf_barcod = new int[1] ;
      P03Y111_A7172Auf_codreo = new byte[1] ;
      P03Y111_A7173Auf_codpar = new String[] {""} ;
      P03Y111_A7527Auf_NumAud = new short[1] ;
      P03Y115_A7188Aui_codpar = new String[] {""} ;
      P03Y115_A7187Aui_codreo = new byte[1] ;
      P03Y115_A7186Aui_barcod = new int[1] ;
      P03Y115_A396EmprCod = new String[] {""} ;
      P03Y115_A7416Aui_UltNum = new short[1] ;
      P03Y115_n7416Aui_UltNum = new boolean[] {false} ;
      A7188Aui_codpar = "" ;
      P03Y116_A396EmprCod = new String[] {""} ;
      P03Y116_A7186Aui_barcod = new int[1] ;
      P03Y116_A7187Aui_codreo = new byte[1] ;
      P03Y116_A7188Aui_codpar = new String[] {""} ;
      P03Y116_A7417Aui_NumAud = new short[1] ;
      P03Y120_A7247Aud_Hdrp = new String[] {""} ;
      P03Y120_A7246Aud_Hdrr = new byte[1] ;
      P03Y120_A7245Aud_Hdr = new int[1] ;
      P03Y120_A396EmprCod = new String[] {""} ;
      P03Y120_A7248Aud_UltL = new int[1] ;
      P03Y120_n7248Aud_UltL = new boolean[] {false} ;
      A7247Aud_Hdrp = "" ;
      P03Y123_A396EmprCod = new String[] {""} ;
      P03Y123_A5577XUltLinF = new short[1] ;
      P03Y123_n5577XUltLinF = new boolean[] {false} ;
      P03Y123_A5581XCodParf = new String[] {""} ;
      P03Y123_A5580XCodReof = new byte[1] ;
      P03Y123_A5579XBarCodf = new int[1] ;
      P03Y123_A5571XCliCodf = new int[1] ;
      P03Y123_A5572XForSer = new String[] {""} ;
      P03Y123_A5573XForColNom = new String[] {""} ;
      P03Y123_A5574XForColNum = new int[1] ;
      P03Y123_A5575XTipColCod = new byte[1] ;
      A5581XCodParf = "" ;
      A5572XForSer = "" ;
      A5573XForColNom = "" ;
      P03Y125_A396EmprCod = new String[] {""} ;
      P03Y125_A5576XProForCod = new String[] {""} ;
      P03Y125_n5576XProForCod = new boolean[] {false} ;
      P03Y125_A5581XCodParf = new String[] {""} ;
      P03Y125_A5580XCodReof = new byte[1] ;
      P03Y125_A5579XBarCodf = new int[1] ;
      P03Y125_A5571XCliCodf = new int[1] ;
      P03Y125_A5572XForSer = new String[] {""} ;
      P03Y125_A5573XForColNom = new String[] {""} ;
      P03Y125_A5574XForColNum = new int[1] ;
      P03Y125_A5575XTipColCod = new byte[1] ;
      P03Y125_A5578XProForLn = new short[1] ;
      A5576XProForCod = "" ;
      P03Y127_A130BarCodPar = new String[] {""} ;
      P03Y127_A132BarCodReo = new byte[1] ;
      P03Y127_A129BarCod = new int[1] ;
      P03Y127_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptablal__default(),
         new Object[] {
             new Object[] {
            P03Y12_A7934Dtb_Ordl, P03Y12_A194BarOrdLin, P03Y12_A758ProCod, P03Y12_A130BarCodPar, P03Y12_A132BarCodReo, P03Y12_A129BarCod, P03Y12_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03Y15_A7870Dt_Orden, P03Y15_A7869Dt_Opp, P03Y15_A7868Dt_Opr, P03Y15_A7867Dt_Op, P03Y15_A396EmprCod
            }
            , new Object[] {
            P03Y16_A396EmprCod, P03Y16_A7867Dt_Op, P03Y16_A7868Dt_Opr, P03Y16_A7869Dt_Opp, P03Y16_A7870Dt_Orden, P03Y16_A7891Dt_Ordl
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03Y110_A7173Auf_codpar, P03Y110_A7172Auf_codreo, P03Y110_A7171Auf_barcod, P03Y110_A396EmprCod, P03Y110_A7528Auf_UltNum, P03Y110_n7528Auf_UltNum
            }
            , new Object[] {
            P03Y111_A396EmprCod, P03Y111_A7171Auf_barcod, P03Y111_A7172Auf_codreo, P03Y111_A7173Auf_codpar, P03Y111_A7527Auf_NumAud
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03Y115_A7188Aui_codpar, P03Y115_A7187Aui_codreo, P03Y115_A7186Aui_barcod, P03Y115_A396EmprCod, P03Y115_A7416Aui_UltNum, P03Y115_n7416Aui_UltNum
            }
            , new Object[] {
            P03Y116_A396EmprCod, P03Y116_A7186Aui_barcod, P03Y116_A7187Aui_codreo, P03Y116_A7188Aui_codpar, P03Y116_A7417Aui_NumAud
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03Y120_A7247Aud_Hdrp, P03Y120_A7246Aud_Hdrr, P03Y120_A7245Aud_Hdr, P03Y120_A396EmprCod, P03Y120_A7248Aud_UltL, P03Y120_n7248Aud_UltL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03Y123_A396EmprCod, P03Y123_A5577XUltLinF, P03Y123_n5577XUltLinF, P03Y123_A5581XCodParf, P03Y123_A5580XCodReof, P03Y123_A5579XBarCodf, P03Y123_A5571XCliCodf, P03Y123_A5572XForSer, P03Y123_A5573XForColNom, P03Y123_A5574XForColNum,
            P03Y123_A5575XTipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03Y125_A396EmprCod, P03Y125_A5576XProForCod, P03Y125_n5576XProForCod, P03Y125_A5581XCodParf, P03Y125_A5580XCodReof, P03Y125_A5579XBarCodf, P03Y125_A5571XCliCodf, P03Y125_A5572XForSer, P03Y125_A5573XForColNom, P03Y125_A5574XForColNum,
            P03Y125_A5575XTipColCod, P03Y125_A5578XProForLn
            }
            , new Object[] {
            }
            , new Object[] {
            P03Y127_A130BarCodPar, P03Y127_A132BarCodReo, P03Y127_A129BarCod, P03Y127_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV19Barcodreo ;
   private byte AV20TBarpie ;
   private byte A7868Dt_Opr ;
   private byte A7172Auf_codreo ;
   private byte A7187Aui_codreo ;
   private byte A7246Aud_Hdrr ;
   private byte A5580XCodReof ;
   private byte A5575XTipColCod ;
   private short A7934Dtb_Ordl ;
   private short A194BarOrdLin ;
   private short A7870Dt_Orden ;
   private short A7891Dt_Ordl ;
   private short A7528Auf_UltNum ;
   private short A7527Auf_NumAud ;
   private short A7416Aui_UltNum ;
   private short A7417Aui_NumAud ;
   private short A5577XUltLinF ;
   private short A5578XProForLn ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17Barcod ;
   private int A7867Dt_Op ;
   private int A7171Auf_barcod ;
   private int A7186Aui_barcod ;
   private int A7245Aud_Hdr ;
   private int A7248Aud_UltL ;
   private int A5579XBarCodf ;
   private int A5571XCliCodf ;
   private int A5574XForColNum ;
   private String AV21Station ;
   private String AV22Emprcod ;
   private String GXv_char1[] ;
   private String AV23EmprNom ;
   private String GXv_char2[] ;
   private String AV24Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV18Barcodpar ;
   private String A7869Dt_Opp ;
   private String A7173Auf_codpar ;
   private String A7188Aui_codpar ;
   private String A7247Aud_Hdrp ;
   private String A5581XCodParf ;
   private String A5572XForSer ;
   private String A5573XForColNom ;
   private String A5576XProForCod ;
   private boolean returnInSub ;
   private boolean n7528Auf_UltNum ;
   private boolean n7416Aui_UltNum ;
   private boolean n7248Aud_UltL ;
   private boolean n5577XUltLinF ;
   private boolean n5576XProForCod ;
   private IDataStoreProvider pr_default ;
   private short[] P03Y12_A7934Dtb_Ordl ;
   private short[] P03Y12_A194BarOrdLin ;
   private String[] P03Y12_A758ProCod ;
   private String[] P03Y12_A130BarCodPar ;
   private byte[] P03Y12_A132BarCodReo ;
   private int[] P03Y12_A129BarCod ;
   private String[] P03Y12_A396EmprCod ;
   private short[] P03Y15_A7870Dt_Orden ;
   private String[] P03Y15_A7869Dt_Opp ;
   private byte[] P03Y15_A7868Dt_Opr ;
   private int[] P03Y15_A7867Dt_Op ;
   private String[] P03Y15_A396EmprCod ;
   private String[] P03Y16_A396EmprCod ;
   private int[] P03Y16_A7867Dt_Op ;
   private byte[] P03Y16_A7868Dt_Opr ;
   private String[] P03Y16_A7869Dt_Opp ;
   private short[] P03Y16_A7870Dt_Orden ;
   private short[] P03Y16_A7891Dt_Ordl ;
   private String[] P03Y110_A7173Auf_codpar ;
   private byte[] P03Y110_A7172Auf_codreo ;
   private int[] P03Y110_A7171Auf_barcod ;
   private String[] P03Y110_A396EmprCod ;
   private short[] P03Y110_A7528Auf_UltNum ;
   private boolean[] P03Y110_n7528Auf_UltNum ;
   private String[] P03Y111_A396EmprCod ;
   private int[] P03Y111_A7171Auf_barcod ;
   private byte[] P03Y111_A7172Auf_codreo ;
   private String[] P03Y111_A7173Auf_codpar ;
   private short[] P03Y111_A7527Auf_NumAud ;
   private String[] P03Y115_A7188Aui_codpar ;
   private byte[] P03Y115_A7187Aui_codreo ;
   private int[] P03Y115_A7186Aui_barcod ;
   private String[] P03Y115_A396EmprCod ;
   private short[] P03Y115_A7416Aui_UltNum ;
   private boolean[] P03Y115_n7416Aui_UltNum ;
   private String[] P03Y116_A396EmprCod ;
   private int[] P03Y116_A7186Aui_barcod ;
   private byte[] P03Y116_A7187Aui_codreo ;
   private String[] P03Y116_A7188Aui_codpar ;
   private short[] P03Y116_A7417Aui_NumAud ;
   private String[] P03Y120_A7247Aud_Hdrp ;
   private byte[] P03Y120_A7246Aud_Hdrr ;
   private int[] P03Y120_A7245Aud_Hdr ;
   private String[] P03Y120_A396EmprCod ;
   private int[] P03Y120_A7248Aud_UltL ;
   private boolean[] P03Y120_n7248Aud_UltL ;
   private String[] P03Y123_A396EmprCod ;
   private short[] P03Y123_A5577XUltLinF ;
   private boolean[] P03Y123_n5577XUltLinF ;
   private String[] P03Y123_A5581XCodParf ;
   private byte[] P03Y123_A5580XCodReof ;
   private int[] P03Y123_A5579XBarCodf ;
   private int[] P03Y123_A5571XCliCodf ;
   private String[] P03Y123_A5572XForSer ;
   private String[] P03Y123_A5573XForColNom ;
   private int[] P03Y123_A5574XForColNum ;
   private byte[] P03Y123_A5575XTipColCod ;
   private String[] P03Y125_A396EmprCod ;
   private String[] P03Y125_A5576XProForCod ;
   private boolean[] P03Y125_n5576XProForCod ;
   private String[] P03Y125_A5581XCodParf ;
   private byte[] P03Y125_A5580XCodReof ;
   private int[] P03Y125_A5579XBarCodf ;
   private int[] P03Y125_A5571XCliCodf ;
   private String[] P03Y125_A5572XForSer ;
   private String[] P03Y125_A5573XForColNom ;
   private int[] P03Y125_A5574XForColNum ;
   private byte[] P03Y125_A5575XTipColCod ;
   private short[] P03Y125_A5578XProForLn ;
   private String[] P03Y127_A130BarCodPar ;
   private byte[] P03Y127_A132BarCodReo ;
   private int[] P03Y127_A129BarCod ;
   private String[] P03Y127_A396EmprCod ;
}

final  class aptablal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03Y12", "SELECT Dtb_Ordl, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPDT005 WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03Y13", "DELETE FROM TXPDT0051  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
         ,new UpdateCursor("P03Y14", "DELETE FROM TXPDT005  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new ForEachCursor("P03Y15", "SELECT Dt_Orden, Dt_Opp, Dt_Opr, Dt_Op, EmprCod FROM TXPDT000 WHERE EmprCod = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03Y16", "SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl FROM TXPDT001 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03Y17", "DELETE FROM TXPDT0011  WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? and Dt_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0011")
         ,new UpdateCursor("P03Y18", "DELETE FROM TXPDT001  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ? AND Dt_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT001")
         ,new UpdateCursor("P03Y19", "DELETE FROM TXPDT000  WHERE EmprCod = ? AND Dt_Op = ? AND Dt_Opr = ? AND Dt_Opp = ? AND Dt_Orden = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT000")
         ,new ForEachCursor("P03Y110", "SELECT Auf_codpar, Auf_codreo, Auf_barcod, EmprCod, Auf_UltNum FROM TXPAUDFI0 WHERE EmprCod = ? ORDER BY EmprCod, Auf_barcod, Auf_codreo, Auf_codpar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03Y111", "SELECT EmprCod, Auf_barcod, Auf_codreo, Auf_codpar, Auf_NumAud FROM TXPAUDFIN WHERE EmprCod = ? and Auf_barcod = ? and Auf_codreo = ? and Auf_codpar = ? ORDER BY EmprCod, Auf_barcod, Auf_codreo, Auf_codpar, Auf_NumAud ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03Y112", "DELETE FROM TXPAUDFI1  WHERE EmprCod = ? and Auf_barcod = ? and Auf_codreo = ? and Auf_codpar = ? and Auf_NumAud = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDFI1")
         ,new UpdateCursor("P03Y113", "DELETE FROM TXPAUDFIN  WHERE EmprCod = ? AND Auf_barcod = ? AND Auf_codreo = ? AND Auf_codpar = ? AND Auf_NumAud = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDFIN")
         ,new UpdateCursor("P03Y114", "DELETE FROM TXPAUDFI0  WHERE EmprCod = ? AND Auf_barcod = ? AND Auf_codreo = ? AND Auf_codpar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDFI0")
         ,new ForEachCursor("P03Y115", "SELECT Aui_codpar, Aui_codreo, Aui_barcod, EmprCod, Aui_UltNum FROM TXPAUDIN0 WHERE EmprCod = ? ORDER BY EmprCod, Aui_barcod, Aui_codreo, Aui_codpar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03Y116", "SELECT EmprCod, Aui_barcod, Aui_codreo, Aui_codpar, Aui_NumAud FROM TXPAUDINT WHERE EmprCod = ? and Aui_barcod = ? and Aui_codreo = ? and Aui_codpar = ? ORDER BY EmprCod, Aui_barcod, Aui_codreo, Aui_codpar, Aui_NumAud ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03Y117", "DELETE FROM TXPAUDIN1  WHERE EmprCod = ? and Aui_barcod = ? and Aui_codreo = ? and Aui_codpar = ? and Aui_NumAud = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDIN1")
         ,new UpdateCursor("P03Y118", "DELETE FROM TXPAUDINT  WHERE EmprCod = ? AND Aui_barcod = ? AND Aui_codreo = ? AND Aui_codpar = ? AND Aui_NumAud = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDINT")
         ,new UpdateCursor("P03Y119", "DELETE FROM TXPAUDIN0  WHERE EmprCod = ? AND Aui_barcod = ? AND Aui_codreo = ? AND Aui_codpar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDIN0")
         ,new ForEachCursor("P03Y120", "SELECT Aud_Hdrp, Aud_Hdrr, Aud_Hdr, EmprCod, Aud_UltL FROM TXPAUDOPO WHERE EmprCod = ? ORDER BY EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03Y121", "DELETE FROM TXPAUDOP1  WHERE EmprCod = ? and Aud_Hdr = ? and Aud_Hdrr = ? and Aud_Hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOP1")
         ,new UpdateCursor("P03Y122", "DELETE FROM TXPAUDOPO  WHERE EmprCod = ? AND Aud_Hdr = ? AND Aud_Hdrr = ? AND Aud_Hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOPO")
         ,new ForEachCursor("P03Y123", "SELECT Emprcod, XUltLinF, XCodParf, XCodReof, XBarCodf, XCliCodf, XForSer, XForColNom, XForColNum, XTipColCod FROM TXPXLFORM WHERE Emprcod = ? ORDER BY Emprcod, XBarCodf, XCodReof, XCodParf ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03Y124", "DELETE FROM TXPXLFORM  WHERE Emprcod = ? AND XCliCodf = ? AND XForSer = ? AND XForColNom = ? AND XForColNum = ? AND XTipColCod = ? AND XBarCodf = ? AND XCodReof = ? AND XCodParf = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFORM")
         ,new ForEachCursor("P03Y125", "SELECT EmprCod, XProForCod, XCodParf, XCodReof, XBarCodf, XCliCodf, XForSer, XForColNom, XForColNum, XTipColCod, XProForLn FROM TXPXLFOR1 WHERE EmprCod = ? ORDER BY EmprCod, XBarCodf, XCodReof, XCodParf ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03Y126", "DELETE FROM TXPXLFOR1  WHERE EmprCod = ? AND XCliCodf = ? AND XForSer = ? AND XForColNom = ? AND XForColNum = ? AND XTipColCod = ? AND XBarCodf = ? AND XCodReof = ? AND XCodParf = ? AND XProForLn = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFOR1")
         ,new ForEachCursor("P03Y127", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

