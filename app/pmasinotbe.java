package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmasinotbe extends GXProcedure
{
   public pmasinotbe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmasinotbe.class ), "" );
   }

   public pmasinotbe( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 )
   {
      pmasinotbe.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 )
   {
      pmasinotbe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmasinotbe.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmasinotbe.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmasinotbe.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmasinotbe.this.AV8Be_dib = aP4[0];
      this.aP4 = aP4;
      pmasinotbe.this.AV9Be_ped = aP5[0];
      this.aP5 = aP5;
      pmasinotbe.this.AV10Be_col = aP6[0];
      this.aP6 = aP6;
      pmasinotbe.this.AV11Be_coln = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Be_col = " " ;
      AV11Be_coln = 0 ;
      AV8Be_dib = " " ;
      AV9Be_ped = " " ;
      /* Using cursor P04TN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A135BarColNom = P04TN2_A135BarColNom[0] ;
         A136BarColNum = P04TN2_A136BarColNum[0] ;
         A1798BarDibCli = P04TN2_A1798BarDibCli[0] ;
         A4812BarEncCli = P04TN2_A4812BarEncCli[0] ;
         AV10Be_col = A135BarColNom ;
         AV11Be_coln = A136BarColNum ;
         AV8Be_dib = A1798BarDibCli ;
         AV9Be_ped = A4812BarEncCli ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmasinotbe.this.A396EmprCod;
      this.aP1[0] = pmasinotbe.this.A129BarCod;
      this.aP2[0] = pmasinotbe.this.A132BarCodReo;
      this.aP3[0] = pmasinotbe.this.A130BarCodPar;
      this.aP4[0] = pmasinotbe.this.AV8Be_dib;
      this.aP5[0] = pmasinotbe.this.AV9Be_ped;
      this.aP6[0] = pmasinotbe.this.AV10Be_col;
      this.aP7[0] = pmasinotbe.this.AV11Be_coln;
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
      P04TN2_A396EmprCod = new String[] {""} ;
      P04TN2_A129BarCod = new int[1] ;
      P04TN2_A132BarCodReo = new byte[1] ;
      P04TN2_A130BarCodPar = new String[] {""} ;
      P04TN2_A135BarColNom = new String[] {""} ;
      P04TN2_A136BarColNum = new int[1] ;
      P04TN2_A1798BarDibCli = new String[] {""} ;
      P04TN2_A4812BarEncCli = new String[] {""} ;
      A135BarColNom = "" ;
      A1798BarDibCli = "" ;
      A4812BarEncCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmasinotbe__default(),
         new Object[] {
             new Object[] {
            P04TN2_A396EmprCod, P04TN2_A129BarCod, P04TN2_A132BarCodReo, P04TN2_A130BarCodPar, P04TN2_A135BarColNom, P04TN2_A136BarColNum, P04TN2_A1798BarDibCli, P04TN2_A4812BarEncCli
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11Be_coln ;
   private int A136BarColNum ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Be_dib ;
   private String AV9Be_ped ;
   private String AV10Be_col ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A1798BarDibCli ;
   private String A4812BarEncCli ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04TN2_A396EmprCod ;
   private int[] P04TN2_A129BarCod ;
   private byte[] P04TN2_A132BarCodReo ;
   private String[] P04TN2_A130BarCodPar ;
   private String[] P04TN2_A135BarColNom ;
   private int[] P04TN2_A136BarColNum ;
   private String[] P04TN2_A1798BarDibCli ;
   private String[] P04TN2_A4812BarEncCli ;
}

final  class pmasinotbe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04TN2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarColNom, BarColNum, BarDibCli, BarEncCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
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

