package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarest0 extends GXProcedure
{
   public pbarest0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarest0.class ), "" );
   }

   public pbarest0( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pbarest0.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pbarest0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarest0.this.AV9Usurcod = aP1[0];
      this.aP1 = aP1;
      pbarest0.this.AV10Station = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P046I2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5053BarBp12 = P046I2_A5053BarBp12[0] ;
         n5053BarBp12 = P046I2_n5053BarBp12[0] ;
         A146BarEst = P046I2_A146BarEst[0] ;
         A130BarCodPar = P046I2_A130BarCodPar[0] ;
         A132BarCodReo = P046I2_A132BarCodReo[0] ;
         A129BarCod = P046I2_A129BarCod[0] ;
         A146BarEst = (byte)(0) ;
         AV8Inc_obs = httpContext.getMessage( "CAMBIO BAREST = 2, HR= ", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) + httpContext.getMessage( "Barest=", "") + GXutil.str( A146BarEst, 1, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV14Pgmname, AV9Usurcod, AV10Station, AV8Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P046I3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A146BarEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarest0.this.A396EmprCod;
      this.aP1[0] = pbarest0.this.AV9Usurcod;
      this.aP2[0] = pbarest0.this.AV10Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbarest0");
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
      P046I2_A396EmprCod = new String[] {""} ;
      P046I2_A5053BarBp12 = new short[1] ;
      P046I2_n5053BarBp12 = new boolean[] {false} ;
      P046I2_A146BarEst = new byte[1] ;
      P046I2_A130BarCodPar = new String[] {""} ;
      P046I2_A132BarCodReo = new byte[1] ;
      P046I2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      AV8Inc_obs = "" ;
      AV14Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarest0__default(),
         new Object[] {
             new Object[] {
            P046I2_A396EmprCod, P046I2_A5053BarBp12, P046I2_n5053BarBp12, P046I2_A146BarEst, P046I2_A130BarCodPar, P046I2_A132BarCodReo, P046I2_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      AV14Pgmname = "PBarest0" ;
      /* GeneXus formulas. */
      AV14Pgmname = "PBarest0" ;
      Gx_err = (short)(0) ;
   }

   private byte A146BarEst ;
   private byte A132BarCodReo ;
   private short A5053BarBp12 ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV9Usurcod ;
   private String AV10Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV14Pgmname ;
   private boolean n5053BarBp12 ;
   private String AV8Inc_obs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P046I2_A396EmprCod ;
   private short[] P046I2_A5053BarBp12 ;
   private boolean[] P046I2_n5053BarBp12 ;
   private byte[] P046I2_A146BarEst ;
   private String[] P046I2_A130BarCodPar ;
   private byte[] P046I2_A132BarCodReo ;
   private int[] P046I2_A129BarCod ;
}

final  class pbarest0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P046I2", "SELECT EmprCod, BarBp12, BarEst, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = ? and BarBp12 = 9999 ORDER BY EmprCod, BarBp12 ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P046I3", "UPDATE TXPBARCAD SET BarEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

