package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp035 extends GXProcedure
{
   public pdyrp035( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp035.class ), "" );
   }

   public pdyrp035( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            String aP1 ,
                            String[] aP2 ,
                            int[] aP3 ,
                            String[] aP4 ,
                            java.util.Date[] aP5 ,
                            short[] aP6 ,
                            String[] aP7 )
   {
      pdyrp035.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        java.util.Date[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             java.util.Date[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 )
   {
      pdyrp035.this.A396EmprCod = aP0;
      pdyrp035.this.A719PrdNum = aP1;
      pdyrp035.this.aP2 = aP2;
      pdyrp035.this.aP3 = aP3;
      pdyrp035.this.aP4 = aP4;
      pdyrp035.this.aP5 = aP5;
      pdyrp035.this.aP6 = aP6;
      pdyrp035.this.aP7 = aP7;
      pdyrp035.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12AlmPrdID = (short)(0) ;
      AV8PrdLote = " " ;
      AV10Prdnom2 = " " ;
      AV9PrvNum = 0 ;
      AV13Prdtip = httpContext.getMessage( "M", "") ;
      AV14PrdCantAtM = (short)(0) ;
      /* Using cursor P09N82 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10881PrdLote = P09N82_A10881PrdLote[0] ;
         A795PrvNum = P09N82_A795PrvNum[0] ;
         A4692PrdNom2 = P09N82_A4692PrdNom2[0] ;
         A13971PrdLoteFch = P09N82_A13971PrdLoteFch[0] ;
         n13971PrdLoteFch = P09N82_n13971PrdLoteFch[0] ;
         A13927AlmPrdID = P09N82_A13927AlmPrdID[0] ;
         n13927AlmPrdID = P09N82_n13927AlmPrdID[0] ;
         A1643PrdTip = P09N82_A1643PrdTip[0] ;
         A13968PrdCantAtM = P09N82_A13968PrdCantAtM[0] ;
         n13968PrdCantAtM = P09N82_n13968PrdCantAtM[0] ;
         AV8PrdLote = A10881PrdLote ;
         AV9PrvNum = A795PrvNum ;
         AV10Prdnom2 = A4692PrdNom2 ;
         AV11PrdLoteFch = A13971PrdLoteFch ;
         AV12AlmPrdID = A13927AlmPrdID ;
         AV13Prdtip = A1643PrdTip ;
         AV14PrdCantAtM = A13968PrdCantAtM ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pdyrp035.this.AV8PrdLote;
      this.aP3[0] = pdyrp035.this.AV9PrvNum;
      this.aP4[0] = pdyrp035.this.AV10Prdnom2;
      this.aP5[0] = pdyrp035.this.AV11PrdLoteFch;
      this.aP6[0] = pdyrp035.this.AV12AlmPrdID;
      this.aP7[0] = pdyrp035.this.AV13Prdtip;
      this.aP8[0] = pdyrp035.this.AV14PrdCantAtM;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8PrdLote = "" ;
      AV10Prdnom2 = "" ;
      AV11PrdLoteFch = GXutil.nullDate() ;
      AV13Prdtip = "" ;
      scmdbuf = "" ;
      P09N82_A396EmprCod = new String[] {""} ;
      P09N82_A719PrdNum = new String[] {""} ;
      P09N82_A10881PrdLote = new String[] {""} ;
      P09N82_A795PrvNum = new int[1] ;
      P09N82_A4692PrdNom2 = new String[] {""} ;
      P09N82_A13971PrdLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09N82_n13971PrdLoteFch = new boolean[] {false} ;
      P09N82_A13927AlmPrdID = new short[1] ;
      P09N82_n13927AlmPrdID = new boolean[] {false} ;
      P09N82_A1643PrdTip = new String[] {""} ;
      P09N82_A13968PrdCantAtM = new short[1] ;
      P09N82_n13968PrdCantAtM = new boolean[] {false} ;
      A10881PrdLote = "" ;
      A4692PrdNom2 = "" ;
      A13971PrdLoteFch = GXutil.nullDate() ;
      A1643PrdTip = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp035__default(),
         new Object[] {
             new Object[] {
            P09N82_A396EmprCod, P09N82_A719PrdNum, P09N82_A10881PrdLote, P09N82_A795PrvNum, P09N82_A4692PrdNom2, P09N82_A13971PrdLoteFch, P09N82_n13971PrdLoteFch, P09N82_A13927AlmPrdID, P09N82_n13927AlmPrdID, P09N82_A1643PrdTip,
            P09N82_A13968PrdCantAtM, P09N82_n13968PrdCantAtM
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12AlmPrdID ;
   private short AV14PrdCantAtM ;
   private short A13927AlmPrdID ;
   private short A13968PrdCantAtM ;
   private short Gx_err ;
   private int AV9PrvNum ;
   private int A795PrvNum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV8PrdLote ;
   private String AV10Prdnom2 ;
   private String AV13Prdtip ;
   private String scmdbuf ;
   private String A10881PrdLote ;
   private String A4692PrdNom2 ;
   private String A1643PrdTip ;
   private java.util.Date AV11PrdLoteFch ;
   private java.util.Date A13971PrdLoteFch ;
   private boolean n13971PrdLoteFch ;
   private boolean n13927AlmPrdID ;
   private boolean n13968PrdCantAtM ;
   private short[] aP8 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private java.util.Date[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P09N82_A396EmprCod ;
   private String[] P09N82_A719PrdNum ;
   private String[] P09N82_A10881PrdLote ;
   private int[] P09N82_A795PrvNum ;
   private String[] P09N82_A4692PrdNom2 ;
   private java.util.Date[] P09N82_A13971PrdLoteFch ;
   private boolean[] P09N82_n13971PrdLoteFch ;
   private short[] P09N82_A13927AlmPrdID ;
   private boolean[] P09N82_n13927AlmPrdID ;
   private String[] P09N82_A1643PrdTip ;
   private short[] P09N82_A13968PrdCantAtM ;
   private boolean[] P09N82_n13968PrdCantAtM ;
}

final  class pdyrp035__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09N82", "SELECT EmprCod, PrdNum, PrdLote, PrvNum, PrdNom2, PrdLoteFch, AlmPrdID, PrdTip, PrdCantAtM FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

