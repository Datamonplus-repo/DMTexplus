package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psilpar extends GXProcedure
{
   public psilpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psilpar.class ), "" );
   }

   public psilpar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            java.util.Date[] aP2 ,
                            int[] aP3 ,
                            byte[] aP4 ,
                            String[] aP5 )
   {
      psilpar.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      psilpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psilpar.this.AV15Nouso1 = aP1[0];
      this.aP1 = aP1;
      psilpar.this.AV16Nouso2 = aP2[0];
      this.aP2 = aP2;
      psilpar.this.A129BarCod = aP3[0];
      this.aP3 = aP3;
      psilpar.this.A132BarCodReo = aP4[0];
      this.aP4 = aP4;
      psilpar.this.A130BarCodPar = aP5[0];
      this.aP5 = aP5;
      psilpar.this.A194BarOrdLin = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00782 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A561HisProLin = P00782_A561HisProLin[0] ;
         A557HisProF = P00782_A557HisProF[0] ;
         A602MaqCod = P00782_A602MaqCod[0] ;
         A558HisProFec = P00782_A558HisProFec[0] ;
         A557HisProF = httpContext.getMessage( "S", "") ;
         /* Using cursor P00783 */
         pr_default.execute(1, new Object[] {A557HisProF, A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psilpar.this.A396EmprCod;
      this.aP1[0] = psilpar.this.AV15Nouso1;
      this.aP2[0] = psilpar.this.AV16Nouso2;
      this.aP3[0] = psilpar.this.A129BarCod;
      this.aP4[0] = psilpar.this.A132BarCodReo;
      this.aP5[0] = psilpar.this.A130BarCodPar;
      this.aP6[0] = psilpar.this.A194BarOrdLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "psilpar");
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
      P00782_A396EmprCod = new String[] {""} ;
      P00782_A129BarCod = new int[1] ;
      P00782_A132BarCodReo = new byte[1] ;
      P00782_A130BarCodPar = new String[] {""} ;
      P00782_A194BarOrdLin = new short[1] ;
      P00782_A561HisProLin = new int[1] ;
      P00782_A557HisProF = new String[] {""} ;
      P00782_A602MaqCod = new String[] {""} ;
      P00782_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      A557HisProF = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psilpar__default(),
         new Object[] {
             new Object[] {
            P00782_A396EmprCod, P00782_A129BarCod, P00782_A132BarCodReo, P00782_A130BarCodPar, P00782_A194BarOrdLin, P00782_A561HisProLin, P00782_A557HisProF, P00782_A602MaqCod, P00782_A558HisProFec
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String AV15Nouso1 ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A557HisProF ;
   private String A602MaqCod ;
   private java.util.Date AV16Nouso2 ;
   private java.util.Date A558HisProFec ;
   private short[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00782_A396EmprCod ;
   private int[] P00782_A129BarCod ;
   private byte[] P00782_A132BarCodReo ;
   private String[] P00782_A130BarCodPar ;
   private short[] P00782_A194BarOrdLin ;
   private int[] P00782_A561HisProLin ;
   private String[] P00782_A557HisProF ;
   private String[] P00782_A602MaqCod ;
   private java.util.Date[] P00782_A558HisProFec ;
}

final  class psilpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00782", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProLin, HisProF, MaqCod, HisProFec FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00783", "UPDATE TXPLHIPRO SET HisProF=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

