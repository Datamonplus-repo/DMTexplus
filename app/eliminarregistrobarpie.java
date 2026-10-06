package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminarregistrobarpie extends GXProcedure
{
   public eliminarregistrobarpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminarregistrobarpie.class ), "" );
   }

   public eliminarregistrobarpie( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      eliminarregistrobarpie.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      eliminarregistrobarpie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      eliminarregistrobarpie.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      eliminarregistrobarpie.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      eliminarregistrobarpie.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      eliminarregistrobarpie.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09262 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P09262_A361DisCod[0] ;
         A120BarAgrEst = P09262_A120BarAgrEst[0] ;
         /* Using cursor P09263 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P09263_A44AlbRecCod[0] ;
            A203BarPieKil = P09263_A203BarPieKil[0] ;
            A205BarPieMet = P09263_A205BarPieMet[0] ;
            A1501BarPiePie = P09263_A1501BarPiePie[0] ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A361DisCod ;
            GXv_int3[0] = A44AlbRecCod ;
            GXv_char4[0] = A200BarPieCod ;
            GXv_char5[0] = "N" ;
            GXv_decimal6[0] = A203BarPieKil ;
            GXv_decimal7[0] = A205BarPieMet ;
            GXv_int8[0] = A1501BarPiePie ;
            new app.pdelpdi2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_int8) ;
            eliminarregistrobarpie.this.A396EmprCod = GXv_char1[0] ;
            eliminarregistrobarpie.this.A361DisCod = GXv_int2[0] ;
            eliminarregistrobarpie.this.A44AlbRecCod = GXv_int3[0] ;
            eliminarregistrobarpie.this.A200BarPieCod = GXv_char4[0] ;
            eliminarregistrobarpie.this.A203BarPieKil = GXv_decimal6[0] ;
            eliminarregistrobarpie.this.A205BarPieMet = GXv_decimal7[0] ;
            eliminarregistrobarpie.this.A1501BarPiePie = GXv_int8[0] ;
            /* Using cursor P09264 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( GXutil.strcmp(A120BarAgrEst, "S") == 0 )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int8[0] = A129BarCod ;
            GXv_int9[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            new app.pactagr(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_int9, GXv_char4) ;
            eliminarregistrobarpie.this.A396EmprCod = GXv_char5[0] ;
            eliminarregistrobarpie.this.A129BarCod = GXv_int8[0] ;
            eliminarregistrobarpie.this.A132BarCodReo = GXv_int9[0] ;
            eliminarregistrobarpie.this.A130BarCodPar = GXv_char4[0] ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = eliminarregistrobarpie.this.A396EmprCod;
      this.aP1[0] = eliminarregistrobarpie.this.A129BarCod;
      this.aP2[0] = eliminarregistrobarpie.this.A132BarCodReo;
      this.aP3[0] = eliminarregistrobarpie.this.A130BarCodPar;
      this.aP4[0] = eliminarregistrobarpie.this.A200BarPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "eliminarregistrobarpie");
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
      P09262_A396EmprCod = new String[] {""} ;
      P09262_A129BarCod = new int[1] ;
      P09262_A132BarCodReo = new byte[1] ;
      P09262_A130BarCodPar = new String[] {""} ;
      P09262_A361DisCod = new int[1] ;
      P09262_A120BarAgrEst = new String[] {""} ;
      A120BarAgrEst = "" ;
      P09263_A396EmprCod = new String[] {""} ;
      P09263_A129BarCod = new int[1] ;
      P09263_A132BarCodReo = new byte[1] ;
      P09263_A130BarCodPar = new String[] {""} ;
      P09263_A200BarPieCod = new String[] {""} ;
      P09263_A44AlbRecCod = new int[1] ;
      P09263_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09263_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09263_A1501BarPiePie = new int[1] ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.eliminarregistrobarpie__default(),
         new Object[] {
             new Object[] {
            P09262_A396EmprCod, P09262_A129BarCod, P09262_A132BarCodReo, P09262_A130BarCodPar, P09262_A361DisCod, P09262_A120BarAgrEst
            }
            , new Object[] {
            P09263_A396EmprCod, P09263_A129BarCod, P09263_A132BarCodReo, P09263_A130BarCodPar, P09263_A200BarPieCod, P09263_A44AlbRecCod, P09263_A203BarPieKil, P09263_A205BarPieMet, P09263_A1501BarPiePie
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int9[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int GXv_int2[] ;
   private int GXv_int3[] ;
   private int GXv_int8[] ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P09262_A396EmprCod ;
   private int[] P09262_A129BarCod ;
   private byte[] P09262_A132BarCodReo ;
   private String[] P09262_A130BarCodPar ;
   private int[] P09262_A361DisCod ;
   private String[] P09262_A120BarAgrEst ;
   private String[] P09263_A396EmprCod ;
   private int[] P09263_A129BarCod ;
   private byte[] P09263_A132BarCodReo ;
   private String[] P09263_A130BarCodPar ;
   private String[] P09263_A200BarPieCod ;
   private int[] P09263_A44AlbRecCod ;
   private java.math.BigDecimal[] P09263_A203BarPieKil ;
   private java.math.BigDecimal[] P09263_A205BarPieMet ;
   private int[] P09263_A1501BarPiePie ;
}

final  class eliminarregistrobarpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09262", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09263", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPiePie FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09264", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

