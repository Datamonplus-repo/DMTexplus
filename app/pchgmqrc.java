package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchgmqrc extends GXProcedure
{
   public pchgmqrc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchgmqrc.class ), "" );
   }

   public pchgmqrc( int remoteHandle ,
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
      pchgmqrc.this.aP5 = new String[] {""};
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
      pchgmqrc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchgmqrc.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pchgmqrc.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pchgmqrc.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pchgmqrc.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pchgmqrc.this.AV18MaqCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02KF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4258RecMaqFas = P02KF2_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P02KF2_n4258RecMaqFas[0] ;
         A4268RecOrdLin = P02KF2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P02KF2_n4268RecOrdLin[0] ;
         AV14RecMaqfas = A4258RecMaqFas ;
         AV15Barcod = A129BarCod ;
         AV16barcodreo = A132BarCodReo ;
         AV17barcodpar = A130BarCodPar ;
         AV19Barordlin = A4268RecOrdLin ;
         /* Execute user subroutine: 'BARFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'FASQUI' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02KF3 */
      pr_default.execute(1, new Object[] {AV18MaqCod, A396EmprCod, Integer.valueOf(AV15Barcod), Byte.valueOf(AV16barcodreo), AV17barcodpar, Short.valueOf(AV19Barordlin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
      /* End optimized UPDATE. */
   }

   public void S121( )
   {
      /* 'FASQUI' Routine */
      returnInSub = false ;
      /* Using cursor P02KF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV15Barcod), Byte.valueOf(AV16barcodreo), AV17barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P02KF4_A457FasCod[0] ;
         A6599FasMaqPl = P02KF4_A6599FasMaqPl[0] ;
         A194BarOrdLin = P02KF4_A194BarOrdLin[0] ;
         A758ProCod = P02KF4_A758ProCod[0] ;
         A5371FasQuiLin = P02KF4_A5371FasQuiLin[0] ;
         A457FasCod = P02KF4_A457FasCod[0] ;
         if ( GXutil.strcmp(A457FasCod, AV14RecMaqfas) == 0 )
         {
            A6599FasMaqPl = AV18MaqCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P02KF5 */
            pr_default.execute(3, new Object[] {A6599FasMaqPl, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
            if (true) break;
         }
         /* Using cursor P02KF6 */
         pr_default.execute(4, new Object[] {A6599FasMaqPl, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchgmqrc.this.A396EmprCod;
      this.aP1[0] = pchgmqrc.this.A129BarCod;
      this.aP2[0] = pchgmqrc.this.A132BarCodReo;
      this.aP3[0] = pchgmqrc.this.A130BarCodPar;
      this.aP4[0] = pchgmqrc.this.A2804RecLinMaq;
      this.aP5[0] = pchgmqrc.this.AV18MaqCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pchgmqrc");
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
      P02KF2_A396EmprCod = new String[] {""} ;
      P02KF2_A129BarCod = new int[1] ;
      P02KF2_A132BarCodReo = new byte[1] ;
      P02KF2_A130BarCodPar = new String[] {""} ;
      P02KF2_A2804RecLinMaq = new short[1] ;
      P02KF2_A4258RecMaqFas = new String[] {""} ;
      P02KF2_n4258RecMaqFas = new boolean[] {false} ;
      P02KF2_A4268RecOrdLin = new short[1] ;
      P02KF2_n4268RecOrdLin = new boolean[] {false} ;
      A4258RecMaqFas = "" ;
      AV14RecMaqfas = "" ;
      AV17barcodpar = "" ;
      A603MaqCodBis = "" ;
      P02KF4_A396EmprCod = new String[] {""} ;
      P02KF4_A130BarCodPar = new String[] {""} ;
      P02KF4_A132BarCodReo = new byte[1] ;
      P02KF4_A129BarCod = new int[1] ;
      P02KF4_A457FasCod = new String[] {""} ;
      P02KF4_A6599FasMaqPl = new String[] {""} ;
      P02KF4_A194BarOrdLin = new short[1] ;
      P02KF4_A758ProCod = new String[] {""} ;
      P02KF4_A5371FasQuiLin = new short[1] ;
      A457FasCod = "" ;
      A6599FasMaqPl = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchgmqrc__default(),
         new Object[] {
             new Object[] {
            P02KF2_A396EmprCod, P02KF2_A129BarCod, P02KF2_A132BarCodReo, P02KF2_A130BarCodPar, P02KF2_A2804RecLinMaq, P02KF2_A4258RecMaqFas, P02KF2_n4258RecMaqFas, P02KF2_A4268RecOrdLin, P02KF2_n4268RecOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02KF4_A396EmprCod, P02KF4_A130BarCodPar, P02KF4_A132BarCodReo, P02KF4_A129BarCod, P02KF4_A457FasCod, P02KF4_A6599FasMaqPl, P02KF4_A194BarOrdLin, P02KF4_A758ProCod, P02KF4_A5371FasQuiLin
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

   private byte A132BarCodReo ;
   private byte AV16barcodreo ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short AV19Barordlin ;
   private short A194BarOrdLin ;
   private short A5371FasQuiLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV15Barcod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV18MaqCod ;
   private String scmdbuf ;
   private String A4258RecMaqFas ;
   private String AV14RecMaqfas ;
   private String AV17barcodpar ;
   private String A603MaqCodBis ;
   private String A457FasCod ;
   private String A6599FasMaqPl ;
   private String A758ProCod ;
   private boolean n4258RecMaqFas ;
   private boolean n4268RecOrdLin ;
   private boolean returnInSub ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02KF2_A396EmprCod ;
   private int[] P02KF2_A129BarCod ;
   private byte[] P02KF2_A132BarCodReo ;
   private String[] P02KF2_A130BarCodPar ;
   private short[] P02KF2_A2804RecLinMaq ;
   private String[] P02KF2_A4258RecMaqFas ;
   private boolean[] P02KF2_n4258RecMaqFas ;
   private short[] P02KF2_A4268RecOrdLin ;
   private boolean[] P02KF2_n4268RecOrdLin ;
   private String[] P02KF4_A396EmprCod ;
   private String[] P02KF4_A130BarCodPar ;
   private byte[] P02KF4_A132BarCodReo ;
   private int[] P02KF4_A129BarCod ;
   private String[] P02KF4_A457FasCod ;
   private String[] P02KF4_A6599FasMaqPl ;
   private short[] P02KF4_A194BarOrdLin ;
   private String[] P02KF4_A758ProCod ;
   private short[] P02KF4_A5371FasQuiLin ;
}

final  class pchgmqrc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02KF2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecMaqFas, RecOrdLin FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02KF3", "UPDATE TXPBARFAS SET MaqCodBis=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P02KF4", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.FasCod, T1.FasMaqPl, T1.BarOrdLin, T1.ProCod, T1.FasQuiLin FROM (TXPFASQUI T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02KF5", "UPDATE TXPFASQUI SET FasMaqPl=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new UpdateCursor("P02KF6", "UPDATE TXPFASQUI SET FasMaqPl=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

