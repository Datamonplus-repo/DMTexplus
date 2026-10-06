package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putil22 extends GXProcedure
{
   public putil22( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putil22.class ), "" );
   }

   public putil22( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      putil22.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = AV13EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      putil22.this.AV13EmprCod = GXv_char2[0] ;
      putil22.this.AV15EmprNom = GXv_char3[0] ;
      putil22.this.AV14UsurCod = GXv_char4[0] ;
      System.out.println( httpContext.getMessage( "Proceso de Actualizacion BarNumLot f(Hdr Minima)", "") );
      /* Using cursor P00PG2 */
      pr_default.execute(0, new Object[] {AV13EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P00PG2_A213BarSit[0] ;
         A396EmprCod = P00PG2_A396EmprCod[0] ;
         A129BarCod = P00PG2_A129BarCod[0] ;
         A132BarCodReo = P00PG2_A132BarCodReo[0] ;
         A130BarCodPar = P00PG2_A130BarCodPar[0] ;
         A2826BarNumLot = P00PG2_A2826BarNumLot[0] ;
         AV8BarCod = A129BarCod ;
         AV9BarCodReo = A132BarCodReo ;
         AV10BarCodPar = A130BarCodPar ;
         new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV8BarCod, AV9BarCodReo, AV10BarCodPar) ;
         A2826BarNumLot = AV8BarCod ;
         AV11Mensa = httpContext.getMessage( "Hdr Procesada ", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Numero Lote ", "") + GXutil.str( A2826BarNumLot, 8, 0) ;
         System.out.println( AV11Mensa );
         /* Using cursor P00PG3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A2826BarNumLot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Proceso Finalizado", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "putil22");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV13EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV15EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P00PG2_A213BarSit = new byte[1] ;
      P00PG2_A396EmprCod = new String[] {""} ;
      P00PG2_A129BarCod = new int[1] ;
      P00PG2_A132BarCodReo = new byte[1] ;
      P00PG2_A130BarCodPar = new String[] {""} ;
      P00PG2_A2826BarNumLot = new int[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV10BarCodPar = "" ;
      AV11Mensa = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.putil22__default(),
         new Object[] {
             new Object[] {
            P00PG2_A213BarSit, P00PG2_A396EmprCod, P00PG2_A129BarCod, P00PG2_A132BarCodReo, P00PG2_A130BarCodPar, P00PG2_A2826BarNumLot
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV9BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A2826BarNumLot ;
   private int AV8BarCod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV13EmprCod ;
   private String GXv_char2[] ;
   private String AV15EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10BarCodPar ;
   private String AV11Mensa ;
   private IDataStoreProvider pr_default ;
   private byte[] P00PG2_A213BarSit ;
   private String[] P00PG2_A396EmprCod ;
   private int[] P00PG2_A129BarCod ;
   private byte[] P00PG2_A132BarCodReo ;
   private String[] P00PG2_A130BarCodPar ;
   private int[] P00PG2_A2826BarNumLot ;
}

final  class putil22__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00PG2", "SELECT BarSit, EmprCod, BarCod, BarCodReo, BarCodPar, BarNumLot FROM TXPBARCAD WHERE (EmprCod = ? and BarSit >= 1) AND (BarSit <= 2) ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00PG3", "UPDATE TXPBARCAD SET BarNumLot=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

