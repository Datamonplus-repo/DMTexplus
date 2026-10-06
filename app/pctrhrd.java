package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrhrd extends GXProcedure
{
   public pctrhrd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrhrd.class ), "" );
   }

   public pctrhrd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      pctrhrd.this.aP4 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             long[] aP4 )
   {
      pctrhrd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrhrd.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pctrhrd.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrhrd.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrhrd.this.AV15AlbProCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00F12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A32AlbProEsp = P00F12_A32AlbProEsp[0] ;
         A30AlbProCod = P00F12_A30AlbProCod[0] ;
         A2242AlbSec = P00F12_A2242AlbSec[0] ;
         A2242AlbSec = P00F12_A2242AlbSec[0] ;
         if ( A30AlbProCod != AV15AlbProCod )
         {
            if ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "T", "")) != 0 )
            {
               AV16Texto = httpContext.getMessage( "Atencion. HDR en Albaran Externo ", "") + GXutil.str( A30AlbProCod, 8, 0) ;
               httpContext.GX_msglist.addItem(AV16Texto);
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrhrd.this.A396EmprCod;
      this.aP1[0] = pctrhrd.this.A129BarCod;
      this.aP2[0] = pctrhrd.this.A132BarCodReo;
      this.aP3[0] = pctrhrd.this.A130BarCodPar;
      this.aP4[0] = pctrhrd.this.AV15AlbProCod;
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
      P00F12_A396EmprCod = new String[] {""} ;
      P00F12_A129BarCod = new int[1] ;
      P00F12_A132BarCodReo = new byte[1] ;
      P00F12_A130BarCodPar = new String[] {""} ;
      P00F12_A32AlbProEsp = new byte[1] ;
      P00F12_A30AlbProCod = new long[1] ;
      P00F12_A2242AlbSec = new String[] {""} ;
      A2242AlbSec = "" ;
      AV16Texto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrhrd__default(),
         new Object[] {
             new Object[] {
            P00F12_A396EmprCod, P00F12_A129BarCod, P00F12_A132BarCodReo, P00F12_A130BarCodPar, P00F12_A32AlbProEsp, P00F12_A30AlbProCod, P00F12_A2242AlbSec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private short Gx_err ;
   private int A129BarCod ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2242AlbSec ;
   private String AV16Texto ;
   private long[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00F12_A396EmprCod ;
   private int[] P00F12_A129BarCod ;
   private byte[] P00F12_A132BarCodReo ;
   private String[] P00F12_A130BarCodPar ;
   private byte[] P00F12_A32AlbProEsp ;
   private long[] P00F12_A30AlbProCod ;
   private String[] P00F12_A2242AlbSec ;
}

final  class pctrhrd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00F12", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProEsp, T1.AlbProCod, T2.AlbSec FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

