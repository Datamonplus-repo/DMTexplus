package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controldatoshdragrupadas extends GXProcedure
{
   public controldatoshdragrupadas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controldatoshdragrupadas.class ), "" );
   }

   public controldatoshdragrupadas( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String[] AV8tabla_hdrs ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, AV8tabla_hdrs, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String[] AV8tabla_hdrs ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      controldatoshdragrupadas.this.AV13Emprcod = aP0;
      controldatoshdragrupadas.this.AV8tabla_hdrs = AV8tabla_hdrs;
      controldatoshdragrupadas.this.AV17usurcod = aP2;
      controldatoshdragrupadas.this.AV18station = aP3;
      controldatoshdragrupadas.this.AV19PgmnameIN = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9i = (short)(1) ;
      while ( AV9i <= 100 )
      {
         if ( GXutil.strcmp(AV8tabla_hdrs[AV9i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV14BarAgrCod = (int)(GXutil.lval( GXutil.substring( AV8tabla_hdrs[AV9i-1], 1, 8))) ;
         AV15BarAgrReo = (byte)(GXutil.lval( GXutil.substring( AV8tabla_hdrs[AV9i-1], 9, 1))) ;
         AV16BarAgrPar = GXutil.substring( AV8tabla_hdrs[AV9i-1], 10, 1) ;
         /* Using cursor P0AJP3 */
         pr_default.execute(0, new Object[] {AV13Emprcod, Integer.valueOf(AV14BarAgrCod), Byte.valueOf(AV15BarAgrReo), AV16BarAgrPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P0AJP3_A130BarCodPar[0] ;
            A132BarCodReo = P0AJP3_A132BarCodReo[0] ;
            A129BarCod = P0AJP3_A129BarCod[0] ;
            A396EmprCod = P0AJP3_A396EmprCod[0] ;
            A252CliCod = P0AJP3_A252CliCod[0] ;
            n252CliCod = P0AJP3_n252CliCod[0] ;
            A135BarColNom = P0AJP3_A135BarColNom[0] ;
            A136BarColNum = P0AJP3_A136BarColNum[0] ;
            A143BarDisNum = P0AJP3_A143BarDisNum[0] ;
            A212BarSer = P0AJP3_A212BarSer[0] ;
            A1652BarSerDsc = P0AJP3_A1652BarSerDsc[0] ;
            A166BarKgm = P0AJP3_A166BarKgm[0] ;
            A184BarMtr = P0AJP3_A184BarMtr[0] ;
            A199BarPie1 = P0AJP3_A199BarPie1[0] ;
            A365DisDes = P0AJP3_A365DisDes[0] ;
            A898BarPieNDes = P0AJP3_A898BarPieNDes[0] ;
            A166BarKgm = P0AJP3_A166BarKgm[0] ;
            A184BarMtr = P0AJP3_A184BarMtr[0] ;
            A199BarPie1 = P0AJP3_A199BarPie1[0] ;
            A898BarPieNDes = P0AJP3_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            new app.pedidosclientesindetalle.controldatosbaragr(remoteHandle, context).execute( AV13Emprcod, AV14BarAgrCod, AV15BarAgrReo, AV16BarAgrPar, A252CliCod, A135BarColNom, A136BarColNum, A143BarDisNum, A212BarSer, A1652BarSerDsc, A166BarKgm, (short)(A198BarPie), A184BarMtr, AV17usurcod, AV18station, AV19PgmnameIN) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV9i = (short)(AV9i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16BarAgrPar = "" ;
      scmdbuf = "" ;
      P0AJP3_A130BarCodPar = new String[] {""} ;
      P0AJP3_A132BarCodReo = new byte[1] ;
      P0AJP3_A129BarCod = new int[1] ;
      P0AJP3_A396EmprCod = new String[] {""} ;
      P0AJP3_A252CliCod = new int[1] ;
      P0AJP3_n252CliCod = new boolean[] {false} ;
      P0AJP3_A135BarColNom = new String[] {""} ;
      P0AJP3_A136BarColNum = new int[1] ;
      P0AJP3_A143BarDisNum = new String[] {""} ;
      P0AJP3_A212BarSer = new String[] {""} ;
      P0AJP3_A1652BarSerDsc = new String[] {""} ;
      P0AJP3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJP3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJP3_A199BarPie1 = new short[1] ;
      P0AJP3_A365DisDes = new String[] {""} ;
      P0AJP3_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.controldatoshdragrupadas__default(),
         new Object[] {
             new Object[] {
            P0AJP3_A130BarCodPar, P0AJP3_A132BarCodReo, P0AJP3_A129BarCod, P0AJP3_A396EmprCod, P0AJP3_A252CliCod, P0AJP3_n252CliCod, P0AJP3_A135BarColNom, P0AJP3_A136BarColNum, P0AJP3_A143BarDisNum, P0AJP3_A212BarSer,
            P0AJP3_A1652BarSerDsc, P0AJP3_A166BarKgm, P0AJP3_A184BarMtr, P0AJP3_A199BarPie1, P0AJP3_A365DisDes, P0AJP3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15BarAgrReo ;
   private byte A132BarCodReo ;
   private short AV9i ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV14BarAgrCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV13Emprcod ;
   private String AV8tabla_hdrs[] ;
   private String AV17usurcod ;
   private String AV18station ;
   private String AV16BarAgrPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A365DisDes ;
   private boolean n252CliCod ;
   private String AV19PgmnameIN ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJP3_A130BarCodPar ;
   private byte[] P0AJP3_A132BarCodReo ;
   private int[] P0AJP3_A129BarCod ;
   private String[] P0AJP3_A396EmprCod ;
   private int[] P0AJP3_A252CliCod ;
   private boolean[] P0AJP3_n252CliCod ;
   private String[] P0AJP3_A135BarColNom ;
   private int[] P0AJP3_A136BarColNum ;
   private String[] P0AJP3_A143BarDisNum ;
   private String[] P0AJP3_A212BarSer ;
   private String[] P0AJP3_A1652BarSerDsc ;
   private java.math.BigDecimal[] P0AJP3_A166BarKgm ;
   private java.math.BigDecimal[] P0AJP3_A184BarMtr ;
   private short[] P0AJP3_A199BarPie1 ;
   private String[] P0AJP3_A365DisDes ;
   private int[] P0AJP3_A898BarPieNDes ;
}

final  class controldatoshdragrupadas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJP3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarColNom, T1.BarColNum, T1.BarDisNum, T1.BarSer, T1.BarSerDsc, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((int[]) buf[15])[0] = rslt.getInt(15);
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
      }
   }

}

