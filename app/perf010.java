package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class perf010 extends GXProcedure
{
   public perf010( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( perf010.class ), "" );
   }

   public perf010( int remoteHandle ,
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
      perf010.this.aP4 = new String[] {""};
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
      perf010.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      perf010.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      perf010.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      perf010.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      perf010.this.AV13Barpiecod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12N_p = (short)(0) ;
      /* Using cursor P03DA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A908PieOriCod = P03DA2_A908PieOriCod[0] ;
         A200BarPieCod = P03DA2_A200BarPieCod[0] ;
         if ( GXutil.strcmp(A908PieOriCod, httpContext.getMessage( "Eliminar", "")) != 0 )
         {
            AV12N_p = (short)(AV12N_p+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV12N_p > 1 )
      {
         Gx_msg = httpContext.getMessage( "Hemos detectado que esta HDR tenia mas", "") + GXutil.newLine( ) + httpContext.getMessage( "de un registro, por lo que se eliminan", "") + GXutil.newLine( ) + httpContext.getMessage( "los restantes registros", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
         /* Using cursor P03DA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A908PieOriCod = P03DA3_A908PieOriCod[0] ;
            A2186BarPieLoc = P03DA3_A2186BarPieLoc[0] ;
            n2186BarPieLoc = P03DA3_n2186BarPieLoc[0] ;
            A361DisCod = P03DA3_A361DisCod[0] ;
            A44AlbRecCod = P03DA3_A44AlbRecCod[0] ;
            A203BarPieKil = P03DA3_A203BarPieKil[0] ;
            A205BarPieMet = P03DA3_A205BarPieMet[0] ;
            A1501BarPiePie = P03DA3_A1501BarPiePie[0] ;
            A200BarPieCod = P03DA3_A200BarPieCod[0] ;
            A361DisCod = P03DA3_A361DisCod[0] ;
            if ( GXutil.strcmp(A908PieOriCod, httpContext.getMessage( "Eliminar", "")) == 0 )
            {
            }
            else
            {
               if ( GXutil.strcmp(A2186BarPieLoc, httpContext.getMessage( "Sem TELA", "")) == 0 )
               {
               }
               else
               {
                  Gx_msg = A200BarPieCod ;
                  GXv_char1[0] = A396EmprCod ;
                  GXv_int2[0] = A361DisCod ;
                  GXv_int3[0] = A44AlbRecCod ;
                  GXv_char4[0] = A200BarPieCod ;
                  GXv_char5[0] = httpContext.getMessage( "N", "") ;
                  GXv_decimal6[0] = A203BarPieKil ;
                  GXv_decimal7[0] = A205BarPieMet ;
                  GXv_int8[0] = A1501BarPiePie ;
                  new app.perf005(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_int8) ;
                  perf010.this.A396EmprCod = GXv_char1[0] ;
                  perf010.this.A361DisCod = GXv_int2[0] ;
                  perf010.this.A44AlbRecCod = GXv_int3[0] ;
                  perf010.this.A200BarPieCod = GXv_char4[0] ;
                  perf010.this.A203BarPieKil = GXv_decimal6[0] ;
                  perf010.this.A205BarPieMet = GXv_decimal7[0] ;
                  perf010.this.A1501BarPiePie = GXv_int8[0] ;
                  GXv_char5[0] = A396EmprCod ;
                  GXv_int8[0] = A129BarCod ;
                  GXv_int9[0] = A132BarCodReo ;
                  GXv_char4[0] = A130BarCodPar ;
                  GXv_char1[0] = A200BarPieCod ;
                  new app.perf009(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_int9, GXv_char4, GXv_char1) ;
                  perf010.this.A396EmprCod = GXv_char5[0] ;
                  perf010.this.A129BarCod = GXv_int8[0] ;
                  perf010.this.A132BarCodReo = GXv_int9[0] ;
                  perf010.this.A130BarCodPar = GXv_char4[0] ;
                  perf010.this.A200BarPieCod = GXv_char1[0] ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = perf010.this.A396EmprCod;
      this.aP1[0] = perf010.this.A129BarCod;
      this.aP2[0] = perf010.this.A132BarCodReo;
      this.aP3[0] = perf010.this.A130BarCodPar;
      this.aP4[0] = perf010.this.AV13Barpiecod;
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
      P03DA2_A396EmprCod = new String[] {""} ;
      P03DA2_A129BarCod = new int[1] ;
      P03DA2_A132BarCodReo = new byte[1] ;
      P03DA2_A130BarCodPar = new String[] {""} ;
      P03DA2_A908PieOriCod = new String[] {""} ;
      P03DA2_A200BarPieCod = new String[] {""} ;
      A908PieOriCod = "" ;
      A200BarPieCod = "" ;
      Gx_msg = "" ;
      P03DA3_A396EmprCod = new String[] {""} ;
      P03DA3_A129BarCod = new int[1] ;
      P03DA3_A132BarCodReo = new byte[1] ;
      P03DA3_A130BarCodPar = new String[] {""} ;
      P03DA3_A908PieOriCod = new String[] {""} ;
      P03DA3_A2186BarPieLoc = new String[] {""} ;
      P03DA3_n2186BarPieLoc = new boolean[] {false} ;
      P03DA3_A361DisCod = new int[1] ;
      P03DA3_A44AlbRecCod = new int[1] ;
      P03DA3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03DA3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03DA3_A1501BarPiePie = new int[1] ;
      P03DA3_A200BarPieCod = new String[] {""} ;
      A2186BarPieLoc = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.perf010__default(),
         new Object[] {
             new Object[] {
            P03DA2_A396EmprCod, P03DA2_A129BarCod, P03DA2_A132BarCodReo, P03DA2_A130BarCodPar, P03DA2_A908PieOriCod, P03DA2_A200BarPieCod
            }
            , new Object[] {
            P03DA3_A396EmprCod, P03DA3_A129BarCod, P03DA3_A132BarCodReo, P03DA3_A130BarCodPar, P03DA3_A908PieOriCod, P03DA3_A2186BarPieLoc, P03DA3_n2186BarPieLoc, P03DA3_A361DisCod, P03DA3_A44AlbRecCod, P03DA3_A203BarPieKil,
            P03DA3_A205BarPieMet, P03DA3_A1501BarPiePie, P03DA3_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int9[] ;
   private short AV12N_p ;
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
   private String AV13Barpiecod ;
   private String scmdbuf ;
   private String A908PieOriCod ;
   private String A200BarPieCod ;
   private String Gx_msg ;
   private String A2186BarPieLoc ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private boolean n2186BarPieLoc ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03DA2_A396EmprCod ;
   private int[] P03DA2_A129BarCod ;
   private byte[] P03DA2_A132BarCodReo ;
   private String[] P03DA2_A130BarCodPar ;
   private String[] P03DA2_A908PieOriCod ;
   private String[] P03DA2_A200BarPieCod ;
   private String[] P03DA3_A396EmprCod ;
   private int[] P03DA3_A129BarCod ;
   private byte[] P03DA3_A132BarCodReo ;
   private String[] P03DA3_A130BarCodPar ;
   private String[] P03DA3_A908PieOriCod ;
   private String[] P03DA3_A2186BarPieLoc ;
   private boolean[] P03DA3_n2186BarPieLoc ;
   private int[] P03DA3_A361DisCod ;
   private int[] P03DA3_A44AlbRecCod ;
   private java.math.BigDecimal[] P03DA3_A203BarPieKil ;
   private java.math.BigDecimal[] P03DA3_A205BarPieMet ;
   private int[] P03DA3_A1501BarPiePie ;
   private String[] P03DA3_A200BarPieCod ;
}

final  class perf010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DA2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PieOriCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DA3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PieOriCod, T1.BarPieLoc, T2.DisCod, T1.AlbRecCod, T1.BarPieKil, T1.BarPieMet, T1.BarPiePie, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 9);
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
               return;
      }
   }

}

