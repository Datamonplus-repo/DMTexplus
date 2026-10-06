package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewtxb extends GXProcedure
{
   public pnewtxb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewtxb.class ), "" );
   }

   public pnewtxb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 )
   {
      pnewtxb.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pnewtxb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewtxb.this.AV8AlbProCod = aP1[0];
      this.aP1 = aP1;
      pnewtxb.this.AV9BarCod = aP2[0];
      this.aP2 = aP2;
      pnewtxb.this.AV10BarCodReo = aP3[0];
      this.aP3 = aP3;
      pnewtxb.this.AV11BarCodPar = aP4[0];
      this.aP4 = aP4;
      pnewtxb.this.AV12TipCon = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00JW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV12TipCon)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A996TipCon = P00JW2_A996TipCon[0] ;
         A3098TipConPre = P00JW2_A3098TipConPre[0] ;
         n3098TipConPre = P00JW2_n3098TipConPre[0] ;
         A997TipConDsc = P00JW2_A997TipConDsc[0] ;
         n997TipConDsc = P00JW2_n997TipConDsc[0] ;
         AV13TipConPre = A3098TipConPre ;
         AV15TipConDsc = A997TipConDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00JW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(AV8AlbProCod), Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P00JW3_A252CliCod[0] ;
         n252CliCod = P00JW3_n252CliCod[0] ;
         A1265BarAlbPie = P00JW3_A1265BarAlbPie[0] ;
         A3915EmpNumDec = P00JW3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00JW3_n3915EmpNumDec[0] ;
         A130BarCodPar = P00JW3_A130BarCodPar[0] ;
         A132BarCodReo = P00JW3_A132BarCodReo[0] ;
         A129BarCod = P00JW3_A129BarCod[0] ;
         A30AlbProCod = P00JW3_A30AlbProCod[0] ;
         A3310BarFac = P00JW3_A3310BarFac[0] ;
         A272CliEti = P00JW3_A272CliEti[0] ;
         A3915EmpNumDec = P00JW3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00JW3_n3915EmpNumDec[0] ;
         A252CliCod = P00JW3_A252CliCod[0] ;
         n252CliCod = P00JW3_n252CliCod[0] ;
         A3310BarFac = P00JW3_A3310BarFac[0] ;
         A272CliEti = P00JW3_A272CliEti[0] ;
         AV19BarFac = A3310BarFac ;
         AV16FacCono = "1" ;
         if ( GXutil.strcmp(A272CliEti, httpContext.getMessage( "N", "")) == 0 )
         {
            AV16FacCono = "2" ;
         }
         /*
            INSERT RECORD ON TABLE TXPALBTXT

         */
         A2764AlbHdrLin = (short)(1) ;
         A2765AlbHdrTxt = AV15TipConDsc ;
         A2769AlbHdrPMt = AV13TipConPre ;
         A2770ALbHdrMts = DecimalUtil.doubleToDec(A1265BarAlbPie) ;
         if ( A3915EmpNumDec == 0 )
         {
            A2771ALbHdrImp = GXutil.roundDecimal( DecimalUtil.doubleToDec(A1265BarAlbPie).multiply(AV13TipConPre), 0) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               A2771ALbHdrImp = GXutil.roundDecimal( DecimalUtil.doubleToDec(A1265BarAlbPie).multiply(AV13TipConPre), 2) ;
            }
         }
         A2772AlbHdrTip = AV16FacCono ;
         if ( GXutil.strcmp(AV19BarFac, httpContext.getMessage( "N", "")) == 0 )
         {
            A2769AlbHdrPMt = DecimalUtil.ZERO ;
            A2771ALbHdrImp = DecimalUtil.ZERO ;
         }
         /* Using cursor P00JW4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin), A2765AlbHdrTxt, A2769AlbHdrPMt, A2770ALbHdrMts, A2771ALbHdrImp, A2772AlbHdrTip});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P00JW5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A396EmprCod = P00JW5_A396EmprCod[0] ;
               A30AlbProCod = P00JW5_A30AlbProCod[0] ;
               A129BarCod = P00JW5_A129BarCod[0] ;
               A132BarCodReo = P00JW5_A132BarCodReo[0] ;
               A130BarCodPar = P00JW5_A130BarCodPar[0] ;
               A2764AlbHdrLin = P00JW5_A2764AlbHdrLin[0] ;
               A2765AlbHdrTxt = P00JW5_A2765AlbHdrTxt[0] ;
               A2769AlbHdrPMt = P00JW5_A2769AlbHdrPMt[0] ;
               A2770ALbHdrMts = P00JW5_A2770ALbHdrMts[0] ;
               A2771ALbHdrImp = P00JW5_A2771ALbHdrImp[0] ;
               A2772AlbHdrTip = P00JW5_A2772AlbHdrTip[0] ;
               A2765AlbHdrTxt = AV15TipConDsc ;
               A2769AlbHdrPMt = AV13TipConPre ;
               A2770ALbHdrMts = DecimalUtil.doubleToDec(A1265BarAlbPie) ;
               if ( A3915EmpNumDec == 0 )
               {
                  A2771ALbHdrImp = GXutil.roundDecimal( DecimalUtil.doubleToDec(A1265BarAlbPie).multiply(AV13TipConPre), 0) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     A2771ALbHdrImp = GXutil.roundDecimal( DecimalUtil.doubleToDec(A1265BarAlbPie).multiply(AV13TipConPre), 2) ;
                  }
               }
               A2772AlbHdrTip = AV16FacCono ;
               if ( GXutil.strcmp(AV19BarFac, httpContext.getMessage( "N", "")) == 0 )
               {
                  A2769AlbHdrPMt = DecimalUtil.ZERO ;
                  A2771ALbHdrImp = DecimalUtil.ZERO ;
               }
               /* Using cursor P00JW6 */
               pr_default.execute(4, new Object[] {A2765AlbHdrTxt, A2769AlbHdrPMt, A2770ALbHdrMts, A2771ALbHdrImp, A2772AlbHdrTip, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewtxb.this.A396EmprCod;
      this.aP1[0] = pnewtxb.this.AV8AlbProCod;
      this.aP2[0] = pnewtxb.this.AV9BarCod;
      this.aP3[0] = pnewtxb.this.AV10BarCodReo;
      this.aP4[0] = pnewtxb.this.AV11BarCodPar;
      this.aP5[0] = pnewtxb.this.AV12TipCon;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewtxb");
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
      P00JW2_A396EmprCod = new String[] {""} ;
      P00JW2_A996TipCon = new short[1] ;
      P00JW2_A3098TipConPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JW2_n3098TipConPre = new boolean[] {false} ;
      P00JW2_A997TipConDsc = new String[] {""} ;
      P00JW2_n997TipConDsc = new boolean[] {false} ;
      A3098TipConPre = DecimalUtil.ZERO ;
      A997TipConDsc = "" ;
      AV13TipConPre = DecimalUtil.ZERO ;
      AV15TipConDsc = "" ;
      P00JW3_A252CliCod = new int[1] ;
      P00JW3_n252CliCod = new boolean[] {false} ;
      P00JW3_A396EmprCod = new String[] {""} ;
      P00JW3_A1265BarAlbPie = new int[1] ;
      P00JW3_A3915EmpNumDec = new byte[1] ;
      P00JW3_n3915EmpNumDec = new boolean[] {false} ;
      P00JW3_A130BarCodPar = new String[] {""} ;
      P00JW3_A132BarCodReo = new byte[1] ;
      P00JW3_A129BarCod = new int[1] ;
      P00JW3_A30AlbProCod = new long[1] ;
      P00JW3_A3310BarFac = new String[] {""} ;
      P00JW3_A272CliEti = new String[] {""} ;
      A130BarCodPar = "" ;
      A3310BarFac = "" ;
      A272CliEti = "" ;
      AV19BarFac = "" ;
      AV16FacCono = "" ;
      A2765AlbHdrTxt = "" ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      A2772AlbHdrTip = "" ;
      Gx_emsg = "" ;
      P00JW5_A396EmprCod = new String[] {""} ;
      P00JW5_A30AlbProCod = new long[1] ;
      P00JW5_A129BarCod = new int[1] ;
      P00JW5_A132BarCodReo = new byte[1] ;
      P00JW5_A130BarCodPar = new String[] {""} ;
      P00JW5_A2764AlbHdrLin = new short[1] ;
      P00JW5_A2765AlbHdrTxt = new String[] {""} ;
      P00JW5_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JW5_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JW5_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JW5_A2772AlbHdrTip = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewtxb__default(),
         new Object[] {
             new Object[] {
            P00JW2_A396EmprCod, P00JW2_A996TipCon, P00JW2_A3098TipConPre, P00JW2_n3098TipConPre, P00JW2_A997TipConDsc, P00JW2_n997TipConDsc
            }
            , new Object[] {
            P00JW3_A252CliCod, P00JW3_n252CliCod, P00JW3_A396EmprCod, P00JW3_A1265BarAlbPie, P00JW3_A3915EmpNumDec, P00JW3_n3915EmpNumDec, P00JW3_A130BarCodPar, P00JW3_A132BarCodReo, P00JW3_A129BarCod, P00JW3_A30AlbProCod,
            P00JW3_A3310BarFac, P00JW3_A272CliEti
            }
            , new Object[] {
            }
            , new Object[] {
            P00JW5_A396EmprCod, P00JW5_A30AlbProCod, P00JW5_A129BarCod, P00JW5_A132BarCodReo, P00JW5_A130BarCodPar, P00JW5_A2764AlbHdrLin, P00JW5_A2765AlbHdrTxt, P00JW5_A2769AlbHdrPMt, P00JW5_A2770ALbHdrMts, P00JW5_A2771ALbHdrImp,
            P00JW5_A2772AlbHdrTip
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte A3915EmpNumDec ;
   private byte A132BarCodReo ;
   private short AV12TipCon ;
   private short A996TipCon ;
   private short A2764AlbHdrLin ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A252CliCod ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int GX_INS402 ;
   private long AV8AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A3098TipConPre ;
   private java.math.BigDecimal AV13TipConPre ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2771ALbHdrImp ;
   private String A396EmprCod ;
   private String AV11BarCodPar ;
   private String scmdbuf ;
   private String A997TipConDsc ;
   private String AV15TipConDsc ;
   private String A130BarCodPar ;
   private String A3310BarFac ;
   private String A272CliEti ;
   private String AV19BarFac ;
   private String AV16FacCono ;
   private String A2765AlbHdrTxt ;
   private String A2772AlbHdrTip ;
   private String Gx_emsg ;
   private boolean n3098TipConPre ;
   private boolean n997TipConDsc ;
   private boolean n252CliCod ;
   private boolean n3915EmpNumDec ;
   private short[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00JW2_A396EmprCod ;
   private short[] P00JW2_A996TipCon ;
   private java.math.BigDecimal[] P00JW2_A3098TipConPre ;
   private boolean[] P00JW2_n3098TipConPre ;
   private String[] P00JW2_A997TipConDsc ;
   private boolean[] P00JW2_n997TipConDsc ;
   private int[] P00JW3_A252CliCod ;
   private boolean[] P00JW3_n252CliCod ;
   private String[] P00JW3_A396EmprCod ;
   private int[] P00JW3_A1265BarAlbPie ;
   private byte[] P00JW3_A3915EmpNumDec ;
   private boolean[] P00JW3_n3915EmpNumDec ;
   private String[] P00JW3_A130BarCodPar ;
   private byte[] P00JW3_A132BarCodReo ;
   private int[] P00JW3_A129BarCod ;
   private long[] P00JW3_A30AlbProCod ;
   private String[] P00JW3_A3310BarFac ;
   private String[] P00JW3_A272CliEti ;
   private String[] P00JW5_A396EmprCod ;
   private long[] P00JW5_A30AlbProCod ;
   private int[] P00JW5_A129BarCod ;
   private byte[] P00JW5_A132BarCodReo ;
   private String[] P00JW5_A130BarCodPar ;
   private short[] P00JW5_A2764AlbHdrLin ;
   private String[] P00JW5_A2765AlbHdrTxt ;
   private java.math.BigDecimal[] P00JW5_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] P00JW5_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P00JW5_A2771ALbHdrImp ;
   private String[] P00JW5_A2772AlbHdrTip ;
}

final  class pnewtxb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00JW2", "SELECT EmprCod, TipCon, TipConPre, TipConDsc FROM TXPTIPCON WHERE EmprCod = ? and TipCon = ? ORDER BY EmprCod, TipCon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00JW3", "SELECT T3.CliCod, T1.EmprCod, T1.BarAlbPie, T2.EmpNumDec, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T3.BarFac, T4.CliEti FROM (((TXPALBBAR T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00JW4", "INSERT INTO TXPALBTXT(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin, AlbHdrTxt, AlbHdrPMt, ALbHdrMts, ALbHdrImp, AlbHdrTip, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbTxtCod, AlbHdrPzs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
         ,new ForEachCursor("P00JW5", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin, AlbHdrTxt, AlbHdrPMt, ALbHdrMts, ALbHdrImp, AlbHdrTip FROM TXPALBTXT WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbHdrLin = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin  FOR UPDATE OF AlbHdrTxt, AlbHdrPMt, ALbHdrMts, ALbHdrImp, AlbHdrTip NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00JW6", "UPDATE TXPALBTXT SET AlbHdrTxt=?, AlbHdrPMt=?, ALbHdrMts=?, ALbHdrImp=?, AlbHdrTip=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdrLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((long[]) buf[9])[0] = rslt.getLong(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 30);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(11, (String)parms[10], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
      }
   }

}

