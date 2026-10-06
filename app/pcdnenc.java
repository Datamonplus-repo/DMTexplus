package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcdnenc extends GXProcedure
{
   public pcdnenc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcdnenc.class ), "" );
   }

   public pcdnenc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pcdnenc.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pcdnenc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcdnenc.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcdnenc.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcdnenc.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcdnenc.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcdnenc.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8VarMsg = "" ;
      /* Using cursor P05962 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4466BarAcaAnh = P05962_A4466BarAcaAnh[0] ;
         A4466BarAcaAnh = P05962_A4466BarAcaAnh[0] ;
         AV9CdnEnc = A4466BarAcaAnh ;
         if ( AV9CdnEnc > 0 )
         {
            /* Using cursor P05963 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A872RecPrdNum = P05963_A872RecPrdNum[0] ;
               A875RecPrdDsc = P05963_A875RecPrdDsc[0] ;
               A1273RecLinPro = P05963_A1273RecLinPro[0] ;
               A811RecLin = P05963_A811RecLin[0] ;
               AV10RecPrdNum = A872RecPrdNum ;
               /* Execute user subroutine: 'CONTROL' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV12CdnEncctrl == 1 )
               {
                  if ( (GXutil.strcmp("", AV8VarMsg)==0) )
                  {
                     AV8VarMsg = GXutil.trim( A872RecPrdNum) + " " + GXutil.trim( A875RecPrdDsc) + httpContext.getMessage( " Codigo ", "") + GXutil.trim( GXutil.str( AV9CdnEnc, 4, 0)) + " " + GXutil.trim( AV11Tb1_Dsc) + GXutil.newLine( ) ;
                  }
                  else
                  {
                     AV8VarMsg += GXutil.trim( A872RecPrdNum) + " " + GXutil.trim( A875RecPrdDsc) + httpContext.getMessage( " Codigo  ", "") + GXutil.trim( GXutil.str( AV9CdnEnc, 4, 0)) + " " + GXutil.trim( AV11Tb1_Dsc) + GXutil.newLine( ) ;
                  }
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P05964 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P05964_A361DisCod[0] ;
         A361DisCod = P05964_A361DisCod[0] ;
         AV13Discod = A361DisCod ;
         /* Using cursor P05965 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A872RecPrdNum = P05965_A872RecPrdNum[0] ;
            A875RecPrdDsc = P05965_A875RecPrdDsc[0] ;
            A1273RecLinPro = P05965_A1273RecLinPro[0] ;
            A811RecLin = P05965_A811RecLin[0] ;
            AV10RecPrdNum = A872RecPrdNum ;
            AV17RecPrdDsc = A875RecPrdDsc ;
            /* Execute user subroutine: 'NORMAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'NORMAS' Routine */
      returnInSub = false ;
      AV14PrdNorm = (short)(0) ;
      /* Using cursor P05966 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV13Discod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A361DisCod = P05966_A361DisCod[0] ;
         A13216DisNormDsc = P05966_A13216DisNormDsc[0] ;
         n13216DisNormDsc = P05966_n13216DisNormDsc[0] ;
         A13214DisNormSt = P05966_A13214DisNormSt[0] ;
         A13213DisNormID = P05966_A13213DisNormID[0] ;
         A13216DisNormDsc = P05966_A13216DisNormDsc[0] ;
         n13216DisNormDsc = P05966_n13216DisNormDsc[0] ;
         AV15DisNormID = A13213DisNormID ;
         AV16DisNormDsc = A13216DisNormDsc ;
         if ( GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Execute user subroutine: 'PRDNORMAS' */
            S126 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(4);
               returnInSub = true;
               if (true) return;
            }
            if ( AV14PrdNorm == 1 )
            {
               if ( (GXutil.strcmp("", AV8VarMsg)==0) )
               {
                  AV8VarMsg = GXutil.trim( AV10RecPrdNum) + " " + GXutil.trim( AV17RecPrdDsc) + httpContext.getMessage( " Norma ", "") + A13213DisNormID + " " + GXutil.trim( A13216DisNormDsc) + GXutil.newLine( ) ;
               }
               else
               {
                  AV8VarMsg += GXutil.trim( AV10RecPrdNum) + " " + GXutil.trim( AV17RecPrdDsc) + httpContext.getMessage( " Norma ", "") + A13213DisNormID + " " + GXutil.trim( A13216DisNormDsc) + GXutil.newLine( ) ;
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S126( )
   {
      /* 'PRDNORMAS' Routine */
      returnInSub = false ;
      AV14PrdNorm = (short)(0) ;
      /* Using cursor P05967 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV10RecPrdNum, AV15DisNormID});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A13217NormaID = P05967_A13217NormaID[0] ;
         A719PrdNum = P05967_A719PrdNum[0] ;
         AV14PrdNorm = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S131( )
   {
      /* 'CONTROL' Routine */
      returnInSub = false ;
      AV11Tb1_Dsc = "" ;
      AV12CdnEncctrl = (byte)(0) ;
      /* Using cursor P05968 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV10RecPrdNum, Short.valueOf(AV9CdnEnc)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A9713Tb1_Cod = P05968_A9713Tb1_Cod[0] ;
         A719PrdNum = P05968_A719PrdNum[0] ;
         A9715Tb1_Dsc = P05968_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P05968_n9715Tb1_Dsc[0] ;
         A9715Tb1_Dsc = P05968_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P05968_n9715Tb1_Dsc[0] ;
         AV11Tb1_Dsc = A9715Tb1_Dsc ;
         AV12CdnEncctrl = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcdnenc.this.A396EmprCod;
      this.aP1[0] = pcdnenc.this.A129BarCod;
      this.aP2[0] = pcdnenc.this.A132BarCodReo;
      this.aP3[0] = pcdnenc.this.A130BarCodPar;
      this.aP4[0] = pcdnenc.this.A2804RecLinMaq;
      this.aP5[0] = pcdnenc.this.AV8VarMsg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8VarMsg = "" ;
      scmdbuf = "" ;
      P05962_A396EmprCod = new String[] {""} ;
      P05962_A129BarCod = new int[1] ;
      P05962_A132BarCodReo = new byte[1] ;
      P05962_A130BarCodPar = new String[] {""} ;
      P05962_A2804RecLinMaq = new short[1] ;
      P05962_A4466BarAcaAnh = new short[1] ;
      P05963_A396EmprCod = new String[] {""} ;
      P05963_A129BarCod = new int[1] ;
      P05963_A132BarCodReo = new byte[1] ;
      P05963_A130BarCodPar = new String[] {""} ;
      P05963_A2804RecLinMaq = new short[1] ;
      P05963_A872RecPrdNum = new String[] {""} ;
      P05963_A875RecPrdDsc = new String[] {""} ;
      P05963_A1273RecLinPro = new byte[1] ;
      P05963_A811RecLin = new short[1] ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      AV10RecPrdNum = "" ;
      AV11Tb1_Dsc = "" ;
      P05964_A396EmprCod = new String[] {""} ;
      P05964_A129BarCod = new int[1] ;
      P05964_A132BarCodReo = new byte[1] ;
      P05964_A130BarCodPar = new String[] {""} ;
      P05964_A2804RecLinMaq = new short[1] ;
      P05964_A361DisCod = new int[1] ;
      P05965_A396EmprCod = new String[] {""} ;
      P05965_A129BarCod = new int[1] ;
      P05965_A132BarCodReo = new byte[1] ;
      P05965_A130BarCodPar = new String[] {""} ;
      P05965_A2804RecLinMaq = new short[1] ;
      P05965_A872RecPrdNum = new String[] {""} ;
      P05965_A875RecPrdDsc = new String[] {""} ;
      P05965_A1273RecLinPro = new byte[1] ;
      P05965_A811RecLin = new short[1] ;
      AV17RecPrdDsc = "" ;
      P05966_A396EmprCod = new String[] {""} ;
      P05966_A361DisCod = new int[1] ;
      P05966_A13216DisNormDsc = new String[] {""} ;
      P05966_n13216DisNormDsc = new boolean[] {false} ;
      P05966_A13214DisNormSt = new String[] {""} ;
      P05966_A13213DisNormID = new String[] {""} ;
      A13216DisNormDsc = "" ;
      A13214DisNormSt = "" ;
      A13213DisNormID = "" ;
      AV15DisNormID = "" ;
      AV16DisNormDsc = "" ;
      P05967_A396EmprCod = new String[] {""} ;
      P05967_A13217NormaID = new String[] {""} ;
      P05967_A719PrdNum = new String[] {""} ;
      A13217NormaID = "" ;
      A719PrdNum = "" ;
      P05968_A396EmprCod = new String[] {""} ;
      P05968_A9713Tb1_Cod = new short[1] ;
      P05968_A719PrdNum = new String[] {""} ;
      P05968_A9715Tb1_Dsc = new String[] {""} ;
      P05968_n9715Tb1_Dsc = new boolean[] {false} ;
      A9715Tb1_Dsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcdnenc__default(),
         new Object[] {
             new Object[] {
            P05962_A396EmprCod, P05962_A129BarCod, P05962_A132BarCodReo, P05962_A130BarCodPar, P05962_A2804RecLinMaq, P05962_A4466BarAcaAnh
            }
            , new Object[] {
            P05963_A396EmprCod, P05963_A129BarCod, P05963_A132BarCodReo, P05963_A130BarCodPar, P05963_A2804RecLinMaq, P05963_A872RecPrdNum, P05963_A875RecPrdDsc, P05963_A1273RecLinPro, P05963_A811RecLin
            }
            , new Object[] {
            P05964_A396EmprCod, P05964_A129BarCod, P05964_A132BarCodReo, P05964_A130BarCodPar, P05964_A2804RecLinMaq, P05964_A361DisCod
            }
            , new Object[] {
            P05965_A396EmprCod, P05965_A129BarCod, P05965_A132BarCodReo, P05965_A130BarCodPar, P05965_A2804RecLinMaq, P05965_A872RecPrdNum, P05965_A875RecPrdDsc, P05965_A1273RecLinPro, P05965_A811RecLin
            }
            , new Object[] {
            P05966_A396EmprCod, P05966_A361DisCod, P05966_A13216DisNormDsc, P05966_n13216DisNormDsc, P05966_A13214DisNormSt, P05966_A13213DisNormID
            }
            , new Object[] {
            P05967_A396EmprCod, P05967_A13217NormaID, P05967_A719PrdNum
            }
            , new Object[] {
            P05968_A396EmprCod, P05968_A9713Tb1_Cod, P05968_A719PrdNum, P05968_A9715Tb1_Dsc, P05968_n9715Tb1_Dsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV12CdnEncctrl ;
   private short A2804RecLinMaq ;
   private short A4466BarAcaAnh ;
   private short AV9CdnEnc ;
   private short A811RecLin ;
   private short AV14PrdNorm ;
   private short A9713Tb1_Cod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV13Discod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String AV10RecPrdNum ;
   private String AV11Tb1_Dsc ;
   private String AV17RecPrdDsc ;
   private String A13216DisNormDsc ;
   private String A13214DisNormSt ;
   private String A13213DisNormID ;
   private String AV15DisNormID ;
   private String AV16DisNormDsc ;
   private String A13217NormaID ;
   private String A719PrdNum ;
   private String A9715Tb1_Dsc ;
   private boolean returnInSub ;
   private boolean n13216DisNormDsc ;
   private boolean n9715Tb1_Dsc ;
   private String AV8VarMsg ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05962_A396EmprCod ;
   private int[] P05962_A129BarCod ;
   private byte[] P05962_A132BarCodReo ;
   private String[] P05962_A130BarCodPar ;
   private short[] P05962_A2804RecLinMaq ;
   private short[] P05962_A4466BarAcaAnh ;
   private String[] P05963_A396EmprCod ;
   private int[] P05963_A129BarCod ;
   private byte[] P05963_A132BarCodReo ;
   private String[] P05963_A130BarCodPar ;
   private short[] P05963_A2804RecLinMaq ;
   private String[] P05963_A872RecPrdNum ;
   private String[] P05963_A875RecPrdDsc ;
   private byte[] P05963_A1273RecLinPro ;
   private short[] P05963_A811RecLin ;
   private String[] P05964_A396EmprCod ;
   private int[] P05964_A129BarCod ;
   private byte[] P05964_A132BarCodReo ;
   private String[] P05964_A130BarCodPar ;
   private short[] P05964_A2804RecLinMaq ;
   private int[] P05964_A361DisCod ;
   private String[] P05965_A396EmprCod ;
   private int[] P05965_A129BarCod ;
   private byte[] P05965_A132BarCodReo ;
   private String[] P05965_A130BarCodPar ;
   private short[] P05965_A2804RecLinMaq ;
   private String[] P05965_A872RecPrdNum ;
   private String[] P05965_A875RecPrdDsc ;
   private byte[] P05965_A1273RecLinPro ;
   private short[] P05965_A811RecLin ;
   private String[] P05966_A396EmprCod ;
   private int[] P05966_A361DisCod ;
   private String[] P05966_A13216DisNormDsc ;
   private boolean[] P05966_n13216DisNormDsc ;
   private String[] P05966_A13214DisNormSt ;
   private String[] P05966_A13213DisNormID ;
   private String[] P05967_A396EmprCod ;
   private String[] P05967_A13217NormaID ;
   private String[] P05967_A719PrdNum ;
   private String[] P05968_A396EmprCod ;
   private short[] P05968_A9713Tb1_Cod ;
   private String[] P05968_A719PrdNum ;
   private String[] P05968_A9715Tb1_Dsc ;
   private boolean[] P05968_n9715Tb1_Dsc ;
}

final  class pcdnenc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05962", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.BarAcaAnh FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05963", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecPrdNum, RecPrdDsc, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05964", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.DisCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05965", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecPrdNum, RecPrdDsc, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05966", "SELECT T1.EmprCod, T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.DisNormSt, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05967", "SELECT EmprCod, NormaID, PrdNum FROM TXPPrdNor WHERE EmprCod = ? and PrdNum = ? and NormaID = ? ORDER BY EmprCod, PrdNum, NormaID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05968", "SELECT T1.EmprCod, T1.Tb1_Cod, T1.PrdNum, T2.Tb1_Dsc FROM (TXPCdnEnc T1 INNER JOIN TXPTABLE1 T2 ON T2.EmprCod = T1.EmprCod AND T2.Tb1_Cod = T1.Tb1_Cod) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.Tb1_Cod = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.Tb1_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 80);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

