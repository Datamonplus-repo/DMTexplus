package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class maquinaconhdr extends GXProcedure
{
   public maquinaconhdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( maquinaconhdr.class ), "" );
   }

   public maquinaconhdr( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 )
   {
      maquinaconhdr.this.aP2 = new boolean[] {false};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             boolean[] aP2 )
   {
      maquinaconhdr.this.A396EmprCod = aP0;
      maquinaconhdr.this.A180BarMaqCod = aP1;
      maquinaconhdr.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existe = false ;
      /* Using cursor P08FR4 */
      pr_default.execute(0, new Object[] {A396EmprCod, A180BarMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P08FR4_A120BarAgrEst[0] ;
         A13694BarHdr = P08FR4_A13694BarHdr[0] ;
         A213BarSit = P08FR4_A213BarSit[0] ;
         A129BarCod = P08FR4_A129BarCod[0] ;
         A132BarCodReo = P08FR4_A132BarCodReo[0] ;
         A130BarCodPar = P08FR4_A130BarCodPar[0] ;
         A40000BarFasEst = P08FR4_A40000BarFasEst[0] ;
         n40000BarFasEst = P08FR4_n40000BarFasEst[0] ;
         A40001GXC2 = P08FR4_A40001GXC2[0] ;
         n40001GXC2 = P08FR4_n40001GXC2[0] ;
         A40000BarFasEst = P08FR4_A40000BarFasEst[0] ;
         n40000BarFasEst = P08FR4_n40000BarFasEst[0] ;
         A40001GXC2 = P08FR4_A40001GXC2[0] ;
         n40001GXC2 = P08FR4_n40001GXC2[0] ;
         AV8Existe = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = maquinaconhdr.this.AV8Existe;
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
      P08FR4_A396EmprCod = new String[] {""} ;
      P08FR4_A180BarMaqCod = new String[] {""} ;
      P08FR4_A120BarAgrEst = new String[] {""} ;
      P08FR4_A13694BarHdr = new String[] {""} ;
      P08FR4_A213BarSit = new byte[1] ;
      P08FR4_A129BarCod = new int[1] ;
      P08FR4_A132BarCodReo = new byte[1] ;
      P08FR4_A130BarCodPar = new String[] {""} ;
      P08FR4_A40000BarFasEst = new byte[1] ;
      P08FR4_n40000BarFasEst = new boolean[] {false} ;
      P08FR4_A40001GXC2 = new String[] {""} ;
      P08FR4_n40001GXC2 = new boolean[] {false} ;
      A120BarAgrEst = "" ;
      A13694BarHdr = "" ;
      A130BarCodPar = "" ;
      A40001GXC2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.maquinaconhdr__default(),
         new Object[] {
             new Object[] {
            P08FR4_A396EmprCod, P08FR4_A180BarMaqCod, P08FR4_A120BarAgrEst, P08FR4_A13694BarHdr, P08FR4_A213BarSit, P08FR4_A129BarCod, P08FR4_A132BarCodReo, P08FR4_A130BarCodPar, P08FR4_A40000BarFasEst, P08FR4_n40000BarFasEst,
            P08FR4_A40001GXC2, P08FR4_n40001GXC2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A40000BarFasEst ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A180BarMaqCod ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A13694BarHdr ;
   private String A130BarCodPar ;
   private String A40001GXC2 ;
   private boolean AV8Existe ;
   private boolean n40000BarFasEst ;
   private boolean n40001GXC2 ;
   private boolean[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P08FR4_A396EmprCod ;
   private String[] P08FR4_A180BarMaqCod ;
   private String[] P08FR4_A120BarAgrEst ;
   private String[] P08FR4_A13694BarHdr ;
   private byte[] P08FR4_A213BarSit ;
   private int[] P08FR4_A129BarCod ;
   private byte[] P08FR4_A132BarCodReo ;
   private String[] P08FR4_A130BarCodPar ;
   private byte[] P08FR4_A40000BarFasEst ;
   private boolean[] P08FR4_n40000BarFasEst ;
   private String[] P08FR4_A40001GXC2 ;
   private boolean[] P08FR4_n40001GXC2 ;
}

final  class maquinaconhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FR4", "SELECT * FROM (SELECT T1.EmprCod, T1.BarMaqCod, T1.BarAgrEst, LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))),8,'0') || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || LPAD(RTRIM(T1.BarCodPar),1,' ') AS BarHdr, T1.BarSit, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarFasEst, 3) AS BarFasEst, COALESCE( T3.GXC2, '') AS GXC2 FROM ((TXPBARCAD T1 LEFT JOIN (SELECT MIN(BarFasEst) AS BarFasEst, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFacTin = 'S' GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2))),8,'0') || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarAgrReo,'90'), 2))) || LPAD(RTRIM(BarAgrPar),1,' ')) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarMaqCod = ?) AND (T1.BarSit < 6) AND (COALESCE( T2.BarFasEst, 3) < 2) AND (( LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))),8,'0') || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || LPAD(RTRIM(T1.BarCodPar),1,' ') < COALESCE( T3.GXC2, '') and T1.BarAgrEst = 'S') or Not T1.BarAgrEst = 'S') ORDER BY T1.EmprCod, T1.BarMaqCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
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

