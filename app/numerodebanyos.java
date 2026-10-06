package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class numerodebanyos extends GXProcedure
{
   public numerodebanyos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( numerodebanyos.class ), "" );
   }

   public numerodebanyos( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            String aP4 )
   {
      numerodebanyos.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short[] aP5 )
   {
      numerodebanyos.this.AV9EmprCod = aP0;
      numerodebanyos.this.AV10BarCod = aP1;
      numerodebanyos.this.AV11BarCodReo = aP2;
      numerodebanyos.this.AV12BarCodPar = aP3;
      numerodebanyos.this.AV13HreMaqCod = aP4;
      numerodebanyos.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TotBanyos = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P0ARC2 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar, AV13HreMaqCod});
      cV8TotBanyos = P0ARC2_AV8TotBanyos[0] ;
      pr_default.close(0);
      AV8TotBanyos = (short)(AV8TotBanyos+cV8TotBanyos*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = numerodebanyos.this.AV8TotBanyos;
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
      P0ARC2_AV8TotBanyos = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.numerodebanyos__default(),
         new Object[] {
             new Object[] {
            P0ARC2_AV8TotBanyos
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodReo ;
   private short AV8TotBanyos ;
   private short cV8TotBanyos ;
   private short Gx_err ;
   private int AV10BarCod ;
   private String AV9EmprCod ;
   private String AV12BarCodPar ;
   private String AV13HreMaqCod ;
   private String scmdbuf ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P0ARC2_AV8TotBanyos ;
}

final  class numerodebanyos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ARC2", "SELECT COUNT(*) FROM TXPHISREM WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?) AND (HreMaqCod = ?) AND (HreAcab = 'S') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
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
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

