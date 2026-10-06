package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppckerxl extends GXProcedure
{
   public ppckerxl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppckerxl.class ), "" );
   }

   public ppckerxl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 ,
                           java.util.Date[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           String[] aP10 ,
                           String[] aP11 )
   {
      ppckerxl.this.aP12 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        byte[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             byte[] aP12 )
   {
      ppckerxl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppckerxl.this.A6194PckErxNum = aP1[0];
      this.aP1 = aP1;
      ppckerxl.this.AV15CliDesCod = aP2[0];
      this.aP2 = aP2;
      ppckerxl.this.AV16PckErxFch = aP3[0];
      this.aP3 = aP3;
      ppckerxl.this.AV17PckErxFac = aP4[0];
      this.aP4 = aP4;
      ppckerxl.this.AV18PckErxNom = aP5[0];
      this.aP5 = aP5;
      ppckerxl.this.AV19PckErxDom = aP6[0];
      this.aP6 = aP6;
      ppckerxl.this.AV20PckErxPob = aP7[0];
      this.aP7 = aP7;
      ppckerxl.this.AV21PckErxPai = aP8[0];
      this.aP8 = aP8;
      ppckerxl.this.AV22PckErxNif = aP9[0];
      this.aP9 = aP9;
      ppckerxl.this.AV25PckErx1 = aP10[0];
      this.aP10 = aP10;
      ppckerxl.this.AV26PckErx2 = aP11[0];
      this.aP11 = aP11;
      ppckerxl.this.AV24PckErxIdi = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02CG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6194PckErxNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6196PckErxClD = P02CG2_A6196PckErxClD[0] ;
         n6196PckErxClD = P02CG2_n6196PckErxClD[0] ;
         A6197PckErxNom = P02CG2_A6197PckErxNom[0] ;
         n6197PckErxNom = P02CG2_n6197PckErxNom[0] ;
         A6198PckErxDom = P02CG2_A6198PckErxDom[0] ;
         n6198PckErxDom = P02CG2_n6198PckErxDom[0] ;
         A6199PckErxPob = P02CG2_A6199PckErxPob[0] ;
         n6199PckErxPob = P02CG2_n6199PckErxPob[0] ;
         A6200PckErxPai = P02CG2_A6200PckErxPai[0] ;
         n6200PckErxPai = P02CG2_n6200PckErxPai[0] ;
         A6201PckErxNif = P02CG2_A6201PckErxNif[0] ;
         n6201PckErxNif = P02CG2_n6201PckErxNif[0] ;
         A7517PckErx1 = P02CG2_A7517PckErx1[0] ;
         n7517PckErx1 = P02CG2_n7517PckErx1[0] ;
         A7518PckErx2 = P02CG2_A7518PckErx2[0] ;
         n7518PckErx2 = P02CG2_n7518PckErx2[0] ;
         A6202PckErxFch = P02CG2_A6202PckErxFch[0] ;
         n6202PckErxFch = P02CG2_n6202PckErxFch[0] ;
         A6203PckErxFac = P02CG2_A6203PckErxFac[0] ;
         n6203PckErxFac = P02CG2_n6203PckErxFac[0] ;
         A6228PckErxIdi = P02CG2_A6228PckErxIdi[0] ;
         n6228PckErxIdi = P02CG2_n6228PckErxIdi[0] ;
         A6195PckErxOrd = P02CG2_A6195PckErxOrd[0] ;
         AV15CliDesCod = A6196PckErxClD ;
         AV18PckErxNom = A6197PckErxNom ;
         AV19PckErxDom = A6198PckErxDom ;
         AV20PckErxPob = A6199PckErxPob ;
         AV21PckErxPai = A6200PckErxPai ;
         AV22PckErxNif = A6201PckErxNif ;
         AV25PckErx1 = A7517PckErx1 ;
         AV26PckErx2 = A7518PckErx2 ;
         AV16PckErxFch = A6202PckErxFch ;
         AV17PckErxFac = A6203PckErxFac ;
         AV24PckErxIdi = A6228PckErxIdi ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppckerxl.this.A396EmprCod;
      this.aP1[0] = ppckerxl.this.A6194PckErxNum;
      this.aP2[0] = ppckerxl.this.AV15CliDesCod;
      this.aP3[0] = ppckerxl.this.AV16PckErxFch;
      this.aP4[0] = ppckerxl.this.AV17PckErxFac;
      this.aP5[0] = ppckerxl.this.AV18PckErxNom;
      this.aP6[0] = ppckerxl.this.AV19PckErxDom;
      this.aP7[0] = ppckerxl.this.AV20PckErxPob;
      this.aP8[0] = ppckerxl.this.AV21PckErxPai;
      this.aP9[0] = ppckerxl.this.AV22PckErxNif;
      this.aP10[0] = ppckerxl.this.AV25PckErx1;
      this.aP11[0] = ppckerxl.this.AV26PckErx2;
      this.aP12[0] = ppckerxl.this.AV24PckErxIdi;
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
      P02CG2_A396EmprCod = new String[] {""} ;
      P02CG2_A6194PckErxNum = new int[1] ;
      P02CG2_A6196PckErxClD = new int[1] ;
      P02CG2_n6196PckErxClD = new boolean[] {false} ;
      P02CG2_A6197PckErxNom = new String[] {""} ;
      P02CG2_n6197PckErxNom = new boolean[] {false} ;
      P02CG2_A6198PckErxDom = new String[] {""} ;
      P02CG2_n6198PckErxDom = new boolean[] {false} ;
      P02CG2_A6199PckErxPob = new String[] {""} ;
      P02CG2_n6199PckErxPob = new boolean[] {false} ;
      P02CG2_A6200PckErxPai = new String[] {""} ;
      P02CG2_n6200PckErxPai = new boolean[] {false} ;
      P02CG2_A6201PckErxNif = new String[] {""} ;
      P02CG2_n6201PckErxNif = new boolean[] {false} ;
      P02CG2_A7517PckErx1 = new String[] {""} ;
      P02CG2_n7517PckErx1 = new boolean[] {false} ;
      P02CG2_A7518PckErx2 = new String[] {""} ;
      P02CG2_n7518PckErx2 = new boolean[] {false} ;
      P02CG2_A6202PckErxFch = new java.util.Date[] {GXutil.nullDate()} ;
      P02CG2_n6202PckErxFch = new boolean[] {false} ;
      P02CG2_A6203PckErxFac = new String[] {""} ;
      P02CG2_n6203PckErxFac = new boolean[] {false} ;
      P02CG2_A6228PckErxIdi = new byte[1] ;
      P02CG2_n6228PckErxIdi = new boolean[] {false} ;
      P02CG2_A6195PckErxOrd = new byte[1] ;
      A6197PckErxNom = "" ;
      A6198PckErxDom = "" ;
      A6199PckErxPob = "" ;
      A6200PckErxPai = "" ;
      A6201PckErxNif = "" ;
      A7517PckErx1 = "" ;
      A7518PckErx2 = "" ;
      A6202PckErxFch = GXutil.nullDate() ;
      A6203PckErxFac = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppckerxl__default(),
         new Object[] {
             new Object[] {
            P02CG2_A396EmprCod, P02CG2_A6194PckErxNum, P02CG2_A6196PckErxClD, P02CG2_n6196PckErxClD, P02CG2_A6197PckErxNom, P02CG2_n6197PckErxNom, P02CG2_A6198PckErxDom, P02CG2_n6198PckErxDom, P02CG2_A6199PckErxPob, P02CG2_n6199PckErxPob,
            P02CG2_A6200PckErxPai, P02CG2_n6200PckErxPai, P02CG2_A6201PckErxNif, P02CG2_n6201PckErxNif, P02CG2_A7517PckErx1, P02CG2_n7517PckErx1, P02CG2_A7518PckErx2, P02CG2_n7518PckErx2, P02CG2_A6202PckErxFch, P02CG2_n6202PckErxFch,
            P02CG2_A6203PckErxFac, P02CG2_n6203PckErxFac, P02CG2_A6228PckErxIdi, P02CG2_n6228PckErxIdi, P02CG2_A6195PckErxOrd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24PckErxIdi ;
   private byte A6228PckErxIdi ;
   private byte A6195PckErxOrd ;
   private short Gx_err ;
   private int A6194PckErxNum ;
   private int AV15CliDesCod ;
   private int A6196PckErxClD ;
   private String A396EmprCod ;
   private String AV17PckErxFac ;
   private String AV18PckErxNom ;
   private String AV19PckErxDom ;
   private String AV20PckErxPob ;
   private String AV21PckErxPai ;
   private String AV22PckErxNif ;
   private String AV25PckErx1 ;
   private String AV26PckErx2 ;
   private String scmdbuf ;
   private String A6197PckErxNom ;
   private String A6198PckErxDom ;
   private String A6199PckErxPob ;
   private String A6200PckErxPai ;
   private String A6201PckErxNif ;
   private String A7517PckErx1 ;
   private String A7518PckErx2 ;
   private String A6203PckErxFac ;
   private java.util.Date AV16PckErxFch ;
   private java.util.Date A6202PckErxFch ;
   private boolean n6196PckErxClD ;
   private boolean n6197PckErxNom ;
   private boolean n6198PckErxDom ;
   private boolean n6199PckErxPob ;
   private boolean n6200PckErxPai ;
   private boolean n6201PckErxNif ;
   private boolean n7517PckErx1 ;
   private boolean n7518PckErx2 ;
   private boolean n6202PckErxFch ;
   private boolean n6203PckErxFac ;
   private boolean n6228PckErxIdi ;
   private byte[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P02CG2_A396EmprCod ;
   private int[] P02CG2_A6194PckErxNum ;
   private int[] P02CG2_A6196PckErxClD ;
   private boolean[] P02CG2_n6196PckErxClD ;
   private String[] P02CG2_A6197PckErxNom ;
   private boolean[] P02CG2_n6197PckErxNom ;
   private String[] P02CG2_A6198PckErxDom ;
   private boolean[] P02CG2_n6198PckErxDom ;
   private String[] P02CG2_A6199PckErxPob ;
   private boolean[] P02CG2_n6199PckErxPob ;
   private String[] P02CG2_A6200PckErxPai ;
   private boolean[] P02CG2_n6200PckErxPai ;
   private String[] P02CG2_A6201PckErxNif ;
   private boolean[] P02CG2_n6201PckErxNif ;
   private String[] P02CG2_A7517PckErx1 ;
   private boolean[] P02CG2_n7517PckErx1 ;
   private String[] P02CG2_A7518PckErx2 ;
   private boolean[] P02CG2_n7518PckErx2 ;
   private java.util.Date[] P02CG2_A6202PckErxFch ;
   private boolean[] P02CG2_n6202PckErxFch ;
   private String[] P02CG2_A6203PckErxFac ;
   private boolean[] P02CG2_n6203PckErxFac ;
   private byte[] P02CG2_A6228PckErxIdi ;
   private boolean[] P02CG2_n6228PckErxIdi ;
   private byte[] P02CG2_A6195PckErxOrd ;
}

final  class ppckerxl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CG2", "SELECT * FROM (SELECT EmprCod, PckErxNum, PckErxClD, PckErxNom, PckErxDom, PckErxPob, PckErxPai, PckErxNif, PckErx1, PckErx2, PckErxFch, PckErxFac, PckErxIdi, PckErxOrd FROM TXPPCKERX WHERE EmprCod = ? and PckErxNum = ? ORDER BY EmprCod, PckErxNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 60);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 60);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(14);
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
               return;
      }
   }

}

