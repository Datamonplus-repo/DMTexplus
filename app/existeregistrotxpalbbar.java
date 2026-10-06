package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existeregistrotxpalbbar extends GXProcedure
{
   public existeregistrotxpalbbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existeregistrotxpalbbar.class ), "" );
   }

   public existeregistrotxpalbbar( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              long aP1 ,
                              int aP2 ,
                              byte aP3 ,
                              String aP4 )
   {
      existeregistrotxpalbbar.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             boolean[] aP5 )
   {
      existeregistrotxpalbbar.this.A396EmprCod = aP0;
      existeregistrotxpalbbar.this.A30AlbProCod = aP1;
      existeregistrotxpalbbar.this.AV99BarCod = aP2;
      existeregistrotxpalbbar.this.AV21BarCodReo = aP3;
      existeregistrotxpalbbar.this.AV20BarCodPar = aP4;
      existeregistrotxpalbbar.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV100ExisteRegistro = false ;
      /* Using cursor P08OE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(AV99BarCod), Byte.valueOf(AV21BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P08OE2_A130BarCodPar[0] ;
         A132BarCodReo = P08OE2_A132BarCodReo[0] ;
         A129BarCod = P08OE2_A129BarCod[0] ;
         AV100ExisteRegistro = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = existeregistrotxpalbbar.this.AV100ExisteRegistro;
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
      P08OE2_A396EmprCod = new String[] {""} ;
      P08OE2_A30AlbProCod = new long[1] ;
      P08OE2_A130BarCodPar = new String[] {""} ;
      P08OE2_A132BarCodReo = new byte[1] ;
      P08OE2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.existeregistrotxpalbbar__default(),
         new Object[] {
             new Object[] {
            P08OE2_A396EmprCod, P08OE2_A30AlbProCod, P08OE2_A130BarCodPar, P08OE2_A132BarCodReo, P08OE2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21BarCodReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV99BarCod ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV20BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private boolean AV100ExisteRegistro ;
   private boolean[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P08OE2_A396EmprCod ;
   private long[] P08OE2_A30AlbProCod ;
   private String[] P08OE2_A130BarCodPar ;
   private byte[] P08OE2_A132BarCodReo ;
   private int[] P08OE2_A129BarCod ;
}

final  class existeregistrotxpalbbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OE2", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

