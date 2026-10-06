package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppla002 extends GXProcedure
{
   public ppla002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppla002.class ), "" );
   }

   public ppla002( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      ppla002.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      ppla002.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppla002.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppla002.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppla002.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppla002.this.AV8TiempoT = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV9Indutexma ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int2) ;
      ppla002.this.GXt_int1 = GXv_int2[0] ;
      AV9Indutexma = GXt_int1 ;
      AV8TiempoT = (short)(0) ;
      /* Using cursor P01NY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P01NY2_A2804RecLinMaq[0] ;
         A602MaqCod = P01NY2_A602MaqCod[0] ;
         A252CliCod = P01NY2_A252CliCod[0] ;
         n252CliCod = P01NY2_n252CliCod[0] ;
         A212BarSer = P01NY2_A212BarSer[0] ;
         A135BarColNom = P01NY2_A135BarColNom[0] ;
         A136BarColNum = P01NY2_A136BarColNum[0] ;
         A218BarTipCol = P01NY2_A218BarTipCol[0] ;
         A252CliCod = P01NY2_A252CliCod[0] ;
         n252CliCod = P01NY2_n252CliCod[0] ;
         A212BarSer = P01NY2_A212BarSer[0] ;
         A135BarColNom = P01NY2_A135BarColNom[0] ;
         A136BarColNum = P01NY2_A136BarColNum[0] ;
         A218BarTipCol = P01NY2_A218BarTipCol[0] ;
         AV10MaqCod = A602MaqCod ;
         /* Optimized group. */
         /* Using cursor P01NY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         c771ProForTie = P01NY3_A771ProForTie[0] ;
         pr_default.close(1);
         AV8TiempoT = (short)(AV8TiempoT+c771ProForTie) ;
         /* End optimized group. */
         if ( AV9Indutexma == 1 )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A212BarSer ;
            GXv_char6[0] = A135BarColNom ;
            GXv_int7[0] = A136BarColNum ;
            GXv_int2[0] = A218BarTipCol ;
            GXv_char8[0] = AV10MaqCod ;
            GXv_int9[0] = AV17Maq_Tt ;
            new app.pttmqpr(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int2, GXv_char8, GXv_int9) ;
            ppla002.this.A396EmprCod = GXv_char3[0] ;
            ppla002.this.A252CliCod = GXv_int4[0] ;
            ppla002.this.A212BarSer = GXv_char5[0] ;
            ppla002.this.A135BarColNom = GXv_char6[0] ;
            ppla002.this.A136BarColNum = GXv_int7[0] ;
            ppla002.this.A218BarTipCol = GXv_int2[0] ;
            ppla002.this.AV10MaqCod = GXv_char8[0] ;
            ppla002.this.AV17Maq_Tt = GXv_int9[0] ;
            if ( AV17Maq_Tt > 0 )
            {
               AV8TiempoT = AV17Maq_Tt ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppla002.this.A396EmprCod;
      this.aP1[0] = ppla002.this.A129BarCod;
      this.aP2[0] = ppla002.this.A132BarCodReo;
      this.aP3[0] = ppla002.this.A130BarCodPar;
      this.aP4[0] = ppla002.this.AV8TiempoT;
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
      P01NY2_A396EmprCod = new String[] {""} ;
      P01NY2_A129BarCod = new int[1] ;
      P01NY2_A132BarCodReo = new byte[1] ;
      P01NY2_A130BarCodPar = new String[] {""} ;
      P01NY2_A2804RecLinMaq = new short[1] ;
      P01NY2_A602MaqCod = new String[] {""} ;
      P01NY2_A252CliCod = new int[1] ;
      P01NY2_n252CliCod = new boolean[] {false} ;
      P01NY2_A212BarSer = new String[] {""} ;
      P01NY2_A135BarColNom = new String[] {""} ;
      P01NY2_A136BarColNum = new int[1] ;
      P01NY2_A218BarTipCol = new byte[1] ;
      A602MaqCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV10MaqCod = "" ;
      P01NY3_A771ProForTie = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppla002__default(),
         new Object[] {
             new Object[] {
            P01NY2_A396EmprCod, P01NY2_A129BarCod, P01NY2_A132BarCodReo, P01NY2_A130BarCodPar, P01NY2_A2804RecLinMaq, P01NY2_A602MaqCod, P01NY2_A252CliCod, P01NY2_n252CliCod, P01NY2_A212BarSer, P01NY2_A135BarColNom,
            P01NY2_A136BarColNum, P01NY2_A218BarTipCol
            }
            , new Object[] {
            P01NY3_A771ProForTie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9Indutexma ;
   private byte GXt_int1 ;
   private byte A218BarTipCol ;
   private byte GXv_int2[] ;
   private short AV8TiempoT ;
   private short A2804RecLinMaq ;
   private short c771ProForTie ;
   private short AV17Maq_Tt ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int4[] ;
   private int GXv_int7[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV10MaqCod ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private boolean n252CliCod ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01NY2_A396EmprCod ;
   private int[] P01NY2_A129BarCod ;
   private byte[] P01NY2_A132BarCodReo ;
   private String[] P01NY2_A130BarCodPar ;
   private short[] P01NY2_A2804RecLinMaq ;
   private String[] P01NY2_A602MaqCod ;
   private int[] P01NY2_A252CliCod ;
   private boolean[] P01NY2_n252CliCod ;
   private String[] P01NY2_A212BarSer ;
   private String[] P01NY2_A135BarColNom ;
   private int[] P01NY2_A136BarColNum ;
   private byte[] P01NY2_A218BarTipCol ;
   private short[] P01NY3_A771ProForTie ;
}

final  class ppla002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01NY2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.MaqCod, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01NY3", "SELECT SUM(T2.ProForTie) FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               return;
            case 1 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

