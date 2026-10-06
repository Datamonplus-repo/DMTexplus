package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc244 extends GXProcedure
{
   public pprc244( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc244.class ), "" );
   }

   public pprc244( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pprc244.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc244.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc244.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pprc244.this.A9713Tb1_Cod = aP2[0];
      this.aP2 = aP2;
      pprc244.this.A4031CCTCod = aP3[0];
      this.aP3 = aP3;
      pprc244.this.A4034CCTLin = aP4[0];
      this.aP4 = aP4;
      pprc244.this.AV8CCSCNorma = aP5[0];
      this.aP5 = aP5;
      pprc244.this.AV9CCSCCEns = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9CCSCCEns = " " ;
      AV8CCSCNorma = " " ;
      /* Using cursor P05VW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11755CCSCCEns = P05VW2_A11755CCSCCEns[0] ;
         n11755CCSCCEns = P05VW2_n11755CCSCCEns[0] ;
         A11751CCSCNorma = P05VW2_A11751CCSCNorma[0] ;
         n11751CCSCNorma = P05VW2_n11751CCSCNorma[0] ;
         A11736CCArtCod = P05VW2_A11736CCArtCod[0] ;
         A11748TipArtiId = P05VW2_A11748TipArtiId[0] ;
         A11737CCColNom = P05VW2_A11737CCColNom[0] ;
         A11738CCColNum = P05VW2_A11738CCColNum[0] ;
         A11749CCCTc = P05VW2_A11749CCCTc[0] ;
         A11750IntId = P05VW2_A11750IntId[0] ;
         AV9CCSCCEns = GXutil.substring( A11755CCSCCEns, 1, 30) ;
         AV8CCSCNorma = GXutil.substring( A11751CCSCNorma, 1, 30) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc244.this.A396EmprCod;
      this.aP1[0] = pprc244.this.A252CliCod;
      this.aP2[0] = pprc244.this.A9713Tb1_Cod;
      this.aP3[0] = pprc244.this.A4031CCTCod;
      this.aP4[0] = pprc244.this.A4034CCTLin;
      this.aP5[0] = pprc244.this.AV8CCSCNorma;
      this.aP6[0] = pprc244.this.AV9CCSCCEns;
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
      P05VW2_A396EmprCod = new String[] {""} ;
      P05VW2_A252CliCod = new int[1] ;
      P05VW2_A9713Tb1_Cod = new short[1] ;
      P05VW2_A4031CCTCod = new int[1] ;
      P05VW2_A4034CCTLin = new short[1] ;
      P05VW2_A11755CCSCCEns = new String[] {""} ;
      P05VW2_n11755CCSCCEns = new boolean[] {false} ;
      P05VW2_A11751CCSCNorma = new String[] {""} ;
      P05VW2_n11751CCSCNorma = new boolean[] {false} ;
      P05VW2_A11736CCArtCod = new String[] {""} ;
      P05VW2_A11748TipArtiId = new short[1] ;
      P05VW2_A11737CCColNom = new String[] {""} ;
      P05VW2_A11738CCColNum = new int[1] ;
      P05VW2_A11749CCCTc = new byte[1] ;
      P05VW2_A11750IntId = new short[1] ;
      A11755CCSCCEns = "" ;
      A11751CCSCNorma = "" ;
      A11736CCArtCod = "" ;
      A11737CCColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc244__default(),
         new Object[] {
             new Object[] {
            P05VW2_A396EmprCod, P05VW2_A252CliCod, P05VW2_A9713Tb1_Cod, P05VW2_A4031CCTCod, P05VW2_A4034CCTLin, P05VW2_A11755CCSCCEns, P05VW2_n11755CCSCCEns, P05VW2_A11751CCSCNorma, P05VW2_n11751CCSCNorma, P05VW2_A11736CCArtCod,
            P05VW2_A11748TipArtiId, P05VW2_A11737CCColNom, P05VW2_A11738CCColNum, P05VW2_A11749CCCTc, P05VW2_A11750IntId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11749CCCTc ;
   private short A9713Tb1_Cod ;
   private short A4034CCTLin ;
   private short A11748TipArtiId ;
   private short A11750IntId ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A4031CCTCod ;
   private int A11738CCColNum ;
   private String A396EmprCod ;
   private String AV8CCSCNorma ;
   private String AV9CCSCCEns ;
   private String scmdbuf ;
   private String A11755CCSCCEns ;
   private String A11751CCSCNorma ;
   private String A11736CCArtCod ;
   private String A11737CCColNom ;
   private boolean n11755CCSCCEns ;
   private boolean n11751CCSCNorma ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private int[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05VW2_A396EmprCod ;
   private int[] P05VW2_A252CliCod ;
   private short[] P05VW2_A9713Tb1_Cod ;
   private int[] P05VW2_A4031CCTCod ;
   private short[] P05VW2_A4034CCTLin ;
   private String[] P05VW2_A11755CCSCCEns ;
   private boolean[] P05VW2_n11755CCSCCEns ;
   private String[] P05VW2_A11751CCSCNorma ;
   private boolean[] P05VW2_n11751CCSCNorma ;
   private String[] P05VW2_A11736CCArtCod ;
   private short[] P05VW2_A11748TipArtiId ;
   private String[] P05VW2_A11737CCColNom ;
   private int[] P05VW2_A11738CCColNum ;
   private byte[] P05VW2_A11749CCCTc ;
   private short[] P05VW2_A11750IntId ;
}

final  class pprc244__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05VW2", "SELECT EmprCod, CliCod, Tb1_Cod, CCTCod, CCTLin, CCSCCEns, CCSCNorma, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId FROM TXPCCCNOS WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

