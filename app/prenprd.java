package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prenprd extends GXProcedure
{
   public prenprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prenprd.class ), "" );
   }

   public prenprd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      prenprd.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      prenprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prenprd.this.AV21Procod = aP1[0];
      this.aP1 = aP1;
      prenprd.this.AV22Usurcod = aP2[0];
      this.aP2 = aP2;
      prenprd.this.AV23Station = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Proforlin = (short)(0) ;
      /* Using cursor P048B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV21Procod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P048B2_A758ProCod[0] ;
         A14284ProEst = P048B2_A14284ProEst[0] ;
         A3802ProPreMin = P048B2_A3802ProPreMin[0] ;
         n3802ProPreMin = P048B2_n3802ProPreMin[0] ;
         A3801ProPreMax = P048B2_A3801ProPreMax[0] ;
         n3801ProPreMax = P048B2_n3801ProPreMax[0] ;
         A3800ProMarPor = P048B2_A3800ProMarPor[0] ;
         n3800ProMarPor = P048B2_n3800ProMarPor[0] ;
         A3799ProMerPor = P048B2_A3799ProMerPor[0] ;
         n3799ProMerPor = P048B2_n3799ProMerPor[0] ;
         A3798ProCosPrd = P048B2_A3798ProCosPrd[0] ;
         n3798ProCosPrd = P048B2_n3798ProCosPrd[0] ;
         A11203ProImBmp4 = P048B2_A11203ProImBmp4[0] ;
         n11203ProImBmp4 = P048B2_n11203ProImBmp4[0] ;
         A11202ProImBmp3 = P048B2_A11202ProImBmp3[0] ;
         n11202ProImBmp3 = P048B2_n11202ProImBmp3[0] ;
         A11201ProImBmp2 = P048B2_A11201ProImBmp2[0] ;
         n11201ProImBmp2 = P048B2_n11201ProImBmp2[0] ;
         A8333ProImBmp = P048B2_A8333ProImBmp[0] ;
         n8333ProImBmp = P048B2_n8333ProImBmp[0] ;
         A8042ProTipT = P048B2_A8042ProTipT[0] ;
         A7795ProTipP = P048B2_A7795ProTipP[0] ;
         A6486ProDscF = P048B2_A6486ProDscF[0] ;
         A5289ProProvi = P048B2_A5289ProProvi[0] ;
         A5254ProDscM = P048B2_A5254ProDscM[0] ;
         n5254ProDscM = P048B2_n5254ProDscM[0] ;
         A4628ProDsc2 = P048B2_A4628ProDsc2[0] ;
         A775ProUltLin = P048B2_A775ProUltLin[0] ;
         A759ProDsc = P048B2_A759ProDsc[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         AV15ProDes = "@" ;
         /*
            INSERT RECORD ON TABLE TXPPROCES

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         W775ProUltLin = A775ProUltLin ;
         A758ProCod = AV15ProDes ;
         /* Using cursor P048B3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod, A759ProDsc, Short.valueOf(A775ProUltLin), A4628ProDsc2, Boolean.valueOf(n5254ProDscM), A5254ProDscM, A5289ProProvi, A6486ProDscF, A7795ProTipP, Byte.valueOf(A8042ProTipT), Boolean.valueOf(n8333ProImBmp), A8333ProImBmp, Boolean.valueOf(n11201ProImBmp2), A11201ProImBmp2, Boolean.valueOf(n11202ProImBmp3), A11202ProImBmp3, Boolean.valueOf(n11203ProImBmp4), A11203ProImBmp4, Boolean.valueOf(n3798ProCosPrd), A3798ProCosPrd, Boolean.valueOf(n3799ProMerPor), A3799ProMerPor, Boolean.valueOf(n3800ProMarPor), A3800ProMarPor, Boolean.valueOf(n3801ProPreMax), A3801ProPreMax, Boolean.valueOf(n3802ProPreMin), A3802ProPreMin, A14284ProEst});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
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
         A758ProCod = W758ProCod ;
         A775ProUltLin = W775ProUltLin ;
         /* End Insert */
         /* Using cursor P048B4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A758ProCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A774ProNumLin = P048B4_A774ProNumLin[0] ;
            A7911Dtp_UOrd = P048B4_A7911Dtp_UOrd[0] ;
            n7911Dtp_UOrd = P048B4_n7911Dtp_UOrd[0] ;
            A7896Dtp_UnpLt = P048B4_A7896Dtp_UnpLt[0] ;
            n7896Dtp_UnpLt = P048B4_n7896Dtp_UnpLt[0] ;
            A7895Dtp_TpCost = P048B4_A7895Dtp_TpCost[0] ;
            n7895Dtp_TpCost = P048B4_n7895Dtp_TpCost[0] ;
            A7894Dtp_H2OReh = P048B4_A7894Dtp_H2OReh[0] ;
            n7894Dtp_H2OReh = P048B4_n7894Dtp_H2OReh[0] ;
            A7893Dtp_Tpp = P048B4_A7893Dtp_Tpp[0] ;
            n7893Dtp_Tpp = P048B4_n7893Dtp_Tpp[0] ;
            A7892Dtp_FasDsc = P048B4_A7892Dtp_FasDsc[0] ;
            n7892Dtp_FasDsc = P048B4_n7892Dtp_FasDsc[0] ;
            A6437ProUltFP = P048B4_A6437ProUltFP[0] ;
            A5735ProFasNot = P048B4_A5735ProFasNot[0] ;
            n5735ProFasNot = P048B4_n5735ProFasNot[0] ;
            A457FasCod = P048B4_A457FasCod[0] ;
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            AV19Proforlin = (short)(AV19Proforlin+100) ;
            /*
               INSERT RECORD ON TABLE TXPPROLIN

            */
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            W774ProNumLin = A774ProNumLin ;
            A758ProCod = AV15ProDes ;
            A774ProNumLin = AV19Proforlin ;
            /* Using cursor P048B5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), A457FasCod, Boolean.valueOf(n5735ProFasNot), A5735ProFasNot, Short.valueOf(A6437ProUltFP), Boolean.valueOf(n7892Dtp_FasDsc), A7892Dtp_FasDsc, Boolean.valueOf(n7893Dtp_Tpp), A7893Dtp_Tpp, Boolean.valueOf(n7894Dtp_H2OReh), A7894Dtp_H2OReh, Boolean.valueOf(n7895Dtp_TpCost), Short.valueOf(A7895Dtp_TpCost), Boolean.valueOf(n7896Dtp_UnpLt), A7896Dtp_UnpLt, Boolean.valueOf(n7911Dtp_UOrd), Short.valueOf(A7911Dtp_UOrd)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
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
            A758ProCod = W758ProCod ;
            A774ProNumLin = W774ProNumLin ;
            /* End Insert */
            /* Using cursor P048B6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A764ProForCod = P048B6_A764ProForCod[0] ;
               A6438ProFsaL = P048B6_A6438ProFsaL[0] ;
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               W774ProNumLin = A774ProNumLin ;
               /*
                  INSERT RECORD ON TABLE TXPPROFSA

               */
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               W774ProNumLin = A774ProNumLin ;
               W6438ProFsaL = A6438ProFsaL ;
               A758ProCod = AV15ProDes ;
               A774ProNumLin = AV19Proforlin ;
               /* Using cursor P048B7 */
               pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A6438ProFsaL), A764ProForCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROFSA");
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
               A758ProCod = W758ProCod ;
               A774ProNumLin = W774ProNumLin ;
               A6438ProFsaL = W6438ProFsaL ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               A774ProNumLin = W774ProNumLin ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P048B8 */
      pr_default.execute(6, new Object[] {Short.valueOf(AV19Proforlin), A396EmprCod, AV15ProDes});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
      /* End optimized UPDATE. */
      /* Using cursor P048B9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV21Procod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A758ProCod = P048B9_A758ProCod[0] ;
         A775ProUltLin = P048B9_A775ProUltLin[0] ;
         /* Using cursor P048B10 */
         pr_default.execute(8, new Object[] {A396EmprCod, A758ProCod});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A774ProNumLin = P048B10_A774ProNumLin[0] ;
            A5735ProFasNot = P048B10_A5735ProFasNot[0] ;
            n5735ProFasNot = P048B10_n5735ProFasNot[0] ;
            /* Optimized DELETE. */
            /* Using cursor P048B11 */
            pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROFSA");
            /* End optimized DELETE. */
            /* Using cursor P048B12 */
            pr_default.execute(10, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
            pr_default.readNext(8);
         }
         pr_default.close(8);
         /* Using cursor P048B13 */
         pr_default.execute(11, new Object[] {A396EmprCod, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      Application.commitDataStores(context, remoteHandle, pr_default, "prenprd");
      AV25messages.clear();
      /* Using cursor P048B14 */
      pr_default.execute(12, new Object[] {A396EmprCod, AV15ProDes});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A758ProCod = P048B14_A758ProCod[0] ;
         A14284ProEst = P048B14_A14284ProEst[0] ;
         A3802ProPreMin = P048B14_A3802ProPreMin[0] ;
         n3802ProPreMin = P048B14_n3802ProPreMin[0] ;
         A3801ProPreMax = P048B14_A3801ProPreMax[0] ;
         n3801ProPreMax = P048B14_n3801ProPreMax[0] ;
         A3800ProMarPor = P048B14_A3800ProMarPor[0] ;
         n3800ProMarPor = P048B14_n3800ProMarPor[0] ;
         A3799ProMerPor = P048B14_A3799ProMerPor[0] ;
         n3799ProMerPor = P048B14_n3799ProMerPor[0] ;
         A3798ProCosPrd = P048B14_A3798ProCosPrd[0] ;
         n3798ProCosPrd = P048B14_n3798ProCosPrd[0] ;
         A11203ProImBmp4 = P048B14_A11203ProImBmp4[0] ;
         n11203ProImBmp4 = P048B14_n11203ProImBmp4[0] ;
         A11202ProImBmp3 = P048B14_A11202ProImBmp3[0] ;
         n11202ProImBmp3 = P048B14_n11202ProImBmp3[0] ;
         A11201ProImBmp2 = P048B14_A11201ProImBmp2[0] ;
         n11201ProImBmp2 = P048B14_n11201ProImBmp2[0] ;
         A8333ProImBmp = P048B14_A8333ProImBmp[0] ;
         n8333ProImBmp = P048B14_n8333ProImBmp[0] ;
         A8042ProTipT = P048B14_A8042ProTipT[0] ;
         A7795ProTipP = P048B14_A7795ProTipP[0] ;
         A6486ProDscF = P048B14_A6486ProDscF[0] ;
         A5289ProProvi = P048B14_A5289ProProvi[0] ;
         A5254ProDscM = P048B14_A5254ProDscM[0] ;
         n5254ProDscM = P048B14_n5254ProDscM[0] ;
         A4628ProDsc2 = P048B14_A4628ProDsc2[0] ;
         A775ProUltLin = P048B14_A775ProUltLin[0] ;
         A759ProDsc = P048B14_A759ProDsc[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         /*
            INSERT RECORD ON TABLE TXPPROCES

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         W775ProUltLin = A775ProUltLin ;
         A758ProCod = AV21Procod ;
         AV26message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV26message.setgxTv_SdtMessages_Message_Id( "" );
         AV26message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Re-Numeracion Proceso =", "")+AV21Procod );
         AV25messages.add(AV26message, 0);
         /* Using cursor P048B15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A758ProCod, A759ProDsc, Short.valueOf(A775ProUltLin), A4628ProDsc2, Boolean.valueOf(n5254ProDscM), A5254ProDscM, A5289ProProvi, A6486ProDscF, A7795ProTipP, Byte.valueOf(A8042ProTipT), Boolean.valueOf(n8333ProImBmp), A8333ProImBmp, Boolean.valueOf(n11201ProImBmp2), A11201ProImBmp2, Boolean.valueOf(n11202ProImBmp3), A11202ProImBmp3, Boolean.valueOf(n11203ProImBmp4), A11203ProImBmp4, Boolean.valueOf(n3798ProCosPrd), A3798ProCosPrd, Boolean.valueOf(n3799ProMerPor), A3799ProMerPor, Boolean.valueOf(n3800ProMarPor), A3800ProMarPor, Boolean.valueOf(n3801ProPreMax), A3801ProPreMax, Boolean.valueOf(n3802ProPreMin), A3802ProPreMin, A14284ProEst});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
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
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         A775ProUltLin = W775ProUltLin ;
         /* End Insert */
         /* Using cursor P048B16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A7911Dtp_UOrd = P048B16_A7911Dtp_UOrd[0] ;
            n7911Dtp_UOrd = P048B16_n7911Dtp_UOrd[0] ;
            A7896Dtp_UnpLt = P048B16_A7896Dtp_UnpLt[0] ;
            n7896Dtp_UnpLt = P048B16_n7896Dtp_UnpLt[0] ;
            A7895Dtp_TpCost = P048B16_A7895Dtp_TpCost[0] ;
            n7895Dtp_TpCost = P048B16_n7895Dtp_TpCost[0] ;
            A7894Dtp_H2OReh = P048B16_A7894Dtp_H2OReh[0] ;
            n7894Dtp_H2OReh = P048B16_n7894Dtp_H2OReh[0] ;
            A7893Dtp_Tpp = P048B16_A7893Dtp_Tpp[0] ;
            n7893Dtp_Tpp = P048B16_n7893Dtp_Tpp[0] ;
            A7892Dtp_FasDsc = P048B16_A7892Dtp_FasDsc[0] ;
            n7892Dtp_FasDsc = P048B16_n7892Dtp_FasDsc[0] ;
            A6437ProUltFP = P048B16_A6437ProUltFP[0] ;
            A5735ProFasNot = P048B16_A5735ProFasNot[0] ;
            n5735ProFasNot = P048B16_n5735ProFasNot[0] ;
            A457FasCod = P048B16_A457FasCod[0] ;
            A774ProNumLin = P048B16_A774ProNumLin[0] ;
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            /*
               INSERT RECORD ON TABLE TXPPROLIN

            */
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            W774ProNumLin = A774ProNumLin ;
            A758ProCod = AV21Procod ;
            /* Using cursor P048B17 */
            pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), A457FasCod, Boolean.valueOf(n5735ProFasNot), A5735ProFasNot, Short.valueOf(A6437ProUltFP), Boolean.valueOf(n7892Dtp_FasDsc), A7892Dtp_FasDsc, Boolean.valueOf(n7893Dtp_Tpp), A7893Dtp_Tpp, Boolean.valueOf(n7894Dtp_H2OReh), A7894Dtp_H2OReh, Boolean.valueOf(n7895Dtp_TpCost), Short.valueOf(A7895Dtp_TpCost), Boolean.valueOf(n7896Dtp_UnpLt), A7896Dtp_UnpLt, Boolean.valueOf(n7911Dtp_UOrd), Short.valueOf(A7911Dtp_UOrd)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
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
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            A774ProNumLin = W774ProNumLin ;
            /* End Insert */
            /* Using cursor P048B18 */
            pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            while ( (pr_default.getStatus(16) != 101) )
            {
               A764ProForCod = P048B18_A764ProForCod[0] ;
               A6438ProFsaL = P048B18_A6438ProFsaL[0] ;
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               W774ProNumLin = A774ProNumLin ;
               /*
                  INSERT RECORD ON TABLE TXPPROFSA

               */
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               W774ProNumLin = A774ProNumLin ;
               W6438ProFsaL = A6438ProFsaL ;
               A758ProCod = AV21Procod ;
               /* Using cursor P048B19 */
               pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A6438ProFsaL), A764ProForCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROFSA");
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
               A758ProCod = W758ProCod ;
               A774ProNumLin = W774ProNumLin ;
               A6438ProFsaL = W6438ProFsaL ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               A774ProNumLin = W774ProNumLin ;
               pr_default.readNext(16);
            }
            pr_default.close(16);
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            pr_default.readNext(14);
         }
         pr_default.close(14);
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
      if ( AV25messages.size() > 0 )
      {
         AV27json_message = AV25messages.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV22Usurcod, AV23Station, AV27json_message, 99999999, (byte)(0), "@") ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "prenprd");
      /* Using cursor P048B20 */
      pr_default.execute(18, new Object[] {A396EmprCod, AV15ProDes});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A758ProCod = P048B20_A758ProCod[0] ;
         A775ProUltLin = P048B20_A775ProUltLin[0] ;
         /* Using cursor P048B21 */
         pr_default.execute(19, new Object[] {A396EmprCod, A758ProCod});
         while ( (pr_default.getStatus(19) != 101) )
         {
            A774ProNumLin = P048B21_A774ProNumLin[0] ;
            A5735ProFasNot = P048B21_A5735ProFasNot[0] ;
            n5735ProFasNot = P048B21_n5735ProFasNot[0] ;
            /* Optimized DELETE. */
            /* Using cursor P048B22 */
            pr_default.execute(20, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROFSA");
            /* End optimized DELETE. */
            /* Using cursor P048B23 */
            pr_default.execute(21, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
            pr_default.readNext(19);
         }
         pr_default.close(19);
         /* Using cursor P048B24 */
         pr_default.execute(22, new Object[] {A396EmprCod, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(18);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prenprd.this.A396EmprCod;
      this.aP1[0] = prenprd.this.AV21Procod;
      this.aP2[0] = prenprd.this.AV22Usurcod;
      this.aP3[0] = prenprd.this.AV23Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "prenprd");
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
      P048B2_A396EmprCod = new String[] {""} ;
      P048B2_A758ProCod = new String[] {""} ;
      P048B2_A14284ProEst = new String[] {""} ;
      P048B2_A3802ProPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B2_n3802ProPreMin = new boolean[] {false} ;
      P048B2_A3801ProPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B2_n3801ProPreMax = new boolean[] {false} ;
      P048B2_A3800ProMarPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B2_n3800ProMarPor = new boolean[] {false} ;
      P048B2_A3799ProMerPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B2_n3799ProMerPor = new boolean[] {false} ;
      P048B2_A3798ProCosPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B2_n3798ProCosPrd = new boolean[] {false} ;
      P048B2_A11203ProImBmp4 = new String[] {""} ;
      P048B2_n11203ProImBmp4 = new boolean[] {false} ;
      P048B2_A11202ProImBmp3 = new String[] {""} ;
      P048B2_n11202ProImBmp3 = new boolean[] {false} ;
      P048B2_A11201ProImBmp2 = new String[] {""} ;
      P048B2_n11201ProImBmp2 = new boolean[] {false} ;
      P048B2_A8333ProImBmp = new String[] {""} ;
      P048B2_n8333ProImBmp = new boolean[] {false} ;
      P048B2_A8042ProTipT = new byte[1] ;
      P048B2_A7795ProTipP = new String[] {""} ;
      P048B2_A6486ProDscF = new String[] {""} ;
      P048B2_A5289ProProvi = new String[] {""} ;
      P048B2_A5254ProDscM = new String[] {""} ;
      P048B2_n5254ProDscM = new boolean[] {false} ;
      P048B2_A4628ProDsc2 = new String[] {""} ;
      P048B2_A775ProUltLin = new short[1] ;
      P048B2_A759ProDsc = new String[] {""} ;
      A758ProCod = "" ;
      A14284ProEst = "" ;
      A3802ProPreMin = DecimalUtil.ZERO ;
      A3801ProPreMax = DecimalUtil.ZERO ;
      A3800ProMarPor = DecimalUtil.ZERO ;
      A3799ProMerPor = DecimalUtil.ZERO ;
      A3798ProCosPrd = DecimalUtil.ZERO ;
      A11203ProImBmp4 = "" ;
      A11202ProImBmp3 = "" ;
      A11201ProImBmp2 = "" ;
      A8333ProImBmp = "" ;
      A7795ProTipP = "" ;
      A6486ProDscF = "" ;
      A5289ProProvi = "" ;
      A5254ProDscM = "" ;
      A4628ProDsc2 = "" ;
      A759ProDsc = "" ;
      W396EmprCod = "" ;
      W758ProCod = "" ;
      AV15ProDes = "" ;
      Gx_emsg = "" ;
      P048B4_A396EmprCod = new String[] {""} ;
      P048B4_A758ProCod = new String[] {""} ;
      P048B4_A774ProNumLin = new short[1] ;
      P048B4_A7911Dtp_UOrd = new short[1] ;
      P048B4_n7911Dtp_UOrd = new boolean[] {false} ;
      P048B4_A7896Dtp_UnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B4_n7896Dtp_UnpLt = new boolean[] {false} ;
      P048B4_A7895Dtp_TpCost = new short[1] ;
      P048B4_n7895Dtp_TpCost = new boolean[] {false} ;
      P048B4_A7894Dtp_H2OReh = new String[] {""} ;
      P048B4_n7894Dtp_H2OReh = new boolean[] {false} ;
      P048B4_A7893Dtp_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B4_n7893Dtp_Tpp = new boolean[] {false} ;
      P048B4_A7892Dtp_FasDsc = new String[] {""} ;
      P048B4_n7892Dtp_FasDsc = new boolean[] {false} ;
      P048B4_A6437ProUltFP = new short[1] ;
      P048B4_A5735ProFasNot = new String[] {""} ;
      P048B4_n5735ProFasNot = new boolean[] {false} ;
      P048B4_A457FasCod = new String[] {""} ;
      A7896Dtp_UnpLt = DecimalUtil.ZERO ;
      A7894Dtp_H2OReh = "" ;
      A7893Dtp_Tpp = DecimalUtil.ZERO ;
      A7892Dtp_FasDsc = "" ;
      A5735ProFasNot = "" ;
      A457FasCod = "" ;
      P048B6_A396EmprCod = new String[] {""} ;
      P048B6_A758ProCod = new String[] {""} ;
      P048B6_A774ProNumLin = new short[1] ;
      P048B6_A764ProForCod = new String[] {""} ;
      P048B6_A6438ProFsaL = new short[1] ;
      A764ProForCod = "" ;
      P048B9_A396EmprCod = new String[] {""} ;
      P048B9_A758ProCod = new String[] {""} ;
      P048B9_A775ProUltLin = new short[1] ;
      P048B10_A396EmprCod = new String[] {""} ;
      P048B10_A758ProCod = new String[] {""} ;
      P048B10_A774ProNumLin = new short[1] ;
      P048B10_A5735ProFasNot = new String[] {""} ;
      P048B10_n5735ProFasNot = new boolean[] {false} ;
      AV25messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P048B14_A396EmprCod = new String[] {""} ;
      P048B14_A758ProCod = new String[] {""} ;
      P048B14_A14284ProEst = new String[] {""} ;
      P048B14_A3802ProPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B14_n3802ProPreMin = new boolean[] {false} ;
      P048B14_A3801ProPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B14_n3801ProPreMax = new boolean[] {false} ;
      P048B14_A3800ProMarPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B14_n3800ProMarPor = new boolean[] {false} ;
      P048B14_A3799ProMerPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B14_n3799ProMerPor = new boolean[] {false} ;
      P048B14_A3798ProCosPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B14_n3798ProCosPrd = new boolean[] {false} ;
      P048B14_A11203ProImBmp4 = new String[] {""} ;
      P048B14_n11203ProImBmp4 = new boolean[] {false} ;
      P048B14_A11202ProImBmp3 = new String[] {""} ;
      P048B14_n11202ProImBmp3 = new boolean[] {false} ;
      P048B14_A11201ProImBmp2 = new String[] {""} ;
      P048B14_n11201ProImBmp2 = new boolean[] {false} ;
      P048B14_A8333ProImBmp = new String[] {""} ;
      P048B14_n8333ProImBmp = new boolean[] {false} ;
      P048B14_A8042ProTipT = new byte[1] ;
      P048B14_A7795ProTipP = new String[] {""} ;
      P048B14_A6486ProDscF = new String[] {""} ;
      P048B14_A5289ProProvi = new String[] {""} ;
      P048B14_A5254ProDscM = new String[] {""} ;
      P048B14_n5254ProDscM = new boolean[] {false} ;
      P048B14_A4628ProDsc2 = new String[] {""} ;
      P048B14_A775ProUltLin = new short[1] ;
      P048B14_A759ProDsc = new String[] {""} ;
      AV26message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      P048B16_A396EmprCod = new String[] {""} ;
      P048B16_A758ProCod = new String[] {""} ;
      P048B16_A7911Dtp_UOrd = new short[1] ;
      P048B16_n7911Dtp_UOrd = new boolean[] {false} ;
      P048B16_A7896Dtp_UnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B16_n7896Dtp_UnpLt = new boolean[] {false} ;
      P048B16_A7895Dtp_TpCost = new short[1] ;
      P048B16_n7895Dtp_TpCost = new boolean[] {false} ;
      P048B16_A7894Dtp_H2OReh = new String[] {""} ;
      P048B16_n7894Dtp_H2OReh = new boolean[] {false} ;
      P048B16_A7893Dtp_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048B16_n7893Dtp_Tpp = new boolean[] {false} ;
      P048B16_A7892Dtp_FasDsc = new String[] {""} ;
      P048B16_n7892Dtp_FasDsc = new boolean[] {false} ;
      P048B16_A6437ProUltFP = new short[1] ;
      P048B16_A5735ProFasNot = new String[] {""} ;
      P048B16_n5735ProFasNot = new boolean[] {false} ;
      P048B16_A457FasCod = new String[] {""} ;
      P048B16_A774ProNumLin = new short[1] ;
      P048B18_A396EmprCod = new String[] {""} ;
      P048B18_A758ProCod = new String[] {""} ;
      P048B18_A774ProNumLin = new short[1] ;
      P048B18_A764ProForCod = new String[] {""} ;
      P048B18_A6438ProFsaL = new short[1] ;
      AV27json_message = "" ;
      AV40Pgmname = "" ;
      P048B20_A396EmprCod = new String[] {""} ;
      P048B20_A758ProCod = new String[] {""} ;
      P048B20_A775ProUltLin = new short[1] ;
      P048B21_A396EmprCod = new String[] {""} ;
      P048B21_A758ProCod = new String[] {""} ;
      P048B21_A774ProNumLin = new short[1] ;
      P048B21_A5735ProFasNot = new String[] {""} ;
      P048B21_n5735ProFasNot = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.prenprd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.prenprd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.prenprd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prenprd__default(),
         new Object[] {
             new Object[] {
            P048B2_A396EmprCod, P048B2_A758ProCod, P048B2_A14284ProEst, P048B2_A3802ProPreMin, P048B2_n3802ProPreMin, P048B2_A3801ProPreMax, P048B2_n3801ProPreMax, P048B2_A3800ProMarPor, P048B2_n3800ProMarPor, P048B2_A3799ProMerPor,
            P048B2_n3799ProMerPor, P048B2_A3798ProCosPrd, P048B2_n3798ProCosPrd, P048B2_A11203ProImBmp4, P048B2_n11203ProImBmp4, P048B2_A11202ProImBmp3, P048B2_n11202ProImBmp3, P048B2_A11201ProImBmp2, P048B2_n11201ProImBmp2, P048B2_A8333ProImBmp,
            P048B2_n8333ProImBmp, P048B2_A8042ProTipT, P048B2_A7795ProTipP, P048B2_A6486ProDscF, P048B2_A5289ProProvi, P048B2_A5254ProDscM, P048B2_n5254ProDscM, P048B2_A4628ProDsc2, P048B2_A775ProUltLin, P048B2_A759ProDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P048B4_A396EmprCod, P048B4_A758ProCod, P048B4_A774ProNumLin, P048B4_A7911Dtp_UOrd, P048B4_n7911Dtp_UOrd, P048B4_A7896Dtp_UnpLt, P048B4_n7896Dtp_UnpLt, P048B4_A7895Dtp_TpCost, P048B4_n7895Dtp_TpCost, P048B4_A7894Dtp_H2OReh,
            P048B4_n7894Dtp_H2OReh, P048B4_A7893Dtp_Tpp, P048B4_n7893Dtp_Tpp, P048B4_A7892Dtp_FasDsc, P048B4_n7892Dtp_FasDsc, P048B4_A6437ProUltFP, P048B4_A5735ProFasNot, P048B4_n5735ProFasNot, P048B4_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P048B6_A396EmprCod, P048B6_A758ProCod, P048B6_A774ProNumLin, P048B6_A764ProForCod, P048B6_A6438ProFsaL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P048B9_A396EmprCod, P048B9_A758ProCod, P048B9_A775ProUltLin
            }
            , new Object[] {
            P048B10_A396EmprCod, P048B10_A758ProCod, P048B10_A774ProNumLin, P048B10_A5735ProFasNot, P048B10_n5735ProFasNot
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P048B14_A396EmprCod, P048B14_A758ProCod, P048B14_A14284ProEst, P048B14_A3802ProPreMin, P048B14_n3802ProPreMin, P048B14_A3801ProPreMax, P048B14_n3801ProPreMax, P048B14_A3800ProMarPor, P048B14_n3800ProMarPor, P048B14_A3799ProMerPor,
            P048B14_n3799ProMerPor, P048B14_A3798ProCosPrd, P048B14_n3798ProCosPrd, P048B14_A11203ProImBmp4, P048B14_n11203ProImBmp4, P048B14_A11202ProImBmp3, P048B14_n11202ProImBmp3, P048B14_A11201ProImBmp2, P048B14_n11201ProImBmp2, P048B14_A8333ProImBmp,
            P048B14_n8333ProImBmp, P048B14_A8042ProTipT, P048B14_A7795ProTipP, P048B14_A6486ProDscF, P048B14_A5289ProProvi, P048B14_A5254ProDscM, P048B14_n5254ProDscM, P048B14_A4628ProDsc2, P048B14_A775ProUltLin, P048B14_A759ProDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P048B16_A396EmprCod, P048B16_A758ProCod, P048B16_A7911Dtp_UOrd, P048B16_n7911Dtp_UOrd, P048B16_A7896Dtp_UnpLt, P048B16_n7896Dtp_UnpLt, P048B16_A7895Dtp_TpCost, P048B16_n7895Dtp_TpCost, P048B16_A7894Dtp_H2OReh, P048B16_n7894Dtp_H2OReh,
            P048B16_A7893Dtp_Tpp, P048B16_n7893Dtp_Tpp, P048B16_A7892Dtp_FasDsc, P048B16_n7892Dtp_FasDsc, P048B16_A6437ProUltFP, P048B16_A5735ProFasNot, P048B16_n5735ProFasNot, P048B16_A457FasCod, P048B16_A774ProNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            P048B18_A396EmprCod, P048B18_A758ProCod, P048B18_A774ProNumLin, P048B18_A764ProForCod, P048B18_A6438ProFsaL
            }
            , new Object[] {
            }
            , new Object[] {
            P048B20_A396EmprCod, P048B20_A758ProCod, P048B20_A775ProUltLin
            }
            , new Object[] {
            P048B21_A396EmprCod, P048B21_A758ProCod, P048B21_A774ProNumLin, P048B21_A5735ProFasNot, P048B21_n5735ProFasNot
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV40Pgmname = "PRENPRD" ;
      /* GeneXus formulas. */
      AV40Pgmname = "PRENPRD" ;
      Gx_err = (short)(0) ;
   }

   private byte A8042ProTipT ;
   private short AV19Proforlin ;
   private short A775ProUltLin ;
   private short W775ProUltLin ;
   private short Gx_err ;
   private short A774ProNumLin ;
   private short A7911Dtp_UOrd ;
   private short A7895Dtp_TpCost ;
   private short A6437ProUltFP ;
   private short W774ProNumLin ;
   private short A6438ProFsaL ;
   private short W6438ProFsaL ;
   private int GX_INS87 ;
   private int GX_INS88 ;
   private int GX_INS933 ;
   private java.math.BigDecimal A3802ProPreMin ;
   private java.math.BigDecimal A3801ProPreMax ;
   private java.math.BigDecimal A3800ProMarPor ;
   private java.math.BigDecimal A3799ProMerPor ;
   private java.math.BigDecimal A3798ProCosPrd ;
   private java.math.BigDecimal A7896Dtp_UnpLt ;
   private java.math.BigDecimal A7893Dtp_Tpp ;
   private String A396EmprCod ;
   private String AV21Procod ;
   private String AV22Usurcod ;
   private String AV23Station ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A14284ProEst ;
   private String A11203ProImBmp4 ;
   private String A11202ProImBmp3 ;
   private String A11201ProImBmp2 ;
   private String A8333ProImBmp ;
   private String A7795ProTipP ;
   private String A6486ProDscF ;
   private String A5289ProProvi ;
   private String A5254ProDscM ;
   private String A4628ProDsc2 ;
   private String A759ProDsc ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String AV15ProDes ;
   private String Gx_emsg ;
   private String A7894Dtp_H2OReh ;
   private String A7892Dtp_FasDsc ;
   private String A457FasCod ;
   private String A764ProForCod ;
   private String AV40Pgmname ;
   private boolean n3802ProPreMin ;
   private boolean n3801ProPreMax ;
   private boolean n3800ProMarPor ;
   private boolean n3799ProMerPor ;
   private boolean n3798ProCosPrd ;
   private boolean n11203ProImBmp4 ;
   private boolean n11202ProImBmp3 ;
   private boolean n11201ProImBmp2 ;
   private boolean n8333ProImBmp ;
   private boolean n5254ProDscM ;
   private boolean n7911Dtp_UOrd ;
   private boolean n7896Dtp_UnpLt ;
   private boolean n7895Dtp_TpCost ;
   private boolean n7894Dtp_H2OReh ;
   private boolean n7893Dtp_Tpp ;
   private boolean n7892Dtp_FasDsc ;
   private boolean n5735ProFasNot ;
   private String AV27json_message ;
   private String A5735ProFasNot ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P048B2_A396EmprCod ;
   private String[] P048B2_A758ProCod ;
   private String[] P048B2_A14284ProEst ;
   private java.math.BigDecimal[] P048B2_A3802ProPreMin ;
   private boolean[] P048B2_n3802ProPreMin ;
   private java.math.BigDecimal[] P048B2_A3801ProPreMax ;
   private boolean[] P048B2_n3801ProPreMax ;
   private java.math.BigDecimal[] P048B2_A3800ProMarPor ;
   private boolean[] P048B2_n3800ProMarPor ;
   private java.math.BigDecimal[] P048B2_A3799ProMerPor ;
   private boolean[] P048B2_n3799ProMerPor ;
   private java.math.BigDecimal[] P048B2_A3798ProCosPrd ;
   private boolean[] P048B2_n3798ProCosPrd ;
   private String[] P048B2_A11203ProImBmp4 ;
   private boolean[] P048B2_n11203ProImBmp4 ;
   private String[] P048B2_A11202ProImBmp3 ;
   private boolean[] P048B2_n11202ProImBmp3 ;
   private String[] P048B2_A11201ProImBmp2 ;
   private boolean[] P048B2_n11201ProImBmp2 ;
   private String[] P048B2_A8333ProImBmp ;
   private boolean[] P048B2_n8333ProImBmp ;
   private byte[] P048B2_A8042ProTipT ;
   private String[] P048B2_A7795ProTipP ;
   private String[] P048B2_A6486ProDscF ;
   private String[] P048B2_A5289ProProvi ;
   private String[] P048B2_A5254ProDscM ;
   private boolean[] P048B2_n5254ProDscM ;
   private String[] P048B2_A4628ProDsc2 ;
   private short[] P048B2_A775ProUltLin ;
   private String[] P048B2_A759ProDsc ;
   private String[] P048B4_A396EmprCod ;
   private String[] P048B4_A758ProCod ;
   private short[] P048B4_A774ProNumLin ;
   private short[] P048B4_A7911Dtp_UOrd ;
   private boolean[] P048B4_n7911Dtp_UOrd ;
   private java.math.BigDecimal[] P048B4_A7896Dtp_UnpLt ;
   private boolean[] P048B4_n7896Dtp_UnpLt ;
   private short[] P048B4_A7895Dtp_TpCost ;
   private boolean[] P048B4_n7895Dtp_TpCost ;
   private String[] P048B4_A7894Dtp_H2OReh ;
   private boolean[] P048B4_n7894Dtp_H2OReh ;
   private java.math.BigDecimal[] P048B4_A7893Dtp_Tpp ;
   private boolean[] P048B4_n7893Dtp_Tpp ;
   private String[] P048B4_A7892Dtp_FasDsc ;
   private boolean[] P048B4_n7892Dtp_FasDsc ;
   private short[] P048B4_A6437ProUltFP ;
   private String[] P048B4_A5735ProFasNot ;
   private boolean[] P048B4_n5735ProFasNot ;
   private String[] P048B4_A457FasCod ;
   private String[] P048B6_A396EmprCod ;
   private String[] P048B6_A758ProCod ;
   private short[] P048B6_A774ProNumLin ;
   private String[] P048B6_A764ProForCod ;
   private short[] P048B6_A6438ProFsaL ;
   private String[] P048B9_A396EmprCod ;
   private String[] P048B9_A758ProCod ;
   private short[] P048B9_A775ProUltLin ;
   private String[] P048B10_A396EmprCod ;
   private String[] P048B10_A758ProCod ;
   private short[] P048B10_A774ProNumLin ;
   private String[] P048B10_A5735ProFasNot ;
   private boolean[] P048B10_n5735ProFasNot ;
   private String[] P048B14_A396EmprCod ;
   private String[] P048B14_A758ProCod ;
   private String[] P048B14_A14284ProEst ;
   private java.math.BigDecimal[] P048B14_A3802ProPreMin ;
   private boolean[] P048B14_n3802ProPreMin ;
   private java.math.BigDecimal[] P048B14_A3801ProPreMax ;
   private boolean[] P048B14_n3801ProPreMax ;
   private java.math.BigDecimal[] P048B14_A3800ProMarPor ;
   private boolean[] P048B14_n3800ProMarPor ;
   private java.math.BigDecimal[] P048B14_A3799ProMerPor ;
   private boolean[] P048B14_n3799ProMerPor ;
   private java.math.BigDecimal[] P048B14_A3798ProCosPrd ;
   private boolean[] P048B14_n3798ProCosPrd ;
   private String[] P048B14_A11203ProImBmp4 ;
   private boolean[] P048B14_n11203ProImBmp4 ;
   private String[] P048B14_A11202ProImBmp3 ;
   private boolean[] P048B14_n11202ProImBmp3 ;
   private String[] P048B14_A11201ProImBmp2 ;
   private boolean[] P048B14_n11201ProImBmp2 ;
   private String[] P048B14_A8333ProImBmp ;
   private boolean[] P048B14_n8333ProImBmp ;
   private byte[] P048B14_A8042ProTipT ;
   private String[] P048B14_A7795ProTipP ;
   private String[] P048B14_A6486ProDscF ;
   private String[] P048B14_A5289ProProvi ;
   private String[] P048B14_A5254ProDscM ;
   private boolean[] P048B14_n5254ProDscM ;
   private String[] P048B14_A4628ProDsc2 ;
   private short[] P048B14_A775ProUltLin ;
   private String[] P048B14_A759ProDsc ;
   private String[] P048B16_A396EmprCod ;
   private String[] P048B16_A758ProCod ;
   private short[] P048B16_A7911Dtp_UOrd ;
   private boolean[] P048B16_n7911Dtp_UOrd ;
   private java.math.BigDecimal[] P048B16_A7896Dtp_UnpLt ;
   private boolean[] P048B16_n7896Dtp_UnpLt ;
   private short[] P048B16_A7895Dtp_TpCost ;
   private boolean[] P048B16_n7895Dtp_TpCost ;
   private String[] P048B16_A7894Dtp_H2OReh ;
   private boolean[] P048B16_n7894Dtp_H2OReh ;
   private java.math.BigDecimal[] P048B16_A7893Dtp_Tpp ;
   private boolean[] P048B16_n7893Dtp_Tpp ;
   private String[] P048B16_A7892Dtp_FasDsc ;
   private boolean[] P048B16_n7892Dtp_FasDsc ;
   private short[] P048B16_A6437ProUltFP ;
   private String[] P048B16_A5735ProFasNot ;
   private boolean[] P048B16_n5735ProFasNot ;
   private String[] P048B16_A457FasCod ;
   private short[] P048B16_A774ProNumLin ;
   private String[] P048B18_A396EmprCod ;
   private String[] P048B18_A758ProCod ;
   private short[] P048B18_A774ProNumLin ;
   private String[] P048B18_A764ProForCod ;
   private short[] P048B18_A6438ProFsaL ;
   private String[] P048B20_A396EmprCod ;
   private String[] P048B20_A758ProCod ;
   private short[] P048B20_A775ProUltLin ;
   private String[] P048B21_A396EmprCod ;
   private String[] P048B21_A758ProCod ;
   private short[] P048B21_A774ProNumLin ;
   private String[] P048B21_A5735ProFasNot ;
   private boolean[] P048B21_n5735ProFasNot ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV25messages ;
   private com.genexus.SdtMessages_Message AV26message ;
}

final  class prenprd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class prenprd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class prenprd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class prenprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P048B2", "SELECT EmprCod, ProCod, ProEst, ProPreMin, ProPreMax, ProMarPor, ProMerPor, ProCosPrd, ProImBmp4, ProImBmp3, ProImBmp2, ProImBmp, ProTipT, ProTipP, ProDscF, ProProvi, ProDscM, ProDsc2, ProUltLin, ProDsc FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P048B3", "INSERT INTO TXPPROCES(EmprCod, ProCod, ProDsc, ProUltLin, ProDsc2, ProDscM, ProProvi, ProDscF, ProTipP, ProTipT, ProImBmp, ProImBmp2, ProImBmp3, ProImBmp4, ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin, ProEst) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
         ,new ForEachCursor("P048B4", "SELECT EmprCod, ProCod, ProNumLin, Dtp_UOrd, Dtp_UnpLt, Dtp_TpCost, Dtp_H2OReh, Dtp_Tpp, Dtp_FasDsc, ProUltFP, ProFasNot, FasCod FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P048B5", "INSERT INTO TXPPROLIN(EmprCod, ProCod, ProNumLin, FasCod, ProFasNot, ProUltFP, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
         ,new ForEachCursor("P048B6", "SELECT EmprCod, ProCod, ProNumLin, ProForCod, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P048B7", "INSERT INTO TXPPROFSA(EmprCod, ProCod, ProNumLin, ProFsaL, ProForCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROFSA")
         ,new UpdateCursor("P048B8", "UPDATE TXPPROCES SET ProUltLin=?  WHERE EmprCod = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
         ,new ForEachCursor("P048B9", "SELECT EmprCod, ProCod, ProUltLin FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P048B10", "SELECT EmprCod, ProCod, ProNumLin, ProFasNot FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P048B11", "DELETE FROM TXPPROFSA  WHERE EmprCod = ? and ProCod = ? and ProNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROFSA")
         ,new UpdateCursor("P048B12", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
         ,new UpdateCursor("P048B13", "DELETE FROM TXPPROCES  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
         ,new ForEachCursor("P048B14", "SELECT EmprCod, ProCod, ProEst, ProPreMin, ProPreMax, ProMarPor, ProMerPor, ProCosPrd, ProImBmp4, ProImBmp3, ProImBmp2, ProImBmp, ProTipT, ProTipP, ProDscF, ProProvi, ProDscM, ProDsc2, ProUltLin, ProDsc FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P048B15", "INSERT INTO TXPPROCES(EmprCod, ProCod, ProDsc, ProUltLin, ProDsc2, ProDscM, ProProvi, ProDscF, ProTipP, ProTipT, ProImBmp, ProImBmp2, ProImBmp3, ProImBmp4, ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin, ProEst) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
         ,new ForEachCursor("P048B16", "SELECT EmprCod, ProCod, Dtp_UOrd, Dtp_UnpLt, Dtp_TpCost, Dtp_H2OReh, Dtp_Tpp, Dtp_FasDsc, ProUltFP, ProFasNot, FasCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P048B17", "INSERT INTO TXPPROLIN(EmprCod, ProCod, ProNumLin, FasCod, ProFasNot, ProUltFP, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
         ,new ForEachCursor("P048B18", "SELECT EmprCod, ProCod, ProNumLin, ProForCod, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P048B19", "INSERT INTO TXPPROFSA(EmprCod, ProCod, ProNumLin, ProFsaL, ProForCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROFSA")
         ,new ForEachCursor("P048B20", "SELECT EmprCod, ProCod, ProUltLin FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P048B21", "SELECT EmprCod, ProCod, ProNumLin, ProFasNot FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P048B22", "DELETE FROM TXPPROFSA  WHERE EmprCod = ? and ProCod = ? and ProNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROFSA")
         ,new UpdateCursor("P048B23", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
         ,new UpdateCursor("P048B24", "DELETE FROM TXPPROCES  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 128);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 128);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 128);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 128);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((String[]) buf[22])[0] = rslt.getString(14, 2);
               ((String[]) buf[23])[0] = rslt.getString(15, 60);
               ((String[]) buf[24])[0] = rslt.getString(16, 1);
               ((String[]) buf[25])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 100);
               ((short[]) buf[28])[0] = rslt.getShort(19);
               ((String[]) buf[29])[0] = rslt.getString(20, 40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 90);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((String[]) buf[16])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 128);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 128);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 128);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 128);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((String[]) buf[22])[0] = rslt.getString(14, 2);
               ((String[]) buf[23])[0] = rslt.getString(15, 60);
               ((String[]) buf[24])[0] = rslt.getString(16, 1);
               ((String[]) buf[25])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 100);
               ((short[]) buf[28])[0] = rslt.getShort(19);
               ((String[]) buf[29])[0] = rslt.getString(20, 40);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 90);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((String[]) buf[15])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 8);
               ((short[]) buf[18])[0] = rslt.getShort(12);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 100);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 60);
               stmt.setString(9, (String)parms[9], 2);
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[12], 128);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[14], 128);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[18], 128);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[28], 5);
               }
               stmt.setString(20, (String)parms[29], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 400);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 90);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[18]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 100);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 60);
               stmt.setString(9, (String)parms[9], 2);
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[12], 128);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[14], 128);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[18], 128);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[28], 5);
               }
               stmt.setString(20, (String)parms[29], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 400);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 90);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[18]).shortValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

