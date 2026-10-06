package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelfasl extends GXProcedure
{
   public pdelfasl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelfasl.class ), "" );
   }

   public pdelfasl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pdelfasl.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pdelfasl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelfasl.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdelfasl.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdelfasl.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdelfasl.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pdelfasl.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV9EmprNom ;
      GXv_char3[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char1, GXv_char2, GXv_char3) ;
      pdelfasl.this.A396EmprCod = GXv_char1[0] ;
      pdelfasl.this.AV9EmprNom = GXv_char2[0] ;
      pdelfasl.this.AV10UsurCod = GXv_char3[0] ;
      /* Using cursor P021I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Optimized DELETE. */
         /* Using cursor P021I3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
         /* End optimized DELETE. */
         /* Using cursor P021I4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4643BarFasLot = P021I4_A4643BarFasLot[0] ;
            /* Optimized DELETE. */
            /* Using cursor P021I5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPFA");
            /* End optimized DELETE. */
            /* Using cursor P021I6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P021I7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A5371FasQuiLin = P021I7_A5371FasQuiLin[0] ;
            AV11Inc_obs = httpContext.getMessage( "PDELFASL.Eliminacion FASQUI", "") + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Procod=", "") + GXutil.trim( A758ProCod) + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Orden =", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Linea =", "") + GXutil.str( A5371FasQuiLin, 4, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV19Pgmname, AV10UsurCod, AV8Station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            /* Using cursor P021I8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Optimized DELETE. */
         /* Using cursor P021I9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASBOT");
         /* End optimized DELETE. */
         /* Using cursor P021I10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelfasl.this.A396EmprCod;
      this.aP1[0] = pdelfasl.this.A129BarCod;
      this.aP2[0] = pdelfasl.this.A132BarCodReo;
      this.aP3[0] = pdelfasl.this.A130BarCodPar;
      this.aP4[0] = pdelfasl.this.A758ProCod;
      this.aP5[0] = pdelfasl.this.A194BarOrdLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelfasl");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Station = "" ;
      GXv_char1 = new String[1] ;
      AV9EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV10UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P021I2_A396EmprCod = new String[] {""} ;
      P021I2_A129BarCod = new int[1] ;
      P021I2_A132BarCodReo = new byte[1] ;
      P021I2_A130BarCodPar = new String[] {""} ;
      P021I2_A758ProCod = new String[] {""} ;
      P021I2_A194BarOrdLin = new short[1] ;
      P021I4_A396EmprCod = new String[] {""} ;
      P021I4_A129BarCod = new int[1] ;
      P021I4_A132BarCodReo = new byte[1] ;
      P021I4_A130BarCodPar = new String[] {""} ;
      P021I4_A758ProCod = new String[] {""} ;
      P021I4_A194BarOrdLin = new short[1] ;
      P021I4_A4643BarFasLot = new int[1] ;
      P021I7_A396EmprCod = new String[] {""} ;
      P021I7_A129BarCod = new int[1] ;
      P021I7_A132BarCodReo = new byte[1] ;
      P021I7_A130BarCodPar = new String[] {""} ;
      P021I7_A758ProCod = new String[] {""} ;
      P021I7_A194BarOrdLin = new short[1] ;
      P021I7_A5371FasQuiLin = new short[1] ;
      AV11Inc_obs = "" ;
      AV19Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelfasl__default(),
         new Object[] {
             new Object[] {
            P021I2_A396EmprCod, P021I2_A129BarCod, P021I2_A132BarCodReo, P021I2_A130BarCodPar, P021I2_A758ProCod, P021I2_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P021I4_A396EmprCod, P021I4_A129BarCod, P021I4_A132BarCodReo, P021I4_A130BarCodPar, P021I4_A758ProCod, P021I4_A194BarOrdLin, P021I4_A4643BarFasLot
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P021I7_A396EmprCod, P021I7_A129BarCod, P021I7_A132BarCodReo, P021I7_A130BarCodPar, P021I7_A758ProCod, P021I7_A194BarOrdLin, P021I7_A5371FasQuiLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV19Pgmname = "PDELFASL" ;
      /* GeneXus formulas. */
      AV19Pgmname = "PDELFASL" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short A5371FasQuiLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4643BarFasLot ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV8Station ;
   private String GXv_char1[] ;
   private String AV9EmprNom ;
   private String GXv_char2[] ;
   private String AV10UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String AV19Pgmname ;
   private String AV11Inc_obs ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P021I2_A396EmprCod ;
   private int[] P021I2_A129BarCod ;
   private byte[] P021I2_A132BarCodReo ;
   private String[] P021I2_A130BarCodPar ;
   private String[] P021I2_A758ProCod ;
   private short[] P021I2_A194BarOrdLin ;
   private String[] P021I4_A396EmprCod ;
   private int[] P021I4_A129BarCod ;
   private byte[] P021I4_A132BarCodReo ;
   private String[] P021I4_A130BarCodPar ;
   private String[] P021I4_A758ProCod ;
   private short[] P021I4_A194BarOrdLin ;
   private int[] P021I4_A4643BarFasLot ;
   private String[] P021I7_A396EmprCod ;
   private int[] P021I7_A129BarCod ;
   private byte[] P021I7_A132BarCodReo ;
   private String[] P021I7_A130BarCodPar ;
   private String[] P021I7_A758ProCod ;
   private short[] P021I7_A194BarOrdLin ;
   private short[] P021I7_A5371FasQuiLin ;
}

final  class pdelfasl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021I2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P021I3", "DELETE FROM TXPBarPar  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new ForEachCursor("P021I4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P021I5", "DELETE FROM TXPFASPFA  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASPFA")
         ,new UpdateCursor("P021I6", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new ForEachCursor("P021I7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P021I8", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new UpdateCursor("P021I9", "DELETE FROM TXPFASBOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASBOT")
         ,new UpdateCursor("P021I10", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

