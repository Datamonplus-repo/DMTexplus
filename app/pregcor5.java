package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pregcor5 extends GXProcedure
{
   public pregcor5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pregcor5.class ), "" );
   }

   public pregcor5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 )
   {
      pregcor5.this.A396EmprCod = aP0;
      pregcor5.this.AV12Clicod = aP1;
      pregcor5.this.AV14Lb_numero = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "in PREGCOR5", "") );
      AV21Lb_rclin = 0 ;
      /* Using cursor P02PB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02PB2_A252CliCod[0] ;
         A6930Lb_rclin = P02PB2_A6930Lb_rclin[0] ;
         AV21Lb_rclin = A6930Lb_rclin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02PB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P02PB3_A252CliCod[0] ;
         A6932Lb_Linurc = P02PB3_A6932Lb_Linurc[0] ;
         n6932Lb_Linurc = P02PB3_n6932Lb_Linurc[0] ;
         AV11LB_LINURC = A6932Lb_Linurc ;
         if ( AV21Lb_rclin == AV11LB_LINURC )
         {
         }
         else
         {
            AV11LB_LINURC = AV21Lb_rclin ;
         }
         /* Execute user subroutine: 'CONTROL' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV15No_regcor == 0 )
         {
            /* Execute user subroutine: 'REGCOR' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A6932Lb_Linurc = AV11LB_LINURC ;
            n6932Lb_Linurc = false ;
         }
         /* Using cursor P02PB4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n6932Lb_Linurc), Integer.valueOf(A6932Lb_Linurc), A396EmprCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      System.out.println( httpContext.getMessage( "return PREGCOR5", "") );
      Application.commitDataStores(context, remoteHandle, pr_default, "pregcor5");
      AV16Client_d = (byte)(0) ;
      /* Using cursor P02PB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV14Lb_numero)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A6933Lb_rcnens = P02PB5_A6933Lb_rcnens[0] ;
         n6933Lb_rcnens = P02PB5_n6933Lb_rcnens[0] ;
         A252CliCod = P02PB5_A252CliCod[0] ;
         A6930Lb_rclin = P02PB5_A6930Lb_rclin[0] ;
         if ( A252CliCod != AV12Clicod )
         {
            AV16Client_d = (byte)(1) ;
            AV17Clicod_x = A252CliCod ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV16Client_d == 1 )
      {
         /* Optimized DELETE. */
         /* Using cursor P02PB6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV17Clicod_x), Integer.valueOf(AV14Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
         /* End optimized DELETE. */
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CONTROL' Routine */
      returnInSub = false ;
      AV15No_regcor = (byte)(0) ;
      /* Using cursor P02PB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod), Integer.valueOf(AV14Lb_numero)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A252CliCod = P02PB7_A252CliCod[0] ;
         A6933Lb_rcnens = P02PB7_A6933Lb_rcnens[0] ;
         n6933Lb_rcnens = P02PB7_n6933Lb_rcnens[0] ;
         A6930Lb_rclin = P02PB7_A6930Lb_rclin[0] ;
         AV15No_regcor = (byte)(1) ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( AV15No_regcor == 1 )
      {
         /* Using cursor P02PB8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV14Lb_numero)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A252CliCod = P02PB8_A252CliCod[0] ;
            A5540Lb_Cartaz = P02PB8_A5540Lb_Cartaz[0] ;
            A5538Lb_ColNomC = P02PB8_A5538Lb_ColNomC[0] ;
            A5539Lb_ColNumC = P02PB8_A5539Lb_ColNumC[0] ;
            A5536Lb_ColNom = P02PB8_A5536Lb_ColNom[0] ;
            A5537Lb_ColNum = P02PB8_A5537Lb_ColNum[0] ;
            A6653Lb_Tra1 = P02PB8_A6653Lb_Tra1[0] ;
            A6655Lb_Tra2 = P02PB8_A6655Lb_Tra2[0] ;
            A6657Lb_Tra3 = P02PB8_A6657Lb_Tra3[0] ;
            A6842Lb_Tra4 = P02PB8_A6842Lb_Tra4[0] ;
            A6844Lb_Tra5 = P02PB8_A6844Lb_Tra5[0] ;
            A6846Lb_Tra6 = P02PB8_A6846Lb_Tra6[0] ;
            A6654Lb_TraP1 = P02PB8_A6654Lb_TraP1[0] ;
            A6656Lb_TraP2 = P02PB8_A6656Lb_TraP2[0] ;
            A6658Lb_TraP3 = P02PB8_A6658Lb_TraP3[0] ;
            A6843Lb_TraP4 = P02PB8_A6843Lb_TraP4[0] ;
            A6845Lb_TraP5 = P02PB8_A6845Lb_TraP5[0] ;
            A6847Lb_TraP6 = P02PB8_A6847Lb_TraP6[0] ;
            A831TipColCod = P02PB8_A831TipColCod[0] ;
            n831TipColCod = P02PB8_n831TipColCod[0] ;
            A5532Lb_numero = P02PB8_A5532Lb_numero[0] ;
            /* Using cursor P02PB9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV12Clicod), Integer.valueOf(AV14Lb_numero)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A252CliCod = P02PB9_A252CliCod[0] ;
               A6933Lb_rcnens = P02PB9_A6933Lb_rcnens[0] ;
               n6933Lb_rcnens = P02PB9_n6933Lb_rcnens[0] ;
               A6934Lb_rcncar = P02PB9_A6934Lb_rcncar[0] ;
               n6934Lb_rcncar = P02PB9_n6934Lb_rcncar[0] ;
               A6935Lb_rccorc = P02PB9_A6935Lb_rccorc[0] ;
               n6935Lb_rccorc = P02PB9_n6935Lb_rccorc[0] ;
               A6936Lb_rcncorc = P02PB9_A6936Lb_rcncorc[0] ;
               n6936Lb_rcncorc = P02PB9_n6936Lb_rcncorc[0] ;
               A6937Lb_rccor = P02PB9_A6937Lb_rccor[0] ;
               n6937Lb_rccor = P02PB9_n6937Lb_rccor[0] ;
               A6938Lb_rcncor = P02PB9_A6938Lb_rcncor[0] ;
               n6938Lb_rcncor = P02PB9_n6938Lb_rcncor[0] ;
               A6940Lb_rcp1 = P02PB9_A6940Lb_rcp1[0] ;
               n6940Lb_rcp1 = P02PB9_n6940Lb_rcp1[0] ;
               A6941Lb_rcp2 = P02PB9_A6941Lb_rcp2[0] ;
               n6941Lb_rcp2 = P02PB9_n6941Lb_rcp2[0] ;
               A6942Lb_rcp3 = P02PB9_A6942Lb_rcp3[0] ;
               n6942Lb_rcp3 = P02PB9_n6942Lb_rcp3[0] ;
               A6943Lb_rcp4 = P02PB9_A6943Lb_rcp4[0] ;
               n6943Lb_rcp4 = P02PB9_n6943Lb_rcp4[0] ;
               A6944Lb_rcp5 = P02PB9_A6944Lb_rcp5[0] ;
               n6944Lb_rcp5 = P02PB9_n6944Lb_rcp5[0] ;
               A6945Lb_rcp6 = P02PB9_A6945Lb_rcp6[0] ;
               n6945Lb_rcp6 = P02PB9_n6945Lb_rcp6[0] ;
               A6946Lb_rcpo1 = P02PB9_A6946Lb_rcpo1[0] ;
               n6946Lb_rcpo1 = P02PB9_n6946Lb_rcpo1[0] ;
               A6947Lb_rcpo2 = P02PB9_A6947Lb_rcpo2[0] ;
               n6947Lb_rcpo2 = P02PB9_n6947Lb_rcpo2[0] ;
               A6948Lb_rcpo3 = P02PB9_A6948Lb_rcpo3[0] ;
               n6948Lb_rcpo3 = P02PB9_n6948Lb_rcpo3[0] ;
               A6949Lb_rcpo4 = P02PB9_A6949Lb_rcpo4[0] ;
               n6949Lb_rcpo4 = P02PB9_n6949Lb_rcpo4[0] ;
               A6950Lb_rcpo5 = P02PB9_A6950Lb_rcpo5[0] ;
               n6950Lb_rcpo5 = P02PB9_n6950Lb_rcpo5[0] ;
               A6951Lb_rcpo6 = P02PB9_A6951Lb_rcpo6[0] ;
               n6951Lb_rcpo6 = P02PB9_n6951Lb_rcpo6[0] ;
               A6939Lb_rctc = P02PB9_A6939Lb_rctc[0] ;
               n6939Lb_rctc = P02PB9_n6939Lb_rctc[0] ;
               A6930Lb_rclin = P02PB9_A6930Lb_rclin[0] ;
               AV18Ceros6 = "000000" ;
               AV19Cartaz_6 = GXutil.substring( A5540Lb_Cartaz, 1, 6) ;
               AV19Cartaz_6 = GXutil.ltrim( GXutil.rtrim( AV19Cartaz_6)) ;
               AV20Len_Cartaz = (byte)(GXutil.len( AV19Cartaz_6)) ;
               AV20Len_Cartaz = (byte)(6-AV20Len_Cartaz) ;
               AV19Cartaz_6 = GXutil.substring( AV18Ceros6, 1, AV20Len_Cartaz) + AV19Cartaz_6 ;
               A6934Lb_rcncar = AV19Cartaz_6 ;
               n6934Lb_rcncar = false ;
               A6935Lb_rccorc = A5538Lb_ColNomC ;
               n6935Lb_rccorc = false ;
               A6936Lb_rcncorc = A5539Lb_ColNumC ;
               n6936Lb_rcncorc = false ;
               A6937Lb_rccor = A5536Lb_ColNom ;
               n6937Lb_rccor = false ;
               A6938Lb_rcncor = A5537Lb_ColNum ;
               n6938Lb_rcncor = false ;
               A6940Lb_rcp1 = A6653Lb_Tra1 ;
               n6940Lb_rcp1 = false ;
               A6941Lb_rcp2 = A6655Lb_Tra2 ;
               n6941Lb_rcp2 = false ;
               A6942Lb_rcp3 = A6657Lb_Tra3 ;
               n6942Lb_rcp3 = false ;
               A6943Lb_rcp4 = A6842Lb_Tra4 ;
               n6943Lb_rcp4 = false ;
               A6944Lb_rcp5 = A6844Lb_Tra5 ;
               n6944Lb_rcp5 = false ;
               A6945Lb_rcp6 = A6846Lb_Tra6 ;
               n6945Lb_rcp6 = false ;
               A6946Lb_rcpo1 = A6654Lb_TraP1 ;
               n6946Lb_rcpo1 = false ;
               A6947Lb_rcpo2 = A6656Lb_TraP2 ;
               n6947Lb_rcpo2 = false ;
               A6948Lb_rcpo3 = A6658Lb_TraP3 ;
               n6948Lb_rcpo3 = false ;
               A6949Lb_rcpo4 = A6843Lb_TraP4 ;
               n6949Lb_rcpo4 = false ;
               A6950Lb_rcpo5 = A6845Lb_TraP5 ;
               n6950Lb_rcpo5 = false ;
               A6951Lb_rcpo6 = A6847Lb_TraP6 ;
               n6951Lb_rcpo6 = false ;
               A6939Lb_rctc = A831TipColCod ;
               n6939Lb_rctc = false ;
               /* Using cursor P02PB10 */
               pr_default.execute(8, new Object[] {Boolean.valueOf(n6934Lb_rcncar), A6934Lb_rcncar, Boolean.valueOf(n6935Lb_rccorc), A6935Lb_rccorc, Boolean.valueOf(n6936Lb_rcncorc), Integer.valueOf(A6936Lb_rcncorc), Boolean.valueOf(n6937Lb_rccor), A6937Lb_rccor, Boolean.valueOf(n6938Lb_rcncor), Integer.valueOf(A6938Lb_rcncor), Boolean.valueOf(n6940Lb_rcp1), A6940Lb_rcp1, Boolean.valueOf(n6941Lb_rcp2), A6941Lb_rcp2, Boolean.valueOf(n6942Lb_rcp3), A6942Lb_rcp3, Boolean.valueOf(n6943Lb_rcp4), A6943Lb_rcp4, Boolean.valueOf(n6944Lb_rcp5), A6944Lb_rcp5, Boolean.valueOf(n6945Lb_rcp6), A6945Lb_rcp6, Boolean.valueOf(n6946Lb_rcpo1), Short.valueOf(A6946Lb_rcpo1), Boolean.valueOf(n6947Lb_rcpo2), Short.valueOf(A6947Lb_rcpo2), Boolean.valueOf(n6948Lb_rcpo3), Short.valueOf(A6948Lb_rcpo3), Boolean.valueOf(n6949Lb_rcpo4), Short.valueOf(A6949Lb_rcpo4), Boolean.valueOf(n6950Lb_rcpo5), Short.valueOf(A6950Lb_rcpo5), Boolean.valueOf(n6951Lb_rcpo6), Short.valueOf(A6951Lb_rcpo6), Boolean.valueOf(n6939Lb_rctc), Byte.valueOf(A6939Lb_rctc), A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
               pr_default.readNext(7);
            }
            pr_default.close(7);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
   }

   public void S121( )
   {
      /* 'REGCOR' Routine */
      returnInSub = false ;
      /* Using cursor P02PB11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV14Lb_numero)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A5532Lb_numero = P02PB11_A5532Lb_numero[0] ;
         A5540Lb_Cartaz = P02PB11_A5540Lb_Cartaz[0] ;
         A5538Lb_ColNomC = P02PB11_A5538Lb_ColNomC[0] ;
         A5539Lb_ColNumC = P02PB11_A5539Lb_ColNumC[0] ;
         A5536Lb_ColNom = P02PB11_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P02PB11_A5537Lb_ColNum[0] ;
         A6653Lb_Tra1 = P02PB11_A6653Lb_Tra1[0] ;
         A6655Lb_Tra2 = P02PB11_A6655Lb_Tra2[0] ;
         A6657Lb_Tra3 = P02PB11_A6657Lb_Tra3[0] ;
         A6842Lb_Tra4 = P02PB11_A6842Lb_Tra4[0] ;
         A6844Lb_Tra5 = P02PB11_A6844Lb_Tra5[0] ;
         A6846Lb_Tra6 = P02PB11_A6846Lb_Tra6[0] ;
         A6654Lb_TraP1 = P02PB11_A6654Lb_TraP1[0] ;
         A6656Lb_TraP2 = P02PB11_A6656Lb_TraP2[0] ;
         A6658Lb_TraP3 = P02PB11_A6658Lb_TraP3[0] ;
         A6843Lb_TraP4 = P02PB11_A6843Lb_TraP4[0] ;
         A6845Lb_TraP5 = P02PB11_A6845Lb_TraP5[0] ;
         A6847Lb_TraP6 = P02PB11_A6847Lb_TraP6[0] ;
         A831TipColCod = P02PB11_A831TipColCod[0] ;
         n831TipColCod = P02PB11_n831TipColCod[0] ;
         W396EmprCod = A396EmprCod ;
         AV11LB_LINURC = (int)(AV11LB_LINURC+1) ;
         /*
            INSERT RECORD ON TABLE TXPREGCOR

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         A252CliCod = AV12Clicod ;
         A6930Lb_rclin = AV11LB_LINURC ;
         A6933Lb_rcnens = A5532Lb_numero ;
         n6933Lb_rcnens = false ;
         AV18Ceros6 = "000000" ;
         AV19Cartaz_6 = GXutil.substring( A5540Lb_Cartaz, 1, 6) ;
         AV19Cartaz_6 = GXutil.ltrim( GXutil.rtrim( AV19Cartaz_6)) ;
         AV20Len_Cartaz = (byte)(GXutil.len( AV19Cartaz_6)) ;
         AV20Len_Cartaz = (byte)(6-AV20Len_Cartaz) ;
         AV19Cartaz_6 = GXutil.substring( AV18Ceros6, 1, AV20Len_Cartaz) + AV19Cartaz_6 ;
         A6934Lb_rcncar = AV19Cartaz_6 ;
         n6934Lb_rcncar = false ;
         A6935Lb_rccorc = A5538Lb_ColNomC ;
         n6935Lb_rccorc = false ;
         A6936Lb_rcncorc = A5539Lb_ColNumC ;
         n6936Lb_rcncorc = false ;
         A6937Lb_rccor = A5536Lb_ColNom ;
         n6937Lb_rccor = false ;
         A6938Lb_rcncor = A5537Lb_ColNum ;
         n6938Lb_rcncor = false ;
         A6940Lb_rcp1 = A6653Lb_Tra1 ;
         n6940Lb_rcp1 = false ;
         A6941Lb_rcp2 = A6655Lb_Tra2 ;
         n6941Lb_rcp2 = false ;
         A6942Lb_rcp3 = A6657Lb_Tra3 ;
         n6942Lb_rcp3 = false ;
         A6943Lb_rcp4 = A6842Lb_Tra4 ;
         n6943Lb_rcp4 = false ;
         A6944Lb_rcp5 = A6844Lb_Tra5 ;
         n6944Lb_rcp5 = false ;
         A6945Lb_rcp6 = A6846Lb_Tra6 ;
         n6945Lb_rcp6 = false ;
         A6946Lb_rcpo1 = A6654Lb_TraP1 ;
         n6946Lb_rcpo1 = false ;
         A6947Lb_rcpo2 = A6656Lb_TraP2 ;
         n6947Lb_rcpo2 = false ;
         A6948Lb_rcpo3 = A6658Lb_TraP3 ;
         n6948Lb_rcpo3 = false ;
         A6949Lb_rcpo4 = A6843Lb_TraP4 ;
         n6949Lb_rcpo4 = false ;
         A6950Lb_rcpo5 = A6845Lb_TraP5 ;
         n6950Lb_rcpo5 = false ;
         A6951Lb_rcpo6 = A6847Lb_TraP6 ;
         n6951Lb_rcpo6 = false ;
         A6931Lb_rcobs = " " ;
         n6931Lb_rcobs = false ;
         A6939Lb_rctc = A831TipColCod ;
         n6939Lb_rctc = false ;
         /* Using cursor P02PB12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A6930Lb_rclin), Boolean.valueOf(n6931Lb_rcobs), A6931Lb_rcobs, Boolean.valueOf(n6933Lb_rcnens), Integer.valueOf(A6933Lb_rcnens), Boolean.valueOf(n6934Lb_rcncar), A6934Lb_rcncar, Boolean.valueOf(n6935Lb_rccorc), A6935Lb_rccorc, Boolean.valueOf(n6936Lb_rcncorc), Integer.valueOf(A6936Lb_rcncorc), Boolean.valueOf(n6937Lb_rccor), A6937Lb_rccor, Boolean.valueOf(n6938Lb_rcncor), Integer.valueOf(A6938Lb_rcncor), Boolean.valueOf(n6939Lb_rctc), Byte.valueOf(A6939Lb_rctc), Boolean.valueOf(n6940Lb_rcp1), A6940Lb_rcp1, Boolean.valueOf(n6941Lb_rcp2), A6941Lb_rcp2, Boolean.valueOf(n6942Lb_rcp3), A6942Lb_rcp3, Boolean.valueOf(n6943Lb_rcp4), A6943Lb_rcp4, Boolean.valueOf(n6944Lb_rcp5), A6944Lb_rcp5, Boolean.valueOf(n6945Lb_rcp6), A6945Lb_rcp6, Boolean.valueOf(n6946Lb_rcpo1), Short.valueOf(A6946Lb_rcpo1), Boolean.valueOf(n6947Lb_rcpo2), Short.valueOf(A6947Lb_rcpo2), Boolean.valueOf(n6948Lb_rcpo3), Short.valueOf(A6948Lb_rcpo3), Boolean.valueOf(n6949Lb_rcpo4), Short.valueOf(A6949Lb_rcpo4), Boolean.valueOf(n6950Lb_rcpo5), Short.valueOf(A6950Lb_rcpo5), Boolean.valueOf(n6951Lb_rcpo6), Short.valueOf(A6951Lb_rcpo6)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGCOR");
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
         A252CliCod = W252CliCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pregcor5");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P02PB2_A396EmprCod = new String[] {""} ;
      P02PB2_A252CliCod = new int[1] ;
      P02PB2_A6930Lb_rclin = new int[1] ;
      P02PB3_A396EmprCod = new String[] {""} ;
      P02PB3_A252CliCod = new int[1] ;
      P02PB3_A6932Lb_Linurc = new int[1] ;
      P02PB3_n6932Lb_Linurc = new boolean[] {false} ;
      P02PB5_A396EmprCod = new String[] {""} ;
      P02PB5_A6933Lb_rcnens = new int[1] ;
      P02PB5_n6933Lb_rcnens = new boolean[] {false} ;
      P02PB5_A252CliCod = new int[1] ;
      P02PB5_A6930Lb_rclin = new int[1] ;
      P02PB7_A396EmprCod = new String[] {""} ;
      P02PB7_A252CliCod = new int[1] ;
      P02PB7_A6933Lb_rcnens = new int[1] ;
      P02PB7_n6933Lb_rcnens = new boolean[] {false} ;
      P02PB7_A6930Lb_rclin = new int[1] ;
      P02PB8_A396EmprCod = new String[] {""} ;
      P02PB8_A252CliCod = new int[1] ;
      P02PB8_A5540Lb_Cartaz = new String[] {""} ;
      P02PB8_A5538Lb_ColNomC = new String[] {""} ;
      P02PB8_A5539Lb_ColNumC = new int[1] ;
      P02PB8_A5536Lb_ColNom = new String[] {""} ;
      P02PB8_A5537Lb_ColNum = new int[1] ;
      P02PB8_A6653Lb_Tra1 = new String[] {""} ;
      P02PB8_A6655Lb_Tra2 = new String[] {""} ;
      P02PB8_A6657Lb_Tra3 = new String[] {""} ;
      P02PB8_A6842Lb_Tra4 = new String[] {""} ;
      P02PB8_A6844Lb_Tra5 = new String[] {""} ;
      P02PB8_A6846Lb_Tra6 = new String[] {""} ;
      P02PB8_A6654Lb_TraP1 = new short[1] ;
      P02PB8_A6656Lb_TraP2 = new short[1] ;
      P02PB8_A6658Lb_TraP3 = new short[1] ;
      P02PB8_A6843Lb_TraP4 = new short[1] ;
      P02PB8_A6845Lb_TraP5 = new short[1] ;
      P02PB8_A6847Lb_TraP6 = new short[1] ;
      P02PB8_A831TipColCod = new byte[1] ;
      P02PB8_n831TipColCod = new boolean[] {false} ;
      P02PB8_A5532Lb_numero = new int[1] ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A6653Lb_Tra1 = "" ;
      A6655Lb_Tra2 = "" ;
      A6657Lb_Tra3 = "" ;
      A6842Lb_Tra4 = "" ;
      A6844Lb_Tra5 = "" ;
      A6846Lb_Tra6 = "" ;
      P02PB9_A396EmprCod = new String[] {""} ;
      P02PB9_A252CliCod = new int[1] ;
      P02PB9_A6933Lb_rcnens = new int[1] ;
      P02PB9_n6933Lb_rcnens = new boolean[] {false} ;
      P02PB9_A6934Lb_rcncar = new String[] {""} ;
      P02PB9_n6934Lb_rcncar = new boolean[] {false} ;
      P02PB9_A6935Lb_rccorc = new String[] {""} ;
      P02PB9_n6935Lb_rccorc = new boolean[] {false} ;
      P02PB9_A6936Lb_rcncorc = new int[1] ;
      P02PB9_n6936Lb_rcncorc = new boolean[] {false} ;
      P02PB9_A6937Lb_rccor = new String[] {""} ;
      P02PB9_n6937Lb_rccor = new boolean[] {false} ;
      P02PB9_A6938Lb_rcncor = new int[1] ;
      P02PB9_n6938Lb_rcncor = new boolean[] {false} ;
      P02PB9_A6940Lb_rcp1 = new String[] {""} ;
      P02PB9_n6940Lb_rcp1 = new boolean[] {false} ;
      P02PB9_A6941Lb_rcp2 = new String[] {""} ;
      P02PB9_n6941Lb_rcp2 = new boolean[] {false} ;
      P02PB9_A6942Lb_rcp3 = new String[] {""} ;
      P02PB9_n6942Lb_rcp3 = new boolean[] {false} ;
      P02PB9_A6943Lb_rcp4 = new String[] {""} ;
      P02PB9_n6943Lb_rcp4 = new boolean[] {false} ;
      P02PB9_A6944Lb_rcp5 = new String[] {""} ;
      P02PB9_n6944Lb_rcp5 = new boolean[] {false} ;
      P02PB9_A6945Lb_rcp6 = new String[] {""} ;
      P02PB9_n6945Lb_rcp6 = new boolean[] {false} ;
      P02PB9_A6946Lb_rcpo1 = new short[1] ;
      P02PB9_n6946Lb_rcpo1 = new boolean[] {false} ;
      P02PB9_A6947Lb_rcpo2 = new short[1] ;
      P02PB9_n6947Lb_rcpo2 = new boolean[] {false} ;
      P02PB9_A6948Lb_rcpo3 = new short[1] ;
      P02PB9_n6948Lb_rcpo3 = new boolean[] {false} ;
      P02PB9_A6949Lb_rcpo4 = new short[1] ;
      P02PB9_n6949Lb_rcpo4 = new boolean[] {false} ;
      P02PB9_A6950Lb_rcpo5 = new short[1] ;
      P02PB9_n6950Lb_rcpo5 = new boolean[] {false} ;
      P02PB9_A6951Lb_rcpo6 = new short[1] ;
      P02PB9_n6951Lb_rcpo6 = new boolean[] {false} ;
      P02PB9_A6939Lb_rctc = new byte[1] ;
      P02PB9_n6939Lb_rctc = new boolean[] {false} ;
      P02PB9_A6930Lb_rclin = new int[1] ;
      A6934Lb_rcncar = "" ;
      A6935Lb_rccorc = "" ;
      A6937Lb_rccor = "" ;
      A6940Lb_rcp1 = "" ;
      A6941Lb_rcp2 = "" ;
      A6942Lb_rcp3 = "" ;
      A6943Lb_rcp4 = "" ;
      A6944Lb_rcp5 = "" ;
      A6945Lb_rcp6 = "" ;
      AV18Ceros6 = "" ;
      AV19Cartaz_6 = "" ;
      P02PB11_A396EmprCod = new String[] {""} ;
      P02PB11_A5532Lb_numero = new int[1] ;
      P02PB11_A5540Lb_Cartaz = new String[] {""} ;
      P02PB11_A5538Lb_ColNomC = new String[] {""} ;
      P02PB11_A5539Lb_ColNumC = new int[1] ;
      P02PB11_A5536Lb_ColNom = new String[] {""} ;
      P02PB11_A5537Lb_ColNum = new int[1] ;
      P02PB11_A6653Lb_Tra1 = new String[] {""} ;
      P02PB11_A6655Lb_Tra2 = new String[] {""} ;
      P02PB11_A6657Lb_Tra3 = new String[] {""} ;
      P02PB11_A6842Lb_Tra4 = new String[] {""} ;
      P02PB11_A6844Lb_Tra5 = new String[] {""} ;
      P02PB11_A6846Lb_Tra6 = new String[] {""} ;
      P02PB11_A6654Lb_TraP1 = new short[1] ;
      P02PB11_A6656Lb_TraP2 = new short[1] ;
      P02PB11_A6658Lb_TraP3 = new short[1] ;
      P02PB11_A6843Lb_TraP4 = new short[1] ;
      P02PB11_A6845Lb_TraP5 = new short[1] ;
      P02PB11_A6847Lb_TraP6 = new short[1] ;
      P02PB11_A831TipColCod = new byte[1] ;
      P02PB11_n831TipColCod = new boolean[] {false} ;
      W396EmprCod = "" ;
      A6931Lb_rcobs = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pregcor5__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pregcor5__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pregcor5__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pregcor5__default(),
         new Object[] {
             new Object[] {
            P02PB2_A396EmprCod, P02PB2_A252CliCod, P02PB2_A6930Lb_rclin
            }
            , new Object[] {
            P02PB3_A396EmprCod, P02PB3_A252CliCod, P02PB3_A6932Lb_Linurc, P02PB3_n6932Lb_Linurc
            }
            , new Object[] {
            }
            , new Object[] {
            P02PB5_A396EmprCod, P02PB5_A6933Lb_rcnens, P02PB5_n6933Lb_rcnens, P02PB5_A252CliCod, P02PB5_A6930Lb_rclin
            }
            , new Object[] {
            }
            , new Object[] {
            P02PB7_A396EmprCod, P02PB7_A252CliCod, P02PB7_A6933Lb_rcnens, P02PB7_n6933Lb_rcnens, P02PB7_A6930Lb_rclin
            }
            , new Object[] {
            P02PB8_A396EmprCod, P02PB8_A252CliCod, P02PB8_A5540Lb_Cartaz, P02PB8_A5538Lb_ColNomC, P02PB8_A5539Lb_ColNumC, P02PB8_A5536Lb_ColNom, P02PB8_A5537Lb_ColNum, P02PB8_A6653Lb_Tra1, P02PB8_A6655Lb_Tra2, P02PB8_A6657Lb_Tra3,
            P02PB8_A6842Lb_Tra4, P02PB8_A6844Lb_Tra5, P02PB8_A6846Lb_Tra6, P02PB8_A6654Lb_TraP1, P02PB8_A6656Lb_TraP2, P02PB8_A6658Lb_TraP3, P02PB8_A6843Lb_TraP4, P02PB8_A6845Lb_TraP5, P02PB8_A6847Lb_TraP6, P02PB8_A831TipColCod,
            P02PB8_n831TipColCod, P02PB8_A5532Lb_numero
            }
            , new Object[] {
            P02PB9_A396EmprCod, P02PB9_A252CliCod, P02PB9_A6933Lb_rcnens, P02PB9_n6933Lb_rcnens, P02PB9_A6934Lb_rcncar, P02PB9_n6934Lb_rcncar, P02PB9_A6935Lb_rccorc, P02PB9_n6935Lb_rccorc, P02PB9_A6936Lb_rcncorc, P02PB9_n6936Lb_rcncorc,
            P02PB9_A6937Lb_rccor, P02PB9_n6937Lb_rccor, P02PB9_A6938Lb_rcncor, P02PB9_n6938Lb_rcncor, P02PB9_A6940Lb_rcp1, P02PB9_n6940Lb_rcp1, P02PB9_A6941Lb_rcp2, P02PB9_n6941Lb_rcp2, P02PB9_A6942Lb_rcp3, P02PB9_n6942Lb_rcp3,
            P02PB9_A6943Lb_rcp4, P02PB9_n6943Lb_rcp4, P02PB9_A6944Lb_rcp5, P02PB9_n6944Lb_rcp5, P02PB9_A6945Lb_rcp6, P02PB9_n6945Lb_rcp6, P02PB9_A6946Lb_rcpo1, P02PB9_n6946Lb_rcpo1, P02PB9_A6947Lb_rcpo2, P02PB9_n6947Lb_rcpo2,
            P02PB9_A6948Lb_rcpo3, P02PB9_n6948Lb_rcpo3, P02PB9_A6949Lb_rcpo4, P02PB9_n6949Lb_rcpo4, P02PB9_A6950Lb_rcpo5, P02PB9_n6950Lb_rcpo5, P02PB9_A6951Lb_rcpo6, P02PB9_n6951Lb_rcpo6, P02PB9_A6939Lb_rctc, P02PB9_n6939Lb_rctc,
            P02PB9_A6930Lb_rclin
            }
            , new Object[] {
            }
            , new Object[] {
            P02PB11_A396EmprCod, P02PB11_A5532Lb_numero, P02PB11_A5540Lb_Cartaz, P02PB11_A5538Lb_ColNomC, P02PB11_A5539Lb_ColNumC, P02PB11_A5536Lb_ColNom, P02PB11_A5537Lb_ColNum, P02PB11_A6653Lb_Tra1, P02PB11_A6655Lb_Tra2, P02PB11_A6657Lb_Tra3,
            P02PB11_A6842Lb_Tra4, P02PB11_A6844Lb_Tra5, P02PB11_A6846Lb_Tra6, P02PB11_A6654Lb_TraP1, P02PB11_A6656Lb_TraP2, P02PB11_A6658Lb_TraP3, P02PB11_A6843Lb_TraP4, P02PB11_A6845Lb_TraP5, P02PB11_A6847Lb_TraP6, P02PB11_A831TipColCod,
            P02PB11_n831TipColCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15No_regcor ;
   private byte AV16Client_d ;
   private byte A831TipColCod ;
   private byte A6939Lb_rctc ;
   private byte AV20Len_Cartaz ;
   private short A6654Lb_TraP1 ;
   private short A6656Lb_TraP2 ;
   private short A6658Lb_TraP3 ;
   private short A6843Lb_TraP4 ;
   private short A6845Lb_TraP5 ;
   private short A6847Lb_TraP6 ;
   private short A6946Lb_rcpo1 ;
   private short A6947Lb_rcpo2 ;
   private short A6948Lb_rcpo3 ;
   private short A6949Lb_rcpo4 ;
   private short A6950Lb_rcpo5 ;
   private short A6951Lb_rcpo6 ;
   private short Gx_err ;
   private int AV12Clicod ;
   private int AV14Lb_numero ;
   private int AV21Lb_rclin ;
   private int A252CliCod ;
   private int A6930Lb_rclin ;
   private int A6932Lb_Linurc ;
   private int AV11LB_LINURC ;
   private int A6933Lb_rcnens ;
   private int AV17Clicod_x ;
   private int A5539Lb_ColNumC ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private int A6936Lb_rcncorc ;
   private int A6938Lb_rcncor ;
   private int GX_INS983 ;
   private int W252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5540Lb_Cartaz ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A6653Lb_Tra1 ;
   private String A6655Lb_Tra2 ;
   private String A6657Lb_Tra3 ;
   private String A6842Lb_Tra4 ;
   private String A6844Lb_Tra5 ;
   private String A6846Lb_Tra6 ;
   private String A6934Lb_rcncar ;
   private String A6935Lb_rccorc ;
   private String A6937Lb_rccor ;
   private String A6940Lb_rcp1 ;
   private String A6941Lb_rcp2 ;
   private String A6942Lb_rcp3 ;
   private String A6943Lb_rcp4 ;
   private String A6944Lb_rcp5 ;
   private String A6945Lb_rcp6 ;
   private String AV18Ceros6 ;
   private String AV19Cartaz_6 ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private boolean n6932Lb_Linurc ;
   private boolean returnInSub ;
   private boolean n6933Lb_rcnens ;
   private boolean n831TipColCod ;
   private boolean n6934Lb_rcncar ;
   private boolean n6935Lb_rccorc ;
   private boolean n6936Lb_rcncorc ;
   private boolean n6937Lb_rccor ;
   private boolean n6938Lb_rcncor ;
   private boolean n6940Lb_rcp1 ;
   private boolean n6941Lb_rcp2 ;
   private boolean n6942Lb_rcp3 ;
   private boolean n6943Lb_rcp4 ;
   private boolean n6944Lb_rcp5 ;
   private boolean n6945Lb_rcp6 ;
   private boolean n6946Lb_rcpo1 ;
   private boolean n6947Lb_rcpo2 ;
   private boolean n6948Lb_rcpo3 ;
   private boolean n6949Lb_rcpo4 ;
   private boolean n6950Lb_rcpo5 ;
   private boolean n6951Lb_rcpo6 ;
   private boolean n6939Lb_rctc ;
   private boolean n6931Lb_rcobs ;
   private String A6931Lb_rcobs ;
   private IDataStoreProvider pr_default ;
   private String[] P02PB2_A396EmprCod ;
   private int[] P02PB2_A252CliCod ;
   private int[] P02PB2_A6930Lb_rclin ;
   private String[] P02PB3_A396EmprCod ;
   private int[] P02PB3_A252CliCod ;
   private int[] P02PB3_A6932Lb_Linurc ;
   private boolean[] P02PB3_n6932Lb_Linurc ;
   private String[] P02PB5_A396EmprCod ;
   private int[] P02PB5_A6933Lb_rcnens ;
   private boolean[] P02PB5_n6933Lb_rcnens ;
   private int[] P02PB5_A252CliCod ;
   private int[] P02PB5_A6930Lb_rclin ;
   private String[] P02PB7_A396EmprCod ;
   private int[] P02PB7_A252CliCod ;
   private int[] P02PB7_A6933Lb_rcnens ;
   private boolean[] P02PB7_n6933Lb_rcnens ;
   private int[] P02PB7_A6930Lb_rclin ;
   private String[] P02PB8_A396EmprCod ;
   private int[] P02PB8_A252CliCod ;
   private String[] P02PB8_A5540Lb_Cartaz ;
   private String[] P02PB8_A5538Lb_ColNomC ;
   private int[] P02PB8_A5539Lb_ColNumC ;
   private String[] P02PB8_A5536Lb_ColNom ;
   private int[] P02PB8_A5537Lb_ColNum ;
   private String[] P02PB8_A6653Lb_Tra1 ;
   private String[] P02PB8_A6655Lb_Tra2 ;
   private String[] P02PB8_A6657Lb_Tra3 ;
   private String[] P02PB8_A6842Lb_Tra4 ;
   private String[] P02PB8_A6844Lb_Tra5 ;
   private String[] P02PB8_A6846Lb_Tra6 ;
   private short[] P02PB8_A6654Lb_TraP1 ;
   private short[] P02PB8_A6656Lb_TraP2 ;
   private short[] P02PB8_A6658Lb_TraP3 ;
   private short[] P02PB8_A6843Lb_TraP4 ;
   private short[] P02PB8_A6845Lb_TraP5 ;
   private short[] P02PB8_A6847Lb_TraP6 ;
   private byte[] P02PB8_A831TipColCod ;
   private boolean[] P02PB8_n831TipColCod ;
   private int[] P02PB8_A5532Lb_numero ;
   private String[] P02PB9_A396EmprCod ;
   private int[] P02PB9_A252CliCod ;
   private int[] P02PB9_A6933Lb_rcnens ;
   private boolean[] P02PB9_n6933Lb_rcnens ;
   private String[] P02PB9_A6934Lb_rcncar ;
   private boolean[] P02PB9_n6934Lb_rcncar ;
   private String[] P02PB9_A6935Lb_rccorc ;
   private boolean[] P02PB9_n6935Lb_rccorc ;
   private int[] P02PB9_A6936Lb_rcncorc ;
   private boolean[] P02PB9_n6936Lb_rcncorc ;
   private String[] P02PB9_A6937Lb_rccor ;
   private boolean[] P02PB9_n6937Lb_rccor ;
   private int[] P02PB9_A6938Lb_rcncor ;
   private boolean[] P02PB9_n6938Lb_rcncor ;
   private String[] P02PB9_A6940Lb_rcp1 ;
   private boolean[] P02PB9_n6940Lb_rcp1 ;
   private String[] P02PB9_A6941Lb_rcp2 ;
   private boolean[] P02PB9_n6941Lb_rcp2 ;
   private String[] P02PB9_A6942Lb_rcp3 ;
   private boolean[] P02PB9_n6942Lb_rcp3 ;
   private String[] P02PB9_A6943Lb_rcp4 ;
   private boolean[] P02PB9_n6943Lb_rcp4 ;
   private String[] P02PB9_A6944Lb_rcp5 ;
   private boolean[] P02PB9_n6944Lb_rcp5 ;
   private String[] P02PB9_A6945Lb_rcp6 ;
   private boolean[] P02PB9_n6945Lb_rcp6 ;
   private short[] P02PB9_A6946Lb_rcpo1 ;
   private boolean[] P02PB9_n6946Lb_rcpo1 ;
   private short[] P02PB9_A6947Lb_rcpo2 ;
   private boolean[] P02PB9_n6947Lb_rcpo2 ;
   private short[] P02PB9_A6948Lb_rcpo3 ;
   private boolean[] P02PB9_n6948Lb_rcpo3 ;
   private short[] P02PB9_A6949Lb_rcpo4 ;
   private boolean[] P02PB9_n6949Lb_rcpo4 ;
   private short[] P02PB9_A6950Lb_rcpo5 ;
   private boolean[] P02PB9_n6950Lb_rcpo5 ;
   private short[] P02PB9_A6951Lb_rcpo6 ;
   private boolean[] P02PB9_n6951Lb_rcpo6 ;
   private byte[] P02PB9_A6939Lb_rctc ;
   private boolean[] P02PB9_n6939Lb_rctc ;
   private int[] P02PB9_A6930Lb_rclin ;
   private String[] P02PB11_A396EmprCod ;
   private int[] P02PB11_A5532Lb_numero ;
   private String[] P02PB11_A5540Lb_Cartaz ;
   private String[] P02PB11_A5538Lb_ColNomC ;
   private int[] P02PB11_A5539Lb_ColNumC ;
   private String[] P02PB11_A5536Lb_ColNom ;
   private int[] P02PB11_A5537Lb_ColNum ;
   private String[] P02PB11_A6653Lb_Tra1 ;
   private String[] P02PB11_A6655Lb_Tra2 ;
   private String[] P02PB11_A6657Lb_Tra3 ;
   private String[] P02PB11_A6842Lb_Tra4 ;
   private String[] P02PB11_A6844Lb_Tra5 ;
   private String[] P02PB11_A6846Lb_Tra6 ;
   private short[] P02PB11_A6654Lb_TraP1 ;
   private short[] P02PB11_A6656Lb_TraP2 ;
   private short[] P02PB11_A6658Lb_TraP3 ;
   private short[] P02PB11_A6843Lb_TraP4 ;
   private short[] P02PB11_A6845Lb_TraP5 ;
   private short[] P02PB11_A6847Lb_TraP6 ;
   private byte[] P02PB11_A831TipColCod ;
   private boolean[] P02PB11_n831TipColCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pregcor5__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pregcor5__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pregcor5__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pregcor5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PB2", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, Lb_rclin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02PB3", "SELECT EmprCod, CliCod, Lb_Linurc FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02PB4", "UPDATE TXPCLIENT SET Lb_Linurc=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new ForEachCursor("P02PB5", "SELECT EmprCod, Lb_rcnens, CliCod, Lb_rclin FROM TXPREGCOR WHERE (EmprCod = ?) AND (Lb_rcnens = ?) ORDER BY EmprCod, CliCod, Lb_rcnens ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PB6", "DELETE FROM TXPREGCOR  WHERE EmprCod = ? and CliCod = ? and Lb_rcnens = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPREGCOR")
         ,new ForEachCursor("P02PB7", "SELECT EmprCod, CliCod, Lb_rcnens, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? and CliCod = ? and Lb_rcnens = ? ORDER BY EmprCod, CliCod, Lb_rcnens ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02PB8", "SELECT EmprCod, CliCod, Lb_Cartaz, Lb_ColNomC, Lb_ColNumC, Lb_ColNom, Lb_ColNum, Lb_Tra1, Lb_Tra2, Lb_Tra3, Lb_Tra4, Lb_Tra5, Lb_Tra6, Lb_TraP1, Lb_TraP2, Lb_TraP3, Lb_TraP4, Lb_TraP5, Lb_TraP6, TipColCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02PB9", "SELECT EmprCod, CliCod, Lb_rcnens, Lb_rcncar, Lb_rccorc, Lb_rcncorc, Lb_rccor, Lb_rcncor, Lb_rcp1, Lb_rcp2, Lb_rcp3, Lb_rcp4, Lb_rcp5, Lb_rcp6, Lb_rcpo1, Lb_rcpo2, Lb_rcpo3, Lb_rcpo4, Lb_rcpo5, Lb_rcpo6, Lb_rctc, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? and CliCod = ? and Lb_rcnens = ? ORDER BY EmprCod, CliCod, Lb_rcnens ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PB10", "UPDATE TXPREGCOR SET Lb_rcncar=?, Lb_rccorc=?, Lb_rcncorc=?, Lb_rccor=?, Lb_rcncor=?, Lb_rcp1=?, Lb_rcp2=?, Lb_rcp3=?, Lb_rcp4=?, Lb_rcp5=?, Lb_rcp6=?, Lb_rcpo1=?, Lb_rcpo2=?, Lb_rcpo3=?, Lb_rcpo4=?, Lb_rcpo5=?, Lb_rcpo6=?, Lb_rctc=?  WHERE EmprCod = ? AND CliCod = ? AND Lb_rclin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPREGCOR")
         ,new ForEachCursor("P02PB11", "SELECT EmprCod, Lb_numero, Lb_Cartaz, Lb_ColNomC, Lb_ColNumC, Lb_ColNom, Lb_ColNum, Lb_Tra1, Lb_Tra2, Lb_Tra3, Lb_Tra4, Lb_Tra5, Lb_Tra6, Lb_TraP1, Lb_TraP2, Lb_TraP3, Lb_TraP4, Lb_TraP5, Lb_TraP6, TipColCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02PB12", "INSERT INTO TXPREGCOR(EmprCod, CliCod, Lb_rclin, Lb_rcobs, Lb_rcnens, Lb_rcncar, Lb_rccorc, Lb_rcncorc, Lb_rccor, Lb_rcncor, Lb_rctc, Lb_rcp1, Lb_rcp2, Lb_rcp3, Lb_rcp4, Lb_rcp5, Lb_rcp6, Lb_rcpo1, Lb_rcpo2, Lb_rcpo3, Lb_rcpo4, Lb_rcpo5, Lb_rcpo6, Lb_rcFecEt, Lb_rcFecEn, Lb_rcFecRe, Lb_rcOpEnv, Lb_rcOpApr, Lb_rcOpNap, Lb_rcFeNap, Lb_rcProDe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPREGCOR")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((String[]) buf[10])[0] = rslt.getString(11, 4);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 4);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(21);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(22);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((String[]) buf[10])[0] = rslt.getString(11, 4);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 4);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 4);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 4);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 4);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 4);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[35]).byteValue());
               }
               stmt.setString(19, (String)parms[36], 3);
               stmt.setInt(20, ((Number) parms[37]).intValue());
               stmt.setInt(21, ((Number) parms[38]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(4, (String)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 13);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 4);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[22], 4);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 4);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[26], 4);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 4);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 4);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[40]).shortValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[42]).shortValue());
               }
               return;
      }
   }

}

