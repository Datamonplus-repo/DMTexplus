package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprondf extends GXProcedure
{
   public pprondf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprondf.class ), "" );
   }

   public pprondf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pprondf.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pprondf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprondf.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprondf.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprondf.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprondf.this.AV8Prodsc = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Prodsc = "" ;
      /* Using cursor P02AY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A759ProDsc = P02AY2_A759ProDsc[0] ;
         A758ProCod = P02AY2_A758ProCod[0] ;
         A759ProDsc = P02AY2_A759ProDsc[0] ;
         AV8Prodsc = A759ProDsc ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprondf.this.A396EmprCod;
      this.aP1[0] = pprondf.this.A129BarCod;
      this.aP2[0] = pprondf.this.A132BarCodReo;
      this.aP3[0] = pprondf.this.A130BarCodPar;
      this.aP4[0] = pprondf.this.AV8Prodsc;
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
      P02AY2_A396EmprCod = new String[] {""} ;
      P02AY2_A129BarCod = new int[1] ;
      P02AY2_A132BarCodReo = new byte[1] ;
      P02AY2_A130BarCodPar = new String[] {""} ;
      P02AY2_A759ProDsc = new String[] {""} ;
      P02AY2_A758ProCod = new String[] {""} ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprondf__default(),
         new Object[] {
             new Object[] {
            P02AY2_A396EmprCod, P02AY2_A129BarCod, P02AY2_A132BarCodReo, P02AY2_A130BarCodPar, P02AY2_A759ProDsc, P02AY2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Prodsc ;
   private String scmdbuf ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02AY2_A396EmprCod ;
   private int[] P02AY2_A129BarCod ;
   private byte[] P02AY2_A132BarCodReo ;
   private String[] P02AY2_A130BarCodPar ;
   private String[] P02AY2_A759ProDsc ;
   private String[] P02AY2_A758ProCod ;
}

final  class pprondf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02AY2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.ProDsc, T1.ProCod FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
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

