package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasesfin extends GXProcedure
{
   public pfasesfin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasesfin.class ), "" );
   }

   public pfasesfin( int remoteHandle ,
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
      pfasesfin.this.aP4 = new byte[] {0};
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
      pfasesfin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasesfin.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfasesfin.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasesfin.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasesfin.this.AV8Salida = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Salida = (byte)(0) ;
      /* Using cursor P03KR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = P03KR2_A153BarFasEst[0] ;
         A152BarFasCon = P03KR2_A152BarFasCon[0] ;
         A194BarOrdLin = P03KR2_A194BarOrdLin[0] ;
         A758ProCod = P03KR2_A758ProCod[0] ;
         if ( ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 ) && ( A153BarFasEst == 2 ) )
         {
            AV8Salida = (byte)(1) ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasesfin.this.A396EmprCod;
      this.aP1[0] = pfasesfin.this.A129BarCod;
      this.aP2[0] = pfasesfin.this.A132BarCodReo;
      this.aP3[0] = pfasesfin.this.A130BarCodPar;
      this.aP4[0] = pfasesfin.this.AV8Salida;
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
      P03KR2_A396EmprCod = new String[] {""} ;
      P03KR2_A129BarCod = new int[1] ;
      P03KR2_A132BarCodReo = new byte[1] ;
      P03KR2_A130BarCodPar = new String[] {""} ;
      P03KR2_A153BarFasEst = new byte[1] ;
      P03KR2_A152BarFasCon = new String[] {""} ;
      P03KR2_A194BarOrdLin = new short[1] ;
      P03KR2_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasesfin__default(),
         new Object[] {
             new Object[] {
            P03KR2_A396EmprCod, P03KR2_A129BarCod, P03KR2_A132BarCodReo, P03KR2_A130BarCodPar, P03KR2_A153BarFasEst, P03KR2_A152BarFasCon, P03KR2_A194BarOrdLin, P03KR2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Salida ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A152BarFasCon ;
   private String A758ProCod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03KR2_A396EmprCod ;
   private int[] P03KR2_A129BarCod ;
   private byte[] P03KR2_A132BarCodReo ;
   private String[] P03KR2_A130BarCodPar ;
   private byte[] P03KR2_A153BarFasEst ;
   private String[] P03KR2_A152BarFasCon ;
   private short[] P03KR2_A194BarOrdLin ;
   private String[] P03KR2_A758ProCod ;
}

final  class pfasesfin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03KR2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasEst, BarFasCon, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarOrdLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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

