package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aprbh2o extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aprbh2o pgm = new aprbh2o (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aprbh2o( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprbh2o.class ), "" );
   }

   public aprbh2o( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV13Emprcod = "001" ;
      /* Using cursor P04002 */
      pr_default.execute(0, new Object[] {AV13Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04002_A396EmprCod[0] ;
         A4706ProForRb = P04002_A4706ProForRb[0] ;
         A764ProForCod = P04002_A764ProForCod[0] ;
         A10547ProH2O = P04002_A10547ProH2O[0] ;
         AV14Proforcod = A764ProForCod ;
         AV15Proforrb = A4706ProForRb ;
         AV16Proh2o = A10547ProH2O ;
         /* Execute user subroutine: 'LFORMU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         Gx_msg = httpContext.getMessage( "Proceso..", "") + A764ProForCod ;
         System.out.println( Gx_msg );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'LFORMU' Routine */
      returnInSub = false ;
      /* Using cursor P04003 */
      pr_default.execute(1, new Object[] {AV13Emprcod, AV14Proforcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A764ProForCod = P04003_A764ProForCod[0] ;
         A396EmprCod = P04003_A396EmprCod[0] ;
         A8656ProForrbn = P04003_A8656ProForrbn[0] ;
         A10542ProForH2O = P04003_A10542ProForH2O[0] ;
         A6549ProForFR = P04003_A6549ProForFR[0] ;
         A252CliCod = P04003_A252CliCod[0] ;
         A494ForSer = P04003_A494ForSer[0] ;
         A482ForColNom = P04003_A482ForColNom[0] ;
         A483ForColNum = P04003_A483ForColNum[0] ;
         A831TipColCod = P04003_A831TipColCod[0] ;
         A1160ProForL = P04003_A1160ProForL[0] ;
         A8656ProForrbn = DecimalUtil.doubleToDec(AV15Proforrb) ;
         A10542ProForH2O = AV16Proh2o ;
         A6549ProForFR = httpContext.getMessage( "R", "") ;
         /* Using cursor P04004 */
         pr_default.execute(2, new Object[] {A8656ProForrbn, Short.valueOf(A10542ProForH2O), A6549ProForFR, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(prbh2o.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aprbh2o");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Emprcod = "" ;
      scmdbuf = "" ;
      P04002_A396EmprCod = new String[] {""} ;
      P04002_A4706ProForRb = new short[1] ;
      P04002_A764ProForCod = new String[] {""} ;
      P04002_A10547ProH2O = new short[1] ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      AV14Proforcod = "" ;
      Gx_msg = "" ;
      P04003_A764ProForCod = new String[] {""} ;
      P04003_A396EmprCod = new String[] {""} ;
      P04003_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04003_A10542ProForH2O = new short[1] ;
      P04003_A6549ProForFR = new String[] {""} ;
      P04003_A252CliCod = new int[1] ;
      P04003_A494ForSer = new String[] {""} ;
      P04003_A482ForColNom = new String[] {""} ;
      P04003_A483ForColNum = new int[1] ;
      P04003_A831TipColCod = new byte[1] ;
      P04003_A1160ProForL = new short[1] ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A6549ProForFR = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aprbh2o__default(),
         new Object[] {
             new Object[] {
            P04002_A396EmprCod, P04002_A4706ProForRb, P04002_A764ProForCod, P04002_A10547ProH2O
            }
            , new Object[] {
            P04003_A764ProForCod, P04003_A396EmprCod, P04003_A8656ProForrbn, P04003_A10542ProForH2O, P04003_A6549ProForFR, P04003_A252CliCod, P04003_A494ForSer, P04003_A482ForColNom, P04003_A483ForColNum, P04003_A831TipColCod,
            P04003_A1160ProForL
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short A4706ProForRb ;
   private short A10547ProH2O ;
   private short AV15Proforrb ;
   private short AV16Proh2o ;
   private short A10542ProForH2O ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private java.math.BigDecimal A8656ProForrbn ;
   private String AV13Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String AV14Proforcod ;
   private String Gx_msg ;
   private String A6549ProForFR ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P04002_A396EmprCod ;
   private short[] P04002_A4706ProForRb ;
   private String[] P04002_A764ProForCod ;
   private short[] P04002_A10547ProH2O ;
   private String[] P04003_A764ProForCod ;
   private String[] P04003_A396EmprCod ;
   private java.math.BigDecimal[] P04003_A8656ProForrbn ;
   private short[] P04003_A10542ProForH2O ;
   private String[] P04003_A6549ProForFR ;
   private int[] P04003_A252CliCod ;
   private String[] P04003_A494ForSer ;
   private String[] P04003_A482ForColNom ;
   private int[] P04003_A483ForColNum ;
   private byte[] P04003_A831TipColCod ;
   private short[] P04003_A1160ProForL ;
}

final  class aprbh2o__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04002", "SELECT EmprCod, ProForRb, ProForCod, ProH2O FROM TXPCPROFO WHERE EmprCod = ? and ProForRb > 0 ORDER BY EmprCod, ProForRb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04003", "SELECT ProForCod, EmprCod, ProForrbn, ProForH2O, ProForFR, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04004", "UPDATE TXPLFORMU SET ProForrbn=?, ProForH2O=?, ProForFR=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
      }
   }

}

