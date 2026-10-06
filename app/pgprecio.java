package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgprecio extends GXProcedure
{
   public pgprecio( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgprecio.class ), "" );
   }

   public pgprecio( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 )
   {
      pgprecio.this.A396EmprCod = aP0;
      pgprecio.this.A252CliCod = aP1;
      pgprecio.this.AV9vArtCodOri = aP2;
      pgprecio.this.AV8vArtCodDes = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Entre = httpContext.getMessage( "N", "") ;
      /* Using cursor P00L82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV9vArtCodOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P00L82_A65ArtCod[0] ;
         A92ArtPreKgm = P00L82_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P00L82_n92ArtPreKgm[0] ;
         A93ArtPreMtr = P00L82_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P00L82_n93ArtPreMtr[0] ;
         A91ArtPreDef = P00L82_A91ArtPreDef[0] ;
         n91ArtPreDef = P00L82_n91ArtPreDef[0] ;
         AV10Entre = httpContext.getMessage( "S", "") ;
         AV11ArtPreKgm = A92ArtPreKgm ;
         AV12ArtPreMtr = A93ArtPreMtr ;
         AV13ArtPreDef = A91ArtPreDef ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV10Entre, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Articulo origen", ""));
      }
      else
      {
         n91ArtPreDef = false ;
         n93ArtPreMtr = false ;
         n92ArtPreKgm = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00L83 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n91ArtPreDef), AV13ArtPreDef, Boolean.valueOf(n93ArtPreMtr), AV12ArtPreMtr, Boolean.valueOf(n92ArtPreKgm), AV11ArtPreKgm, A396EmprCod, Integer.valueOf(A252CliCod), AV8vArtCodDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         /* End optimized UPDATE. */
         /* Optimized DELETE. */
         /* Using cursor P00L84 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV8vArtCodDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETCO");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00L85 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV8vArtCodDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00L86 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV8vArtCodDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECARG");
         /* End optimized DELETE. */
         /* Using cursor P00L87 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV9vArtCodOri});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A65ArtCod = P00L87_A65ArtCod[0] ;
            A831TipColCod = P00L87_A831TipColCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            /*
               INSERT RECORD ON TABLE TXPPRETCO

            */
            W65ArtCod = A65ArtCod ;
            W252CliCod = A252CliCod ;
            W396EmprCod = A396EmprCod ;
            W831TipColCod = A831TipColCod ;
            A65ArtCod = AV8vArtCodDes ;
            /* Using cursor P00L88 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETCO");
            if ( (pr_default.getStatus(6) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A65ArtCod = W65ArtCod ;
            A252CliCod = W252CliCod ;
            A396EmprCod = W396EmprCod ;
            A831TipColCod = W831TipColCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Using cursor P00L89 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV9vArtCodOri});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A65ArtCod = P00L89_A65ArtCod[0] ;
            A3616PreFacCod = P00L89_A3616PreFacCod[0] ;
            n3616PreFacCod = P00L89_n3616PreFacCod[0] ;
            A585IntPreDef = P00L89_A585IntPreDef[0] ;
            n585IntPreDef = P00L89_n585IntPreDef[0] ;
            A587IntPreMtr = P00L89_A587IntPreMtr[0] ;
            n587IntPreMtr = P00L89_n587IntPreMtr[0] ;
            A586IntPreKgm = P00L89_A586IntPreKgm[0] ;
            n586IntPreKgm = P00L89_n586IntPreKgm[0] ;
            A583IntCod = P00L89_A583IntCod[0] ;
            A831TipColCod = P00L89_A831TipColCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            /*
               INSERT RECORD ON TABLE TXPPRETIN

            */
            W65ArtCod = A65ArtCod ;
            W252CliCod = A252CliCod ;
            W396EmprCod = A396EmprCod ;
            W583IntCod = A583IntCod ;
            W585IntPreDef = A585IntPreDef ;
            n585IntPreDef = false ;
            W586IntPreKgm = A586IntPreKgm ;
            n586IntPreKgm = false ;
            W587IntPreMtr = A587IntPreMtr ;
            n587IntPreMtr = false ;
            W831TipColCod = A831TipColCod ;
            A65ArtCod = AV8vArtCodDes ;
            n585IntPreDef = false ;
            n586IntPreKgm = false ;
            n587IntPreMtr = false ;
            /* Using cursor P00L810 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n586IntPreKgm), A586IntPreKgm, Boolean.valueOf(n587IntPreMtr), A587IntPreMtr, Boolean.valueOf(n585IntPreDef), A585IntPreDef, Boolean.valueOf(n3616PreFacCod), A3616PreFacCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
            if ( (pr_default.getStatus(8) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A65ArtCod = W65ArtCod ;
            A252CliCod = W252CliCod ;
            A396EmprCod = W396EmprCod ;
            A583IntCod = W583IntCod ;
            A585IntPreDef = W585IntPreDef ;
            n585IntPreDef = false ;
            A586IntPreKgm = W586IntPreKgm ;
            n586IntPreKgm = false ;
            A587IntPreMtr = W587IntPreMtr ;
            n587IntPreMtr = false ;
            A831TipColCod = W831TipColCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Using cursor P00L811 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV9vArtCodOri});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A65ArtCod = P00L811_A65ArtCod[0] ;
            A675PorRec = P00L811_A675PorRec[0] ;
            n675PorRec = P00L811_n675PorRec[0] ;
            A596LimUni = P00L811_A596LimUni[0] ;
            n596LimUni = P00L811_n596LimUni[0] ;
            A598LinRec = P00L811_A598LinRec[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            /*
               INSERT RECORD ON TABLE TXPRECARG

            */
            W65ArtCod = A65ArtCod ;
            W252CliCod = A252CliCod ;
            W396EmprCod = A396EmprCod ;
            W596LimUni = A596LimUni ;
            n596LimUni = false ;
            W598LinRec = A598LinRec ;
            W675PorRec = A675PorRec ;
            n675PorRec = false ;
            A65ArtCod = AV8vArtCodDes ;
            n596LimUni = false ;
            n675PorRec = false ;
            /* Using cursor P00L812 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A598LinRec), Boolean.valueOf(n596LimUni), Integer.valueOf(A596LimUni), Boolean.valueOf(n675PorRec), A675PorRec});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECARG");
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
            A65ArtCod = W65ArtCod ;
            A252CliCod = W252CliCod ;
            A396EmprCod = W396EmprCod ;
            A596LimUni = W596LimUni ;
            n596LimUni = false ;
            A598LinRec = W598LinRec ;
            A675PorRec = W675PorRec ;
            n675PorRec = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         /* Optimized DELETE. */
         /* Using cursor P00L813 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV8vArtCodDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRecInt");
         /* End optimized DELETE. */
         /* Using cursor P00L814 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV9vArtCodOri});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A65ArtCod = P00L814_A65ArtCod[0] ;
            A4325RecIOB = P00L814_A4325RecIOB[0] ;
            n4325RecIOB = P00L814_n4325RecIOB[0] ;
            A4324RecIPor = P00L814_A4324RecIPor[0] ;
            n4324RecIPor = P00L814_n4324RecIPor[0] ;
            A4323RecIImp = P00L814_A4323RecIImp[0] ;
            n4323RecIImp = P00L814_n4323RecIImp[0] ;
            A4322Limite5 = P00L814_A4322Limite5[0] ;
            A583IntCod = P00L814_A583IntCod[0] ;
            A831TipColCod = P00L814_A831TipColCod[0] ;
            W65ArtCod = A65ArtCod ;
            /*
               INSERT RECORD ON TABLE TXPRecInt

            */
            W65ArtCod = A65ArtCod ;
            W4322Limite5 = A4322Limite5 ;
            A65ArtCod = AV8vArtCodDes ;
            /* Using cursor P00L815 */
            pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), Short.valueOf(A4322Limite5), Boolean.valueOf(n4323RecIImp), A4323RecIImp, Boolean.valueOf(n4324RecIPor), A4324RecIPor, Boolean.valueOf(n4325RecIOB), A4325RecIOB});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRecInt");
            if ( (pr_default.getStatus(13) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A65ArtCod = W65ArtCod ;
            A4322Limite5 = W4322Limite5 ;
            /* End Insert */
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(12);
         }
         pr_default.close(12);
      }
      /* Optimized DELETE. */
      /* Using cursor P00L816 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV8vArtCodDes});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECARB");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P00L817 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV8vArtCodDes});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRBART");
      /* End optimized DELETE. */
      /* Using cursor P00L818 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV9vArtCodOri});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A65ArtCod = P00L818_A65ArtCod[0] ;
         A2932Precio2 = P00L818_A2932Precio2[0] ;
         n2932Precio2 = P00L818_n2932Precio2[0] ;
         A2931Limite2 = P00L818_A2931Limite2[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         /*
            INSERT RECORD ON TABLE TXPRECARB

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W2931Limite2 = A2931Limite2 ;
         W2932Precio2 = A2932Precio2 ;
         n2932Precio2 = false ;
         A65ArtCod = AV8vArtCodDes ;
         n2932Precio2 = false ;
         /* Using cursor P00L819 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A2931Limite2), Boolean.valueOf(n2932Precio2), A2932Precio2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECARB");
         if ( (pr_default.getStatus(17) == 1) )
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
         A65ArtCod = W65ArtCod ;
         A2931Limite2 = W2931Limite2 ;
         A2932Precio2 = W2932Precio2 ;
         n2932Precio2 = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         pr_default.readNext(16);
      }
      pr_default.close(16);
      /* Using cursor P00L820 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV9vArtCodOri});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A65ArtCod = P00L820_A65ArtCod[0] ;
         A3323RecPorInc = P00L820_A3323RecPorInc[0] ;
         n3323RecPorInc = P00L820_n3323RecPorInc[0] ;
         A2941RecBon = P00L820_A2941RecBon[0] ;
         n2941RecBon = P00L820_n2941RecBon[0] ;
         A2940Precio4 = P00L820_A2940Precio4[0] ;
         n2940Precio4 = P00L820_n2940Precio4[0] ;
         A2939Limite4 = P00L820_A2939Limite4[0] ;
         A2937RecIntCod = P00L820_A2937RecIntCod[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         /*
            INSERT RECORD ON TABLE TXPLRBART

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W2937RecIntCod = A2937RecIntCod ;
         W2939Limite4 = A2939Limite4 ;
         A65ArtCod = AV8vArtCodDes ;
         /* Using cursor P00L821 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A2937RecIntCod), Short.valueOf(A2939Limite4), Boolean.valueOf(n2940Precio4), A2940Precio4, Boolean.valueOf(n2941RecBon), A2941RecBon, Boolean.valueOf(n3323RecPorInc), A3323RecPorInc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRBART");
         if ( (pr_default.getStatus(19) == 1) )
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
         A65ArtCod = W65ArtCod ;
         A2937RecIntCod = W2937RecIntCod ;
         A2939Limite4 = W2939Limite4 ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pgprecio");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Entre = "" ;
      scmdbuf = "" ;
      P00L82_A396EmprCod = new String[] {""} ;
      P00L82_A252CliCod = new int[1] ;
      P00L82_A65ArtCod = new String[] {""} ;
      P00L82_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L82_n92ArtPreKgm = new boolean[] {false} ;
      P00L82_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L82_n93ArtPreMtr = new boolean[] {false} ;
      P00L82_A91ArtPreDef = new String[] {""} ;
      P00L82_n91ArtPreDef = new boolean[] {false} ;
      A65ArtCod = "" ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A91ArtPreDef = "" ;
      AV11ArtPreKgm = DecimalUtil.ZERO ;
      AV12ArtPreMtr = DecimalUtil.ZERO ;
      AV13ArtPreDef = "" ;
      P00L87_A396EmprCod = new String[] {""} ;
      P00L87_A252CliCod = new int[1] ;
      P00L87_A65ArtCod = new String[] {""} ;
      P00L87_A831TipColCod = new byte[1] ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      Gx_emsg = "" ;
      P00L89_A396EmprCod = new String[] {""} ;
      P00L89_A252CliCod = new int[1] ;
      P00L89_A65ArtCod = new String[] {""} ;
      P00L89_A3616PreFacCod = new String[] {""} ;
      P00L89_n3616PreFacCod = new boolean[] {false} ;
      P00L89_A585IntPreDef = new String[] {""} ;
      P00L89_n585IntPreDef = new boolean[] {false} ;
      P00L89_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L89_n587IntPreMtr = new boolean[] {false} ;
      P00L89_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L89_n586IntPreKgm = new boolean[] {false} ;
      P00L89_A583IntCod = new byte[1] ;
      P00L89_A831TipColCod = new byte[1] ;
      A3616PreFacCod = "" ;
      A585IntPreDef = "" ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      W585IntPreDef = "" ;
      W586IntPreKgm = DecimalUtil.ZERO ;
      W587IntPreMtr = DecimalUtil.ZERO ;
      P00L811_A396EmprCod = new String[] {""} ;
      P00L811_A252CliCod = new int[1] ;
      P00L811_A65ArtCod = new String[] {""} ;
      P00L811_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L811_n675PorRec = new boolean[] {false} ;
      P00L811_A596LimUni = new int[1] ;
      P00L811_n596LimUni = new boolean[] {false} ;
      P00L811_A598LinRec = new byte[1] ;
      A675PorRec = DecimalUtil.ZERO ;
      W675PorRec = DecimalUtil.ZERO ;
      P00L814_A396EmprCod = new String[] {""} ;
      P00L814_A252CliCod = new int[1] ;
      P00L814_A65ArtCod = new String[] {""} ;
      P00L814_A4325RecIOB = new String[] {""} ;
      P00L814_n4325RecIOB = new boolean[] {false} ;
      P00L814_A4324RecIPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L814_n4324RecIPor = new boolean[] {false} ;
      P00L814_A4323RecIImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L814_n4323RecIImp = new boolean[] {false} ;
      P00L814_A4322Limite5 = new short[1] ;
      P00L814_A583IntCod = new byte[1] ;
      P00L814_A831TipColCod = new byte[1] ;
      A4325RecIOB = "" ;
      A4324RecIPor = DecimalUtil.ZERO ;
      A4323RecIImp = DecimalUtil.ZERO ;
      P00L818_A396EmprCod = new String[] {""} ;
      P00L818_A252CliCod = new int[1] ;
      P00L818_A65ArtCod = new String[] {""} ;
      P00L818_A2932Precio2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L818_n2932Precio2 = new boolean[] {false} ;
      P00L818_A2931Limite2 = new short[1] ;
      A2932Precio2 = DecimalUtil.ZERO ;
      W2932Precio2 = DecimalUtil.ZERO ;
      P00L820_A396EmprCod = new String[] {""} ;
      P00L820_A252CliCod = new int[1] ;
      P00L820_A65ArtCod = new String[] {""} ;
      P00L820_A3323RecPorInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L820_n3323RecPorInc = new boolean[] {false} ;
      P00L820_A2941RecBon = new String[] {""} ;
      P00L820_n2941RecBon = new boolean[] {false} ;
      P00L820_A2940Precio4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L820_n2940Precio4 = new boolean[] {false} ;
      P00L820_A2939Limite4 = new short[1] ;
      P00L820_A2937RecIntCod = new byte[1] ;
      A3323RecPorInc = DecimalUtil.ZERO ;
      A2941RecBon = "" ;
      A2940Precio4 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgprecio__default(),
         new Object[] {
             new Object[] {
            P00L82_A396EmprCod, P00L82_A252CliCod, P00L82_A65ArtCod, P00L82_A92ArtPreKgm, P00L82_n92ArtPreKgm, P00L82_A93ArtPreMtr, P00L82_n93ArtPreMtr, P00L82_A91ArtPreDef, P00L82_n91ArtPreDef
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
            P00L87_A396EmprCod, P00L87_A252CliCod, P00L87_A65ArtCod, P00L87_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00L89_A396EmprCod, P00L89_A252CliCod, P00L89_A65ArtCod, P00L89_A3616PreFacCod, P00L89_n3616PreFacCod, P00L89_A585IntPreDef, P00L89_n585IntPreDef, P00L89_A587IntPreMtr, P00L89_n587IntPreMtr, P00L89_A586IntPreKgm,
            P00L89_n586IntPreKgm, P00L89_A583IntCod, P00L89_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00L811_A396EmprCod, P00L811_A252CliCod, P00L811_A65ArtCod, P00L811_A675PorRec, P00L811_n675PorRec, P00L811_A596LimUni, P00L811_n596LimUni, P00L811_A598LinRec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00L814_A396EmprCod, P00L814_A252CliCod, P00L814_A65ArtCod, P00L814_A4325RecIOB, P00L814_n4325RecIOB, P00L814_A4324RecIPor, P00L814_n4324RecIPor, P00L814_A4323RecIImp, P00L814_n4323RecIImp, P00L814_A4322Limite5,
            P00L814_A583IntCod, P00L814_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00L818_A396EmprCod, P00L818_A252CliCod, P00L818_A65ArtCod, P00L818_A2932Precio2, P00L818_n2932Precio2, P00L818_A2931Limite2
            }
            , new Object[] {
            }
            , new Object[] {
            P00L820_A396EmprCod, P00L820_A252CliCod, P00L820_A65ArtCod, P00L820_A3323RecPorInc, P00L820_n3323RecPorInc, P00L820_A2941RecBon, P00L820_n2941RecBon, P00L820_A2940Precio4, P00L820_n2940Precio4, P00L820_A2939Limite4,
            P00L820_A2937RecIntCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte W831TipColCod ;
   private byte A583IntCod ;
   private byte W583IntCod ;
   private byte A598LinRec ;
   private byte W598LinRec ;
   private byte A2937RecIntCod ;
   private byte W2937RecIntCod ;
   private short Gx_err ;
   private short A4322Limite5 ;
   private short W4322Limite5 ;
   private short A2931Limite2 ;
   private short W2931Limite2 ;
   private short A2939Limite4 ;
   private short W2939Limite4 ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS83 ;
   private int GX_INS84 ;
   private int A596LimUni ;
   private int GX_INS95 ;
   private int W596LimUni ;
   private int GX_INS657 ;
   private int GX_INS430 ;
   private int GX_INS434 ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal AV11ArtPreKgm ;
   private java.math.BigDecimal AV12ArtPreMtr ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal W586IntPreKgm ;
   private java.math.BigDecimal W587IntPreMtr ;
   private java.math.BigDecimal A675PorRec ;
   private java.math.BigDecimal W675PorRec ;
   private java.math.BigDecimal A4324RecIPor ;
   private java.math.BigDecimal A4323RecIImp ;
   private java.math.BigDecimal A2932Precio2 ;
   private java.math.BigDecimal W2932Precio2 ;
   private java.math.BigDecimal A3323RecPorInc ;
   private java.math.BigDecimal A2940Precio4 ;
   private String A396EmprCod ;
   private String AV9vArtCodOri ;
   private String AV8vArtCodDes ;
   private String AV10Entre ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A91ArtPreDef ;
   private String AV13ArtPreDef ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String Gx_emsg ;
   private String A3616PreFacCod ;
   private String A585IntPreDef ;
   private String W585IntPreDef ;
   private String A4325RecIOB ;
   private String A2941RecBon ;
   private boolean n92ArtPreKgm ;
   private boolean n93ArtPreMtr ;
   private boolean n91ArtPreDef ;
   private boolean n3616PreFacCod ;
   private boolean n585IntPreDef ;
   private boolean n587IntPreMtr ;
   private boolean n586IntPreKgm ;
   private boolean n675PorRec ;
   private boolean n596LimUni ;
   private boolean n4325RecIOB ;
   private boolean n4324RecIPor ;
   private boolean n4323RecIImp ;
   private boolean n2932Precio2 ;
   private boolean n3323RecPorInc ;
   private boolean n2941RecBon ;
   private boolean n2940Precio4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00L82_A396EmprCod ;
   private int[] P00L82_A252CliCod ;
   private String[] P00L82_A65ArtCod ;
   private java.math.BigDecimal[] P00L82_A92ArtPreKgm ;
   private boolean[] P00L82_n92ArtPreKgm ;
   private java.math.BigDecimal[] P00L82_A93ArtPreMtr ;
   private boolean[] P00L82_n93ArtPreMtr ;
   private String[] P00L82_A91ArtPreDef ;
   private boolean[] P00L82_n91ArtPreDef ;
   private String[] P00L87_A396EmprCod ;
   private int[] P00L87_A252CliCod ;
   private String[] P00L87_A65ArtCod ;
   private byte[] P00L87_A831TipColCod ;
   private String[] P00L89_A396EmprCod ;
   private int[] P00L89_A252CliCod ;
   private String[] P00L89_A65ArtCod ;
   private String[] P00L89_A3616PreFacCod ;
   private boolean[] P00L89_n3616PreFacCod ;
   private String[] P00L89_A585IntPreDef ;
   private boolean[] P00L89_n585IntPreDef ;
   private java.math.BigDecimal[] P00L89_A587IntPreMtr ;
   private boolean[] P00L89_n587IntPreMtr ;
   private java.math.BigDecimal[] P00L89_A586IntPreKgm ;
   private boolean[] P00L89_n586IntPreKgm ;
   private byte[] P00L89_A583IntCod ;
   private byte[] P00L89_A831TipColCod ;
   private String[] P00L811_A396EmprCod ;
   private int[] P00L811_A252CliCod ;
   private String[] P00L811_A65ArtCod ;
   private java.math.BigDecimal[] P00L811_A675PorRec ;
   private boolean[] P00L811_n675PorRec ;
   private int[] P00L811_A596LimUni ;
   private boolean[] P00L811_n596LimUni ;
   private byte[] P00L811_A598LinRec ;
   private String[] P00L814_A396EmprCod ;
   private int[] P00L814_A252CliCod ;
   private String[] P00L814_A65ArtCod ;
   private String[] P00L814_A4325RecIOB ;
   private boolean[] P00L814_n4325RecIOB ;
   private java.math.BigDecimal[] P00L814_A4324RecIPor ;
   private boolean[] P00L814_n4324RecIPor ;
   private java.math.BigDecimal[] P00L814_A4323RecIImp ;
   private boolean[] P00L814_n4323RecIImp ;
   private short[] P00L814_A4322Limite5 ;
   private byte[] P00L814_A583IntCod ;
   private byte[] P00L814_A831TipColCod ;
   private String[] P00L818_A396EmprCod ;
   private int[] P00L818_A252CliCod ;
   private String[] P00L818_A65ArtCod ;
   private java.math.BigDecimal[] P00L818_A2932Precio2 ;
   private boolean[] P00L818_n2932Precio2 ;
   private short[] P00L818_A2931Limite2 ;
   private String[] P00L820_A396EmprCod ;
   private int[] P00L820_A252CliCod ;
   private String[] P00L820_A65ArtCod ;
   private java.math.BigDecimal[] P00L820_A3323RecPorInc ;
   private boolean[] P00L820_n3323RecPorInc ;
   private String[] P00L820_A2941RecBon ;
   private boolean[] P00L820_n2941RecBon ;
   private java.math.BigDecimal[] P00L820_A2940Precio4 ;
   private boolean[] P00L820_n2940Precio4 ;
   private short[] P00L820_A2939Limite4 ;
   private byte[] P00L820_A2937RecIntCod ;
}

final  class pgprecio__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00L82", "SELECT EmprCod, CliCod, ArtCod, ArtPreKgm, ArtPreMtr, ArtPreDef FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00L83", "UPDATE TXPARTICU SET ArtPreDef=?, ArtPreMtr=?, ArtPreKgm=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new UpdateCursor("P00L84", "DELETE FROM TXPPRETCO  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETCO")
         ,new UpdateCursor("P00L85", "DELETE FROM TXPPRETIN  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
         ,new UpdateCursor("P00L86", "DELETE FROM TXPRECARG  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECARG")
         ,new ForEachCursor("P00L87", "SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00L88", "INSERT INTO TXPPRETCO(EmprCod, CliCod, ArtCod, TipColCod) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETCO")
         ,new ForEachCursor("P00L89", "SELECT EmprCod, CliCod, ArtCod, PreFacCod, IntPreDef, IntPreMtr, IntPreKgm, IntCod, TipColCod FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00L810", "INSERT INTO TXPPRETIN(EmprCod, CliCod, ArtCod, TipColCod, IntCod, IntPreKgm, IntPreMtr, IntPreDef, PreFacCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
         ,new ForEachCursor("P00L811", "SELECT EmprCod, CliCod, ArtCod, PorRec, LimUni, LinRec FROM TXPRECARG WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00L812", "INSERT INTO TXPRECARG(EmprCod, CliCod, ArtCod, LinRec, LimUni, PorRec) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECARG")
         ,new UpdateCursor("P00L813", "DELETE FROM TXPRecInt  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRecInt")
         ,new ForEachCursor("P00L814", "SELECT EmprCod, CliCod, ArtCod, RecIOB, RecIPor, RecIImp, Limite5, IntCod, TipColCod FROM TXPRecInt WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00L815", "INSERT INTO TXPRecInt(EmprCod, CliCod, ArtCod, TipColCod, IntCod, Limite5, RecIImp, RecIPor, RecIOB) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRecInt")
         ,new UpdateCursor("P00L816", "DELETE FROM TXPRECARB  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECARB")
         ,new UpdateCursor("P00L817", "DELETE FROM TXPLRBART  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRBART")
         ,new ForEachCursor("P00L818", "SELECT EmprCod, CliCod, ArtCod, Precio2, Limite2 FROM TXPRECARB WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Limite2 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00L819", "INSERT INTO TXPRECARB(EmprCod, CliCod, ArtCod, Limite2, Precio2) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECARB")
         ,new ForEachCursor("P00L820", "SELECT EmprCod, CliCod, ArtCod, RecPorInc, RecBon, Precio4, Limite4, RecIntCod FROM TXPLRBART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, RecIntCod, Limite4 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00L821", "INSERT INTO TXPLRBART(EmprCod, CliCod, ArtCod, RecIntCod, Limite4, Precio4, RecBon, RecPorInc) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRBART")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
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
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 1);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 5);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               return;
      }
   }

}

