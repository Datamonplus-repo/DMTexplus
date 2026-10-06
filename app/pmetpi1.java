package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmetpi1 extends GXProcedure
{
   public pmetpi1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmetpi1.class ), "" );
   }

   public pmetpi1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pmetpi1.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pmetpi1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmetpi1.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmetpi1.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmetpi1.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmetpi1.this.A2813MetPieCod = aP4[0];
      this.aP4 = aP4;
      pmetpi1.this.AV8Tipo = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00H52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2816MetPieEst = P00H52_A2816MetPieEst[0] ;
         A2809MetTerCod = P00H52_A2809MetTerCod[0] ;
         if ( GXutil.strcmp(AV8Tipo, httpContext.getMessage( "INS", "")) == 0 )
         {
            A2816MetPieEst = (byte)(1) ;
         }
         if ( GXutil.strcmp(AV8Tipo, httpContext.getMessage( "DEL", "")) == 0 )
         {
            A2816MetPieEst = (byte)(0) ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P00H53 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A2816MetPieEst), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         if (true) break;
         /* Using cursor P00H54 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A2816MetPieEst), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmetpi1.this.A396EmprCod;
      this.aP1[0] = pmetpi1.this.A129BarCod;
      this.aP2[0] = pmetpi1.this.A132BarCodReo;
      this.aP3[0] = pmetpi1.this.A130BarCodPar;
      this.aP4[0] = pmetpi1.this.A2813MetPieCod;
      this.aP5[0] = pmetpi1.this.AV8Tipo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmetpi1");
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
      P00H52_A396EmprCod = new String[] {""} ;
      P00H52_A129BarCod = new int[1] ;
      P00H52_A132BarCodReo = new byte[1] ;
      P00H52_A130BarCodPar = new String[] {""} ;
      P00H52_A2813MetPieCod = new String[] {""} ;
      P00H52_A2816MetPieEst = new byte[1] ;
      P00H52_A2809MetTerCod = new String[] {""} ;
      A2809MetTerCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmetpi1__default(),
         new Object[] {
             new Object[] {
            P00H52_A396EmprCod, P00H52_A129BarCod, P00H52_A132BarCodReo, P00H52_A130BarCodPar, P00H52_A2813MetPieCod, P00H52_A2816MetPieEst, P00H52_A2809MetTerCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2816MetPieEst ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String AV8Tipo ;
   private String scmdbuf ;
   private String A2809MetTerCod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00H52_A396EmprCod ;
   private int[] P00H52_A129BarCod ;
   private byte[] P00H52_A132BarCodReo ;
   private String[] P00H52_A130BarCodPar ;
   private String[] P00H52_A2813MetPieCod ;
   private byte[] P00H52_A2816MetPieEst ;
   private String[] P00H52_A2809MetTerCod ;
}

final  class pmetpi1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00H52", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieEst, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00H53", "UPDATE TXPLMETPI SET MetPieEst=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
         ,new UpdateCursor("P00H54", "UPDATE TXPLMETPI SET MetPieEst=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
      }
   }

}

