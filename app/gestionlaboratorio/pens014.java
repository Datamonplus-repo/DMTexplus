package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens014 extends GXProcedure
{
   public pens014( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens014.class ), "" );
   }

   public pens014( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pens014.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pens014.this.AV23EmprCod = aP0[0];
      this.aP0 = aP0;
      pens014.this.AV20Lb_Numero = aP1[0];
      this.aP1 = aP1;
      pens014.this.AV21Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens014.this.AV24Lb_numop = aP3[0];
      this.aP3 = aP3;
      pens014.this.AV29Oldopcion = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28Lb_FecNoa1 = GXutil.nullDate() ;
      AV31Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      /* Using cursor P01UD2 */
      pr_default.execute(0, new Object[] {AV23EmprCod, Integer.valueOf(AV20Lb_Numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P01UD2_A396EmprCod[0] ;
         A5532Lb_numero = P01UD2_A5532Lb_numero[0] ;
         A6461Lb_FecNoa1 = P01UD2_A6461Lb_FecNoa1[0] ;
         A5566Lb_Estado = P01UD2_A5566Lb_Estado[0] ;
         A10082Lb_hhnoa1 = P01UD2_A10082Lb_hhnoa1[0] ;
         A5555Lb_opcion = P01UD2_A5555Lb_opcion[0] ;
         if ( ( A5566Lb_Estado == 2 ) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
         {
            AV28Lb_FecNoa1 = A6461Lb_FecNoa1 ;
            AV31Lb_hhnoa1 = A10082Lb_hhnoa1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV29Oldopcion, " ") == 0 )
      {
         /* Using cursor P01UD3 */
         pr_default.execute(1, new Object[] {AV23EmprCod, Integer.valueOf(AV20Lb_Numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5541Lb_FechaE = P01UD3_A5541Lb_FechaE[0] ;
            A5542Lb_HoraE = P01UD3_A5542Lb_HoraE[0] ;
            A5532Lb_numero = P01UD3_A5532Lb_numero[0] ;
            A396EmprCod = P01UD3_A396EmprCod[0] ;
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            AV26Fecha_0 = GXutil.nullDate() ;
            AV27HoraR_0 = GXutil.resetTime( GXutil.nullDate() );
            /*
               INSERT RECORD ON TABLE TXPENS002

            */
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            A396EmprCod = AV23EmprCod ;
            A5532Lb_numero = AV20Lb_Numero ;
            A5555Lb_opcion = AV21Lb_opcion ;
            A5556Lb_UltLC = (short)(0) ;
            A5559Lb_UltlP = (short)(0) ;
            A5568Lb_HoraEn = GXutil.resetTime( AV26Fecha_0 );
            A5567Lb_FechaEn = AV26Fecha_0 ;
            A5566Lb_Estado = (byte)(0) ;
            A5565Lb_CosteE = DecimalUtil.doubleToDec(0) ;
            A5564Lb_HoraR = AV27HoraR_0 ;
            A5563Lb_FechaR = AV26Fecha_0 ;
            A5718Lb_numop = AV24Lb_numop ;
            A5989Lb_PreKg = DecimalUtil.doubleToDec(0) ;
            A6192Lb_FecPre = AV26Fecha_0 ;
            n6310Lb_TaAuxC = false ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28Lb_FecNoa1)) )
            {
               A6460Lb_FecEnt1 = A5541Lb_FechaE ;
               A10081Lb_hhent1 = A5542Lb_HoraE ;
            }
            else
            {
               A6460Lb_FecEnt1 = AV28Lb_FecNoa1 ;
               A10081Lb_hhent1 = AV31Lb_hhnoa1 ;
            }
            A6461Lb_FecNoa1 = GXutil.nullDate() ;
            A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
            A6631Lb_ProvDef = httpContext.getMessage( "D", "") ;
            A12525Lb_opSt = "*" ;
            n12525Lb_opSt = false ;
            A12526Lb_opFc = GXutil.nullDate() ;
            n12526Lb_opFc = false ;
            A12731Lb_ObsFac = " " ;
            /* Using cursor P01UD4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5556Lb_UltLC), Short.valueOf(A5559Lb_UltlP), A5563Lb_FechaR, A5564Lb_HoraR, A5565Lb_CosteE, Byte.valueOf(A5566Lb_Estado), A5567Lb_FechaEn, A5568Lb_HoraEn, Byte.valueOf(A5718Lb_numop), A5989Lb_PreKg, A6192Lb_FecPre, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6373Lb_famc1), Byte.valueOf(A6374Lb_famc2), Byte.valueOf(A6375Lb_famc3), A6460Lb_FecEnt1, A6461Lb_FecNoa1, A6631Lb_ProvDef, A10081Lb_hhent1, A10082Lb_hhnoa1, Boolean.valueOf(n12525Lb_opSt), A12525Lb_opSt, Boolean.valueOf(n12526Lb_opFc), A12526Lb_opFc, A12731Lb_ObsFac});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
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
            A396EmprCod = W396EmprCod ;
            A5532Lb_numero = W5532Lb_numero ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A5532Lb_numero = W5532Lb_numero ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P01UD5 */
         pr_default.execute(3, new Object[] {AV23EmprCod, Integer.valueOf(AV20Lb_Numero)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A5541Lb_FechaE = P01UD5_A5541Lb_FechaE[0] ;
            A5542Lb_HoraE = P01UD5_A5542Lb_HoraE[0] ;
            A5532Lb_numero = P01UD5_A5532Lb_numero[0] ;
            A396EmprCod = P01UD5_A396EmprCod[0] ;
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            AV26Fecha_0 = GXutil.nullDate() ;
            AV27HoraR_0 = GXutil.resetTime( GXutil.nullDate() );
            AV30Lb_fechae = A5541Lb_FechaE ;
            /* Using cursor P01UD6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV29Oldopcion});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A12731Lb_ObsFac = P01UD6_A12731Lb_ObsFac[0] ;
               A12526Lb_opFc = P01UD6_A12526Lb_opFc[0] ;
               n12526Lb_opFc = P01UD6_n12526Lb_opFc[0] ;
               A12525Lb_opSt = P01UD6_A12525Lb_opSt[0] ;
               n12525Lb_opSt = P01UD6_n12525Lb_opSt[0] ;
               A10082Lb_hhnoa1 = P01UD6_A10082Lb_hhnoa1[0] ;
               A10081Lb_hhent1 = P01UD6_A10081Lb_hhent1[0] ;
               A6631Lb_ProvDef = P01UD6_A6631Lb_ProvDef[0] ;
               A6461Lb_FecNoa1 = P01UD6_A6461Lb_FecNoa1[0] ;
               A6460Lb_FecEnt1 = P01UD6_A6460Lb_FecEnt1[0] ;
               A6192Lb_FecPre = P01UD6_A6192Lb_FecPre[0] ;
               A5989Lb_PreKg = P01UD6_A5989Lb_PreKg[0] ;
               A5718Lb_numop = P01UD6_A5718Lb_numop[0] ;
               A5568Lb_HoraEn = P01UD6_A5568Lb_HoraEn[0] ;
               A5567Lb_FechaEn = P01UD6_A5567Lb_FechaEn[0] ;
               A5566Lb_Estado = P01UD6_A5566Lb_Estado[0] ;
               A5565Lb_CosteE = P01UD6_A5565Lb_CosteE[0] ;
               A5564Lb_HoraR = P01UD6_A5564Lb_HoraR[0] ;
               A5563Lb_FechaR = P01UD6_A5563Lb_FechaR[0] ;
               A5559Lb_UltlP = P01UD6_A5559Lb_UltlP[0] ;
               A5556Lb_UltLC = P01UD6_A5556Lb_UltLC[0] ;
               A5555Lb_opcion = P01UD6_A5555Lb_opcion[0] ;
               A13459Lb_UltLinC = P01UD6_A13459Lb_UltLinC[0] ;
               n13459Lb_UltLinC = P01UD6_n13459Lb_UltLinC[0] ;
               A10822Lb_ObsCR = P01UD6_A10822Lb_ObsCR[0] ;
               A10083Lb_PreMt = P01UD6_A10083Lb_PreMt[0] ;
               A1127Lb_CosteC = P01UD6_A1127Lb_CosteC[0] ;
               A8622Lb_IntCod = P01UD6_A8622Lb_IntCod[0] ;
               A7395Lb_NumAux = P01UD6_A7395Lb_NumAux[0] ;
               A6375Lb_famc3 = P01UD6_A6375Lb_famc3[0] ;
               A6374Lb_famc2 = P01UD6_A6374Lb_famc2[0] ;
               A6373Lb_famc1 = P01UD6_A6373Lb_famc1[0] ;
               A6310Lb_TaAuxC = P01UD6_A6310Lb_TaAuxC[0] ;
               n6310Lb_TaAuxC = P01UD6_n6310Lb_TaAuxC[0] ;
               W396EmprCod = A396EmprCod ;
               W5532Lb_numero = A5532Lb_numero ;
               W5555Lb_opcion = A5555Lb_opcion ;
               /*
                  INSERT RECORD ON TABLE TXPENS002

               */
               W396EmprCod = A396EmprCod ;
               W5532Lb_numero = A5532Lb_numero ;
               W5555Lb_opcion = A5555Lb_opcion ;
               W5556Lb_UltLC = A5556Lb_UltLC ;
               W5559Lb_UltlP = A5559Lb_UltlP ;
               W5568Lb_HoraEn = A5568Lb_HoraEn ;
               W5567Lb_FechaEn = A5567Lb_FechaEn ;
               W5566Lb_Estado = A5566Lb_Estado ;
               W5565Lb_CosteE = A5565Lb_CosteE ;
               W5564Lb_HoraR = A5564Lb_HoraR ;
               W5563Lb_FechaR = A5563Lb_FechaR ;
               W5718Lb_numop = A5718Lb_numop ;
               W5989Lb_PreKg = A5989Lb_PreKg ;
               W6192Lb_FecPre = A6192Lb_FecPre ;
               W6310Lb_TaAuxC = A6310Lb_TaAuxC ;
               n6310Lb_TaAuxC = false ;
               W6375Lb_famc3 = A6375Lb_famc3 ;
               W6374Lb_famc2 = A6374Lb_famc2 ;
               W6373Lb_famc1 = A6373Lb_famc1 ;
               W6460Lb_FecEnt1 = A6460Lb_FecEnt1 ;
               W10081Lb_hhent1 = A10081Lb_hhent1 ;
               W6460Lb_FecEnt1 = A6460Lb_FecEnt1 ;
               W10081Lb_hhent1 = A10081Lb_hhent1 ;
               W6461Lb_FecNoa1 = A6461Lb_FecNoa1 ;
               W10082Lb_hhnoa1 = A10082Lb_hhnoa1 ;
               W6631Lb_ProvDef = A6631Lb_ProvDef ;
               W12525Lb_opSt = A12525Lb_opSt ;
               n12525Lb_opSt = false ;
               W12526Lb_opFc = A12526Lb_opFc ;
               n12526Lb_opFc = false ;
               W12731Lb_ObsFac = A12731Lb_ObsFac ;
               A396EmprCod = AV23EmprCod ;
               A5532Lb_numero = AV20Lb_Numero ;
               A5555Lb_opcion = AV21Lb_opcion ;
               A5556Lb_UltLC = (short)(0) ;
               A5559Lb_UltlP = (short)(0) ;
               A5568Lb_HoraEn = GXutil.resetTime( AV26Fecha_0 );
               A5567Lb_FechaEn = AV26Fecha_0 ;
               A5566Lb_Estado = (byte)(0) ;
               A5565Lb_CosteE = DecimalUtil.doubleToDec(0) ;
               A5564Lb_HoraR = AV27HoraR_0 ;
               A5563Lb_FechaR = AV26Fecha_0 ;
               A5718Lb_numop = AV24Lb_numop ;
               A5989Lb_PreKg = DecimalUtil.doubleToDec(0) ;
               A6192Lb_FecPre = AV26Fecha_0 ;
               n6310Lb_TaAuxC = false ;
               if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28Lb_FecNoa1)) )
               {
                  A6460Lb_FecEnt1 = A5541Lb_FechaE ;
                  A10081Lb_hhent1 = A5542Lb_HoraE ;
               }
               else
               {
                  A6460Lb_FecEnt1 = AV28Lb_FecNoa1 ;
                  A10081Lb_hhent1 = AV31Lb_hhnoa1 ;
               }
               A6461Lb_FecNoa1 = GXutil.nullDate() ;
               A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
               A6631Lb_ProvDef = httpContext.getMessage( "D", "") ;
               A12525Lb_opSt = "*" ;
               n12525Lb_opSt = false ;
               A12526Lb_opFc = GXutil.nullDate() ;
               n12526Lb_opFc = false ;
               A12731Lb_ObsFac = "" ;
               /* Using cursor P01UD7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5556Lb_UltLC), Short.valueOf(A5559Lb_UltlP), A5563Lb_FechaR, A5564Lb_HoraR, A5565Lb_CosteE, Byte.valueOf(A5566Lb_Estado), A5567Lb_FechaEn, A5568Lb_HoraEn, Byte.valueOf(A5718Lb_numop), A5989Lb_PreKg, A6192Lb_FecPre, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6373Lb_famc1), Byte.valueOf(A6374Lb_famc2), Byte.valueOf(A6375Lb_famc3), A6460Lb_FecEnt1, A6461Lb_FecNoa1, A6631Lb_ProvDef, Byte.valueOf(A7395Lb_NumAux), Byte.valueOf(A8622Lb_IntCod), A1127Lb_CosteC, A10081Lb_hhent1, A10082Lb_hhnoa1, A10083Lb_PreMt, A10822Lb_ObsCR, Boolean.valueOf(n12525Lb_opSt), A12525Lb_opSt, Boolean.valueOf(n12526Lb_opFc), A12526Lb_opFc, A12731Lb_ObsFac, Boolean.valueOf(n13459Lb_UltLinC), Short.valueOf(A13459Lb_UltLinC)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
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
               A5532Lb_numero = W5532Lb_numero ;
               A5555Lb_opcion = W5555Lb_opcion ;
               A5556Lb_UltLC = W5556Lb_UltLC ;
               A5559Lb_UltlP = W5559Lb_UltlP ;
               A5568Lb_HoraEn = W5568Lb_HoraEn ;
               A5567Lb_FechaEn = W5567Lb_FechaEn ;
               A5566Lb_Estado = W5566Lb_Estado ;
               A5565Lb_CosteE = W5565Lb_CosteE ;
               A5564Lb_HoraR = W5564Lb_HoraR ;
               A5563Lb_FechaR = W5563Lb_FechaR ;
               A5718Lb_numop = W5718Lb_numop ;
               A5989Lb_PreKg = W5989Lb_PreKg ;
               A6192Lb_FecPre = W6192Lb_FecPre ;
               A6310Lb_TaAuxC = W6310Lb_TaAuxC ;
               n6310Lb_TaAuxC = false ;
               A6375Lb_famc3 = W6375Lb_famc3 ;
               A6374Lb_famc2 = W6374Lb_famc2 ;
               A6373Lb_famc1 = W6373Lb_famc1 ;
               A6460Lb_FecEnt1 = W6460Lb_FecEnt1 ;
               A10081Lb_hhent1 = W10081Lb_hhent1 ;
               A6460Lb_FecEnt1 = W6460Lb_FecEnt1 ;
               A10081Lb_hhent1 = W10081Lb_hhent1 ;
               A6461Lb_FecNoa1 = W6461Lb_FecNoa1 ;
               A10082Lb_hhnoa1 = W10082Lb_hhnoa1 ;
               A6631Lb_ProvDef = W6631Lb_ProvDef ;
               A12525Lb_opSt = W12525Lb_opSt ;
               n12525Lb_opSt = false ;
               A12526Lb_opFc = W12526Lb_opFc ;
               n12526Lb_opFc = false ;
               A12731Lb_ObsFac = W12731Lb_ObsFac ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A5532Lb_numero = W5532Lb_numero ;
               A5555Lb_opcion = W5555Lb_opcion ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
            A396EmprCod = W396EmprCod ;
            A5532Lb_numero = W5532Lb_numero ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens014.this.AV23EmprCod;
      this.aP1[0] = pens014.this.AV20Lb_Numero;
      this.aP2[0] = pens014.this.AV21Lb_opcion;
      this.aP3[0] = pens014.this.AV24Lb_numop;
      this.aP4[0] = pens014.this.AV29Oldopcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens014");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28Lb_FecNoa1 = GXutil.nullDate() ;
      AV31Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P01UD2_A396EmprCod = new String[] {""} ;
      P01UD2_A5532Lb_numero = new int[1] ;
      P01UD2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD2_A5566Lb_Estado = new byte[1] ;
      P01UD2_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD2_A5555Lb_opcion = new String[] {""} ;
      A396EmprCod = "" ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A5555Lb_opcion = "" ;
      P01UD3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD3_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD3_A5532Lb_numero = new int[1] ;
      P01UD3_A396EmprCod = new String[] {""} ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      W396EmprCod = "" ;
      AV26Fecha_0 = GXutil.nullDate() ;
      AV27HoraR_0 = GXutil.resetTime( GXutil.nullDate() );
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5989Lb_PreKg = DecimalUtil.ZERO ;
      A6192Lb_FecPre = GXutil.nullDate() ;
      A6310Lb_TaAuxC = "" ;
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      A10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      A6631Lb_ProvDef = "" ;
      A12525Lb_opSt = "" ;
      A12526Lb_opFc = GXutil.nullDate() ;
      A12731Lb_ObsFac = "" ;
      Gx_emsg = "" ;
      P01UD5_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD5_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD5_A5532Lb_numero = new int[1] ;
      P01UD5_A396EmprCod = new String[] {""} ;
      AV30Lb_fechae = GXutil.nullDate() ;
      P01UD6_A396EmprCod = new String[] {""} ;
      P01UD6_A5532Lb_numero = new int[1] ;
      P01UD6_A12731Lb_ObsFac = new String[] {""} ;
      P01UD6_A12526Lb_opFc = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_n12526Lb_opFc = new boolean[] {false} ;
      P01UD6_A12525Lb_opSt = new String[] {""} ;
      P01UD6_n12525Lb_opSt = new boolean[] {false} ;
      P01UD6_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_A10081Lb_hhent1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_A6631Lb_ProvDef = new String[] {""} ;
      P01UD6_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_A6192Lb_FecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_A5989Lb_PreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UD6_A5718Lb_numop = new byte[1] ;
      P01UD6_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_A5566Lb_Estado = new byte[1] ;
      P01UD6_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UD6_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P01UD6_A5559Lb_UltlP = new short[1] ;
      P01UD6_A5556Lb_UltLC = new short[1] ;
      P01UD6_A5555Lb_opcion = new String[] {""} ;
      P01UD6_A13459Lb_UltLinC = new short[1] ;
      P01UD6_n13459Lb_UltLinC = new boolean[] {false} ;
      P01UD6_A10822Lb_ObsCR = new String[] {""} ;
      P01UD6_A10083Lb_PreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UD6_A1127Lb_CosteC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UD6_A8622Lb_IntCod = new byte[1] ;
      P01UD6_A7395Lb_NumAux = new byte[1] ;
      P01UD6_A6375Lb_famc3 = new byte[1] ;
      P01UD6_A6374Lb_famc2 = new byte[1] ;
      P01UD6_A6373Lb_famc1 = new byte[1] ;
      P01UD6_A6310Lb_TaAuxC = new String[] {""} ;
      P01UD6_n6310Lb_TaAuxC = new boolean[] {false} ;
      A10822Lb_ObsCR = "" ;
      A10083Lb_PreMt = DecimalUtil.ZERO ;
      A1127Lb_CosteC = DecimalUtil.ZERO ;
      W5555Lb_opcion = "" ;
      W5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      W5567Lb_FechaEn = GXutil.nullDate() ;
      W5565Lb_CosteE = DecimalUtil.ZERO ;
      W5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      W5563Lb_FechaR = GXutil.nullDate() ;
      W5989Lb_PreKg = DecimalUtil.ZERO ;
      W6192Lb_FecPre = GXutil.nullDate() ;
      W6310Lb_TaAuxC = "" ;
      W6460Lb_FecEnt1 = GXutil.nullDate() ;
      W10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      W6461Lb_FecNoa1 = GXutil.nullDate() ;
      W10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      W6631Lb_ProvDef = "" ;
      W12525Lb_opSt = "" ;
      W12526Lb_opFc = GXutil.nullDate() ;
      W12731Lb_ObsFac = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens014__default(),
         new Object[] {
             new Object[] {
            P01UD2_A396EmprCod, P01UD2_A5532Lb_numero, P01UD2_A6461Lb_FecNoa1, P01UD2_A5566Lb_Estado, P01UD2_A10082Lb_hhnoa1, P01UD2_A5555Lb_opcion
            }
            , new Object[] {
            P01UD3_A5541Lb_FechaE, P01UD3_A5542Lb_HoraE, P01UD3_A5532Lb_numero, P01UD3_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01UD5_A5541Lb_FechaE, P01UD5_A5542Lb_HoraE, P01UD5_A5532Lb_numero, P01UD5_A396EmprCod
            }
            , new Object[] {
            P01UD6_A396EmprCod, P01UD6_A5532Lb_numero, P01UD6_A12731Lb_ObsFac, P01UD6_A12526Lb_opFc, P01UD6_n12526Lb_opFc, P01UD6_A12525Lb_opSt, P01UD6_n12525Lb_opSt, P01UD6_A10082Lb_hhnoa1, P01UD6_A10081Lb_hhent1, P01UD6_A6631Lb_ProvDef,
            P01UD6_A6461Lb_FecNoa1, P01UD6_A6460Lb_FecEnt1, P01UD6_A6192Lb_FecPre, P01UD6_A5989Lb_PreKg, P01UD6_A5718Lb_numop, P01UD6_A5568Lb_HoraEn, P01UD6_A5567Lb_FechaEn, P01UD6_A5566Lb_Estado, P01UD6_A5565Lb_CosteE, P01UD6_A5564Lb_HoraR,
            P01UD6_A5563Lb_FechaR, P01UD6_A5559Lb_UltlP, P01UD6_A5556Lb_UltLC, P01UD6_A5555Lb_opcion, P01UD6_A13459Lb_UltLinC, P01UD6_n13459Lb_UltLinC, P01UD6_A10822Lb_ObsCR, P01UD6_A10083Lb_PreMt, P01UD6_A1127Lb_CosteC, P01UD6_A8622Lb_IntCod,
            P01UD6_A7395Lb_NumAux, P01UD6_A6375Lb_famc3, P01UD6_A6374Lb_famc2, P01UD6_A6373Lb_famc1, P01UD6_A6310Lb_TaAuxC, P01UD6_n6310Lb_TaAuxC
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte A5718Lb_numop ;
   private byte A6375Lb_famc3 ;
   private byte A6374Lb_famc2 ;
   private byte A6373Lb_famc1 ;
   private byte A8622Lb_IntCod ;
   private byte A7395Lb_NumAux ;
   private byte W5566Lb_Estado ;
   private byte W5718Lb_numop ;
   private byte W6375Lb_famc3 ;
   private byte W6374Lb_famc2 ;
   private byte W6373Lb_famc1 ;
   private short A5556Lb_UltLC ;
   private short A5559Lb_UltlP ;
   private short Gx_err ;
   private short A13459Lb_UltLinC ;
   private short W5556Lb_UltLC ;
   private short W5559Lb_UltlP ;
   private int AV20Lb_Numero ;
   private int A5532Lb_numero ;
   private int W5532Lb_numero ;
   private int GX_INS819 ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal A5989Lb_PreKg ;
   private java.math.BigDecimal A10083Lb_PreMt ;
   private java.math.BigDecimal A1127Lb_CosteC ;
   private java.math.BigDecimal W5565Lb_CosteE ;
   private java.math.BigDecimal W5989Lb_PreKg ;
   private String AV23EmprCod ;
   private String AV21Lb_opcion ;
   private String AV29Oldopcion ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String W396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String A6631Lb_ProvDef ;
   private String A12525Lb_opSt ;
   private String Gx_emsg ;
   private String W5555Lb_opcion ;
   private String W6310Lb_TaAuxC ;
   private String W6631Lb_ProvDef ;
   private String W12525Lb_opSt ;
   private java.util.Date AV31Lb_hhnoa1 ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date AV27HoraR_0 ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date A10081Lb_hhent1 ;
   private java.util.Date W5568Lb_HoraEn ;
   private java.util.Date W5564Lb_HoraR ;
   private java.util.Date W10081Lb_hhent1 ;
   private java.util.Date W10082Lb_hhnoa1 ;
   private java.util.Date AV28Lb_FecNoa1 ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV26Fecha_0 ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6192Lb_FecPre ;
   private java.util.Date A6460Lb_FecEnt1 ;
   private java.util.Date A12526Lb_opFc ;
   private java.util.Date AV30Lb_fechae ;
   private java.util.Date W5567Lb_FechaEn ;
   private java.util.Date W5563Lb_FechaR ;
   private java.util.Date W6192Lb_FecPre ;
   private java.util.Date W6460Lb_FecEnt1 ;
   private java.util.Date W6461Lb_FecNoa1 ;
   private java.util.Date W12526Lb_opFc ;
   private boolean n6310Lb_TaAuxC ;
   private boolean n12525Lb_opSt ;
   private boolean n12526Lb_opFc ;
   private boolean n13459Lb_UltLinC ;
   private String A12731Lb_ObsFac ;
   private String A10822Lb_ObsCR ;
   private String W12731Lb_ObsFac ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01UD2_A396EmprCod ;
   private int[] P01UD2_A5532Lb_numero ;
   private java.util.Date[] P01UD2_A6461Lb_FecNoa1 ;
   private byte[] P01UD2_A5566Lb_Estado ;
   private java.util.Date[] P01UD2_A10082Lb_hhnoa1 ;
   private String[] P01UD2_A5555Lb_opcion ;
   private java.util.Date[] P01UD3_A5541Lb_FechaE ;
   private java.util.Date[] P01UD3_A5542Lb_HoraE ;
   private int[] P01UD3_A5532Lb_numero ;
   private String[] P01UD3_A396EmprCod ;
   private java.util.Date[] P01UD5_A5541Lb_FechaE ;
   private java.util.Date[] P01UD5_A5542Lb_HoraE ;
   private int[] P01UD5_A5532Lb_numero ;
   private String[] P01UD5_A396EmprCod ;
   private String[] P01UD6_A396EmprCod ;
   private int[] P01UD6_A5532Lb_numero ;
   private String[] P01UD6_A12731Lb_ObsFac ;
   private java.util.Date[] P01UD6_A12526Lb_opFc ;
   private boolean[] P01UD6_n12526Lb_opFc ;
   private String[] P01UD6_A12525Lb_opSt ;
   private boolean[] P01UD6_n12525Lb_opSt ;
   private java.util.Date[] P01UD6_A10082Lb_hhnoa1 ;
   private java.util.Date[] P01UD6_A10081Lb_hhent1 ;
   private String[] P01UD6_A6631Lb_ProvDef ;
   private java.util.Date[] P01UD6_A6461Lb_FecNoa1 ;
   private java.util.Date[] P01UD6_A6460Lb_FecEnt1 ;
   private java.util.Date[] P01UD6_A6192Lb_FecPre ;
   private java.math.BigDecimal[] P01UD6_A5989Lb_PreKg ;
   private byte[] P01UD6_A5718Lb_numop ;
   private java.util.Date[] P01UD6_A5568Lb_HoraEn ;
   private java.util.Date[] P01UD6_A5567Lb_FechaEn ;
   private byte[] P01UD6_A5566Lb_Estado ;
   private java.math.BigDecimal[] P01UD6_A5565Lb_CosteE ;
   private java.util.Date[] P01UD6_A5564Lb_HoraR ;
   private java.util.Date[] P01UD6_A5563Lb_FechaR ;
   private short[] P01UD6_A5559Lb_UltlP ;
   private short[] P01UD6_A5556Lb_UltLC ;
   private String[] P01UD6_A5555Lb_opcion ;
   private short[] P01UD6_A13459Lb_UltLinC ;
   private boolean[] P01UD6_n13459Lb_UltLinC ;
   private String[] P01UD6_A10822Lb_ObsCR ;
   private java.math.BigDecimal[] P01UD6_A10083Lb_PreMt ;
   private java.math.BigDecimal[] P01UD6_A1127Lb_CosteC ;
   private byte[] P01UD6_A8622Lb_IntCod ;
   private byte[] P01UD6_A7395Lb_NumAux ;
   private byte[] P01UD6_A6375Lb_famc3 ;
   private byte[] P01UD6_A6374Lb_famc2 ;
   private byte[] P01UD6_A6373Lb_famc1 ;
   private String[] P01UD6_A6310Lb_TaAuxC ;
   private boolean[] P01UD6_n6310Lb_TaAuxC ;
}

final  class pens014__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01UD2", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_Estado, Lb_hhnoa1, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01UD3", "SELECT Lb_FechaE, Lb_HoraE, Lb_numero, EmprCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01UD4", "INSERT INTO TXPENS002(EmprCod, Lb_numero, Lb_opcion, Lb_UltLC, Lb_UltlP, Lb_FechaR, Lb_HoraR, Lb_CosteE, Lb_Estado, Lb_FechaEn, Lb_HoraEn, Lb_numop, Lb_PreKg, Lb_FecPre, Lb_TaAuxC, Lb_famc1, Lb_famc2, Lb_famc3, Lb_FecEnt1, Lb_FecNoa1, Lb_ProvDef, Lb_hhent1, Lb_hhnoa1, Lb_opSt, Lb_opFc, Lb_ObsFac, Lb_NumAux, Lb_IntCod, Lb_CosteC, Lb_PreMt, Lb_ObsCR, Lb_UltLinC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new ForEachCursor("P01UD5", "SELECT Lb_FechaE, Lb_HoraE, Lb_numero, EmprCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01UD6", "SELECT EmprCod, Lb_numero, Lb_ObsFac, Lb_opFc, Lb_opSt, Lb_hhnoa1, Lb_hhent1, Lb_ProvDef, Lb_FecNoa1, Lb_FecEnt1, Lb_FecPre, Lb_PreKg, Lb_numop, Lb_HoraEn, Lb_FechaEn, Lb_Estado, Lb_CosteE, Lb_HoraR, Lb_FechaR, Lb_UltlP, Lb_UltLC, Lb_opcion, Lb_UltLinC, Lb_ObsCR, Lb_PreMt, Lb_CosteC, Lb_IntCod, Lb_NumAux, Lb_famc3, Lb_famc2, Lb_famc1, Lb_TaAuxC FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01UD7", "INSERT INTO TXPENS002(EmprCod, Lb_numero, Lb_opcion, Lb_UltLC, Lb_UltlP, Lb_FechaR, Lb_HoraR, Lb_CosteE, Lb_Estado, Lb_FechaEn, Lb_HoraEn, Lb_numop, Lb_PreKg, Lb_FecPre, Lb_TaAuxC, Lb_famc1, Lb_famc2, Lb_famc3, Lb_FecEnt1, Lb_FecNoa1, Lb_ProvDef, Lb_NumAux, Lb_IntCod, Lb_CosteC, Lb_hhent1, Lb_hhnoa1, Lb_PreMt, Lb_ObsCR, Lb_opSt, Lb_opFc, Lb_ObsFac, Lb_UltLinC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = GXutil.resetDate(rslt.getGXDateTime(2));
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = GXutil.resetDate(rslt.getGXDateTime(2));
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(14));
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,5);
               ((java.util.Date[]) buf[19])[0] = GXutil.resetDate(rslt.getGXDateTime(18));
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(19);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(24);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(25,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,5);
               ((byte[]) buf[29])[0] = rslt.getByte(27);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((byte[]) buf[31])[0] = rslt.getByte(29);
               ((byte[]) buf[32])[0] = rslt.getByte(30);
               ((byte[]) buf[33])[0] = rslt.getByte(31);
               ((String[]) buf[34])[0] = rslt.getString(32, 4);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDateTime(7, (java.util.Date)parms[6], true);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDateTime(11, (java.util.Date)parms[10], true);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setDate(14, (java.util.Date)parms[13]);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[15], 4);
               }
               stmt.setByte(16, ((Number) parms[16]).byteValue());
               stmt.setByte(17, ((Number) parms[17]).byteValue());
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setDate(19, (java.util.Date)parms[19]);
               stmt.setDate(20, (java.util.Date)parms[20]);
               stmt.setString(21, (String)parms[21], 1);
               stmt.setDateTime(22, (java.util.Date)parms[22], true);
               stmt.setDateTime(23, (java.util.Date)parms[23], true);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DATE );
               }
               else
               {
                  stmt.setDate(25, (java.util.Date)parms[27]);
               }
               stmt.setVarchar(26, (String)parms[28], 200, false);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDateTime(7, (java.util.Date)parms[6], true);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDateTime(11, (java.util.Date)parms[10], true);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setDate(14, (java.util.Date)parms[13]);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[15], 4);
               }
               stmt.setByte(16, ((Number) parms[16]).byteValue());
               stmt.setByte(17, ((Number) parms[17]).byteValue());
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setDate(19, (java.util.Date)parms[19]);
               stmt.setDate(20, (java.util.Date)parms[20]);
               stmt.setString(21, (String)parms[21], 1);
               stmt.setByte(22, ((Number) parms[22]).byteValue());
               stmt.setByte(23, ((Number) parms[23]).byteValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 5);
               stmt.setDateTime(25, (java.util.Date)parms[25], true);
               stmt.setDateTime(26, (java.util.Date)parms[26], true);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[27], 5);
               stmt.setVarchar(28, (String)parms[28], 300, false);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DATE );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[32]);
               }
               stmt.setVarchar(31, (String)parms[33], 200, false);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[35]).shortValue());
               }
               return;
      }
   }

}

