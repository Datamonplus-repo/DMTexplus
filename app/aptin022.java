package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptin022 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptin022 pgm = new aptin022 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptin022( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptin022.class ), "" );
   }

   public aptin022( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Proceso de eliminacon en Cformu....", "") );
      AV24Num_r = 0 ;
      /* Using cursor P02YD2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7537ForOpNum = P02YD2_A7537ForOpNum[0] ;
         n7537ForOpNum = P02YD2_n7537ForOpNum[0] ;
         A396EmprCod = P02YD2_A396EmprCod[0] ;
         A486ForNumCol = P02YD2_A486ForNumCol[0] ;
         A831TipColCod = P02YD2_A831TipColCod[0] ;
         A483ForColNum = P02YD2_A483ForColNum[0] ;
         A482ForColNom = P02YD2_A482ForColNom[0] ;
         A494ForSer = P02YD2_A494ForSer[0] ;
         A252CliCod = P02YD2_A252CliCod[0] ;
         AV17Emprcod = A396EmprCod ;
         AV18Clicod = A252CliCod ;
         AV19Forser = A494ForSer ;
         AV20Forcolnom = A482ForColNom ;
         AV21Forcolnum = A483ForColNum ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A494ForSer ;
         GXv_char4[0] = A482ForColNom ;
         GXv_int5[0] = A483ForColNum ;
         GXv_int6[0] = A831TipColCod ;
         GXv_int7[0] = A486ForNumCol ;
         new app.pelifor(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7) ;
         aptin022.this.A396EmprCod = GXv_char1[0] ;
         aptin022.this.A252CliCod = GXv_int2[0] ;
         aptin022.this.A494ForSer = GXv_char3[0] ;
         aptin022.this.A482ForColNom = GXv_char4[0] ;
         aptin022.this.A483ForColNum = GXv_int5[0] ;
         aptin022.this.A831TipColCod = GXv_int6[0] ;
         aptin022.this.A486ForNumCol = GXv_int7[0] ;
         AV24Num_r = (int)(AV24Num_r+1) ;
         Gx_msg = httpContext.getMessage( "Elminacion...", "") + GXutil.str( AV24Num_r, 6, 0) ;
         System.out.println( Gx_msg );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Proceso de eliminacon en Cformu....", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptin022.class);
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
      P02YD2_A7537ForOpNum = new byte[1] ;
      P02YD2_n7537ForOpNum = new boolean[] {false} ;
      P02YD2_A396EmprCod = new String[] {""} ;
      P02YD2_A486ForNumCol = new int[1] ;
      P02YD2_A831TipColCod = new byte[1] ;
      P02YD2_A483ForColNum = new int[1] ;
      P02YD2_A482ForColNom = new String[] {""} ;
      P02YD2_A494ForSer = new String[] {""} ;
      P02YD2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV17Emprcod = "" ;
      AV19Forser = "" ;
      AV20Forcolnom = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new int[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptin022__default(),
         new Object[] {
             new Object[] {
            P02YD2_A7537ForOpNum, P02YD2_n7537ForOpNum, P02YD2_A396EmprCod, P02YD2_A486ForNumCol, P02YD2_A831TipColCod, P02YD2_A483ForColNum, P02YD2_A482ForColNom, P02YD2_A494ForSer, P02YD2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7537ForOpNum ;
   private byte A831TipColCod ;
   private byte GXv_int6[] ;
   private short Gx_err ;
   private int AV24Num_r ;
   private int A486ForNumCol ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV18Clicod ;
   private int AV21Forcolnum ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV17Emprcod ;
   private String AV19Forser ;
   private String AV20Forcolnom ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private boolean n7537ForOpNum ;
   private IDataStoreProvider pr_default ;
   private byte[] P02YD2_A7537ForOpNum ;
   private boolean[] P02YD2_n7537ForOpNum ;
   private String[] P02YD2_A396EmprCod ;
   private int[] P02YD2_A486ForNumCol ;
   private byte[] P02YD2_A831TipColCod ;
   private int[] P02YD2_A483ForColNum ;
   private String[] P02YD2_A482ForColNom ;
   private String[] P02YD2_A494ForSer ;
   private int[] P02YD2_A252CliCod ;
}

final  class aptin022__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YD2", "SELECT ForOpNum, EmprCod, ForNumCol, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = '001') AND (ForOpNum = 99) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
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

