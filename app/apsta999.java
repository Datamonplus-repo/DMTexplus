package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsta999 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsta999 pgm = new apsta999 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsta999( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsta999.class ), "" );
   }

   public apsta999( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesando....", "") );
      /* Using cursor P03J12 */
      pr_default.execute(0, new Object[] {AV8Feci, AV9Fecf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = P03J12_A159BarFecGen[0] ;
         A213BarSit = P03J12_A213BarSit[0] ;
         A396EmprCod = P03J12_A396EmprCod[0] ;
         A5253BarAcc = P03J12_A5253BarAcc[0] ;
         A8097BarFecHis = P03J12_A8097BarFecHis[0] ;
         A129BarCod = P03J12_A129BarCod[0] ;
         A132BarCodReo = P03J12_A132BarCodReo[0] ;
         A130BarCodPar = P03J12_A130BarCodPar[0] ;
         if ( GXutil.strcmp(A5253BarAcc, "N") == 0 )
         {
            A8097BarFecHis = GXutil.resetTime( GXutil.nullDate() );
         }
         /* Using cursor P03J13 */
         pr_default.execute(1, new Object[] {A8097BarFecHis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Procesando....", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psta999.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsta999");
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
      AV8Feci = GXutil.nullDate() ;
      AV9Fecf = GXutil.nullDate() ;
      P03J12_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P03J12_A213BarSit = new byte[1] ;
      P03J12_A396EmprCod = new String[] {""} ;
      P03J12_A5253BarAcc = new String[] {""} ;
      P03J12_A8097BarFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      P03J12_A129BarCod = new int[1] ;
      P03J12_A132BarCodReo = new byte[1] ;
      P03J12_A130BarCodPar = new String[] {""} ;
      A159BarFecGen = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A5253BarAcc = "" ;
      A8097BarFecHis = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsta999__default(),
         new Object[] {
             new Object[] {
            P03J12_A159BarFecGen, P03J12_A213BarSit, P03J12_A396EmprCod, P03J12_A5253BarAcc, P03J12_A8097BarFecHis, P03J12_A129BarCod, P03J12_A132BarCodReo, P03J12_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5253BarAcc ;
   private String A130BarCodPar ;
   private java.util.Date A8097BarFecHis ;
   private java.util.Date AV8Feci ;
   private java.util.Date AV9Fecf ;
   private java.util.Date A159BarFecGen ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P03J12_A159BarFecGen ;
   private byte[] P03J12_A213BarSit ;
   private String[] P03J12_A396EmprCod ;
   private String[] P03J12_A5253BarAcc ;
   private java.util.Date[] P03J12_A8097BarFecHis ;
   private int[] P03J12_A129BarCod ;
   private byte[] P03J12_A132BarCodReo ;
   private String[] P03J12_A130BarCodPar ;
}

final  class apsta999__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03J12", "SELECT BarFecGen, BarSit, EmprCod, BarAcc, BarFecHis, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE (EmprCod = '001') AND (BarFecGen >= ? and BarFecGen <= ?) AND (BarSit <= 4) ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03J13", "UPDATE TXPBARCAD SET BarFecHis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 1 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

