package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pjbmpiebod extends GXProcedure
{
   public pjbmpiebod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pjbmpiebod.class ), "" );
   }

   public pjbmpiebod( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pjbmpiebod.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pjbmpiebod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pjbmpiebod.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pjbmpiebod.this.A200BarPieCod = aP2[0];
      this.aP2 = aP2;
      pjbmpiebod.this.AV8Ok = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P01K92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P01K92_A129BarCod[0] ;
         A132BarCodReo = P01K92_A132BarCodReo[0] ;
         A130BarCodPar = P01K92_A130BarCodPar[0] ;
         A213BarSit = P01K92_A213BarSit[0] ;
         A205BarPieMet = P01K92_A205BarPieMet[0] ;
         A213BarSit = P01K92_A213BarSit[0] ;
         AV11GXLvl1 = (byte)(1) ;
         AV8Ok = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8Ok = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pjbmpiebod.this.A396EmprCod;
      this.aP1[0] = pjbmpiebod.this.A44AlbRecCod;
      this.aP2[0] = pjbmpiebod.this.A200BarPieCod;
      this.aP3[0] = pjbmpiebod.this.AV8Ok;
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
      P01K92_A129BarCod = new int[1] ;
      P01K92_A132BarCodReo = new byte[1] ;
      P01K92_A130BarCodPar = new String[] {""} ;
      P01K92_A396EmprCod = new String[] {""} ;
      P01K92_A200BarPieCod = new String[] {""} ;
      P01K92_A44AlbRecCod = new int[1] ;
      P01K92_A213BarSit = new byte[1] ;
      P01K92_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pjbmpiebod__default(),
         new Object[] {
             new Object[] {
            P01K92_A129BarCod, P01K92_A132BarCodReo, P01K92_A130BarCodPar, P01K92_A396EmprCod, P01K92_A200BarPieCod, P01K92_A44AlbRecCod, P01K92_A213BarSit, P01K92_A205BarPieMet
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Ok ;
   private byte AV11GXLvl1 ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private java.math.BigDecimal A205BarPieMet ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P01K92_A129BarCod ;
   private byte[] P01K92_A132BarCodReo ;
   private String[] P01K92_A130BarCodPar ;
   private String[] P01K92_A396EmprCod ;
   private String[] P01K92_A200BarPieCod ;
   private int[] P01K92_A44AlbRecCod ;
   private byte[] P01K92_A213BarSit ;
   private java.math.BigDecimal[] P01K92_A205BarPieMet ;
}

final  class pjbmpiebod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01K92", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.BarPieCod, T1.AlbRecCod, T2.BarSit, T1.BarPieMet FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbRecCod = ?) AND (T1.BarPieCod = ?) AND (T2.BarSit = 30) ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

