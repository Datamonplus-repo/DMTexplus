package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchgmaq extends GXProcedure
{
   public pchgmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchgmaq.class ), "" );
   }

   public pchgmaq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             short[] aP5 )
   {
      pchgmaq.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      pchgmaq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchgmaq.this.AV19Barcod = aP1[0];
      this.aP1 = aP1;
      pchgmaq.this.AV20Barcodreo = aP2[0];
      this.aP2 = aP2;
      pchgmaq.this.AV21Barcodpar = aP3[0];
      this.aP3 = aP3;
      pchgmaq.this.AV22Barfaslot = aP4[0];
      this.aP4 = aP4;
      pchgmaq.this.AV23Barordlin = aP5[0];
      this.aP5 = aP5;
      pchgmaq.this.AV24maqcod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02UV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV19Barcod), Byte.valueOf(AV20Barcodreo), AV21Barcodpar, Short.valueOf(AV23Barordlin), Integer.valueOf(AV22Barfaslot)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P02UV2_A129BarCod[0] ;
         A132BarCodReo = P02UV2_A132BarCodReo[0] ;
         A130BarCodPar = P02UV2_A130BarCodPar[0] ;
         A194BarOrdLin = P02UV2_A194BarOrdLin[0] ;
         A4643BarFasLot = P02UV2_A4643BarFasLot[0] ;
         A4314BarFasBot1 = P02UV2_A4314BarFasBot1[0] ;
         n4314BarFasBot1 = P02UV2_n4314BarFasBot1[0] ;
         A758ProCod = P02UV2_A758ProCod[0] ;
         AV25Lote = A4314BarFasBot1 ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02UV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV19Barcod), Byte.valueOf(AV20Barcodreo), AV21Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P02UV3_A130BarCodPar[0] ;
         A132BarCodReo = P02UV3_A132BarCodReo[0] ;
         A129BarCod = P02UV3_A129BarCod[0] ;
         A4314BarFasBot1 = P02UV3_A4314BarFasBot1[0] ;
         n4314BarFasBot1 = P02UV3_n4314BarFasBot1[0] ;
         A4302BarMaqFas1 = P02UV3_A4302BarMaqFas1[0] ;
         n4302BarMaqFas1 = P02UV3_n4302BarMaqFas1[0] ;
         A4643BarFasLot = P02UV3_A4643BarFasLot[0] ;
         A194BarOrdLin = P02UV3_A194BarOrdLin[0] ;
         A758ProCod = P02UV3_A758ProCod[0] ;
         if ( GXutil.strcmp(A4314BarFasBot1, AV25Lote) == 0 )
         {
            if ( GXutil.strcmp(GXutil.substring( AV24maqcod, 1, 2), GXutil.substring( A4302BarMaqFas1, 1, 2)) == 0 )
            {
               A4302BarMaqFas1 = AV24maqcod ;
               n4302BarMaqFas1 = false ;
               AV26Procod = A758ProCod ;
               AV27Bache = A4643BarFasLot ;
               AV28Ordlin = A194BarOrdLin ;
               /* Execute user subroutine: 'BARFAS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: 'RECMAQ' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         /* Using cursor P02UV4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n4302BarMaqFas1), A4302BarMaqFas1, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02UV5 */
      pr_default.execute(3, new Object[] {AV24maqcod, A396EmprCod, Integer.valueOf(AV19Barcod), Byte.valueOf(AV20Barcodreo), AV21Barcodpar, AV26Procod, Short.valueOf(AV28Ordlin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
      /* End optimized UPDATE. */
   }

   public void S121( )
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02UV6 */
      pr_default.execute(4, new Object[] {AV24maqcod, A396EmprCod, Integer.valueOf(AV19Barcod), Byte.valueOf(AV20Barcodreo), AV21Barcodpar, Integer.valueOf(AV27Bache), Short.valueOf(AV28Ordlin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchgmaq.this.A396EmprCod;
      this.aP1[0] = pchgmaq.this.AV19Barcod;
      this.aP2[0] = pchgmaq.this.AV20Barcodreo;
      this.aP3[0] = pchgmaq.this.AV21Barcodpar;
      this.aP4[0] = pchgmaq.this.AV22Barfaslot;
      this.aP5[0] = pchgmaq.this.AV23Barordlin;
      this.aP6[0] = pchgmaq.this.AV24maqcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pchgmaq");
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
      P02UV2_A396EmprCod = new String[] {""} ;
      P02UV2_A129BarCod = new int[1] ;
      P02UV2_A132BarCodReo = new byte[1] ;
      P02UV2_A130BarCodPar = new String[] {""} ;
      P02UV2_A194BarOrdLin = new short[1] ;
      P02UV2_A4643BarFasLot = new int[1] ;
      P02UV2_A4314BarFasBot1 = new String[] {""} ;
      P02UV2_n4314BarFasBot1 = new boolean[] {false} ;
      P02UV2_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A4314BarFasBot1 = "" ;
      A758ProCod = "" ;
      AV25Lote = "" ;
      P02UV3_A396EmprCod = new String[] {""} ;
      P02UV3_A130BarCodPar = new String[] {""} ;
      P02UV3_A132BarCodReo = new byte[1] ;
      P02UV3_A129BarCod = new int[1] ;
      P02UV3_A4314BarFasBot1 = new String[] {""} ;
      P02UV3_n4314BarFasBot1 = new boolean[] {false} ;
      P02UV3_A4302BarMaqFas1 = new String[] {""} ;
      P02UV3_n4302BarMaqFas1 = new boolean[] {false} ;
      P02UV3_A4643BarFasLot = new int[1] ;
      P02UV3_A194BarOrdLin = new short[1] ;
      P02UV3_A758ProCod = new String[] {""} ;
      A4302BarMaqFas1 = "" ;
      AV26Procod = "" ;
      A603MaqCodBis = "" ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchgmaq__default(),
         new Object[] {
             new Object[] {
            P02UV2_A396EmprCod, P02UV2_A129BarCod, P02UV2_A132BarCodReo, P02UV2_A130BarCodPar, P02UV2_A194BarOrdLin, P02UV2_A4643BarFasLot, P02UV2_A4314BarFasBot1, P02UV2_n4314BarFasBot1, P02UV2_A758ProCod
            }
            , new Object[] {
            P02UV3_A396EmprCod, P02UV3_A130BarCodPar, P02UV3_A132BarCodReo, P02UV3_A129BarCod, P02UV3_A4314BarFasBot1, P02UV3_n4314BarFasBot1, P02UV3_A4302BarMaqFas1, P02UV3_n4302BarMaqFas1, P02UV3_A4643BarFasLot, P02UV3_A194BarOrdLin,
            P02UV3_A758ProCod
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

   private byte AV20Barcodreo ;
   private byte A132BarCodReo ;
   private short AV23Barordlin ;
   private short A194BarOrdLin ;
   private short AV28Ordlin ;
   private short Gx_err ;
   private int AV19Barcod ;
   private int AV22Barfaslot ;
   private int A129BarCod ;
   private int A4643BarFasLot ;
   private int AV27Bache ;
   private String A396EmprCod ;
   private String AV21Barcodpar ;
   private String AV24maqcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A4314BarFasBot1 ;
   private String A758ProCod ;
   private String AV25Lote ;
   private String A4302BarMaqFas1 ;
   private String AV26Procod ;
   private String A603MaqCodBis ;
   private String A602MaqCod ;
   private boolean n4314BarFasBot1 ;
   private boolean n4302BarMaqFas1 ;
   private boolean returnInSub ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02UV2_A396EmprCod ;
   private int[] P02UV2_A129BarCod ;
   private byte[] P02UV2_A132BarCodReo ;
   private String[] P02UV2_A130BarCodPar ;
   private short[] P02UV2_A194BarOrdLin ;
   private int[] P02UV2_A4643BarFasLot ;
   private String[] P02UV2_A4314BarFasBot1 ;
   private boolean[] P02UV2_n4314BarFasBot1 ;
   private String[] P02UV2_A758ProCod ;
   private String[] P02UV3_A396EmprCod ;
   private String[] P02UV3_A130BarCodPar ;
   private byte[] P02UV3_A132BarCodReo ;
   private int[] P02UV3_A129BarCod ;
   private String[] P02UV3_A4314BarFasBot1 ;
   private boolean[] P02UV3_n4314BarFasBot1 ;
   private String[] P02UV3_A4302BarMaqFas1 ;
   private boolean[] P02UV3_n4302BarMaqFas1 ;
   private int[] P02UV3_A4643BarFasLot ;
   private short[] P02UV3_A194BarOrdLin ;
   private String[] P02UV3_A758ProCod ;
}

final  class pchgmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02UV2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasBot1, ProCod FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02UV3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFasBot1, BarMaqFas1, BarFasLot, BarOrdLin, ProCod FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02UV4", "UPDATE TXPFASMAQ SET BarMaqFas1=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new UpdateCursor("P02UV5", "UPDATE TXPBARFAS SET MaqCodBis=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P02UV6", "UPDATE TXPRECMAQ SET MaqCod=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecNroPar = ? and RecOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setInt(8, ((Number) parms[8]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

