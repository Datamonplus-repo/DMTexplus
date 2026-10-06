package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccvarnew extends GXProcedure
{
   public pccvarnew( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccvarnew.class ), "" );
   }

   public pccvarnew( int remoteHandle ,
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
      AV4GXLvl1 = (byte)(0) ;
      /* Using cursor P04KV2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11528CCVTpoDat = P04KV2_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = P04KV2_n11528CCVTpoDat[0] ;
         A11526CCVPict = P04KV2_A11526CCVPict[0] ;
         n11526CCVPict = P04KV2_n11526CCVPict[0] ;
         A11527CCVLgoDat = P04KV2_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = P04KV2_n11527CCVLgoDat[0] ;
         A11529CCVDsc = P04KV2_A11529CCVDsc[0] ;
         n11529CCVDsc = P04KV2_n11529CCVDsc[0] ;
         A11522CCVCod = P04KV2_A11522CCVCod[0] ;
         A11533CCVCalc = P04KV2_A11533CCVCalc[0] ;
         n11533CCVCalc = P04KV2_n11533CCVCalc[0] ;
         A396EmprCod = P04KV2_A396EmprCod[0] ;
         AV4GXLvl1 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV4GXLvl1 == 0 )
      {
         /* Using cursor P04KV3 */
         pr_default.execute(1);
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P04KV3_A396EmprCod[0] ;
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "NoAplica", "") ;
            A11529CCVDsc = "" ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = "" ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(0) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = "" ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "PedMtr", "") ;
            A11529CCVDsc = httpContext.getMessage( "Metros Pedidos", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(9) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZZZ9.99", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
            if ( (pr_default.getStatus(3) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "PedKgr", "") ;
            A11529CCVDsc = httpContext.getMessage( "Kilos Pedidos", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(9) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZZZ9.99", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
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
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AsiMtr", "") ;
            A11529CCVDsc = httpContext.getMessage( "Metros Asignados", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(9) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZZZ9.99", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV7 */
            pr_default.execute(5, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
            if ( (pr_default.getStatus(5) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AsiKgr", "") ;
            A11529CCVDsc = httpContext.getMessage( "Kilos Asignados", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(9) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZZZ9.99", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV8 */
            pr_default.execute(6, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
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
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AsiPie", "") ;
            A11529CCVDsc = httpContext.getMessage( "# Piezas asignadas", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(5) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZZ9", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV9 */
            pr_default.execute(7, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
            if ( (pr_default.getStatus(7) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AcaMtr", "") ;
            A11529CCVDsc = httpContext.getMessage( "Metros Reales", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(9) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZZZ9.99", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV10 */
            pr_default.execute(8, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
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
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AcaKgr", "") ;
            A11529CCVDsc = httpContext.getMessage( "Kilos Reales", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(9) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZZZ9.99", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV11 */
            pr_default.execute(9, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
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
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AcaPie", "") ;
            A11529CCVDsc = httpContext.getMessage( "# Piezas despachadas", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(5) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZZ9", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV12 */
            pr_default.execute(10, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
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
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "DefMtr", "") ;
            A11529CCVDsc = httpContext.getMessage( "Mts c/Defectos", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(9) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZZZ9.99", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV13 */
            pr_default.execute(11, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
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
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "FchCmp", "") ;
            A11529CCVDsc = httpContext.getMessage( "Fecha compromiso", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "F", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(10) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = "99/99/9999" ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV14 */
            pr_default.execute(12, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
            if ( (pr_default.getStatus(12) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "FchAca", "") ;
            A11529CCVDsc = httpContext.getMessage( "Fecha despacho", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "F", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(10) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = "99/99/9999" ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV15 */
            pr_default.execute(13, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
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
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AcaAnc", "") ;
            A11529CCVDsc = httpContext.getMessage( "Ancho", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(3) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZ9", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV16 */
            pr_default.execute(14, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
            if ( (pr_default.getStatus(14) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AcaGra", "") ;
            A11529CCVDsc = httpContext.getMessage( "Gramaje", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(4) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZ9", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV17 */
            pr_default.execute(15, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
            if ( (pr_default.getStatus(15) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AcaRen", "") ;
            A11529CCVDsc = httpContext.getMessage( "Rendimiento", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(6) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZ9.99", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV18 */
            pr_default.execute(16, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
            if ( (pr_default.getStatus(16) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPCCVar

            */
            A11522CCVCod = httpContext.getMessage( "AcaPML", "") ;
            A11529CCVDsc = httpContext.getMessage( "PML", "") ;
            n11529CCVDsc = false ;
            A11528CCVTpoDat = httpContext.getMessage( "N", "") ;
            n11528CCVTpoDat = false ;
            A11527CCVLgoDat = (short)(4) ;
            n11527CCVLgoDat = false ;
            A11526CCVPict = httpContext.getMessage( "ZZZ9", "") ;
            n11526CCVPict = false ;
            A11533CCVCalc = "" ;
            n11533CCVCalc = false ;
            /* Using cursor P04KV19 */
            pr_default.execute(17, new Object[] {A396EmprCod, A11522CCVCod, Boolean.valueOf(n11529CCVDsc), A11529CCVDsc, Boolean.valueOf(n11527CCVLgoDat), Short.valueOf(A11527CCVLgoDat), Boolean.valueOf(n11528CCVTpoDat), A11528CCVTpoDat, Boolean.valueOf(n11526CCVPict), A11526CCVPict, Boolean.valueOf(n11533CCVCalc), A11533CCVCalc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCVar");
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
            /* End Insert */
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.pccvarnew");
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
      P04KV2_A11528CCVTpoDat = new String[] {""} ;
      P04KV2_n11528CCVTpoDat = new boolean[] {false} ;
      P04KV2_A11526CCVPict = new String[] {""} ;
      P04KV2_n11526CCVPict = new boolean[] {false} ;
      P04KV2_A11527CCVLgoDat = new short[1] ;
      P04KV2_n11527CCVLgoDat = new boolean[] {false} ;
      P04KV2_A11529CCVDsc = new String[] {""} ;
      P04KV2_n11529CCVDsc = new boolean[] {false} ;
      P04KV2_A11522CCVCod = new String[] {""} ;
      P04KV2_A11533CCVCalc = new String[] {""} ;
      P04KV2_n11533CCVCalc = new boolean[] {false} ;
      P04KV2_A396EmprCod = new String[] {""} ;
      A11528CCVTpoDat = "" ;
      A11526CCVPict = "" ;
      A11529CCVDsc = "" ;
      A11522CCVCod = "" ;
      A11533CCVCalc = "" ;
      A396EmprCod = "" ;
      P04KV3_A396EmprCod = new String[] {""} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccvarnew__default(),
         new Object[] {
             new Object[] {
            P04KV2_A11528CCVTpoDat, P04KV2_n11528CCVTpoDat, P04KV2_A11526CCVPict, P04KV2_n11526CCVPict, P04KV2_A11527CCVLgoDat, P04KV2_n11527CCVLgoDat, P04KV2_A11529CCVDsc, P04KV2_n11529CCVDsc, P04KV2_A11522CCVCod, P04KV2_A11533CCVCalc,
            P04KV2_n11533CCVCalc, P04KV2_A396EmprCod
            }
            , new Object[] {
            P04KV3_A396EmprCod
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
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV4GXLvl1 ;
   private short A11527CCVLgoDat ;
   private short Gx_err ;
   private int GX_INS1536 ;
   private String scmdbuf ;
   private String A11528CCVTpoDat ;
   private String A11526CCVPict ;
   private String A11529CCVDsc ;
   private String A11522CCVCod ;
   private String A11533CCVCalc ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private boolean n11528CCVTpoDat ;
   private boolean n11526CCVPict ;
   private boolean n11527CCVLgoDat ;
   private boolean n11529CCVDsc ;
   private boolean n11533CCVCalc ;
   private IDataStoreProvider pr_default ;
   private String[] P04KV2_A11528CCVTpoDat ;
   private boolean[] P04KV2_n11528CCVTpoDat ;
   private String[] P04KV2_A11526CCVPict ;
   private boolean[] P04KV2_n11526CCVPict ;
   private short[] P04KV2_A11527CCVLgoDat ;
   private boolean[] P04KV2_n11527CCVLgoDat ;
   private String[] P04KV2_A11529CCVDsc ;
   private boolean[] P04KV2_n11529CCVDsc ;
   private String[] P04KV2_A11522CCVCod ;
   private String[] P04KV2_A11533CCVCalc ;
   private boolean[] P04KV2_n11533CCVCalc ;
   private String[] P04KV2_A396EmprCod ;
   private String[] P04KV3_A396EmprCod ;
}

final  class pccvarnew__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04KV2", "SELECT CCVTpoDat, CCVPict, CCVLgoDat, CCVDsc, CCVCod, CCVCalc, EmprCod FROM TXPCCVar ORDER BY EmprCod, CCVCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04KV3", "SELECT EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04KV4", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV5", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV6", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV7", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV8", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV9", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV10", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV11", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV12", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV13", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV14", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV15", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV16", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV17", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV18", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
         ,new UpdateCursor("P04KV19", "INSERT INTO TXPCCVar(EmprCod, CCVCod, CCVDsc, CCVLgoDat, CCVTpoDat, CCVPict, CCVCalc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCVar")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 10);
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               return;
      }
   }

}

