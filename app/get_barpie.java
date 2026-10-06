package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_barpie extends GXProcedure
{
   public get_barpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_barpie.class ), "" );
   }

   public get_barpie( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 )
   {
      get_barpie.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 )
   {
      get_barpie.this.A396EmprCod = aP0;
      get_barpie.this.A129BarCod = aP1;
      get_barpie.this.A132BarCodReo = aP2;
      get_barpie.this.A130BarCodPar = aP3;
      get_barpie.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9barpie = 0 ;
      /* Using cursor P0ALF3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A199BarPie1 = P0ALF3_A199BarPie1[0] ;
         A365DisDes = P0ALF3_A365DisDes[0] ;
         A898BarPieNDes = P0ALF3_A898BarPieNDes[0] ;
         A199BarPie1 = P0ALF3_A199BarPie1[0] ;
         A898BarPieNDes = P0ALF3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV9barpie = (int)(AV9barpie+A198BarPie) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = get_barpie.this.AV9barpie;
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
      P0ALF3_A396EmprCod = new String[] {""} ;
      P0ALF3_A129BarCod = new int[1] ;
      P0ALF3_A132BarCodReo = new byte[1] ;
      P0ALF3_A130BarCodPar = new String[] {""} ;
      P0ALF3_A199BarPie1 = new short[1] ;
      P0ALF3_A365DisDes = new String[] {""} ;
      P0ALF3_A898BarPieNDes = new int[1] ;
      A365DisDes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.get_barpie__default(),
         new Object[] {
             new Object[] {
            P0ALF3_A396EmprCod, P0ALF3_A129BarCod, P0ALF3_A132BarCodReo, P0ALF3_A130BarCodPar, P0ALF3_A199BarPie1, P0ALF3_A365DisDes, P0ALF3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9barpie ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A365DisDes ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALF3_A396EmprCod ;
   private int[] P0ALF3_A129BarCod ;
   private byte[] P0ALF3_A132BarCodReo ;
   private String[] P0ALF3_A130BarCodPar ;
   private short[] P0ALF3_A199BarPie1 ;
   private String[] P0ALF3_A365DisDes ;
   private int[] P0ALF3_A898BarPieNDes ;
}

final  class get_barpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALF3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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

