package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psicier extends GXProcedure
{
   public psicier( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psicier.class ), "" );
   }

   public psicier( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      psicier.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      psicier.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psicier.this.A1933BarCodTin = aP1[0];
      this.aP1 = aP1;
      psicier.this.A1934BarReoTin = aP2[0];
      this.aP2 = aP2;
      psicier.this.A1935BarParTin = aP3[0];
      this.aP3 = aP3;
      psicier.this.AV8F_cierre = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8F_cierre = (byte)(0) ;
      /* Using cursor P01U92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n1933BarCodTin), Integer.valueOf(A1933BarCodTin), Boolean.valueOf(n1934BarReoTin), Byte.valueOf(A1934BarReoTin), Boolean.valueOf(n1935BarParTin), A1935BarParTin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3646EstTinAny = P01U92_A3646EstTinAny[0] ;
         A3647EstTinMes = P01U92_A3647EstTinMes[0] ;
         A3648EstTinDia = P01U92_A3648EstTinDia[0] ;
         A1929EstTinNr = P01U92_A1929EstTinNr[0] ;
         AV8F_cierre = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psicier.this.A396EmprCod;
      this.aP1[0] = psicier.this.A1933BarCodTin;
      this.aP2[0] = psicier.this.A1934BarReoTin;
      this.aP3[0] = psicier.this.A1935BarParTin;
      this.aP4[0] = psicier.this.AV8F_cierre;
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
      P01U92_A396EmprCod = new String[] {""} ;
      P01U92_A1933BarCodTin = new int[1] ;
      P01U92_n1933BarCodTin = new boolean[] {false} ;
      P01U92_A1934BarReoTin = new byte[1] ;
      P01U92_n1934BarReoTin = new boolean[] {false} ;
      P01U92_A1935BarParTin = new String[] {""} ;
      P01U92_n1935BarParTin = new boolean[] {false} ;
      P01U92_A3646EstTinAny = new short[1] ;
      P01U92_A3647EstTinMes = new byte[1] ;
      P01U92_A3648EstTinDia = new byte[1] ;
      P01U92_A1929EstTinNr = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psicier__default(),
         new Object[] {
             new Object[] {
            P01U92_A396EmprCod, P01U92_A1933BarCodTin, P01U92_n1933BarCodTin, P01U92_A1934BarReoTin, P01U92_n1934BarReoTin, P01U92_A1935BarParTin, P01U92_n1935BarParTin, P01U92_A3646EstTinAny, P01U92_A3647EstTinMes, P01U92_A3648EstTinDia,
            P01U92_A1929EstTinNr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1934BarReoTin ;
   private byte AV8F_cierre ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private short A3646EstTinAny ;
   private short A1929EstTinNr ;
   private short Gx_err ;
   private int A1933BarCodTin ;
   private String A396EmprCod ;
   private String A1935BarParTin ;
   private String scmdbuf ;
   private boolean n1933BarCodTin ;
   private boolean n1934BarReoTin ;
   private boolean n1935BarParTin ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01U92_A396EmprCod ;
   private int[] P01U92_A1933BarCodTin ;
   private boolean[] P01U92_n1933BarCodTin ;
   private byte[] P01U92_A1934BarReoTin ;
   private boolean[] P01U92_n1934BarReoTin ;
   private String[] P01U92_A1935BarParTin ;
   private boolean[] P01U92_n1935BarParTin ;
   private short[] P01U92_A3646EstTinAny ;
   private byte[] P01U92_A3647EstTinMes ;
   private byte[] P01U92_A3648EstTinDia ;
   private short[] P01U92_A1929EstTinNr ;
}

final  class psicier__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01U92", "SELECT EmprCod, BarCodTin, BarReoTin, BarParTin, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ? ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((short[]) buf[10])[0] = rslt.getShort(8);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
      }
   }

}

