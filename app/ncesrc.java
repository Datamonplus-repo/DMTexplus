package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ncesrc extends GXProcedure
{
   public ncesrc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ncesrc.class ), "" );
   }

   public ncesrc( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 )
   {
      ncesrc.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             byte[] aP4 )
   {
      ncesrc.this.AV8emprcod = aP0;
      ncesrc.this.AV9barcod = aP1;
      ncesrc.this.AV10barcodreo = aP2;
      ncesrc.this.AV11barcodpar = aP3;
      ncesrc.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14BarEstreoanterior = (byte)(0) ;
      AV13barcodreoanterior = (byte)(AV10barcodreo-1) ;
      /* Using cursor P0AH82 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV13barcodreoanterior), AV11barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0AH82_A130BarCodPar[0] ;
         A132BarCodReo = P0AH82_A132BarCodReo[0] ;
         A129BarCod = P0AH82_A129BarCod[0] ;
         A396EmprCod = P0AH82_A396EmprCod[0] ;
         A148BarEstReo = P0AH82_A148BarEstReo[0] ;
         System.out.println( httpContext.getMessage( "&BarEstreoanterior=", "")+A148BarEstReo );
         AV14BarEstreoanterior = A148BarEstReo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = ncesrc.this.AV14BarEstreoanterior;
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
      P0AH82_A130BarCodPar = new String[] {""} ;
      P0AH82_A132BarCodReo = new byte[1] ;
      P0AH82_A129BarCod = new int[1] ;
      P0AH82_A396EmprCod = new String[] {""} ;
      P0AH82_A148BarEstReo = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ncesrc__default(),
         new Object[] {
             new Object[] {
            P0AH82_A130BarCodPar, P0AH82_A132BarCodReo, P0AH82_A129BarCod, P0AH82_A396EmprCod, P0AH82_A148BarEstReo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte AV14BarEstreoanterior ;
   private byte AV13barcodreoanterior ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private short Gx_err ;
   private int AV9barcod ;
   private int A129BarCod ;
   private String AV8emprcod ;
   private String AV11barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AH82_A130BarCodPar ;
   private byte[] P0AH82_A132BarCodReo ;
   private int[] P0AH82_A129BarCod ;
   private String[] P0AH82_A396EmprCod ;
   private byte[] P0AH82_A148BarEstReo ;
}

final  class ncesrc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AH82", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarEstReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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

