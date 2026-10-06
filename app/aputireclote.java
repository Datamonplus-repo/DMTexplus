package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputireclote extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputireclote pgm = new aputireclote (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputireclote( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputireclote.class ), "" );
   }

   public aputireclote( int remoteHandle ,
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
      AV15Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV16EmprCod ;
      GXv_char2[0] = AV17EmprNom ;
      GXv_char3[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char1, GXv_char2, GXv_char3) ;
      aputireclote.this.AV16EmprCod = GXv_char1[0] ;
      aputireclote.this.AV17EmprNom = GXv_char2[0] ;
      aputireclote.this.AV18UsurCod = GXv_char3[0] ;
      AV19Prdnum1 = "100000" ;
      AV20Prdnum2 = "999999" ;
      /* Using cursor P04NK2 */
      pr_default.execute(0, new Object[] {AV16EmprCod, AV19Prdnum1, AV20Prdnum2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P04NK2_A856ValCod[0] ;
         A10881PrdLote = P04NK2_A10881PrdLote[0] ;
         A719PrdNum = P04NK2_A719PrdNum[0] ;
         A396EmprCod = P04NK2_A396EmprCod[0] ;
         A718PrdNom = P04NK2_A718PrdNom[0] ;
         Gx_msg = httpContext.getMessage( "Procesando.... ", "") + GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) ;
         System.out.println( Gx_msg );
         GXv_char3[0] = AV16EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_char1[0] = A10881PrdLote ;
         new app.preclot7(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
         aputireclote.this.AV16EmprCod = GXv_char3[0] ;
         aputireclote.this.A719PrdNum = GXv_char2[0] ;
         aputireclote.this.A10881PrdLote = GXv_char1[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      new app.pcommit(remoteHandle, context).execute( ) ;
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Actualizacion LOTE finalizado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putireclote.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Station = "" ;
      AV16EmprCod = "" ;
      AV17EmprNom = "" ;
      AV18UsurCod = "" ;
      AV19Prdnum1 = "" ;
      AV20Prdnum2 = "" ;
      scmdbuf = "" ;
      P04NK2_A856ValCod = new byte[1] ;
      P04NK2_A10881PrdLote = new String[] {""} ;
      P04NK2_A719PrdNum = new String[] {""} ;
      P04NK2_A396EmprCod = new String[] {""} ;
      P04NK2_A718PrdNom = new String[] {""} ;
      A10881PrdLote = "" ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A718PrdNom = "" ;
      Gx_msg = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputireclote__default(),
         new Object[] {
             new Object[] {
            P04NK2_A856ValCod, P04NK2_A10881PrdLote, P04NK2_A719PrdNum, P04NK2_A396EmprCod, P04NK2_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private String AV15Station ;
   private String AV16EmprCod ;
   private String AV17EmprNom ;
   private String AV18UsurCod ;
   private String AV19Prdnum1 ;
   private String AV20Prdnum2 ;
   private String scmdbuf ;
   private String A10881PrdLote ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String Gx_msg ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private IDataStoreProvider pr_default ;
   private byte[] P04NK2_A856ValCod ;
   private String[] P04NK2_A10881PrdLote ;
   private String[] P04NK2_A719PrdNum ;
   private String[] P04NK2_A396EmprCod ;
   private String[] P04NK2_A718PrdNom ;
}

final  class aputireclote__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04NK2", "SELECT ValCod, PrdLote, PrdNum, EmprCod, PrdNom FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (PrdLote <> ' ') AND (ValCod <> 3) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

