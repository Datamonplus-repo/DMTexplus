package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apbartemsec extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apbartemsec pgm = new apbartemsec (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apbartemsec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apbartemsec.class ), "" );
   }

   public apbartemsec( int remoteHandle ,
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
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apbartemsec.this.AV10EmprCod = GXv_char1[0] ;
      apbartemsec.this.AV11EmprNom = GXv_char2[0] ;
      apbartemsec.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P05ZI2 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05ZI2_A396EmprCod[0] ;
         A5291BarTipCor = P05ZI2_A5291BarTipCor[0] ;
         A2459BarTemSec = P05ZI2_A2459BarTemSec[0] ;
         A159BarFecGen = P05ZI2_A159BarFecGen[0] ;
         A130BarCodPar = P05ZI2_A130BarCodPar[0] ;
         A132BarCodReo = P05ZI2_A132BarCodReo[0] ;
         A129BarCod = P05ZI2_A129BarCod[0] ;
         A213BarSit = P05ZI2_A213BarSit[0] ;
         A2459BarTemSec = (short)(DecimalUtil.decToDouble(((GXutil.strcmp(A5291BarTipCor, " ")!=0) ? CommonUtil.decimalVal( A5291BarTipCor, ".") : DecimalUtil.doubleToDec(0)))) ;
         Gx_msg = httpContext.getMessage( "Opcion... ", "") + GXutil.str( A2459BarTemSec, 4, 0) + " " + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         System.out.println( Gx_msg );
         /* Using cursor P05ZI3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A2459BarTemSec), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "proceso finalizado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pbartemsec.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apbartemsec");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05ZI2_A396EmprCod = new String[] {""} ;
      P05ZI2_A5291BarTipCor = new String[] {""} ;
      P05ZI2_A2459BarTemSec = new short[1] ;
      P05ZI2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05ZI2_A130BarCodPar = new String[] {""} ;
      P05ZI2_A132BarCodReo = new byte[1] ;
      P05ZI2_A129BarCod = new int[1] ;
      P05ZI2_A213BarSit = new byte[1] ;
      A396EmprCod = "" ;
      A5291BarTipCor = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apbartemsec__default(),
         new Object[] {
             new Object[] {
            P05ZI2_A396EmprCod, P05ZI2_A5291BarTipCor, P05ZI2_A2459BarTemSec, P05ZI2_A159BarFecGen, P05ZI2_A130BarCodPar, P05ZI2_A132BarCodReo, P05ZI2_A129BarCod, P05ZI2_A213BarSit
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short A2459BarTemSec ;
   private short Gx_err ;
   private int A129BarCod ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5291BarTipCor ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private java.util.Date A159BarFecGen ;
   private IDataStoreProvider pr_default ;
   private String[] P05ZI2_A396EmprCod ;
   private String[] P05ZI2_A5291BarTipCor ;
   private short[] P05ZI2_A2459BarTemSec ;
   private java.util.Date[] P05ZI2_A159BarFecGen ;
   private String[] P05ZI2_A130BarCodPar ;
   private byte[] P05ZI2_A132BarCodReo ;
   private int[] P05ZI2_A129BarCod ;
   private byte[] P05ZI2_A213BarSit ;
}

final  class apbartemsec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05ZI2", "SELECT EmprCod, BarTipCor, BarTemSec, BarFecGen, BarCodPar, BarCodReo, BarCod, BarSit FROM TXPBARCAD WHERE EmprCod = ? ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05ZI3", "UPDATE TXPBARCAD SET BarTemSec=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

