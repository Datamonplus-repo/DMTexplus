package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcatteo extends GXProcedure
{
   public pcatteo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcatteo.class ), "" );
   }

   public pcatteo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 )
   {
      pcatteo.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      pcatteo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcatteo.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcatteo.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcatteo.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcatteo.this.AV13BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pcatteo.this.AV12FasCod = aP5[0];
      this.aP5 = aP5;
      pcatteo.this.AV14Tot_mm_t = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Inicio Calculo Tiempo Teorico", "") );
      AV14Tot_mm_t = (short)(0) ;
      /* Using cursor P01SG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV13BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P01SG2_A457FasCod[0] ;
         A194BarOrdLin = P01SG2_A194BarOrdLin[0] ;
         A758ProCod = P01SG2_A758ProCod[0] ;
         A150BarFacTin = P01SG2_A150BarFacTin[0] ;
         A252CliCod = P01SG2_A252CliCod[0] ;
         n252CliCod = P01SG2_n252CliCod[0] ;
         A212BarSer = P01SG2_A212BarSer[0] ;
         A135BarColNom = P01SG2_A135BarColNom[0] ;
         A136BarColNum = P01SG2_A136BarColNum[0] ;
         A218BarTipCol = P01SG2_A218BarTipCol[0] ;
         A5369BarFasGral = P01SG2_A5369BarFasGral[0] ;
         n5369BarFasGral = P01SG2_n5369BarFasGral[0] ;
         A252CliCod = P01SG2_A252CliCod[0] ;
         n252CliCod = P01SG2_n252CliCod[0] ;
         A212BarSer = P01SG2_A212BarSer[0] ;
         A135BarColNom = P01SG2_A135BarColNom[0] ;
         A136BarColNum = P01SG2_A136BarColNum[0] ;
         A218BarTipCol = P01SG2_A218BarTipCol[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_char3[0] = A212BarSer ;
            GXv_char4[0] = A135BarColNom ;
            GXv_int5[0] = A136BarColNum ;
            GXv_int6[0] = A218BarTipCol ;
            GXv_int7[0] = AV14Tot_mm_t ;
            new app.pfortie(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7) ;
            pcatteo.this.A396EmprCod = GXv_char1[0] ;
            pcatteo.this.A252CliCod = GXv_int2[0] ;
            pcatteo.this.A212BarSer = GXv_char3[0] ;
            pcatteo.this.A135BarColNom = GXv_char4[0] ;
            pcatteo.this.A136BarColNum = GXv_int5[0] ;
            pcatteo.this.A218BarTipCol = GXv_int6[0] ;
            pcatteo.this.AV14Tot_mm_t = GXv_int7[0] ;
         }
         else
         {
            if ( GXutil.strcmp(A5369BarFasGral, httpContext.getMessage( "N", "")) == 0 )
            {
               AV14Tot_mm_t = (short)(0) ;
               /* Optimized group. */
               /* Using cursor P01SG3 */
               pr_default.execute(1, new Object[] {A396EmprCod, AV12FasCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               c771ProForTie = P01SG3_A771ProForTie[0] ;
               pr_default.close(1);
               AV14Tot_mm_t = (short)(AV14Tot_mm_t+c771ProForTie) ;
               /* End optimized group. */
            }
            else
            {
               /* Optimized group. */
               /* Using cursor P01SG4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(AV13BarOrdLin)});
               c771ProForTie = P01SG4_A771ProForTie[0] ;
               pr_default.close(2);
               AV14Tot_mm_t = (short)(AV14Tot_mm_t+c771ProForTie) ;
               /* End optimized group. */
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Calculo Tiempo Teorico", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcatteo.this.A396EmprCod;
      this.aP1[0] = pcatteo.this.A129BarCod;
      this.aP2[0] = pcatteo.this.A132BarCodReo;
      this.aP3[0] = pcatteo.this.A130BarCodPar;
      this.aP4[0] = pcatteo.this.AV13BarOrdLin;
      this.aP5[0] = pcatteo.this.AV12FasCod;
      this.aP6[0] = pcatteo.this.AV14Tot_mm_t;
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
      P01SG2_A396EmprCod = new String[] {""} ;
      P01SG2_A129BarCod = new int[1] ;
      P01SG2_A132BarCodReo = new byte[1] ;
      P01SG2_A130BarCodPar = new String[] {""} ;
      P01SG2_A457FasCod = new String[] {""} ;
      P01SG2_A194BarOrdLin = new short[1] ;
      P01SG2_A758ProCod = new String[] {""} ;
      P01SG2_A150BarFacTin = new String[] {""} ;
      P01SG2_A252CliCod = new int[1] ;
      P01SG2_n252CliCod = new boolean[] {false} ;
      P01SG2_A212BarSer = new String[] {""} ;
      P01SG2_A135BarColNom = new String[] {""} ;
      P01SG2_A136BarColNum = new int[1] ;
      P01SG2_A218BarTipCol = new byte[1] ;
      P01SG2_A5369BarFasGral = new String[] {""} ;
      P01SG2_n5369BarFasGral = new boolean[] {false} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A150BarFacTin = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A5369BarFasGral = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new short[1] ;
      P01SG3_A771ProForTie = new short[1] ;
      P01SG4_A771ProForTie = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcatteo__default(),
         new Object[] {
             new Object[] {
            P01SG2_A396EmprCod, P01SG2_A129BarCod, P01SG2_A132BarCodReo, P01SG2_A130BarCodPar, P01SG2_A457FasCod, P01SG2_A194BarOrdLin, P01SG2_A758ProCod, P01SG2_A150BarFacTin, P01SG2_A252CliCod, P01SG2_n252CliCod,
            P01SG2_A212BarSer, P01SG2_A135BarColNom, P01SG2_A136BarColNum, P01SG2_A218BarTipCol, P01SG2_A5369BarFasGral, P01SG2_n5369BarFasGral
            }
            , new Object[] {
            P01SG3_A771ProForTie
            }
            , new Object[] {
            P01SG4_A771ProForTie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte GXv_int6[] ;
   private short AV13BarOrdLin ;
   private short AV14Tot_mm_t ;
   private short A194BarOrdLin ;
   private short GXv_int7[] ;
   private short c771ProForTie ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12FasCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A150BarFacTin ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A5369BarFasGral ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private boolean n252CliCod ;
   private boolean n5369BarFasGral ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01SG2_A396EmprCod ;
   private int[] P01SG2_A129BarCod ;
   private byte[] P01SG2_A132BarCodReo ;
   private String[] P01SG2_A130BarCodPar ;
   private String[] P01SG2_A457FasCod ;
   private short[] P01SG2_A194BarOrdLin ;
   private String[] P01SG2_A758ProCod ;
   private String[] P01SG2_A150BarFacTin ;
   private int[] P01SG2_A252CliCod ;
   private boolean[] P01SG2_n252CliCod ;
   private String[] P01SG2_A212BarSer ;
   private String[] P01SG2_A135BarColNom ;
   private int[] P01SG2_A136BarColNum ;
   private byte[] P01SG2_A218BarTipCol ;
   private String[] P01SG2_A5369BarFasGral ;
   private boolean[] P01SG2_n5369BarFasGral ;
   private short[] P01SG3_A771ProForTie ;
   private short[] P01SG4_A771ProForTie ;
}

final  class pcatteo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01SG2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T1.BarOrdLin, T1.ProCod, T1.BarFacTin, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.BarFasGral FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01SG3", "SELECT SUM(T3.ProForTie) FROM ((TXPFASQUI T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = T1.EmprCod AND T3.ProForCod = T1.ProForCod) WHERE (T1.EmprCod = ? and T2.FasCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) AND (T1.ProCod = ?) AND (T1.BarOrdLin = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01SG4", "SELECT SUM(T2.ProForTie) FROM (TXPFASQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
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

