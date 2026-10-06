package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apconscd extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apconscd pgm = new apconscd (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apconscd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apconscd.class ), "" );
   }

   public apconscd( int remoteHandle ,
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
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Pulsar una tecla para iniciar proceso de reconstrucción CDFORM", ""));
      /* Using cursor P02WH2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P02WH2_A486ForNumCol[0] ;
         A831TipColCod = P02WH2_A831TipColCod[0] ;
         A483ForColNum = P02WH2_A483ForColNum[0] ;
         A482ForColNom = P02WH2_A482ForColNom[0] ;
         A494ForSer = P02WH2_A494ForSer[0] ;
         A252CliCod = P02WH2_A252CliCod[0] ;
         A396EmprCod = P02WH2_A396EmprCod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A486ForNumCol ;
         new app.ppdformc(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         apconscd.this.A396EmprCod = GXv_char1[0] ;
         apconscd.this.A486ForNumCol = GXv_int2[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso realilzado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pconscd.class);
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
      scmdbuf = "" ;
      P02WH2_A486ForNumCol = new int[1] ;
      P02WH2_A831TipColCod = new byte[1] ;
      P02WH2_A483ForColNum = new int[1] ;
      P02WH2_A482ForColNom = new String[] {""} ;
      P02WH2_A494ForSer = new String[] {""} ;
      P02WH2_A252CliCod = new int[1] ;
      P02WH2_A396EmprCod = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apconscd__default(),
         new Object[] {
             new Object[] {
            P02WH2_A486ForNumCol, P02WH2_A831TipColCod, P02WH2_A483ForColNum, P02WH2_A482ForColNom, P02WH2_A494ForSer, P02WH2_A252CliCod, P02WH2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private int A486ForNumCol ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int GXv_int2[] ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private IDataStoreProvider pr_default ;
   private int[] P02WH2_A486ForNumCol ;
   private byte[] P02WH2_A831TipColCod ;
   private int[] P02WH2_A483ForColNum ;
   private String[] P02WH2_A482ForColNom ;
   private String[] P02WH2_A494ForSer ;
   private int[] P02WH2_A252CliCod ;
   private String[] P02WH2_A396EmprCod ;
}

final  class apconscd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02WH2", "SELECT ForNumCol, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

