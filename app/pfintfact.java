package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfintfact extends GXProcedure
{
   public pfintfact( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfintfact.class ), "" );
   }

   public pfintfact( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pfintfact.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pfintfact.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfintfact.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pfintfact.this.AV16ForSer = aP2[0];
      this.aP2 = aP2;
      pfintfact.this.AV17ForColNom = aP3[0];
      this.aP3 = aP3;
      pfintfact.this.AV18ForColNum = aP4[0];
      this.aP4 = aP4;
      pfintfact.this.AV19TipColCod = aP5[0];
      this.aP5 = aP5;
      pfintfact.this.AV22INTDSCF = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22INTDSCF = "" ;
      /* Using cursor P02AH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5362IntCodF = P02AH2_A5362IntCodF[0] ;
         n5362IntCodF = P02AH2_n5362IntCodF[0] ;
         A831TipColCod = P02AH2_A831TipColCod[0] ;
         A483ForColNum = P02AH2_A483ForColNum[0] ;
         A482ForColNom = P02AH2_A482ForColNom[0] ;
         A494ForSer = P02AH2_A494ForSer[0] ;
         A252CliCod = P02AH2_A252CliCod[0] ;
         A5363IntDscF = P02AH2_A5363IntDscF[0] ;
         n5363IntDscF = P02AH2_n5363IntDscF[0] ;
         A5363IntDscF = P02AH2_A5363IntDscF[0] ;
         n5363IntDscF = P02AH2_n5363IntDscF[0] ;
         AV22INTDSCF = A5363IntDscF ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfintfact.this.A396EmprCod;
      this.aP1[0] = pfintfact.this.AV15CliCod;
      this.aP2[0] = pfintfact.this.AV16ForSer;
      this.aP3[0] = pfintfact.this.AV17ForColNom;
      this.aP4[0] = pfintfact.this.AV18ForColNum;
      this.aP5[0] = pfintfact.this.AV19TipColCod;
      this.aP6[0] = pfintfact.this.AV22INTDSCF;
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
      P02AH2_A5362IntCodF = new byte[1] ;
      P02AH2_n5362IntCodF = new boolean[] {false} ;
      P02AH2_A396EmprCod = new String[] {""} ;
      P02AH2_A831TipColCod = new byte[1] ;
      P02AH2_A483ForColNum = new int[1] ;
      P02AH2_A482ForColNom = new String[] {""} ;
      P02AH2_A494ForSer = new String[] {""} ;
      P02AH2_A252CliCod = new int[1] ;
      P02AH2_A5363IntDscF = new String[] {""} ;
      P02AH2_n5363IntDscF = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A5363IntDscF = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfintfact__default(),
         new Object[] {
             new Object[] {
            P02AH2_A5362IntCodF, P02AH2_n5362IntCodF, P02AH2_A396EmprCod, P02AH2_A831TipColCod, P02AH2_A483ForColNum, P02AH2_A482ForColNom, P02AH2_A494ForSer, P02AH2_A252CliCod, P02AH2_A5363IntDscF, P02AH2_n5363IntDscF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19TipColCod ;
   private byte A5362IntCodF ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int AV18ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV16ForSer ;
   private String AV17ForColNom ;
   private String AV22INTDSCF ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A5363IntDscF ;
   private boolean n5362IntCodF ;
   private boolean n5363IntDscF ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P02AH2_A5362IntCodF ;
   private boolean[] P02AH2_n5362IntCodF ;
   private String[] P02AH2_A396EmprCod ;
   private byte[] P02AH2_A831TipColCod ;
   private int[] P02AH2_A483ForColNum ;
   private String[] P02AH2_A482ForColNom ;
   private String[] P02AH2_A494ForSer ;
   private int[] P02AH2_A252CliCod ;
   private String[] P02AH2_A5363IntDscF ;
   private boolean[] P02AH2_n5363IntDscF ;
}

final  class pfintfact__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02AH2", "SELECT T1.IntCodF, T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.IntDscF FROM (TXPCFORMU T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

