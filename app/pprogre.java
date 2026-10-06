package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprogre extends GXProcedure
{
   public pprogre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprogre.class ), "" );
   }

   public pprogre( int remoteHandle ,
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
      pprogre.this.aP5 = new String[] {""};
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
      pprogre.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprogre.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprogre.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprogre.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprogre.this.AV10ProCod = aP4[0];
      this.aP4 = aP4;
      pprogre.this.AV11ProDsc = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10ProCod = GXutil.space( (short)(8)) ;
      AV11ProDsc = GXutil.space( (short)(28)) ;
      /* Using cursor P01FR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A761ProFasLin = P01FR2_A761ProFasLin[0] ;
         n761ProFasLin = P01FR2_n761ProFasLin[0] ;
         A758ProCod = P01FR2_A758ProCod[0] ;
         A759ProDsc = P01FR2_A759ProDsc[0] ;
         A759ProDsc = P01FR2_A759ProDsc[0] ;
         AV10ProCod = A758ProCod ;
         AV11ProDsc = A759ProDsc ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprogre.this.A396EmprCod;
      this.aP1[0] = pprogre.this.A129BarCod;
      this.aP2[0] = pprogre.this.A132BarCodReo;
      this.aP3[0] = pprogre.this.A130BarCodPar;
      this.aP4[0] = pprogre.this.AV10ProCod;
      this.aP5[0] = pprogre.this.AV11ProDsc;
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
      P01FR2_A396EmprCod = new String[] {""} ;
      P01FR2_A129BarCod = new int[1] ;
      P01FR2_A132BarCodReo = new byte[1] ;
      P01FR2_A130BarCodPar = new String[] {""} ;
      P01FR2_A761ProFasLin = new short[1] ;
      P01FR2_n761ProFasLin = new boolean[] {false} ;
      P01FR2_A758ProCod = new String[] {""} ;
      P01FR2_A759ProDsc = new String[] {""} ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprogre__default(),
         new Object[] {
             new Object[] {
            P01FR2_A396EmprCod, P01FR2_A129BarCod, P01FR2_A132BarCodReo, P01FR2_A130BarCodPar, P01FR2_A761ProFasLin, P01FR2_n761ProFasLin, P01FR2_A758ProCod, P01FR2_A759ProDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10ProCod ;
   private String AV11ProDsc ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private boolean n761ProFasLin ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01FR2_A396EmprCod ;
   private int[] P01FR2_A129BarCod ;
   private byte[] P01FR2_A132BarCodReo ;
   private String[] P01FR2_A130BarCodPar ;
   private short[] P01FR2_A761ProFasLin ;
   private boolean[] P01FR2_n761ProFasLin ;
   private String[] P01FR2_A758ProCod ;
   private String[] P01FR2_A759ProDsc ;
}

final  class pprogre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01FR2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProFasLin, T1.ProCod, T2.ProDsc FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
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

