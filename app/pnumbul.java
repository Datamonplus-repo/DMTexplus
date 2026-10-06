package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumbul extends GXProcedure
{
   public pnumbul( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumbul.class ), "" );
   }

   public pnumbul( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 )
   {
      pnumbul.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             short[] aP2 )
   {
      pnumbul.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumbul.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pnumbul.this.AV8BarAlbBul = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8BarAlbBul = (short)(0) ;
      /* Using cursor P00HV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1458BarAlbBul = P00HV2_A1458BarAlbBul[0] ;
         A129BarCod = P00HV2_A129BarCod[0] ;
         A132BarCodReo = P00HV2_A132BarCodReo[0] ;
         A130BarCodPar = P00HV2_A130BarCodPar[0] ;
         AV8BarAlbBul = A1458BarAlbBul ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8BarAlbBul = (short)(AV8BarAlbBul+10) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumbul.this.A396EmprCod;
      this.aP1[0] = pnumbul.this.A30AlbProCod;
      this.aP2[0] = pnumbul.this.AV8BarAlbBul;
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
      P00HV2_A396EmprCod = new String[] {""} ;
      P00HV2_A30AlbProCod = new long[1] ;
      P00HV2_A1458BarAlbBul = new short[1] ;
      P00HV2_A129BarCod = new int[1] ;
      P00HV2_A132BarCodReo = new byte[1] ;
      P00HV2_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumbul__default(),
         new Object[] {
             new Object[] {
            P00HV2_A396EmprCod, P00HV2_A30AlbProCod, P00HV2_A1458BarAlbBul, P00HV2_A129BarCod, P00HV2_A132BarCodReo, P00HV2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8BarAlbBul ;
   private short A1458BarAlbBul ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private short[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00HV2_A396EmprCod ;
   private long[] P00HV2_A30AlbProCod ;
   private short[] P00HV2_A1458BarAlbBul ;
   private int[] P00HV2_A129BarCod ;
   private byte[] P00HV2_A132BarCodReo ;
   private String[] P00HV2_A130BarCodPar ;
}

final  class pnumbul__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00HV2", "SELECT EmprCod, AlbProCod, BarAlbBul, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarAlbBul ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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

