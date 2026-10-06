package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentofacturable extends GXProcedure
{
   public documentofacturable( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentofacturable.class ), "" );
   }

   public documentofacturable( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            long aP1 )
   {
      documentofacturable.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             short[] aP2 )
   {
      documentofacturable.this.A396EmprCod = aP0;
      documentofacturable.this.A30AlbProCod = aP1;
      documentofacturable.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Facturable = (short)(1) ;
      /* Using cursor P09ZX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3391AlbSer = P09ZX2_A3391AlbSer[0] ;
         A32AlbProEsp = P09ZX2_A32AlbProEsp[0] ;
         A129BarCod = P09ZX2_A129BarCod[0] ;
         A132BarCodReo = P09ZX2_A132BarCodReo[0] ;
         A130BarCodPar = P09ZX2_A130BarCodPar[0] ;
         if ( ( A32AlbProEsp > 0 ) && ( A32AlbProEsp < 10 ) )
         {
            AV8Facturable = (short)(0) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentofacturable.this.AV8Facturable;
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
      P09ZX2_A396EmprCod = new String[] {""} ;
      P09ZX2_A30AlbProCod = new long[1] ;
      P09ZX2_A3391AlbSer = new String[] {""} ;
      P09ZX2_A32AlbProEsp = new byte[1] ;
      P09ZX2_A129BarCod = new int[1] ;
      P09ZX2_A132BarCodReo = new byte[1] ;
      P09ZX2_A130BarCodPar = new String[] {""} ;
      A3391AlbSer = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.documentofacturable__default(),
         new Object[] {
             new Object[] {
            P09ZX2_A396EmprCod, P09ZX2_A30AlbProCod, P09ZX2_A3391AlbSer, P09ZX2_A32AlbProEsp, P09ZX2_A129BarCod, P09ZX2_A132BarCodReo, P09ZX2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private short AV8Facturable ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3391AlbSer ;
   private String A130BarCodPar ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZX2_A396EmprCod ;
   private long[] P09ZX2_A30AlbProCod ;
   private String[] P09ZX2_A3391AlbSer ;
   private byte[] P09ZX2_A32AlbProEsp ;
   private int[] P09ZX2_A129BarCod ;
   private byte[] P09ZX2_A132BarCodReo ;
   private String[] P09ZX2_A130BarCodPar ;
}

final  class documentofacturable__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZX2", "SELECT EmprCod, AlbProCod, AlbSer, AlbProEsp, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               return;
      }
   }

}

