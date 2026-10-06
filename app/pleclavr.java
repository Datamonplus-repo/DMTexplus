package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pleclavr extends GXProcedure
{
   public pleclavr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pleclavr.class ), "" );
   }

   public pleclavr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pleclavr.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      pleclavr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pleclavr.this.A1166LecMaqCod = aP1[0];
      this.aP1 = aP1;
      pleclavr.this.AV21Lector = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Leclav = (byte)(0) ;
      AV21Lector = (byte)(1) ;
      /* Using cursor P027Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1166LecMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5966LecFasCodG = P027Q2_A5966LecFasCodG[0] ;
         n5966LecFasCodG = P027Q2_n5966LecFasCodG[0] ;
         A5967LecOpeCodG = P027Q2_A5967LecOpeCodG[0] ;
         n5967LecOpeCodG = P027Q2_n5967LecOpeCodG[0] ;
         A5968LecParCodG = P027Q2_A5968LecParCodG[0] ;
         n5968LecParCodG = P027Q2_n5968LecParCodG[0] ;
         A5969LecHorG = P027Q2_A5969LecHorG[0] ;
         n5969LecHorG = P027Q2_n5969LecHorG[0] ;
         A5970LecFecG = P027Q2_A5970LecFecG[0] ;
         n5970LecFecG = P027Q2_n5970LecFecG[0] ;
         A5971LecRecLMqG = P027Q2_A5971LecRecLMqG[0] ;
         n5971LecRecLMqG = P027Q2_n5971LecRecLMqG[0] ;
         A5972LecFinG = P027Q2_A5972LecFinG[0] ;
         n5972LecFinG = P027Q2_n5972LecFinG[0] ;
         A5965LecFasOrdG = P027Q2_A5965LecFasOrdG[0] ;
         A5964LecNumLotG = P027Q2_A5964LecNumLotG[0] ;
         A5963LecBarParG = P027Q2_A5963LecBarParG[0] ;
         A5962LecBarReoG = P027Q2_A5962LecBarReoG[0] ;
         A5961LecBarCodG = P027Q2_A5961LecBarCodG[0] ;
         AV8LECBARCODG = A5961LecBarCodG ;
         AV9Lecbarreog = A5962LecBarReoG ;
         AV10Lecbarparg = A5963LecBarParG ;
         AV11Lecnumlotg = A5964LecNumLotG ;
         AV12Lecfasordg = A5965LecFasOrdG ;
         AV13Lecfascodg = A5966LecFasCodG ;
         AV14Lecopecodg = A5967LecOpeCodG ;
         AV15Lecparcodg = A5968LecParCodG ;
         AV16Lechorg = A5969LecHorG ;
         AV17Lecfecg = A5970LecFecG ;
         AV18LECRECLMQG = A5971LecRecLMqG ;
         AV19LECFING = A5972LecFinG ;
         AV20Leclav = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV20Leclav == 1 )
      {
         /* Using cursor P027Q3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1166LecMaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1167LecBarCod = P027Q3_A1167LecBarCod[0] ;
            n1167LecBarCod = P027Q3_n1167LecBarCod[0] ;
            A1168LecBarReo = P027Q3_A1168LecBarReo[0] ;
            n1168LecBarReo = P027Q3_n1168LecBarReo[0] ;
            A1169LecBarPar = P027Q3_A1169LecBarPar[0] ;
            n1169LecBarPar = P027Q3_n1169LecBarPar[0] ;
            A4702LecNumLot = P027Q3_A4702LecNumLot[0] ;
            n4702LecNumLot = P027Q3_n4702LecNumLot[0] ;
            A1188LecFasOrd = P027Q3_A1188LecFasOrd[0] ;
            n1188LecFasOrd = P027Q3_n1188LecFasOrd[0] ;
            A1171LecFasCod = P027Q3_A1171LecFasCod[0] ;
            n1171LecFasCod = P027Q3_n1171LecFasCod[0] ;
            A1170LecOpeCod = P027Q3_A1170LecOpeCod[0] ;
            n1170LecOpeCod = P027Q3_n1170LecOpeCod[0] ;
            A1172LecParCod = P027Q3_A1172LecParCod[0] ;
            n1172LecParCod = P027Q3_n1172LecParCod[0] ;
            A1173LecHor = P027Q3_A1173LecHor[0] ;
            n1173LecHor = P027Q3_n1173LecHor[0] ;
            A1174LecFec = P027Q3_A1174LecFec[0] ;
            n1174LecFec = P027Q3_n1174LecFec[0] ;
            A4703LecRecLinM = P027Q3_A4703LecRecLinM[0] ;
            n4703LecRecLinM = P027Q3_n4703LecRecLinM[0] ;
            A4345LecCombin = P027Q3_A4345LecCombin[0] ;
            n4345LecCombin = P027Q3_n4345LecCombin[0] ;
            AV21Lector = (byte)(1) ;
            A1167LecBarCod = AV8LECBARCODG ;
            n1167LecBarCod = false ;
            A1168LecBarReo = AV9Lecbarreog ;
            n1168LecBarReo = false ;
            A1169LecBarPar = AV10Lecbarparg ;
            n1169LecBarPar = false ;
            A4702LecNumLot = AV11Lecnumlotg ;
            n4702LecNumLot = false ;
            A1188LecFasOrd = AV12Lecfasordg ;
            n1188LecFasOrd = false ;
            A1171LecFasCod = AV13Lecfascodg ;
            n1171LecFasCod = false ;
            A1170LecOpeCod = AV14Lecopecodg ;
            n1170LecOpeCod = false ;
            A1172LecParCod = AV15Lecparcodg ;
            n1172LecParCod = false ;
            A1173LecHor = AV16Lechorg ;
            n1173LecHor = false ;
            A1174LecFec = AV17Lecfecg ;
            n1174LecFec = false ;
            A4703LecRecLinM = AV18LECRECLMQG ;
            n4703LecRecLinM = false ;
            A4345LecCombin = AV19LECFING ;
            n4345LecCombin = false ;
            /* Using cursor P027Q4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n1167LecBarCod), Integer.valueOf(A1167LecBarCod), Boolean.valueOf(n1168LecBarReo), Byte.valueOf(A1168LecBarReo), Boolean.valueOf(n1169LecBarPar), A1169LecBarPar, Boolean.valueOf(n4702LecNumLot), Integer.valueOf(A4702LecNumLot), Boolean.valueOf(n1188LecFasOrd), Short.valueOf(A1188LecFasOrd), Boolean.valueOf(n1171LecFasCod), A1171LecFasCod, Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(A1170LecOpeCod), Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod), Boolean.valueOf(n1173LecHor), A1173LecHor, Boolean.valueOf(n1174LecFec), A1174LecFec, Boolean.valueOf(n4703LecRecLinM), Short.valueOf(A4703LecRecLinM), Boolean.valueOf(n4345LecCombin), A4345LecCombin, A396EmprCod, A1166LecMaqCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P027Q5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A1166LecMaqCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1173LecHor = P027Q5_A1173LecHor[0] ;
            n1173LecHor = P027Q5_n1173LecHor[0] ;
            /* Using cursor P027Q6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A1166LecMaqCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
            AV21Lector = (byte)(0) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pleclavr.this.A396EmprCod;
      this.aP1[0] = pleclavr.this.A1166LecMaqCod;
      this.aP2[0] = pleclavr.this.AV21Lector;
      Application.commitDataStores(context, remoteHandle, pr_default, "pleclavr");
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
      P027Q2_A396EmprCod = new String[] {""} ;
      P027Q2_A1166LecMaqCod = new String[] {""} ;
      P027Q2_A5966LecFasCodG = new String[] {""} ;
      P027Q2_n5966LecFasCodG = new boolean[] {false} ;
      P027Q2_A5967LecOpeCodG = new int[1] ;
      P027Q2_n5967LecOpeCodG = new boolean[] {false} ;
      P027Q2_A5968LecParCodG = new short[1] ;
      P027Q2_n5968LecParCodG = new boolean[] {false} ;
      P027Q2_A5969LecHorG = new String[] {""} ;
      P027Q2_n5969LecHorG = new boolean[] {false} ;
      P027Q2_A5970LecFecG = new java.util.Date[] {GXutil.nullDate()} ;
      P027Q2_n5970LecFecG = new boolean[] {false} ;
      P027Q2_A5971LecRecLMqG = new short[1] ;
      P027Q2_n5971LecRecLMqG = new boolean[] {false} ;
      P027Q2_A5972LecFinG = new String[] {""} ;
      P027Q2_n5972LecFinG = new boolean[] {false} ;
      P027Q2_A5965LecFasOrdG = new short[1] ;
      P027Q2_A5964LecNumLotG = new int[1] ;
      P027Q2_A5963LecBarParG = new String[] {""} ;
      P027Q2_A5962LecBarReoG = new byte[1] ;
      P027Q2_A5961LecBarCodG = new int[1] ;
      A5966LecFasCodG = "" ;
      A5969LecHorG = "" ;
      A5970LecFecG = GXutil.nullDate() ;
      A5972LecFinG = "" ;
      A5963LecBarParG = "" ;
      AV10Lecbarparg = "" ;
      AV13Lecfascodg = "" ;
      AV16Lechorg = "" ;
      AV17Lecfecg = GXutil.nullDate() ;
      AV19LECFING = "" ;
      P027Q3_A396EmprCod = new String[] {""} ;
      P027Q3_A1166LecMaqCod = new String[] {""} ;
      P027Q3_A1167LecBarCod = new int[1] ;
      P027Q3_n1167LecBarCod = new boolean[] {false} ;
      P027Q3_A1168LecBarReo = new byte[1] ;
      P027Q3_n1168LecBarReo = new boolean[] {false} ;
      P027Q3_A1169LecBarPar = new String[] {""} ;
      P027Q3_n1169LecBarPar = new boolean[] {false} ;
      P027Q3_A4702LecNumLot = new int[1] ;
      P027Q3_n4702LecNumLot = new boolean[] {false} ;
      P027Q3_A1188LecFasOrd = new short[1] ;
      P027Q3_n1188LecFasOrd = new boolean[] {false} ;
      P027Q3_A1171LecFasCod = new String[] {""} ;
      P027Q3_n1171LecFasCod = new boolean[] {false} ;
      P027Q3_A1170LecOpeCod = new int[1] ;
      P027Q3_n1170LecOpeCod = new boolean[] {false} ;
      P027Q3_A1172LecParCod = new short[1] ;
      P027Q3_n1172LecParCod = new boolean[] {false} ;
      P027Q3_A1173LecHor = new String[] {""} ;
      P027Q3_n1173LecHor = new boolean[] {false} ;
      P027Q3_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P027Q3_n1174LecFec = new boolean[] {false} ;
      P027Q3_A4703LecRecLinM = new short[1] ;
      P027Q3_n4703LecRecLinM = new boolean[] {false} ;
      P027Q3_A4345LecCombin = new String[] {""} ;
      P027Q3_n4345LecCombin = new boolean[] {false} ;
      A1169LecBarPar = "" ;
      A1171LecFasCod = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A4345LecCombin = "" ;
      P027Q5_A396EmprCod = new String[] {""} ;
      P027Q5_A1166LecMaqCod = new String[] {""} ;
      P027Q5_A1173LecHor = new String[] {""} ;
      P027Q5_n1173LecHor = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pleclavr__default(),
         new Object[] {
             new Object[] {
            P027Q2_A396EmprCod, P027Q2_A1166LecMaqCod, P027Q2_A5966LecFasCodG, P027Q2_n5966LecFasCodG, P027Q2_A5967LecOpeCodG, P027Q2_n5967LecOpeCodG, P027Q2_A5968LecParCodG, P027Q2_n5968LecParCodG, P027Q2_A5969LecHorG, P027Q2_n5969LecHorG,
            P027Q2_A5970LecFecG, P027Q2_n5970LecFecG, P027Q2_A5971LecRecLMqG, P027Q2_n5971LecRecLMqG, P027Q2_A5972LecFinG, P027Q2_n5972LecFinG, P027Q2_A5965LecFasOrdG, P027Q2_A5964LecNumLotG, P027Q2_A5963LecBarParG, P027Q2_A5962LecBarReoG,
            P027Q2_A5961LecBarCodG
            }
            , new Object[] {
            P027Q3_A396EmprCod, P027Q3_A1166LecMaqCod, P027Q3_A1167LecBarCod, P027Q3_n1167LecBarCod, P027Q3_A1168LecBarReo, P027Q3_n1168LecBarReo, P027Q3_A1169LecBarPar, P027Q3_n1169LecBarPar, P027Q3_A4702LecNumLot, P027Q3_n4702LecNumLot,
            P027Q3_A1188LecFasOrd, P027Q3_n1188LecFasOrd, P027Q3_A1171LecFasCod, P027Q3_n1171LecFasCod, P027Q3_A1170LecOpeCod, P027Q3_n1170LecOpeCod, P027Q3_A1172LecParCod, P027Q3_n1172LecParCod, P027Q3_A1173LecHor, P027Q3_n1173LecHor,
            P027Q3_A1174LecFec, P027Q3_n1174LecFec, P027Q3_A4703LecRecLinM, P027Q3_n4703LecRecLinM, P027Q3_A4345LecCombin, P027Q3_n4345LecCombin
            }
            , new Object[] {
            }
            , new Object[] {
            P027Q5_A396EmprCod, P027Q5_A1166LecMaqCod, P027Q5_A1173LecHor, P027Q5_n1173LecHor
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21Lector ;
   private byte AV20Leclav ;
   private byte A5962LecBarReoG ;
   private byte AV9Lecbarreog ;
   private byte A1168LecBarReo ;
   private short A5968LecParCodG ;
   private short A5971LecRecLMqG ;
   private short A5965LecFasOrdG ;
   private short AV12Lecfasordg ;
   private short AV15Lecparcodg ;
   private short AV18LECRECLMQG ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short A4703LecRecLinM ;
   private short Gx_err ;
   private int A5967LecOpeCodG ;
   private int A5964LecNumLotG ;
   private int A5961LecBarCodG ;
   private int AV8LECBARCODG ;
   private int AV11Lecnumlotg ;
   private int AV14Lecopecodg ;
   private int A1167LecBarCod ;
   private int A4702LecNumLot ;
   private int A1170LecOpeCod ;
   private String A396EmprCod ;
   private String A1166LecMaqCod ;
   private String scmdbuf ;
   private String A5966LecFasCodG ;
   private String A5969LecHorG ;
   private String A5972LecFinG ;
   private String A5963LecBarParG ;
   private String AV10Lecbarparg ;
   private String AV13Lecfascodg ;
   private String AV16Lechorg ;
   private String AV19LECFING ;
   private String A1169LecBarPar ;
   private String A1171LecFasCod ;
   private String A1173LecHor ;
   private String A4345LecCombin ;
   private java.util.Date A5970LecFecG ;
   private java.util.Date AV17Lecfecg ;
   private java.util.Date A1174LecFec ;
   private boolean n5966LecFasCodG ;
   private boolean n5967LecOpeCodG ;
   private boolean n5968LecParCodG ;
   private boolean n5969LecHorG ;
   private boolean n5970LecFecG ;
   private boolean n5971LecRecLMqG ;
   private boolean n5972LecFinG ;
   private boolean n1167LecBarCod ;
   private boolean n1168LecBarReo ;
   private boolean n1169LecBarPar ;
   private boolean n4702LecNumLot ;
   private boolean n1188LecFasOrd ;
   private boolean n1171LecFasCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1172LecParCod ;
   private boolean n1173LecHor ;
   private boolean n1174LecFec ;
   private boolean n4703LecRecLinM ;
   private boolean n4345LecCombin ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P027Q2_A396EmprCod ;
   private String[] P027Q2_A1166LecMaqCod ;
   private String[] P027Q2_A5966LecFasCodG ;
   private boolean[] P027Q2_n5966LecFasCodG ;
   private int[] P027Q2_A5967LecOpeCodG ;
   private boolean[] P027Q2_n5967LecOpeCodG ;
   private short[] P027Q2_A5968LecParCodG ;
   private boolean[] P027Q2_n5968LecParCodG ;
   private String[] P027Q2_A5969LecHorG ;
   private boolean[] P027Q2_n5969LecHorG ;
   private java.util.Date[] P027Q2_A5970LecFecG ;
   private boolean[] P027Q2_n5970LecFecG ;
   private short[] P027Q2_A5971LecRecLMqG ;
   private boolean[] P027Q2_n5971LecRecLMqG ;
   private String[] P027Q2_A5972LecFinG ;
   private boolean[] P027Q2_n5972LecFinG ;
   private short[] P027Q2_A5965LecFasOrdG ;
   private int[] P027Q2_A5964LecNumLotG ;
   private String[] P027Q2_A5963LecBarParG ;
   private byte[] P027Q2_A5962LecBarReoG ;
   private int[] P027Q2_A5961LecBarCodG ;
   private String[] P027Q3_A396EmprCod ;
   private String[] P027Q3_A1166LecMaqCod ;
   private int[] P027Q3_A1167LecBarCod ;
   private boolean[] P027Q3_n1167LecBarCod ;
   private byte[] P027Q3_A1168LecBarReo ;
   private boolean[] P027Q3_n1168LecBarReo ;
   private String[] P027Q3_A1169LecBarPar ;
   private boolean[] P027Q3_n1169LecBarPar ;
   private int[] P027Q3_A4702LecNumLot ;
   private boolean[] P027Q3_n4702LecNumLot ;
   private short[] P027Q3_A1188LecFasOrd ;
   private boolean[] P027Q3_n1188LecFasOrd ;
   private String[] P027Q3_A1171LecFasCod ;
   private boolean[] P027Q3_n1171LecFasCod ;
   private int[] P027Q3_A1170LecOpeCod ;
   private boolean[] P027Q3_n1170LecOpeCod ;
   private short[] P027Q3_A1172LecParCod ;
   private boolean[] P027Q3_n1172LecParCod ;
   private String[] P027Q3_A1173LecHor ;
   private boolean[] P027Q3_n1173LecHor ;
   private java.util.Date[] P027Q3_A1174LecFec ;
   private boolean[] P027Q3_n1174LecFec ;
   private short[] P027Q3_A4703LecRecLinM ;
   private boolean[] P027Q3_n4703LecRecLinM ;
   private String[] P027Q3_A4345LecCombin ;
   private boolean[] P027Q3_n4345LecCombin ;
   private String[] P027Q5_A396EmprCod ;
   private String[] P027Q5_A1166LecMaqCod ;
   private String[] P027Q5_A1173LecHor ;
   private boolean[] P027Q5_n1173LecHor ;
}

final  class pleclavr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027Q2", "SELECT * FROM (SELECT EmprCod, LecMaqCod, LecFasCodG, LecOpeCodG, LecParCodG, LecHorG, LecFecG, LecRecLMqG, LecFinG, LecFasOrdG, LecNumLotG, LecBarParG, LecBarReoG, LecBarCodG FROM TXPLECLAV WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod, LecBarCodG DESC, LecBarReoG DESC, LecBarParG DESC, LecNumLotG DESC, LecFasOrdG DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P027Q3", "SELECT EmprCod, LecMaqCod, LecBarCod, LecBarReo, LecBarPar, LecNumLot, LecFasOrd, LecFasCod, LecOpeCod, LecParCod, LecHor, LecFec, LecRecLinM, LecCombin FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P027Q4", "UPDATE TXPLECTOR SET LecBarCod=?, LecBarReo=?, LecBarPar=?, LecNumLot=?, LecFasOrd=?, LecFasCod=?, LecOpeCod=?, LecParCod=?, LecHor=?, LecFec=?, LecRecLinM=?, LecCombin=?  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
         ,new ForEachCursor("P027Q5", "SELECT EmprCod, LecMaqCod, LecHor FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P027Q6", "DELETE FROM TXPLECTOR  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 2);
               }
               stmt.setString(13, (String)parms[24], 3);
               stmt.setString(14, (String)parms[25], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

