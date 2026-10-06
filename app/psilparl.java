package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psilparl extends GXProcedure
{
   public psilparl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psilparl.class ), "" );
   }

   public psilparl( int remoteHandle ,
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
      psilparl.this.aP6 = new short[] {0};
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
      psilparl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psilparl.this.AV15Nouso1 = aP1[0];
      this.aP1 = aP1;
      psilparl.this.AV16Nouso2 = aP2[0];
      this.aP2 = aP2;
      psilparl.this.A129BarCod = aP3[0];
      this.aP3 = aP3;
      psilparl.this.A132BarCodReo = aP4[0];
      this.aP4 = aP4;
      psilparl.this.A130BarCodPar = aP5[0];
      this.aP5 = aP5;
      psilparl.this.A194BarOrdLin = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01SK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A561HisProLin = P01SK2_A561HisProLin[0] ;
         A557HisProF = P01SK2_A557HisProF[0] ;
         A556HisProEst = P01SK2_A556HisProEst[0] ;
         A4704HisProNPar = P01SK2_A4704HisProNPar[0] ;
         A602MaqCod = P01SK2_A602MaqCod[0] ;
         A558HisProFec = P01SK2_A558HisProFec[0] ;
         A557HisProF = httpContext.getMessage( "S", "") ;
         A556HisProEst = (byte)(1) ;
         AV19BarCod = A129BarCod ;
         AV21BarCodReo = A132BarCodReo ;
         AV20BarCodPar = A130BarCodPar ;
         AV17HisProNpar = A4704HisProNPar ;
         AV18BarOrdLin = A194BarOrdLin ;
         /* Using cursor P01SK3 */
         pr_default.execute(1, new Object[] {A557HisProF, Byte.valueOf(A556HisProEst), A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psilparl.this.A396EmprCod;
      this.aP1[0] = psilparl.this.AV15Nouso1;
      this.aP2[0] = psilparl.this.AV16Nouso2;
      this.aP3[0] = psilparl.this.A129BarCod;
      this.aP4[0] = psilparl.this.A132BarCodReo;
      this.aP5[0] = psilparl.this.A130BarCodPar;
      this.aP6[0] = psilparl.this.A194BarOrdLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "psilparl");
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
      P01SK2_A396EmprCod = new String[] {""} ;
      P01SK2_A129BarCod = new int[1] ;
      P01SK2_A132BarCodReo = new byte[1] ;
      P01SK2_A130BarCodPar = new String[] {""} ;
      P01SK2_A194BarOrdLin = new short[1] ;
      P01SK2_A561HisProLin = new int[1] ;
      P01SK2_A557HisProF = new String[] {""} ;
      P01SK2_A556HisProEst = new byte[1] ;
      P01SK2_A4704HisProNPar = new int[1] ;
      P01SK2_A602MaqCod = new String[] {""} ;
      P01SK2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      A557HisProF = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      AV20BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psilparl__default(),
         new Object[] {
             new Object[] {
            P01SK2_A396EmprCod, P01SK2_A129BarCod, P01SK2_A132BarCodReo, P01SK2_A130BarCodPar, P01SK2_A194BarOrdLin, P01SK2_A561HisProLin, P01SK2_A557HisProF, P01SK2_A556HisProEst, P01SK2_A4704HisProNPar, P01SK2_A602MaqCod,
            P01SK2_A558HisProFec
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A556HisProEst ;
   private byte AV21BarCodReo ;
   private short A194BarOrdLin ;
   private short AV18BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int A4704HisProNPar ;
   private int AV19BarCod ;
   private int AV17HisProNpar ;
   private String A396EmprCod ;
   private String AV15Nouso1 ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A557HisProF ;
   private String A602MaqCod ;
   private String AV20BarCodPar ;
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
   private String[] P01SK2_A396EmprCod ;
   private int[] P01SK2_A129BarCod ;
   private byte[] P01SK2_A132BarCodReo ;
   private String[] P01SK2_A130BarCodPar ;
   private short[] P01SK2_A194BarOrdLin ;
   private int[] P01SK2_A561HisProLin ;
   private String[] P01SK2_A557HisProF ;
   private byte[] P01SK2_A556HisProEst ;
   private int[] P01SK2_A4704HisProNPar ;
   private String[] P01SK2_A602MaqCod ;
   private java.util.Date[] P01SK2_A558HisProFec ;
}

final  class psilparl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01SK2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProLin, HisProF, HisProEst, HisProNPar, MaqCod, HisProFec FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01SK3", "UPDATE TXPLHIPRO SET HisProF=?, HisProEst=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

