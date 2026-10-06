package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prestof extends GXProcedure
{
   public prestof( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prestof.class ), "" );
   }

   public prestof( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 )
   {
      prestof.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 )
   {
      prestof.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prestof.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prestof.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prestof.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      prestof.this.AV9BarOrdLin = aP4[0];
      this.aP4 = aP4;
      prestof.this.AV12EstS = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12EstS = (byte)(0) ;
      AV10FasDscS = "" ;
      /* Using cursor P01XX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV9BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P01XX2_A457FasCod[0] ;
         A152BarFasCon = P01XX2_A152BarFasCon[0] ;
         A194BarOrdLin = P01XX2_A194BarOrdLin[0] ;
         A153BarFasEst = P01XX2_A153BarFasEst[0] ;
         A460FasDsc = P01XX2_A460FasDsc[0] ;
         A758ProCod = P01XX2_A758ProCod[0] ;
         A460FasDsc = P01XX2_A460FasDsc[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( A153BarFasEst > 0 )
            {
               AV12EstS = A153BarFasEst ;
               AV10FasDscS = GXutil.substring( A460FasDsc, 1, 15) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prestof.this.A396EmprCod;
      this.aP1[0] = prestof.this.A129BarCod;
      this.aP2[0] = prestof.this.A132BarCodReo;
      this.aP3[0] = prestof.this.A130BarCodPar;
      this.aP4[0] = prestof.this.AV9BarOrdLin;
      this.aP5[0] = prestof.this.AV12EstS;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10FasDscS = "" ;
      scmdbuf = "" ;
      P01XX2_A457FasCod = new String[] {""} ;
      P01XX2_A396EmprCod = new String[] {""} ;
      P01XX2_A129BarCod = new int[1] ;
      P01XX2_A132BarCodReo = new byte[1] ;
      P01XX2_A130BarCodPar = new String[] {""} ;
      P01XX2_A152BarFasCon = new String[] {""} ;
      P01XX2_A194BarOrdLin = new short[1] ;
      P01XX2_A153BarFasEst = new byte[1] ;
      P01XX2_A460FasDsc = new String[] {""} ;
      P01XX2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A152BarFasCon = "" ;
      A460FasDsc = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prestof__default(),
         new Object[] {
             new Object[] {
            P01XX2_A457FasCod, P01XX2_A396EmprCod, P01XX2_A129BarCod, P01XX2_A132BarCodReo, P01XX2_A130BarCodPar, P01XX2_A152BarFasCon, P01XX2_A194BarOrdLin, P01XX2_A153BarFasEst, P01XX2_A460FasDsc, P01XX2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12EstS ;
   private byte A153BarFasEst ;
   private short AV9BarOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10FasDscS ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A152BarFasCon ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01XX2_A457FasCod ;
   private String[] P01XX2_A396EmprCod ;
   private int[] P01XX2_A129BarCod ;
   private byte[] P01XX2_A132BarCodReo ;
   private String[] P01XX2_A130BarCodPar ;
   private String[] P01XX2_A152BarFasCon ;
   private short[] P01XX2_A194BarOrdLin ;
   private byte[] P01XX2_A153BarFasEst ;
   private String[] P01XX2_A460FasDsc ;
   private String[] P01XX2_A758ProCod ;
}

final  class prestof__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01XX2", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasCon, T1.BarOrdLin, T1.BarFasEst, T2.FasDsc, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin > ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
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
      }
   }

}

