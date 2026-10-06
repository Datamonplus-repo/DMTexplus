package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptex021 extends GXProcedure
{
   public ptex021( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptex021.class ), "" );
   }

   public ptex021( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      ptex021.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      ptex021.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptex021.this.AV19Tex_npedi = aP1[0];
      this.aP1 = aP1;
      ptex021.this.AV21Op = aP2[0];
      this.aP2 = aP2;
      ptex021.this.AV20Tex_nped = aP3[0];
      this.aP3 = aP3;
      ptex021.this.AV13usurcod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV21Op, httpContext.getMessage( "N", "")) == 0 )
      {
         if ( AV19Tex_npedi == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay OP seleccionada ¡¡¡", ""));
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         if ( AV19Tex_npedi > 0 )
         {
            GXv_int1[0] = AV20Tex_nped ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEX000", ""), GXv_int1) ;
            ptex021.this.AV20Tex_nped = GXv_int1[0] ;
            /* Using cursor P02W62 */
            pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV19Tex_npedi)});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A6850Tex_NPed = P02W62_A6850Tex_NPed[0] ;
               A7400Tex_FecEnt = P02W62_A7400Tex_FecEnt[0] ;
               n7400Tex_FecEnt = P02W62_n7400Tex_FecEnt[0] ;
               A7399Tex_FecTen = P02W62_A7399Tex_FecTen[0] ;
               n7399Tex_FecTen = P02W62_n7399Tex_FecTen[0] ;
               A7398Tex_FecTej = P02W62_A7398Tex_FecTej[0] ;
               n7398Tex_FecTej = P02W62_n7398Tex_FecTej[0] ;
               A7274Tex_subcli = P02W62_A7274Tex_subcli[0] ;
               n7274Tex_subcli = P02W62_n7274Tex_subcli[0] ;
               A5098TipDisCod = P02W62_A5098TipDisCod[0] ;
               n5098TipDisCod = P02W62_n5098TipDisCod[0] ;
               A6856Tex_Estado = P02W62_A6856Tex_Estado[0] ;
               n6856Tex_Estado = P02W62_n6856Tex_Estado[0] ;
               A6854Tex_Obs = P02W62_A6854Tex_Obs[0] ;
               n6854Tex_Obs = P02W62_n6854Tex_Obs[0] ;
               A6853Tex_UltL = P02W62_A6853Tex_UltL[0] ;
               n6853Tex_UltL = P02W62_n6853Tex_UltL[0] ;
               A6852Tex_PedC = P02W62_A6852Tex_PedC[0] ;
               n6852Tex_PedC = P02W62_n6852Tex_PedC[0] ;
               A6851Tex_FecP = P02W62_A6851Tex_FecP[0] ;
               n6851Tex_FecP = P02W62_n6851Tex_FecP[0] ;
               A252CliCod = P02W62_A252CliCod[0] ;
               n252CliCod = P02W62_n252CliCod[0] ;
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               /*
                  INSERT RECORD ON TABLE TXPTEX000

               */
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               A6850Tex_NPed = AV20Tex_nped ;
               /* Using cursor P02W63 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n6851Tex_FecP), A6851Tex_FecP, Boolean.valueOf(n6852Tex_PedC), A6852Tex_PedC, Boolean.valueOf(n6853Tex_UltL), Short.valueOf(A6853Tex_UltL), Boolean.valueOf(n6854Tex_Obs), A6854Tex_Obs, Boolean.valueOf(n6856Tex_Estado), Byte.valueOf(A6856Tex_Estado), Boolean.valueOf(n5098TipDisCod), A5098TipDisCod, Boolean.valueOf(n7274Tex_subcli), A7274Tex_subcli, Boolean.valueOf(n7398Tex_FecTej), A7398Tex_FecTej, Boolean.valueOf(n7399Tex_FecTen), A7399Tex_FecTen, Boolean.valueOf(n7400Tex_FecEnt), A7400Tex_FecEnt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX000");
               if ( (pr_default.getStatus(1) == 1) )
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
               A6850Tex_NPed = W6850Tex_NPed ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A6850Tex_NPed = W6850Tex_NPed ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            /* Using cursor P02W64 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV19Tex_npedi)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A6850Tex_NPed = P02W64_A6850Tex_NPed[0] ;
               A8327Tex_NumH = P02W64_A8327Tex_NumH[0] ;
               n8327Tex_NumH = P02W64_n8327Tex_NumH[0] ;
               A8326Tex_UHdr = P02W64_A8326Tex_UHdr[0] ;
               n8326Tex_UHdr = P02W64_n8326Tex_UHdr[0] ;
               A8325Tex_PHdr = P02W64_A8325Tex_PHdr[0] ;
               n8325Tex_PHdr = P02W64_n8325Tex_PHdr[0] ;
               A8161Tex_KgsNt = P02W64_A8161Tex_KgsNt[0] ;
               n8161Tex_KgsNt = P02W64_n8161Tex_KgsNt[0] ;
               A7830Tex_imp = P02W64_A7830Tex_imp[0] ;
               n7830Tex_imp = P02W64_n7830Tex_imp[0] ;
               A7536Tex_NomCo2 = P02W64_A7536Tex_NomCo2[0] ;
               n7536Tex_NomCo2 = P02W64_n7536Tex_NomCo2[0] ;
               A7401Tex_TipT = P02W64_A7401Tex_TipT[0] ;
               n7401Tex_TipT = P02W64_n7401Tex_TipT[0] ;
               A7061Tex_Tip = P02W64_A7061Tex_Tip[0] ;
               n7061Tex_Tip = P02W64_n7061Tex_Tip[0] ;
               A7060Tex_st = P02W64_A7060Tex_st[0] ;
               n7060Tex_st = P02W64_n7060Tex_st[0] ;
               A7017Tex_KgsP = P02W64_A7017Tex_KgsP[0] ;
               n7017Tex_KgsP = P02W64_n7017Tex_KgsP[0] ;
               A6995Tex_Maestr = P02W64_A6995Tex_Maestr[0] ;
               n6995Tex_Maestr = P02W64_n6995Tex_Maestr[0] ;
               A6994Tex_Talla = P02W64_A6994Tex_Talla[0] ;
               n6994Tex_Talla = P02W64_n6994Tex_Talla[0] ;
               A6993Tex_MerTn = P02W64_A6993Tex_MerTn[0] ;
               n6993Tex_MerTn = P02W64_n6993Tex_MerTn[0] ;
               A6992Tex_MerTj = P02W64_A6992Tex_MerTj[0] ;
               n6992Tex_MerTj = P02W64_n6992Tex_MerTj[0] ;
               A6991Tex_Unidad = P02W64_A6991Tex_Unidad[0] ;
               n6991Tex_Unidad = P02W64_n6991Tex_Unidad[0] ;
               A6864Tex_Discod = P02W64_A6864Tex_Discod[0] ;
               n6864Tex_Discod = P02W64_n6864Tex_Discod[0] ;
               A6863Tex_TcCol = P02W64_A6863Tex_TcCol[0] ;
               n6863Tex_TcCol = P02W64_n6863Tex_TcCol[0] ;
               A6862Tex_NumCol = P02W64_A6862Tex_NumCol[0] ;
               n6862Tex_NumCol = P02W64_n6862Tex_NumCol[0] ;
               A6861Tex_NomCol = P02W64_A6861Tex_NomCol[0] ;
               n6861Tex_NomCol = P02W64_n6861Tex_NomCol[0] ;
               A6859Tex_artc = P02W64_A6859Tex_artc[0] ;
               n6859Tex_artc = P02W64_n6859Tex_artc[0] ;
               A6858Tex_Kgs = P02W64_A6858Tex_Kgs[0] ;
               n6858Tex_Kgs = P02W64_n6858Tex_Kgs[0] ;
               A6857Tex_Lin = P02W64_A6857Tex_Lin[0] ;
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               /*
                  INSERT RECORD ON TABLE TXPTEX001

               */
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               W6857Tex_Lin = A6857Tex_Lin ;
               A6850Tex_NPed = AV20Tex_nped ;
               /* Using cursor P02W65 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin), Boolean.valueOf(n6858Tex_Kgs), A6858Tex_Kgs, Boolean.valueOf(n6859Tex_artc), A6859Tex_artc, Boolean.valueOf(n6861Tex_NomCol), A6861Tex_NomCol, Boolean.valueOf(n6862Tex_NumCol), Integer.valueOf(A6862Tex_NumCol), Boolean.valueOf(n6863Tex_TcCol), Byte.valueOf(A6863Tex_TcCol), Boolean.valueOf(n6864Tex_Discod), Integer.valueOf(A6864Tex_Discod), Boolean.valueOf(n6991Tex_Unidad), Integer.valueOf(A6991Tex_Unidad), Boolean.valueOf(n6992Tex_MerTj), A6992Tex_MerTj, Boolean.valueOf(n6993Tex_MerTn), A6993Tex_MerTn, Boolean.valueOf(n6994Tex_Talla), A6994Tex_Talla, Boolean.valueOf(n6995Tex_Maestr), A6995Tex_Maestr, Boolean.valueOf(n7017Tex_KgsP), A7017Tex_KgsP, Boolean.valueOf(n7060Tex_st), Byte.valueOf(A7060Tex_st), Boolean.valueOf(n7061Tex_Tip), A7061Tex_Tip, Boolean.valueOf(n7401Tex_TipT), A7401Tex_TipT, Boolean.valueOf(n7536Tex_NomCo2), A7536Tex_NomCo2, Boolean.valueOf(n7830Tex_imp), A7830Tex_imp, Boolean.valueOf(n8161Tex_KgsNt), A8161Tex_KgsNt, Boolean.valueOf(n8325Tex_PHdr), Integer.valueOf(A8325Tex_PHdr), Boolean.valueOf(n8326Tex_UHdr), Integer.valueOf(A8326Tex_UHdr), Boolean.valueOf(n8327Tex_NumH), Short.valueOf(A8327Tex_NumH)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX001");
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
               A396EmprCod = W396EmprCod ;
               A6850Tex_NPed = W6850Tex_NPed ;
               A6857Tex_Lin = W6857Tex_Lin ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A6850Tex_NPed = W6850Tex_NPed ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P02W66 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV19Tex_npedi)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A6850Tex_NPed = P02W66_A6850Tex_NPed[0] ;
               A6999tex_Altura = P02W66_A6999tex_Altura[0] ;
               n6999tex_Altura = P02W66_n6999tex_Altura[0] ;
               A6998Tex_AnchoA = P02W66_A6998Tex_AnchoA[0] ;
               n6998Tex_AnchoA = P02W66_n6998Tex_AnchoA[0] ;
               A6997Tex_Unid = P02W66_A6997Tex_Unid[0] ;
               n6997Tex_Unid = P02W66_n6997Tex_Unid[0] ;
               A6996Tex_Ntalla = P02W66_A6996Tex_Ntalla[0] ;
               A6857Tex_Lin = P02W66_A6857Tex_Lin[0] ;
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               /*
                  INSERT RECORD ON TABLE TXPTEX002

               */
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               W6857Tex_Lin = A6857Tex_Lin ;
               W6996Tex_Ntalla = A6996Tex_Ntalla ;
               A6850Tex_NPed = AV20Tex_nped ;
               /* Using cursor P02W67 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin), A6996Tex_Ntalla, Boolean.valueOf(n6997Tex_Unid), Integer.valueOf(A6997Tex_Unid), Boolean.valueOf(n6998Tex_AnchoA), A6998Tex_AnchoA, Boolean.valueOf(n6999tex_Altura), A6999tex_Altura});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX002");
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
               A396EmprCod = W396EmprCod ;
               A6850Tex_NPed = W6850Tex_NPed ;
               A6857Tex_Lin = W6857Tex_Lin ;
               A6996Tex_Ntalla = W6996Tex_Ntalla ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A6850Tex_NPed = W6850Tex_NPed ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P02W68 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV19Tex_npedi)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A6850Tex_NPed = P02W68_A6850Tex_NPed[0] ;
               A7403Tex_UlTal = P02W68_A7403Tex_UlTal[0] ;
               n7403Tex_UlTal = P02W68_n7403Tex_UlTal[0] ;
               A7402Tex_TipArt = P02W68_A7402Tex_TipArt[0] ;
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               /*
                  INSERT RECORD ON TABLE TXPTEX004

               */
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               W7402Tex_TipArt = A7402Tex_TipArt ;
               A6850Tex_NPed = AV20Tex_nped ;
               /* Using cursor P02W69 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), A7402Tex_TipArt, Boolean.valueOf(n7403Tex_UlTal), Short.valueOf(A7403Tex_UlTal)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX004");
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
               A396EmprCod = W396EmprCod ;
               A6850Tex_NPed = W6850Tex_NPed ;
               A7402Tex_TipArt = W7402Tex_TipArt ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A6850Tex_NPed = W6850Tex_NPed ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            /* Using cursor P02W610 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV19Tex_npedi)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A6850Tex_NPed = P02W610_A6850Tex_NPed[0] ;
               A7407Tex_AltOp = P02W610_A7407Tex_AltOp[0] ;
               n7407Tex_AltOp = P02W610_n7407Tex_AltOp[0] ;
               A7406Tex_AncOp = P02W610_A7406Tex_AncOp[0] ;
               n7406Tex_AncOp = P02W610_n7406Tex_AncOp[0] ;
               A7405Tex_TalOP = P02W610_A7405Tex_TalOP[0] ;
               n7405Tex_TalOP = P02W610_n7405Tex_TalOP[0] ;
               A7404Tex_LnOP = P02W610_A7404Tex_LnOP[0] ;
               A7402Tex_TipArt = P02W610_A7402Tex_TipArt[0] ;
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               /*
                  INSERT RECORD ON TABLE TXPTEX003

               */
               W396EmprCod = A396EmprCod ;
               W6850Tex_NPed = A6850Tex_NPed ;
               W7402Tex_TipArt = A7402Tex_TipArt ;
               W7404Tex_LnOP = A7404Tex_LnOP ;
               A6850Tex_NPed = AV20Tex_nped ;
               /* Using cursor P02W611 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), A7402Tex_TipArt, Short.valueOf(A7404Tex_LnOP), Boolean.valueOf(n7405Tex_TalOP), A7405Tex_TalOP, Boolean.valueOf(n7406Tex_AncOp), A7406Tex_AncOp, Boolean.valueOf(n7407Tex_AltOp), A7407Tex_AltOp});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX003");
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
               A6850Tex_NPed = W6850Tex_NPed ;
               A7402Tex_TipArt = W7402Tex_TipArt ;
               A7404Tex_LnOP = W7404Tex_LnOP ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A6850Tex_NPed = W6850Tex_NPed ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptex021.this.A396EmprCod;
      this.aP1[0] = ptex021.this.AV19Tex_npedi;
      this.aP2[0] = ptex021.this.AV21Op;
      this.aP3[0] = ptex021.this.AV20Tex_nped;
      this.aP4[0] = ptex021.this.AV13usurcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptex021");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      scmdbuf = "" ;
      P02W62_A396EmprCod = new String[] {""} ;
      P02W62_A6850Tex_NPed = new int[1] ;
      P02W62_A7400Tex_FecEnt = new String[] {""} ;
      P02W62_n7400Tex_FecEnt = new boolean[] {false} ;
      P02W62_A7399Tex_FecTen = new String[] {""} ;
      P02W62_n7399Tex_FecTen = new boolean[] {false} ;
      P02W62_A7398Tex_FecTej = new String[] {""} ;
      P02W62_n7398Tex_FecTej = new boolean[] {false} ;
      P02W62_A7274Tex_subcli = new String[] {""} ;
      P02W62_n7274Tex_subcli = new boolean[] {false} ;
      P02W62_A5098TipDisCod = new String[] {""} ;
      P02W62_n5098TipDisCod = new boolean[] {false} ;
      P02W62_A6856Tex_Estado = new byte[1] ;
      P02W62_n6856Tex_Estado = new boolean[] {false} ;
      P02W62_A6854Tex_Obs = new String[] {""} ;
      P02W62_n6854Tex_Obs = new boolean[] {false} ;
      P02W62_A6853Tex_UltL = new short[1] ;
      P02W62_n6853Tex_UltL = new boolean[] {false} ;
      P02W62_A6852Tex_PedC = new String[] {""} ;
      P02W62_n6852Tex_PedC = new boolean[] {false} ;
      P02W62_A6851Tex_FecP = new java.util.Date[] {GXutil.nullDate()} ;
      P02W62_n6851Tex_FecP = new boolean[] {false} ;
      P02W62_A252CliCod = new int[1] ;
      P02W62_n252CliCod = new boolean[] {false} ;
      A7400Tex_FecEnt = "" ;
      A7399Tex_FecTen = "" ;
      A7398Tex_FecTej = "" ;
      A7274Tex_subcli = "" ;
      A5098TipDisCod = "" ;
      A6854Tex_Obs = "" ;
      A6852Tex_PedC = "" ;
      A6851Tex_FecP = GXutil.nullDate() ;
      W396EmprCod = "" ;
      Gx_emsg = "" ;
      P02W64_A396EmprCod = new String[] {""} ;
      P02W64_A6850Tex_NPed = new int[1] ;
      P02W64_A8327Tex_NumH = new short[1] ;
      P02W64_n8327Tex_NumH = new boolean[] {false} ;
      P02W64_A8326Tex_UHdr = new int[1] ;
      P02W64_n8326Tex_UHdr = new boolean[] {false} ;
      P02W64_A8325Tex_PHdr = new int[1] ;
      P02W64_n8325Tex_PHdr = new boolean[] {false} ;
      P02W64_A8161Tex_KgsNt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02W64_n8161Tex_KgsNt = new boolean[] {false} ;
      P02W64_A7830Tex_imp = new String[] {""} ;
      P02W64_n7830Tex_imp = new boolean[] {false} ;
      P02W64_A7536Tex_NomCo2 = new String[] {""} ;
      P02W64_n7536Tex_NomCo2 = new boolean[] {false} ;
      P02W64_A7401Tex_TipT = new String[] {""} ;
      P02W64_n7401Tex_TipT = new boolean[] {false} ;
      P02W64_A7061Tex_Tip = new String[] {""} ;
      P02W64_n7061Tex_Tip = new boolean[] {false} ;
      P02W64_A7060Tex_st = new byte[1] ;
      P02W64_n7060Tex_st = new boolean[] {false} ;
      P02W64_A7017Tex_KgsP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02W64_n7017Tex_KgsP = new boolean[] {false} ;
      P02W64_A6995Tex_Maestr = new String[] {""} ;
      P02W64_n6995Tex_Maestr = new boolean[] {false} ;
      P02W64_A6994Tex_Talla = new String[] {""} ;
      P02W64_n6994Tex_Talla = new boolean[] {false} ;
      P02W64_A6993Tex_MerTn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02W64_n6993Tex_MerTn = new boolean[] {false} ;
      P02W64_A6992Tex_MerTj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02W64_n6992Tex_MerTj = new boolean[] {false} ;
      P02W64_A6991Tex_Unidad = new int[1] ;
      P02W64_n6991Tex_Unidad = new boolean[] {false} ;
      P02W64_A6864Tex_Discod = new int[1] ;
      P02W64_n6864Tex_Discod = new boolean[] {false} ;
      P02W64_A6863Tex_TcCol = new byte[1] ;
      P02W64_n6863Tex_TcCol = new boolean[] {false} ;
      P02W64_A6862Tex_NumCol = new int[1] ;
      P02W64_n6862Tex_NumCol = new boolean[] {false} ;
      P02W64_A6861Tex_NomCol = new String[] {""} ;
      P02W64_n6861Tex_NomCol = new boolean[] {false} ;
      P02W64_A6859Tex_artc = new String[] {""} ;
      P02W64_n6859Tex_artc = new boolean[] {false} ;
      P02W64_A6858Tex_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02W64_n6858Tex_Kgs = new boolean[] {false} ;
      P02W64_A6857Tex_Lin = new short[1] ;
      A8161Tex_KgsNt = DecimalUtil.ZERO ;
      A7830Tex_imp = "" ;
      A7536Tex_NomCo2 = "" ;
      A7401Tex_TipT = "" ;
      A7061Tex_Tip = "" ;
      A7017Tex_KgsP = DecimalUtil.ZERO ;
      A6995Tex_Maestr = "" ;
      A6994Tex_Talla = "" ;
      A6993Tex_MerTn = DecimalUtil.ZERO ;
      A6992Tex_MerTj = DecimalUtil.ZERO ;
      A6861Tex_NomCol = "" ;
      A6859Tex_artc = "" ;
      A6858Tex_Kgs = DecimalUtil.ZERO ;
      P02W66_A396EmprCod = new String[] {""} ;
      P02W66_A6850Tex_NPed = new int[1] ;
      P02W66_A6999tex_Altura = new String[] {""} ;
      P02W66_n6999tex_Altura = new boolean[] {false} ;
      P02W66_A6998Tex_AnchoA = new String[] {""} ;
      P02W66_n6998Tex_AnchoA = new boolean[] {false} ;
      P02W66_A6997Tex_Unid = new int[1] ;
      P02W66_n6997Tex_Unid = new boolean[] {false} ;
      P02W66_A6996Tex_Ntalla = new String[] {""} ;
      P02W66_A6857Tex_Lin = new short[1] ;
      A6999tex_Altura = "" ;
      A6998Tex_AnchoA = "" ;
      A6996Tex_Ntalla = "" ;
      W6996Tex_Ntalla = "" ;
      P02W68_A396EmprCod = new String[] {""} ;
      P02W68_A6850Tex_NPed = new int[1] ;
      P02W68_A7403Tex_UlTal = new short[1] ;
      P02W68_n7403Tex_UlTal = new boolean[] {false} ;
      P02W68_A7402Tex_TipArt = new String[] {""} ;
      A7402Tex_TipArt = "" ;
      W7402Tex_TipArt = "" ;
      P02W610_A396EmprCod = new String[] {""} ;
      P02W610_A6850Tex_NPed = new int[1] ;
      P02W610_A7407Tex_AltOp = new String[] {""} ;
      P02W610_n7407Tex_AltOp = new boolean[] {false} ;
      P02W610_A7406Tex_AncOp = new String[] {""} ;
      P02W610_n7406Tex_AncOp = new boolean[] {false} ;
      P02W610_A7405Tex_TalOP = new String[] {""} ;
      P02W610_n7405Tex_TalOP = new boolean[] {false} ;
      P02W610_A7404Tex_LnOP = new short[1] ;
      P02W610_A7402Tex_TipArt = new String[] {""} ;
      A7407Tex_AltOp = "" ;
      A7406Tex_AncOp = "" ;
      A7405Tex_TalOP = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptex021__default(),
         new Object[] {
             new Object[] {
            P02W62_A396EmprCod, P02W62_A6850Tex_NPed, P02W62_A7400Tex_FecEnt, P02W62_n7400Tex_FecEnt, P02W62_A7399Tex_FecTen, P02W62_n7399Tex_FecTen, P02W62_A7398Tex_FecTej, P02W62_n7398Tex_FecTej, P02W62_A7274Tex_subcli, P02W62_n7274Tex_subcli,
            P02W62_A5098TipDisCod, P02W62_n5098TipDisCod, P02W62_A6856Tex_Estado, P02W62_n6856Tex_Estado, P02W62_A6854Tex_Obs, P02W62_n6854Tex_Obs, P02W62_A6853Tex_UltL, P02W62_n6853Tex_UltL, P02W62_A6852Tex_PedC, P02W62_n6852Tex_PedC,
            P02W62_A6851Tex_FecP, P02W62_n6851Tex_FecP, P02W62_A252CliCod, P02W62_n252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02W64_A396EmprCod, P02W64_A6850Tex_NPed, P02W64_A8327Tex_NumH, P02W64_n8327Tex_NumH, P02W64_A8326Tex_UHdr, P02W64_n8326Tex_UHdr, P02W64_A8325Tex_PHdr, P02W64_n8325Tex_PHdr, P02W64_A8161Tex_KgsNt, P02W64_n8161Tex_KgsNt,
            P02W64_A7830Tex_imp, P02W64_n7830Tex_imp, P02W64_A7536Tex_NomCo2, P02W64_n7536Tex_NomCo2, P02W64_A7401Tex_TipT, P02W64_n7401Tex_TipT, P02W64_A7061Tex_Tip, P02W64_n7061Tex_Tip, P02W64_A7060Tex_st, P02W64_n7060Tex_st,
            P02W64_A7017Tex_KgsP, P02W64_n7017Tex_KgsP, P02W64_A6995Tex_Maestr, P02W64_n6995Tex_Maestr, P02W64_A6994Tex_Talla, P02W64_n6994Tex_Talla, P02W64_A6993Tex_MerTn, P02W64_n6993Tex_MerTn, P02W64_A6992Tex_MerTj, P02W64_n6992Tex_MerTj,
            P02W64_A6991Tex_Unidad, P02W64_n6991Tex_Unidad, P02W64_A6864Tex_Discod, P02W64_n6864Tex_Discod, P02W64_A6863Tex_TcCol, P02W64_n6863Tex_TcCol, P02W64_A6862Tex_NumCol, P02W64_n6862Tex_NumCol, P02W64_A6861Tex_NomCol, P02W64_n6861Tex_NomCol,
            P02W64_A6859Tex_artc, P02W64_n6859Tex_artc, P02W64_A6858Tex_Kgs, P02W64_n6858Tex_Kgs, P02W64_A6857Tex_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            P02W66_A396EmprCod, P02W66_A6850Tex_NPed, P02W66_A6999tex_Altura, P02W66_n6999tex_Altura, P02W66_A6998Tex_AnchoA, P02W66_n6998Tex_AnchoA, P02W66_A6997Tex_Unid, P02W66_n6997Tex_Unid, P02W66_A6996Tex_Ntalla, P02W66_A6857Tex_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            P02W68_A396EmprCod, P02W68_A6850Tex_NPed, P02W68_A7403Tex_UlTal, P02W68_n7403Tex_UlTal, P02W68_A7402Tex_TipArt
            }
            , new Object[] {
            }
            , new Object[] {
            P02W610_A396EmprCod, P02W610_A6850Tex_NPed, P02W610_A7407Tex_AltOp, P02W610_n7407Tex_AltOp, P02W610_A7406Tex_AncOp, P02W610_n7406Tex_AncOp, P02W610_A7405Tex_TalOP, P02W610_n7405Tex_TalOP, P02W610_A7404Tex_LnOP, P02W610_A7402Tex_TipArt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A6856Tex_Estado ;
   private byte A7060Tex_st ;
   private byte A6863Tex_TcCol ;
   private short A6853Tex_UltL ;
   private short Gx_err ;
   private short A8327Tex_NumH ;
   private short A6857Tex_Lin ;
   private short W6857Tex_Lin ;
   private short A7403Tex_UlTal ;
   private short A7404Tex_LnOP ;
   private short W7404Tex_LnOP ;
   private int AV19Tex_npedi ;
   private int AV20Tex_nped ;
   private int GXv_int1[] ;
   private int A6850Tex_NPed ;
   private int A252CliCod ;
   private int W6850Tex_NPed ;
   private int GX_INS978 ;
   private int A8326Tex_UHdr ;
   private int A8325Tex_PHdr ;
   private int A6991Tex_Unidad ;
   private int A6864Tex_Discod ;
   private int A6862Tex_NumCol ;
   private int GX_INS979 ;
   private int A6997Tex_Unid ;
   private int GX_INS990 ;
   private int GX_INS1039 ;
   private int GX_INS1040 ;
   private java.math.BigDecimal A8161Tex_KgsNt ;
   private java.math.BigDecimal A7017Tex_KgsP ;
   private java.math.BigDecimal A6993Tex_MerTn ;
   private java.math.BigDecimal A6992Tex_MerTj ;
   private java.math.BigDecimal A6858Tex_Kgs ;
   private String A396EmprCod ;
   private String AV21Op ;
   private String AV13usurcod ;
   private String scmdbuf ;
   private String A7400Tex_FecEnt ;
   private String A7399Tex_FecTen ;
   private String A7398Tex_FecTej ;
   private String A7274Tex_subcli ;
   private String A5098TipDisCod ;
   private String A6852Tex_PedC ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private String A7830Tex_imp ;
   private String A7536Tex_NomCo2 ;
   private String A7401Tex_TipT ;
   private String A7061Tex_Tip ;
   private String A6995Tex_Maestr ;
   private String A6994Tex_Talla ;
   private String A6861Tex_NomCol ;
   private String A6859Tex_artc ;
   private String A6999tex_Altura ;
   private String A6998Tex_AnchoA ;
   private String A6996Tex_Ntalla ;
   private String W6996Tex_Ntalla ;
   private String A7402Tex_TipArt ;
   private String W7402Tex_TipArt ;
   private String A7407Tex_AltOp ;
   private String A7406Tex_AncOp ;
   private String A7405Tex_TalOP ;
   private java.util.Date A6851Tex_FecP ;
   private boolean returnInSub ;
   private boolean n7400Tex_FecEnt ;
   private boolean n7399Tex_FecTen ;
   private boolean n7398Tex_FecTej ;
   private boolean n7274Tex_subcli ;
   private boolean n5098TipDisCod ;
   private boolean n6856Tex_Estado ;
   private boolean n6854Tex_Obs ;
   private boolean n6853Tex_UltL ;
   private boolean n6852Tex_PedC ;
   private boolean n6851Tex_FecP ;
   private boolean n252CliCod ;
   private boolean n8327Tex_NumH ;
   private boolean n8326Tex_UHdr ;
   private boolean n8325Tex_PHdr ;
   private boolean n8161Tex_KgsNt ;
   private boolean n7830Tex_imp ;
   private boolean n7536Tex_NomCo2 ;
   private boolean n7401Tex_TipT ;
   private boolean n7061Tex_Tip ;
   private boolean n7060Tex_st ;
   private boolean n7017Tex_KgsP ;
   private boolean n6995Tex_Maestr ;
   private boolean n6994Tex_Talla ;
   private boolean n6993Tex_MerTn ;
   private boolean n6992Tex_MerTj ;
   private boolean n6991Tex_Unidad ;
   private boolean n6864Tex_Discod ;
   private boolean n6863Tex_TcCol ;
   private boolean n6862Tex_NumCol ;
   private boolean n6861Tex_NomCol ;
   private boolean n6859Tex_artc ;
   private boolean n6858Tex_Kgs ;
   private boolean n6999tex_Altura ;
   private boolean n6998Tex_AnchoA ;
   private boolean n6997Tex_Unid ;
   private boolean n7403Tex_UlTal ;
   private boolean n7407Tex_AltOp ;
   private boolean n7406Tex_AncOp ;
   private boolean n7405Tex_TalOP ;
   private String A6854Tex_Obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02W62_A396EmprCod ;
   private int[] P02W62_A6850Tex_NPed ;
   private String[] P02W62_A7400Tex_FecEnt ;
   private boolean[] P02W62_n7400Tex_FecEnt ;
   private String[] P02W62_A7399Tex_FecTen ;
   private boolean[] P02W62_n7399Tex_FecTen ;
   private String[] P02W62_A7398Tex_FecTej ;
   private boolean[] P02W62_n7398Tex_FecTej ;
   private String[] P02W62_A7274Tex_subcli ;
   private boolean[] P02W62_n7274Tex_subcli ;
   private String[] P02W62_A5098TipDisCod ;
   private boolean[] P02W62_n5098TipDisCod ;
   private byte[] P02W62_A6856Tex_Estado ;
   private boolean[] P02W62_n6856Tex_Estado ;
   private String[] P02W62_A6854Tex_Obs ;
   private boolean[] P02W62_n6854Tex_Obs ;
   private short[] P02W62_A6853Tex_UltL ;
   private boolean[] P02W62_n6853Tex_UltL ;
   private String[] P02W62_A6852Tex_PedC ;
   private boolean[] P02W62_n6852Tex_PedC ;
   private java.util.Date[] P02W62_A6851Tex_FecP ;
   private boolean[] P02W62_n6851Tex_FecP ;
   private int[] P02W62_A252CliCod ;
   private boolean[] P02W62_n252CliCod ;
   private String[] P02W64_A396EmprCod ;
   private int[] P02W64_A6850Tex_NPed ;
   private short[] P02W64_A8327Tex_NumH ;
   private boolean[] P02W64_n8327Tex_NumH ;
   private int[] P02W64_A8326Tex_UHdr ;
   private boolean[] P02W64_n8326Tex_UHdr ;
   private int[] P02W64_A8325Tex_PHdr ;
   private boolean[] P02W64_n8325Tex_PHdr ;
   private java.math.BigDecimal[] P02W64_A8161Tex_KgsNt ;
   private boolean[] P02W64_n8161Tex_KgsNt ;
   private String[] P02W64_A7830Tex_imp ;
   private boolean[] P02W64_n7830Tex_imp ;
   private String[] P02W64_A7536Tex_NomCo2 ;
   private boolean[] P02W64_n7536Tex_NomCo2 ;
   private String[] P02W64_A7401Tex_TipT ;
   private boolean[] P02W64_n7401Tex_TipT ;
   private String[] P02W64_A7061Tex_Tip ;
   private boolean[] P02W64_n7061Tex_Tip ;
   private byte[] P02W64_A7060Tex_st ;
   private boolean[] P02W64_n7060Tex_st ;
   private java.math.BigDecimal[] P02W64_A7017Tex_KgsP ;
   private boolean[] P02W64_n7017Tex_KgsP ;
   private String[] P02W64_A6995Tex_Maestr ;
   private boolean[] P02W64_n6995Tex_Maestr ;
   private String[] P02W64_A6994Tex_Talla ;
   private boolean[] P02W64_n6994Tex_Talla ;
   private java.math.BigDecimal[] P02W64_A6993Tex_MerTn ;
   private boolean[] P02W64_n6993Tex_MerTn ;
   private java.math.BigDecimal[] P02W64_A6992Tex_MerTj ;
   private boolean[] P02W64_n6992Tex_MerTj ;
   private int[] P02W64_A6991Tex_Unidad ;
   private boolean[] P02W64_n6991Tex_Unidad ;
   private int[] P02W64_A6864Tex_Discod ;
   private boolean[] P02W64_n6864Tex_Discod ;
   private byte[] P02W64_A6863Tex_TcCol ;
   private boolean[] P02W64_n6863Tex_TcCol ;
   private int[] P02W64_A6862Tex_NumCol ;
   private boolean[] P02W64_n6862Tex_NumCol ;
   private String[] P02W64_A6861Tex_NomCol ;
   private boolean[] P02W64_n6861Tex_NomCol ;
   private String[] P02W64_A6859Tex_artc ;
   private boolean[] P02W64_n6859Tex_artc ;
   private java.math.BigDecimal[] P02W64_A6858Tex_Kgs ;
   private boolean[] P02W64_n6858Tex_Kgs ;
   private short[] P02W64_A6857Tex_Lin ;
   private String[] P02W66_A396EmprCod ;
   private int[] P02W66_A6850Tex_NPed ;
   private String[] P02W66_A6999tex_Altura ;
   private boolean[] P02W66_n6999tex_Altura ;
   private String[] P02W66_A6998Tex_AnchoA ;
   private boolean[] P02W66_n6998Tex_AnchoA ;
   private int[] P02W66_A6997Tex_Unid ;
   private boolean[] P02W66_n6997Tex_Unid ;
   private String[] P02W66_A6996Tex_Ntalla ;
   private short[] P02W66_A6857Tex_Lin ;
   private String[] P02W68_A396EmprCod ;
   private int[] P02W68_A6850Tex_NPed ;
   private short[] P02W68_A7403Tex_UlTal ;
   private boolean[] P02W68_n7403Tex_UlTal ;
   private String[] P02W68_A7402Tex_TipArt ;
   private String[] P02W610_A396EmprCod ;
   private int[] P02W610_A6850Tex_NPed ;
   private String[] P02W610_A7407Tex_AltOp ;
   private boolean[] P02W610_n7407Tex_AltOp ;
   private String[] P02W610_A7406Tex_AncOp ;
   private boolean[] P02W610_n7406Tex_AncOp ;
   private String[] P02W610_A7405Tex_TalOP ;
   private boolean[] P02W610_n7405Tex_TalOP ;
   private short[] P02W610_A7404Tex_LnOP ;
   private String[] P02W610_A7402Tex_TipArt ;
}

final  class ptex021__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02W62", "SELECT EmprCod, Tex_NPed, Tex_FecEnt, Tex_FecTen, Tex_FecTej, Tex_subcli, TipDisCod, Tex_Estado, Tex_Obs, Tex_UltL, Tex_PedC, Tex_FecP, CliCod FROM TXPTEX000 WHERE EmprCod = ? and Tex_NPed = ? ORDER BY EmprCod, Tex_NPed ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02W63", "INSERT INTO TXPTEX000(EmprCod, Tex_NPed, CliCod, Tex_FecP, Tex_PedC, Tex_UltL, Tex_Obs, Tex_Estado, TipDisCod, Tex_subcli, Tex_FecTej, Tex_FecTen, Tex_FecEnt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX000")
         ,new ForEachCursor("P02W64", "SELECT EmprCod, Tex_NPed, Tex_NumH, Tex_UHdr, Tex_PHdr, Tex_KgsNt, Tex_imp, Tex_NomCo2, Tex_TipT, Tex_Tip, Tex_st, Tex_KgsP, Tex_Maestr, Tex_Talla, Tex_MerTn, Tex_MerTj, Tex_Unidad, Tex_Discod, Tex_TcCol, Tex_NumCol, Tex_NomCol, Tex_artc, Tex_Kgs, Tex_Lin FROM TXPTEX001 WHERE EmprCod = ? and Tex_NPed = ? ORDER BY EmprCod, Tex_NPed, Tex_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02W65", "INSERT INTO TXPTEX001(EmprCod, Tex_NPed, Tex_Lin, Tex_Kgs, Tex_artc, Tex_NomCol, Tex_NumCol, Tex_TcCol, Tex_Discod, Tex_Unidad, Tex_MerTj, Tex_MerTn, Tex_Talla, Tex_Maestr, Tex_KgsP, Tex_st, Tex_Tip, Tex_TipT, Tex_NomCo2, Tex_imp, Tex_KgsNt, Tex_PHdr, Tex_UHdr, Tex_NumH) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX001")
         ,new ForEachCursor("P02W66", "SELECT EmprCod, Tex_NPed, tex_Altura, Tex_AnchoA, Tex_Unid, Tex_Ntalla, Tex_Lin FROM TXPTEX002 WHERE EmprCod = ? and Tex_NPed = ? ORDER BY EmprCod, Tex_NPed, Tex_Lin, Tex_Ntalla ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02W67", "INSERT INTO TXPTEX002(EmprCod, Tex_NPed, Tex_Lin, Tex_Ntalla, Tex_Unid, Tex_AnchoA, tex_Altura) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX002")
         ,new ForEachCursor("P02W68", "SELECT EmprCod, Tex_NPed, Tex_UlTal, Tex_TipArt FROM TXPTEX004 WHERE EmprCod = ? and Tex_NPed = ? ORDER BY EmprCod, Tex_NPed, Tex_TipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02W69", "INSERT INTO TXPTEX004(EmprCod, Tex_NPed, Tex_TipArt, Tex_UlTal) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX004")
         ,new ForEachCursor("P02W610", "SELECT EmprCod, Tex_NPed, Tex_AltOp, Tex_AncOp, Tex_TalOP, Tex_LnOP, Tex_TipArt FROM TXPTEX003 WHERE EmprCod = ? and Tex_NPed = ? ORDER BY EmprCod, Tex_NPed, Tex_TipArt, Tex_LnOP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02W611", "INSERT INTO TXPTEX003(EmprCod, Tex_NPed, Tex_TipArt, Tex_LnOP, Tex_TalOP, Tex_AncOp, Tex_AltOp) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX003")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 100);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 13);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(24);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 4);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 2);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 2000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 30);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 20);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 20);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 13);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[14]).intValue());
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
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[34], 13);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[40]).intValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[44]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 4);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               return;
      }
   }

}

