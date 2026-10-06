package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdupccl extends GXProcedure
{
   public pdupccl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdupccl.class ), "" );
   }

   public pdupccl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pdupccl.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pdupccl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdupccl.this.AV8CCtCod = aP1[0];
      this.aP1 = aP1;
      pdupccl.this.AV9UltCctCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02ZQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CCtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4407CCTIniFas = P02ZQ2_A4407CCTIniFas[0] ;
         A4406CCTFinFas = P02ZQ2_A4406CCTFinFas[0] ;
         A4042CCTObs = P02ZQ2_A4042CCTObs[0] ;
         A4041CCTArc = P02ZQ2_A4041CCTArc[0] ;
         A4040CCTSto = P02ZQ2_A4040CCTSto[0] ;
         A4039CCTObl = P02ZQ2_A4039CCTObl[0] ;
         A4037CCTTpoCtr = P02ZQ2_A4037CCTTpoCtr[0] ;
         A4036CCTDsc = P02ZQ2_A4036CCTDsc[0] ;
         A4031CCTCod = P02ZQ2_A4031CCTCod[0] ;
         A11475CCTNotUlt = P02ZQ2_A11475CCTNotUlt[0] ;
         W396EmprCod = A396EmprCod ;
         W4031CCTCod = A4031CCTCod ;
         AV25CctDsc = A4036CCTDsc ;
         AV26CCtTpoCtr = A4037CCTTpoCtr ;
         AV27CCTObl = A4039CCTObl ;
         AV28CCtSto = A4040CCTSto ;
         AV29CCTArc = A4041CCTArc ;
         AV30CCTObs = A4042CCTObs ;
         AV31CCTFinFas = A4406CCTFinFas ;
         AV32CCTIniFas = A4407CCTIniFas ;
         /*
            INSERT RECORD ON TABLE TXPCCDef

         */
         W396EmprCod = A396EmprCod ;
         W4031CCTCod = A4031CCTCod ;
         W4036CCTDsc = A4036CCTDsc ;
         W4037CCTTpoCtr = A4037CCTTpoCtr ;
         W4039CCTObl = A4039CCTObl ;
         W4040CCTSto = A4040CCTSto ;
         W4041CCTArc = A4041CCTArc ;
         W4042CCTObs = A4042CCTObs ;
         W4406CCTFinFas = A4406CCTFinFas ;
         W4407CCTIniFas = A4407CCTIniFas ;
         A4031CCTCod = AV9UltCctCod ;
         A4036CCTDsc = AV25CctDsc ;
         A4037CCTTpoCtr = AV26CCtTpoCtr ;
         A4039CCTObl = AV27CCTObl ;
         A4040CCTSto = AV28CCtSto ;
         A4041CCTArc = AV29CCTArc ;
         A4042CCTObs = AV30CCTObs ;
         A4406CCTFinFas = AV31CCTFinFas ;
         A4407CCTIniFas = AV32CCTIniFas ;
         /* Using cursor P02ZQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), A4036CCTDsc, A4037CCTTpoCtr, A4039CCTObl, A4040CCTSto, A4041CCTArc, A4042CCTObs, A4406CCTFinFas, A4407CCTIniFas, Short.valueOf(A11475CCTNotUlt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
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
         A4031CCTCod = W4031CCTCod ;
         A4036CCTDsc = W4036CCTDsc ;
         A4037CCTTpoCtr = W4037CCTTpoCtr ;
         A4039CCTObl = W4039CCTObl ;
         A4040CCTSto = W4040CCTSto ;
         A4041CCTArc = W4041CCTArc ;
         A4042CCTObs = W4042CCTObs ;
         A4406CCTFinFas = W4406CCTFinFas ;
         A4407CCTIniFas = W4407CCTIniFas ;
         /* End Insert */
         AV23CctLin = (short)(5) ;
         /* Using cursor P02ZQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8CCtCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4408CCTSta = P02ZQ4_A4408CCTSta[0] ;
            A4048CCTLinTpoI = P02ZQ4_A4048CCTLinTpoI[0] ;
            A4047CCTLinVarW = P02ZQ4_A4047CCTLinVarW[0] ;
            A4046CCTLinPict = P02ZQ4_A4046CCTLinPict[0] ;
            A4045CCTLinLgoD = P02ZQ4_A4045CCTLinLgoD[0] ;
            A4044CCTLinTpoD = P02ZQ4_A4044CCTLinTpoD[0] ;
            A4043CCTLinDsc = P02ZQ4_A4043CCTLinDsc[0] ;
            A4031CCTCod = P02ZQ4_A4031CCTCod[0] ;
            A14345CCVEspe2 = P02ZQ4_A14345CCVEspe2[0] ;
            A14347CCTLinWNor = P02ZQ4_A14347CCTLinWNor[0] ;
            A14346CCTLinVWor = P02ZQ4_A14346CCTLinVWor[0] ;
            A14344CCTLinDc2 = P02ZQ4_A14344CCTLinDc2[0] ;
            A13250CCVEspecif = P02ZQ4_A13250CCVEspecif[0] ;
            A13249CCVNorma = P02ZQ4_A13249CCVNorma[0] ;
            A11522CCVCod = P02ZQ4_A11522CCVCod[0] ;
            A11476CCTLinDscL = P02ZQ4_A11476CCTLinDscL[0] ;
            A4034CCTLin = P02ZQ4_A4034CCTLin[0] ;
            W396EmprCod = A396EmprCod ;
            W4031CCTCod = A4031CCTCod ;
            AV14CctLinDsc = A4043CCTLinDsc ;
            AV15CctLinTpoD = A4044CCTLinTpoD ;
            AV16CctLinLgoD = A4045CCTLinLgoD ;
            AV17CctLinPict = A4046CCTLinPict ;
            AV18CctLinVarW = A4047CCTLinVarW ;
            AV19CctLinTpoI = A4048CCTLinTpoI ;
            AV20CctSta = A4408CCTSta ;
            /*
               INSERT RECORD ON TABLE TXPCCDef1

            */
            W396EmprCod = A396EmprCod ;
            W4031CCTCod = A4031CCTCod ;
            W4034CCTLin = A4034CCTLin ;
            W4043CCTLinDsc = A4043CCTLinDsc ;
            W4044CCTLinTpoD = A4044CCTLinTpoD ;
            W4045CCTLinLgoD = A4045CCTLinLgoD ;
            W4046CCTLinPict = A4046CCTLinPict ;
            W4047CCTLinVarW = A4047CCTLinVarW ;
            W4048CCTLinTpoI = A4048CCTLinTpoI ;
            W4408CCTSta = A4408CCTSta ;
            A4031CCTCod = AV9UltCctCod ;
            A4043CCTLinDsc = AV14CctLinDsc ;
            A4044CCTLinTpoD = AV15CctLinTpoD ;
            A4045CCTLinLgoD = AV16CctLinLgoD ;
            A4046CCTLinPict = AV17CctLinPict ;
            A4047CCTLinVarW = AV18CctLinVarW ;
            A4048CCTLinTpoI = AV19CctLinTpoI ;
            A4408CCTSta = AV20CctSta ;
            /* Using cursor P02ZQ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4043CCTLinDsc, A4044CCTLinTpoD, Short.valueOf(A4045CCTLinLgoD), A4046CCTLinPict, A4047CCTLinVarW, A4048CCTLinTpoI, A4408CCTSta, A11476CCTLinDscL, A11522CCVCod, A13249CCVNorma, A13250CCVEspecif, A14344CCTLinDc2, A14346CCTLinVWor, A14347CCTLinWNor, A14345CCVEspe2});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
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
            A4031CCTCod = W4031CCTCod ;
            A4034CCTLin = W4034CCTLin ;
            A4043CCTLinDsc = W4043CCTLinDsc ;
            A4044CCTLinTpoD = W4044CCTLinTpoD ;
            A4045CCTLinLgoD = W4045CCTLinLgoD ;
            A4046CCTLinPict = W4046CCTLinPict ;
            A4047CCTLinVarW = W4047CCTLinVarW ;
            A4048CCTLinTpoI = W4048CCTLinTpoI ;
            A4408CCTSta = W4408CCTSta ;
            /* End Insert */
            /* Using cursor P02ZQ6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV8CCtCod), Short.valueOf(A4034CCTLin)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4051CCTVal = P02ZQ6_A4051CCTVal[0] ;
               A4050CCTValDsc = P02ZQ6_A4050CCTValDsc[0] ;
               A4049CCTValLin = P02ZQ6_A4049CCTValLin[0] ;
               A4031CCTCod = P02ZQ6_A4031CCTCod[0] ;
               W396EmprCod = A396EmprCod ;
               W4031CCTCod = A4031CCTCod ;
               W4034CCTLin = A4034CCTLin ;
               AV24CctValLin = A4049CCTValLin ;
               AV21CctValDsc = A4050CCTValDsc ;
               AV22CCTVal = A4051CCTVal ;
               /*
                  INSERT RECORD ON TABLE TXPCCDef2

               */
               W396EmprCod = A396EmprCod ;
               W4031CCTCod = A4031CCTCod ;
               W4034CCTLin = A4034CCTLin ;
               W4049CCTValLin = A4049CCTValLin ;
               W4050CCTValDsc = A4050CCTValDsc ;
               W4051CCTVal = A4051CCTVal ;
               A4031CCTCod = AV9UltCctCod ;
               A4034CCTLin = AV23CctLin ;
               A4049CCTValLin = AV24CctValLin ;
               A4050CCTValDsc = AV21CctValDsc ;
               A4051CCTVal = AV22CCTVal ;
               /* Using cursor P02ZQ7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
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
               A4031CCTCod = W4031CCTCod ;
               A4034CCTLin = W4034CCTLin ;
               A4049CCTValLin = W4049CCTValLin ;
               A4050CCTValDsc = W4050CCTValDsc ;
               A4051CCTVal = W4051CCTVal ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A4031CCTCod = W4031CCTCod ;
               A4034CCTLin = W4034CCTLin ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV23CctLin = (short)(AV23CctLin+5) ;
            A396EmprCod = W396EmprCod ;
            A4031CCTCod = W4031CCTCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A396EmprCod = W396EmprCod ;
         A4031CCTCod = W4031CCTCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdupccl.this.A396EmprCod;
      this.aP1[0] = pdupccl.this.AV8CCtCod;
      this.aP2[0] = pdupccl.this.AV9UltCctCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdupccl");
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
      P02ZQ2_A396EmprCod = new String[] {""} ;
      P02ZQ2_A4407CCTIniFas = new String[] {""} ;
      P02ZQ2_A4406CCTFinFas = new String[] {""} ;
      P02ZQ2_A4042CCTObs = new String[] {""} ;
      P02ZQ2_A4041CCTArc = new String[] {""} ;
      P02ZQ2_A4040CCTSto = new String[] {""} ;
      P02ZQ2_A4039CCTObl = new String[] {""} ;
      P02ZQ2_A4037CCTTpoCtr = new String[] {""} ;
      P02ZQ2_A4036CCTDsc = new String[] {""} ;
      P02ZQ2_A4031CCTCod = new int[1] ;
      P02ZQ2_A11475CCTNotUlt = new short[1] ;
      A4407CCTIniFas = "" ;
      A4406CCTFinFas = "" ;
      A4042CCTObs = "" ;
      A4041CCTArc = "" ;
      A4040CCTSto = "" ;
      A4039CCTObl = "" ;
      A4037CCTTpoCtr = "" ;
      A4036CCTDsc = "" ;
      W396EmprCod = "" ;
      AV25CctDsc = "" ;
      AV26CCtTpoCtr = "" ;
      AV27CCTObl = "" ;
      AV28CCtSto = "" ;
      AV29CCTArc = "" ;
      AV30CCTObs = "" ;
      AV31CCTFinFas = "" ;
      AV32CCTIniFas = "" ;
      W4036CCTDsc = "" ;
      W4037CCTTpoCtr = "" ;
      W4039CCTObl = "" ;
      W4040CCTSto = "" ;
      W4041CCTArc = "" ;
      W4042CCTObs = "" ;
      W4406CCTFinFas = "" ;
      W4407CCTIniFas = "" ;
      Gx_emsg = "" ;
      P02ZQ4_A396EmprCod = new String[] {""} ;
      P02ZQ4_A4408CCTSta = new String[] {""} ;
      P02ZQ4_A4048CCTLinTpoI = new String[] {""} ;
      P02ZQ4_A4047CCTLinVarW = new String[] {""} ;
      P02ZQ4_A4046CCTLinPict = new String[] {""} ;
      P02ZQ4_A4045CCTLinLgoD = new short[1] ;
      P02ZQ4_A4044CCTLinTpoD = new String[] {""} ;
      P02ZQ4_A4043CCTLinDsc = new String[] {""} ;
      P02ZQ4_A4031CCTCod = new int[1] ;
      P02ZQ4_A14345CCVEspe2 = new String[] {""} ;
      P02ZQ4_A14347CCTLinWNor = new String[] {""} ;
      P02ZQ4_A14346CCTLinVWor = new String[] {""} ;
      P02ZQ4_A14344CCTLinDc2 = new String[] {""} ;
      P02ZQ4_A13250CCVEspecif = new String[] {""} ;
      P02ZQ4_A13249CCVNorma = new String[] {""} ;
      P02ZQ4_A11522CCVCod = new String[] {""} ;
      P02ZQ4_A11476CCTLinDscL = new String[] {""} ;
      P02ZQ4_A4034CCTLin = new short[1] ;
      A4408CCTSta = "" ;
      A4048CCTLinTpoI = "" ;
      A4047CCTLinVarW = "" ;
      A4046CCTLinPict = "" ;
      A4044CCTLinTpoD = "" ;
      A4043CCTLinDsc = "" ;
      A14345CCVEspe2 = "" ;
      A14347CCTLinWNor = "" ;
      A14346CCTLinVWor = "" ;
      A14344CCTLinDc2 = "" ;
      A13250CCVEspecif = "" ;
      A13249CCVNorma = "" ;
      A11522CCVCod = "" ;
      A11476CCTLinDscL = "" ;
      AV14CctLinDsc = "" ;
      AV15CctLinTpoD = "" ;
      AV17CctLinPict = "" ;
      AV18CctLinVarW = "" ;
      AV19CctLinTpoI = "" ;
      AV20CctSta = "" ;
      W4043CCTLinDsc = "" ;
      W4044CCTLinTpoD = "" ;
      W4046CCTLinPict = "" ;
      W4047CCTLinVarW = "" ;
      W4048CCTLinTpoI = "" ;
      W4408CCTSta = "" ;
      P02ZQ6_A396EmprCod = new String[] {""} ;
      P02ZQ6_A4034CCTLin = new short[1] ;
      P02ZQ6_A4051CCTVal = new String[] {""} ;
      P02ZQ6_A4050CCTValDsc = new String[] {""} ;
      P02ZQ6_A4049CCTValLin = new byte[1] ;
      P02ZQ6_A4031CCTCod = new int[1] ;
      A4051CCTVal = "" ;
      A4050CCTValDsc = "" ;
      AV21CctValDsc = "" ;
      AV22CCTVal = "" ;
      W4050CCTValDsc = "" ;
      W4051CCTVal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdupccl__default(),
         new Object[] {
             new Object[] {
            P02ZQ2_A396EmprCod, P02ZQ2_A4407CCTIniFas, P02ZQ2_A4406CCTFinFas, P02ZQ2_A4042CCTObs, P02ZQ2_A4041CCTArc, P02ZQ2_A4040CCTSto, P02ZQ2_A4039CCTObl, P02ZQ2_A4037CCTTpoCtr, P02ZQ2_A4036CCTDsc, P02ZQ2_A4031CCTCod,
            P02ZQ2_A11475CCTNotUlt
            }
            , new Object[] {
            }
            , new Object[] {
            P02ZQ4_A396EmprCod, P02ZQ4_A4408CCTSta, P02ZQ4_A4048CCTLinTpoI, P02ZQ4_A4047CCTLinVarW, P02ZQ4_A4046CCTLinPict, P02ZQ4_A4045CCTLinLgoD, P02ZQ4_A4044CCTLinTpoD, P02ZQ4_A4043CCTLinDsc, P02ZQ4_A4031CCTCod, P02ZQ4_A14345CCVEspe2,
            P02ZQ4_A14347CCTLinWNor, P02ZQ4_A14346CCTLinVWor, P02ZQ4_A14344CCTLinDc2, P02ZQ4_A13250CCVEspecif, P02ZQ4_A13249CCVNorma, P02ZQ4_A11522CCVCod, P02ZQ4_A11476CCTLinDscL, P02ZQ4_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02ZQ6_A396EmprCod, P02ZQ6_A4034CCTLin, P02ZQ6_A4051CCTVal, P02ZQ6_A4050CCTValDsc, P02ZQ6_A4049CCTValLin, P02ZQ6_A4031CCTCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4049CCTValLin ;
   private byte AV24CctValLin ;
   private byte W4049CCTValLin ;
   private short A11475CCTNotUlt ;
   private short Gx_err ;
   private short AV23CctLin ;
   private short A4045CCTLinLgoD ;
   private short A4034CCTLin ;
   private short AV16CctLinLgoD ;
   private short W4034CCTLin ;
   private short W4045CCTLinLgoD ;
   private int AV8CCtCod ;
   private int AV9UltCctCod ;
   private int A4031CCTCod ;
   private int W4031CCTCod ;
   private int GX_INS621 ;
   private int GX_INS622 ;
   private int GX_INS623 ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A4407CCTIniFas ;
   private String A4406CCTFinFas ;
   private String A4042CCTObs ;
   private String A4041CCTArc ;
   private String A4040CCTSto ;
   private String A4039CCTObl ;
   private String A4037CCTTpoCtr ;
   private String A4036CCTDsc ;
   private String W396EmprCod ;
   private String AV25CctDsc ;
   private String AV26CCtTpoCtr ;
   private String AV27CCTObl ;
   private String AV28CCtSto ;
   private String AV29CCTArc ;
   private String AV30CCTObs ;
   private String AV31CCTFinFas ;
   private String AV32CCTIniFas ;
   private String W4036CCTDsc ;
   private String W4037CCTTpoCtr ;
   private String W4039CCTObl ;
   private String W4040CCTSto ;
   private String W4041CCTArc ;
   private String W4042CCTObs ;
   private String W4406CCTFinFas ;
   private String W4407CCTIniFas ;
   private String Gx_emsg ;
   private String A4408CCTSta ;
   private String A4048CCTLinTpoI ;
   private String A4047CCTLinVarW ;
   private String A4046CCTLinPict ;
   private String A4044CCTLinTpoD ;
   private String A4043CCTLinDsc ;
   private String A14347CCTLinWNor ;
   private String A14346CCTLinVWor ;
   private String A14344CCTLinDc2 ;
   private String A13250CCVEspecif ;
   private String A13249CCVNorma ;
   private String A11522CCVCod ;
   private String AV14CctLinDsc ;
   private String AV15CctLinTpoD ;
   private String AV17CctLinPict ;
   private String AV18CctLinVarW ;
   private String AV19CctLinTpoI ;
   private String AV20CctSta ;
   private String W4043CCTLinDsc ;
   private String W4044CCTLinTpoD ;
   private String W4046CCTLinPict ;
   private String W4047CCTLinVarW ;
   private String W4048CCTLinTpoI ;
   private String W4408CCTSta ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private String AV21CctValDsc ;
   private String AV22CCTVal ;
   private String W4050CCTValDsc ;
   private String W4051CCTVal ;
   private String A14345CCVEspe2 ;
   private String A11476CCTLinDscL ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02ZQ2_A396EmprCod ;
   private String[] P02ZQ2_A4407CCTIniFas ;
   private String[] P02ZQ2_A4406CCTFinFas ;
   private String[] P02ZQ2_A4042CCTObs ;
   private String[] P02ZQ2_A4041CCTArc ;
   private String[] P02ZQ2_A4040CCTSto ;
   private String[] P02ZQ2_A4039CCTObl ;
   private String[] P02ZQ2_A4037CCTTpoCtr ;
   private String[] P02ZQ2_A4036CCTDsc ;
   private int[] P02ZQ2_A4031CCTCod ;
   private short[] P02ZQ2_A11475CCTNotUlt ;
   private String[] P02ZQ4_A396EmprCod ;
   private String[] P02ZQ4_A4408CCTSta ;
   private String[] P02ZQ4_A4048CCTLinTpoI ;
   private String[] P02ZQ4_A4047CCTLinVarW ;
   private String[] P02ZQ4_A4046CCTLinPict ;
   private short[] P02ZQ4_A4045CCTLinLgoD ;
   private String[] P02ZQ4_A4044CCTLinTpoD ;
   private String[] P02ZQ4_A4043CCTLinDsc ;
   private int[] P02ZQ4_A4031CCTCod ;
   private String[] P02ZQ4_A14345CCVEspe2 ;
   private String[] P02ZQ4_A14347CCTLinWNor ;
   private String[] P02ZQ4_A14346CCTLinVWor ;
   private String[] P02ZQ4_A14344CCTLinDc2 ;
   private String[] P02ZQ4_A13250CCVEspecif ;
   private String[] P02ZQ4_A13249CCVNorma ;
   private String[] P02ZQ4_A11522CCVCod ;
   private String[] P02ZQ4_A11476CCTLinDscL ;
   private short[] P02ZQ4_A4034CCTLin ;
   private String[] P02ZQ6_A396EmprCod ;
   private short[] P02ZQ6_A4034CCTLin ;
   private String[] P02ZQ6_A4051CCTVal ;
   private String[] P02ZQ6_A4050CCTValDsc ;
   private byte[] P02ZQ6_A4049CCTValLin ;
   private int[] P02ZQ6_A4031CCTCod ;
}

final  class pdupccl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02ZQ2", "SELECT EmprCod, CCTIniFas, CCTFinFas, CCTObs, CCTArc, CCTSto, CCTObl, CCTTpoCtr, CCTDsc, CCTCod, CCTNotUlt FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02ZQ3", "INSERT INTO TXPCCDef(EmprCod, CCTCod, CCTDsc, CCTTpoCtr, CCTObl, CCTSto, CCTArc, CCTObs, CCTFinFas, CCTIniFas, CCTNotUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef")
         ,new ForEachCursor("P02ZQ4", "SELECT EmprCod, CCTSta, CCTLinTpoI, CCTLinVarW, CCTLinPict, CCTLinLgoD, CCTLinTpoD, CCTLinDsc, CCTCod, CCVEspe2, CCTLinWNor, CCTLinVWor, CCTLinDc2, CCVEspecif, CCVNorma, CCVCod, CCTLinDscL, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02ZQ5", "INSERT INTO TXPCCDef1(EmprCod, CCTCod, CCTLin, CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict, CCTLinVarW, CCTLinTpoI, CCTSta, CCTLinDscL, CCVCod, CCVNorma, CCVEspecif, CCTLinDc2, CCTLinVWor, CCTLinWNor, CCVEspe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef1")
         ,new ForEachCursor("P02ZQ6", "SELECT EmprCod, CCTLin, CCTVal, CCTValDsc, CCTValLin, CCTCod FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02ZQ7", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 128);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 32);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 32);
               ((String[]) buf[11])[0] = rslt.getString(12, 32);
               ((String[]) buf[12])[0] = rslt.getString(13, 60);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((String[]) buf[15])[0] = rslt.getString(16, 10);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 128);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 40);
               stmt.setString(8, (String)parms[7], 32);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 40);
               stmt.setVarchar(11, (String)parms[10], 2048, false);
               stmt.setString(12, (String)parms[11], 10);
               stmt.setString(13, (String)parms[12], 30);
               stmt.setString(14, (String)parms[13], 30);
               stmt.setString(15, (String)parms[14], 60);
               stmt.setString(16, (String)parms[15], 32);
               stmt.setString(17, (String)parms[16], 32);
               stmt.setVarchar(18, (String)parms[17], 300, false);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
      }
   }

}

