package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasmin extends GXProcedure
{
   public pfasmin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasmin.class ), "" );
   }

   public pfasmin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pfasmin.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pfasmin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasmin.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfasmin.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasmin.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasmin.this.AV8BarOrdLin = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02J22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P02J22_A457FasCod[0] ;
         A456FasActTin = P02J22_A456FasActTin[0] ;
         n456FasActTin = P02J22_n456FasActTin[0] ;
         A194BarOrdLin = P02J22_A194BarOrdLin[0] ;
         A758ProCod = P02J22_A758ProCod[0] ;
         A456FasActTin = P02J22_A456FasActTin[0] ;
         n456FasActTin = P02J22_n456FasActTin[0] ;
         if ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV8BarOrdLin = A194BarOrdLin ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasmin.this.A396EmprCod;
      this.aP1[0] = pfasmin.this.A129BarCod;
      this.aP2[0] = pfasmin.this.A132BarCodReo;
      this.aP3[0] = pfasmin.this.A130BarCodPar;
      this.aP4[0] = pfasmin.this.AV8BarOrdLin;
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
      P02J22_A457FasCod = new String[] {""} ;
      P02J22_A396EmprCod = new String[] {""} ;
      P02J22_A129BarCod = new int[1] ;
      P02J22_A132BarCodReo = new byte[1] ;
      P02J22_A130BarCodPar = new String[] {""} ;
      P02J22_A456FasActTin = new String[] {""} ;
      P02J22_n456FasActTin = new boolean[] {false} ;
      P02J22_A194BarOrdLin = new short[1] ;
      P02J22_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A456FasActTin = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasmin__default(),
         new Object[] {
             new Object[] {
            P02J22_A457FasCod, P02J22_A396EmprCod, P02J22_A129BarCod, P02J22_A132BarCodReo, P02J22_A130BarCodPar, P02J22_A456FasActTin, P02J22_n456FasActTin, P02J22_A194BarOrdLin, P02J22_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8BarOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A456FasActTin ;
   private String A758ProCod ;
   private boolean n456FasActTin ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02J22_A457FasCod ;
   private String[] P02J22_A396EmprCod ;
   private int[] P02J22_A129BarCod ;
   private byte[] P02J22_A132BarCodReo ;
   private String[] P02J22_A130BarCodPar ;
   private String[] P02J22_A456FasActTin ;
   private boolean[] P02J22_n456FasActTin ;
   private short[] P02J22_A194BarOrdLin ;
   private String[] P02J22_A758ProCod ;
}

final  class pfasmin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02J22", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasActTin, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
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

